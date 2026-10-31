package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yfv extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfv(int i, byte b) {
        super(4);
        this.a = b;
        this.b = i;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        long jC;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new xfv((Context) obj2, (ViewGroup) obj3, i);
            default:
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                qim0 qim0VarR = u291.r(nim0.a, 10.0f);
                cr31 cr31Var = er31.a;
                if (iIntValue <= i) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-69487419);
                    uwr uwrVar = cbx.a;
                    jC = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-69418351);
                    uwr uwrVar2 = cbx.a;
                    jC = cbx.a(x340Var3).a.a.c();
                    x340Var3.r(false);
                }
                t1c.a(dug.f(qim0VarR, jC, cr31Var), x340Var, 0);
                return rih1.a;
        }
    }
}
