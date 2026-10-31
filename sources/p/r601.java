package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r601 extends x2s {
    public final boolean b;

    public r601(boolean z) {
        super(kuw0.c);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r601) && this.b == ((r601) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
