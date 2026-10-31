package p;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vys implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vys(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.qoj1
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CountDownLatch) obj).countDown();
                break;
            case 1:
                o0g1 o0g1Var = ((lzd1) obj).e;
                o0g1Var.getClass();
                o0g1Var.s();
                x8r.a();
                break;
            case 2:
                ((o0g1) obj).k();
                break;
            default:
                ((o5) obj).q();
                break;
        }
    }
}
