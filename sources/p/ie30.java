package p;

import android.text.TextUtils;
import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ie30 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final ie30 V = new ie30(new ge30());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String a0 = Integer.toString(4, 36);
    public static final String b0 = Integer.toString(5, 36);
    public static final String c0 = Integer.toString(6, 36);
    public static final String d0 = Integer.toString(7, 36);
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
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final int A;
    public final float B;
    public final int C;
    public final boolean D;
    public final float E;
    public final byte[] F;
    public final int G;
    public final x8h H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;
    public final String a;
    public final String b;
    public final b380 c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final hjj0 m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f66p;
    public final int q;
    public final int r;
    public final List s;
    public final x8v t;
    public final long u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        Integer.toString(8, 36);
        e0 = Integer.toString(9, 36);
        f0 = Integer.toString(10, 36);
        g0 = Integer.toString(11, 36);
        h0 = Integer.toString(12, 36);
        i0 = Integer.toString(13, 36);
        j0 = Integer.toString(14, 36);
        k0 = Integer.toString(15, 36);
        l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        n0 = Integer.toString(18, 36);
        o0 = Integer.toString(19, 36);
        p0 = Integer.toString(20, 36);
        q0 = Integer.toString(21, 36);
        r0 = Integer.toString(22, 36);
        s0 = Integer.toString(23, 36);
        t0 = Integer.toString(24, 36);
        u0 = Integer.toString(25, 36);
        v0 = Integer.toString(26, 36);
        w0 = Integer.toString(27, 36);
        x0 = Integer.toString(28, 36);
        y0 = Integer.toString(29, 36);
        z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
        H0 = Integer.toString(38, 36);
        I0 = Integer.toString(39, 36);
        J0 = Integer.toString(40, 36);
        K0 = Integer.toString(41, 36);
    }

    public ie30(ge30 ge30Var) {
        boolean z;
        String str;
        this.a = ge30Var.a;
        String strX = zoi1.X(ge30Var.d);
        this.d = strX;
        if (ge30Var.c.isEmpty() && ge30Var.b != null) {
            this.c = b380.t(new u9b0(strX, ge30Var.b));
            this.b = ge30Var.b;
        } else if (ge30Var.c.isEmpty() || ge30Var.b != null) {
            if (!ge30Var.c.isEmpty() || ge30Var.b != null) {
                int i = 0;
                while (true) {
                    if (i >= ge30Var.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((u9b0) ge30Var.c.get(i)).b.equals(ge30Var.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            dm5.y(z);
            this.c = ge30Var.c;
            this.b = ge30Var.b;
        } else {
            b380 b380Var = ge30Var.c;
            this.c = b380Var;
            Iterator it = b380Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((u9b0) b380Var.get(0)).b;
                    break;
                }
                u9b0 u9b0Var = (u9b0) it.next();
                if (TextUtils.equals(u9b0Var.a, strX)) {
                    str = u9b0Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = ge30Var.e;
        dm5.z(ge30Var.h == 0 || (ge30Var.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = ge30Var.f;
        this.g = ge30Var.g;
        this.h = ge30Var.h;
        int i2 = ge30Var.i;
        this.i = i2;
        int i3 = ge30Var.j;
        this.j = i3;
        this.k = i3 != -1 ? i3 : i2;
        this.l = ge30Var.k;
        this.m = ge30Var.l;
        this.n = ge30Var.m;
        this.o = ge30Var.n;
        this.f66p = ge30Var.o;
        this.q = ge30Var.f52p;
        this.r = ge30Var.q;
        List list = ge30Var.r;
        this.s = list == null ? Collections.EMPTY_LIST : list;
        x8v x8vVar = ge30Var.s;
        this.t = x8vVar;
        this.u = ge30Var.t;
        this.v = ge30Var.u;
        this.w = ge30Var.v;
        this.x = ge30Var.w;
        this.y = ge30Var.x;
        this.z = ge30Var.y;
        this.A = ge30Var.z;
        this.B = ge30Var.A;
        int i4 = ge30Var.B;
        this.C = i4 == -1 ? 0 : i4;
        this.D = ge30Var.C;
        float f = ge30Var.D;
        this.E = f == -1.0f ? 1.0f : f;
        this.F = ge30Var.E;
        this.G = ge30Var.F;
        this.H = ge30Var.G;
        this.I = ge30Var.H;
        int i5 = ge30Var.I;
        this.J = i5;
        int i6 = ge30Var.J;
        this.K = i6;
        if (i5 != -1 && i6 != -1) {
            if (!(Integer.bitCount(i6) == i5)) {
                eg.m(m5n1.L("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6)}));
                throw null;
            }
        }
        this.L = ge30Var.K;
        this.M = ge30Var.L;
        int i7 = ge30Var.M;
        this.N = i7 == -1 ? 0 : i7;
        int i8 = ge30Var.N;
        this.O = i8 != -1 ? i8 : 0;
        this.P = ge30Var.O;
        this.Q = ge30Var.P;
        this.R = ge30Var.Q;
        this.S = ge30Var.R;
        int i9 = ge30Var.S;
        if (i9 != 0 || x8vVar == null) {
            this.T = i9;
        } else {
            this.T = 1;
        }
    }

    public static String e(ie30 ie30Var) {
        float f;
        int i;
        String str;
        String strP;
        if (ie30Var == null) {
            return "null";
        }
        int i2 = ie30Var.e;
        b380 b380Var = ie30Var.c;
        String str2 = ie30Var.d;
        int i3 = ie30Var.L;
        int i4 = ie30Var.K;
        int i5 = ie30Var.J;
        int i6 = ie30Var.I;
        int i7 = ie30Var.C;
        float f2 = ie30Var.B;
        int i8 = ie30Var.y;
        x8h x8hVar = ie30Var.H;
        float f3 = ie30Var.E;
        int i9 = ie30Var.A;
        int i10 = ie30Var.z;
        int i11 = ie30Var.x;
        int i12 = ie30Var.w;
        x8v x8vVar = ie30Var.t;
        String str3 = ie30Var.l;
        float f4 = ie30Var.g;
        int i13 = ie30Var.k;
        String str4 = ie30Var.n;
        String str5 = ie30Var.o;
        int i14 = ie30Var.f;
        cfa0 cfa0Var = new cfa0(String.valueOf(','));
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(ie30Var.a);
        sb.append(", mimeType=");
        sb.append(ie30Var.f66p);
        if (str5 != null) {
            sb.append(", container=");
            sb.append(str5);
        }
        if (str4 != null) {
            sb.append(", primaryGroupId=");
            sb.append(str4);
        }
        if (i13 != -1) {
            sb.append(", bitrate=");
            sb.append(i13);
        }
        float f5 = -1.0f;
        if (f4 != -1.0f) {
            sb.append(", selectionPriority=");
            sb.append(f4);
        }
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        if (x8vVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < x8vVar.d) {
                UUID uuid = x8vVar.a[i15].b;
                if (uuid.equals(whc.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(whc.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(whc.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(whc.e)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(whc.b)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i15++;
                    f5 = f5;
                }
                i15++;
                f5 = f5;
            }
            f = f5;
            sb.append(", drm=[");
            cfa0Var.b(sb, linkedHashSet.iterator());
            sb.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            c13.n(i12, i11, ", res=", "x", sb);
        }
        if (i10 != -1 && i9 != -1) {
            c13.n(i10, i9, ", decRes=", "x", sb);
        }
        double d = f3;
        int i16 = bru.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f3)};
            String str6 = zoi1.a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (x8hVar != null) {
            int i17 = x8hVar.f;
            int i18 = x8hVar.e;
            if ((i18 != -1 && i17 != -1) || x8hVar.f()) {
                sb.append(", color=");
                if (x8hVar.f()) {
                    String strC = x8h.c(x8hVar.a);
                    String strB = x8h.b(x8hVar.b);
                    String strE = x8h.e(x8hVar.c);
                    String str7 = zoi1.a;
                    Locale locale = Locale.US;
                    strP = cy30.p(strC, "/", strB, "/", strE);
                } else {
                    strP = "NA/NA/NA";
                }
                sb.append(strP + "/" + ((i18 == -1 || i17 == -1) ? "NA/NA" : ab80.m(i18, i17, "/")));
            }
        }
        if (i8 != -1) {
            sb.append(", pixelFormat=");
            sb.append(i8);
        }
        if (f2 != f) {
            sb.append(", fps=");
            sb.append(f2);
        }
        if (i7 != 0) {
            sb.append(", rotation=");
            sb.append(i7);
        }
        if (ie30Var.D) {
            sb.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i6);
        }
        if (i5 != -1) {
            sb.append(", channels=");
            sb.append(i5);
        }
        if (i4 != -1) {
            sb.append(", channel_mask=");
            sb.append(i4);
        }
        if (i3 != -1) {
            sb.append(", sample_rate=");
            sb.append(i3);
        }
        if (str2 != null) {
            sb.append(", language=");
            sb.append(str2);
        }
        if (!b380Var.isEmpty()) {
            sb.append(", labels=[");
            cfa0Var.b(sb, z1p1.D(b380Var, new cwa((byte) 6)).iterator());
            sb.append("]");
        }
        if (i2 != 0) {
            sb.append(", selectionFlags=[");
            String str8 = zoi1.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            cfa0Var.b(sb, arrayList.iterator());
            sb.append("]");
        }
        if (i14 != 0) {
            sb.append(", roleFlags=[");
            String str9 = zoi1.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i14;
            if ((i & SemanticState.Focused) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & SemanticState.Hidden) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & SemanticState.ReadOnly) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & SemanticState.Modal) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & SemanticState.Obscured) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & SemanticState.Multiline) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & TlsSocketProvider.READ_BUFFER_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            cfa0Var.b(sb, arrayList2.iterator());
            sb.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i19 = ie30Var.h;
            String str10 = zoi1.a;
            if (i19 == 0) {
                str = "undefined";
            } else if (i19 == 1) {
                str = "original";
            } else if (i19 == 2) {
                str = "depth-linear";
            } else if (i19 == 3) {
                str = "depth-inverse";
            } else {
                if (i19 != 4) {
                    eg.m("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final ge30 a() {
        ge30 ge30Var = new ge30();
        ge30Var.a = this.a;
        ge30Var.b = this.b;
        ge30Var.c = this.c;
        ge30Var.d = this.d;
        ge30Var.e = this.e;
        ge30Var.f = this.f;
        ge30Var.g = this.g;
        ge30Var.i = this.i;
        ge30Var.j = this.j;
        ge30Var.k = this.l;
        ge30Var.l = this.m;
        ge30Var.m = this.n;
        ge30Var.n = this.o;
        ge30Var.o = this.f66p;
        ge30Var.f52p = this.q;
        ge30Var.q = this.r;
        ge30Var.r = this.s;
        ge30Var.s = this.t;
        ge30Var.t = this.u;
        ge30Var.u = this.v;
        ge30Var.v = this.w;
        ge30Var.w = this.x;
        ge30Var.x = this.y;
        ge30Var.y = this.z;
        ge30Var.z = this.A;
        ge30Var.A = this.B;
        ge30Var.B = this.C;
        ge30Var.C = this.D;
        ge30Var.D = this.E;
        ge30Var.E = this.F;
        ge30Var.F = this.G;
        ge30Var.G = this.H;
        ge30Var.H = this.I;
        ge30Var.I = this.J;
        ge30Var.J = this.K;
        ge30Var.K = this.L;
        ge30Var.L = this.M;
        ge30Var.M = this.N;
        ge30Var.N = this.O;
        ge30Var.O = this.P;
        ge30Var.P = this.Q;
        ge30Var.Q = this.R;
        ge30Var.R = this.S;
        ge30Var.S = this.T;
        return ge30Var;
    }

    public final ie30 b(int i) {
        ge30 ge30VarA = a();
        ge30VarA.S = i;
        return new ie30(ge30VarA);
    }

    public final int c() {
        int i;
        int i2 = this.w;
        if (i2 == -1 || (i = this.x) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean d(ie30 ie30Var) {
        List list = this.s;
        if (list.size() != ie30Var.s.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) ie30Var.s.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || ie30.class != obj.getClass()) {
            return false;
        }
        ie30 ie30Var = (ie30) obj;
        int i2 = this.U;
        if ((i2 != 0 && (i = ie30Var.U) != 0 && i2 != i) || this.e != ie30Var.e || this.f != ie30Var.f || this.h != ie30Var.h || this.i != ie30Var.i || this.j != ie30Var.j || this.q != ie30Var.q || this.u != ie30Var.u || this.w != ie30Var.w || this.x != ie30Var.x || this.y != ie30Var.y || this.z != ie30Var.z || this.A != ie30Var.A || this.C != ie30Var.C || this.D != ie30Var.D || this.G != ie30Var.G || this.I != ie30Var.I || this.J != ie30Var.J || this.K != ie30Var.K || this.L != ie30Var.L || this.M != ie30Var.M || this.N != ie30Var.N || this.O != ie30Var.O || this.P != ie30Var.P || this.R != ie30Var.R || this.S != ie30Var.S || this.T != ie30Var.T || Float.compare(this.B, ie30Var.B) != 0 || Float.compare(this.g, ie30Var.g) != 0 || Float.compare(this.E, ie30Var.E) != 0 || !Objects.equals(this.a, ie30Var.a) || !Objects.equals(this.b, ie30Var.b)) {
            return false;
        }
        b380 b380Var = ie30Var.c;
        b380 b380Var2 = this.c;
        b380Var2.getClass();
        return z1p1.j(b380Var2, b380Var) && Objects.equals(this.l, ie30Var.l) && Objects.equals(this.n, ie30Var.n) && Objects.equals(this.o, ie30Var.o) && Objects.equals(this.f66p, ie30Var.f66p) && Objects.equals(this.d, ie30Var.d) && Arrays.equals(this.F, ie30Var.F) && Objects.equals(this.m, ie30Var.m) && Objects.equals(this.H, ie30Var.H) && Objects.equals(this.t, ie30Var.t) && d(ie30Var);
    }

    public final ie30 f(ie30 ie30Var) {
        String str;
        b380 b380Var;
        String str2;
        int i;
        float f;
        if (this == ie30Var) {
            return this;
        }
        int i2 = asj0.i(this.f66p);
        String str3 = ie30Var.a;
        b380 b380Var2 = ie30Var.c;
        float f2 = ie30Var.g;
        int i3 = ie30Var.R;
        int i4 = ie30Var.S;
        String str4 = ie30Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (b380Var2.isEmpty()) {
            b380Var2 = this.c;
        }
        if ((i2 != 3 && i2 != 1) || (str = ie30Var.d) == null) {
            str = this.d;
        }
        int i5 = this.i;
        if (i5 == -1) {
            i5 = ie30Var.i;
        }
        int i6 = this.j;
        if (i6 == -1) {
            i6 = ie30Var.j;
        }
        String str5 = this.l;
        if (str5 == null) {
            String strB = zoi1.B(i2, ie30Var.l);
            if (zoi1.j0(strB).length == 1) {
                str5 = strB;
            }
        }
        String str6 = this.n;
        if (str6 == null) {
            str6 = ie30Var.n;
        }
        hjj0 hjj0VarB = ie30Var.m;
        hjj0 hjj0Var = this.m;
        if (hjj0Var != null) {
            hjj0VarB = hjj0Var.b(hjj0VarB);
        }
        float f3 = this.B;
        if (f3 == -1.0f) {
            b380Var = b380Var2;
            if (i2 == 2) {
                f3 = ie30Var.B;
            }
        } else {
            b380Var = b380Var2;
        }
        int i7 = this.e | ie30Var.e;
        int i8 = this.f | ie30Var.f;
        x8v x8vVar = ie30Var.t;
        ArrayList arrayList = new ArrayList();
        if (x8vVar != null) {
            String str7 = x8vVar.c;
            w8v[] w8vVarArr = x8vVar.a;
            int length = w8vVarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                w8v w8vVar = w8vVarArr[i10];
                int i11 = length;
                if (w8vVar.e != null) {
                    arrayList.add(w8vVar);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        x8v x8vVar2 = this.t;
        if (x8vVar2 != null) {
            if (str2 == null) {
                str2 = x8vVar2.c;
            }
            int size = arrayList.size();
            w8v[] w8vVarArr2 = x8vVar2.a;
            String str8 = str2;
            int length2 = w8vVarArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                w8v w8vVar2 = w8vVarArr2[i13];
                int i14 = length2;
                if (w8vVar2.e != null) {
                    UUID uuid = w8vVar2.b;
                    f = f3;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(w8vVar2);
                            break;
                        }
                        i = size;
                        if (((w8v) arrayList.get(i15)).b.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    f = f3;
                }
                i12 = i13 + 1;
                length2 = i14;
                f3 = f;
                size = i;
            }
            str2 = str8;
        }
        float f4 = f3;
        x8v x8vVar3 = arrayList.isEmpty() ? null : new x8v(str2, false, (w8v[]) arrayList.toArray(new w8v[0]));
        ge30 ge30VarA = a();
        ge30VarA.a = str3;
        ge30VarA.b = str4;
        ge30VarA.c = b380.p(b380Var);
        ge30VarA.d = str;
        ge30VarA.e = i7;
        ge30VarA.f = i8;
        ge30VarA.g = f2;
        ge30VarA.i = i5;
        ge30VarA.j = i6;
        ge30VarA.k = str5;
        ge30VarA.l = hjj0VarB;
        ge30VarA.m = str6;
        ge30VarA.s = x8vVar3;
        ge30VarA.c(f4);
        ge30VarA.Q = i3;
        ge30VarA.R = i4;
        return new ie30(ge30VarA);
    }

    public final int hashCode() {
        int i = this.U;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iFloatToIntBits = (((((((Float.floatToIntBits(this.g) + ((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str4 = this.l;
        int iHashCode3 = (iFloatToIntBits + (str4 == null ? 0 : str4.hashCode())) * 31;
        hjj0 hjj0Var = this.m;
        int iHashCode4 = (iHashCode3 + (hjj0Var == null ? 0 : hjj0Var.hashCode())) * 961;
        String str5 = this.n;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f66p;
        int iFloatToIntBits2 = ((((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((((Float.floatToIntBits(this.B) + ((((((((((((((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.q) * 31) + ((int) this.u)) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        this.U = iFloatToIntBits2;
        return iFloatToIntBits2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.f66p);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.H);
        sb.append("], [");
        sb.append(this.J);
        sb.append(", ");
        sb.append(this.K);
        sb.append(", ");
        return gvg.j(sb, this.L, "])");
    }
}
