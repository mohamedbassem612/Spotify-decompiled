package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qz80 implements rjm0 {
    public final c9n a;
    public final u5c b = new u5c(new nd70(this, (byte) 25));
    public final Object c = new Object();
    public byte d = 5;
    public long e;
    public ohd f;

    public qz80(ove1 ove1Var) {
        this.a = ove1Var;
    }

    public static final void b(qz80 qz80Var, long j) {
        qz80Var.b.b.q(new gc4((byte) 1, j));
        synchronized (qz80Var.c) {
            qz80Var.e = j;
        }
    }

    public final m8n A(n8n n8nVar) {
        return ilo1.u(this, n8nVar);
    }

    public final o8n C(n8n n8nVar) {
        return ilo1.z(this, n8nVar);
    }

    public final Object D(iu30 iu30Var, lnm lnmVar) {
        return this.b.D(iu30Var, lnmVar);
    }

    public final void c() {
        synchronized (this.c) {
            ohd ohdVar = this.f;
            if (ohdVar != null) {
                ohdVar.q((Throwable) null);
            }
        }
    }

    public final Object o(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }

    public final o8n y(o8n o8nVar) {
        return flo1.l(this, o8nVar);
    }
}
