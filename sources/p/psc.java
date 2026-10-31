package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class psc {
    public final xvo a;
    public final qsc b;

    public psc(xvo xvoVar, qsc qscVar) {
        this.a = xvoVar;
        this.b = qscVar;
    }

    public final String a() {
        return this.b.a(((Boolean) this.a.a(true).firstOrError().blockingGet()).booleanValue());
    }
}
