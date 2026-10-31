package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t9v extends j2e0 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t9v(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    public final Object i(fdf0 fdf0Var) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                Float f = (Float) ((j2e0) obj).i(fdf0Var);
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
            default:
                return ((xy50) obj).invoke(fdf0Var);
        }
    }
}
