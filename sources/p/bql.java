package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bql implements ez00 {
    public final lql a;

    public bql(lql lqlVar) {
        this.a = lqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bql) && this.a.equals(((bql) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
