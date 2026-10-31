package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xol1 {
    public final cjl a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public byte o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f143p;

    public xol1(xol1 xol1Var) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = (byte) 0;
        this.f143p = new HashMap();
        this.a = xol1Var.a;
        this.b = xol1Var.b;
        this.c = xol1Var.c;
        a(xol1Var);
    }

    public final void a(xol1 xol1Var) {
        if (xol1Var == null) {
            return;
        }
        this.d = xol1Var.d;
        this.e = xol1Var.e;
        this.f = xol1Var.f;
        this.g = xol1Var.g;
        this.h = xol1Var.h;
        this.i = xol1Var.i;
        this.j = xol1Var.j;
        this.k = xol1Var.k;
        this.l = xol1Var.l;
        this.m = xol1Var.m;
        this.n = xol1Var.n;
        this.o = xol1Var.o;
        HashMap map = this.f143p;
        map.clear();
        for (zro zroVar : xol1Var.f143p.values()) {
            map.put(zroVar.b(), zroVar.a());
        }
    }

    public xol1(cjl cjlVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = (byte) 0;
        this.f143p = new HashMap();
        this.a = cjlVar;
    }
}
