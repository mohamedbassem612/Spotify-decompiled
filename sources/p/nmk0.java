package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nmk0 extends rmk0 {
    public final int a;

    public nmk0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmk0) && this.a == ((nmk0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
