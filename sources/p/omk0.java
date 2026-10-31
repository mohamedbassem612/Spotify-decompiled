package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class omk0 extends rmk0 {
    public final int a;

    public omk0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omk0) && this.a == ((omk0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
