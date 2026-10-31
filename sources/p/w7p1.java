package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w7p1 extends fzo1 {
    public final /* synthetic */ z9p1 h;

    public w7p1(z9p1 z9p1Var) {
        this.h = z9p1Var;
    }

    @Override // p.fzo1
    public final String a() {
        f1p1 f1p1Var = (f1p1) this.h.a.get();
        return f1p1Var == null ? "Completer object has been garbage collected, future will fail soon" : f4i1.f("tag=[", String.valueOf(f1p1Var.a), "]");
    }
}
