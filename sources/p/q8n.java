package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class q8n extends r6 implements m8n {
    public static final p8n b = new p8n(wdu0.Y, new u1c((byte) 13));

    public q8n() {
        super(wdu0.Y);
    }

    @Override // p.r6, p.o8n
    public final /* bridge */ m8n A(n8n n8nVar) {
        return f6o1.l(this, n8nVar);
    }

    @Override // p.r6, p.o8n
    public final /* bridge */ o8n C(n8n n8nVar) {
        return f6o1.s(this, n8nVar);
    }

    public boolean J(o8n o8nVar) {
        return !(this instanceof bhh1);
    }

    public q8n M(int i) {
        buo1.u(i);
        return new kgc0(this, i);
    }

    public void h(o8n o8nVar, Runnable runnable) {
        g9n.d.h(o8nVar, runnable);
    }

    public void q(o8n o8nVar, Runnable runnable) {
        hr80.x(this, o8nVar, runnable);
    }

    public String toString() {
        return v8r.l(this) + '@' + v8r.n(this);
    }
}
