package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class who0 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final kpm e;
    public final boolean f;
    public final boolean g;

    public who0(String str, String str2, List list, boolean z, kpm kpmVar, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = kpmVar;
        this.f = z2;
        this.g = z3;
    }

    public static who0 a(who0 who0Var, boolean z) {
        String str = who0Var.a;
        String str2 = who0Var.b;
        List list = who0Var.c;
        boolean z2 = who0Var.d;
        kpm kpmVar = who0Var.e;
        boolean z3 = who0Var.g;
        who0Var.getClass();
        return new who0(str, str2, list, z2, kpmVar, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof who0)) {
            return false;
        }
        who0 who0Var = (who0) obj;
        return this.a.equals(who0Var.a) && u890.j(this.b, who0Var.b) && this.c.equals(who0Var.c) && this.d == who0Var.d && u890.j(this.e, who0Var.e) && this.f == who0Var.f && this.g == who0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        kpm kpmVar = this.e;
        return Boolean.hashCode(this.g) + xcg1.g((iG + (kpmVar != null ? kpmVar.hashCode() : 0)) * 31, 31, this.f);
    }
}
