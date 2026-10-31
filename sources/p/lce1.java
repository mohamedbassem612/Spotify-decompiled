package p;

import android.os.SystemClock;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lce1 {
    public static final wh41 h = new wh41();
    public static boolean i = true;
    public final dvo1 d;
    public final ecp1 e;
    public final kce1 g;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final wh41 a = h;
    public final zxl1 f = new zxl1(qok0.c().b());

    public lce1(ecp1 ecp1Var, dvo1 dvo1Var, kce1 kce1Var) {
        this.e = ecp1Var;
        this.d = dvo1Var;
        this.g = kce1Var;
    }

    public final hfp1 a(Executor executor, Callable callable, y1t0 y1t0Var) {
        zod.w(this.b.get() > 0);
        if (((hfp1) y1t0Var.b).i()) {
            hfp1 hfp1Var = new hfp1();
            hfp1Var.s();
            return hfp1Var;
        }
        dp5 dp5Var = new dp5((byte) 8);
        bsd1 bsd1Var = new bsd1((y1t0) dp5Var.b);
        this.a.p(new n9m(this, y1t0Var, dp5Var, callable, bsd1Var, (byte) 7), new q7g1(executor, y1t0Var, dp5Var, bsd1Var));
        return bsd1Var.a;
    }

    public final Object b(mj80 mj80Var) {
        yzd1 yzd1VarA;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                yzd1VarA = this.d.a(mj80Var);
                c(q0p1.NO_ERROR, jElapsedRealtime, mj80Var);
                i = false;
            } catch (MlKitException e) {
                c(e.a == 14 ? q0p1.MODEL_NOT_DOWNLOADED : q0p1.UNKNOWN_ERROR, jElapsedRealtime, mj80Var);
                throw e;
            }
        }
        return yzd1VarA;
    }

    public final void c(q0p1 q0p1Var, long j, mj80 mj80Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.e.b(new azj(this, jElapsedRealtime, q0p1Var, mj80Var), r0p1.ON_DEVICE_TEXT_DETECT);
        fqn1 fqn1Var = new fqn1((byte) 4);
        fqn1Var.b = q0p1Var;
        fqn1Var.c = Boolean.valueOf(i);
        dmj1 dmj1Var = new dmj1((byte) 16);
        dmj1Var.b = e8p1.LATIN;
        fqn1Var.d = new g8p1(dmj1Var);
        final m5o1 m5o1Var = new m5o1(fqn1Var);
        final lxh1 lxh1Var = new lxh1(this, (byte) 16);
        r0p1 r0p1Var = r0p1.UNKNOWN_EVENT;
        final ecp1 ecp1Var = this.e;
        lqn1.a(1, new Runnable() { // from class: p.bcp1
            {
                r0p1 r0p1Var2 = r0p1.UNKNOWN_EVENT;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r0p1 r0p1Var2 = r0p1.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                ecp1 ecp1Var2 = ecp1Var;
                HashMap map = ecp1Var2.j;
                if (!map.containsKey(r0p1Var2)) {
                    rpn1 rpn1Var = new rpn1();
                    mkn1 mkn1Var = new mkn1();
                    if (!rpn1Var.isEmpty()) {
                        bhn0.q();
                        throw null;
                    }
                    mkn1Var.c = rpn1Var;
                    map.put(r0p1Var2, mkn1Var);
                }
                mkn1 mkn1Var2 = (mkn1) map.get(r0p1Var2);
                Long lValueOf = Long.valueOf(jElapsedRealtime);
                rpn1 rpn1Var2 = mkn1Var2.c;
                m5o1 m5o1Var2 = m5o1Var;
                Collection collection = (Collection) rpn1Var2.get(m5o1Var2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        eg.f("New Collection violated the Collection spec");
                        return;
                    }
                    rpn1Var2.put(m5o1Var2, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (ecp1Var2.d(r0p1Var2, jElapsedRealtime2)) {
                    ecp1Var2.i.put(r0p1Var2, Long.valueOf(jElapsedRealtime2));
                    lqn1.a(1, new sjj1(ecp1Var2, lxh1Var));
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        zxl1 zxl1Var = this.f;
        int i2 = this.g.a() ? 24317 : 24306;
        short s = q0p1Var.a;
        synchronized (zxl1Var) {
            AtomicLong atomicLong = (AtomicLong) zxl1Var.c;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ((AtomicLong) zxl1Var.c).get() <= 1800000) {
                return;
            }
            ((o9n1) zxl1Var.b).g(new dxd1(0, Arrays.asList(new uoj0(i2, s, 0, j2, jCurrentTimeMillis, null, null, 0, -1)))).m(new o0g(zxl1Var, jElapsedRealtime2, (byte) 20));
        }
    }
}
