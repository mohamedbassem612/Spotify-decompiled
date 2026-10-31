package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xbg1 implements bcg1 {
    public final int a;

    public xbg1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbg1) && this.a == ((xbg1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
