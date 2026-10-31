package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s871 extends auj {
    public final jf11 Y1;
    public i8h1 Z1;
    public Function0 a2 = w661.d1;
    public uvk0 b2;

    public s871(jf11 jf11Var) {
        this.Y1 = jf11Var;
    }

    public final void I0(View view, Bundle bundle) {
        super/*p.haa*/.I0(view, bundle);
        i8h1 i8h1Var = this.Z1;
        if (i8h1Var == null) {
            u890.C("ubiLogger");
            throw null;
        }
        uvk0 uvk0Var = this.b2;
        if (uvk0Var == null) {
            u890.C("mobileChatEventFactory");
            throw null;
        }
        x6h1 x6h1VarC = uvk0Var.a.c();
        x6h1VarC.i.add(new a7h1("share_history_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = uvk0Var.b;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-653424005);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new qv61(this, (byte) 8);
                x340Var.s0(objT);
            }
            azo1.g(0, (Function0) objT, x340Var, (qim0) null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(this, xtjVar, i, (byte) 19);
        }
    }

    public final void v0(Context context) {
        this.Y1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final void l1() {
    }
}
