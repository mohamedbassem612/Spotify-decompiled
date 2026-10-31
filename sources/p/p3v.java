package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p3v implements Comparable {
    public final float a;

    public /* synthetic */ p3v(float f) {
        this.a = f;
    }

    public static final /* synthetic */ p3v a(float f) {
        return new p3v(f);
    }

    public static int b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.a, ((p3v) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3v) {
            return Float.compare(this.a, ((p3v) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
