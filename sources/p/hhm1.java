package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hhm1 implements qy70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hhm1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                jbq jbqVar = (jbq) obj3;
                shv0 shv0Var = (shv0) obj;
                daq daqVar = jbqVar.a;
                teq teqVar = jbqVar.b;
                shv0Var.getClass();
                ((rhv0) obj2).getClass();
                Intent intent = shv0Var.a;
                c8o.l(intent);
                String str = shv0Var.b;
                c8o.l(str);
                xrc0 xrc0Var = (xrc0) teqVar.e1.get();
                c8o.l(xrc0Var);
                iyc0 iyc0Var = (iyc0) teqVar.g1.get();
                c8o.l(iyc0Var);
                nfa0 nfa0Var = (nfa0) daqVar.b2.get();
                c8o.l(nfa0Var);
                me30 me30Var = (me30) daqVar.w7.get();
                c8o.l(me30Var);
                q8n q8nVar = (q8n) daqVar.V2.get();
                c8o.l(q8nVar);
                return new ghm1(intent, str, xrc0Var, iyc0Var, nfa0Var, me30Var, q8nVar);
            default:
                qop qopVar = (qop) obj;
                yzp yzpVar = new yzp(((xzp) obj3).a);
                qopVar.getClass();
                ((gl90) obj2).getClass();
                return new bvm(qopVar.d(), (hsq) new k2q(yzpVar, qopVar).c);
        }
    }

    public void e(ry70 ry70Var) {
        q450 q450Var = (q450) this.b;
        q450Var.getClass();
        try {
            zx70 zx70VarC = ry70Var.c();
            if (zx70VarC != null) {
                ((zxl1) q450Var.e).i(zx70VarC);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
            j2h1.p("ZslControlImpl");
        }
    }
}
