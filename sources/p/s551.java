package p;

import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s551 implements snc0 {
    public final snc0 a;
    public final d0r b;
    public final LinkedHashMap c;
    public final y751 d;
    public final hc51 e;
    public final llm f;
    public final bpb1 g;

    public s551(snc0 snc0Var, d0r d0rVar, LinkedHashMap linkedHashMap, y751 y751Var, hc51 hc51Var, q8n q8nVar) {
        this.a = snc0Var;
        this.b = d0rVar;
        this.c = linkedHashMap;
        this.d = y751Var;
        this.e = hc51Var;
        llm llmVarH = us71.h(q8nVar);
        this.f = llmVarH;
        this.g = gio1.b((Object) null);
        fn31.T(llmVarH, (o8n) null, 0, new ic01((Object) this, (lnm) null, (byte) 29), 3);
    }

    public final void a(qnc0 qnc0Var) {
        bpb1 bpb1Var = this.g;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, qnc0Var);
        this.a.a(qnc0Var);
    }

    public final zob1 b() {
        return this.a.b();
    }

    public final zob1 c() {
        return this.a.c();
    }

    public final void destroy() {
        smo1.p(this.f, (CancellationException) null);
        this.a.destroy();
    }

    public final zob1 getMetadata() {
        return this.a.getMetadata();
    }
}
