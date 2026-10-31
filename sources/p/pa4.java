package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pa4 extends rf implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final edn0 k1;
    public final fdn0 N0;
    public final ina1 O0;
    public final ina1 P0;
    public int Q0;
    public Integer R0;
    public final d46 S0;
    public final bbc T0;
    public boolean U0;
    public ma4 V0;
    public fdn0 W0;
    public kg X;
    public final gdn0 X0;
    public boolean Y;
    public final ddn0 Y0;
    public final fdn0 Z;
    public final ddn0 Z0;
    public final ha4 a;
    public final String a1;
    public final String b1;
    public final dlg1 c1;
    public final AccessibilityManager d;
    public final fdn0 d1;
    public w161 e1;
    public List f;
    public boolean f1;
    public final la4 g;
    public final ddn0 g1;
    public int h;
    public final n6 h1;
    public int i;
    public final ArrayList i1;
    public final ja4 j1;
    public kg t;
    public int b = Integer.MIN_VALUE;
    public final ja4 c = new ja4(this, 0);
    public long e = 100;

    static {
        int[] iArr = {2131427379, 2131427380, 2131427391, 2131427402, 2131427405, 2131427406, 2131427407, 2131427408, 2131427409, 2131427410, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427386, 2131427387, 2131427388, 2131427389, 2131427390, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427400, 2131427401, 2131427403, 2131427404};
        edn0 edn0Var = mr80.a;
        edn0 edn0Var2 = new edn0(32);
        int i = edn0Var2.b;
        if (i < 0) {
            eqr0.O("");
            throw null;
        }
        int i2 = i + 32;
        edn0Var2.b(i2);
        int[] iArr2 = edn0Var2.a;
        int i3 = edn0Var2.b;
        if (i != i3) {
            f46.P(i2, i, i3, iArr2, iArr2);
        }
        f46.V(i, 0, 12, iArr, iArr2);
        edn0Var2.b += 32;
        k1 = edn0Var2;
    }

    public pa4(ha4 ha4Var) {
        this.a = ha4Var;
        this.d = (AccessibilityManager) ha4Var.getContext().getSystemService("accessibility");
        new Handler(Looper.getMainLooper());
        this.g = new la4(this);
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.Z = new fdn0();
        this.N0 = new fdn0();
        this.O0 = new ina1(0);
        this.P0 = new ina1(0);
        this.Q0 = -1;
        this.S0 = new d46(0);
        byte b = 1;
        this.T0 = mno1.a(1, 0, 6);
        this.U0 = true;
        fdn0 fdn0Var = pr80.a;
        this.W0 = fdn0Var;
        this.X0 = new gdn0();
        this.Y0 = new ddn0();
        this.Z0 = new ddn0();
        this.a1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.b1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.c1 = new dlg1((byte) 8);
        this.d1 = new fdn0();
        this.e1 = new w161(ha4Var.getSemanticsOwner().a(), fdn0Var);
        int i = ir80.a;
        this.g1 = new ddn0();
        ha4Var.addOnAttachStateChangeListener(this);
        this.h1 = new n6(this, b);
        this.i1 = new ArrayList();
        this.j1 = new ja4(this, b);
    }

    public static Rect C(z1a1 z1a1Var, float f, float f2) {
        if (!(z1a1Var instanceof itq0) && !(z1a1Var instanceof jtq0)) {
            return null;
        }
        n511 n511VarJ = z1a1Var.j();
        return new Rect((int) (n511VarJ.a + f), (int) (n511VarJ.b + f2), (int) (n511VarJ.c + f), (int) (n511VarJ.d + f2));
    }

    public static float[] E(z1a1 z1a1Var) {
        if (!(z1a1Var instanceof jtq0)) {
            return null;
        }
        vq31 vq31Var = ((jtq0) z1a1Var).c;
        long j = vq31Var.h;
        long j2 = vq31Var.g;
        long j3 = vq31Var.f;
        long j4 = vq31Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region F(z1a1 z1a1Var, float f, float f2) {
        if (z1a1Var instanceof htq0) {
            htq0 htq0Var = (htq0) z1a1Var;
            n511 n511VarM = htq0Var.j().m(f, f2);
            Region region = new Region(new Rect((int) (n511VarM.a + 0.0f), (int) (n511VarM.b + 0.0f), (int) (n511VarM.c + 0.0f), (int) (n511VarM.d + 0.0f)));
            Region region2 = new Region();
            u8s0 u8s0Var = htq0Var.c;
            if (u8s0Var instanceof tw4) {
                Path path = ((tw4) u8s0Var).a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            hhg1.h("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence G(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    public static String k(v161 v161Var) {
        af5 af5Var;
        if (v161Var != null) {
            o161 o161Var = v161Var.d;
            nen0 nen0Var = o161Var.a;
            d261 d261Var = z161.a;
            if (nen0Var.c(d261Var)) {
                return p5d0.b((List) o161Var.d(d261Var), ",", (iu30) null, 62);
            }
            d261 d261Var2 = z161.G;
            if (nen0Var.c(d261Var2)) {
                af5 af5Var2 = (af5) eko1.v(o161Var, d261Var2);
                if (af5Var2 != null) {
                    return af5Var2.b;
                }
            } else {
                List list = (List) eko1.v(o161Var, z161.C);
                if (list != null && (af5Var = (af5) o7h.s0(list)) != null) {
                    return af5Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean o(pq41 pq41Var, float f) {
        Function0 function0 = pq41Var.a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) pq41Var.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean p(pq41 pq41Var) {
        Function0 function0 = pq41Var.a;
        boolean z = pq41Var.c;
        if (((Number) function0.invoke()).floatValue() <= 0.0f || z) {
            return ((Number) function0.invoke()).floatValue() < ((Number) pq41Var.b.invoke()).floatValue() && z;
        }
        return true;
    }

    public static final boolean q(pq41 pq41Var) {
        Function0 function0 = pq41Var.a;
        boolean z = pq41Var.c;
        if (((Number) function0.invoke()).floatValue() >= ((Number) pq41Var.b.invoke()).floatValue() || z) {
            return ((Number) function0.invoke()).floatValue() > 0.0f && z;
        }
        return true;
    }

    public static /* synthetic */ void v(pa4 pa4Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        pa4Var.u(i, i2, num, null);
    }

    public final void A(hmb0 hmb0Var) {
        if (hmb0Var.I() && !this.a.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(hmb0Var)) {
            int i = hmb0Var.b;
            pq41 pq41Var = (pq41) this.Z.b(i);
            pq41 pq41Var2 = (pq41) this.N0.b(i);
            if (pq41Var == null && pq41Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventF = f(i, 4096);
            if (pq41Var != null) {
                accessibilityEventF.setScrollX((int) ((Number) pq41Var.a.invoke()).floatValue());
                accessibilityEventF.setMaxScrollX((int) ((Number) pq41Var.b.invoke()).floatValue());
            }
            if (pq41Var2 != null) {
                accessibilityEventF.setScrollY((int) ((Number) pq41Var2.a.invoke()).floatValue());
                accessibilityEventF.setMaxScrollY((int) ((Number) pq41Var2.b.invoke()).floatValue());
            }
            t(accessibilityEventF);
        }
    }

    public final boolean B(v161 v161Var, int i, int i2, boolean z) {
        String strK;
        o161 o161Var = v161Var.d;
        int i3 = v161Var.f;
        d261 d261Var = m161.j;
        if (o161Var.a.c(d261Var) && y1a1.l(v161Var)) {
            xu30 xu30Var = ((we) v161Var.d.d(d261Var)).b;
            if (xu30Var != null) {
                return ((Boolean) xu30Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.Q0) && (strK = k(v161Var)) != null) {
            if (i < 0 || i != i2 || i2 > strK.length()) {
                i = -1;
            }
            this.Q0 = i;
            boolean z2 = strK.length() > 0;
            t(g(r(i3), z2 ? Integer.valueOf(this.Q0) : null, z2 ? Integer.valueOf(this.Q0) : null, z2 ? Integer.valueOf(strK.length()) : null, strK));
            x(i3);
            return true;
        }
        return false;
    }

    public final Rect D(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ha4 ha4Var = this.a;
        long jS = ha4Var.s(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jS2 = ha4Var.s((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jS >> 32);
        int i2 = (int) (jS2 >> 32);
        int i3 = (int) (jS & 4294967295L);
        int i4 = (int) (jS2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    public final void H() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        gdn0 gdn0Var = new gdn0();
        gdn0 gdn0Var2 = this.X0;
        int[] iArr = gdn0Var2.b;
        long[] jArr3 = gdn0Var2.a;
        int length = jArr3.length - 2;
        fdn0 fdn0Var = this.d1;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            x161 x161Var = (x161) j().b(i6);
                            v161 v161Var = x161Var != null ? x161Var.a : null;
                            if (v161Var != null) {
                                if (!v161Var.d.a.c(z161.d)) {
                                    gdn0Var.a(i6);
                                    w161 w161Var = (w161) fdn0Var.b(i6);
                                    w(i6, 32, w161Var != null ? (String) eko1.v(w161Var.a, z161.d) : null);
                                }
                            } else {
                                gdn0Var.a(i6);
                                w161 w161Var2 = (w161) fdn0Var.b(i6);
                                w(i6, 32, w161Var2 != null ? (String) eko1.v(w161Var2.a, z161.d) : null);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = gdn0Var.b;
        long[] jArr4 = gdn0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = gdn0Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = gdn0Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (gdn0Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                gdn0Var2.h(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        fdn0Var.c();
        or80 or80VarJ = j();
        int[] iArr3 = or80VarJ.b;
        Object[] objArr = or80VarJ.c;
        long[] jArr6 = or80VarJ.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            v161 v161Var2 = ((x161) objArr[i25]).a;
                            o161 o161Var = v161Var2.d;
                            d261 d261Var = z161.d;
                            if (o161Var.a.c(d261Var) && gdn0Var2.a(i26)) {
                                w(i26, 16, (String) v161Var2.d.d(d261Var));
                            }
                            fdn0Var.i(i26, new w161(v161Var2, j()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.e1 = new w161(this.a.getSemanticsOwner().a(), j());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    public final void a(int i, kg kgVar, String str, Bundle bundle) throws NoWhenBranchMatchedException {
        v161 v161Var;
        hw61 hw61Var;
        RectF[] rectFArr;
        ha4 ha4Var;
        x161 x161Var = (x161) j().b(i);
        if (x161Var == null || (v161Var = x161Var.a) == null) {
            return;
        }
        hmb0 hmb0Var = v161Var.c;
        o161 o161Var = v161Var.d;
        nen0 nen0Var = o161Var.a;
        String strK = k(v161Var);
        if (u890.j(str, this.a1)) {
            int iD = this.Y0.d(i);
            if (iD != -1) {
                kgVar.a.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (u890.j(str, this.b1)) {
            int iD2 = this.Z0.d(i);
            if (iD2 != -1) {
                kgVar.a.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = nen0Var.c(m161.a);
        ha4 ha4Var2 = this.a;
        int i2 = 0;
        if (zC && bundle != null && u890.j(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 <= 0 || i3 < 0) {
                return;
            }
            if (i3 >= (strK != null ? strK.length() : Integer.MAX_VALUE)) {
                return;
            }
            y9e1 y9e1VarI = flo1.i(o161Var);
            if (y9e1VarI == null) {
                rectFArr = null;
            } else {
                sh80 sh80Var = (sh80) hmb0Var.e1.d;
                if (!sh80Var.E1.N0) {
                    sh80Var = null;
                }
                if (sh80Var != null) {
                    long jB = nho1.B(sh80Var);
                    n511 n511VarG = v161Var.g();
                    RectF[] rectFArr2 = new RectF[i4];
                    while (i2 < i4) {
                        int i5 = i3 + i2;
                        if (i5 >= y9e1VarI.a.a.b.length()) {
                            ha4Var = ha4Var2;
                        } else {
                            n511 n511VarN = y9e1VarI.b(i5).n(jB);
                            n511 n511VarJ = n511VarN.l(n511VarG) ? n511VarN.j(n511VarG) : null;
                            if (n511VarJ != null) {
                                long jS = ha4Var2.s((((long) Float.floatToRawIntBits(n511VarJ.a)) << 32) | (((long) Float.floatToRawIntBits(n511VarJ.b)) & 4294967295L));
                                float f = n511VarJ.c;
                                float f2 = n511VarJ.d;
                                long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
                                ha4Var = ha4Var2;
                                long jS2 = ha4Var.s(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
                                int i6 = (int) (jS >> 32);
                                int i7 = (int) (jS2 >> 32);
                                int i8 = (int) (jS & 4294967295L);
                                int i9 = (int) (jS2 & 4294967295L);
                                rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                ha4Var = ha4Var2;
                            }
                        }
                        i2++;
                        i3 = i3;
                        ha4Var2 = ha4Var;
                        i4 = i4;
                        jB = jB;
                        y9e1VarI = y9e1VarI;
                        n511VarG = n511VarG;
                    }
                    rectFArr = rectFArr2;
                } else {
                    rectFArr = null;
                }
            }
            if (rectFArr == null) {
                return;
            }
            kgVar.a.getExtras().putParcelableArray(str, rectFArr);
            return;
        }
        d261 d261Var = z161.A;
        if (nen0Var.c(d261Var) && bundle != null && u890.j(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) eko1.v(o161Var, d261Var);
            if (str2 != null) {
                kgVar.a.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (u890.j(str, "androidx.compose.ui.semantics.id")) {
            kgVar.a.getExtras().putInt(str, v161Var.f);
            return;
        }
        if (u890.j(str, "androidx.compose.ui.semantics.shapeType")) {
            hw61 hw61Var2 = (hw61) eko1.v(o161Var, z161.S);
            if (hw61Var2 != null) {
                Rect rect = new Rect();
                kgVar.a.getBoundsInScreen(rect);
                AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
                n511 n511VarL = l(v161Var, rect, hw61Var2);
                float f3 = n511VarL.b;
                float f4 = n511VarL.a;
                z1a1 z1a1VarA = hw61Var2.a(n511VarL.g(), hmb0Var.a1, ha4Var2.getDensity());
                if (z1a1VarA instanceof itq0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", C(z1a1VarA, f4, f3));
                    return;
                } else if (z1a1VarA instanceof jtq0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", C(z1a1VarA, f4, f3));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", E(z1a1VarA));
                    return;
                } else if (!(z1a1VarA instanceof htq0)) {
                    eg.o();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", F(z1a1VarA, f4, f3));
                    return;
                }
            }
            return;
        }
        if (u890.j(str, "androidx.compose.ui.semantics.shapeRect")) {
            hw61 hw61Var3 = (hw61) eko1.v(o161Var, z161.S);
            if (hw61Var3 != null) {
                Rect rect2 = new Rect();
                kgVar.a.getBoundsInScreen(rect2);
                n511 n511VarL2 = l(v161Var, rect2, hw61Var3);
                Rect rectC = C(hw61Var3.a(n511VarL2.g(), hmb0Var.a1, ha4Var2.getDensity()), n511VarL2.a, n511VarL2.b);
                if (rectC != null) {
                    kgVar.a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectC);
                    return;
                }
                return;
            }
            return;
        }
        if (u890.j(str, "androidx.compose.ui.semantics.shapeCorners")) {
            hw61 hw61Var4 = (hw61) eko1.v(o161Var, z161.S);
            if (hw61Var4 != null) {
                Rect rect3 = new Rect();
                kgVar.a.getBoundsInScreen(rect3);
                float[] fArrE = E(hw61Var4.a(l(v161Var, rect3, hw61Var4).g(), hmb0Var.a1, ha4Var2.getDensity()));
                if (fArrE != null) {
                    kgVar.a.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrE);
                    return;
                }
                return;
            }
            return;
        }
        if (!u890.j(str, "androidx.compose.ui.semantics.shapeRegion") || (hw61Var = (hw61) eko1.v(o161Var, z161.S)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        kgVar.a.getBoundsInScreen(rect4);
        n511 n511VarL3 = l(v161Var, rect4, hw61Var);
        Region regionF = F(hw61Var.a(n511VarL3.g(), hmb0Var.a1, ha4Var2.getDensity()), n511VarL3.a, n511VarL3.b);
        if (regionF != null) {
            kgVar.a.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionF);
        }
    }

    public final Rect b(x161 x161Var) {
        ur80 ur80Var = x161Var.b;
        return D(ur80Var.a, ur80Var.b, ur80Var.c, ur80Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x0092, LOOP:0: B:34:0x0081->B:35:0x0083, LOOP_END, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:52:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (p.hap1.i(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.onm r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pa4.c(p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    public final boolean d(long j, boolean z, int i) throws NoWhenBranchMatchedException {
        d261 d261Var;
        int i2;
        pq41 pq41Var;
        if (u890.j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            or80 or80VarJ = j();
            if (!Offset.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    d261Var = z161.w;
                } else {
                    if (z) {
                        eg.o();
                        return false;
                    }
                    d261Var = z161.v;
                }
                Object[] objArr = or80VarJ.c;
                long[] jArr = or80VarJ.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j2 & 255) < 128) {
                                    x161 x161Var = (x161) objArr[(i3 << 3) + i6];
                                    if (hm5.O(x161Var.b).a(j) && (pq41Var = (pq41) eko1.v(x161Var.a.d, d261Var)) != null) {
                                        boolean z3 = pq41Var.c;
                                        i2 = i4;
                                        int i7 = z3 ? -i : i;
                                        if (i == 0 && z3) {
                                            i7 = -1;
                                        }
                                        Function0 function0 = pq41Var.a;
                                        if (i7 < 0) {
                                            if (((Number) function0.invoke()).floatValue() > 0.0f) {
                                                z2 = true;
                                            }
                                        } else if (((Number) function0.invoke()).floatValue() < ((Number) pq41Var.b.invoke()).floatValue()) {
                                            z2 = true;
                                        }
                                    } else {
                                        i2 = i4;
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void e() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m()) {
                s(this.a.getSemanticsOwner().a(), this.e1);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                y(j());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    H();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent f(int i, int i2) {
        x161 x161Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ha4 ha4Var = this.a;
        accessibilityEventObtain.setPackageName(ha4Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(ha4Var, i);
        if (m() && (x161Var = (x161) j().b(i)) != null) {
            v161 v161Var = x161Var.a;
            accessibilityEventObtain.setPassword(v161Var.d.a.c(z161.N));
            luo1.x(accessibilityEventObtain, u890.j(eko1.v(v161Var.d, z161.o), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent g(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventF = f(i, 8192);
        if (num != null) {
            accessibilityEventF.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventF.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventF.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventF.getText().add(charSequence);
        }
        return accessibilityEventF;
    }

    @Override // p.rf
    public final ng getAccessibilityNodeProvider(View view) {
        return this.g;
    }

    public final int h(v161 v161Var) {
        o161 o161Var = v161Var.d;
        if (!o161Var.a.c(z161.a)) {
            d261 d261Var = z161.H;
            if (o161Var.a.c(d261Var)) {
                return (int) (((nbe1) o161Var.d(d261Var)).a & 4294967295L);
            }
        }
        return this.Q0;
    }

    public final int i(v161 v161Var) {
        o161 o161Var = v161Var.d;
        if (!o161Var.a.c(z161.a)) {
            d261 d261Var = z161.H;
            if (o161Var.a.c(d261Var)) {
                return (int) (((nbe1) o161Var.d(d261Var)).a >> 32);
            }
        }
        return this.Q0;
    }

    public final or80 j() {
        if (this.U0) {
            this.U0 = false;
            ha4 ha4Var = this.a;
            this.W0 = ggo1.C(ha4Var.getSemanticsOwner(), new ia4((byte) 0));
            if (m()) {
                y1a1.p(this.W0, this.Y0, this.Z0, ha4Var.getContext().getResources());
            }
        }
        return this.W0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[LOOP:0: B:4:0x0016->B:36:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x007a A[EDGE_INSN: B:47:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0077], SYNTHETIC] */
    public final n511 l(v161 v161Var, Rect rect, hw61 hw61Var) {
        e261 oa4Var = new oa4(hw61Var);
        hmb0 hmb0Var = v161Var.c;
        pim0 pim0Var = (pim0) hmb0Var.e1.g;
        x4t x4tVar = null;
        if ((pim0Var.d & 8) != 0) {
            loop0: while (pim0Var != null) {
                if ((pim0Var.c & 8) == 0) {
                    if ((pim0Var.d & 8) != 0) {
                        break;
                        break;
                    }
                    pim0Var = pim0Var.f;
                } else {
                    pim0 pim0VarE = pim0Var;
                    bfn0 bfn0Var = null;
                    while (pim0VarE != null) {
                        if (pim0VarE instanceof t161) {
                            ((t161) pim0VarE).g(oa4Var);
                            if (oa4Var.a()) {
                                x4tVar = pim0VarE;
                                break loop0;
                            }
                        } else if ((pim0VarE.c & 8) != 0 && (pim0VarE instanceof l5t)) {
                            int i = 0;
                            for (pim0 pim0Var2 = ((l5t) pim0VarE).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                if ((pim0Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        pim0VarE = pim0Var2;
                                    } else {
                                        if (bfn0Var == null) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (pim0VarE != null) {
                                            bfn0Var.b(pim0VarE);
                                            pim0VarE = null;
                                        }
                                        bfn0Var.b(pim0Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        pim0VarE = oap1.e(bfn0Var);
                    }
                    if ((pim0Var.d & 8) != 0) {
                        break;
                    }
                    pim0Var = pim0Var.f;
                }
            }
        }
        x4t x4tVar2 = (t161) x4tVar;
        if (x4tVar2 == null || !((pim0) x4tVar2).a.N0) {
            return nho1.n((ndo0) hmb0Var.e1.e, false);
        }
        ndo0 ndo0VarZ = oap1.z(x4tVar2);
        n511 n511VarM = nho1.v(ndo0VarZ).M(ndo0VarZ, false);
        Rect rectD = D(n511VarM.a, n511VarM.b, n511VarM.c, n511VarM.d);
        float f = rectD.left - rect.left;
        float f2 = rectD.top - rect.top;
        return new n511(f, f2, rectD.width() + f, rectD.height() + f2);
    }

    public final boolean m() {
        AccessibilityManager accessibilityManager = this.d;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void n(hmb0 hmb0Var) {
        if (this.S0.add(hmb0Var)) {
            this.T0.l(rih1.a);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager.isEnabled()) {
            this.f = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.h1);
        AccessibilityManager accessibilityManager = this.d;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int r(int i) {
        if (i == this.a.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[LOOP:1: B:15:0x004f->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008e A[EDGE_INSN: B:44:0x008e->B:29:0x008e BREAK  A[LOOP:1: B:15:0x004f->B:28:0x008b], SYNTHETIC] */
    public final void s(v161 v161Var, w161 w161Var) {
        int[] iArr = xr80.a;
        gdn0 gdn0Var = new gdn0();
        List listI = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
        hmb0 hmb0Var = v161Var.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            v161 v161Var2 = (v161) listI.get(i);
            or80 or80VarJ = j();
            int i2 = v161Var2.f;
            if (or80VarJ.a(i2)) {
                if (!w161Var.b.c(i2)) {
                    n(hmb0Var);
                    return;
                }
                gdn0Var.a(i2);
            }
        }
        gdn0 gdn0Var2 = w161Var.b;
        int[] iArr2 = gdn0Var2.b;
        long[] jArr = gdn0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !gdn0Var.c(iArr2[(i3 << 3) + i5])) {
                            n(hmb0Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = v161Var.i((4 & 1) != 0 ? !v161Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            v161 v161Var3 = (v161) listI2.get(i6);
            w161 w161Var2 = (w161) this.d1.b(v161Var3.f);
            if (w161Var2 != null && j().a(v161Var3.f)) {
                s(v161Var3, w161Var2);
            }
        }
    }

    public final boolean t(AccessibilityEvent accessibilityEvent) {
        if (!m()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.Y = true;
        }
        try {
            return ((Boolean) this.c.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.Y = false;
        }
    }

    public final boolean u(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m()) {
            return false;
        }
        AccessibilityEvent accessibilityEventF = f(i, i2);
        if (num != null) {
            accessibilityEventF.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventF.setContentDescription(p5d0.b(list, ",", (iu30) null, 62));
        }
        return t(accessibilityEventF);
    }

    public final void w(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventF = f(r(i), 32);
        accessibilityEventF.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventF.getText().add(str);
        }
        t(accessibilityEventF);
    }

    public final void x(int i) {
        ma4 ma4Var = this.V0;
        if (ma4Var != null) {
            if (i != ma4Var.d().f) {
                return;
            }
            if (SystemClock.uptimeMillis() - ma4Var.f() <= 1000) {
                AccessibilityEvent accessibilityEventF = f(r(ma4Var.d().f), 131072);
                accessibilityEventF.setFromIndex(ma4Var.b());
                accessibilityEventF.setToIndex(ma4Var.e());
                accessibilityEventF.setAction(ma4Var.a());
                accessibilityEventF.setMovementGranularity(ma4Var.c());
                accessibilityEventF.getText().add(k(ma4Var.d()));
                t(accessibilityEventF);
            }
        }
        this.V0 = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:185:0x04de A[PHI: r49
      0x04de: PHI (r49v10 int) = (r49v7 int), (r49v11 int) binds: [B:191:0x04f4, B:183:0x04db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x04e1 A[PHI: r49
      0x04e1: PHI (r49v8 int) = (r49v7 int), (r49v7 int), (r49v11 int), (r49v11 int) binds: [B:189:0x04ea, B:191:0x04f4, B:181:0x04d5, B:183:0x04db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:223:0x05f3  */
    /* JADX WARN: Not found block with instruction: 0x02d4: MOVE (r4v7 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:725) */
    public final void y(or80 or80Var) throws KotlinNothingValueException {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        Integer num4;
        o161 o161Var;
        int i6;
        boolean zO;
        nen0 nen0Var;
        int i7;
        int i8;
        nen0 nen0Var2;
        int i9;
        ArrayList arrayList3;
        long j;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        String str;
        int i13;
        int i14;
        AccessibilityEvent accessibilityEventG;
        hmb0 hmb0Var;
        or80 or80Var2 = or80Var;
        Integer num5 = 64;
        ArrayList arrayList4 = this.i1;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = or80Var2.b;
        long[] jArr3 = or80Var2.a;
        int i15 = 2;
        int length = jArr3.length - 2;
        int i16 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j2 = jArr3[i17];
            int i18 = i15;
            int i19 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i20 = 8;
                int i21 = 8 - ((~(i17 - i19)) >>> 31);
                long j3 = j2;
                int i22 = i16;
                while (i22 < i21) {
                    if ((j3 & 255) < 128) {
                        int i23 = iArr3[(i17 << 3) + i22];
                        w161 w161Var = (w161) this.d1.b(i23);
                        if (w161Var == null) {
                            i2 = i22;
                            num3 = num5;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i20;
                            i4 = i21;
                            i5 = i17;
                            num4 = num6;
                        } else {
                            o161 o161Var2 = w161Var.a;
                            nen0 nen0Var3 = o161Var2.a;
                            x161 x161Var = (x161) or80Var2.b(i23);
                            int i24 = i20;
                            v161 v161Var = x161Var != null ? x161Var.a : null;
                            if (v161Var == null) {
                                throw l1d.w("no value for specified key");
                            }
                            hmb0 hmb0Var2 = v161Var.c;
                            o161 o161Var3 = v161Var.d;
                            iArr2 = iArr3;
                            int i25 = v161Var.f;
                            jArr2 = jArr3;
                            nen0 nen0Var4 = o161Var3.a;
                            i5 = i17;
                            Object[] objArr = nen0Var4.b;
                            Object[] objArr2 = nen0Var4.c;
                            long[] jArr4 = nen0Var4.a;
                            i2 = i22;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                int i26 = i25;
                                nen0 nen0Var5 = nen0Var4;
                                int i27 = 0;
                                zO = false;
                                while (true) {
                                    long j4 = jArr4[i27];
                                    hmb0 hmb0Var3 = hmb0Var2;
                                    i4 = i21;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j4 & 255) < 128) {
                                                int i30 = (i27 << 3) + i29;
                                                Object obj = objArr[i30];
                                                int i31 = length2;
                                                Object obj2 = objArr2[i30];
                                                j = j4;
                                                d261 d261Var = (d261) obj;
                                                d261 d261Var2 = z161.v;
                                                i10 = i29;
                                                if (u890.j(d261Var, d261Var2) || u890.j(d261Var, z161.w)) {
                                                    yr41 yr41VarF = flo1.f(i23, arrayList5);
                                                    if (yr41VarF != null) {
                                                        z = false;
                                                    } else {
                                                        yr41VarF = new yr41(i23, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(yr41VarF);
                                                } else {
                                                    z = false;
                                                }
                                                if (z || !u890.j(obj2, eko1.v(o161Var2, d261Var))) {
                                                    d261 d261Var3 = z161.d;
                                                    if (u890.j(d261Var, d261Var3)) {
                                                        String str2 = (String) obj2;
                                                        boolean zC = nen0Var3.c(d261Var3);
                                                        int i32 = i24;
                                                        if (zC) {
                                                            w(i23, i32, str2);
                                                        }
                                                    } else if (u890.j(d261Var, z161.b)) {
                                                        v(this, r(i23), 2048, num5, 8);
                                                        v(this, r(i23), 2048, num6, 8);
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        if (u890.j(d261Var, z161.L)) {
                                                            v(this, r(i23), 2048, 8192, 8);
                                                            v(this, r(i23), 2048, num6, 8);
                                                        } else if (u890.j(d261Var, z161.O)) {
                                                            v(this, r(i23), 2048, 3072, 8);
                                                        } else if (u890.j(d261Var, z161.c)) {
                                                            v(this, r(i23), 2048, num5, 8);
                                                            v(this, r(i23), 2048, num6, 8);
                                                        } else {
                                                            d261 d261Var4 = z161.K;
                                                            if (u890.j(d261Var, d261Var4)) {
                                                                pm31 pm31Var = (pm31) eko1.v(o161Var3, z161.z);
                                                                if (pm31Var == null || pm31Var.a != 4) {
                                                                    hmb0Var = hmb0Var3;
                                                                    v(this, r(i23), 2048, num5, 8);
                                                                    v(this, r(i23), 2048, num6, 8);
                                                                } else if (u890.j(eko1.v(o161Var3, d261Var4), Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventF = f(r(i23), 4);
                                                                    hmb0Var = hmb0Var3;
                                                                    v161 v161Var2 = new v161(v161Var.a, true, hmb0Var, o161Var3);
                                                                    List list = (List) eko1.v(v161Var2.k(), z161.a);
                                                                    String strB = list != null ? p5d0.b(list, ",", (iu30) null, 62) : null;
                                                                    List list2 = (List) eko1.v(v161Var2.k(), z161.C);
                                                                    String strB2 = list2 != null ? p5d0.b(list2, ",", (iu30) null, 62) : null;
                                                                    if (strB != null) {
                                                                        accessibilityEventF.setContentDescription(strB);
                                                                    }
                                                                    if (strB2 != null) {
                                                                        accessibilityEventF.getText().add(strB2);
                                                                    }
                                                                    t(accessibilityEventF);
                                                                } else {
                                                                    hmb0Var = hmb0Var3;
                                                                    v(this, r(i23), 2048, num6, 8);
                                                                }
                                                                hmb0Var3 = hmb0Var;
                                                            } else {
                                                                i28 = i28;
                                                                i27 = i27;
                                                                hmb0Var3 = hmb0Var3;
                                                                if (u890.j(d261Var, z161.a)) {
                                                                    u(r(i23), 2048, 4, (List) obj2);
                                                                } else {
                                                                    d261 d261Var5 = z161.G;
                                                                    String str3 = "";
                                                                    if (u890.j(d261Var, d261Var5)) {
                                                                        nen0Var5 = nen0Var5;
                                                                        if (nen0Var5.c(m161.k)) {
                                                                            af5 af5Var = (af5) eko1.v(o161Var2, d261Var5);
                                                                            if (af5Var == null) {
                                                                                af5Var = "";
                                                                            }
                                                                            CharSequence charSequence = (af5) eko1.v(o161Var3, d261Var5);
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence charSequenceG = G(charSequence);
                                                                            int length3 = af5Var.length();
                                                                            int length4 = charSequence.length();
                                                                            Integer num7 = num6;
                                                                            int i33 = length3 > length4 ? length4 : length3;
                                                                            int i34 = 0;
                                                                            while (true) {
                                                                                i13 = i33;
                                                                                if (i34 >= i33) {
                                                                                    num5 = num5;
                                                                                    break;
                                                                                }
                                                                                num5 = num5;
                                                                                if (af5Var.charAt(i34) != charSequence.charAt(i34)) {
                                                                                    break;
                                                                                }
                                                                                i34++;
                                                                                i33 = i13;
                                                                                num5 = num5;
                                                                            }
                                                                            int i35 = 0;
                                                                            while (true) {
                                                                                if (i35 >= i13 - i34) {
                                                                                    i14 = i35;
                                                                                    break;
                                                                                }
                                                                                i14 = i35;
                                                                                if (af5Var.charAt((length3 - 1) - i35) != charSequence.charAt((length4 - 1) - i14)) {
                                                                                    break;
                                                                                } else {
                                                                                    i35 = i14 + 1;
                                                                                }
                                                                            }
                                                                            int i36 = (length3 - i14) - i34;
                                                                            int i37 = (length4 - i14) - i34;
                                                                            d261 d261Var6 = z161.N;
                                                                            boolean zC2 = nen0Var3.c(d261Var6);
                                                                            boolean zC3 = nen0Var5.c(d261Var6);
                                                                            boolean zC4 = nen0Var3.c(z161.G);
                                                                            boolean z3 = zC4 && !zC2 && zC3;
                                                                            boolean z4 = zC4 && zC2 && !zC3;
                                                                            if (z3 || z4) {
                                                                                i23 = i23;
                                                                                num6 = num7;
                                                                                accessibilityEventG = g(r(i23), num6, num7, Integer.valueOf(length4), charSequenceG);
                                                                            } else {
                                                                                AccessibilityEvent accessibilityEventF2 = f(r(i23), 16);
                                                                                accessibilityEventF2.setFromIndex(i34);
                                                                                accessibilityEventF2.setRemovedCount(i36);
                                                                                accessibilityEventF2.setAddedCount(i37);
                                                                                accessibilityEventF2.setBeforeText(af5Var);
                                                                                accessibilityEventF2.getText().add(charSequenceG);
                                                                                accessibilityEventG = accessibilityEventF2;
                                                                                num6 = num7;
                                                                                i23 = i23;
                                                                            }
                                                                            accessibilityEventG.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                ka4.d(v161Var, accessibilityEventG);
                                                                            }
                                                                            t(accessibilityEventG);
                                                                            if (z3 || z4) {
                                                                                long j5 = ((nbe1) o161Var3.d(z161.H)).a;
                                                                                accessibilityEventG.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventG.setToIndex((int) (j5 & 4294967295L));
                                                                                t(accessibilityEventG);
                                                                            }
                                                                        } else {
                                                                            num5 = num5;
                                                                            i31 = i31;
                                                                            i23 = i23;
                                                                            nen0Var3 = nen0Var3;
                                                                            v(this, r(i23), 2048, Integer.valueOf(i18), 8);
                                                                        }
                                                                        i11 = i31;
                                                                        i26 = i26;
                                                                        num6 = num6;
                                                                    } else {
                                                                        o161Var2 = o161Var2;
                                                                        num5 = num5;
                                                                        nen0Var5 = nen0Var5;
                                                                        i23 = i23;
                                                                        i11 = i31;
                                                                        nen0Var3 = nen0Var3;
                                                                        d261 d261Var7 = z161.H;
                                                                        if (u890.j(d261Var, d261Var7)) {
                                                                            af5 af5Var2 = (af5) eko1.v(o161Var3, d261Var5);
                                                                            if (af5Var2 != null && (str = af5Var2.b) != null) {
                                                                                str3 = str;
                                                                            }
                                                                            long j6 = ((nbe1) o161Var3.d(d261Var7)).a;
                                                                            num6 = num6;
                                                                            t(g(r(i23), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), G(str3)));
                                                                            int i38 = i26;
                                                                            x(i38);
                                                                            i26 = i38;
                                                                            i11 = i11;
                                                                        } else {
                                                                            num6 = num6;
                                                                            int i39 = i26;
                                                                            if (u890.j(d261Var, d261Var2) || u890.j(d261Var, z161.w)) {
                                                                                i26 = i39;
                                                                                n(hmb0Var3);
                                                                                yr41 yr41VarF2 = flo1.f(i23, arrayList4);
                                                                                yr41VarF2.getClass();
                                                                                yr41VarF2.a((pq41) eko1.v(o161Var3, d261Var2));
                                                                                yr41VarF2.b((pq41) eko1.v(o161Var3, z161.w));
                                                                                if (yr41VarF2.B0()) {
                                                                                    this.a.getSnapshotObserver().a.d(yr41VarF2, this.j1, new og(yr41VarF2, this, (byte) 3));
                                                                                }
                                                                            } else if (u890.j(d261Var, z161.l)) {
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    t(f(r(i39), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                v(this, r(i39), 2048, num6, i12);
                                                                                i26 = i39;
                                                                            } else {
                                                                                d261 d261Var8 = m161.x;
                                                                                if (u890.j(d261Var, d261Var8)) {
                                                                                    List list3 = (List) o161Var3.d(d261Var8);
                                                                                    List list4 = (List) eko1.v(o161Var2, d261Var8);
                                                                                    if (list4 != null) {
                                                                                        oen0 oen0Var = ij41.a;
                                                                                        oen0 oen0Var2 = new oen0();
                                                                                        int size = list3.size();
                                                                                        int i40 = 0;
                                                                                        while (i40 < size) {
                                                                                            oen0Var2.a(((epo) list3.get(i40)).a());
                                                                                            i40++;
                                                                                            list3 = list3;
                                                                                        }
                                                                                        oen0 oen0Var3 = new oen0();
                                                                                        int size2 = list4.size();
                                                                                        int i41 = 0;
                                                                                        while (i41 < size2) {
                                                                                            oen0Var3.a(((epo) list4.get(i41)).a());
                                                                                            i41++;
                                                                                            i39 = i39;
                                                                                        }
                                                                                        i26 = i39;
                                                                                        if (zO || !oen0Var2.equals(oen0Var3)) {
                                                                                            z2 = true;
                                                                                        } else {
                                                                                            z2 = false;
                                                                                        }
                                                                                    } else {
                                                                                        i26 = i39;
                                                                                        if (zO || !list3.isEmpty()) {
                                                                                            z2 = true;
                                                                                        } else {
                                                                                            z2 = false;
                                                                                        }
                                                                                    }
                                                                                    zO = z2;
                                                                                } else {
                                                                                    i26 = i39;
                                                                                    zO = (!zO && (obj2 instanceof we) && y1a1.k((we) obj2, eko1.v(o161Var2, d261Var))) ? false : true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i26 = i26;
                                                            nen0Var5 = nen0Var5;
                                                            i11 = i31;
                                                            nen0Var3 = nen0Var3;
                                                        }
                                                        o161Var2 = o161Var2;
                                                        i11 = i31;
                                                        nen0Var3 = nen0Var3;
                                                    }
                                                    arrayList3 = arrayList5;
                                                    o161Var2 = o161Var2;
                                                    i11 = i31;
                                                    nen0Var3 = nen0Var3;
                                                } else {
                                                    arrayList3 = arrayList5;
                                                    o161Var2 = o161Var2;
                                                    i11 = i31;
                                                    nen0Var3 = nen0Var3;
                                                }
                                            } else {
                                                nen0Var3 = nen0Var3;
                                                num5 = num5;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i28 = i28;
                                                i10 = i29;
                                                i27 = i27;
                                                i26 = i26;
                                                nen0Var5 = nen0Var5;
                                                hmb0Var3 = hmb0Var3;
                                                num6 = num6;
                                                i23 = i23;
                                                o161Var2 = o161Var2;
                                                i11 = length2;
                                            }
                                            i24 = 8;
                                            hmb0Var3 = hmb0Var3;
                                            nen0Var5 = nen0Var5;
                                            i28 = i28;
                                            nen0Var3 = nen0Var3;
                                            i26 = i26;
                                            j4 = j >> 8;
                                            length2 = i11;
                                            i29 = i10 + 1;
                                            i23 = i23;
                                            num6 = num6;
                                            o161Var2 = o161Var2;
                                            i27 = i27;
                                            arrayList5 = arrayList3;
                                            num5 = num5;
                                        }
                                        nen0Var = nen0Var3;
                                        num3 = num5;
                                        arrayList2 = arrayList5;
                                        i7 = i27;
                                        i8 = i26;
                                        nen0Var2 = nen0Var5;
                                        num4 = num6;
                                        i6 = i23;
                                        o161Var = o161Var2;
                                        i9 = length2;
                                        int i42 = i28;
                                        hmb0Var2 = hmb0Var3;
                                        if (i42 != i24) {
                                            break;
                                        }
                                    } else {
                                        nen0Var = nen0Var3;
                                        num3 = num5;
                                        arrayList2 = arrayList5;
                                        i7 = i27;
                                        i8 = i26;
                                        nen0Var2 = nen0Var5;
                                        hmb0Var2 = hmb0Var3;
                                        num4 = num6;
                                        i6 = i23;
                                        o161Var = o161Var2;
                                        i9 = length2;
                                    }
                                    int i43 = i7;
                                    if (i43 == i9) {
                                        break;
                                    }
                                    num6 = num4;
                                    nen0Var5 = nen0Var2;
                                    o161Var2 = o161Var;
                                    i21 = i4;
                                    nen0Var3 = nen0Var;
                                    arrayList5 = arrayList2;
                                    i26 = i8;
                                    i24 = 8;
                                    i27 = i43 + 1;
                                    length2 = i9;
                                    i23 = i6;
                                    num5 = num3;
                                }
                            } else {
                                o161Var = o161Var2;
                                num3 = num5;
                                arrayList2 = arrayList5;
                                i4 = i21;
                                num4 = num6;
                                i6 = i23;
                                zO = false;
                            }
                            if (!zO) {
                                zO = y1a1.o(v161Var, o161Var);
                            }
                            if (zO) {
                                i3 = 8;
                                v(this, r(i6), 2048, num4, 8);
                            } else {
                                i3 = 8;
                            }
                        }
                    } else {
                        i2 = i22;
                        num3 = num5;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i20;
                        i4 = i21;
                        i5 = i17;
                        num4 = num6;
                    }
                    j3 >>= i3;
                    i22 = i2 + 1;
                    or80Var2 = or80Var;
                    num6 = num4;
                    i20 = i3;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i17 = i5;
                    i21 = i4;
                    arrayList5 = arrayList2;
                    num5 = num3;
                }
                num = num5;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i44 = i17;
                num2 = num6;
                if (i21 != i20) {
                    return;
                } else {
                    i = i44;
                }
            } else {
                num = num5;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num6;
                i = i17;
            }
            if (i == i19) {
                return;
            }
            i17 = i + 1;
            or80Var2 = or80Var;
            length = i19;
            num6 = num2;
            i15 = i18;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num5 = num;
            i16 = 0;
        }
    }

    public final void z(hmb0 hmb0Var, gdn0 gdn0Var) {
        o161 o161VarX;
        if (hmb0Var.I() && !this.a.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(hmb0Var)) {
            hmb0 hmb0Var2 = null;
            if (!hmb0Var.e1.k(8)) {
                hmb0Var = hmb0Var.v();
                while (true) {
                    if (hmb0Var == null) {
                        hmb0Var = null;
                        break;
                    } else if (hmb0Var.e1.k(8)) {
                        break;
                    } else {
                        hmb0Var = hmb0Var.v();
                    }
                }
            }
            if (hmb0Var == null || (o161VarX = hmb0Var.x()) == null) {
                return;
            }
            if (!o161VarX.c) {
                for (hmb0 hmb0VarV = hmb0Var.v(); hmb0VarV != null; hmb0VarV = hmb0VarV.v()) {
                    o161 o161VarX2 = hmb0VarV.x();
                    if (o161VarX2 != null && o161VarX2.c) {
                        hmb0Var2 = hmb0VarV;
                        break;
                    }
                }
                if (hmb0Var2 != null) {
                    hmb0Var = hmb0Var2;
                }
            }
            int i = hmb0Var.b;
            if (gdn0Var.a(i)) {
                v(this, r(i), 2048, 1, 8);
            }
        }
    }
}
