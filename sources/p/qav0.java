package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qav0 {
    public final int a;

    public /* synthetic */ qav0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ qav0 a(int i) {
        return new qav0(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qav0) {
            return this.a == ((qav0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "PointerKeyboardModifiers(packedValue=", ")");
    }
}
