package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mmk0 extends rmk0 {
    public final int a;

    public mmk0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmk0) && this.a == ((mmk0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
