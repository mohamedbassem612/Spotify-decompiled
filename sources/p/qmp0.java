package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qmp0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final pmp0 d;

    public qmp0(String str, String str2, boolean z, pmp0 pmp0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = pmp0Var;
    }

    public static qmp0 a(qmp0 qmp0Var, String str, pmp0 pmp0Var, int i) {
        String str2 = qmp0Var.a;
        if ((i & 2) != 0) {
            str = qmp0Var.b;
        }
        boolean z = qmp0Var.c;
        if ((i & 8) != 0) {
            pmp0Var = qmp0Var.d;
        }
        qmp0Var.getClass();
        return new qmp0(str2, str, z, pmp0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmp0)) {
            return false;
        }
        qmp0 qmp0Var = (qmp0) obj;
        return u890.j(this.a, qmp0Var.a) && u890.j(this.b, qmp0Var.b) && this.c == qmp0Var.c && this.d == qmp0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
