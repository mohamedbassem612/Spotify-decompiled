package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ah21 extends lh21 {
    public final wol a;

    public ah21(wol wolVar) {
        this.a = wolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah21) && this.a.equals(((ah21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
