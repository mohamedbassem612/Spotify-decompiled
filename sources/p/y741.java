package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y741 implements mn31 {
    public final kly0 a;

    public y741(chp chpVar) {
        this.a = chpVar;
    }

    @Override // p.shh0
    public final boolean a(r9c r9cVar) {
        String strC = r9cVar.c();
        return "com.samsung.android.honeyboard".equals(strC) || "com.samsung.android.icecone".equals(strC);
    }

    @Override // p.shh0
    public final rhh0 b() {
        return (rhh0) this.a.get();
    }
}
