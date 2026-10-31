package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vzr0 implements f9e0 {
    public final long a;
    public final n3r b;
    public final byte c;
    public final rsb1 d;
    public final uzr0 e;
    public volatile Object f;

    public vzr0(tzr0 tzr0Var) {
        this.d = new rsb1((o2r) tzr0Var.b);
        this.b = (n3r) tzr0Var.c;
        this.c = (byte) 4;
        this.e = (uzr0) tzr0Var.d;
        this.a = d2e0.h.getAndIncrement();
    }

    @Override // p.f9e0
    public final void a() {
        this.d.b = 0L;
        g3r g3rVar = new g3r(this.d, this.b);
        try {
            g3rVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.d(uri, g3rVar);
        } finally {
            zoi1.h(g3rVar);
        }
    }

    @Override // p.f9e0
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vzr0(o2r o2rVar, n3r n3rVar, int i, uzr0 uzr0Var) {
        this.d = new rsb1(o2rVar);
        this.b = n3rVar;
        this.c = i;
        this.e = uzr0Var;
        this.a = d2e0.h.getAndIncrement();
    }
}
