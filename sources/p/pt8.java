package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pt8 extends qt8 {
    public final int a;

    public pt8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt8) && this.a == ((pt8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
