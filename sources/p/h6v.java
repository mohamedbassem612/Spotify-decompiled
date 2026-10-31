package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h6v extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6v(Function0 function0, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 2;
        this.b = function0;
        this.d = c9nVar;
        this.c = ven0Var;
        this.e = ven0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.c;
        c9n c9nVar = this.d;
        switch (b) {
            case 0:
                o5v o5vVar = (o5v) ven0Var2.getValue();
                if (o5vVar != null) {
                    fn31.T(c9nVar, (o8n) null, 0, new g6v(o5vVar, (lnm) null, (byte) 2), 3);
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                ven0Var.setValue(Boolean.FALSE);
                break;
            case 1:
                o5v o5vVar2 = (o5v) ven0Var2.getValue();
                if (o5vVar2 != null) {
                    fn31.T(c9nVar, (o8n) null, 0, new g6v(o5vVar2, (lnm) null, (byte) 3), 3);
                }
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                ven0Var.setValue(Boolean.FALSE);
                break;
            default:
                if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                    fn31.T(c9nVar, (o8n) null, 0, new m3n0(function0, ven0Var, (lnm) null, (byte) 26), 3);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6v(Function0 function0, ven0 ven0Var, c9n c9nVar, ven0 ven0Var2, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
        this.d = c9nVar;
        this.e = ven0Var2;
    }
}
