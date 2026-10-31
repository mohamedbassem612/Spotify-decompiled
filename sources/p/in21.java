package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class in21 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ mn21 c;

    public in21(mn21 mn21Var, String str, long j) {
        this.c = mn21Var;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn21 mn21Var = this.c;
        mn21Var.mEventLog.a(this.b, this.a);
        mn21Var.mEventLog.b(mn21Var.toString());
    }
}
