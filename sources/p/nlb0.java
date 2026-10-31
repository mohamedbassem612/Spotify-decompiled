package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nlb0 {
    public final int a;

    public nlb0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlb0) && this.a == ((nlb0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return l1d.o(new StringBuilder("LayoutInfo(layoutId="), this.a, ')');
    }
}
