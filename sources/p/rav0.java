package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rav0 {
    public final int a;

    public /* synthetic */ rav0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ rav0 a(int i) {
        return new rav0(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rav0) {
            return this.a == ((rav0) obj).a;
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
