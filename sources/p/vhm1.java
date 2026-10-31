package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vhm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vhm1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                xhm1 xhm1Var = (xhm1) obj4;
                if (xhm1Var != null) {
                    tjz tjzVar = (tjz) obj2;
                    sjz sjzVar = (sjz) obj;
                    if (tjzVar != null) {
                        tjzVar.a(xhm1Var, sjzVar);
                    }
                }
                ((Function0) obj3).invoke();
                break;
            default:
                if (((drr0) obj4).s() <= 1.0f) {
                    fn31.T((c9n) obj3, (o8n) null, 0, new yqm((o95) obj2, (o95) obj, null, (byte) 0), 3);
                }
                break;
        }
        return rih1Var;
    }
}
