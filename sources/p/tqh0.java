package p;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tqh0 {
    public static final tqh0 M = new tqh0(new upq());
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
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final CharSequence D;
    public final Integer E;
    public final Integer F;
    public final CharSequence G;
    public final CharSequence H;
    public final CharSequence I;
    public final Integer J;
    public final Bundle K;
    public final b380 L;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final esz0 i;
    public final esz0 j;
    public final byte[] k;
    public xcc l;
    public final Integer m;
    public final Uri n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f142p;
    public final Integer q;
    public final Boolean r;
    public final Boolean s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final Integer z;

    static {
        String str = zoi1.a;
        N = Integer.toString(0, 36);
        O = Integer.toString(1, 36);
        P = Integer.toString(2, 36);
        Q = Integer.toString(3, 36);
        R = Integer.toString(4, 36);
        S = Integer.toString(5, 36);
        T = Integer.toString(6, 36);
        U = Integer.toString(8, 36);
        V = Integer.toString(9, 36);
        W = Integer.toString(10, 36);
        X = Integer.toString(11, 36);
        Y = Integer.toString(12, 36);
        Z = Integer.toString(13, 36);
        a0 = Integer.toString(14, 36);
        b0 = Integer.toString(15, 36);
        c0 = Integer.toString(16, 36);
        d0 = Integer.toString(17, 36);
        e0 = Integer.toString(18, 36);
        f0 = Integer.toString(19, 36);
        g0 = Integer.toString(20, 36);
        h0 = Integer.toString(21, 36);
        i0 = Integer.toString(22, 36);
        j0 = Integer.toString(23, 36);
        k0 = Integer.toString(24, 36);
        l0 = Integer.toString(25, 36);
        m0 = Integer.toString(26, 36);
        n0 = Integer.toString(27, 36);
        o0 = Integer.toString(28, 36);
        p0 = Integer.toString(29, 36);
        q0 = Integer.toString(30, 36);
        r0 = Integer.toString(31, 36);
        s0 = Integer.toString(32, 36);
        t0 = Integer.toString(33, 36);
        u0 = Integer.toString(34, 36);
        v0 = Integer.toString(35, 36);
        w0 = Integer.toString(1000, 36);
    }

    public tqh0(upq upqVar) {
        Boolean boolValueOf = (Boolean) upqVar.r;
        Integer numValueOf = (Integer) upqVar.q;
        Integer numValueOf2 = (Integer) upqVar.I;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            break;
                        case 20:
                        case 26:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case RendererMetrics.SAMPLES /* 30 */:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = (CharSequence) upqVar.a;
        this.b = (CharSequence) upqVar.b;
        this.c = (CharSequence) upqVar.c;
        this.d = (CharSequence) upqVar.d;
        this.e = (CharSequence) upqVar.e;
        this.f = (CharSequence) upqVar.f;
        this.g = (CharSequence) upqVar.g;
        this.h = (Long) upqVar.h;
        this.i = (esz0) upqVar.i;
        this.j = (esz0) upqVar.j;
        this.k = (byte[]) upqVar.k;
        this.l = (xcc) upqVar.l;
        this.m = (Integer) upqVar.m;
        this.n = (Uri) upqVar.n;
        this.o = (Integer) upqVar.o;
        this.f142p = (Integer) upqVar.f152p;
        this.q = numValueOf;
        this.r = boolValueOf;
        this.s = (Boolean) upqVar.s;
        Integer num = (Integer) upqVar.t;
        this.t = num;
        this.u = num;
        this.v = (Integer) upqVar.u;
        this.w = (Integer) upqVar.v;
        this.x = (Integer) upqVar.w;
        this.y = (Integer) upqVar.x;
        this.z = (Integer) upqVar.y;
        this.A = (CharSequence) upqVar.z;
        this.B = (CharSequence) upqVar.A;
        this.C = (CharSequence) upqVar.B;
        this.D = (CharSequence) upqVar.C;
        this.E = (Integer) upqVar.D;
        this.F = (Integer) upqVar.E;
        this.G = (CharSequence) upqVar.F;
        this.H = (CharSequence) upqVar.G;
        this.I = (CharSequence) upqVar.H;
        this.J = numValueOf2;
        this.L = (b380) upqVar.K;
        this.K = (Bundle) upqVar.J;
    }

    public static tqh0 b(int i, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        upq upqVar = new upq();
        upqVar.a = bundle.getCharSequence(N);
        upqVar.b = bundle.getCharSequence(O);
        upqVar.c = bundle.getCharSequence(P);
        upqVar.d = bundle.getCharSequence(Q);
        upqVar.e = bundle.getCharSequence(R);
        upqVar.f = bundle.getCharSequence(S);
        upqVar.g = bundle.getCharSequence(T);
        upqVar.n = (Uri) bundle.getParcelable(X);
        upqVar.z = bundle.getCharSequence(i0);
        upqVar.A = bundle.getCharSequence(j0);
        upqVar.B = bundle.getCharSequence(k0);
        upqVar.C = bundle.getCharSequence(v0);
        upqVar.F = bundle.getCharSequence(n0);
        upqVar.G = bundle.getCharSequence(o0);
        upqVar.H = bundle.getCharSequence(q0);
        upqVar.J = zoi1.p(bundle.getBundle(w0));
        String str = W;
        if (bundle.containsKey(str)) {
            String str2 = p0;
            byte[] bArrA = null;
            Integer numValueOf = bundle.containsKey(str2) ? Integer.valueOf(bundle.getInt(str2)) : null;
            if (i >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(xcc.e);
                    if (binder != null) {
                        if (binder instanceof ucc) {
                            int i2 = ucc.l;
                            bArrA = ((ucc) binder).a.a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArrA = vcc.b(bundle4)) == null) {
                            bArrA = wcc.a(bundle4);
                        }
                    }
                    upqVar.c(bArrA, numValueOf);
                }
            } else {
                upqVar.c(bundle.getByteArray(str), numValueOf);
            }
        }
        String str3 = U;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            upqVar.i = esz0.a(bundle3);
        }
        String str4 = V;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            upqVar.j = esz0.a(bundle2);
        }
        String str5 = t0;
        if (bundle.containsKey(str5)) {
            upqVar.d(Long.valueOf(bundle.getLong(str5)));
        }
        String str6 = Y;
        if (bundle.containsKey(str6)) {
            upqVar.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Z;
        if (bundle.containsKey(str7)) {
            upqVar.f152p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = a0;
        if (bundle.containsKey(str8)) {
            upqVar.q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = s0;
        if (bundle.containsKey(str9)) {
            upqVar.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = b0;
        if (bundle.containsKey(str10)) {
            upqVar.s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = c0;
        if (bundle.containsKey(str11)) {
            upqVar.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = d0;
        if (bundle.containsKey(str12)) {
            upqVar.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = e0;
        if (bundle.containsKey(str13)) {
            upqVar.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f0;
        if (bundle.containsKey(str14)) {
            upqVar.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = g0;
        if (bundle.containsKey(str15)) {
            upqVar.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = h0;
        if (bundle.containsKey(str16)) {
            upqVar.y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = l0;
        if (bundle.containsKey(str17)) {
            upqVar.D = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = m0;
        if (bundle.containsKey(str18)) {
            upqVar.E = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = r0;
        if (bundle.containsKey(str19)) {
            upqVar.I = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(u0);
        if (stringArrayList != null) {
            upqVar.K = b380.p(stringArrayList);
        }
        return new tqh0(upqVar);
    }

    public final upq a() {
        upq upqVar = new upq();
        upqVar.a = this.a;
        upqVar.b = this.b;
        upqVar.c = this.c;
        upqVar.d = this.d;
        upqVar.e = this.e;
        upqVar.f = this.f;
        upqVar.g = this.g;
        upqVar.h = this.h;
        upqVar.i = this.i;
        upqVar.j = this.j;
        upqVar.k = this.k;
        upqVar.l = this.l;
        upqVar.m = this.m;
        upqVar.n = this.n;
        upqVar.o = this.o;
        upqVar.f152p = this.f142p;
        upqVar.q = this.q;
        upqVar.r = this.r;
        upqVar.s = this.s;
        upqVar.t = this.u;
        upqVar.u = this.v;
        upqVar.v = this.w;
        upqVar.w = this.x;
        upqVar.x = this.y;
        upqVar.y = this.z;
        upqVar.z = this.A;
        upqVar.A = this.B;
        upqVar.B = this.C;
        upqVar.D = this.E;
        upqVar.C = this.D;
        upqVar.E = this.F;
        upqVar.F = this.G;
        upqVar.G = this.H;
        upqVar.H = this.I;
        upqVar.I = this.J;
        upqVar.K = this.L;
        upqVar.J = this.K;
        return upqVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    public final Bundle c(int i) {
        wcc wccVar;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(N, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(O, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(P, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(Q, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(R, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(S, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(T, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(t0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            String str = W;
            if (i >= 9) {
                xcc xccVar = this.l;
                if (xccVar == null) {
                    xccVar = new xcc(bArr);
                    this.l = xccVar;
                }
                byte[] bArr2 = xccVar.a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(xcc.e, xccVar.b);
                if (Build.VERSION.SDK_INT < 27 || bArr2.length <= 0) {
                    wccVar = xccVar.d;
                    if (wccVar == null) {
                        wccVar = new wcc(bArr2);
                        xccVar.d = wccVar;
                    }
                    int i2 = wcc.b;
                    bundle2.putBinder(xcc.g, wccVar.a);
                } else {
                    vcc vccVarA = xccVar.c;
                    if (vccVarA == null) {
                        vccVarA = vcc.a(bArr2);
                        xccVar.c = vccVarA;
                    }
                    if (vccVarA != null) {
                        bundle2.putParcelable(xcc.f, vccVarA.a);
                    } else {
                        wccVar = xccVar.d;
                        if (wccVar == null) {
                            wccVar = new wcc(bArr2);
                            xccVar.d = wccVar;
                        }
                        int i3 = wcc.b;
                        bundle2.putBinder(xcc.g, wccVar.a);
                    }
                }
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.n;
        if (uri != null) {
            bundle.putParcelable(X, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(i0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(j0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(k0, charSequence10);
        }
        CharSequence charSequence11 = this.G;
        if (charSequence11 != null) {
            bundle.putCharSequence(n0, charSequence11);
        }
        CharSequence charSequence12 = this.H;
        if (charSequence12 != null) {
            bundle.putCharSequence(o0, charSequence12);
        }
        CharSequence charSequence13 = this.I;
        if (charSequence13 != null) {
            bundle.putCharSequence(q0, charSequence13);
        }
        esz0 esz0Var = this.i;
        if (esz0Var != null) {
            bundle.putBundle(U, esz0Var.c());
        }
        esz0 esz0Var2 = this.j;
        if (esz0Var2 != null) {
            bundle.putBundle(V, esz0Var2.c());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt(Y, num.intValue());
        }
        Integer num2 = this.f142p;
        if (num2 != null) {
            bundle.putInt(Z, num2.intValue());
        }
        Integer num3 = this.q;
        if (num3 != null) {
            bundle.putInt(a0, num3.intValue());
        }
        Boolean bool = this.r;
        if (bool != null) {
            bundle.putBoolean(s0, bool.booleanValue());
        }
        Boolean bool2 = this.s;
        if (bool2 != null) {
            bundle.putBoolean(b0, bool2.booleanValue());
        }
        Integer num4 = this.u;
        if (num4 != null) {
            bundle.putInt(c0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(d0, num5.intValue());
        }
        Integer num6 = this.w;
        if (num6 != null) {
            bundle.putInt(e0, num6.intValue());
        }
        Integer num7 = this.x;
        if (num7 != null) {
            bundle.putInt(f0, num7.intValue());
        }
        Integer num8 = this.y;
        if (num8 != null) {
            bundle.putInt(g0, num8.intValue());
        }
        Integer num9 = this.z;
        if (num9 != null) {
            bundle.putInt(h0, num9.intValue());
        }
        Integer num10 = this.E;
        if (num10 != null) {
            bundle.putInt(l0, num10.intValue());
        }
        CharSequence charSequence14 = this.D;
        if (charSequence14 != null) {
            bundle.putCharSequence(v0, charSequence14);
        }
        Integer num11 = this.F;
        if (num11 != null) {
            bundle.putInt(m0, num11.intValue());
        }
        Integer num12 = this.m;
        if (num12 != null) {
            bundle.putInt(p0, num12.intValue());
        }
        Integer num13 = this.J;
        if (num13 != null) {
            bundle.putInt(r0, num13.intValue());
        }
        b380 b380Var = this.L;
        if (!b380Var.isEmpty()) {
            bundle.putStringArrayList(u0, new ArrayList<>((Collection) b380Var));
        }
        Bundle bundle3 = this.K;
        if (bundle3 != null) {
            bundle.putBundle(w0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tqh0.class == obj.getClass()) {
            tqh0 tqh0Var = (tqh0) obj;
            if (TextUtils.equals(this.a, tqh0Var.a) && TextUtils.equals(this.b, tqh0Var.b) && TextUtils.equals(this.c, tqh0Var.c) && TextUtils.equals(this.d, tqh0Var.d) && TextUtils.equals(this.e, tqh0Var.e) && TextUtils.equals(this.f, tqh0Var.f) && TextUtils.equals(this.g, tqh0Var.g) && Objects.equals(this.h, tqh0Var.h) && Objects.equals(this.i, tqh0Var.i) && Objects.equals(this.j, tqh0Var.j) && Arrays.equals(this.k, tqh0Var.k) && Objects.equals(this.m, tqh0Var.m) && Objects.equals(this.n, tqh0Var.n) && Objects.equals(this.o, tqh0Var.o) && Objects.equals(this.f142p, tqh0Var.f142p) && Objects.equals(this.q, tqh0Var.q) && Objects.equals(this.r, tqh0Var.r) && Objects.equals(this.s, tqh0Var.s) && Objects.equals(this.u, tqh0Var.u) && Objects.equals(this.v, tqh0Var.v) && Objects.equals(this.w, tqh0Var.w) && Objects.equals(this.x, tqh0Var.x) && Objects.equals(this.y, tqh0Var.y) && Objects.equals(this.z, tqh0Var.z) && TextUtils.equals(this.A, tqh0Var.A) && TextUtils.equals(this.B, tqh0Var.B) && TextUtils.equals(this.C, tqh0Var.C) && TextUtils.equals(this.D, tqh0Var.D) && Objects.equals(this.E, tqh0Var.E) && Objects.equals(this.F, tqh0Var.F) && TextUtils.equals(this.G, tqh0Var.G) && TextUtils.equals(this.H, tqh0Var.H) && TextUtils.equals(this.I, tqh0Var.I) && Objects.equals(this.J, tqh0Var.J) && Objects.equals(this.L, tqh0Var.L)) {
                if ((this.K == null) == (tqh0Var.K == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.m, this.n, this.o, this.f142p, this.q, this.r, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, Boolean.valueOf(this.K == null), this.L);
    }
}
