package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k3h1 extends x2s {
    public final int b;

    public k3h1(int i) {
        super(rtw0.h);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3h1) && this.b == ((k3h1) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }
}
