package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tof0 implements xof0 {
    public final fef0 a;
    public final bff0 b;
    public final String c;
    public final String d;
    public final String e;
    public final Set f;

    public tof0(fef0 fef0Var, bff0 bff0Var, String str, String str2, String str3, Set set) {
        this.a = fef0Var;
        this.b = bff0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tof0)) {
            return false;
        }
        tof0 tof0Var = (tof0) obj;
        return u890.j(this.a, tof0Var.a) && u890.j(this.b, tof0Var.b) && u890.j(this.c, tof0Var.c) && u890.j(this.d, tof0Var.d) && u890.j(this.e, tof0Var.e) && this.f.equals(tof0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
