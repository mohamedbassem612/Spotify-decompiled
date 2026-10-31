package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qe31 implements tyq {
    public final /* synthetic */ byte a;
    public final d0r b;
    public final gw70 c;
    public final lzn0 d;
    public final o3r e;
    public final f4r f;
    public final ljm0 g;
    public final ia00 h;
    public final psw i;

    public qe31(byte b, d0r d0rVar, gw70 gw70Var, lzn0 lzn0Var) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = d0rVar;
                this.c = gw70Var;
                this.d = lzn0Var;
                jd11 jd11Var = rc11.a;
                o3r o3rVarM = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, hz51.Z0, new j4r(hz51.b1), hz51.a1), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, hz51.V0, new j4r(hz51.c1), hz51.W0), new l4r(new xv00(jd11Var.b(zc8.class)), 2, hz51.X0, new j4r(hz51.d1), hz51.Y0), krz0.Y0);
                this.e = o3rVarM;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new h4r((iu30) hz51.U0, (f4r) o3rVarM));
                this.f = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
                this.g = h7w.B(hz51.T0, (o8n) null, (iu30) null, new z821(this, (byte) 23), 6);
                this.h = n3o1.q(this).a(vp51.N0, vp51.O0);
                j2i j2iVar = new j2i(-1730899932, new hg31(this, (byte) 23), true);
                ien0 ien0Var = qsw.a;
                this.i = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = d0rVar;
                this.c = gw70Var;
                this.d = lzn0Var;
                jd11 jd11Var2 = rc11.a;
                o3r o3rVarM2 = w3p1.m(new l4r(new xv00(jd11Var2.b(zc8.class)), 1, oe31.b, new j4r(xt21.X0), oe31.c), new l4r(new xv00(jd11Var2.b(jo70.class)), 2, xt21.b1, new j4r(xt21.Y0), xt21.c1), new l4r(new xv00(jd11Var2.b(xkk1.class)), 2, xt21.d1, new k4r(xt21.Z0, lo70.b), xt21.e1), krz0.Z);
                this.e = o3rVarM2;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new h4r((iu30) xt21.a1, (f4r) o3rVarM2));
                this.f = arrayList2.isEmpty() ? i13.j : arrayList2.size() == 1 ? (f4r) o7h.q0(arrayList2) : new mch(arrayList2);
                this.g = h7w.B(xt21.W0, (o8n) null, (iu30) null, new z821(this, (byte) 6), 6);
                this.h = n3o1.q(this).a(ve21.T0, ve21.U0);
                j2i j2iVar2 = new j2i(1227036377, new dr01(this, (byte) 28), true);
                ien0 ien0Var2 = qsw.a;
                this.i = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.h;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.i;
    }

    public final d0r e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.g;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }
}
