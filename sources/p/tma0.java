package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tma0 {
    public static final tma0 c = new tma0(0, null);
    public final int a;
    public final oma0 b;

    public tma0(int i, oma0 oma0Var) {
        String string;
        this.a = i;
        this.b = oma0Var;
        if ((i == 0) == (oma0Var == null)) {
            return;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
            sb.append(" requires type to be specified.");
            string = sb.toString();
        } else {
            string = "Star projection must have no type specified.";
        }
        hhg1.f(string);
        throw null;
    }

    public final int a() {
        return this.a;
    }

    public final oma0 b() {
        return this.b;
    }

    public final oma0 c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tma0)) {
            return false;
        }
        tma0 tma0Var = (tma0) obj;
        return this.a == tma0Var.a && u890.j(this.b, tma0Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        oma0 oma0Var = this.b;
        return iC + (oma0Var != null ? oma0Var.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int i2 = i == 0 ? -1 : sma0.a[l1d.C(i)];
        if (i2 == -1) {
            return "*";
        }
        oma0 oma0Var = this.b;
        if (i2 == 1) {
            return String.valueOf(oma0Var);
        }
        if (i2 == 2) {
            return "in " + oma0Var;
        }
        if (i2 != 3) {
            eg.o();
            return null;
        }
        return "out " + oma0Var;
    }
}
