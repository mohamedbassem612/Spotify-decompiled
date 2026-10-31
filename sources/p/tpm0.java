package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tpm0 implements rij0 {
    public final int a;

    public tpm0(int i) {
        dm5.n(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpm0) && this.a == ((tpm0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + 527;
    }

    public final String toString() {
        return "Orientation= " + this.a;
    }
}
