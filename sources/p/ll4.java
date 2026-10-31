package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ll4 extends tv30 implements iu30 {
    public final /* synthetic */ vzb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll4(vzb0 vzb0Var) {
        super(1, t890.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.a = vzb0Var;
    }

    public final Object invoke(Object obj) {
        float[] fArr = ((kch0) obj).a;
        elb0 elb0Var = (elb0) this.a.R0.getValue();
        if (elb0Var != null) {
            if (!elb0Var.a()) {
                elb0Var = null;
            }
            if (elb0Var != null) {
                elb0Var.u(fArr);
            }
        }
        return rih1.a;
    }
}
