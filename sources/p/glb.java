package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class glb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziu b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glb(ziu ziuVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ziuVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ziu ziuVar = this.b;
        switch (b) {
            case 0:
                if (ziuVar.f.d.b.b()) {
                    iu30Var.invoke(osd.a);
                }
                break;
            default:
                if (ziuVar.f.d.b.b()) {
                    iu30Var.invoke(tw50.a);
                }
                break;
        }
        return rih1Var;
    }
}
