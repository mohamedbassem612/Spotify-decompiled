package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qfv implements syq {
    public final /* synthetic */ byte a;
    public final d0r b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qfv(d0r d0rVar, y1c1 y1c1Var, n6r0 n6r0Var) {
        this.a = (byte) 1;
        this.b = d0rVar;
        this.c = w3p1.n(new l4r(new wlu(rc11.a.b(jo70.class)), 2, qfo0.d1, new j4r(qfo0.b1), qfo0.e1), new l4r(jd0.z, 2, cmo0.b, new j4r(qfo0.c1), cmo0.c), ofo0.i);
        this.d = new idd1(new s2n0((Object) this, (Object) y1c1Var, (byte) 23));
        this.e = jch0.j(n3o0.Q0);
        this.f = new emo0(n6r0Var, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (eih1) this.e;
            case 1:
                return (emo0) this.f;
            case 2:
                return (rqw) this.c;
            default:
                return (eih1) this.e;
        }
    }

    public final rsw c() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (osw) obj;
            case 1:
                return (nsw) this.e;
            case 2:
                return (osw) obj;
            default:
                return (nsw) this.c;
        }
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (js20) this.d;
            case 1:
                return (mqw) ((idd1) this.d).getValue();
            case 2:
                return (mqw) this.e;
            default:
                return (js20) this.d;
        }
    }

    public final f4r getData() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (o3r) obj;
            case 1:
                return (o3r) obj;
            case 2:
                return (f4r) this.d;
            default:
                return i13.A;
        }
    }

    public qfv(d0r d0rVar, int i) {
        this.a = (byte) 0;
        this.b = d0rVar;
        this.d = w3p1.q(new ofv(this, (byte) 0), new ofv(this, (byte) 1), fdv.c, (o8n) null, (iu30) null, 24);
        this.e = new eih1();
        this.f = new osw(new yfv(i, (byte) 0));
        o6v o6vVar = o6v.Q0;
        this.c = w3p1.o(new l4r(hjx0.a, 2, o6v.U0, new j4r(o6vVar), o6v.W0), o6v.S0);
    }

    public qfv(tyq tyqVar, ViewGroup.LayoutParams layoutParams, Object obj) {
        this.a = (byte) 2;
        this.b = tyqVar.e();
        this.d = tyqVar.getData();
        this.e = tyqVar.getBehavior();
        this.c = tyqVar.a();
        this.f = f6o1.B(tyqVar.c(), layoutParams, obj);
    }

    public qfv(d0r d0rVar, lnt lntVar, n9c n9cVar, lnt lntVar2, iac0 iac0Var) {
        this.a = (byte) 3;
        this.b = d0rVar;
        this.f = lntVar;
        this.d = w0o1.i(new tak1(this, (byte) 13), u5l1.c, (ju70) null, 12);
        this.e = new eih1();
        this.c = jch0.j(new d34(this, iac0Var, n9cVar, lntVar2, (byte) 10));
    }
}
