package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ijp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijp0(Function0 function0, Function0 function1, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
        this.c = function1;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        switch (b) {
            case 0:
                gxb gxbVar = (hxb) obj;
                if (!gxbVar.equals(fxb.a) && !gxbVar.equals(exb.a)) {
                    if (!(gxbVar instanceof gxb)) {
                        eg.o();
                        return null;
                    }
                    int iC = l1d.C(gxbVar.a);
                    if (iC == 0) {
                        function1.invoke();
                    } else if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        function1.invoke();
                    } else {
                        function0.invoke();
                    }
                }
                return rih1Var;
            case 1:
                int iOrdinal = ((dq01) obj).ordinal();
                if (iOrdinal == 0) {
                    function1.invoke();
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    function0.invoke();
                }
                return rih1Var;
            default:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke();
                } else {
                    function0.invoke();
                }
                return rih1Var;
        }
    }
}
