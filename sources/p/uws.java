package p;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uws implements bxs, log1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uws(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
        this.d = obj3;
    }

    public void a(Exception exc) throws Throwable {
        tl21 tl21Var = (tl21) this.b;
        bsd1 bsd1Var = (bsd1) this.c;
        vy8 vy8Var = (vy8) this.d;
        if (exc != null) {
            bsd1Var.c(exc);
            return;
        }
        if (this.a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new zyh0(tl21Var, countDownLatch, (byte) 22)).start();
            ExecutorService executorService = opi1.a;
            boolean z2 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jNanoTime = jNanoTime2 - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        bsd1Var.d(vy8Var);
    }

    public bg11 b(int i, pnf1 pnf1Var, int[] iArr) {
        exs exsVar = (exs) this.b;
        zws zwsVar = (zws) this.c;
        int[] iArr2 = (int[]) this.d;
        rws rwsVar = new rws(exsVar, zwsVar);
        int i2 = iArr2[i];
        v280 v280VarM = b380.m();
        for (int i3 = 0; i3 < pnf1Var.a; i3++) {
            v280VarM.c(new vws(i, pnf1Var, i3, zwsVar, iArr[i3], this.a, rwsVar, i2));
        }
        return v280VarM.g();
    }
}
