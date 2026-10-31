package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wsf {
    public final c9c0 a;
    public final b0a0 b;
    public final hur c;
    public final kkp d;

    public wsf(c9c0 c9c0Var, b0a0 b0a0Var, hur hurVar, kkp kkpVar) {
        this.a = c9c0Var;
        this.b = b0a0Var;
        this.c = hurVar;
        this.d = kkpVar;
    }

    public final mr20 a(ssf ssfVar, u9c0 u9c0Var) {
        d1c d1cVar = new d1c(ssfVar, this, u9c0Var, (byte) 14);
        boolean zM = ((no4) this.b.a.get()).m();
        if (zM) {
            return (mr20) d1cVar.invoke();
        }
        if (!zM) {
            return new huz((Object) null, (byte) 10);
        }
        eg.o();
        return null;
    }
}
