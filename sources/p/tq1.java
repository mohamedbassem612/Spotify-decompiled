package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lag a;

    public tq1(lag lagVar) {
        this.a = lagVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cp1 cp1Var = (cp1) obj;
        tv80 tv80Var = cp1Var.b;
        lag lagVar = this.a;
        av1 av1Var = (av1) lagVar.c;
        gy1 gy1Var = av1Var.i;
        List list = av1Var.d;
        boolean z = gy1Var instanceof fy1;
        ajg1 ajg1Var = z ? ((so1) lagVar.d).U0 : null;
        String str = cp1Var.c;
        if (str == null) {
            zu1 zu1Var = av1Var.b;
            str = zu1Var != null ? zu1Var.a : null;
        }
        List list2 = z6x.a;
        List listSingletonList = ajg1Var != null ? Collections.singletonList(new bqn(ajg1Var.a, ajg1Var.b, ajg1Var.c)) : list2;
        List list3 = z ? list2 : list;
        ey1 ey1Var = gy1Var instanceof ey1 ? (ey1) gy1Var : null;
        List list4 = ey1Var != null ? ey1Var.a : null;
        if (list4 != null) {
            list2 = list4;
        }
        String str2 = av1Var.c;
        String str3 = av1Var.e;
        boolean z2 = gy1Var instanceof dy1;
        dy1 dy1Var = z2 ? (dy1) gy1Var : null;
        zpn zpnVar = new zpn(z, listSingletonList, list3, list2, str2, str3, new xpn(z2 ? (String) o7h.s0(list) : null, dy1Var != null ? dy1Var.a : null), true, 515);
        cqn cqnVar = new cqn(str, (String) null, zpnVar, 2);
        if (av1Var.g) {
            cqn cqnVar2 = new cqn(cqnVar.a, cqnVar.b, new zpn(true, zpnVar.b, zpnVar.c, zpnVar.d, zpnVar.e, zpnVar.f, str2, str3, zpnVar.i, true, false));
            ((yx1) lagVar.b).a.l(new tp1(cqnVar2, tv80Var));
        } else {
            ((spn) lagVar.e).a(cp1Var.a, cqnVar, tv80Var);
        }
        return rih1.a;
    }
}
