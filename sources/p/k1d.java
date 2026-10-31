package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k1d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cab b;

    public /* synthetic */ k1d(cab cabVar, byte b) {
        this.a = b;
        this.b = cabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cab cabVar = this.b;
        switch (b) {
            case 0:
                byte b2 = 1;
                if (!((AtomicBoolean) cabVar.c).getAndSet(true)) {
                    ((p1d) ((it8) cabVar.d).c).c.execute(new k1d(cabVar, b2));
                    break;
                }
                break;
            default:
                int i = ((p1d) ((it8) cabVar.d).c).h1;
                it8 it8Var = (it8) cabVar.d;
                if (i == 8) {
                    ((p1d) it8Var.c).t("Camera onError timeout, reopen it.");
                    ((p1d) ((it8) cabVar.d).c).F(7);
                    ((p1d) ((it8) cabVar.d).c).h.b();
                } else {
                    ((p1d) it8Var.c).t("Camera skip reopen at state: ".concat(z5c.u(((p1d) ((it8) cabVar.d).c).h1)));
                }
                break;
        }
    }
}
