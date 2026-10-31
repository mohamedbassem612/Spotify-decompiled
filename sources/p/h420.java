package p;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h420 implements fka1 {
    public final wia0 a;
    public long b;
    public boolean c;

    public h420(wia0 wia0Var, long j) {
        this.a = wia0Var;
        this.b = j;
    }

    public final long O0(nac nacVar, long j) {
        long j2;
        long j3;
        int i;
        if (this.c) {
            eg.m("closed");
            return 0L;
        }
        wia0 wia0Var = this.a;
        long j4 = this.b;
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                ip51 ip51VarM = nacVar.M(1);
                byte[] bArr = ip51VarM.a;
                int i2 = ip51VarM.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (wia0Var) {
                    wia0Var.d.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = wia0Var.d.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (ip51VarM.b == ip51VarM.c) {
                        nacVar.a = ip51VarM.a();
                        pq51.a(ip51VarM);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    ip51VarM.c += i;
                    long j7 = i;
                    j6 += j7;
                    nacVar.b += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    public final void close() {
        wia0 wia0Var = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = wia0Var.c;
        reentrantLock.lock();
        try {
            int i = wia0Var.b - 1;
            wia0Var.b = i;
            if (i == 0 && wia0Var.a) {
                reentrantLock.unlock();
                synchronized (wia0Var) {
                    wia0Var.d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final gve1 l() {
        return gve1.d;
    }
}
