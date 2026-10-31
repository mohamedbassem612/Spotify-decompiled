package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class geu implements d9j1 {
    public final fq0 a;
    public final boolean b;

    public geu(fq0 fq0Var, boolean z) {
        this.a = fq0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geu)) {
            return false;
        }
        geu geuVar = (geu) obj;
        return u890.j(this.a, geuVar.a) && this.b == geuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
