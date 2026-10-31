package p;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class him implements h0r0 {
    public final Activity a;
    public final cfm b;
    public final qyj c;
    public final los d;
    public final kt91 e;
    public final mim f;
    public final q8n g;
    public final d520 h;
    public final cbr0 i;

    public him(Activity activity, cfm cfmVar, qyj qyjVar, los losVar, kt91 kt91Var, mim mimVar, q8n q8nVar, a83 a83Var, tdm tdmVar, i3l0 i3l0Var) {
        this.a = activity;
        this.b = cfmVar;
        this.c = qyjVar;
        this.d = losVar;
        this.e = kt91Var;
        this.f = mimVar;
        this.g = q8nVar;
        this.h = new d520(q8nVar, tdmVar.a(h4p1.l(new us0(a83Var.a(), this, (lnm) null, (byte) 24)), mimVar.a().getTarget(), new fim(this, (byte) 0)), new j1(this));
        idd1 idd1Var = new idd1(new fim(this, (byte) 3));
        boolean z = activity.getResources().getBoolean(2131034114);
        int iIntValue = ((Number) idd1Var.getValue()).intValue();
        int iIntValue2 = (int) (((Number) idd1Var.getValue()).intValue() * 0.6f);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165549);
        if (!z) {
            iIntValue2 = iIntValue2 < dimensionPixelSize ? dimensionPixelSize : iIntValue2;
            if (iIntValue2 <= iIntValue) {
                iIntValue = iIntValue2;
            }
        }
        dbr0 nxbVar = new nxb(Integer.valueOf(iIntValue), ixb.c, (Integer) null, 0, (mxb) null, losVar, false, false, z, (nsm0) null, 3804);
        dbr0 pu00Var = new pu00(true);
        dbr0 t1r0Var = new t1r0(true);
        dbr0 yxe1Var = new yxe1(new jx21(2131954463));
        dbr0 s9h1Var = new s9h1(4, true, true, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarD1 = yon1.d1();
        lik1 lik1VarB = mimVar.b();
        this.i = new cbr0(new dbr0[]{nxbVar, pu00Var, t1r0Var, yxe1Var, s9h1Var, new bn70(p6r0VarD1, lik1VarB == null ? nik1.U6 : lik1VarB, new nar0(i3l0Var))}, false);
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return new oql(this.c.a(apo.j(1632560269, new gim(this, (byte) 1), true)), this.h, (byte) 4);
    }
}
