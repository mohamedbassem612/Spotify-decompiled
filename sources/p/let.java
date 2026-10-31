package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class let implements syq {
    public final nsw N0;
    public final f4r X;
    public final js20 Y;
    public final i7h1 Z;
    public final d0r a;
    public final yuw b = new yuw();
    public final eft c = new eft();
    public final y710 d = new y710(new nbc((byte) 7));
    public final dft e = new dft();
    public final e5v0 f = new e5v0();
    public final o3r g;
    public final o3r h;
    public final o3r i;
    public final o3r t;

    public let(d0r d0rVar) {
        this.a = d0rVar;
        jd11 jd11Var = rc11.a;
        o3r o3rVarO = w3p1.o(new l4r(new xv00(jd11Var.b(z070.class)), 2, ket.f, new j4r(z6t.b1), ket.g), z6t.c1);
        this.g = o3rVarO;
        o3r o3rVarO2 = w3p1.o(new l4r(new xv00(jd11Var.b(mdz.class)), 2, ket.h, new j4r(z6t.d1), ket.i), z6t.e1);
        this.h = o3rVarO2;
        o3r o3rVarO3 = w3p1.o(new l4r(hjx0.a, 2, ket.t, new j4r(ket.d), ket.X), ket.e);
        this.i = o3rVarO3;
        o3r o3rVarO4 = w3p1.o(new l4r(new xv00(jd11Var.b(pnt.class)), 2, ket.Y, new j4r(ket.b), ket.Z), ket.c);
        this.t = o3rVarO4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(z6t.X0, o3rVarO));
        arrayList.add(new h4r(z6t.Y0, o3rVarO2));
        arrayList.add(new h4r(z6t.Z0, o3rVarO3));
        arrayList.add(new h4r(z6t.a1, o3rVarO4));
        this.X = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.Y = w3p1.q(new vas(this, (byte) 29), z6t.V0, szr.Y0, (o8n) null, z6t.W0, 8);
        this.Z = new i7h1(v0t.Z, v0t.N0);
        this.N0 = jch0.j(new k9s(this, (byte) 5));
    }

    public final rqw a() {
        return this.Z;
    }

    public final rsw c() {
        return this.N0;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.Y;
    }

    public final f4r getData() {
        return this.X;
    }
}
