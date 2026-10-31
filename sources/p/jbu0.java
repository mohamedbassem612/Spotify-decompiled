package p;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jbu0 {
    public static final jbu0 H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public final int A;
    public final tqh0 B;
    public final long C;
    public final long D;
    public final long E;
    public final o3g1 F;
    public final k0g1 G;
    public final PlaybackException a;
    public final int b;
    public final xg61 c;
    public final p8u0 d;
    public final p8u0 e;
    public final int f;
    public final k2u0 g;
    public final int h;
    public final boolean i;
    public final sqe1 j;
    public final int k;
    public final z1k1 l;
    public final tqh0 m;
    public final float n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f78p;
    public final po7 q;
    public final qeo r;
    public final xqt s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    static {
        xg61 xg61Var = xg61.l;
        p8u0 p8u0Var = xg61.k;
        k2u0 k2u0Var = k2u0.d;
        z1k1 z1k1Var = z1k1.d;
        cqe1 cqe1Var = sqe1.a;
        tqh0 tqh0Var = tqh0.M;
        H = new jbu0(null, 0, xg61Var, p8u0Var, p8u0Var, 0, k2u0Var, 0, false, z1k1Var, cqe1Var, 0, tqh0Var, 1.0f, 1.0f, po7.i, 0, qeo.d, xqt.e, 0, false, false, 1, 0, 1, false, false, tqh0Var, 5000L, 15000L, 3000L, o3g1.b, k0g1.J);
        String str = zoi1.a;
        I = Integer.toString(1, 36);
        J = Integer.toString(2, 36);
        K = Integer.toString(3, 36);
        L = Integer.toString(4, 36);
        M = Integer.toString(5, 36);
        N = Integer.toString(6, 36);
        O = Integer.toString(7, 36);
        P = Integer.toString(33, 36);
        Q = Integer.toString(8, 36);
        R = Integer.toString(9, 36);
        S = Integer.toString(10, 36);
        T = Integer.toString(11, 36);
        U = Integer.toString(12, 36);
        V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        X = Integer.toString(15, 36);
        Y = Integer.toString(16, 36);
        Z = Integer.toString(17, 36);
        a0 = Integer.toString(18, 36);
        b0 = Integer.toString(19, 36);
        c0 = Integer.toString(20, 36);
        d0 = Integer.toString(21, 36);
        e0 = Integer.toString(22, 36);
        f0 = Integer.toString(23, 36);
        g0 = Integer.toString(24, 36);
        h0 = Integer.toString(25, 36);
        i0 = Integer.toString(26, 36);
        j0 = Integer.toString(27, 36);
        k0 = Integer.toString(28, 36);
        l0 = Integer.toString(29, 36);
        m0 = Integer.toString(30, 36);
        n0 = Integer.toString(31, 36);
        o0 = Integer.toString(32, 36);
        p0 = Integer.toString(34, 36);
    }

    public jbu0(PlaybackException playbackException, int i, xg61 xg61Var, p8u0 p8u0Var, p8u0 p8u0Var2, int i2, k2u0 k2u0Var, int i3, boolean z, z1k1 z1k1Var, sqe1 sqe1Var, int i4, tqh0 tqh0Var, float f, float f2, po7 po7Var, int i5, qeo qeoVar, xqt xqtVar, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, tqh0 tqh0Var2, long j, long j2, long j3, o3g1 o3g1Var, k0g1 k0g1Var) {
        this.a = playbackException;
        this.b = i;
        this.c = xg61Var;
        this.d = p8u0Var;
        this.e = p8u0Var2;
        this.f = i2;
        this.g = k2u0Var;
        this.h = i3;
        this.i = z;
        this.l = z1k1Var;
        this.j = sqe1Var;
        this.k = i4;
        this.m = tqh0Var;
        this.n = f;
        this.o = f2;
        this.f78p = i5;
        this.q = po7Var;
        this.r = qeoVar;
        this.s = xqtVar;
        this.t = i6;
        this.u = z2;
        this.v = z3;
        this.w = i7;
        this.z = i8;
        this.A = i9;
        this.x = z4;
        this.y = z5;
        this.B = tqh0Var2;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = o3g1Var;
        this.G = k0g1Var;
    }

    public static jbu0 q(int i, Bundle bundle) {
        PlaybackException playbackException;
        bg11 bg11VarC;
        bg11 bg11VarC2;
        sqe1 eqe1Var;
        bg11 bg11VarG;
        qeo qeoVar;
        xqt xqtVarH;
        bg11 bg11VarC3;
        o3g1 o3g1Var;
        IBinder binder = bundle.getBinder(o0);
        if (binder instanceof fbu0) {
            return ((fbu0) binder).a;
        }
        Bundle bundle2 = bundle.getBundle(a0);
        Throwable remoteException = null;
        byte b = 1;
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.f);
            String string2 = bundle2.getString(PlaybackException.g);
            String string3 = bundle2.getString(PlaybackException.h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i2 = bundle2.getInt(PlaybackException.d, 1000);
            Bundle bundleP = zoi1.p(bundle2.getBundle(PlaybackException.i));
            if (bundleP == null) {
                bundleP = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i2, bundleP, bundle2.getLong(PlaybackException.e, SystemClock.elapsedRealtime()));
        }
        int i3 = bundle.getInt(c0, 0);
        Bundle bundle3 = bundle.getBundle(b0);
        xg61 xg61VarB = bundle3 == null ? xg61.l : xg61.b(i, bundle3);
        Bundle bundle4 = bundle.getBundle(d0);
        p8u0 p8u0VarC = bundle4 == null ? xg61.k : p8u0.c(i, bundle4);
        Bundle bundle5 = bundle.getBundle(e0);
        p8u0 p8u0VarC2 = bundle5 == null ? xg61.k : p8u0.c(i, bundle5);
        int i4 = bundle.getInt(f0, 0);
        Bundle bundle6 = bundle.getBundle(I);
        k2u0 k2u0Var = bundle6 == null ? k2u0.d : new k2u0(bundle6.getFloat(k2u0.e, 1.0f), bundle6.getFloat(k2u0.f, 1.0f));
        int i5 = bundle.getInt(J, 0);
        boolean z = bundle.getBoolean(K, false);
        Bundle bundle7 = bundle.getBundle(L);
        if (bundle7 == null) {
            eqe1Var = sqe1.a;
        } else {
            ro00 ro00Var = new ro00(i, b);
            IBinder binder2 = bundle7.getBinder(sqe1.b);
            if (binder2 == null) {
                w280 w280Var = b380.b;
                bg11VarC = bg11.e;
            } else {
                bg11VarC = lcc.C(occ.a(binder2), ro00Var);
            }
            ro00 ro00Var2 = new ro00(i, (byte) 2);
            IBinder binder3 = bundle7.getBinder(sqe1.c);
            if (binder3 == null) {
                w280 w280Var2 = b380.b;
                bg11VarC2 = bg11.e;
            } else {
                bg11VarC2 = lcc.C(occ.a(binder3), ro00Var2);
            }
            int[] intArray = bundle7.getIntArray(sqe1.d);
            if (intArray == null) {
                int i6 = bg11VarC.d;
                int[] iArr = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr[i7] = i7;
                }
                intArray = iArr;
            }
            eqe1Var = new eqe1(bg11VarC, bg11VarC2, intArray);
        }
        int i8 = bundle.getInt(n0, 0);
        Bundle bundle8 = bundle.getBundle(M);
        z1k1 z1k1Var = bundle8 == null ? z1k1.d : new z1k1(bundle8.getInt(z1k1.e, 0), bundle8.getInt(z1k1.f, 0), bundle8.getFloat(z1k1.g, 1.0f));
        Bundle bundle9 = bundle.getBundle(N);
        tqh0 tqh0VarB = bundle9 == null ? tqh0.M : tqh0.b(i, bundle9);
        float f = bundle.getFloat(O, 1.0f);
        float f2 = bundle.getFloat(P, 1.0f);
        int i9 = bundle.getInt(p0, 0);
        Bundle bundle10 = bundle.getBundle(Q);
        po7 po7VarA = bundle10 == null ? po7.i : po7.a(bundle10);
        Bundle bundle11 = bundle.getBundle(g0);
        if (bundle11 == null) {
            qeoVar = qeo.d;
            tqh0VarB = tqh0VarB;
            f = f;
            z1k1Var = z1k1Var;
        } else {
            ArrayList parcelableArrayList = bundle11.getParcelableArrayList(qeo.e);
            if (parcelableArrayList == null) {
                w280 w280Var3 = b380.b;
                bg11VarG = bg11.e;
            } else {
                v280 v280VarM = b380.m();
                for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                    Bundle bundle12 = (Bundle) parcelableArrayList.get(i10);
                    bundle12.getClass();
                    v280VarM.c(feo.b(bundle12));
                }
                bg11VarG = v280VarM.g();
            }
            qeoVar = new qeo(bundle11.getLong(qeo.f), bg11VarG);
        }
        Bundle bundle13 = bundle.getBundle(R);
        if (bundle13 == null) {
            xqtVarH = xqt.e;
        } else {
            int i11 = bundle13.getInt(xqt.f, 0);
            int i12 = bundle13.getInt(xqt.g, 0);
            int i13 = bundle13.getInt(xqt.h, 0);
            String string4 = bundle13.getString(xqt.i);
            a9a a9aVar = new a9a(i11);
            a9aVar.c = i12;
            a9aVar.d = i13;
            dm5.m(i11 != 0 || string4 == null);
            a9aVar.e = string4;
            xqtVarH = a9aVar.h();
        }
        int i14 = bundle.getInt(S, 0);
        boolean z2 = bundle.getBoolean(T, false);
        boolean z3 = bundle.getBoolean(U, false);
        int i15 = bundle.getInt(V, 1);
        int i16 = bundle.getInt(W, 0);
        int i17 = bundle.getInt(X, 1);
        boolean z4 = bundle.getBoolean(Y, false);
        boolean z5 = bundle.getBoolean(Z, false);
        Bundle bundle14 = bundle.getBundle(h0);
        tqh0 tqh0VarB2 = bundle14 == null ? tqh0.M : tqh0.b(i, bundle14);
        xqt xqtVar = xqtVarH;
        long j = bundle.getLong(i0, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(j0, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(k0, i < 4 ? 0L : 3000L);
        Bundle bundle15 = bundle.getBundle(m0);
        if (bundle15 == null) {
            o3g1Var = o3g1.b;
        } else {
            ArrayList parcelableArrayList2 = bundle15.getParcelableArrayList(o3g1.c);
            if (parcelableArrayList2 == null) {
                w280 w280Var4 = b380.b;
                bg11VarC3 = bg11.e;
            } else {
                bg11VarC3 = lcc.C(parcelableArrayList2, new cwa((byte) 26));
            }
            o3g1Var = new o3g1(bg11VarC3);
        }
        Bundle bundle16 = bundle.getBundle(l0);
        return new jbu0(playbackException, i3, xg61VarB, p8u0VarC, p8u0VarC2, i4, k2u0Var, i5, z, z1k1Var, eqe1Var, i8, tqh0VarB, f, f2, po7VarA, i9, qeoVar, xqtVar, i14, z2, z3, i15, i16, i17, z4, z5, tqh0VarB2, j, j2, j3, o3g1Var, bundle16 == null ? k0g1.J : k0g1.b(bundle16));
    }

    public final jbu0 a(po7 po7Var) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, po7Var, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 b(o3g1 o3g1Var) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, o3g1Var, this.G);
    }

    public final jbu0 c(int i, boolean z) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, i, z, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 d(int i, int i2, boolean z) {
        int i3 = this.A;
        boolean z2 = i3 == 3 && z && i2 == 0;
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, z, i, i2, i3, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 e(k2u0 k2u0Var) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, k2u0Var, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 f(int i, PlaybackException playbackException) {
        boolean z = this.v;
        int i2 = this.z;
        boolean z2 = i == 3 && z && i2 == 0;
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(playbackException, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, z, this.w, i2, i, z2, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 g(tqh0 tqh0Var) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, tqh0Var, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 h(p8u0 p8u0Var, p8u0 p8u0Var2, int i) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, p8u0Var, p8u0Var2, i, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 i(int i) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, i, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 j(xg61 xg61Var) {
        sqe1 sqe1Var = this.j;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 k(boolean z) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, z, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 l(sqe1 sqe1Var) {
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 m(sqe1 sqe1Var, xg61 xg61Var, int i) {
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, i, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 n(k0g1 k0g1Var) {
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, this.n, this.o, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, k0g1Var);
    }

    public final jbu0 o(float f) {
        float f2 = f != 0.0f ? f : this.n;
        sqe1 sqe1Var = this.j;
        boolean zP = sqe1Var.p();
        xg61 xg61Var = this.c;
        dm5.y(zP || xg61Var.a.b < sqe1Var.o());
        return new jbu0(this.a, this.b, xg61Var, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, this.m, f, f2, this.q, this.f78p, this.r, this.s, this.t, this.u, this.v, this.w, this.z, this.A, this.x, this.y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final jbu0 p(m8u0 m8u0Var, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean zA = m8u0Var.a(16);
        boolean zA2 = m8u0Var.a(17);
        xg61 xg61Var = this.c;
        xg61 xg61VarA = xg61Var.a(zA, zA2);
        p8u0 p8u0VarB = this.d.b(zA, zA2);
        p8u0 p8u0VarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        sqe1 eqe1Var = this.j;
        if (!zA2 && zA && !eqe1Var.p()) {
            int i3 = xg61Var.a.b;
            if (eqe1Var.o() != 1) {
                oqe1 oqe1VarN = eqe1Var.n(i3, new oqe1(), 0L);
                v280 v280VarM = b380.m();
                int i4 = oqe1VarN.n;
                while (true) {
                    i2 = oqe1VarN.o;
                    if (i4 > i2) {
                        break;
                    }
                    dqe1 dqe1VarF = eqe1Var.f(i4, new dqe1(), true);
                    dqe1VarF.c = 0;
                    v280VarM.c(dqe1VarF);
                    i4++;
                }
                oqe1VarN.o = i2 - oqe1VarN.n;
                oqe1VarN.n = 0;
                eqe1Var = new eqe1(b380.t(oqe1VarN), v280VarM.g(), new int[]{0});
            }
        } else if (z || !zA2) {
            eqe1Var = sqe1.a;
        }
        sqe1 sqe1Var = eqe1Var;
        tqh0 tqh0Var = !m8u0Var.a(18) ? tqh0.M : this.m;
        if (m8u0Var.a(22)) {
            f = this.n;
            f2 = this.o;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        po7 po7Var = !m8u0Var.a(21) ? po7.i : this.q;
        qeo qeoVar = !m8u0Var.a(28) ? qeo.d : this.r;
        if (m8u0Var.a(23)) {
            i = this.t;
            z3 = this.u;
        } else {
            i = 0;
            z3 = false;
        }
        tqh0 tqh0Var2 = !m8u0Var.a(18) ? tqh0.M : this.B;
        o3g1 o3g1Var = (z2 || !m8u0Var.a(30)) ? o3g1.b : this.F;
        if (!sqe1Var.p() && xg61VarA.a.b >= sqe1Var.o()) {
            z4 = false;
        }
        dm5.y(z4);
        return new jbu0(this.a, this.b, xg61VarA, p8u0VarB, p8u0VarB2, this.f, this.g, this.h, this.i, this.l, sqe1Var, this.k, tqh0Var, f, f2, po7Var, this.f78p, qeoVar, this.s, i, z3, this.v, this.w, this.z, this.A, this.x, this.y, tqh0Var2, this.C, this.D, this.E, o3g1Var, this.G);
    }

    public final yoh0 r() {
        sqe1 sqe1Var = this.j;
        if (sqe1Var.p()) {
            return null;
        }
        return sqe1Var.n(this.c.a.b, new oqe1(), 0L).c;
    }

    public final Bundle s(int i) {
        long j;
        int i2;
        Bundle bundle;
        ArrayList arrayList;
        sqe1 sqe1Var;
        int i3;
        Bundle bundle2;
        int i4 = i;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(PlaybackException.d, playbackException.a);
            bundle4.putLong(PlaybackException.e, playbackException.b);
            bundle4.putString(PlaybackException.f, playbackException.getMessage());
            bundle4.putBundle(PlaybackException.i, playbackException.c);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle4.putString(PlaybackException.g, cause.getClass().getName());
                bundle4.putString(PlaybackException.h, cause.getMessage());
            }
            bundle3.putBundle(a0, bundle4);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle3.putInt(c0, i5);
        }
        xg61 xg61Var = this.c;
        if (i4 < 3 || !xg61Var.equals(xg61.l)) {
            bundle3.putBundle(b0, xg61Var.c(i4));
        }
        p8u0 p8u0Var = this.d;
        if (i4 < 3 || !xg61.k.a(p8u0Var)) {
            bundle3.putBundle(d0, p8u0Var.d(i4));
        }
        p8u0 p8u0Var2 = this.e;
        if (i4 < 3 || !xg61.k.a(p8u0Var2)) {
            bundle3.putBundle(e0, p8u0Var2.d(i4));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle3.putInt(f0, i6);
        }
        k2u0 k2u0Var = k2u0.d;
        k2u0 k2u0Var2 = this.g;
        if (!k2u0Var2.equals(k2u0Var)) {
            Bundle bundle5 = new Bundle();
            bundle5.putFloat(k2u0.e, k2u0Var2.a);
            bundle5.putFloat(k2u0.f, k2u0Var2.b);
            bundle3.putBundle(I, bundle5);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle3.putInt(J, i7);
        }
        boolean z = this.i;
        if (z) {
            bundle3.putBoolean(K, z);
        }
        cqe1 cqe1Var = sqe1.a;
        sqe1 sqe1Var2 = this.j;
        int i8 = 0;
        boolean z2 = true;
        long j2 = 0;
        if (sqe1Var2.equals(cqe1Var)) {
            j = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int iO = sqe1Var2.o();
            oqe1 oqe1Var = new oqe1();
            int i9 = 0;
            while (i9 < iO) {
                oqe1 oqe1VarN = sqe1Var2.n(i9, oqe1Var, j2);
                oqe1VarN.getClass();
                Bundle bundle6 = new Bundle();
                long j3 = j2;
                if (!yoh0.g.equals(oqe1VarN.c)) {
                    bundle6.putBundle(oqe1.s, oqe1VarN.c.e(i4, false));
                }
                long j4 = oqe1VarN.e;
                if (j4 != -9223372036854775807L) {
                    bundle6.putLong(oqe1.t, j4);
                }
                long j5 = oqe1VarN.f;
                if (j5 != r12) {
                    bundle6.putLong(oqe1.u, j5);
                }
                long j6 = oqe1VarN.g;
                if (j6 != r12) {
                    bundle6.putLong(oqe1.v, j6);
                }
                boolean z3 = oqe1VarN.h;
                if (z3) {
                    bundle6.putBoolean(oqe1.w, z3);
                }
                boolean z4 = oqe1VarN.i;
                if (z4) {
                    bundle6.putBoolean(oqe1.x, z4);
                }
                roh0 roh0Var = oqe1VarN.j;
                if (roh0Var != null) {
                    bundle6.putBundle(oqe1.y, roh0Var.c());
                }
                boolean z5 = oqe1VarN.k;
                if (z5) {
                    bundle6.putBoolean(oqe1.z, z5);
                }
                long j7 = oqe1VarN.l;
                if (j7 != j3) {
                    bundle6.putLong(oqe1.A, j7);
                }
                long j8 = oqe1VarN.m;
                if (j8 != -9223372036854775807) {
                    bundle6.putLong(oqe1.B, j8);
                }
                int i10 = oqe1VarN.n;
                if (i10 != 0) {
                    bundle6.putInt(oqe1.C, i10);
                }
                int i11 = oqe1VarN.o;
                if (i11 != 0) {
                    bundle6.putInt(oqe1.D, i11);
                }
                long j9 = oqe1VarN.f108p;
                if (j9 != j3) {
                    bundle6.putLong(oqe1.E, j9);
                }
                Object obj = oqe1VarN.a;
                if (obj instanceof String) {
                    bundle6.putString(oqe1.F, (String) obj);
                }
                arrayList2.add(bundle6);
                i9++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList3 = new ArrayList();
            int iH = sqe1Var2.h();
            dqe1 dqe1Var = new dqe1();
            int i12 = 0;
            while (i12 < iH) {
                dqe1 dqe1VarF = sqe1Var2.f(i12, dqe1Var, z2);
                dqe1VarF.getClass();
                Bundle bundle7 = new Bundle();
                int i13 = dqe1VarF.c;
                if (i13 != 0) {
                    bundle7.putInt(dqe1.h, i13);
                }
                long j10 = dqe1VarF.d;
                if (j10 != -9223372036854775807L) {
                    bundle7.putLong(dqe1.i, j10);
                }
                long j11 = dqe1VarF.e;
                if (j11 != j) {
                    bundle7.putLong(dqe1.j, j11);
                }
                boolean z6 = dqe1VarF.f;
                if (z6) {
                    bundle7.putBoolean(dqe1.k, z6);
                }
                if (dqe1VarF.g.equals(ev0.f)) {
                    bundle = bundle3;
                    arrayList = arrayList2;
                    sqe1Var = sqe1Var2;
                    i3 = i12;
                } else {
                    String str = dqe1.l;
                    ev0 ev0Var = dqe1VarF.g;
                    ev0Var.getClass();
                    Bundle bundle8 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    bv0[] bv0VarArr = ev0Var.e;
                    int length = bv0VarArr.length;
                    int i14 = i8;
                    while (i14 < length) {
                        int i15 = i14;
                        bv0 bv0Var = bv0VarArr[i15];
                        bv0Var.getClass();
                        int i16 = length;
                        Bundle bundle9 = new Bundle();
                        int i17 = i12;
                        Bundle bundle10 = bundle3;
                        ArrayList arrayList5 = arrayList2;
                        bundle9.putLong(bv0.m, bv0Var.a);
                        bundle9.putInt(bv0.n, bv0Var.b);
                        bundle9.putInt(bv0.t, bv0Var.c);
                        bundle9.putParcelableArrayList(bv0.o, new ArrayList<>(Arrays.asList(bv0Var.d)));
                        String str2 = bv0.u;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        yoh0[] yoh0VarArr = bv0Var.e;
                        int length2 = yoh0VarArr.length;
                        int i18 = i8;
                        while (true) {
                            Bundle bundleE = null;
                            if (i18 >= length2) {
                                break;
                            }
                            int i19 = length2;
                            yoh0 yoh0Var = yoh0VarArr[i18];
                            if (yoh0Var != null) {
                                bundleE = yoh0Var.e(i4, true);
                            }
                            arrayList6.add(bundleE);
                            i18++;
                            length2 = i19;
                        }
                        bundle9.putParcelableArrayList(str2, arrayList6);
                        bundle9.putIntArray(bv0.f19p, bv0Var.f);
                        bundle9.putLongArray(bv0.q, bv0Var.g);
                        bundle9.putLong(bv0.r, bv0Var.j);
                        bundle9.putBoolean(bv0.s, bv0Var.k);
                        bundle9.putStringArrayList(bv0.v, new ArrayList<>(Arrays.asList(bv0Var.h)));
                        String str3 = bv0.x;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        cv0[] cv0VarArr = bv0Var.i;
                        int length3 = cv0VarArr.length;
                        int i20 = i8;
                        while (i20 < length3) {
                            int i21 = i20;
                            cv0 cv0Var = cv0VarArr[i21];
                            if (cv0Var == null) {
                                bundle2 = null;
                            } else {
                                bundle2 = new Bundle();
                                bundle2.putLong(cv0.d, cv0Var.a);
                                bundle2.putLong(cv0.e, cv0Var.b);
                                bundle2.putString(cv0.f, cv0Var.c);
                            }
                            arrayList7.add(bundle2);
                            i20 = i21 + 1;
                            length3 = length3;
                            sqe1Var2 = sqe1Var2;
                            str = str;
                        }
                        bundle9.putParcelableArrayList(str3, arrayList7);
                        bundle9.putBoolean(bv0.w, bv0Var.l);
                        arrayList4.add(bundle9);
                        i14 = i15 + 1;
                        i4 = i;
                        length = i16;
                        i12 = i17;
                        bundle3 = bundle10;
                        arrayList2 = arrayList5;
                    }
                    bundle = bundle3;
                    arrayList = arrayList2;
                    sqe1Var = sqe1Var2;
                    String str4 = str;
                    i3 = i12;
                    if (!arrayList4.isEmpty()) {
                        bundle8.putParcelableArrayList(ev0.h, arrayList4);
                    }
                    long j12 = ev0Var.b;
                    if (j12 != j) {
                        bundle8.putLong(ev0.i, j12);
                    }
                    long j13 = ev0Var.c;
                    if (j13 != -9223372036854775807L) {
                        bundle8.putLong(ev0.j, j13);
                    }
                    int i22 = ev0Var.d;
                    if (i22 != 0) {
                        bundle8.putInt(ev0.k, i22);
                    }
                    bundle7.putBundle(str4, bundle8);
                }
                Object obj2 = dqe1VarF.a;
                if (obj2 instanceof String) {
                    bundle7.putString(dqe1.m, (String) obj2);
                }
                Object obj3 = dqe1VarF.b;
                if (obj3 instanceof String) {
                    bundle7.putString(dqe1.n, (String) obj3);
                }
                arrayList3.add(bundle7);
                i12 = i3 + 1;
                i4 = i;
                i8 = i8;
                iH = iH;
                dqe1Var = dqe1Var;
                bundle3 = bundle;
                arrayList2 = arrayList;
                sqe1Var2 = sqe1Var;
                z2 = true;
            }
            Bundle bundle11 = bundle3;
            ArrayList arrayList8 = arrayList2;
            sqe1 sqe1Var3 = sqe1Var2;
            int i23 = i8;
            int[] iArr = new int[iO];
            boolean z7 = true;
            if (iO > 0) {
                iArr[i23] = sqe1Var3.a(true);
            }
            int i24 = 1;
            while (i24 < iO) {
                iArr[i24] = sqe1Var3.e(iArr[i24 - 1], i23, z7);
                i24++;
                z7 = true;
                i23 = 0;
            }
            Bundle bundle12 = new Bundle();
            bundle12.putBinder(sqe1.b, new occ(arrayList8));
            bundle12.putBinder(sqe1.c, new occ(arrayList3));
            bundle12.putIntArray(sqe1.d, iArr);
            bundle3 = bundle11;
            bundle3.putBundle(L, bundle12);
        }
        int i25 = this.k;
        if (i25 != 0) {
            bundle3.putInt(n0, i25);
        }
        z1k1 z1k1Var = z1k1.d;
        z1k1 z1k1Var2 = this.l;
        if (!z1k1Var2.equals(z1k1Var)) {
            Bundle bundle13 = new Bundle();
            int i26 = z1k1Var2.a;
            if (i26 != 0) {
                bundle13.putInt(z1k1.e, i26);
            }
            int i27 = z1k1Var2.b;
            if (i27 != 0) {
                bundle13.putInt(z1k1.f, i27);
            }
            float f = z1k1Var2.c;
            if (f != 1.0f) {
                bundle13.putFloat(z1k1.g, f);
            }
            bundle3.putBundle(M, bundle13);
        }
        tqh0 tqh0Var = tqh0.M;
        tqh0 tqh0Var2 = this.m;
        if (tqh0Var2.equals(tqh0Var)) {
            i2 = i;
        } else {
            i2 = i;
            bundle3.putBundle(N, tqh0Var2.c(i2));
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle3.putFloat(O, f2);
        }
        float f3 = this.o;
        if (f3 != 1.0f) {
            bundle3.putFloat(P, f3);
        }
        int i28 = this.f78p;
        if (i28 != 0) {
            bundle3.putInt(p0, i28);
        }
        po7 po7Var = po7.i;
        po7 po7Var2 = this.q;
        if (!po7Var2.equals(po7Var)) {
            bundle3.putBundle(Q, po7Var2.d());
        }
        qeo qeoVar = qeo.d;
        qeo qeoVar2 = this.r;
        if (!qeoVar2.equals(qeoVar)) {
            Bundle bundle14 = new Bundle();
            String str5 = qeo.e;
            bg11 bg11Var = qeoVar2.a;
            v280 v280VarM = b380.m();
            for (int i29 = 0; i29 < bg11Var.d; i29++) {
                if (((feo) bg11Var.get(i29)).d == null) {
                    v280VarM.c((feo) bg11Var.get(i29));
                }
            }
            bg11 bg11VarG = v280VarM.g();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(bg11VarG.d);
            w280 w280VarR = bg11VarG.r(0);
            while (w280VarR.hasNext()) {
                feo feoVar = (feo) w280VarR.next();
                Bundle bundleC = feoVar.c();
                Bitmap bitmap = feoVar.d;
                if (bitmap != null) {
                    bundleC.putParcelable(feo.w, bitmap);
                }
                arrayList9.add(bundleC);
            }
            bundle14.putParcelableArrayList(str5, arrayList9);
            bundle14.putLong(qeo.f, qeoVar2.b);
            bundle3.putBundle(g0, bundle14);
        }
        xqt xqtVar = xqt.e;
        xqt xqtVar2 = this.s;
        if (!xqtVar2.equals(xqtVar)) {
            Bundle bundle15 = new Bundle();
            int i30 = xqtVar2.a;
            if (i30 != 0) {
                bundle15.putInt(xqt.f, i30);
            }
            int i31 = xqtVar2.b;
            if (i31 != 0) {
                bundle15.putInt(xqt.g, i31);
            }
            int i32 = xqtVar2.c;
            if (i32 != 0) {
                bundle15.putInt(xqt.h, i32);
            }
            String str6 = xqtVar2.d;
            if (str6 != null) {
                bundle15.putString(xqt.i, str6);
            }
            bundle3.putBundle(R, bundle15);
        }
        int i33 = this.t;
        if (i33 != 0) {
            bundle3.putInt(S, i33);
        }
        boolean z8 = this.u;
        if (z8) {
            bundle3.putBoolean(T, z8);
        }
        boolean z9 = this.v;
        if (z9) {
            bundle3.putBoolean(U, z9);
        }
        int i34 = this.w;
        if (i34 != 1) {
            bundle3.putInt(V, i34);
        }
        int i35 = this.z;
        if (i35 != 0) {
            bundle3.putInt(W, i35);
        }
        int i36 = this.A;
        if (i36 != 1) {
            bundle3.putInt(X, i36);
        }
        boolean z10 = this.x;
        if (z10) {
            bundle3.putBoolean(Y, z10);
        }
        boolean z11 = this.y;
        if (z11) {
            bundle3.putBoolean(Z, z11);
        }
        tqh0 tqh0Var3 = tqh0.M;
        tqh0 tqh0Var4 = this.B;
        if (!tqh0Var4.equals(tqh0Var3)) {
            bundle3.putBundle(h0, tqh0Var4.c(i2));
        }
        long j14 = i2 < 6 ? j : 5000L;
        long j15 = this.C;
        if (j15 != j14) {
            bundle3.putLong(i0, j15);
        }
        long j16 = i2 < 6 ? j : 15000L;
        long j17 = this.D;
        if (j17 != j16) {
            bundle3.putLong(j0, j17);
        }
        long j18 = i2 < 6 ? j : 3000L;
        long j19 = this.E;
        if (j19 != j18) {
            bundle3.putLong(k0, j19);
        }
        o3g1 o3g1Var = o3g1.b;
        o3g1 o3g1Var2 = this.F;
        if (!o3g1Var2.equals(o3g1Var)) {
            Bundle bundle16 = new Bundle();
            bundle16.putParcelableArrayList(o3g1.c, lcc.E(o3g1Var2.a, new cwa((byte) 25)));
            bundle3.putBundle(m0, bundle16);
        }
        k0g1 k0g1Var = k0g1.J;
        k0g1 k0g1Var2 = this.G;
        if (!k0g1Var2.equals(k0g1Var)) {
            bundle3.putBundle(l0, k0g1Var2.c());
        }
        return bundle3;
    }
}
