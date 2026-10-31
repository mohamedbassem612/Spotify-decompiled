package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ggn implements ugn {
    public final boolean a;

    public ggn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggn) && this.a == ((ggn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
