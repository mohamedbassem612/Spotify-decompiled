package p;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qqh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm5 b;
    public final /* synthetic */ alg1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqh1(rm5 rm5Var, alg1 alg1Var, byte b) {
        super(1);
        this.a = b;
        this.b = rm5Var;
        this.c = alg1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        alg1 alg1Var = this.c;
        rm5 rm5Var = this.b;
        switch (b) {
            case 0:
                oqh1 oqh1VarL = rm5.l((Bundle) obj);
                Context context = (Context) rm5Var.b;
                String str = oqh1VarL.a;
                return new xm61((Integer) null, context.getString(2131953020, str), (Integer) null, context.getString(2131953011, oqh1VarL.b, str, oqh1VarL.c), (Integer) null, context.getString(2131953018), (Integer) null, context.getString(2131953017, str), new u9a1(3, null, (byte) 7), new pqh1(alg1Var, null, (byte) 1), new wm61(qmh1.a1, dw81.R0, qmh1.b1), 85);
            case 1:
                oqh1 oqh1VarL2 = rm5.l((Bundle) obj);
                Context context2 = (Context) rm5Var.b;
                String str2 = oqh1VarL2.a;
                return new xm61((Integer) null, context2.getString(2131953015, str2), (Integer) null, context2.getString(2131953012, str2, oqh1VarL2.c), (Integer) null, context2.getString(2131953016), (Integer) null, context2.getString(2131953017, str2), new qye0(rm5Var, (lnm) null, (byte) 2), new pqh1(alg1Var, null, (byte) 0), new wm61(new ldz0(1, (byte) 23), new ldz0(1, (byte) 24), new ldz0(1, (byte) 25)), 85);
            case 2:
                oqh1 oqh1VarL3 = rm5.l((Bundle) obj);
                Context context3 = (Context) rm5Var.b;
                String str3 = oqh1VarL3.a;
                return new xm61((Integer) null, context3.getString(2131953020, str3), (Integer) null, context3.getString(2131953019, oqh1VarL3.b, str3, oqh1VarL3.c), (Integer) null, context3.getString(2131953018), (Integer) null, context3.getString(2131953017, str3), new u9a1(3, null, (byte) 6), new pqh1(alg1Var, null, (byte) 1), new wm61(qmh1.a1, dw81.R0, qmh1.b1), 85);
            default:
                oqh1 oqh1VarL4 = rm5.l((Bundle) obj);
                Context context4 = (Context) rm5Var.b;
                String str4 = oqh1VarL4.a;
                return new xm61((Integer) null, context4.getString(2131953020, str4), (Integer) null, context4.getString(2131953019, oqh1VarL4.b, str4, oqh1VarL4.c), (Integer) null, context4.getString(2131953018), (Integer) null, context4.getString(2131953017, str4), new u9a1(3, null, (byte) 5), new xx0(alg1Var, (lnm) null, (byte) 26), new wm61(qmh1.a1, dw81.R0, qmh1.b1), 85);
        }
    }
}
