package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r180 {
    public final int a;

    public /* synthetic */ r180(int i) {
        this.a = i;
    }

    public static final /* synthetic */ r180 a(int i) {
        return new r180(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static int c(int i) {
        return Integer.hashCode(i);
    }

    public static String d(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r180) {
            return this.a == ((r180) obj).a;
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
