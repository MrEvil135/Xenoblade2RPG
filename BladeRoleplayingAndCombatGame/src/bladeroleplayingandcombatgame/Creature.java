/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bladeroleplayingandcombatgame;

/**
 *
 * @author alexa
 */
public class Creature {
    
    private String name;
    private int level;
    //Combat Stats: Strength, Ether, Dexterity, Agility, Constitution.
    private int[] combatStats;
    //Roleplaying Stats: Intelligence, Wisdom, Charisma.
    private int[] roleplayStats;

    private int[] combatStatModifiers;
    private int[] roleplayStatModifiers;
    //Health
    private int hp;
    //Battle Points
    private int bp;
    //Special Points
    private int sp;
    //Armor Class
    private int ac;
    /* Which directions are which.
        701
        6X2
        543
    */
    private int directionFacing;
    // Element: Fire, Water, Ice, Wind, Electric, Earth, Dark, Light.
    private int element;
    // private Blade[] blades;
    
    public Creature(){
        
        name = "default steve";
        level = 1;
        
        combatStats = new int[5];
        for(int i = 0; i < combatStats.length; i++){
            combatStats[i] = 10;
        }
        
        roleplayStats = new int[3];
        for(int i = 0; i < roleplayStats.length; i++){
            roleplayStats[i] = 10;
        }
        
        combatStatModifiers = new int[5];
        for(int i = 0; i < combatStatModifiers.length; i++){
            combatStatModifiers[i] = (combatStatModifiers[i] - 10) / 2;
        }
        
        roleplayStatModifiers = new int[3];
        for(int i = 0; i < roleplayStatModifiers.length; i++){
            roleplayStatModifiers[i] = (roleplayStats[i] - 10) / 2;
        }
        
        hp = 10 + combatStatModifiers[4];
        bp = 0;
        sp = 0;
        ac = 10 + combatStatModifiers[3];
        
        directionFacing = 0;
        element = 0;
    }
    
    public Creature(String name, int level, int[] combatStats, int[] roleplayStats, int element){
        this.name = name;
        this.level = level;
        
        this.combatStats = new int[5];
        combatStatModifiers = new int[5];
        for(int i = 0; i < this.combatStats.length; i++){
            this.combatStats[i] = combatStats[i];
            combatStatModifiers[i] = (this.combatStats[i] - 10) / 2;
        }
        
        this.roleplayStats = new int[3];
        roleplayStatModifiers = new int[3];
        for(int i = 0; i < this.roleplayStats.length; i++){
            this.roleplayStats[i] = roleplayStats[i];
            roleplayStatModifiers[i] = (this.roleplayStats[i] - 10) / 2;
        }
        
        hp = level * (10 + this.combatStats[4]);
        ac = 10 + this.combatStats[3];
        
        bp = 0;
        sp = 0;
        directionFacing = 0;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int newLevel){
        level = newLevel;
    }
    public void updateLevel(int dLevel){
        level += dLevel;
    }
    
    public int[] getCombatStats(){
        return combatStats;
    }
    public void setCombatStats(int[] newCombatStats){
        for(int i = 0; i < combatStats.length; i++){
            combatStats[i] = newCombatStats[i];
        }
    }
    public void updateCombatStats(int[] dCombatStats){
        for(int i = 0; i < combatStats.length; i++){
            combatStats[i] += dCombatStats[i];
        }
    }
    public int getStrength(){
        return combatStats[0];
    }
    public void setStrength(int newStrength){
        combatStats[0] = newStrength;
    }
    public void updateStrength(int dStrength){
        combatStats[0] += dStrength;
    }
    public int getEther(){
        return combatStats[1];
    }
    public void setEther(int newEther){
        combatStats[1] = newEther;
    }
    public void updateEther(int dEther){
        combatStats[1] += dEther;
    }
    public int getDexterity(){
        return combatStats[2];
    }
    public void setDexterity(int newDexterity){
        combatStats[2] = newDexterity;
    }
    public void updateDexterity(int dDexterity){
        combatStats[2] += dDexterity;
    }
    public int getAgility(){
        return combatStats[3];
    }
    public void setAgility(int newAgility){
        combatStats[3] = newAgility;
    }
    public void updateAgility(int dAgility){
        combatStats[3] += dAgility;
    }
    public int getConstitution(){
        return combatStats[4];
    }
    public void setConstitution(int newConstitution){
        combatStats[4] = newConstitution;
    }
    public void updateConstitution(int dConstitution){
        combatStats[4] += dConstitution;
    }
    
    public int[] getRoleplayStats(){
        return roleplayStats;
    }
    public void setRoleplayStats(int[] newRoleplayStats){
        for(int i = 0; i < roleplayStats.length; i++){
            roleplayStats[i] = newRoleplayStats[i];
        }
    }
    public void updateRoleplayStats(int[] dRoleplayStats){
        for(int i = 0; i< roleplayStats.length; i++){
            roleplayStats[i] += dRoleplayStats[i];
        }
    }
    public int getIntiligence(){
        return roleplayStats[0];
    }
   public void setIntiligence(int newIntiligence){
        roleplayStats[0] = newIntiligence;
    }
   public void updateIntiligence(int dIntiligence){
       roleplayStats[0] += dIntiligence;
   }
   public int getWisdom(){
       return roleplayStats[1];
   }
   public void setWisdom(int newWisdom){
       roleplayStats[1] = newWisdom;
   }
   public void updateWisdom(int dWisdom){
       roleplayStats[1] += dWisdom;
   }
   public int getCharisma(){
       return roleplayStats[2];
   }
   public void setCharisma(int newCharisma){
       roleplayStats[2] = newCharisma;
   }
   public void updateCharisma(int dCharisma){
       roleplayStats[2] += dCharisma;
   }
    public int[] getCombatStatModifiers(){
        return combatStatModifiers;
    }
    public void setCombatStatModifiers(int[] newCombatStatModifiers){
        for(int i = 0; i < combatStatModifiers.length; i++){
            combatStatModifiers[i] = newCombatStatModifiers[i];
        }
    }
    public void updateCombatStatModifiers(){
        for(int i = 0; i < combatStatModifiers.length; i++){
            combatStatModifiers[i] = (combatStats[i] - 10) / 2;
        }
    }
    
    public int getStrengthModifier(){
        return combatStatModifiers[0];
    }
    public void setStrengthModifier(int newStrengthModifier){
        combatStatModifiers[0] = newStrengthModifier;
    }
    public void updateStrengthModifier(){
        combatStatModifiers[0] = (combatStats[0] - 10) / 2;
    }
    public int getEtherModifier(){
        return combatStatModifiers[1];
    }
    public void setEtherModifier(int newEtherModifier){
        combatStatModifiers[1] = newEtherModifier;
    }
    public void updateEtherModifier(){
        combatStatModifiers[1] = (combatStats[1] - 10) / 2;
    }
    public int getDexterityModifier(){
        return combatStatModifiers[2];
    }
    public void setDexterityModifier(int newDexterityModifier){
        combatStatModifiers[2] = newDexterityModifier;
    }
    public void updateDexterityModifier(){
        combatStatModifiers[2] = (combatStats[2] - 10) / 2;
    }
    public int getAgilityModifier(){
        return combatStatModifiers[3];
    }
    public void setAgilityModifier(int newAgilityModifier){
        combatStatModifiers[3] = newAgilityModifier;
    }
    public void updateAgilityModifier(){
        combatStatModifiers[3] = (combatStats[3] - 10) / 2;
    }
    public int getConstitutionModifier(){
        return combatStatModifiers[4];
    }
    public void setConstitutionModifier(int newConstitutionModifier){
        combatStatModifiers[4] = newConstitutionModifier;
    }
    public void updateConstitutionModifier(){
        combatStatModifiers[4] = (combatStats[4] - 10) / 2;
    }
    public int[] getRoleplayStatModifiers(){
        return roleplayStatModifiers;
    }
    public void setRoleplayStatModifiers(int[] newRoleplayStatModifiers){
        for(int i = 0; i < roleplayStatModifiers.length; i++){
            roleplayStatModifiers[i] = newRoleplayStatModifiers[i];
        }
    }
    public void updateRoleplayStatModifiers(){
        for(int i = 0; i < roleplayStatModifiers.length; i++){
            roleplayStatModifiers[i] = (roleplayStats[i] - 10) / 2;
        }
    }
    public int getIntiligenceModifier(){
        return roleplayStatModifiers[0];
    }
    public void setIntilifenceModifier(int newIntiligenceModifier){
        roleplayStatModifiers[0] = newIntiligenceModifier;
    }
    public void updateIntiligenceModifier(){
        roleplayStatModifiers[0] = (roleplayStats[0] - 10) / 2;
    }
    public int getWisdomModifier(){
        return roleplayStatModifiers[1];
    }
    public void setWisdomModifier(int newWisdomModifier){
        roleplayStatModifiers[1] = newWisdomModifier;
    }
    public void updateWisdomModifier(){
        roleplayStatModifiers[1] = (roleplayStats[1] - 10) / 2;
    }
    public int getCharismaModifier(){
        return roleplayStatModifiers[2];
    }
    public void setCharismaModifier(int newCharismaModifier){
        roleplayStatModifiers[2] = newCharismaModifier;
    }
    public void updateCharismaModifier(){
        roleplayStatModifiers[2] = (roleplayStats[2] - 10) / 2;
    }
    public int getHP(){
        return hp;
    }
    public void setHP(int newHP){
        hp = newHP;
    }
    public void updateHP(int dHP){
        hp += dHP;
    }
    public void resetHP(){
        hp = level * (10 + combatStatModifiers[4]);
    }
    public int getAC(){
        return ac;
    }
    public void setAC(int newAC){
        ac = newAC;
    }
    public void updateAC(int dAC){
        ac += dAC;
    }
    public void resetAC(){
        ac = 10 + combatStatModifiers[3];
    }
    public int getBP(){
        return bp;
    }
    public void setBP(int newBP){
        bp = newBP;
    }
    public void updateBP(int dBP){
        bp += dBP;
    }
    public int getSP(){
        return sp;
    }
    public void setSP(int newSP){
        sp = newSP;
    }
    public void updateSP(int dSP){
        sp += dSP;
    }
    public int getElement(){
        return element;
    }
    public void setElement(int newElement){
        element = newElement;
    }
    public int getDirectionFacing(){
        return directionFacing;
    }
    public void setDirectionFacing(int newDirection){
        directionFacing = newDirection;
    }
}
