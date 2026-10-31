package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lif1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lif1(ug3 ug3Var, byte b) {
        super(1);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                return (ymd0) ug3Var.e;
            case 1:
                ((qtr) obj).b(new k8y0(ug3Var, null, (byte) 21));
                return rih1.a;
            case 2:
                kif1 kif1Var = (kif1) obj;
                Context context = (Context) ug3Var.b;
                return new hif1(context.getString(2131963319), kif1Var.b, context.getString(2131963320), kif1Var.a, kif1Var.c);
            default:
                return ((egx) ug3Var.d).a((l0i) null);
        }
    }
}
