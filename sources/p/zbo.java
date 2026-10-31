package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zbo implements xpw {
    public final di4 a;
    public final cco b;
    public final em0 c;
    public final iu30 d;
    public final res e;
    public final qj0 f;
    public final bpb1 g;
    public final js20 h;
    public final ybo i;
    public final psw t;

    public zbo(urk0 urk0Var, di4 di4Var, hnp hnpVar, inp inpVar, jnp jnpVar, cco ccoVar, em0 em0Var, r1t r1tVar, iu30 iu30Var, o8n o8nVar) {
        res resVar;
        this.a = di4Var;
        this.b = ccoVar;
        this.c = em0Var;
        this.d = iu30Var;
        switch (hnpVar.a) {
            case 0:
                urk0 urk0Var2 = new urk0((byte) 4);
                kop kopVar = (kop) hnpVar.b.c;
                di4 di4VarD = kopVar.d();
                joe joeVarR0 = kopVar.a.R0();
                c8o.l(joeVarR0);
                resVar = new res(urk0Var2, di4VarD, joeVarR0, iu30Var);
                break;
            default:
                urk0 urk0Var3 = new urk0((byte) 4);
                apq apqVar = (apq) hnpVar.b.c;
                di4 di4VarD2 = apqVar.d();
                joe joeVarR1 = apqVar.a.R0();
                c8o.l(joeVarR1);
                resVar = new res(urk0Var3, di4VarD2, joeVarR1, iu30Var);
                break;
        }
        this.e = resVar;
        this.f = jnpVar.a(inpVar.a(r1tVar, iu30Var));
        this.g = gio1.b((Object) null);
        this.h = a4p1.h(new xbo(this, (byte) 0), new ptj(1, this, zbo.class, "defaultStateFromProps", "defaultStateFromProps(Lcom/spotify/search/elements/secondstep/crossword/crosswordoverviewelement/CrosswordOverviewElement$Props;)Lcom/spotify/search/elements/secondstep/crossword/crosswordoverviewelement/CrosswordOverviewElement$State;", 0, (byte) 18), wmn.e1, o8nVar, new xbo(this, (byte) 1));
        this.i = new ybo(n3o1.q(this).a(new z63(urk0Var, (byte) 13), cnn.Z0), (byte) 0);
        j2i j2iVar = new j2i(-1974159152, new bfm(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
