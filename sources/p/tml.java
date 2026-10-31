package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tml {
    public final sml a;

    public tml(sml smlVar) {
        this.a = smlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tml) && this.a.equals(((tml) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
