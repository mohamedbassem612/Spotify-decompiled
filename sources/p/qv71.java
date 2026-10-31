package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qv71 {
    public static u8s0 a(ov71 ov71Var) {
        ys71 ys71Var = (ys71) ov71Var.c.getValue();
        if (ys71Var == null) {
            hhg1.n("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
            return null;
        }
        ys71 ys71Var2 = ys71Var.Y;
        ov71 ov71VarP = ys71Var2 != null ? ys71Var2.p() : null;
        if (ov71VarP != null) {
            ys71 ys71Var3 = (ys71) ov71VarP.c.getValue();
            if (ys71Var3 != null) {
                return ys71Var3.X;
            }
            hhg1.n("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
        }
        return null;
    }
}
