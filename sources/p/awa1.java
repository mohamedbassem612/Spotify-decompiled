package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class awa1 implements cwa1 {
    public final int a;

    public awa1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awa1) && this.a == ((awa1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
