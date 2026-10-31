package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class a0u {
    public static final zzt Companion = new zzt();
    public final puc1 a;
    public final String b;
    public final String c;

    public /* synthetic */ a0u(int i, puc1 puc1Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = puc1Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final puc1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0u)) {
            return false;
        }
        a0u a0uVar = (a0u) obj;
        return u890.j(this.a, a0uVar.a) && u890.j(this.b, a0uVar.b) && u890.j(this.c, a0uVar.c);
    }

    public final int hashCode() {
        puc1 puc1Var = this.a;
        int iHashCode = (puc1Var == null ? 0 : puc1Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
