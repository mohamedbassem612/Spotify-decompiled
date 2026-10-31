package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class god implements nzc {
    public final /* synthetic */ iod a;

    public void a() {
        iod iodVar = this.a;
        synchronized (iodVar.a) {
            try {
                if (iodVar.i == 5) {
                    iodVar.j(iodVar.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        String str;
        iod iodVar = this.a;
        synchronized (iodVar.a) {
            o0c.q("Release completer expected to be null", iodVar.k == null);
            iodVar.k = mzcVar;
            str = "Release[session=" + iodVar + "]";
        }
        return str;
    }
}
