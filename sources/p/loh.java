package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class loh implements iph {
    public final ace0 a;

    public loh(ace0 ace0Var) {
        this.a = ace0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loh) && this.a.equals(((loh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
