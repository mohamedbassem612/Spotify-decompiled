package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aso implements wpw {
    public final mqw a;
    public final rqw b;
    public final osw c;
    public final String d;

    public aso(wpw wpwVar, iu30 iu30Var) {
        this.a = wpwVar.getBehavior();
        this.b = wpwVar.a();
        this.c = new osw(new wh(wpwVar.c(), iu30Var, (byte) 8));
        this.d = wpwVar.b();
    }

    public final rqw a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final rsw c() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
