package p;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b8o extends xto1 {
    public final AtomicInteger b;
    public final m36 c;

    public b8o() {
        m36 m36Var = new m36();
        m36Var.a = new Object();
        m36Var.c = Long.MIN_VALUE;
        this.b = new AtomicInteger();
        this.c = m36Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[PHI: r4
      0x0032: PHI (r4v7 int) = (r4v0 int), (r4v8 int), (r4v9 int) binds: [B:11:0x0028, B:13:0x002b, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void A(x7o x7oVar) {
        int i;
        int i2;
        eo41.a("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long j = x7oVar.a;
            int iC = l1d.C(x7oVar.b);
            int i3 = 2;
            int i4 = 1;
            if (iC == 0) {
                i = 0;
                i2 = 1;
            } else if (iC != 1) {
                i2 = 0;
                i = 0;
            } else {
                i2 = 2;
                i = 0;
            }
            int i5 = x7oVar.c;
            int iOrdinal = x7oVar.d.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i3 = 3;
                    if (iOrdinal != 3) {
                        i3 = 4;
                        if (iOrdinal != 4) {
                            i4 = i;
                        } else {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                } else {
                    i4 = i3;
                }
            }
            byte bG = jup0.g(jup0.b(x7oVar.e));
            k1e k1eVar = x7oVar.f;
            int i6 = k1eVar.b;
            int i7 = k1eVar.c;
            int i8 = k1eVar.d;
            int i9 = k1eVar.e;
            k1e k1eVar2 = x7oVar.g;
            int i10 = -1;
            int i11 = k1eVar2 == null ? -1 : k1eVar2.b;
            int i12 = k1eVar2 == null ? -1 : k1eVar2.c;
            int i13 = k1eVar2 == null ? -1 : k1eVar2.d;
            if (k1eVar2 != null) {
                i10 = k1eVar2.e;
            }
            i8o.a(j, i2, i5, i4, bG, i6, i7, i8, i9, i11, i12, i13, i10, x7oVar.h);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void B(long j, w7o w7oVar, k1e k1eVar) {
        int i;
        Object objCast;
        try {
            eo41.a("CronetLoggerImpl#writeCronetEngineCreation");
            try {
                gr00 gr00Var = new gr00(w7oVar.f);
                int i2 = k1eVar.b;
                int i3 = k1eVar.c;
                int i4 = k1eVar.d;
                int i5 = k1eVar.e;
                boolean z = w7oVar.d;
                boolean z2 = w7oVar.c;
                int i6 = w7oVar.e;
                int i7 = 1;
                if (i6 == 0) {
                    i = i7;
                } else if (i6 == 1) {
                    i = 2;
                } else if (i6 == 2) {
                    i = 3;
                } else {
                    if (i6 != 3) {
                        throw new IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
                    }
                    i7 = 4;
                    i = i7;
                }
                boolean z3 = w7oVar.a;
                boolean z4 = w7oVar.b;
                boolean z5 = w7oVar.g;
                String strA = gr00Var.a();
                byte bG = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "store_server_configs_in_properties", null, Boolean.class)));
                int iIntValue = ((Integer) gr00Var.b("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
                int iIntValue2 = ((Integer) gr00Var.b("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
                byte bG2 = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)));
                byte bG3 = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "close_sessions_on_ip_change", null, Boolean.class)));
                byte bG4 = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class)));
                byte bG5 = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "migrate_sessions_early_v2", null, Boolean.class)));
                byte bG6 = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "disable_bidirectional_streams", null, Boolean.class)));
                int iIntValue3 = ((Integer) gr00Var.b("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                int iIntValue4 = ((Integer) gr00Var.b("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
                byte bG7 = jup0.g(jup0.b((Boolean) gr00Var.b("QUIC", "enable_socket_recv_optimization", null, Boolean.class)));
                byte bG8 = jup0.g(jup0.b((Boolean) gr00Var.b("AsyncDNS", "enable", null, Boolean.class)));
                byte bG9 = jup0.g(jup0.b((Boolean) gr00Var.b("StaleDNS", "enable", null, Boolean.class)));
                int iIntValue5 = ((Integer) gr00Var.b("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
                int iIntValue6 = ((Integer) gr00Var.b("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
                int iIntValue7 = ((Integer) gr00Var.b("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
                byte bG10 = jup0.g(jup0.b((Boolean) gr00Var.b("StaleDNS", "allow_other_network", null, Boolean.class)));
                byte bG11 = jup0.g(jup0.b((Boolean) gr00Var.b("StaleDNS", "persist_to_disk", null, Boolean.class)));
                int iIntValue8 = ((Integer) gr00Var.b("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
                byte bG12 = jup0.g(jup0.b((Boolean) gr00Var.b("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class)));
                JSONObject jSONObject = gr00Var.a;
                if (jSONObject.length() == 0) {
                    objCast = null;
                } else {
                    try {
                        objCast = Boolean.class.cast(jSONObject.get("disable_ipv6_on_wifi"));
                    } catch (ClassCastException | JSONException e) {
                        if (Log.isLoggable("gr00", 2)) {
                            e.getMessage();
                        }
                        objCast = null;
                    }
                }
                i8o.c(j, i2, i3, i4, i5, 3, z, z2, i, z3, z4, z5, strA, bG, iIntValue, iIntValue2, bG2, bG3, bG4, bG5, bG6, iIntValue3, iIntValue4, bG7, bG8, bG9, iIntValue5, iIntValue6, iIntValue7, bG10, bG11, iIntValue8, bG12, jup0.g(jup0.b((Boolean) objCast)), w7oVar.h, Process.myUid());
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            if (Log.isLoggable("b8o", 3)) {
                e2.getMessage();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0218  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void C(long j, z7o z7oVar) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bytes;
        m36 m36Var = this.c;
        synchronized (m36Var.a) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (m36Var.c + 1000 <= jElapsedRealtime) {
                    m36Var.b = 1;
                    m36Var.c = jElapsedRealtime;
                } else {
                    int i8 = m36Var.b;
                    if (i8 >= 1) {
                        this.b.incrementAndGet();
                        return;
                    }
                    m36Var.b = i8 + 1;
                }
                ?? r2 = this.b;
                int andSet = r2.getAndSet(0);
                try {
                    try {
                        eo41.a("CronetLoggerImpl#writeCronetTrafficReported");
                        try {
                            long j2 = z7oVar.a;
                            xa4.m(j2, "Request header size is negative");
                            double d = j2 / 1024.0d;
                            if (xa4.v(d, 0, 1)) {
                                i = 1;
                            } else if (xa4.v(d, 1, 10)) {
                                i = 2;
                            } else if (xa4.v(d, 10, 25)) {
                                i = 3;
                            } else if (xa4.v(d, 25, 50)) {
                                i = 4;
                            } else {
                                i = xa4.v(d, 50, 100) ? 5 : 6;
                            }
                            long j3 = z7oVar.b;
                            xa4.m(j3, "Request body size is negative");
                            double d2 = j3 / 1024.0d;
                            if (d2 == 0.0d) {
                                i2 = 1;
                            } else if (d2 > 0.0d && d2 < 10.0d) {
                                i2 = 2;
                            } else if (xa4.v(d2, 10, 50)) {
                                i2 = 3;
                            } else if (xa4.v(d2, 50, 200)) {
                                i2 = 4;
                            } else if (xa4.v(d2, 200, 500)) {
                                i2 = 5;
                            } else if (xa4.v(d2, 500, 1000)) {
                                i2 = 6;
                            } else {
                                i2 = xa4.v(d2, 1000, 5000) ? 7 : 8;
                            }
                            long j4 = z7oVar.c;
                            xa4.m(j4, "Response header size is negative");
                            double d3 = j4 / 1024.0d;
                            if (xa4.v(d3, 0, 1)) {
                                i4 = 1;
                                i3 = 200;
                            } else if (xa4.v(d3, 1, 10)) {
                                i3 = 200;
                                i4 = 2;
                            } else if (xa4.v(d3, 10, 25)) {
                                i3 = 200;
                                i4 = 3;
                            } else if (xa4.v(d3, 25, 50)) {
                                i3 = 200;
                                i4 = 4;
                            } else if (xa4.v(d3, 50, 100)) {
                                i3 = 200;
                                i4 = 5;
                            } else {
                                i3 = 200;
                                i4 = 6;
                            }
                            long j5 = z7oVar.d;
                            xa4.m(j5, "Response body size is negative");
                            double d4 = j5 / 1024.0d;
                            if (d4 == 0.0d) {
                                i5 = 1;
                            } else if (d4 > 0.0d && d4 < 10.0d) {
                                i5 = 2;
                            } else if (xa4.v(d4, 10, 50)) {
                                i5 = 3;
                            } else if (xa4.v(d4, 50, i3)) {
                                i5 = 4;
                            } else if (xa4.v(d4, i3, 500)) {
                                i5 = 5;
                            } else if (xa4.v(d4, 500, 1000)) {
                                i5 = 6;
                            } else {
                                i5 = xa4.v(d4, 1000, 5000) ? 7 : 8;
                            }
                            int i9 = z7oVar.e;
                            String str = z7oVar.h;
                            try {
                                MessageDigest messageDigest = tt50.b;
                                long j6 = 0;
                                if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                                    j6 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                                }
                                long j7 = j6;
                                int millis = (int) z7oVar.f.toMillis();
                                int millis2 = (int) z7oVar.g.toMillis();
                                int iC = l1d.C(z7oVar.i);
                                if (iC == 0) {
                                    i6 = 1;
                                } else if (iC != 1) {
                                    i6 = iC != 2 ? 0 : 3;
                                } else {
                                    i6 = 2;
                                }
                                int i10 = z7oVar.j;
                                int i11 = z7oVar.k;
                                int i12 = z7oVar.l;
                                Boolean bool = Boolean.FALSE;
                                byte bG = jup0.g(jup0.b(bool));
                                byte bG2 = jup0.g(jup0.b(Boolean.valueOf(z7oVar.m)));
                                int i13 = z7oVar.n;
                                int iC2 = l1d.C(1);
                                if (iC2 != 1) {
                                    i7 = iC2 != 2 ? 0 : 100;
                                } else {
                                    i7 = 1;
                                }
                                i8o.b(j, i, i2, i4, i5, i9, j7, millis, millis2, andSet, i6, i10, i11, i12, bG, bG2, i13, 0, i7, jup0.g(jup0.b(bool)), z7oVar.o, 3);
                                Trace.endSection();
                            } catch (Throwable th) {
                                th = th;
                                r2 = andSet;
                                Throwable th2 = th;
                                try {
                                    Trace.endSection();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e) {
                        e = e;
                        r2 = andSet;
                        this.b.addAndGet(r2);
                        if (Log.isLoggable("b8o", 3)) {
                            e.getMessage();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    this.b.addAndGet(r2);
                    if (Log.isLoggable("b8o", 3)) {
                        e.getMessage();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
