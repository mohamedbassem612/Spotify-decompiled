package p;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rfx implements u0i {
    public final /* synthetic */ uxj a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ xjh c;
    public final /* synthetic */ wfx d;

    public rfx(uxj uxjVar, yqg yqgVar, xjh xjhVar, wfx wfxVar) {
        this.a = uxjVar;
        this.b = yqgVar;
        this.c = xjhVar;
        this.d = wfxVar;
    }

    public final qzh a(l0i l0iVar) {
        if (l0iVar != null) {
            bhn0.d();
            return null;
        }
        uxj uxjVar = this.a;
        hwe1 hwe1Var = uxjVar.b;
        f4q f4qVar = uxjVar.a;
        yqg yqgVar = this.b;
        xjh xjhVar = this.c;
        oih oihVar = new oih(yqgVar, hwe1Var, xjhVar, new gal(yqgVar, xjhVar, (byte) 3), f4qVar);
        p811 p811Var = new p811();
        wfx wfxVar = this.d;
        nzj nzjVar = new nzj(wfxVar.b, new j2i(-1156330630, new gk0(wfxVar, p811Var, oihVar, (byte) 11), true));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ComposeView composeView = nzjVar.d;
        composeView.setLayoutParams(layoutParams);
        p811Var.a = composeView;
        op80 jp80Var = new jp80(composeView);
        op80 eq80Var = new eq80(new e3h1(uxjVar.d, (n7h1) null, uxjVar.c));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(composeView, jp80Var);
        return nzjVar;
    }
}
