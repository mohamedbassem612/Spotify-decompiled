package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y6a implements s4j0 {
    public final e4j0 a;
    public final q8n b;
    public final llm c;
    public final bpb1 d;
    public final xe01 e;
    public final x6a f;

    public y6a(e4j0 e4j0Var, q8n q8nVar) {
        this.a = e4j0Var;
        this.b = q8nVar;
        this.c = smo1.e(ha71.A(op71.f(), q8nVar));
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.d = bpb1VarB;
        xe01 xe01VarH = d5p1.h(bpb1VarB);
        this.e = xe01VarH;
        this.f = new x6a(xe01VarH, (byte) 0);
    }

    public static /* synthetic */ z7a d(y6a y6aVar, p5a p5aVar, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return y6aVar.b(p5aVar, z, x2j0.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r10 == r12) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.z7a r15, p.d3j0 r16, p.onm r17) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y6a.a(p.z7a, p.d3j0, p.onm):java.lang.Object");
    }

    public final z7a b(p5a p5aVar, boolean z, y2j0 y2j0Var) {
        v6a v6aVar = new v6a(1, this, y6a.class, "dispose", "dispose(Lcom/spotify/banner/impl/BannerTicketImpl;)V", 0, (byte) 0);
        llm llmVarE = smo1.e(ha71.A(op71.f(), this.b));
        z7a z7aVar = new z7a(p5aVar, llmVarE, v6aVar);
        c921.y(llmVarE, (o8n) null, 0, new t6a(this, z7aVar, z, y2j0Var, null), 3);
        return z7aVar;
    }

    public final mr20 c() {
        return this.f;
    }
}
