package p;

import com.spotify.mobius.EventSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j6d1 implements xpw {
    public final c6d1 a;
    public final e7m0 b;
    public final ia00 c;
    public final psw d;

    public j6d1(c6d1 c6d1Var, EventSource eventSource, uxo uxoVar) {
        x5d1 x5d1Var;
        this.a = c6d1Var;
        g7d1 g7d1Var = g7d1.m;
        gp71 gp71Var = gp71.l;
        switch (uxoVar.a) {
            case 0:
                wxo wxoVar = (wxo) uxoVar.b.c;
                f62 f62Var = (f62) wxoVar.b;
                ao0 ao0VarV0 = f62Var.V0();
                c8o.l(ao0VarV0);
                t2j0 t2j0VarD1 = f62Var.d1();
                c8o.l(t2j0VarD1);
                esa1 esa1Var = new esa1(ao0VarV0, t2j0VarD1, (byte) 18);
                t2j0 t2j0VarD2 = ((f62) wxoVar.b).d1();
                c8o.l(t2j0VarD2);
                cof0 cof0Var = new cof0(t2j0VarD2);
                f62 f62Var2 = (f62) wxoVar.b;
                a1r0 a1r0VarC = f62Var2.C();
                c8o.l(a1r0VarC);
                q8n q8nVarE = f62Var2.e();
                c8o.l(q8nVarE);
                hp91 hp91Var = new hp91(a1r0VarC, q8nVarE, (byte) 27);
                il0 il0VarG1 = ((f62) wxoVar.b).g1();
                q8n q8nVarD = ((f62) wxoVar.b).d();
                c8o.l(q8nVarD);
                x5d1Var = new x5d1(c6d1Var, esa1Var, cof0Var, hp91Var, il0VarG1, q8nVarD);
                break;
            case 1:
                nwp nwpVar = (nwp) uxoVar.b.c;
                em0 em0Var = nwpVar.a;
                ao0 ao0VarH = em0Var.h();
                c8o.l(ao0VarH);
                t2j0 t2j0VarI0 = em0Var.i0();
                c8o.l(t2j0VarI0);
                esa1 esa1Var2 = new esa1(ao0VarH, t2j0VarI0, (byte) 18);
                t2j0 t2j0VarI1 = nwpVar.a.i0();
                c8o.l(t2j0VarI1);
                cof0 cof0Var2 = new cof0(t2j0VarI1);
                em0 em0Var2 = nwpVar.a;
                a1r0 a1r0VarA0 = em0Var2.A0();
                c8o.l(a1r0VarA0);
                q8n q8nVarG0 = em0Var2.g0();
                c8o.l(q8nVarG0);
                hp91 hp91Var2 = new hp91(a1r0VarA0, q8nVarG0, (byte) 27);
                il0 il0VarL = f42.l((qxo) ((daq) nwpVar.a.b).a.a.kb.get());
                q8n q8nVarB0 = nwpVar.a.b0();
                c8o.l(q8nVarB0);
                x5d1Var = new x5d1(c6d1Var, esa1Var2, cof0Var2, hp91Var2, il0VarL, q8nVarB0);
                break;
            default:
                thq thqVar = uxoVar.b;
                v5q v5qVar = thqVar.c;
                daq daqVar = v5qVar.b;
                esa1 esa1Var3 = new esa1((ao0) daqVar.Hk.get(), (t2j0) daqVar.f2.get(), (byte) 18);
                cof0 cof0Var3 = new cof0((t2j0) v5qVar.b.f2.get());
                hp91 hp91Var3 = new hp91((a1r0) v5qVar.k1.get(), (q8n) v5qVar.b.V2.get(), (byte) 27);
                daq daqVar2 = thqVar.b;
                x5d1Var = new x5d1(c6d1Var, esa1Var3, cof0Var3, hp91Var3, f42.l((qxo) daqVar2.a.a.kb.get()), (q8n) daqVar2.E1.get());
                break;
        }
        this.b = sbl.z(g7d1Var, gp71Var, x5d1Var, g6d1.a, new jfh(eventSource, (byte) 2));
        this.c = n3o1.q(this).a(i6d1.b, i6d1.c);
        j2i j2iVar = new j2i(-1004262455, new vsb1(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
