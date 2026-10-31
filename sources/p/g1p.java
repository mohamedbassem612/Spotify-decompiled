package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g1p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ g1p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final le7 a(ld7 ld7Var) {
        byte b = this.a;
        fwo fwoVar = this.b;
        switch (b) {
            case 0:
                yxo yxoVar = (yxo) fwoVar.c;
                ae7 ae7Var = (ae7) yxoVar.d;
                Scheduler scheduler = (Scheduler) ae7Var.a.get();
                c8o.l(scheduler);
                md7 md7Var = (md7) yxoVar.b.get();
                Scheduler scheduler2 = (Scheduler) ae7Var.d.get();
                c8o.l(scheduler2);
                py41 py41Var = (py41) ae7Var.m.get();
                c8o.l(py41Var);
                yx11 yx11Var = new yx11(new up41(py41Var, (byte) 1), (byte) 9);
                xrc0 xrc0VarC = ae7Var.c();
                c8o.l(xrc0VarC);
                o241 o241Var = (o241) ae7Var.l.get();
                c8o.l(o241Var);
                kly0 kly0Var = ae7Var.c;
                q8n q8nVar = (q8n) kly0Var.get();
                c8o.l(q8nVar);
                r961 r961Var = new r961(xrc0VarC, o241Var, q8nVar, (byte) 10);
                kly0 kly0Var2 = ae7Var.o;
                sjj0 sjj0Var = (sjj0) kly0Var2.get();
                c8o.l(sjj0Var);
                yo31 yo31Var = new yo31(sjj0Var, (byte) 12);
                sjj0 sjj0Var2 = (sjj0) kly0Var2.get();
                c8o.l(sjj0Var2);
                t4d1 t4d1Var = new t4d1(sjj0Var2, (byte) 17);
                xrc0 xrc0VarC2 = ae7Var.c();
                c8o.l(xrc0VarC2);
                kly0 kly0Var3 = ae7Var.p;
                sx3 sx3Var = (sx3) kly0Var3.get();
                c8o.l(sx3Var);
                f8b f8bVar = (f8b) ae7Var.z.get();
                c8o.l(f8bVar);
                q8n q8nVar2 = (q8n) kly0Var.get();
                c8o.l(q8nVar2);
                ytp0 ytp0Var = new ytp0(xrc0VarC2, sx3Var, f8bVar, q8nVar2);
                Context contextA = ae7Var.a();
                c8o.l(contextA);
                sjj0 sjj0Var3 = (sjj0) kly0Var2.get();
                c8o.l(sjj0Var3);
                z1e0 z1e0Var = new z1e0(r961Var, yo31Var, t4d1Var, ytp0Var, new ow3(contextA, sjj0Var3, (byte) 11));
                lik1 lik1VarD = yxoVar.d();
                sjj0 sjj0Var4 = (sjj0) kly0Var2.get();
                c8o.l(sjj0Var4);
                be7 be7Var = (be7) yxoVar.c;
                String str = be7Var.c;
                c8o.m(str);
                o4e0 o4e0Var = new o4e0(new e821(lik1VarD, sjj0Var4, str, yxoVar.b(), yxoVar.c()), (byte) 0);
                lik1 lik1VarD2 = yxoVar.d();
                String str2 = be7Var.c;
                c8o.m(str2);
                zd1 zd1Var = new zd1(lik1VarD2, str2, yxoVar.c(), (byte) 8);
                sx3 sx3Var2 = (sx3) kly0Var3.get();
                c8o.l(sx3Var2);
                bd7 bd7Var = new bd7(yx11Var, z1e0Var, o4e0Var, zd1Var, new o4e0(sx3Var2, (byte) 29));
                qns0 qns0Var = (qns0) ae7Var.q.get();
                c8o.l(qns0Var);
                rd7 rd7Var = new rd7(scheduler, md7Var, scheduler2, bd7Var, qns0Var);
                Scheduler scheduler3 = (Scheduler) ((ae7) yxoVar.d).b.get();
                c8o.l(scheduler3);
                return new le7(rd7Var, scheduler3, ld7Var);
            default:
                voa voaVar = (voa) fwoVar.c;
                oe7 oe7Var = (oe7) voaVar.b;
                Scheduler scheduler4 = (Scheduler) oe7Var.a.get();
                c8o.l(scheduler4);
                md7 md7Var2 = (md7) ((jly0) voaVar.d).get();
                Scheduler scheduler5 = (Scheduler) oe7Var.d.get();
                c8o.l(scheduler5);
                py41 py41Var2 = (py41) oe7Var.m.get();
                c8o.l(py41Var2);
                yx11 yx11Var2 = new yx11(new up41(py41Var2, (byte) 1), (byte) 9);
                xrc0 xrc0VarC3 = oe7Var.c();
                c8o.l(xrc0VarC3);
                o241 o241Var2 = (o241) oe7Var.l.get();
                c8o.l(o241Var2);
                kly0 kly0Var4 = oe7Var.c;
                q8n q8nVar3 = (q8n) kly0Var4.get();
                c8o.l(q8nVar3);
                r961 r961Var2 = new r961(xrc0VarC3, o241Var2, q8nVar3, (byte) 10);
                kly0 kly0Var5 = oe7Var.f48p;
                sjj0 sjj0Var5 = (sjj0) kly0Var5.get();
                c8o.l(sjj0Var5);
                yo31 yo31Var2 = new yo31(sjj0Var5, (byte) 12);
                sjj0 sjj0Var6 = (sjj0) kly0Var5.get();
                c8o.l(sjj0Var6);
                t4d1 t4d1Var2 = new t4d1(sjj0Var6, (byte) 17);
                xrc0 xrc0VarC4 = oe7Var.c();
                c8o.l(xrc0VarC4);
                kly0 kly0Var6 = oe7Var.q;
                sx3 sx3Var3 = (sx3) kly0Var6.get();
                c8o.l(sx3Var3);
                f8b f8bVar2 = (f8b) oe7Var.z.get();
                c8o.l(f8bVar2);
                q8n q8nVar4 = (q8n) kly0Var4.get();
                c8o.l(q8nVar4);
                ytp0 ytp0Var2 = new ytp0(xrc0VarC4, sx3Var3, f8bVar2, q8nVar4);
                Context contextA2 = oe7Var.a();
                c8o.l(contextA2);
                sjj0 sjj0Var7 = (sjj0) kly0Var5.get();
                c8o.l(sjj0Var7);
                z1e0 z1e0Var2 = new z1e0(r961Var2, yo31Var2, t4d1Var2, ytp0Var2, new ow3(contextA2, sjj0Var7, (byte) 11));
                lik1 lik1VarL = voaVar.l();
                sjj0 sjj0Var8 = (sjj0) kly0Var5.get();
                c8o.l(sjj0Var8);
                pe7 pe7Var = (pe7) voaVar.a;
                String str3 = pe7Var.c;
                c8o.m(str3);
                o4e0 o4e0Var2 = new o4e0(new e821(lik1VarL, sjj0Var8, str3, voaVar.b(), voaVar.c()), (byte) 0);
                lik1 lik1VarL2 = voaVar.l();
                String str4 = pe7Var.c;
                c8o.m(str4);
                zd1 zd1Var2 = new zd1(lik1VarL2, str4, voaVar.c(), (byte) 8);
                sx3 sx3Var4 = (sx3) kly0Var6.get();
                c8o.l(sx3Var4);
                bd7 bd7Var2 = new bd7(yx11Var2, z1e0Var2, o4e0Var2, zd1Var2, new o4e0(sx3Var4, (byte) 29));
                qns0 qns0Var2 = (qns0) oe7Var.r.get();
                c8o.l(qns0Var2);
                rd7 rd7Var2 = new rd7(scheduler4, md7Var2, scheduler5, bd7Var2, qns0Var2);
                Scheduler scheduler6 = (Scheduler) ((oe7) voaVar.b).b.get();
                c8o.l(scheduler6);
                return new le7(rd7Var2, scheduler6, ld7Var);
        }
    }
}
