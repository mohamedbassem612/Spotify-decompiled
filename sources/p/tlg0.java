package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tlg0 implements ulg0 {
    public final int a;

    public tlg0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlg0) && this.a == ((tlg0) obj).a;
    }

    public final int getCount() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
