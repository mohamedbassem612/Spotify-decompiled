package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g8g1 extends i8g1 {
    public final int a;

    public g8g1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8g1) && this.a == ((g8g1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
