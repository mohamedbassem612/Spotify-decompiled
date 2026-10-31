package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u94 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha4 b;

    public /* synthetic */ u94(ha4 ha4Var, byte b) {
        this.a = b;
        this.b = ha4Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ha4 ha4Var = this.b;
        switch (b) {
            case 0:
                return new jx4(ha4Var, ha4Var.getTextInputService(), (c9n) obj);
            case 1:
                return ha4Var.getSavedStateRegistry();
            case 2:
                return Boolean.valueOf(ha4Var.getScrollCaptureInProgress());
            case 3:
                return ha4Var.getInputModeManager();
            case 4:
                return ha4Var.getTextInputService();
            case 5:
                return ha4Var.getSoftwareKeyboardController();
            case 6:
                return ha4Var.getTextToolbar();
            default:
                return ha4Var.getPointerIconService();
        }
    }
}
