package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yo0 implements zo0 {
    public final String a;
    public final xx10 b;
    public final mmr0 c;

    public yo0(String str, xx10 xx10Var, mmr0 mmr0Var) {
        this.a = str;
        this.b = xx10Var;
        this.c = mmr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo0)) {
            return false;
        }
        yo0 yo0Var = (yo0) obj;
        return this.a.equals(yo0Var.a) && this.b.equals(yo0Var.b) && this.c.equals(yo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
