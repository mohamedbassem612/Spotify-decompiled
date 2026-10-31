package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lkq0 extends klq0 {
    public static final lkq0 d;
    public static final lkq0 e;
    public static final lkq0 f;
    public final /* synthetic */ byte c;

    static {
        int i = 1;
        d = new lkq0((byte) 0, i, 2);
        int i2 = 1;
        e = new lkq0((byte) 1, i2, i2);
        f = new lkq0((byte) 2, i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lkq0(byte b, int i, int i2) {
        super(i, i2);
        this.c = b;
    }

    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        switch (this.c) {
            case 0:
                Object objInvoke = ((Function0) a9aVar.m(0)).invoke();
                s340 s340Var = (s340) a9aVar.m(1);
                int iL = a9aVar.l(0);
                s340Var.getClass();
                hf91Var.W(hf91Var.c(s340Var), objInvoke);
                j06Var.e(iL, objInvoke);
                j06Var.h(objInvoke);
                break;
            case 1:
                s340 s340Var2 = (s340) a9aVar.m(0);
                int iL2 = a9aVar.l(0);
                j06Var.l();
                s340Var2.getClass();
                j06Var.g(iL2, hf91Var.D(hf91Var.c(s340Var2)));
                break;
            default:
                Object objM = a9aVar.m(0);
                s340 s340Var3 = (s340) a9aVar.m(1);
                int iL3 = a9aVar.l(0);
                if (objM instanceof b440) {
                    h72Var.M((b440) objM);
                }
                Object objL = hf91Var.L(hf91Var.c(s340Var3), iL3, objM);
                if (objL instanceof b440) {
                    h72Var.D((b440) objL);
                } else if (objL instanceof h311) {
                    ((h311) objL).d();
                }
                break;
        }
    }

    public s340 b(a9a a9aVar) {
        switch (this.c) {
            case 0:
                return (s340) a9aVar.m(1);
            case 1:
                return (s340) a9aVar.m(0);
            default:
                return super.b(a9aVar);
        }
    }
}
