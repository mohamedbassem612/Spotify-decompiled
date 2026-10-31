package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class unn0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ unn0(snn0 snn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = snn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        snn0 snn0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(!snn0Var.b().contains((String) obj));
            default:
                return Boolean.valueOf(!snn0Var.b().contains((String) obj));
        }
    }
}
