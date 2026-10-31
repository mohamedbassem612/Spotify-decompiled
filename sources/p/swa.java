package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class swa extends dro {
    public final int i;

    public swa(int i) {
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swa) && this.i == ((swa) obj).i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i);
    }
}
