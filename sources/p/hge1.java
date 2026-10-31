package p;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hge1 {
    public final int a;
    public final long b;
    public m1d c;
    public int d = 1;
    public long e;
    public Long f;
    public Long g;
    public int h;

    public hge1(int i, long j) {
        this.a = i;
        this.b = j;
        if (i <= 0) {
            hhg1.n("maxStallsPerHour must be positive");
            throw null;
        }
        if (j > 0) {
            return;
        }
        hhg1.n("stallThresholdMs must be positive");
        throw null;
    }

    public final synchronized m1d a(long j) {
        if (this.c != null) {
            return null;
        }
        this.e++;
        long j2 = this.b;
        m1d m1dVar = new m1d();
        m1dVar.a = j;
        m1dVar.b = j2;
        m1dVar.c = new AtomicLong(-1L);
        this.d = 1;
        this.c = m1dVar;
        return m1dVar;
    }

    public final synchronized void b() {
        this.c = null;
        this.d = 1;
    }

    public final synchronized gge1 c(long j) {
        try {
            m1d m1dVar = this.c;
            if (m1dVar == null) {
                return null;
            }
            Long lA = m1dVar.a();
            if (lA != null) {
                this.c = null;
            }
            int iC = l1d.C(this.d);
            boolean z = true;
            if (iC != 0) {
                if (iC == 1) {
                    return null;
                }
                if (iC == 2) {
                    return null;
                }
                if (iC == 3) {
                    return lA != null ? new dge1(m1dVar, lA.longValue()) : null;
                }
                throw new NoWhenBranchMatchedException();
            }
            if ((lA != null ? lA.longValue() : j) - m1dVar.a < m1dVar.b) {
                return null;
            }
            Long l = this.g;
            if (l == null || j - l.longValue() >= 3600000) {
                this.g = Long.valueOf(j);
                this.h = 0;
            }
            Long l2 = this.f;
            boolean z2 = this.h >= this.a;
            if (l2 == null || j - l2.longValue() >= 60000) {
                z = false;
            }
            if (!z2 && !z) {
                this.d = 2;
                return lA == null ? new fge1(m1dVar, j) : new ege1(m1dVar, lA.longValue(), j);
            }
            this.d = 3;
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(fge1 fge1Var) {
        this.h++;
        this.f = Long.valueOf(fge1Var.b);
        this.d = 4;
    }
}
