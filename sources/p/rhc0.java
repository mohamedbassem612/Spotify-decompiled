package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rhc0 {
    public final int a;

    public /* synthetic */ rhc0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ rhc0 a(int i) {
        return new rhc0(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static int c(int i) {
        return Integer.hashCode(i);
    }

    public static String d(int i) {
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }

    public final /* synthetic */ int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rhc0) {
            return this.a == ((rhc0) obj).a;
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
