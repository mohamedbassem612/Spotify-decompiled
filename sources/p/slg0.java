package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class slg0 implements ulg0 {
    public final int a;

    public slg0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slg0) && this.a == ((slg0) obj).a;
    }

    public final int getCount() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
