package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f001 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h001 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f001(h001 h001Var, byte b) {
        super(1);
        this.a = b;
        this.b = h001Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h001 h001Var = this.b;
        switch (b) {
            case 0:
                return new m441(new ciw0(h001Var, ((wzz0) obj).c, null, (byte) 2));
            case 1:
                wzz0 wzz0Var = (wzz0) obj;
                String str = h001Var.Y;
                qzz0 qzz0Var = wzz0Var.m;
                String str2 = wzz0Var.h;
                vzz0 vzz0Var = wzz0Var.b;
                vzz0 vzz0Var2 = wzz0Var.a;
                uzz0 uzz0Var = wzz0Var.f;
                boolean z = uzz0Var instanceof rzz0;
                String str3 = wzz0Var.c;
                boolean z2 = wzz0Var.d;
                if (z) {
                    return new yzz0(str3, ((rzz0) uzz0Var).a, z2, new xzz0(vzz0Var2, vzz0Var, str, str2.length() == 0), h001.e(wzz0Var), wzz0Var.g, qzz0Var);
                }
                return new a001(str3, new xzz0(vzz0Var2, vzz0Var, str, str2.length() == 0), z2, h001.e(wzz0Var), qzz0Var);
            default:
                ((qtr) obj).b(new k8y0(h001Var, null, (byte) 2));
                return rih1.a;
        }
    }
}
