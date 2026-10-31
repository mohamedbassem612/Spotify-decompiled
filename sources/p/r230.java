package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r230 implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public r230(wp20 wp20Var, boolean z, String str) {
        this.c = wp20Var;
        this.b = z;
        this.d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x8c0 lifecycle;
        byte b = this.a;
        int i = 3;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                wp20 wp20Var = (wp20) obj;
                view.getClass();
                wp20Var.getClass();
                iac0 iac0VarH = x9p1.h(view);
                u9c0 u9c0VarH = (iac0VarH == null || (lifecycle = iac0VarH.getLifecycle()) == null) ? null : zso1.H(lifecycle);
                if (u9c0VarH != null) {
                    fn31.T(u9c0VarH, (o8n) null, 0, new hl1(this.b, wp20Var, (String) obj2, (lnm) null, (byte) 7), 3);
                }
                break;
            default:
                j5g1 j5g1Var = (j5g1) obj2;
                o5g1 o5g1Var = (o5g1) obj;
                if (!o5g1Var.d) {
                    iu30 iu30Var = j5g1Var.a;
                    if (!this.b) {
                        iu30Var.invoke(x4g1.b);
                    } else {
                        iu30Var.invoke(x4g1.a);
                    }
                } else {
                    aod aodVar = j5g1Var.f;
                    String str = o5g1Var.f;
                    if (o5g1Var.g) {
                        i = 2;
                    } else if (o5g1Var.h) {
                        i = 1;
                    }
                    String str2 = o5g1Var.a;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        ((wr00) aodVar.b).a(str2);
                    } else if (iC != 1) {
                        mna0.e("Episode Restriction ", zjy.s(i), " not supported");
                    } else {
                        ((yh2) aodVar.c).b(str2, str);
                    }
                }
                break;
        }
    }

    public r230(o5g1 o5g1Var, j5g1 j5g1Var, String str, boolean z) {
        this.c = o5g1Var;
        this.d = j5g1Var;
        this.b = z;
    }
}
