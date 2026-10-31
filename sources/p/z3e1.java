package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z3e1 {
    public final int a;

    public /* synthetic */ z3e1(int i) {
        this.a = i;
    }

    public static final /* synthetic */ z3e1 a(int i) {
        return new z3e1(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static int c(int i) {
        return Integer.hashCode(i);
    }

    public static String d(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final /* synthetic */ int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z3e1) {
            return this.a == ((z3e1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
