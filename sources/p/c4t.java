package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c4t implements jxg {
    public final /* synthetic */ ohd a;

    public c4t(ohd ohdVar) {
        this.a = ohdVar;
    }

    @Override // p.jxg
    public final void onColdStartupCompleted(String str) {
        this.a.resumeWith(rih1.a);
    }
}
