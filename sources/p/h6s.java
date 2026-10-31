package p;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class h6s {
    public static final bg11 s;
    public final oqe1 a;
    public final dqe1 b;
    public final a9a c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j380 f59p;
    public final ConcurrentHashMap q;
    public long r;

    static {
        w280 w280Var = b380.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        i8p1.l(6, objArr);
        s = b380.l(6, objArr);
    }

    public h6s(a9a a9aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, Map map) {
        a(i5, "bufferForPlaybackMs", 0, "0");
        a(i6, "bufferForPlaybackForLocalPlaybackMs", 0, "0");
        a(i7, "bufferForPlaybackAfterRebufferMs", 0, "0");
        a(i8, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", 0, "0");
        a(i, "minBufferMs", i5, "bufferForPlaybackMs");
        a(i2, "minBufferForLocalPlaybackMs", i6, "bufferForPlaybackForLocalPlaybackMs");
        a(i, "minBufferMs", i7, "bufferForPlaybackAfterRebufferMs");
        a(i2, "minBufferForLocalPlaybackMs", i8, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(i3, "maxBufferMs", i, "minBufferMs");
        a(i4, "maxBufferForLocalPlaybackMs", i2, "minBufferForLocalPlaybackMs");
        a(i9, "backBufferDurationMs", 0, "0");
        this.a = new oqe1();
        this.b = new dqe1();
        this.c = a9aVar;
        this.d = zoi1.W(i);
        this.e = zoi1.W(i2);
        this.f = zoi1.W(i3);
        this.g = zoi1.W(i4);
        this.h = zoi1.W(i5);
        this.i = zoi1.W(i6);
        this.j = zoi1.W(i7);
        this.k = zoi1.W(i8);
        this.l = -1;
        this.m = z;
        this.n = true;
        this.o = zoi1.W(i9);
        this.q = new ConcurrentHashMap();
        this.f59p = j380.c(map);
        this.r = -1L;
    }

    public static void a(int i, String str, int i2, String str2) {
        dm5.p(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int b(x1e0 x1e0Var, qp00[] qp00VarArr) {
        boolean zC = c(x1e0Var);
        int length = qp00VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                return zoi1.j(i2, 13107200, 210239488);
            }
            qp00 qp00Var = qp00VarArr[i];
            if (qp00Var != null) {
                switch (qp00Var.n().c) {
                    case -2:
                        i3 = 0;
                        i2 += i3;
                        break;
                    case -1:
                    case 1:
                        i2 += i3;
                        break;
                    case 0:
                        i3 = 144310272;
                        i2 += i3;
                        break;
                    case 2:
                        i3 = zC ? 19660800 : 131072000;
                        i2 += i3;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i3 = 131072;
                        i2 += i3;
                        break;
                    case 4:
                        i3 = 26214400;
                        i2 += i3;
                        break;
                    default:
                        bhn0.q();
                        return 0;
                }
            }
            i++;
        }
    }

    public final boolean c(x1e0 x1e0Var) {
        sqe1 sqe1Var = x1e0Var.b;
        soh0 soh0Var = sqe1Var.n(sqe1Var.g(x1e0Var.c.a, this.b).c, this.a, 0L).c.b;
        if (soh0Var == null) {
            return false;
        }
        String scheme = soh0Var.a.getScheme();
        return TextUtils.isEmpty(scheme) || s.contains(scheme);
    }

    public void d(dbu0 dbu0Var) {
        long id = Thread.currentThread().getId();
        long j = this.r;
        dm5.z(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.r = id;
        ConcurrentHashMap concurrentHashMap = this.q;
        g6s g6sVar = (g6s) concurrentHashMap.get(dbu0Var);
        if (g6sVar == null) {
            g6s g6sVar2 = new g6s();
            g6sVar2.a = 1;
            concurrentHashMap.put(dbu0Var, g6sVar2);
        } else {
            g6sVar.a++;
        }
        g6s g6sVar3 = (g6s) concurrentHashMap.get(dbu0Var);
        g6sVar3.getClass();
        Integer num = (Integer) this.f59p.get(dbu0Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        g6sVar3.c = iIntValue;
        g6sVar3.b = false;
    }

    public void e(dbu0 dbu0Var) {
        h(dbu0Var);
        if (this.q.isEmpty()) {
            this.r = -1L;
        }
    }

    public void f(dbu0 dbu0Var) {
        h(dbu0Var);
    }

    public void g(x1e0 x1e0Var, qnf1 qnf1Var, qp00[] qp00VarArr) {
        dbu0 dbu0Var = x1e0Var.a;
        Integer num = (Integer) this.f59p.get(dbu0Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        g6s g6sVar = (g6s) this.q.get(dbu0Var);
        g6sVar.getClass();
        if (iIntValue == -1) {
            iIntValue = b(x1e0Var, qp00VarArr);
        }
        g6sVar.c = iIntValue;
        k();
    }

    public final void h(dbu0 dbu0Var) {
        ConcurrentHashMap concurrentHashMap = this.q;
        g6s g6sVar = (g6s) concurrentHashMap.get(dbu0Var);
        if (g6sVar != null) {
            int i = g6sVar.a - 1;
            g6sVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(dbu0Var);
                k();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    public boolean i(x1e0 x1e0Var) {
        int i;
        boolean z;
        int i2;
        dbu0 dbu0Var = x1e0Var.a;
        g6s g6sVar = (g6s) this.q.get(dbu0Var);
        g6sVar.getClass();
        g6s g6sVar2 = (g6s) this.q.get(dbu0Var);
        g6sVar2.getClass();
        synchronized (g6sVar2) {
            i = g6sVar2.d;
        }
        this.c.getClass();
        int i3 = i * 65536;
        g6s g6sVar3 = (g6s) this.q.get(dbu0Var);
        g6sVar3.getClass();
        boolean z2 = i3 >= g6sVar3.c;
        if (dbu0Var.equals(dbu0.d)) {
            return !z2;
        }
        boolean zC = c(x1e0Var);
        long jMin = zC ? this.e : this.d;
        long j = zC ? this.g : this.f;
        float f = x1e0Var.f;
        if (f > 1.0f) {
            jMin = Math.min(zoi1.H(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        boolean z3 = z2;
        long j2 = x1e0Var.e;
        if (j2 < jMax) {
            boolean z4 = zC ? this.n : this.m;
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= jMaxMemory) {
                long jFreeMemory = runtime.freeMemory();
                a9a a9aVar = this.c;
                synchronized (a9aVar) {
                    i2 = a9aVar.d * 65536;
                }
                if (jFreeMemory + ((long) i2) >= jMaxMemory / 25) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            boolean z5 = (z4 && z) || !z3;
            g6sVar.b = z5;
            if (!z5 && z4 && !z) {
                oon1.A("Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!g6sVar.b && x1e0Var.e < 500000) {
                oon1.H("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z3) {
            g6sVar.b = false;
        }
        return g6sVar.b;
    }

    public boolean j(x1e0 x1e0Var) {
        long jMin;
        int i;
        boolean zC = c(x1e0Var);
        dbu0 dbu0Var = x1e0Var.a;
        long J = zoi1.J(x1e0Var.f, x1e0Var.e);
        if (x1e0Var.g) {
            jMin = zC ? this.k : this.j;
        } else {
            jMin = zC ? this.i : this.h;
        }
        long j = x1e0Var.h;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || J >= jMin) {
            return true;
        }
        if (zC ? this.n : this.m) {
            return false;
        }
        g6s g6sVar = (g6s) this.q.get(dbu0Var);
        g6sVar.getClass();
        synchronized (g6sVar) {
            i = g6sVar.d;
        }
        this.c.getClass();
        int i2 = i * 65536;
        g6s g6sVar2 = (g6s) this.q.get(dbu0Var);
        g6sVar2.getClass();
        return i2 >= g6sVar2.c;
    }

    public final void k() {
        boolean zIsEmpty = this.q.isEmpty();
        a9a a9aVar = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (a9aVar) {
                a9aVar.s(0);
            }
        } else {
            Iterator it = this.q.values().iterator();
            while (it.hasNext()) {
                i += ((g6s) it.next()).c;
            }
            a9aVar.s(i);
        }
    }

    public h6s() {
        this(new a9a((byte) 1), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, 0);
    }

    public h6s(a9a a9aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(a9aVar, i, i2, i3, i4, i5, i6, i7, i8, false, i9, gg11.g);
    }
}
