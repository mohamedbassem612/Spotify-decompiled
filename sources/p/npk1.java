package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class npk1 implements ppk1 {
    public final boolean a;
    public final String b;

    public npk1(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npk1)) {
            return false;
        }
        npk1 npk1Var = (npk1) obj;
        return this.a == npk1Var.a && u890.j(this.b, npk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
