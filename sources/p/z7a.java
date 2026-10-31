package p;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z7a {
    public static final AtomicLong i = new AtomicLong(Long.MIN_VALUE);
    public final p5a a;
    public final llm b;
    public final v6a c;
    public final long d = i.getAndIncrement();
    public final bpb1 e;
    public final any f;
    public boolean g;
    public boolean h;

    public z7a(p5a p5aVar, llm llmVar, v6a v6aVar) {
        this.a = p5aVar;
        this.b = llmVar;
        this.c = v6aVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.e = bpb1VarB;
        this.f = f5p1.n(bpb1VarB);
    }

    public final void a() {
        if (this.h) {
            return;
        }
        smo1.q(this.b);
        this.h = true;
        this.c.invoke(this);
    }

    public final String toString() {
        return gvg.f(this.d, "BannerTicketImpl[id=", "]");
    }
}
