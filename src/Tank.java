
/**
 *	@overview AN armored vehicle in the game
 *
 *	@atributes
 *	hitPoint	Integer			int
 *	damage 		Integer			int
 *	armor 		Integer			int
 *	price		Integer			int
 *
 *	@object
 *	A typical Tank is <hp, d, a, p> where hitPoint(hp), damage(d), armor(a), price(p)
 *
 *	@abstract_proterties
 *	mutable(hitPoint) = true /\ optional(hitPoint) = false /\ min(hitPoint)= 1 /\
 *	mutable(damage) = true /\ optional(damage) = false /\ min(damage)= 1 /\
 *	mutable(armor) = true /\ optional(armor) = false/\ min(armor)= 0 /\
 *	mutable(price) = false /\ optional(price) = false /\ min(price)= 1/\
 *
 */


public class Tank{
    private int hitPoint;
    private int damage;
    private int armor;
    private int price;

    public Tank(int hitPoint, int damage, int armor, int price){
        this.hitPoint = hitPoint;
        this.damage = damage;
        this.armor = armor;
        this.price = price;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public int getDamage(){
        return damage;
    }

    public int getArmor(){
        return armor;
    }

    public int getPrice(){
        return price;
    }

    public void SetHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void SetDamage(int damage){
        this.damage = damage;
    }

    public void SetArmor(int armor){
        this.armor = armor;
    }

    public void SetPrice(int Price){
        this.price = price;
    }


}