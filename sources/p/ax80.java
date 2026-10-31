package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ax80 implements nw80 {
    public final llm X;
    public final ynb0 a;
    public final mpa1 b;
    public final mr20 c;
    public final xjp d;
    public final yjp e;
    public final zeu f;
    public final au81 g;
    public final Flowable h;
    public final bpb1 i;
    public final bpb1 t;

    public ax80(ynb0 ynb0Var, mpa1 mpa1Var, mr20 mr20Var, xjp xjpVar, yjp yjpVar, zeu zeuVar, au81 au81Var, Flowable flowable, llm llmVar) {
        this.a = ynb0Var;
        this.b = mpa1Var;
        this.c = mr20Var;
        this.d = xjpVar;
        this.e = yjpVar;
        this.f = zeuVar;
        this.g = au81Var;
        this.h = flowable;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.i = bpb1VarB;
        this.t = bpb1VarB;
        o8n o8nVar = llmVar.a;
        this.X = smo1.e(o8nVar.y(guo1.A(op71.z(o8nVar))).y(new zw80(this)));
        c921.y(llmVar, (o8n) null, 0, new no70(this, (lnm) null, (byte) 6), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r7 == r5) goto L29;
     */
    @Override // p.nw80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.lnm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.yw80
            if (r0 == 0) goto L13
            r0 = r7
            p.yw80 r0 = (p.yw80) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            p.yw80 r0 = new p.yw80
            p.onm r7 = (p.onm) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L61
            goto L5e
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L33:
            p.hm5.M(r7)     // Catch: java.lang.Exception -> L61
            goto L45
        L37:
            p.hm5.M(r7)
            io.reactivex.rxjava3.core.Flowable r7 = r6.h     // Catch: java.lang.Exception -> L61
            r0.c = r4     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = p.u890.m(r7, r3, r0)     // Catch: java.lang.Exception -> L61
            if (r7 != r5) goto L45
            goto L5d
        L45:
            com.spotify.player.model.PlayerState r7 = (com.spotify.player.model.PlayerState) r7     // Catch: java.lang.Exception -> L61
            if (r7 == 0) goto L53
            com.spotify.player.model.ContextTrack r7 = p.kbb.B(r7)     // Catch: java.lang.Exception -> L61
            if (r7 == 0) goto L53
            java.lang.String r2 = r7.uri()     // Catch: java.lang.Exception -> L61
        L53:
            p.au81 r6 = r6.g     // Catch: java.lang.Exception -> L61
            r0.c = r3     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = r6.c(r2, r0)     // Catch: java.lang.Exception -> L61
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L61
            return r7
        L61:
            p.o8n r6 = r0.getContext()
            p.op71.x(r6)
            p.z6x r6 = p.z6x.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ax80.a(p.lnm):java.lang.Object");
    }

    @Override // p.nw80
    public final bx80 b() {
        chp chpVar = this.e.a;
        Flowable flowableF = ip31.a(chp.b(chpVar)).f();
        c8o.l(flowableF);
        g0l g0lVarD = ip31.a(chp.b(chpVar)).d();
        c8o.l(g0lVarD);
        return new ww80(this, new d9e1(flowableF, g0lVarD, chp.b(chpVar).x(), chp.b(chpVar).o(), this.X));
    }

    @Override // p.nw80
    public final zob1 c() {
        return this.t;
    }

    @Override // p.nw80
    public final cx80 d(g38 g38Var) {
        if (g38Var == null) {
            g38Var = (g38) this.a.get();
        }
        ty60 ty60VarA = this.b.a(g38Var);
        xjp xjpVar = this.d;
        xjpVar.getClass();
        chp chpVar = xjpVar.a;
        st60 st60VarU = chp.b(chpVar).u();
        jpu jpuVarN = chp.b(chpVar).n();
        phi0 phi0VarX = chp.b(chpVar).x();
        Flowable flowableF = ip31.a(chp.b(chpVar)).f();
        c8o.l(flowableF);
        g0l g0lVarD = ip31.a(chp.b(chpVar)).d();
        c8o.l(g0lVarD);
        b1y b1yVarG = ip31.a(chp.b(chpVar)).g();
        c8o.l(b1yVarG);
        zeu zeuVarO = chp.b(chpVar).o();
        wen0 wen0VarE = ip31.a(chp.b(chpVar)).e();
        c8o.l(wen0VarE);
        return new xw80(this, new wok1(st60VarU, jpuVarN, phi0VarX, flowableF, g0lVarD, b1yVarG, zeuVarO, wen0VarE, ty60VarA, this.X));
    }

    @Override // p.nw80
    public final void e(ou80 ou80Var) {
        this.f.v(ou80Var);
    }
}
