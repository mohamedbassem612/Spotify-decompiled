package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mhh1 {
    public final uav0 a;
    public final nqz0 b;

    public mhh1(uav0 uav0Var, nqz0 nqz0Var) {
        this.a = uav0Var;
        this.b = nqz0Var;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 10;
        Object obj3 = 30;
        Object obj4 = 120;
        Object objValueOf = Double.valueOf(0.1d);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhh1)) {
            return false;
        }
        mhh1 mhh1Var = (mhh1) obj;
        if (!this.a.equals(mhh1Var.a) || !this.b.equals(mhh1Var.b) || !objValueOf.equals(objValueOf) || !obj4.equals(obj4)) {
            return false;
        }
        Object obj5 = Boolean.TRUE;
        return obj5.equals(obj5) && obj5.equals(obj5) && obj3.equals(obj3) && obj5.equals(obj5) && obj2.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (Double.valueOf(0.1d).hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31;
        Integer num = 120;
        int iHashCode2 = (num.hashCode() + iHashCode) * 31;
        Boolean bool = Boolean.TRUE;
        int iHashCode3 = (bool.hashCode() + ((bool.hashCode() + iHashCode2) * 31)) * 31;
        Integer num2 = 30;
        int iHashCode4 = (bool.hashCode() + ((num2.hashCode() + iHashCode3) * 31)) * 31;
        Integer num3 = 10;
        return Integer.hashCode(500) + ((num3.hashCode() + iHashCode4) * 31);
    }
}
