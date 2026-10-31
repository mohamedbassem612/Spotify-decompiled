package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class d9b implements dlv, iv30 {
    public static final d9b b = new d9b(0);
    public static final d9b c = new d9b(1);
    public static final d9b d = new d9b(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ d9b(byte b2) {
        this.a = b2;
    }

    public final float a(float f) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return apo.v(f);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof dlv) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof dlv) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof dlv) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return new tv30(1, apo.class, "smoothStepEasing", "smoothStepEasing(F)F", 1);
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
