package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y3f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ryx b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ c9n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3f(ryx ryxVar, Function0 function0, c9n c9nVar, byte b) {
        super(0);
        this.a = b;
        this.b = ryxVar;
        this.c = function0;
        this.d = c9nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.d;
        Function0 function0 = this.c;
        ryx ryxVar = this.b;
        switch (b) {
            case 0:
                if (!ryxVar.a.isVisible()) {
                    function0.invoke();
                    fn31.T(c9nVar, (o8n) null, 0, new x3f(ryxVar, (lnm) null, (byte) 0), 3);
                } else {
                    ryxVar.dismiss();
                }
                break;
            default:
                if (!ryxVar.a.isVisible()) {
                    function0.invoke();
                    fn31.T(c9nVar, (o8n) null, 0, new x3f(ryxVar, (lnm) null, (byte) 2), 3);
                } else {
                    ryxVar.dismiss();
                }
                break;
        }
        return rih1Var;
    }
}
