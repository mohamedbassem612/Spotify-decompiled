package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ac20 extends bc20 {
    public final brl a;

    public ac20(brl brlVar) {
        this.a = brlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac20) && this.a.equals(((ac20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
