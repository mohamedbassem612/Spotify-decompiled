package p;

import android.content.res.Resources;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kpc {
    public final String a;
    public final y1c1 b;
    public final iac0 c;
    public final String d;
    public final w3l0 e;
    public final Resources f;
    public final lzn0 g;
    public final ioc h;
    public final boolean i;
    public final zsc j;
    public final zs11 k;
    public final ArrayList l = new ArrayList();
    public dpc m;
    public Function0 n;

    public kpc(up11 up11Var, String str, y1c1 y1c1Var, iac0 iac0Var, String str2, w3l0 w3l0Var, Resources resources, nbc nbcVar, lzn0 lzn0Var, ioc iocVar, boolean z, zsc zscVar, zs11 zs11Var) {
        this.a = str;
        this.b = y1c1Var;
        this.c = iac0Var;
        this.d = str2;
        this.e = w3l0Var;
        this.f = resources;
        this.g = lzn0Var;
        this.h = iocVar;
        this.i = z;
        this.j = zscVar;
        this.k = zs11Var;
    }

    public final ug3 a() {
        mmr0 mmr0VarV = this.b.V(pb31.class);
        return new ug3(wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b), new fpc(this, (byte) 1), this.a, this.d);
    }

    public final void b(String str, wrw wrwVar, boolean z, boolean z2, boolean z3, xoc xocVar, iu30 iu30Var, av11 av11Var) {
        gpc gpcVar;
        ArrayList arrayList = this.l;
        if (arrayList.size() >= 4) {
            hhg1.n("You can't add more than 4 tabs for this configuration.");
            return;
        }
        w2c1 w2c1Var = this.b;
        mmr0 mmr0VarV = w2c1Var.V(pb31.class);
        mr20 mr20VarI = t5p1.i(wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b));
        iac0 iac0Var = this.c;
        lt0 lt0VarA = hu20.a(h4p1.f(new lqv(iac0Var.getLifecycle(), w8c0.d, mr20VarI, (lnm) null, (byte) 10)), new s4(2, (lnm) null, (byte) 23));
        ioc iocVar = this.h;
        toc tocVar = new toc(iocVar.b(), lt0VarA, iac0Var, igu.b, iocVar);
        it8 it8Var = xocVar != null ? new it8(xocVar, this, (byte) 23) : null;
        j96 j96Var = new j96(this, z, wrwVar, av11Var, iu30Var, tocVar, it8Var);
        mmr0 mmr0VarV2 = w2c1Var.V(pb31.class);
        fai0 fai0VarQ = w6d1.q(w6d1.h(w6d1.q(wgo1.F((ymd0) mmr0VarV2.a, mmr0VarV2.b), jpc.b)), jpc.c);
        hp91 hp91Var = new hp91(new ho41((byte) 5, 0, 15), new ho41((byte) 4, 0, 15), (byte) 28);
        if (it8Var != null) {
            l811 l811Var = new l811();
            mmr0 mmr0VarV3 = w2c1Var.V(pb31.class);
            wgo1.F((ymd0) mmr0VarV3.a, mmr0VarV3.b).f(iac0Var, new z11(l811Var, (byte) 5));
            gpcVar = new gpc(l811Var, (byte) 0);
        } else {
            gpcVar = cu9.e1;
        }
        arrayList.add(new epc(str, j96Var, fai0VarQ, hp91Var, z2, gpcVar, z3, new fpc(this, (byte) 2), 2));
        if (z) {
            this.m = new dpc(a(), new vga1(null, null, false, null, 15), arrayList.size() - 1);
        }
    }

    public final void d(int i, String str, iu30 iu30Var, boolean z) {
        ho41 ho41Var;
        ArrayList arrayList = this.l;
        if (arrayList.size() >= 4) {
            hhg1.n("You can't add more than 4 tabs for this configuration.");
            return;
        }
        Resources resources = this.f;
        ho41 ho41Var2 = new ho41((byte) 5, resources.getDimensionPixelSize(2131165616), 13);
        int iC = l1d.C(i);
        if (iC == 0) {
            ho41Var = new ho41((byte) 4, resources.getDimensionPixelSize(2131165615), 14);
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            ho41Var = new ho41((byte) 4, 0, 15);
        }
        arrayList.add(new epc(str, iu30Var, (fai0) null, new hp91(ho41Var2, ho41Var, (byte) 28), z, cu9.e1, false, jpc.d, 10));
    }
}
