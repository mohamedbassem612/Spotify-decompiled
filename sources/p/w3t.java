package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w3t implements np60 {
    public final w25 a;
    public final kly0 b;
    public final mp60 c;

    public w3t(w25 w25Var, kly0 kly0Var, mp60 mp60Var) {
        this.a = w25Var;
        this.b = kly0Var;
        this.c = mp60Var;
    }

    @Override // p.np60
    public final Object a(String str, boolean z, String str2, ice0 ice0Var, onm onmVar) {
        return (this.a.f() ? (np60) this.b.get() : this.c).a(str, z, str2, ice0Var, onmVar);
    }

    @Override // p.np60
    public final Object b(String str, boolean z, ice0 ice0Var, boolean z2, boolean z3, String str2, onm onmVar) {
        return (this.a.f() ? (np60) this.b.get() : this.c).b(str, z, ice0Var, z2, z3, str2, onmVar);
    }
}
