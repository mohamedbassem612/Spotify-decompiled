package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fs41 extends udk1 {
    public final kgr a;
    public boolean b = true;

    public fs41(kgr kgrVar) {
        this.a = kgrVar;
    }

    @Override // p.udk1
    public final void a(int i) {
        boolean z = i == 0;
        if (this.b != z) {
            this.a.invoke();
            this.b = z;
        }
    }
}
