package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.util.SizeF;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class mno1 {
    public static final gn10 A;
    public static final gn10 B;
    public static final gn10 C;
    public static final gn10 D;
    public static final gn10 E;
    public static final gn10 F;
    public static final gn10 G;
    public static final gn10 H;
    public static final gn10 I;
    public static final gn10 J;
    public static final gn10 K;
    public static final gn10 L;
    public static final gn10 M;
    public static final gn10 N;
    public static final gn10 O;
    public static final gn10 P;
    public static final gn10 Q;
    public static final gn10 R;
    public static final gn10 S;
    public static final gn10 T;
    public static final gn10 U;
    public static final gn10 V;
    public static final gn10 W;
    public static final gn10 X;
    public static final gn10 Y;
    public static final gn10 Z;
    public static final gn10 a = new gn10("album");
    public static final gn10 a0;
    public static final gn10 b;
    public static final gn10 b0;
    public static final gn10 c;
    public static final gn10 c0;
    public static final gn10 d;
    public static final gn10 d0;
    public static final gn10 e;
    public static final gn10 e0;
    public static final gn10 f;
    public static final gn10 f0;
    public static final gn10 g;
    public static final gn10 g0;
    public static final gn10 h;
    public static final gn10 h0;
    public static final gn10 i;
    public static final gn10 i0;
    public static final gn10 j;
    public static final gn10 j0;
    public static final gn10 k;
    public static final gn10 k0;
    public static final gn10 l;
    public static final gn10 l0;
    public static final gn10 m;
    public static final gn10 m0;
    public static final gn10 n;
    public static final gn10 n0;
    public static final gn10 o;
    public static final gn10 o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final gn10 f74p;
    public static final gn10 p0;
    public static final gn10 q;
    public static final gn10 q0;
    public static final gn10 r;
    public static final char[] r0;
    public static final gn10 s;
    public static b180 s0 = null;
    public static final gn10 t;
    public static boolean t0 = true;
    public static final gn10 u;
    public static final gn10 v;
    public static final gn10 w;
    public static final gn10 x;
    public static final gn10 y;
    public static final gn10 z;

    static {
        new gn10("android-auto");
        new gn10("app_integration");
        b = new gn10("artist");
        new gn10("avrcp");
        c = new gn10("blend");
        d = new gn10("browse");
        e = new gn10("campfire");
        f = new gn10("collection");
        g = new gn10("collection-album");
        h = new gn10("collection-albums");
        i = new gn10("collection-artist");
        j = new gn10("collection-artists");
        k = new gn10("collection-playlists");
        l = new gn10("collection-radio");
        m = new gn10("collection-songs");
        n = new gn10("collection-podcasts");
        o = new gn10("collection-podcasts-downloads");
        f74p = new gn10("collection-podcasts-episodes");
        q = new gn10("collection-podcasts-following");
        r = new gn10("comments-card");
        s = new gn10("comments-sheet");
        t = new gn10("concert-campaigns");
        u = new gn10("creator-artist-biography");
        v = new gn10("custom-shortcuts");
        w = new gn10("settings-languages-music");
        new gn10("external-integration-service");
        x = new gn10("find");
        y = new gn10("find-in-show");
        z = new gn10("free-tier-collection");
        A = new gn10("free-tier-track");
        new gn10("google-clock");
        B = new gn10("home");
        C = new gn10("concerts-entity");
        D = new gn10("infinite-playback");
        E = new gn10("licenses");
        F = new gn10("listening-parties");
        G = new gn10("live-room-now-playing-bar");
        H = new gn10("made-for-you-hub");
        I = new gn10("marquee");
        new gn10("media-resumption");
        J = new gn10("mini-player");
        K = new gn10("music-playback-speed");
        L = new gn10("notification-settings");
        M = new gn10("nowplaying");
        N = new gn10("nowplayingmini");
        O = new gn10("playlist");
        P = new gn10("play-queue");
        Q = new gn10("podcast-charts-uris");
        R = new gn10("podcast-charts-root");
        S = new gn10("podcast-settings");
        T = new gn10("podcast-new-episode-notifications");
        U = new gn10("podcast-sponsors");
        V = new gn10("premium-account-management");
        W = new gn10("premium-destination");
        X = new gn10("create-menu");
        Y = new gn10("lyrics-fullscreen");
        Z = new gn10("quicksilver");
        a0 = new gn10("radio");
        b0 = new gn10("readalong");
        c0 = new gn10("remoteconfiguration");
        d0 = new gn10("root");
        e0 = new gn10("search");
        f0 = new gn10("settings");
        g0 = new gn10("show");
        h0 = new gn10("spotify-go");
        i0 = new gn10("spoton");
        j0 = new gn10("your-library");
        k0 = new gn10("user-profile");
        l0 = new gn10("user-profiles");
        new gn10("waze");
        new gn10("xr-glasses");
        m0 = new gn10("your-episodes");
        n0 = new gn10("your-episodes-settings");
        o0 = new gn10("endless-feed");
        p0 = new gn10("listeningstats");
        q0 = new gn10("unknown");
        new hn10("debug");
        new in10();
        r0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final zkt0 A(int i2) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i2);
        if (iC == 0) {
            return zkt0.a;
        }
        if (iC == 1) {
            return zkt0.b;
        }
        if (iC == 2) {
            return zkt0.c;
        }
        eg.o();
        return null;
    }

    public static String B(Map map) {
        StringBuilder sbR = f4p1.r(map.size());
        sbR.append('{');
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                sbR.append(", ");
            }
            sbR.append(entry.getKey());
            sbR.append('=');
            sbR.append(entry.getValue());
            z2 = false;
        }
        sbR.append('}');
        return sbR.toString();
    }

    public static final n8h1 C(op80 op80Var) {
        g3h1 g3h1Var = (g3h1) op80Var.a(y1x0.U0);
        if (g3h1Var != null) {
            return g3h1Var.b;
        }
        return null;
    }

    public static void D(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                bhn0.i(gvg.l(new StringBuilder(String.valueOf(i3).length() + 9), "at index ", i3));
                return;
            }
        }
    }

    public static bbc a(int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 == -2) {
            if (i3 != 1) {
                return new xzk(1, i3);
            }
            jfe.w.getClass();
            return new bbc(ffe.b);
        }
        if (i2 == -1) {
            if (i3 == 1) {
                return new xzk(1, 2);
            }
            hhg1.n("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return i3 == 1 ? new bbc(0) : new xzk(1, i3);
        }
        if (i2 != Integer.MAX_VALUE) {
            return i3 == 1 ? new bbc(i2) : new xzk(i2, i3);
        }
        return new bbc(Integer.MAX_VALUE);
    }

    public static final void b(xa51 xa51Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-385868232);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(xa51Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("context_menu_button", qim0Var);
            boolean z2 = false;
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 24);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarN, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1671610993, new h1m(xa51Var, (byte) 4), x340Var), x340Var, 48, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(xa51Var, qim0Var, function0, i2, (byte) 12);
        }
    }

    public static final void c(qyl qylVar, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1693144901);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (x340Var.i(qylVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                qylVar = oyl.a;
            }
            fq7.n(qylVar, j2iVar, x340Var, i4 & 126);
        } else {
            x340Var.b0();
        }
        qyl qylVar2 = qylVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(qylVar2, j2iVar, i2, i3, (byte) 17);
        }
    }

    public static final long d(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = toa0.P;
        return j2;
    }

    public static final void e(vho vhoVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        max haxVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(989427364);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.g(vhoVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.g(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3;
            boolean zC = vhoVar.c();
            yf yfVarB = vhoVar.b() instanceof pho ? vhoVar.b().b() : jdx.c;
            if (vhoVar.a()) {
                x340Var2.i0(1651937830);
                haxVar = new hax(cwl1.o0(x340Var2, 2131954741));
                x340Var2.r(false);
            } else {
                x340Var2.i0(1651936344);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            gdx gdxVarS = yla.s(x340Var2);
            pho phoVarB = vhoVar.b();
            pho phoVar = phoVarB instanceof pho ? phoVarB : null;
            qim0 qim0VarZ = (phoVar == null || !phoVar.a()) ? qim0Var : uyn1.z(16.0f, 0.0f, 2, qim0Var);
            boolean z2 = (i4 & 112) == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new way(iu30Var, b2);
                x340Var2.s0(objT);
            }
            x340Var = x340Var2;
            foo1.d(zC, (iu30) objT, yfVarB, qim0VarZ, (yf) null, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, apo.r(-492814042, new y841(vhoVar, (byte) 0), x340Var2), (vu30) null, apo.r(454223844, new y841(vhoVar, (byte) 1), x340Var2), x340Var, 0, 390, 2960);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(vhoVar, iu30Var, qim0Var, i2, (byte) 5);
        }
    }

    public static void f(i1d1 i1d1Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            if (obj == null) {
                i1d1Var.t(i2);
            } else if (obj instanceof byte[]) {
                i1d1Var.n((byte[]) obj, i2);
            } else if (obj instanceof Float) {
                i1d1Var.s(((Number) obj).floatValue(), i2);
            } else if (obj instanceof Double) {
                i1d1Var.s(((Number) obj).doubleValue(), i2);
            } else if (obj instanceof Long) {
                i1d1Var.r(i2, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                i1d1Var.r(i2, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                i1d1Var.r(i2, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                i1d1Var.r(i2, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                i1d1Var.w0(i2, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                i1d1Var.r(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final Bundle g() {
        return new Bundle(0);
    }

    public static final Bundle h(mmr0... mmr0VarArr) {
        Bundle bundle = new Bundle(mmr0VarArr.length);
        for (mmr0 mmr0Var : mmr0VarArr) {
            String str = (String) mmr0Var.a;
            Object obj = mmr0Var.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        hhg1.n(cy30.p("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    hhg1.n(cy30.p("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static String i(int i2, int i3, int i4, String str, String str2, boolean z2) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return j(str, i5, i3, str2, (i4 & 8) != 0 ? false : z2, (i4 & 16) == 0, (i4 & 32) == 0, (i4 & 64) == 0, 128);
    }

    public static String j(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z6 = (i4 & 8) != 0 ? false : z2;
        boolean z7 = (i4 & 16) != 0 ? false : z3;
        boolean z8 = (i4 & 64) == 0 ? z5 : false;
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || ihc1.i0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z7 && !s(iCharCount, length, str)))) || (iCodePointAt == 43 && z4)))) {
                nac nacVar = new nac();
                nacVar.X(i5, iCharCount, str);
                nac nacVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            nacVar.Y("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            nacVar.Y(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || ihc1.i0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z7 && !s(iCharCount, length, str)))))) {
                            if (nacVar2 == null) {
                                nacVar2 = new nac();
                            }
                            nacVar2.Z(iCodePointAt2);
                            while (!nacVar2.z0()) {
                                byte bU = nacVar2.u();
                                nacVar.R(37);
                                char[] cArr = r0;
                                nacVar.R(cArr[((bU & 255) >> 4) & 15]);
                                nacVar.R(cArr[bU & 15]);
                            }
                        } else {
                            nacVar.Z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 128;
                }
                return nacVar.I();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static int k(int i2) {
        if (i2 < 3) {
            n3p1.j(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) Math.ceil(((double) i2) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean l(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final mbh0 m(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new mbh0(matcher, charSequence);
        }
        return null;
    }

    public static final gn10 n(zf30 zf30Var) {
        gn10 gn10VarQ;
        if (zf30Var != null) {
            if (!zf30Var.q0() || !zf30Var.s1.i.a(w8c0.c)) {
                zf30Var = null;
            }
            if (zf30Var != null) {
                ug30 ug30Var = zf30Var instanceof ug30 ? (ug30) zf30Var : null;
                if (ug30Var != null) {
                    a690 a690VarD = wwo1.D(ug30Var);
                    a690 a690Var = a690VarD.equals(b690.a) ? null : a690VarD;
                    if (a690Var == null || (gn10VarQ = a690Var.a) == null) {
                        gn10VarQ = ug30Var.Q();
                    }
                    if (gn10VarQ != null) {
                        return gn10VarQ;
                    }
                }
            }
        }
        return d0;
    }

    public static Intent o(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strQ = q(context, componentName);
        if (strQ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strQ);
        return q(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent p(gj5 gj5Var) {
        Intent parentActivityIntent = gj5Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strQ = q(gj5Var, gj5Var.getComponentName());
            if (strQ == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(gj5Var, strQ);
            try {
                return q(gj5Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String q(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int r(d46 d46Var, Object obj, int i2) {
        int i3 = d46Var.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iJ = mp10.j(i3, i2, d46Var.a);
            if (iJ < 0 || u890.j(obj, d46Var.b[iJ])) {
                return iJ;
            }
            int i4 = iJ + 1;
            while (i4 < i3 && d46Var.a[i4] == i2) {
                if (u890.j(obj, d46Var.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iJ - 1; i5 >= 0 && d46Var.a[i5] == i2; i5--) {
                if (u890.j(obj, d46Var.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            eg.d();
            return 0;
        }
    }

    public static final boolean s(int i2, int i3, String str) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && w4n1.m(str.charAt(i2 + 1)) != -1 && w4n1.m(str.charAt(i4)) != -1;
    }

    public static String t(int i2, int i3, int i4, String str) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                nac nacVar = new nac();
                nacVar.X(i2, iCharCount, str);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iM = w4n1.m(str.charAt(iCharCount + 1));
                        int iM2 = w4n1.m(str.charAt(i5));
                        if (iM == -1 || iM2 == -1) {
                            nacVar.Z(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            nacVar.R((iM << 4) + iM2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        nacVar.R(32);
                        iCharCount++;
                    } else {
                        nacVar.Z(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return nacVar.I();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    public static final Object u(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void v(eeo eeoVar) {
        eeoVar.d();
        if (eeoVar.b() instanceof Spanned) {
            if (!(eeoVar.b() instanceof Spannable)) {
                eeoVar.c(SpannableString.valueOf(eeoVar.b()));
            }
            CharSequence charSequenceB = eeoVar.b();
            charSequenceB.getClass();
            Spannable spannable = (Spannable) charSequenceB;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float w(float f2, int i2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i3;
        }
        return f2 * f3;
    }

    public static void x(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            g961.m(viewGroup, z2);
        } else if (t0) {
            try {
                g961.m(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                t0 = false;
            }
        }
    }

    public static final Bitmap y(Drawable drawable, int i2, int i3, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                hhg1.n("bitmap is null");
                return null;
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap z(Drawable drawable, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if ((i4 & 2) != 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        return y(drawable, i2, i3, null);
    }
}
