package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hvw extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvw(Function0 function0, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.c = function0;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vuu0 vuu0Var = vuu0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                iu30Var.invoke((String) obj);
                function0.invoke();
                return rih1Var;
            case 1:
                uly ulyVar = (uly) obj;
                if (ulyVar.equals(sly.c)) {
                    iu30Var.invoke(new gjy((cjy) function0.invoke()));
                } else if (ulyVar.equals(sly.d)) {
                    iu30Var.invoke(new hjy((cjy) function0.invoke()));
                }
                return rih1Var;
            case 2:
                niy niyVarW = xzo1.w(((yby) obj).a);
                if (niyVarW != null) {
                    iu30Var.invoke(new kjy(niyVarW, (cjy) function0.invoke()));
                }
                return rih1Var;
            case 3:
                function0.invoke();
                iu30Var.invoke(new pj10((String) obj));
                return rih1Var;
            case 4:
                cnu0 cnu0Var = (cnu0) obj;
                if (cnu0Var.equals(anu0.a)) {
                    function0.invoke();
                } else {
                    if (!(cnu0Var instanceof bnu0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new v0j0(((bnu0) cnu0Var).a));
                }
                return rih1Var;
            case 5:
                wuu0 wuu0Var = (xuu0) obj;
                if (wuu0Var.equals(vuu0Var)) {
                    function0.invoke();
                } else {
                    if (!(wuu0Var instanceof wuu0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new v0j0(wuu0Var.a));
                }
                return rih1Var;
            case 6:
                wuu0 wuu0Var2 = (xuu0) obj;
                if (wuu0Var2.equals(vuu0Var)) {
                    function0.invoke();
                } else {
                    if (!(wuu0Var2 instanceof wuu0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new v0j0(wuu0Var2.a));
                }
                return rih1Var;
            default:
                function0.invoke();
                iu30Var.invoke((mvh1) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvw(iu30 iu30Var, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = function0;
    }
}
