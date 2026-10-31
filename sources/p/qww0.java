package p;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qww0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rww0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qww0(rww0 rww0Var, byte b) {
        super(0);
        this.a = b;
        this.b = rww0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 1;
        rww0 rww0Var = this.b;
        switch (b) {
            case 0:
                xjq xjqVar = rww0Var.f2;
                if (xjqVar == null) {
                    u890.C("loggerFactory");
                    throw null;
                }
                i8h1 i8h1Var = rww0Var.h2;
                if (i8h1Var != null) {
                    return xjqVar.a(i8h1Var);
                }
                u890.C("ubiLogger");
                throw null;
            case 1:
                fjg1.a((ViewGroup) rww0Var.Q0().getRootView(), (jhg1) null);
                ((v4n) rww0Var).Z1.c(v4n.a2[1], rww0Var, Boolean.TRUE);
                return rih1Var;
            case 2:
                fjg1.a((ViewGroup) rww0Var.Q0().getRootView(), (jhg1) null);
                ((v4n) rww0Var).Z1.c(v4n.a2[1], rww0Var, Boolean.FALSE);
                return rih1Var;
            default:
                wjq wjqVar = rww0Var.c2;
                if (wjqVar != null) {
                    return wjqVar.a(rww0Var.P0(), new qww0(rww0Var, b2), new qww0(rww0Var, (byte) 2));
                }
                u890.C("dialogViewBinderFactory");
                throw null;
        }
    }
}
