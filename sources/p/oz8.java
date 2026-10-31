package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oz8 extends lin {
    public final jin a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final kin e;
    public final List f;
    public final int g;

    public oz8(jin jinVar, List list, List list2, Boolean bool, kin kinVar, List list3, int i) {
        this.a = jinVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = kinVar;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lin) {
            oz8 oz8Var = (oz8) ((lin) obj);
            if (this.a.equals(oz8Var.a)) {
                List list = oz8Var.b;
                List list2 = this.b;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = oz8Var.c;
                    List list4 = this.c;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        Boolean bool = oz8Var.d;
                        Boolean bool2 = this.d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            kin kinVar = oz8Var.e;
                            kin kinVar2 = this.e;
                            if (kinVar2 != null ? kinVar2.equals(kinVar) : kinVar == null) {
                                List list5 = oz8Var.f;
                                List list6 = this.f;
                                if (list6 != null ? list6.equals(list5) : list5 == null) {
                                    if (this.g == oz8Var.g) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        kin kinVar = this.e;
        int iHashCode5 = (iHashCode4 ^ (kinVar == null ? 0 : kinVar.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return gvg.j(sb, this.g, "}");
    }
}
