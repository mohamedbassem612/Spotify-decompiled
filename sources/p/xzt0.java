package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xzt0 implements Runnable {
    public final /* synthetic */ c0u0 a;
    public final /* synthetic */ r4t b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ rm5 f;

    public xzt0(c0u0 c0u0Var, r4t r4tVar, int i, long j, long j2, rm5 rm5Var) {
        this.a = c0u0Var;
        this.b = r4tVar;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = rm5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rm5 rm5Var = this.f;
        try {
            this.a.R(this.b, this.c, this.d, this.e);
        } finally {
            rm5Var.H();
        }
    }
}
