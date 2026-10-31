package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class szj implements xpw {
    public final /* synthetic */ byte a = 1;
    public final xpw b;
    public final Object c;

    public szj(kpg0 kpg0Var, rqw rqwVar) {
        this.b = kpg0Var;
        this.c = new azg(rqwVar, (byte) 2);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return (azg) this.c;
        }
    }

    public final String b() {
        byte b = this.a;
        kpg0 kpg0Var = this.b;
        switch (b) {
            case 0:
                return ((w460) kpg0Var).b();
            default:
                return kpg0Var.a.b();
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                return new rzj(this, (byte) 0);
            default:
                return this.b.a.c();
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        kpg0 kpg0Var = this.b;
        switch (b) {
            case 0:
                return ((w460) kpg0Var).d;
            default:
                return kpg0Var.getBehavior();
        }
    }

    public szj(w460 w460Var, zzq0 zzq0Var) {
        this.b = w460Var;
        this.c = zzq0Var;
    }
}
