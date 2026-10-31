package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class na80 {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof na80) {
            return this.a == ((na80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}
