package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pda1 implements h0r0 {
    public final qyj a;
    public final yba1 b;
    public final dda1 c;
    public final njm d;
    public final qa2 e;
    public final d0r f;
    public final z08 g;
    public final kly0 h;
    public final qa2 i;
    public final v6f j;
    public final iac0 k;
    public final String l;
    public final brl0 m;
    public final yt91 n;
    public Float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final err0 f31p;
    public final hrr0 q;
    public final hrr0 r;
    public final y7e1 s;
    public final cbr0 t;

    /* JADX WARN: Multi-variable type inference failed */
    public pda1(qyj qyjVar, yba1 yba1Var, dda1 dda1Var, njm njmVar, qa2 qa2Var, d0r d0rVar, z08 z08Var, ipq ipqVar, qa2 qa2Var2, v6f v6fVar, rda1 rda1Var, los losVar, e5b0 e5b0Var, q7r0 q7r0Var) {
        yba1 yba1Var2 = yba1Var;
        this.a = qyjVar;
        this.b = yba1Var2;
        this.c = dda1Var;
        this.d = njmVar;
        this.e = qa2Var;
        this.f = d0rVar;
        this.g = z08Var;
        this.h = ipqVar;
        this.i = qa2Var2;
        this.j = v6fVar;
        iac0 iac0Var = q7r0Var.d.c;
        this.k = iac0Var;
        String str = rda1Var.a;
        str = str == null ? "" : str;
        this.l = str;
        brl0 brl0Var = new brl0(str, (byte) 11);
        this.m = brl0Var;
        this.n = new yt91(new nda1(0, this, pda1.class, "logSearchFieldReveal", "logSearchFieldReveal()V", 0, (byte) 0));
        byte b = 0;
        this.f31p = new err0(0);
        rba1 rba1Var = sba1.a;
        this.q = v8r.q(rba1Var.b);
        lnm lnmVar = null;
        this.r = v8r.q((Object) null);
        this.s = new y7e1((String) null, 3);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("SONG_DNA_SEARCH", "song-dna/search", 1925, "song-dna");
        lik1 lik1Var = new lik1("spotify:internal:songdna:search");
        String str2 = rba1Var.b;
        byte b2 = 1;
        int i = str2.equals("recently_played") ? 4 : str2.equals("followed_artists") ? 1 : str2.equals("liked_songs") ? 2 : str2.equals("most_played") ? 3 : 0;
        e1m0 e1m0Var = i != 0 ? new e1m0(brl0Var, i) : null;
        this.t = new cbr0(new dbr0[]{new bn70(p6r0VarG1, lik1Var, e1m0Var != null ? new nar0(e1m0Var) : null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4061), new cxb(null, new j2i(1536167509, new mda1(this, b2), true)), new stm0(), new t1r0(true), new s9h1(4, true, true, true), e5b0Var}, false);
        u9c0 u9c0VarH = zso1.H(iac0Var.getLifecycle());
        for (Map.Entry entry : yba1Var2.a.entrySet()) {
            lnm lnmVar2 = lnmVar;
            fn31.T(u9c0VarH, yba1Var2.b, 0, new p651((Object) ((aea1) entry.getKey()).a, (Object) yba1Var2, entry.getValue(), lnmVar2, (byte) 20), 2);
            yba1Var2 = yba1Var;
            lnmVar = lnmVar2;
        }
        lnm lnmVar3 = lnmVar;
        dda1 dda1Var2 = this.c;
        fn31.T(u9c0VarH, dda1Var2.b, 0, new sb91(rwq.q(new gda1(this, (byte) 0)), dda1Var2, lnmVar3, (byte) 13), 2);
        fn31.T(u9c0VarH, lnmVar3, 0, new hda1(this, lnmVar3, b), 3);
        fn31.T(u9c0VarH, lnmVar3, 0, new hda1(this, lnmVar3, b2), 3);
    }

    public final cbr0 a() {
        return this.t;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1647308604, new mda1(this, (byte) 0), true));
    }

    public final void c(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1628418524);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zI = x340Var.i(view) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new iv81(view, this, (byte) 19);
                x340Var.s0(objT);
            }
            dgo1.c("song_dna_search_rows_visible_area", (iu30) objT, j2iVar, x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, j2iVar, i, (byte) 26);
        }
    }

    public final String d() {
        return (String) this.q.getValue();
    }

    public final String e() {
        return (String) this.r.getValue();
    }

    public final void f(nsn0 nsn0Var) {
        uba ubaVar = (l3h1) this.i.b.b(l3h1.class);
        if (ubaVar != null) {
            ubaVar.w(nsn0Var);
        }
    }

    public final me81 g(int i) {
        String strD;
        int iC = l1d.C(i);
        if (iC == 0) {
            strD = d();
        } else if (iC == 1) {
            strD = null;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            strD = e();
        }
        return new me81(i, strD);
    }

    public final int h() {
        boolean zBooleanValue = ((Boolean) ((hrr0) this.n.d).getValue()).booleanValue();
        if (this.c.d.a.getValue() instanceof wca1) {
            return zBooleanValue ? 2 : 1;
        }
        return 3;
    }
}
