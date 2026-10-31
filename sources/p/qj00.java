package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qj00 {
    public final kn60 a;
    public final dv00 b;
    public final Set c;
    public final huh0 d;
    public final w25 e;
    public final q7r0 f;
    public final yko g;
    public final t2j0 h;
    public final dxz0 i;
    public final lmo j;
    public final String k;
    public snc0 l;
    public LinkedHashMap m;
    public Map n;
    public rzq o;

    public qj00(kn60 kn60Var, dv00 dv00Var, t380 t380Var, huh0 huh0Var, w25 w25Var, q7r0 q7r0Var, yko ykoVar, t2j0 t2j0Var, dxz0 dxz0Var, lmo lmoVar, String str, khc khcVar) {
        this.a = kn60Var;
        this.b = dv00Var;
        this.c = t380Var;
        this.d = huh0Var;
        this.e = w25Var;
        this.f = q7r0Var;
        this.g = ykoVar;
        this.h = t2j0Var;
        this.i = dxz0Var;
        this.j = lmoVar;
        this.k = str;
    }

    public final zob1 a() {
        snc0 snc0Var = this.l;
        if (snc0Var != null) {
            return snc0Var.c();
        }
        u890.C("listContentRuntime");
        throw null;
    }

    public final zob1 b() {
        snc0 snc0Var = this.l;
        if (snc0Var != null) {
            return snc0Var.b();
        }
        u890.C("listContentRuntime");
        throw null;
    }

    public final void c() {
        snc0 snc0Var = this.l;
        if (snc0Var == null) {
            u890.C("listContentRuntime");
            throw null;
        }
        snc0Var.destroy();
        rzq rzqVar = this.o;
        if (rzqVar != null) {
            rzqVar.l();
        }
        this.o = null;
    }

    public final p1d0 d(iac0 iac0Var) {
        LinkedHashMap linkedHashMap = this.m;
        if (linkedHashMap == null) {
            u890.C("elementFactories");
            throw null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), new xvy((vu30) entry.getValue(), this, iac0Var, (byte) 4));
        }
        dmj1 dmj1Var = new dmj1(new bbk1(sqg0.U(linkedHashMap2)), (byte) 2);
        Map map = this.n;
        if (map == null) {
            u890.C("instrumentationEnvironments");
            throw null;
        }
        snc0 snc0Var = this.l;
        if (snc0Var != null) {
            return new p1d0(dmj1Var, map, 250L, new sty(1, snc0Var, snc0.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 19));
        }
        u890.C("listContentRuntime");
        throw null;
    }

    public final void e(xk00 xk00Var, pdy pdyVar, String str) {
        d0r rzqVar;
        w25 w25Var = this.e;
        guh0 guh0Var = w25Var.I() ? new guh0(new o3e0("home_feed-".concat(str), this.d)) : null;
        if (w25Var.h0()) {
            rzqVar = cwl1.C(this.f);
        } else {
            ArrayList arrayListN0 = o7h.N0(this.c, p7h.M(new l2r[]{this.b, this.g.a((String) null, new ro8(this, null, (byte) 12))}));
            ukj0 ukj0Var = w25Var.J() ? new ukj0(this.j.a, new tkj0(this.h, this.i)) : null;
            l2r[] l2rVarArr = (l2r[]) arrayListN0.toArray(new l2r[0]);
            w1k w1kVar = new w1k((l2r[]) Arrays.copyOf(l2rVarArr, l2rVarArr.length));
            if (ukj0Var == null) {
                j3r j3rVar = rzq.y;
                rzqVar = l2p1.f(w1kVar);
            } else {
                rzqVar = new rzq(w1kVar, ukj0Var);
                rzqVar.a(ukj0Var);
                ukj0Var.c = rzqVar;
            }
            this.o = rzqVar;
        }
        dnc0 dnc0Var = new dnc0(rzqVar, (Function0) null, (Function0) null, new cc9(15, 8, 4), guh0Var, 24);
        dnc0Var.b(new gj50(new f0z(pdyVar, this, (byte) 18), true), new f0z(this, xk00Var, (byte) 19));
        cnc0 cnc0VarA = dnc0Var.a();
        this.l = (snc0) cnc0VarA.a.invoke();
        this.m = cnc0VarA.c;
        this.n = cnc0VarA.b;
    }
}
