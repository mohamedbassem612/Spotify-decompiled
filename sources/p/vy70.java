package p;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vy70 {
    public final Context a;
    public wy70 b;
    public Object c;
    public drd1 d;
    public yy70 e;
    public boolean f;
    public Map g;
    public o8n h;
    public o8n i;
    public o8n j;
    public jsc k;
    public iu30 l;
    public iu30 m;
    public z291 n;
    public dg41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f129p;
    public Object q;

    public vy70(zy70 zy70Var, Context context) {
        this.a = context;
        this.b = zy70Var.u;
        this.c = zy70Var.b;
        this.d = zy70Var.c;
        this.e = zy70Var.d;
        this.g = zy70Var.e;
        xy70 xy70Var = zy70Var.t;
        this.h = xy70Var.a;
        this.i = xy70Var.b;
        this.j = xy70Var.c;
        this.k = xy70Var.d;
        this.l = xy70Var.e;
        this.m = xy70Var.f;
        this.n = xy70Var.g;
        this.o = xy70Var.h;
        this.f129p = xy70Var.i;
        this.q = zy70Var.s;
    }

    public final zy70 a() {
        kc10 kc10Var;
        Object obj = this.c;
        if (obj == null) {
            obj = eep0.a;
        }
        Object obj2 = obj;
        drd1 drd1Var = this.d;
        yy70 yy70Var = this.e;
        Map mapG = this.g;
        if (u890.j(mapG, Boolean.valueOf(this.f))) {
            mapG = ila0.G(w0h1.k(mapG));
        } else if (mapG == null) {
            hhg1.c();
            return null;
        }
        Map map = mapG;
        wy70 wy70Var = this.b;
        i520 i520Var = wy70Var.a;
        jsc jscVar = wy70Var.e;
        jsc jscVar2 = this.k;
        if (jscVar2 == null) {
            jscVar2 = wy70Var.f;
        }
        jsc jscVar3 = jscVar2;
        jsc jscVar4 = wy70Var.g;
        o8n o8nVar = this.h;
        if (o8nVar == null) {
            o8nVar = wy70Var.b;
        }
        o8n o8nVar2 = o8nVar;
        o8n o8nVar3 = this.i;
        if (o8nVar3 == null) {
            o8nVar3 = wy70Var.c;
        }
        o8n o8nVar4 = o8nVar3;
        o8n o8nVar5 = this.j;
        if (o8nVar5 == null) {
            o8nVar5 = wy70Var.d;
        }
        o8n o8nVar6 = o8nVar5;
        iu30 iu30Var = this.l;
        iu30 iu30Var2 = this.m;
        hf41 hf41Var = hf41.d;
        z291 z291Var = this.n;
        if (z291Var == null) {
            z291Var = wy70Var.k;
        }
        z291 z291Var2 = z291Var;
        dg41 dg41Var = this.o;
        if (dg41Var == null) {
            dg41Var = wy70Var.l;
        }
        dg41 dg41Var2 = dg41Var;
        int i = this.f129p;
        if (i == 0) {
            i = wy70Var.m;
        }
        int i2 = i;
        Object obj3 = this.q;
        if (obj3 instanceof ic10) {
            kc10Var = new kc10(ila0.G(((ic10) obj3).a));
        } else {
            if (!(obj3 instanceof kc10)) {
                hhg1.c();
                return null;
            }
            kc10Var = (kc10) obj3;
        }
        return new zy70(this.a, obj2, drd1Var, yy70Var, map, i520Var, o8nVar2, o8nVar4, o8nVar6, jscVar, jscVar3, jscVar4, iu30Var, iu30Var2, hf41Var, z291Var2, dg41Var2, i2, kc10Var, new xy70(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.f129p), this.b);
    }

    public final ic10 b() {
        Object obj = this.q;
        if (obj instanceof ic10) {
            return (ic10) obj;
        }
        if (!(obj instanceof kc10)) {
            hhg1.c();
            return null;
        }
        ic10 ic10Var = new ic10((kc10) obj);
        this.q = ic10Var;
        return ic10Var;
    }

    public vy70(Context context) {
        this.a = context;
        this.b = wy70.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = b7x.a;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        hf41 hf41Var = hf41.d;
        this.l = hf41Var;
        this.m = hf41Var;
        this.n = null;
        this.o = null;
        this.f129p = 0;
        this.q = kc10.b;
    }
}
