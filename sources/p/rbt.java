package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rbt {
    public final zob1 a;
    public final d0r b;
    public final ov50 c;
    public final boolean d;
    public final mr20 e;
    public final mr20 f;
    public final pbq g;
    public final pbq h;
    public final pbq i;
    public final uu0 j;
    public final pbq k;
    public final pbq l;
    public final pbq m;
    public final pbq n;
    public final cct o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pbq f37p;
    public final fct q;
    public final koc0 r;

    public rbt(bpb1 bpb1Var, d0r d0rVar, ov50 ov50Var, boolean z, mr20 mr20Var, mr20 mr20Var2, List list, List list2, List list3, wdm wdmVar, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11) {
        this.a = bpb1Var;
        this.b = d0rVar;
        this.c = ov50Var;
        this.d = z;
        this.e = mr20Var;
        this.f = mr20Var2;
        pbq pbqVarJ = wdmVar.j("header_story", o5b0.b, list);
        koc0 koc0Var = (koc0) wdmVar.i;
        this.g = pbqVarJ;
        this.h = wdmVar.j("header_artwork_accessory", o5b0.Y, list2);
        this.i = wdmVar.j("header_overlay", o5b0.h, list3);
        fey feyVar = (fey) wdmVar.f;
        wmy wmyVar = (wmy) wdmVar.h;
        List list12 = list4;
        ArrayList arrayList = new ArrayList(q7h.U(list12, 10));
        Iterator it = list12.iterator();
        while (it.hasNext()) {
            arrayList.add((u260) ((ibt) it.next()).b);
        }
        this.j = new uu0(koc0Var, arrayList, wmyVar, mr20Var2, (jus) feyVar.b, (r6h1) wdmVar.t);
        this.k = wdmVar.j("header_addendum", o5b0.f, list5);
        this.l = wdmVar.j("header_creator", o5b0.e, list6);
        this.m = wdmVar.j("header_metadata", o5b0.g, list7);
        this.n = wdmVar.j("header_pre_title", o5b0.i, list8);
        this.o = new cct(wdmVar.j("header_artwork", o5b0.d, list9));
        this.f37p = wdmVar.j("header_play_button", o5b0.t, list10);
        this.q = new fct(wdmVar.j("header_description", o5b0.X, list11));
        this.r = koc0Var;
    }
}
