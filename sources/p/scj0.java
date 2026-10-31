package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class scj0 implements ucj0 {
    public final w4i1 a;
    public final c380 b;
    public final c380 c;
    public final String d;
    public final cqs0 e;
    public final int f;

    public scj0(w4i1 w4i1Var, c380 c380Var, c380 c380Var2, String str, cqs0 cqs0Var, int i) {
        this.a = w4i1Var;
        this.b = c380Var;
        this.c = c380Var2;
        this.d = str;
        this.e = cqs0Var;
        this.f = i;
    }

    public static scj0 a(scj0 scj0Var, c9 c9Var, c380 c380Var, String str, cqs0 cqs0Var, int i, int i2) {
        c9 c9Var2 = c9Var;
        w4i1 w4i1Var = scj0Var.a;
        if ((i2 & 2) != 0) {
            c9Var2 = scj0Var.b;
        }
        if ((i2 & 4) != 0) {
            c380Var = scj0Var.c;
        }
        if ((i2 & 8) != 0) {
            str = scj0Var.d;
        }
        if ((i2 & 16) != 0) {
            cqs0Var = scj0Var.e;
        }
        if ((i2 & 32) != 0) {
            i = scj0Var.f;
        }
        int i3 = i;
        cqs0 cqs0Var2 = cqs0Var;
        String str2 = str;
        return new scj0(w4i1Var, c9Var2, c380Var, str2, cqs0Var2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scj0)) {
            return false;
        }
        scj0 scj0Var = (scj0) obj;
        return this.a.equals(scj0Var.a) && this.b.equals(scj0Var.b) && this.c.equals(scj0Var.c) && this.d.equals(scj0Var.d) && u890.j(this.e, scj0Var.e) && this.f == scj0Var.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + ((this.e.hashCode() + cy30.d(kk0.f(this.c, kk0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31);
    }
}
