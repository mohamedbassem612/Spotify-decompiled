package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vnc0 implements snc0 {
    public final d0r a;
    public final rhg0 b;
    public final MobiusLoop c;
    public final bpb1 d;
    public final bpb1 e;
    public final bpb1 f;
    public int g;
    public int h;
    public boolean i;
    public final xe01 j;
    public final xe01 k;
    public final xe01 l;

    public vnc0(Function0 function0, Function0 function1, ArrayList arrayList, Map map, Map map2, Map map3, LinkedHashMap linkedHashMap, Map map4, cc9 cc9Var, Map map5, d0r d0rVar, boolean z, boolean z2, guh0 guh0Var) {
        this.a = d0rVar;
        rhg0 rhg0VarK = crn1.k(d0rVar);
        this.b = rhg0VarK;
        bpb1 bpb1VarB = gio1.b(new rnc0());
        this.d = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(new ioj0(b7x.a));
        this.e = bpb1VarB2;
        dj20.l();
        bpb1 bpb1VarB3 = gio1.b(h5e0.a);
        this.f = bpb1VarB3;
        this.g = -1;
        this.h = -1;
        this.j = d5p1.h(bpb1VarB3);
        this.k = d5p1.h(bpb1VarB);
        this.l = d5p1.h(bpb1VarB2);
        a0z0 a0z0Var = new a0z0(map, map3, map2, linkedHashMap, map4, map5, d0rVar, z, z2, rhg0VarK, cc9Var, guh0Var);
        mr20 mr20VarJ = uwo1.j(arrayList);
        MobiusLoop.Builder builderD = Mobius.d(a0z0Var.h(), a0z0Var.d());
        FlowEventSources.Companion companion = FlowEventSources.a;
        bhh1 bhh1Var = igu.b;
        mr20[] mr20VarArr = {mr20VarJ, h4p1.f(new ss90(this, (lnm) null, (byte) 23))};
        companion.getClass();
        MobiusLoop mobiusLoopG = builderD.c(new com.spotify.mobius.coroutines.b(bhh1Var, mr20VarArr), new EventSource[0]).b(new boc0(function1)).d(new boc0(function0)).g(new xz81());
        this.c = mobiusLoopG;
        mobiusLoopG.b(new y11(this, (byte) 13));
    }

    @Override // p.snc0
    public final void a(qnc0 qnc0Var) {
        if (this.i) {
            return;
        }
        this.c.a(new sz81(qnc0Var.a, qnc0Var.b));
    }

    @Override // p.snc0
    public final zob1 b() {
        return this.k;
    }

    @Override // p.snc0
    public final zob1 c() {
        return this.j;
    }

    @Override // p.snc0
    public final void destroy() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.c.dispose();
        this.b.a(w7x.a, null, null);
    }

    @Override // p.snc0
    public final zob1 getMetadata() {
        return this.l;
    }
}
