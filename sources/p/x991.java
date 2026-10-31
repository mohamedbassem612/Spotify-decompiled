package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x991 implements xpw {
    public final lqs a;
    public final h991 b;
    public final ngs0 c;
    public final n991 d;
    public final t991 e;
    public final js20 f = x3p1.m(r6x.a, new d061(1, this, x991.class, "createState", "createState(Lcom/spotify/podcastexperience/sleeptimermenuimpl/page/SleepTimerMenuElement$Props;)Lcom/spotify/podcastexperience/sleeptimermenuimpl/page/SleepTimerMenuElement$State;", 0, (byte) 13), new dj71(this, (byte) 26), (o8n) null, (iu30) null, 24);
    public final ia00 g = n3o1.q(this).a(v691.Q0, v691.R0);
    public final psw h;

    public x991(lqs lqsVar, h991 h991Var, ngs0 ngs0Var, n991 n991Var, t991 t991Var) {
        this.a = lqsVar;
        this.b = h991Var;
        this.c = ngs0Var;
        this.d = n991Var;
        this.e = t991Var;
        j2i j2iVar = new j2i(1225238702, new u491(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final w991 e(v991 v991Var) {
        String str = v991Var.a;
        d991 d991Var = v991Var.b;
        iu30 iu30Var = v991Var.c;
        smc0 smc0VarN = k4p1.n();
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.f;
        smc0VarN.add(new qa91(fdg1.k0(5, ngvVar)));
        smc0VarN.add(new qa91(fdg1.k0(10, ngvVar)));
        smc0VarN.add(new qa91(fdg1.k0(15, ngvVar)));
        smc0VarN.add(new qa91(fdg1.k0(30, ngvVar)));
        smc0VarN.add(new qa91(fdg1.k0(45, ngvVar)));
        smc0VarN.add(new qa91(fdg1.k0(1, ngv.g)));
        smc0VarN.add(new ra91(d991Var));
        if (this.b.b()) {
            smc0VarN.add(pa91.a);
        }
        return new w991(str, d991Var, iu30Var, k4p1.k(smc0VarN));
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
