package p;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bnr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnr0(xfx xfxVar, boolean z, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = xfxVar;
        this.c = z;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        boolean z = this.c;
        xfx xfxVar = this.b;
        switch (b) {
            case 0:
                f610 f610Var = o610.Q0;
                ufx ufxVar = xfxVar.b;
                wbs wbsVar = new wbs(ufxVar.a, ufxVar.b, (z ? f610Var : f610.P0).equals(f610Var));
                wbsVar.n(iu30Var);
                LinearLayout linearLayout = wbsVar.c.a;
                linearLayout.setTag(wbsVar);
                return linearLayout;
            case 1:
                d710 d710Var = c710.P0;
                ufx ufxVar2 = xfxVar.b;
                wfx wfxVar = xfxVar.c;
                lhg0 lhg0Var = new lhg0(ufxVar2.a, new igx(wfxVar, (byte) 4), new zfx(wfxVar, (byte) 4), new pp(wfxVar, (byte) 1), new pp(wfxVar, (byte) 7), new pp(wfxVar, (byte) 21), u890.j(z ? d710Var : d710.Q0, d710Var));
                lhg0Var.n(iu30Var);
                LinearLayout linearLayout2 = (LinearLayout) lhg0Var.h.a;
                linearLayout2.setTag(lhg0Var);
                return linearLayout2;
            case 2:
                o810 o810Var = e710.Q0;
                ufx ufxVar3 = xfxVar.b;
                wfx wfxVar2 = xfxVar.c;
                nhg0 nhg0Var = new nhg0(ufxVar3.a, new igx(wfxVar2, (byte) 4), new zfx(wfxVar2, (byte) 4), new pp(wfxVar2, (byte) 1), new pp(wfxVar2, (byte) 7), new pp(wfxVar2, (byte) 20), new pp(wfxVar2, (byte) 21), u890.j(z ? o810Var : o810.Q0, o810Var));
                nhg0Var.n(iu30Var);
                LinearLayout linearLayout3 = (LinearLayout) nhg0Var.h.a;
                linearLayout3.setTag(nhg0Var);
                return linearLayout3;
            default:
                eh10 eh10Var = yb10.Q0;
                ufx ufxVar4 = xfxVar.b;
                wfx wfxVar3 = xfxVar.c;
                ohg0 ohg0Var = new ohg0(ufxVar4.a, new igx(wfxVar3, (byte) 4), new zfx(wfxVar3, (byte) 4), new pp(wfxVar3, (byte) 1), new pp(wfxVar3, (byte) 7), new pp(wfxVar3, (byte) 21), u890.j(z ? eh10Var : eh10.Q0, eh10Var));
                ohg0Var.n(iu30Var);
                LinearLayout linearLayout4 = (LinearLayout) ohg0Var.b.b;
                linearLayout4.setTag(ohg0Var);
                return linearLayout4;
        }
    }
}
