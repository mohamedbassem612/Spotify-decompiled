package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qhc0 {
    public final int a;

    public /* synthetic */ qhc0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ qhc0 a(int i) {
        return new qhc0(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static int c(int i) {
        return Integer.hashCode(i);
    }

    public static String d(int i) {
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }

    public final /* synthetic */ int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qhc0) {
            return this.a == ((qhc0) obj).a;
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
