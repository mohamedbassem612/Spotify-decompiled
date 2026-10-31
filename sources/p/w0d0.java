package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w0d0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0d0 b;

    public /* synthetic */ w0d0(y0d0 y0d0Var, byte b) {
        this.a = b;
        this.b = y0d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y0d0 y0d0Var = this.b;
        switch (b) {
            case 0:
                m9v m9vVar = y0d0Var.c;
                if (m9vVar != null) {
                    m9vVar.setListSelectionHidden(true);
                    m9vVar.requestLayout();
                }
                break;
            default:
                m9v m9vVar2 = y0d0Var.c;
                if (m9vVar2 != null && m9vVar2.isAttachedToWindow() && y0d0Var.c.getCount() > y0d0Var.c.getChildCount() && y0d0Var.c.getChildCount() <= y0d0Var.Z) {
                    y0d0Var.Y0.setInputMethodMode(2);
                    y0d0Var.m();
                    break;
                }
                break;
        }
    }
}
