package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uh81 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh81 b;

    public /* synthetic */ uh81(wh81 wh81Var, byte b) {
        this.a = b;
        this.b = wh81Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        wh81 wh81Var = this.b;
        switch (b) {
            case 0:
                wh81Var.g.c(wh81.R0[2], wh81Var, Boolean.valueOf(((ly3) obj) != null));
                break;
            default:
                f6w0 f6w0Var = (f6w0) obj;
                wh81Var.P0 = f6w0Var != null ? f6w0Var.a : null;
                wh81Var.a.setIsOverlapped((f6w0Var != null ? f6w0Var.a : null) instanceof b6w0);
                break;
        }
    }
}
