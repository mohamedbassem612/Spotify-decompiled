package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zr8 {
    public final int a;

    public /* synthetic */ zr8(int i) {
        this.a = i;
    }

    public static final /* synthetic */ zr8 a(int i) {
        return new zr8(i);
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zr8) {
            return this.a == ((zr8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "AutoClearFocusBehavior(value=", ")");
    }
}
