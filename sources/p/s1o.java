package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s1o implements syq {
    public final ia00 X;
    public final js20 Y;
    public final nsw Z;
    public final hjc a;
    public final pp b;
    public final hjc c;
    public final lzn0 d;
    public final z710 e;
    public final d0r f;
    public final o3r g;
    public final o3r h;
    public final o3r i;
    public final f4r t;

    public s1o(hjc hjcVar, pp ppVar, hjc hjcVar2, lzn0 lzn0Var, z710 z710Var, d0r d0rVar) {
        this.a = hjcVar;
        this.b = ppVar;
        this.c = hjcVar2;
        this.d = lzn0Var;
        this.e = z710Var;
        this.f = d0rVar;
        jd11 jd11Var = rc11.a;
        o3r o3rVarO = w3p1.o(new l4r(new xv00(jd11Var.b(o2o.class)), 2, rwn.e1, new j4r(rwn.c1), r1o.b), rwn.d1);
        this.g = o3rVarO;
        o3r o3rVarO2 = w3p1.o(new l4r(new wlu(jd11Var.b(xkk1.class)), 2, r1o.c, new j4r(r1o.g), r1o.d), r1o.h);
        this.h = o3rVarO2;
        o3r o3rVarO3 = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 2, r1o.e, new j4r(rwn.a1), r1o.f), rwn.b1);
        this.i = o3rVarO3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVarO);
        arrayList.add(o3rVarO2);
        arrayList.add(o3rVarO3);
        this.t = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.X = n3o1.q(this).a(cnn.t, cnn.X);
        this.Y = w3p1.q(new q1o(this, (byte) 0), rwn.Z0, new sqk(this, (byte) 11), (o8n) null, new q1o(this, (byte) 1), 8);
        this.Z = jch0.j(new cml(this, (byte) 16));
    }

    public final rqw a() {
        return this.X;
    }

    public final rsw c() {
        return this.Z;
    }

    public final d0r e() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.Y;
    }

    public final f4r getData() {
        return this.t;
    }
}
