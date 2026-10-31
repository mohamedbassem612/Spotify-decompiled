package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class eaa implements nhl {
    public final til a;

    public eaa(til tilVar) {
        this.a = tilVar;
    }

    @Override // p.nhl
    public final boolean a(vwl1 vwl1Var) {
        return b(vwl1Var) && e(this.a.a());
    }

    @Override // p.nhl
    public final ezc c(gjl gjlVar) {
        return h4p1.f(new w7a(this, (lnm) null, (byte) 3));
    }

    public int d() {
        return 5;
    }

    public boolean e(Object obj) {
        return !((Boolean) obj).booleanValue();
    }
}
