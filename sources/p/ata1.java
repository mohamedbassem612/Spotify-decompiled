package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ata1 extends cta1 {
    public final int a;

    public ata1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ata1) && this.a == ((ata1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
