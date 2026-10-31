package p;

import android.net.Network;
import java.util.IdentityHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rfh0 implements yeg1 {
    public final d18 a;
    public final Function0 b;
    public final long c;
    public final IdentityHashMap d;
    public final z1c e;
    public pfh0 f;
    public boolean g;

    public rfh0(d18 d18Var, int i) {
        n0g0 n0g0Var = new n0g0(0, rdd1.a, rdd1.class, "elapsedRealtime", "elapsedRealtime()J", 0, (byte) 2);
        this.a = d18Var;
        this.b = n0g0Var;
        this.c = yoi1.p(i, 0, 60000);
        this.d = new IdentityHashMap();
        this.e = new z1c();
        this.g = true;
    }

    public final boolean a(n3r n3rVar, boolean z) {
        return (this.c <= 0 || !z || n3rVar.a.getHost() == null || (n3rVar.j instanceof zhg0) || n3rVar.c(8)) ? false : true;
    }

    public final synchronized void c() {
        z1c z1cVar = this.e;
        z1cVar.c = null;
        z1cVar.a = 0L;
        z1cVar.b = 0L;
        z1cVar.d = null;
        this.f = null;
    }

    public final synchronized void e(o2r o2rVar, n3r n3rVar, boolean z) {
        this.d.remove(o2rVar);
    }

    public final synchronized void j(o2r o2rVar, n3r n3rVar, boolean z) {
        try {
            if (a(n3rVar, z)) {
                IdentityHashMap identityHashMap = this.d;
                if (identityHashMap.get(o2rVar) == null) {
                    String host = n3rVar.a.getHost();
                    if (host == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    identityHashMap.put(o2rVar, new qfh0(host, ((Number) this.b.invoke()).longValue()));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void m(o2r o2rVar, n3r n3rVar, boolean z, int i) {
        Long lValueOf;
        long j;
        pfh0 pfh0Var;
        d18 d18Var;
        Long lValueOf2;
        if (i > 0) {
            if (this.g) {
                if (!z) {
                    this.d.remove(o2rVar);
                    c();
                    return;
                }
                if (a(n3rVar, z)) {
                    long jLongValue = ((Number) this.b.invoke()).longValue();
                    IdentityHashMap identityHashMap = this.d;
                    Object qfh0Var = identityHashMap.get(o2rVar);
                    if (qfh0Var == null) {
                        String host = n3rVar.a.getHost();
                        if (host == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        qfh0Var = new qfh0(host, jLongValue);
                        identityHashMap.put(o2rVar, qfh0Var);
                    }
                    qfh0 qfh0Var2 = (qfh0) qfh0Var;
                    long j2 = jLongValue - qfh0Var2.c;
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    qfh0Var2.c = jLongValue;
                    qfh0Var2.e = Math.max(qfh0Var2.e, j2);
                    Long l = qfh0Var2.b;
                    if (l == null || jLongValue < l.longValue()) {
                        qfh0Var2.b = Long.valueOf(jLongValue);
                        d18 d18Var2 = this.a;
                        synchronized (d18Var2) {
                            lValueOf = Long.valueOf(d18Var2.a);
                            if (((Network) d18Var2.c) == null) {
                                lValueOf = null;
                            }
                        }
                        qfh0Var2.f = lValueOf;
                        qfh0Var2.d = 0L;
                        qfh0Var2.e = 0L;
                        return;
                    }
                    qfh0Var2.d += (long) i;
                    long jLongValue2 = jLongValue - l.longValue();
                    if (jLongValue2 < 100) {
                        return;
                    }
                    double d = (qfh0Var2.d * 8000.0d) / jLongValue2;
                    Long l2 = qfh0Var2.f;
                    if (l2 != null) {
                        j = 0;
                        if (this.a.w(qfh0Var2.a, l2.longValue(), d, jLongValue2, qfh0Var2.e, jLongValue, this.c)) {
                            pfh0Var = new pfh0(qfh0Var2.a, d, qfh0Var2.e, jLongValue, l2.longValue());
                            jLongValue = jLongValue;
                        }
                        this.f = pfh0Var;
                        qfh0Var2.b = Long.valueOf(jLongValue);
                        qfh0Var2.d = j;
                        qfh0Var2.e = j;
                        d18Var = this.a;
                        synchronized (d18Var) {
                            lValueOf2 = Long.valueOf(d18Var.a);
                            if (((Network) d18Var.c) == null) {
                                lValueOf2 = null;
                            }
                        }
                        qfh0Var2.f = lValueOf2;
                        return;
                    }
                    j = 0;
                    pfh0Var = null;
                    this.f = pfh0Var;
                    qfh0Var2.b = Long.valueOf(jLongValue);
                    qfh0Var2.d = j;
                    qfh0Var2.e = j;
                    d18Var = this.a;
                    synchronized (d18Var) {
                        lValueOf2 = Long.valueOf(d18Var.a);
                        if (((Network) d18Var.c) == null) {
                            lValueOf2 = null;
                        }
                        qfh0Var2.f = lValueOf2;
                        return;
                    }
                    throw th;
                }
            }
        }
    }

    public final synchronized void t(o2r o2rVar, n3r n3rVar, boolean z) {
        try {
            if (a(n3rVar, z)) {
                IdentityHashMap identityHashMap = this.d;
                String host = n3rVar.a.getHost();
                if (host == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                identityHashMap.put(o2rVar, new qfh0(host, ((Number) this.b.invoke()).longValue()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
