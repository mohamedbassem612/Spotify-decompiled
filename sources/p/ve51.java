package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ve51 implements tyq {
    public final /* synthetic */ byte a;
    public final d0r b;
    public final boolean c;
    public final o3r d;
    public final psw e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final mqw i;
    public final rqw t;

    public ve51(uq8 uq8Var, d0r d0rVar, String str, kmj1 kmj1Var, vbs vbsVar) {
        this.a = (byte) 2;
        this.f = uq8Var;
        this.b = d0rVar;
        this.g = str;
        this.h = kmj1Var;
        this.c = vbsVar.g;
        imj1 imj1VarB = kmj1.b(new qdb1(this, (byte) 3));
        xcb1 xcb1Var = xcb1.W0;
        l4r l4rVar = new l4r(b2v.a, 2, xcb1.Y0, new j4r(xcb1Var), xcb1.Z0);
        jd11 jd11Var = rc11.a;
        this.d = w3p1.j(l4rVar, new l4r(new wlu(jd11Var.b(hll.class)), 2, xcb1.a1, new j4r(xcb1.X0), xcb1.b1), imj1VarB.a, imj1VarB.b, new l4r(new wlu(jd11Var.b(mtl.class)), 2, xcb1.c1, new j4r(new qdb1(this, (byte) 1)), xcb1.d1), new l4r(jd0.h, 2, xcb1.e1, new j4r(new qdb1(this, (byte) 2)), rdb1.b), new wcy0(this, (byte) 13));
        this.i = x3p1.n(new qdb1(this, (byte) 0), xcb1.V0, nva1.i, (o8n) null, (iu30) null, 24);
        this.t = new eih1();
        j2i j2iVar = new j2i(1958295413, new u491(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static final /* synthetic */ lzn0 f(ve51 ve51Var) {
        return (lzn0) ve51Var.g;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.t;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return this.d;
            case 1:
                return (f4r) this.h;
            default:
                return this.d;
        }
    }

    public ve51(d0r d0rVar, gw70 gw70Var, lzn0 lzn0Var, boolean z) {
        mch mchVar;
        this.a = (byte) 1;
        this.b = d0rVar;
        this.f = gw70Var;
        this.g = lzn0Var;
        this.c = z;
        jd11 jd11Var = rc11.a;
        o3r o3rVarN = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, p761.Y0, new j4r(p761.c1), p761.Z0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, p761.a1, new j4r(p761.d1), p761.b1), qr51.N0);
        this.d = o3rVarN;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(p761.X0, o3rVarN));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.h = mchVar;
        this.i = h7w.B(p761.W0, null, null, new z821(this, (byte) 24), 6);
        this.t = n3o1.q(this).a(vp51.P0, vp51.Q0);
        j2i j2iVar = new j2i(-937610645, new hg31(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ve51(d0r d0rVar, boolean z, hz5 hz5Var, na9 na9Var, se80 se80Var) {
        this.a = (byte) 0;
        this.b = d0rVar;
        this.c = z;
        this.f = hz5Var;
        this.g = na9Var;
        this.h = se80Var;
        this.d = w3p1.o(new l4r(new xv00(rc11.a.b(w281.class)), 2, ej41.a1, new j4r(ej41.Y0), ej41.b1), ej41.Z0);
        this.i = x3p1.n(new mn41(this, (byte) 10), ej41.X0, jh31.U0, (o8n) null, (iu30) null, 24);
        this.t = new eih1();
        j2i j2iVar = new j2i(-172965235, new hg31(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
