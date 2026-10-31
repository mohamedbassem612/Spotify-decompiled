package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class bai0 {
    public static final MediaBrowserServiceCompat.BrowserRoot a = new MediaBrowserServiceCompat.BrowserRoot("androidx.media3.session.MediaLibraryService", null);

    public static boolean a(xg61 xg61Var, xg61 xg61Var2) {
        p8u0 p8u0Var = xg61Var.a;
        int i = p8u0Var.b;
        p8u0 p8u0Var2 = xg61Var2.a;
        return i == p8u0Var2.b && p8u0Var.e == p8u0Var2.e && p8u0Var.h == p8u0Var2.h && p8u0Var.i == p8u0Var2.i;
    }

    public static int b(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return zoi1.j(zoi1.b0(j, j2), 0, 100);
    }

    public static long c(jbu0 jbu0Var, long j, long j2, long j3) {
        xg61 xg61Var = jbu0Var.c;
        boolean z = xg61Var.equals(xg61.l) || j2 < xg61Var.c;
        if (jbu0Var.x) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - xg61Var.c;
                }
                long j4 = xg61Var.a.f + ((long) (j3 * jbu0Var.g.a));
                long j5 = xg61Var.d;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return xg61Var.a.f;
        }
        return j;
    }

    public static m8u0 d(m8u0 m8u0Var, m8u0 m8u0Var2) {
        if (m8u0Var != null) {
            ko20 ko20Var = m8u0Var.a;
            if (m8u0Var2 != null) {
                l8u0 l8u0Var = new l8u0();
                for (int i = 0; i < ko20Var.a.size(); i++) {
                    if (m8u0Var2.a(ko20Var.b(i))) {
                        l8u0Var.a(ko20Var.b(i));
                    }
                }
                return l8u0Var.d();
            }
        }
        return m8u0.b;
    }

    public static jbu0 e(jbu0 jbu0Var, jbu0 jbu0Var2, ebu0 ebu0Var, m8u0 m8u0Var, boolean z, hi61 hi61Var) {
        jbu0 jbu0VarB;
        o3g1 o3g1Var;
        boolean z2;
        if (ebu0Var.a && m8u0Var.a(17)) {
            ki61 ki61Var = hi61Var.a;
            ki61 ki61Var2 = hi61Var.a;
            int i = ki61Var.c;
            sqe1 sqe1Var = jbu0Var.j;
            boolean z3 = !sqe1Var.p() && jbu0Var2.c.a.b >= sqe1Var.o();
            if (i >= 10 || !z3) {
                boolean z4 = !z3;
                StringBuilder sb = new StringBuilder("Invalid PlayerInfo update, old index: ");
                sb.append(jbu0Var.c.a.b);
                sb.append(" (count=");
                sb.append(sqe1Var.o());
                sb.append("), new index = ");
                sb.append(jbu0Var2.c.a.b);
                sb.append(", sent from ");
                String str = ki61Var2.e;
                if (str == null) {
                    str = ki61Var2.d;
                }
                sb.append(str);
                sb.append(", interface version=");
                sb.append(ki61Var2.c);
                o0c.q(sb.toString(), z4);
                jbu0VarB = jbu0Var2.l(sqe1Var);
            } else {
                StringBuilder sbR = cy30.r(i, "Inconsistent update from legacy session (interface version=", "). Index ");
                sbR.append(jbu0Var2.c.a.b);
                sbR.append(" is out of bounds of timeline (size=");
                sbR.append(sqe1Var.o());
                sbR.append("). Discarding stale timeline to prevent crash.");
                oon1.H(sbR.toString());
                jbu0VarB = jbu0Var2.l(sqe1.a);
            }
        } else {
            jbu0VarB = jbu0Var2;
        }
        if (ebu0Var.b && m8u0Var.a(30)) {
            jbu0VarB = jbu0VarB.b(jbu0Var.F);
        }
        if (!z || jbu0Var2.n != 0.0f) {
            return jbu0VarB;
        }
        float f = jbu0Var.o;
        PlaybackException playbackException = jbu0VarB.a;
        int i2 = jbu0VarB.b;
        xg61 xg61Var = jbu0VarB.c;
        p8u0 p8u0Var = jbu0VarB.d;
        p8u0 p8u0Var2 = jbu0VarB.e;
        int i3 = jbu0VarB.f;
        k2u0 k2u0Var = jbu0VarB.g;
        int i4 = jbu0VarB.h;
        boolean z5 = jbu0VarB.i;
        sqe1 sqe1Var2 = jbu0VarB.j;
        int i5 = jbu0VarB.k;
        z1k1 z1k1Var = jbu0VarB.l;
        tqh0 tqh0Var = jbu0VarB.m;
        float f2 = jbu0VarB.n;
        int i6 = jbu0VarB.f78p;
        po7 po7Var = jbu0VarB.q;
        qeo qeoVar = jbu0VarB.r;
        xqt xqtVar = jbu0VarB.s;
        int i7 = jbu0VarB.t;
        boolean z6 = jbu0VarB.u;
        boolean z7 = jbu0VarB.v;
        int i8 = jbu0VarB.w;
        boolean z8 = jbu0VarB.x;
        boolean z9 = jbu0VarB.y;
        int i9 = jbu0VarB.z;
        int i10 = jbu0VarB.A;
        tqh0 tqh0Var2 = jbu0VarB.B;
        long j = jbu0VarB.C;
        long j2 = jbu0VarB.D;
        long j3 = jbu0VarB.E;
        o3g1 o3g1Var2 = jbu0VarB.F;
        k0g1 k0g1Var = jbu0VarB.G;
        if (!sqe1Var2.p()) {
            o3g1Var = o3g1Var2;
            if (xg61Var.a.b >= sqe1Var2.o()) {
                z2 = false;
            }
            dm5.y(z2);
            return new jbu0(playbackException, i2, xg61Var, p8u0Var, p8u0Var2, i3, k2u0Var, i4, z5, z1k1Var, sqe1Var2, i5, tqh0Var, f2, f, po7Var, i6, qeoVar, xqtVar, i7, z6, z7, i8, i9, i10, z8, z9, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        }
        o3g1Var = o3g1Var2;
        z2 = true;
        dm5.y(z2);
        return new jbu0(playbackException, i2, xg61Var, p8u0Var, p8u0Var2, i3, k2u0Var, i4, z5, z1k1Var, sqe1Var2, i5, tqh0Var, f2, f, po7Var, i6, qeoVar, xqtVar, i7, z6, z7, i8, i9, i10, z8, z9, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
    }

    public static void f(r8u0 r8u0Var, jxh0 jxh0Var) {
        int i = jxh0Var.b;
        long j = jxh0Var.c;
        b380 b380Var = jxh0Var.a;
        if (i == -1) {
            if (r8u0Var.Y(20)) {
                r8u0Var.c1(b380Var);
                return;
            } else {
                if (b380Var.isEmpty()) {
                    return;
                }
                r8u0Var.F0((yoh0) b380Var.get(0));
                return;
            }
        }
        if (r8u0Var.Y(20)) {
            r8u0Var.G0(b380Var, jxh0Var.b, j);
        } else {
            if (b380Var.isEmpty()) {
                return;
            }
            r8u0Var.k0((yoh0) b380Var.get(0), j);
        }
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i = 0; i < list.size(); i++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i);
                parcelObtain.writeParcelable(parcelable, 0);
                if (parcelObtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }
}
