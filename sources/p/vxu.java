package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vxu extends Thread {
    public final j0v a;
    public final l3v b;
    public final dzu c;
    public final boolean d;
    public final int e;
    public volatile uxu f;
    public volatile boolean g;
    public Exception h;
    public long i = -1;

    public vxu(j0v j0vVar, l3v l3vVar, dzu dzuVar, boolean z, int i, uxu uxuVar) {
        this.a = j0vVar;
        this.b = l3vVar;
        this.c = dzuVar;
        this.d = z;
        this.e = i;
        this.f = uxuVar;
    }

    public final void e(boolean z) {
        if (z) {
            this.f = null;
        }
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.cancel();
        interrupt();
    }

    public final void f(float f, long j, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.i) {
            this.i = j;
            uxu uxuVar = this.f;
            if (uxuVar != null) {
                uxuVar.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.d) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.g) {
                    try {
                        this.b.d(this);
                        break;
                    } catch (IOException e) {
                        if (!this.g) {
                            long j2 = this.c.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.e) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.h = e2;
        }
        uxu uxuVar = this.f;
        if (uxuVar != null) {
            uxuVar.obtainMessage(10, this).sendToTarget();
        }
    }
}
