package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ozc extends t9 {
    public final /* synthetic */ pzc h;

    public ozc(pzc pzcVar) {
        this.h = pzcVar;
    }

    @Override // p.t9
    public final String j() {
        mzc mzcVar = (mzc) this.h.a.get();
        return mzcVar == null ? "Completer object has been garbage collected, future will fail soon" : td6.l(new StringBuilder("tag=["), mzcVar.a, "]");
    }
}
