package p;

import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fdd1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdd1 b;
    public final /* synthetic */ hdd1 c;

    public /* synthetic */ fdd1(hdd1 hdd1Var, hdd1 hdd1Var2, byte b) {
        this.a = b;
        this.b = hdd1Var;
        this.c = hdd1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hdd1 hdd1Var = this.b;
                hdd1 hdd1Var2 = this.c;
                a680 a680Var = hdd1Var.b;
                synchronized (a680Var.b) {
                    ((LinkedHashSet) a680Var.c).remove(hdd1Var);
                    ((LinkedHashSet) a680Var.d).remove(hdd1Var);
                    break;
                }
                hdd1Var.g(hdd1Var2);
                if (hdd1Var.g == null) {
                    j2h1.M("SyncCaptureSessionBase");
                    return;
                } else {
                    Objects.requireNonNull(hdd1Var.f);
                    hdd1Var.f.c(hdd1Var2);
                    return;
                }
            default:
                hdd1 hdd1Var3 = this.b;
                hdd1 hdd1Var4 = this.c;
                Objects.requireNonNull(hdd1Var3.f);
                hdd1Var3.f.g(hdd1Var4);
                return;
        }
    }
}
