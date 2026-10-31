package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zd20 implements ce20 {
    public final de20 a;

    public zd20(de20 de20Var) {
        this.a = de20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd20) && this.a.equals(((zd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
