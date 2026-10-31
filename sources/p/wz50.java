package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wz50 implements syq {
    public final js20 X;
    public final eih1 Y;
    public final kjv Z;
    public final d0r a;
    public final xzq b;
    public final maa c;
    public final List d;
    public final maa e;
    public final boolean f;
    public final boolean g;
    public final lun h;
    public final o3r i;
    public final f4r t;

    public wz50(lzn0 lzn0Var, xfx xfxVar, jus jusVar, d0r d0rVar, xzq xzqVar, maa maaVar, List list, maa maaVar2, boolean z, boolean z2) {
        this.a = d0rVar;
        this.b = xzqVar;
        this.c = maaVar;
        this.d = list;
        this.e = maaVar2;
        this.f = z;
        this.g = z2;
        this.h = new lun(xfxVar.d, jusVar.a(), (byte) 1);
        jd11 jd11Var = rc11.a;
        o3r o3rVarN = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, aw50.X, new j4r(aw50.i), aw50.Y), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, aw50.Z, new j4r(aw50.t), aw50.N0), oq50.g);
        this.i = o3rVarN;
        g4r g4rVar = new g4r((byte) 0);
        g4rVar.a.add(o3rVarN);
        f3o1.g(g4rVar, null);
        f3o1.g(g4rVar, xzqVar);
        f3o1.g(g4rVar, maaVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f3o1.g(g4rVar, (maa) it.next());
        }
        f3o1.g(g4rVar, this.e);
        this.t = g4rVar.k();
        this.X = w0o1.i(new vz50(this, (byte) 0), oq50.f, null, 12);
        this.Y = new eih1();
        this.Z = lnn1.g(new vz50(this, (byte) 1), new qc30(lzn0Var, (byte) 1), new vz50(this, (byte) 2));
    }

    public final rqw a() {
        return this.Y;
    }

    public final rsw c() {
        return this.Z;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.X;
    }

    public final f4r getData() {
        return this.t;
    }
}
