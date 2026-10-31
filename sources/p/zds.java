package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zds implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ges b;

    public /* synthetic */ zds(ges gesVar, byte b) {
        this.a = b;
        this.b = gesVar;
    }

    public final Object apply(Object obj) {
        l5r0 l5r0VarF;
        Bundle bundle;
        byte b = this.a;
        final ges gesVar = this.b;
        switch (b) {
            case 0:
                j5e0 j5e0Var = (j5e0) obj;
                j5e0Var.getClass();
                a680 a680Var = gesVar.T0;
                ges.z(j5e0Var, (qsw0) a680Var.d);
                return (l5r0) ((qsw0) a680Var.d).get();
            case 1:
                c5e0 c5e0Var = (c5e0) obj;
                a680 a680Var2 = gesVar.T0;
                ges.z(c5e0Var, (wu30) a680Var2.e);
                return (l5r0) ((wu30) a680Var2.e).apply(c5e0Var.a);
            case 2:
                return gesVar.U0;
            case 3:
                l5e0 l5e0Var = (l5e0) obj;
                l5e0Var.getClass();
                a680 a680Var3 = gesVar.T0;
                ges.z(l5e0Var, (bra) a680Var3.f);
                return (l5r0) ((bra) a680Var3.f).apply(l5e0Var, new Object() { // from class: p.des
                });
            case 4:
                return gesVar.U0;
            case 5:
                return gesVar.U0;
            case 6:
                return gesVar.U0;
            default:
                f5e0 f5e0Var = (f5e0) obj;
                a680 a680Var4 = gesVar.T0;
                if (((u6e0) a680Var4.c) != null) {
                    l6s l6sVar = gesVar.f1;
                    if (l6sVar == null || (bundle = (Bundle) l6sVar.c) == null) {
                        bundle = new Bundle();
                    }
                    Object obj2 = f5e0Var.a;
                    u6e0 u6e0Var = (u6e0) a680Var4.c;
                    u6e0Var.getClass();
                    v6e0 v6e0Var = u6e0Var.a;
                    t7e0 t7e0VarV = e4p1.v(v6e0Var.a, bundle);
                    v6e0Var.i = t7e0VarV;
                    t7e0 t7e0Var = t7e0VarV.e;
                    s7e0 s7e0Var = v6e0Var.g;
                    if (s7e0Var != null) {
                        hm5.J(s7e0Var.a, t7e0Var);
                    }
                    l5r0VarF = v6e0Var.f(obj2, t7e0VarV);
                } else {
                    ges.z(f5e0Var, (wu30) a680Var4.b);
                    l5r0VarF = (l5r0) ((wu30) a680Var4.b).apply(f5e0Var.a);
                }
                if (l5r0VarF.getView() != null) {
                    Logger.k("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", new Object[]{l5r0VarF});
                }
                return l5r0VarF;
        }
    }
}
