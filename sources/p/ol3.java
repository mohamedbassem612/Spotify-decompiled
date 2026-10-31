package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ol3 {
    public final int a;

    public /* synthetic */ ol3(int i) {
        this.a = i;
    }

    public static final /* synthetic */ ol3 a(int i) {
        return new ol3(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        return "Vertical(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ol3) {
            return this.a == ((ol3) obj).a;
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
