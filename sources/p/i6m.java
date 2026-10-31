package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i6m {
    public final int a;

    public /* synthetic */ i6m(int i) {
        this.a = i;
    }

    public static final /* synthetic */ i6m a(int i) {
        return new i6m(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        return "ContentScale(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i6m) {
            return this.a == ((i6m) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
