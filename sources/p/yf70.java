package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yf70 {
    public final int a;

    public /* synthetic */ yf70(int i) {
        this.a = i;
    }

    public static final /* synthetic */ yf70 a(int i) {
        return new yf70(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static int c(int i) {
        return Integer.hashCode(i);
    }

    public static String d(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final /* synthetic */ int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yf70) {
            return this.a == ((yf70) obj).a;
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
