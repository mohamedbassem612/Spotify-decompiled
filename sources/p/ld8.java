package p;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ld8 extends fy31 {
    public final qzh U0;
    public final ufs V0;

    public ld8(qzh qzhVar, ufs ufsVar) {
        super(qzhVar.getView());
        this.U0 = qzhVar;
        this.V0 = ufsVar;
    }

    public final void E(bw31 bw31Var, List list, ym ymVar) {
        yu31 yu31Var = (yu31) bw31Var;
        eh90 eh90Var = yu31Var.a;
        float f = eh90Var.e;
        String str = eh90Var.d;
        boolean z = f > 0.0f;
        String str2 = eh90Var.b;
        String str3 = eh90Var.c;
        String str4 = eh90Var.i;
        String str5 = eh90Var.g;
        StringBuilder sb = new StringBuilder();
        qzh qzhVar = this.U0;
        if (z) {
            sb.append(String.format(new Locale(upn1.o(qzhVar.getView().getContext(), "_")), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
            sb.append(" • ");
        }
        if (!ihc1.y0(str)) {
            sb.append(str);
            sb.append(" • ");
        }
        tfs tfsVarA = this.V0.a(eh90Var.b, (int) eh90Var.Z, (int) eh90Var.X, (Integer) null, false, false);
        tfsVarA.i = false;
        tfsVarA.h = true;
        tfsVarA.g = true;
        tfsVarA.g("d MMM yyyy");
        tfsVarA.f = 2;
        sb.append(tfsVarA.a());
        String string = sb.toString();
        k4m k4mVar = eh90Var.h ? k4m.b : k4m.d;
        String strR = aqo1.r(((w611) this).a.getContext(), eh90Var);
        String str6 = eh90Var.b;
        qzhVar.f(new nb8(str2, strR, string, str4, str3, str5, z, k4mVar, new pk1(yu31Var.e == 1 ? qk1.b : qk1.a, list.contains("addStateChanged"), str6, qzhVar.getView().getContext().getString(2131952505), tk1.c)));
        qzhVar.n(new kd8(ymVar, eh90Var, (byte) 0));
    }
}
