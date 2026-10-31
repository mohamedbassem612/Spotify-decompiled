package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class r38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r38(Object obj, String str, long j, long j2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                t38 t38Var = (t38) ((em3) obj).c;
                String str = zoi1.a;
                t38Var.A(this.c, this.d, this.b);
                break;
            default:
                qwj1 qwj1Var = (qwj1) ((bih1) obj).c;
                String str2 = zoi1.a;
                qwj1Var.T(this.c, this.d, this.b);
                break;
        }
    }
}
