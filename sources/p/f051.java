package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f051 extends q151 {
    public final val a;

    public f051(val valVar) {
        this.a = valVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f051) && this.a.equals(((f051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
