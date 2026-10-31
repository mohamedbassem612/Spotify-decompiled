package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rxr {
    public final oxr a;
    public final lzn0 b;
    public final tjq c;
    public final tzo d;
    public final hsg0 e;
    public final nl51 f;
    public final dlg1 g;
    public final lik1 h;
    public final oj3 i;

    public rxr(oxr oxrVar, lzn0 lzn0Var, tjq tjqVar, tzo tzoVar, hsg0 hsg0Var, nl51 nl51Var, dlg1 dlg1Var, lik1 lik1Var, oj3 oj3Var) {
        this.a = oxrVar;
        this.b = lzn0Var;
        this.c = tjqVar;
        this.d = tzoVar;
        this.e = hsg0Var;
        this.f = nl51Var;
        this.g = dlg1Var;
        this.h = lik1Var;
        this.i = oj3Var;
    }

    public final void a(ldm ldmVar) {
        String str = ldmVar.a;
        String str2 = ldmVar.b;
        boolean z = ldmVar.c;
        int i = ldmVar.d;
        l4v0 l4v0Var = new l4v0(str, str2, z, i, ldmVar.e, ldmVar.f);
        p68 p68Var = (p68) this.d.b;
        dlg1 dlg1Var = (dlg1) p68Var.d;
        bpl0 bpl0VarL = dlg1Var.l();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = bpl0VarL.b.c();
        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str2, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, str2, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, bpl0VarL.a, System.currentTimeMillis()), (xj61) null);
        Observable observableSwitchMap = ((Observable) p68Var.g).switchMap(new xmu0(p68Var, l4v0Var, (byte) 3));
        mfm mfmVarA = ((i4q) p68Var.e).a((lik1) p68Var.b);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableSwitchMap, yon1.Y0(), (bjm) null, tv80VarM, 20);
    }

    public final void b(yqg0 yqg0Var) {
        String str = yqg0Var.a;
        int i = yqg0Var.b;
        dlg1 dlg1Var = this.g;
        bpl0 bpl0VarL = dlg1Var.l();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = bpl0VarL.b.c();
        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("mark_as_played_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("mark_as_played", 1, Collections.singletonMap("item_played", str)), x6h1VarC3.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null);
        this.e.g(str);
    }

    public final void c(xzo1 xzo1Var) {
        yon1 k7zVar;
        if (xzo1Var instanceof hgt0) {
            hgt0 hgt0Var = (hgt0) xzo1Var;
            k7zVar = new l7z(hgt0Var.d, new j7z(hgt0Var.c, hgt0Var.e, hgt0Var.f, hgt0Var.g, hgt0Var.h, hgt0Var.i));
        } else if (xzo1Var instanceof igt0) {
            igt0 igt0Var = (igt0) xzo1Var;
            k7zVar = new m7z(igt0Var.c, new j7z(igt0Var.d, igt0Var.e, igt0Var.f, igt0Var.g, igt0Var.h, igt0Var.i));
        } else {
            if (!(xzo1Var instanceof ggt0)) {
                eg.o();
                return;
            }
            ggt0 ggt0Var = (ggt0) xzo1Var;
            k7zVar = new k7z(this.g, ggt0Var.c, ggt0Var.d, ggt0Var.e, ggt0Var.f, ggt0Var.g, ggt0Var.h, ggt0Var.i);
        }
        boolean z = k7zVar instanceof l7z;
        oxr oxrVar = this.a;
        if (z) {
            l7z l7zVar = (l7z) k7zVar;
            oxrVar.a(l7zVar.e, new nxr(oxrVar, l7zVar, (byte) 0));
            return;
        }
        if (k7zVar instanceof m7z) {
            m7z m7zVar = (m7z) k7zVar;
            oxrVar.a(m7zVar.e, new nxr(oxrVar, m7zVar, (byte) 1));
            return;
        }
        if (!(k7zVar instanceof k7z)) {
            eg.o();
            return;
        }
        k7z k7zVar2 = (k7z) k7zVar;
        dlg1 dlg1Var = k7zVar2.d;
        bpl0 bpl0VarL = dlg1Var.l();
        Integer numValueOf = Integer.valueOf(k7zVar2.i);
        x6h1 x6h1VarC = bpl0VarL.b.c();
        String str = k7zVar2.e;
        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str)), x6h1VarC3.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null);
        h131 h131Var = k7zVar2.k;
        int i = k7zVar2.j;
        if (!h131Var.a(i)) {
            oxrVar.d.a(str, (String) null);
            return;
        }
        aod aodVar = oxrVar.e;
        String str2 = ((lik1) oxrVar.b.get()).a;
        int iC = l1d.C(i);
        if (iC == 0) {
            ((wr00) aodVar.b).a(str);
        } else if (iC == 1) {
            ((yh2) aodVar.c).b(str, k7zVar2.h);
        } else {
            mna0.e("Episode Restriction ", zjy.s(i), " not supported");
        }
    }
}
