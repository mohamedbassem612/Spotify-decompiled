package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a840 implements rjm0 {
    public final bbc a = mno1.a(-1, 0, 6);
    public final boolean b;
    public long c;
    public int d;
    public final u5c e;

    public a840(llm llmVar, o8n o8nVar) {
        fn31.T(llmVar, o8nVar, 0, new k53(this, (lnm) null, (byte) 13), 2);
        this.b = true;
        this.e = new u5c(new g030(this, (byte) 3));
    }

    public static final void c(a840 a840Var) {
        int i;
        long jNanoTime = System.nanoTime();
        if (jNanoTime == a840Var.c) {
            i = a840Var.d + 1;
        } else {
            a840Var.c = jNanoTime;
            i = 0;
        }
        a840Var.d = i;
        a840Var.e.b.q(new gc4((byte) 1, jNanoTime + ((long) i)));
    }

    public final m8n A(n8n n8nVar) {
        return ilo1.u(this, n8nVar);
    }

    public final o8n C(n8n n8nVar) {
        return ilo1.z(this, n8nVar);
    }

    public final Object D(iu30 iu30Var, lnm lnmVar) {
        return this.e.D(iu30Var, lnmVar);
    }

    public final Object o(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }

    public final o8n y(o8n o8nVar) {
        return flo1.l(this, o8nVar);
    }
}
