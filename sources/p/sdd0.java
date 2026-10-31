package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sdd0 {
    public final nvh a;
    public final m6i1 b;
    public final zx00 c;
    public final pt d;
    public final cm0 e;
    public final rwj f;
    public final vbe1 g;
    public final xdd0 h;
    public final z201 i;
    public final iaf j;
    public final hgd0 k;
    public final los l;
    public final f1n0 m;

    public sdd0(nvh nvhVar, m6i1 m6i1Var, zx00 zx00Var, pt ptVar, cm0 cm0Var, rwj rwjVar, vbe1 vbe1Var, xdd0 xdd0Var, z201 z201Var, iaf iafVar, hgd0 hgd0Var, los losVar, f1n0 f1n0Var) {
        this.a = nvhVar;
        this.b = m6i1Var;
        this.c = zx00Var;
        this.d = ptVar;
        this.e = cm0Var;
        this.f = rwjVar;
        this.g = vbe1Var;
        this.h = xdd0Var;
        this.i = z201Var;
        this.j = iafVar;
        this.k = hgd0Var;
        this.l = losVar;
        this.m = f1n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    public final void a(tdd0 tdd0Var, b0k b0kVar, int i) {
        boolean z;
        boolean z2;
        String str;
        m4c m4cVar = fkj0.X;
        String str2 = tdd0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(325886530);
        int i2 = (x340Var.g(tdd0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            iaf iafVar = this.j;
            huz huzVar = (mr20) (((no4) iafVar.a.a.get()).k() ? new ame(iafVar, str2, (byte) 4).invoke() : null);
            if (huzVar == null) {
                huzVar = new huz((Object) null, (byte) 10);
            }
            ven0 ven0VarG = rwq.g(huzVar, (Object) null, (o8n) null, x340Var, 48, 2);
            if (this.k.g()) {
                xdd0 xdd0Var = this.h;
                z = (xdd0Var.g || ihc1.y0(str2) || (str = xdd0Var.b) == null || ihc1.y0(str)) ? false : true;
            }
            if (z) {
                x340Var.i0(-355642674);
                WeakHashMap weakHashMap = osl1.x;
                boolean zF = lhc.g(x340Var).c.f();
                x340Var.r(false);
                z2 = zF;
            } else {
                x340Var.i0(1859980231);
                x340Var.r(false);
                z2 = false;
            }
            float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = x340Var.h(z2) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zH || objT == m4cVar) {
                objT = new p6d0(z2, this, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-listening-activity-details-page";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("listeningactivity/details");
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                x340Var.s0(r6h1Var2);
                objT2 = r6h1Var2;
            }
            r6h1 r6h1Var3 = (r6h1) objT2;
            boolean zI = x340Var.i(r6h1Var3);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new cb1(r6h1Var3, (byte) 21);
                x340Var.s0(objT3);
            }
            dgo1.c(rih1.a, (iu30) objT3, apo.r(-2036135546, new c360(f, this, z2, tdd0Var, z, ven0VarG), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(this, tdd0Var, i, (byte) 25);
        }
    }
}
