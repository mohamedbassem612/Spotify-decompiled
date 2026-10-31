package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.functions.Consumer;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ila0 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Integer[] e = {26, 8};
    public static final Integer[] f = {4, 3, 22};
    public static final String[] g = {"AndroidOpenSSL", "GmsCore_OpenSSL", "Conscrypt"};
    public static b180 h;

    public static final long A(float f2, long j) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j : u7h.b(j, u7h.c(j) * f2, 0.0f, 0.0f, 0.0f, 14);
    }

    public static final j2i B(Object obj, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        if (obj == null) {
            x340Var.i0(-117948614);
            x340Var.r(false);
            return null;
        }
        x340Var.i0(-117948613);
        j2i j2iVarR = apo.r(-1691494072, new dhx(j2iVar, obj, i, (byte) 1), x340Var);
        x340Var.r(false);
        return j2iVarR;
    }

    public static final int C(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    public static rey0 D() {
        return new rey0(itl.c);
    }

    public static int E(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final List F(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(o7h.q0(list));
        }
        return z6x.a;
    }

    public static final Map G(Map map) {
        int size = map.size();
        if (size == 0) {
            return b7x.a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) o7h.p0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final void H(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            hhg1.n("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] I(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            hhg1.n("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static final byte[] J(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return I(0, 0, bArr.length, bArr, bArr2);
        }
        hhg1.n("The lengths of x and y should match.");
        return null;
    }

    public static float K() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static Provider L() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(g[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static void M(int i, int i2) {
        String strK0;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strK0 = jch0.k0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strK0 = jch0.k0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strK0);
        }
    }

    public static void N(int i, int i2, int i3) {
        String strO;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strO = O(i, i3, "start index");
            } else {
                strO = (i2 < 0 || i2 > i3) ? O(i2, i3, "end index") : jch0.k0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strO);
        }
    }

    public static String O(int i, int i2, String str) {
        if (i < 0) {
            return jch0.k0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jch0.k0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }

    public static final long a(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final void b(Function0 function0, scx scxVar, String str, String str2, lcx lcxVar, lcx lcxVar2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-344274043);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(scxVar) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.g(lcxVar) ? 16384 : 8192) | (x340Var.g(lcxVar2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            c(scxVar, B(str, xij.a, x340Var, ((i2 >> 6) & 14) | 48), B(str2, xij.b, x340Var, ((i2 >> 9) & 14) | 48), B(lcxVar, xij.c, x340Var, ((i2 >> 12) & 14) | 48), B(lcxVar2, xij.d, x340Var, ((i2 >> 15) & 14) | 48), function0, x340Var, ((i2 >> 3) & 14) | ((i2 << 15) & 458752), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(function0, scxVar, str, str2, lcxVar, lcxVar2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[PHI: r1 r2
      0x00b5: PHI (r1v8 p.scx) = (r1v5 p.scx), (r1v3 p.scx), (r1v3 p.scx) binds: [B:70:0x00c1, B:64:0x00b1, B:65:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r2v14 int) = (r2v9 int), (r2v7 int), (r2v15 int) binds: [B:70:0x00c1, B:64:0x00b1, B:65:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void c(scx scxVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, Function0 function0, b0k b0kVar, int i, int i2) {
        scx scxVarM;
        int i3;
        vu30 vu30Var5;
        boolean z;
        b0k b0kVar2;
        vu30 vu30Var6;
        h311 h311VarV;
        vu30 vu30Var7;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1239784821);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                scxVarM = scxVar;
                int i5 = b0kVar3.g(scxVarM) ? 4 : 2;
                i3 = i5 | i;
            } else {
                scxVarM = scxVar;
            }
            i3 = i5 | i;
        } else {
            scxVarM = scxVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(vu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(vu30Var3) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                vu30Var5 = vu30Var4;
                i3 |= b0kVar3.i(vu30Var5) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(function0)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if ((i2 & 1) != 0) {
                        scxVarM = pno1.m(b0kVar3);
                        i3 &= -15;
                    }
                    if (i6 != 0) {
                        vu30Var7 = null;
                    }
                    b0kVar3.s();
                    vu30Var5 = vu30Var7;
                    b0kVar2 = b0kVar3;
                    x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(585552948, new kj21(vu30Var, vu30Var2, vu30Var3, vu30Var7, (byte) 13), b0kVar3), b0kVar2, ((i3 >> 15) & 14) | 12582912 | ((i3 << 3) & 112), 48, 1916);
                } else {
                    b0kVar3.b0();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                }
                vu30Var7 = vu30Var5;
                b0kVar3.s();
                vu30Var5 = vu30Var7;
                b0kVar2 = b0kVar3;
                x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(585552948, new kj21(vu30Var, vu30Var2, vu30Var3, vu30Var7, (byte) 13), b0kVar3), b0kVar2, ((i3 >> 15) & 14) | 12582912 | ((i3 << 3) & 112), 48, 1916);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            vu30Var6 = vu30Var5;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(scxVarM, vu30Var, vu30Var2, vu30Var3, vu30Var6, function0, i, i2, (byte) 14);
            }
        }
        i3 |= 24576;
        vu30Var5 = vu30Var4;
        if ((196608 & i) == 0) {
            if (b0kVar3.i(function0)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if ((i2 & 1) != 0) {
                    scxVarM = pno1.m(b0kVar3);
                    i3 &= -15;
                }
                if (i6 != 0) {
                    vu30Var7 = null;
                } else {
                    vu30Var7 = vu30Var5;
                }
            } else {
                if ((i2 & 1) != 0) {
                    scxVarM = pno1.m(b0kVar3);
                    i3 &= -15;
                }
                if (i6 != 0) {
                    vu30Var7 = null;
                } else {
                    vu30Var7 = vu30Var5;
                }
            }
            b0kVar3.s();
            vu30Var5 = vu30Var7;
            b0kVar2 = b0kVar3;
            x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(585552948, new kj21(vu30Var, vu30Var2, vu30Var3, vu30Var7, (byte) 13), b0kVar3), b0kVar2, ((i3 >> 15) & 14) | 12582912 | ((i3 << 3) & 112), 48, 1916);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        vu30Var6 = vu30Var5;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(scxVarM, vu30Var, vu30Var2, vu30Var3, vu30Var6, function0, i, i2, (byte) 14);
        }
    }

    public static final void d(vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, b0k b0kVar, int i, int i2) {
        vu30 vu30Var6;
        int i3;
        boolean z;
        j2i j2iVarJ;
        j2i j2iVarJ2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(518083186);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            vu30Var6 = vu30Var;
        } else {
            vu30Var6 = vu30Var;
            i3 = (x340Var.i(vu30Var6) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(vu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(vu30Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(vu30Var4) ? 2048 : 1024;
        }
        int i5 = i3 | (x340Var.i(vu30Var5) ? 16384 : 8192);
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            if (i4 != 0) {
                vu30Var6 = null;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = too1.y(uyn1.x(qim0VarF, cbx.b(x340Var).e.a()), poo1.F(cev0.E(x340Var), 32));
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5((byte) 16)), eraVar, x340Var, 48);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (vu30Var6 == null) {
                x340Var.i0(-1585106695);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-1585106694);
                vu30Var6.invoke(x340Var, 0);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x0d.s(nim0Var, 8.0f, x340Var, false);
            }
            if (vu30Var2 == null) {
                x340Var.i0(-1585000799);
                x340Var.r(z);
                j2iVarJ = null;
            } else {
                x340Var.i0(-2129339040);
                j2iVarJ = apo.j(-63878682, new ehx(cbx.d(x340Var).e, vu30Var2, (byte) 1), true);
                x340Var.r(z);
            }
            if (j2iVarJ == null) {
                x340Var.i0(-1584944751);
            } else {
                x340Var.i0(-2129337232);
                j2iVarJ.invoke(x340Var, 0);
            }
            x340Var.r(z);
            if (vu30Var3 == null) {
                x340Var.i0(-1584921470);
                x340Var.r(z);
                j2iVarJ2 = null;
            } else {
                x340Var.i0(-2129336481);
                j2iVarJ2 = apo.j(-63878682, new ehx(cbx.d(x340Var).j, vu30Var3, (byte) 1), true);
                x340Var.r(z);
            }
            if (j2iVarJ2 == null) {
                x340Var.i0(-1584866383);
            } else {
                x340Var.i0(-2129334704);
                j2iVarJ2.invoke(x340Var, 0);
            }
            x340Var.r(z);
            if ((vu30Var4 == null && vu30Var5 == null) || (vu30Var2 == null && vu30Var3 == null)) {
                x340Var.i0(-1584687078);
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-1584758192);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x0d.s(nim0Var, 8.0f, x340Var, false);
            }
            if (vu30Var4 == null) {
                x340Var.i0(-1584666991);
                x340Var.r(z2);
            } else {
                x340Var.i0(-2129328272);
                us71.j((i5 >> 9) & 14, vu30Var4, x340Var, z2);
            }
            if (vu30Var5 == null) {
                x340Var.i0(-1584637231);
                x340Var.r(z2);
            } else {
                x340Var.i0(-2129327312);
                us71.j((i5 >> 12) & 14, vu30Var5, x340Var, z2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        vu30 vu30Var7 = vu30Var6;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qf91(vu30Var7, vu30Var2, vu30Var3, vu30Var4, vu30Var5, i, i2);
        }
    }

    public static final vq31 e(float f2, float f3, float f4, float f5, float f6, float f7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        return new vq31(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final vq31 f(n511 n511Var, long j, long j2, long j3, long j4) {
        return new vq31(n511Var.a, n511Var.b, n511Var.c, n511Var.d, j, j2, j3, j4);
    }

    public static final vq31 g(float f2, float f3, float f4, float f5, long j) {
        return e(f2, f3, f4, f5, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final vq31 h(long j, n511 n511Var) {
        return e(n511Var.a, n511Var.b, n511Var.c, n511Var.d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void i(ta51 ta51Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f2;
        boolean z;
        long j;
        int iL0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2115347605);
        int i2 = i | (x340Var.g(ta51Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5((byte) 16)), een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (ta51Var.b().contains(sa51.e)) {
                x340Var.i0(1329361142);
                xap1.f(0, 1, x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                x340Var.i0(1329387089);
                x340Var.r(false);
            }
            if (ta51Var.b().contains(sa51.g)) {
                x340Var.i0(1329437092);
                suo1.h(6, 6, "PREMIUM", (String) null, x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                x340Var.i0(1329480337);
                x340Var.r(false);
            }
            c380 c380VarB = ta51Var.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c380VarB) {
                if (obj instanceof ra51) {
                    arrayList.add(obj);
                }
            }
            ra51 ra51Var = (ra51) o7h.s0(arrayList);
            int iO = (ra51Var == null || (iL0 = ra51Var.l0()) == 0) ? 0 : oqn1.o(iL0);
            if (iO == 0) {
                x340Var.i0(1329700622);
                x340Var.r(false);
            } else {
                x340Var.i0(1329700623);
                kqn1.d(iO, 0, 2, x340Var, (qim0) null);
                x340Var.r(false);
            }
            boolean zContains = ta51Var.b().contains(sa51.d);
            isl islVar = isl.a;
            if (zContains) {
                x340Var.i0(1329826235);
                oox ooxVar = oox.c;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                f2 = 12.0f;
                w0h1.a(ooxVar, islVar, u291.r(qim0Var3, 12.0f), 0L, 0L, false, x340Var, oox.d | 48, 56);
                x340Var.r(false);
            } else {
                f2 = 12.0f;
                x340Var.i0(1330037841);
                x340Var.r(false);
            }
            if (ta51Var.b().contains(sa51.i)) {
                x340Var.i0(1330101546);
                xtx xtxVar = xtx.c;
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(xtxVar, new jsl(cwl1.o0(x340Var, 2131963744)), u291.r(qim0Var3, f2), 0L, 0L, false, x340Var, xtx.d, 56);
                x340Var.r(false);
            } else {
                x340Var.i0(1330390993);
                x340Var.r(false);
            }
            if (ta51Var.b().contains(sa51.h)) {
                x340Var.i0(1330460247);
                wsx wsxVar = wsx.c;
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var3 = cbx.b(x340Var).g;
                w0h1.a(wsxVar, islVar, u291.r(qim0Var3, f2), 0L, cbx.a(x340Var).b.b, true, x340Var, wsx.d | 196656, 8);
                x340Var.r(false);
            } else {
                x340Var.i0(1330737201);
                x340Var.r(false);
            }
            if (ta51Var.b().contains(sa51.f)) {
                x340Var.i0(1330797899);
                ptx ptxVar = ptx.c;
                uwr uwrVar5 = cbx.a;
                zov0 zov0Var4 = cbx.b(x340Var).g;
                w0h1.a(ptxVar, new jsl(cwl1.o0(x340Var, 2131952709)), u291.r(qim0Var3, f2), 0L, 0L, false, x340Var, ptx.d, 56);
                x340Var.r(false);
            } else {
                x340Var.i0(1331055633);
                x340Var.r(false);
            }
            if (ihc1.y0(ta51Var.c())) {
                z = true;
                x340Var.i0(1331346568);
                String strD = ta51Var.d();
                cjc0 cjc0Var = new cjc0(1);
                if (ta51Var.e()) {
                    x340Var.i0(-1481067843);
                    uwr uwrVar6 = cbx.a;
                    j = cbx.a(x340Var).b.c;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1481066280);
                    uwr uwrVar7 = cbx.a;
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                }
                uwo1.e(strD, (qim0) null, (lee1) null, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1718);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1331109976);
                String strC = ta51Var.c();
                String strD2 = ta51Var.d();
                ye5 ye5VarO = kk0.o(1342184255, x340Var);
                uwr uwrVar8 = cbx.a;
                int iO2 = ye5VarO.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var).h.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65503));
                try {
                    ye5VarO.g(strC);
                    ye5VarO.k(iO2);
                    if (strD2.length() > 0) {
                        ye5VarO.g(" • ");
                        ye5VarO.g(strD2);
                    }
                    af5 af5VarP = ye5VarO.p();
                    x340Var.r(false);
                    z = true;
                    uwo1.d(af5VarP, cbx.a(x340Var).b.b, (qim0) null, (lee1) null, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (cqs0) null, x340Var, 1572864, 0, 3772);
                    x340Var = x340Var;
                    x340Var.r(false);
                } catch (Throwable th) {
                    ye5VarO.k(iO2);
                    throw th;
                }
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(ta51Var, qim0Var2, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x0228  */
    /* JADX WARN: Code duplicated, block: B:109:0x023d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0249  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:118:0x026a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0271  */
    /* JADX WARN: Code duplicated, block: B:122:0x0293  */
    /* JADX WARN: Code duplicated, block: B:124:0x0297  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x011d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0197  */
    public static final void j(dbp dbpVar, cce cceVar, q9l1 q9l1Var, z0i z0iVar, Consumer consumer, boolean z, qim0 qim0Var, erl1 erl1Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z2;
        b0k b0kVar2;
        erl1 erl1Var2;
        qim0 qim0Var3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var4;
        erl1 erl1VarD;
        int i5;
        int i6;
        qim0 qim0Var5;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        Object objT2;
        tob1 tob1Var;
        Object objT3;
        tob1 tob1Var2;
        boolean zI;
        Object nsf1Var;
        ven0 ven0Var2;
        tob1 tob1Var3;
        qim0 qim0Var6;
        qim0 qim0Var7;
        erl1 erl1Var3;
        tob1 tob1Var4;
        ven0 ven0VarV;
        boolean zI2;
        Object objT4;
        boolean zI3;
        Object objT5;
        n1i n1iVar;
        qim0 qim0VarX;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-81421400);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(dbpVar) : b0kVar3.i(dbpVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(cceVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(q9l1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(z0iVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(consumer) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.h(z) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 == 0) {
            if ((1572864 & i) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= 4194304;
            }
            if ((4793491 & i3) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i3 & 1, z2)) {
                b0kVar3.d0();
                i4 = i & 1;
                qim0Var4 = nim0.a;
                if (i4 != 0 || b0kVar3.E()) {
                    if (i7 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    erl1VarD = cev0.D(b0kVar3);
                    i5 = i3 & (-29360129);
                } else {
                    b0kVar3.b0();
                    i5 = i3 & (-29360129);
                    erl1VarD = erl1Var;
                }
                i6 = i5;
                qim0Var5 = qim0Var2;
                b0kVar3.s();
                qim0 qim0VarY = too1.y(u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3), poo1.F(erl1VarD, 16));
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(tgp1.l(b0kVar3));
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarY);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(hmb0.t1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(gfh0VarC, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                objT = b0kVar3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = xto.t((Object) null);
                    b0kVar3.s0(objT);
                }
                ven0Var = (ven0) objT;
                objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = xto.t((Object) null);
                    b0kVar3.s0(objT2);
                }
                tob1Var = (ven0) objT2;
                objT3 = b0kVar3.T();
                if (objT3 == m4cVar) {
                    objT3 = xto.t(Boolean.FALSE);
                    b0kVar3.s0(objT3);
                }
                tob1Var2 = (ven0) objT3;
                zI = b0kVar3.i(q9l1Var) | b0kVar3.i(ven0Var) | b0kVar3.i(tob1Var) | b0kVar3.i(tob1Var2);
                Object objT6 = b0kVar3.T();
                if (!zI || objT6 == m4cVar) {
                    erl1 erl1Var4 = erl1VarD;
                    ven0Var2 = ven0Var;
                    tob1Var3 = tob1Var;
                    qim0Var6 = qim0Var5;
                    qim0Var7 = qim0Var4;
                    erl1Var3 = erl1Var4;
                    nsf1Var = new nsf1(q9l1Var, ven0Var2, tob1Var3, tob1Var2, (lnm) null, (byte) 15);
                    tob1Var4 = tob1Var2;
                    b0kVar3.s0(nsf1Var);
                } else {
                    qim0Var6 = qim0Var5;
                    erl1Var3 = erl1VarD;
                    ven0Var2 = ven0Var;
                    tob1Var3 = tob1Var;
                    nsf1Var = objT6;
                    qim0Var7 = qim0Var4;
                    tob1Var4 = tob1Var2;
                }
                qxd0.t(rih1.a, b0kVar3, (vu30) nsf1Var);
                ven0VarV = xto.v(consumer, b0kVar3);
                zI2 = b0kVar3.i(ven0VarV);
                objT4 = b0kVar3.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new i2g1(ven0VarV, (byte) 19);
                    b0kVar3.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                qim0 qim0VarThen = lrn1.x(u291.s(uyn1.z(0.0f, 4.0f, 1, uyn1.B(anm1.N("watch_feed_back_button", qim0Var7), 8.0f, 0.0f, 0.0f, 0.0f, 14)), 48.0f, 48.0f), 1.0f).then(dgo1.s((ew50) tob1Var3.getValue()));
                zI3 = b0kVar3.i(ven0Var2);
                objT5 = b0kVar3.T();
                if (zI3 || objT5 == m4cVar) {
                    objT5 = new i2g1(ven0Var2, (byte) 20);
                    b0kVar3.s0(objT5);
                }
                iu30 iu30Var2 = (iu30) objT5;
                b0kVar2 = b0kVar3;
                dm5.a(iu30Var, qim0VarThen, iu30Var2, b0kVar2, 0, 0);
                if (z0iVar == null) {
                    b0kVar2.i0(36401339);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(36401340);
                    if (z) {
                        n1iVar = n1i.d;
                    } else {
                        n1iVar = n1i.a;
                    }
                    n1i n1iVar2 = n1iVar;
                    qim0 qim0VarF = u291.f(qim0Var7, 1.0f);
                    if (((Boolean) tob1Var4.getValue()).booleanValue()) {
                        qim0VarX = lrn1.x(qim0Var7, 2.0f);
                    } else {
                        qim0VarX = qim0Var7;
                    }
                    rwq.e(cceVar, dbpVar, z0iVar, n1iVar2, qim0VarF.then(qim0VarX), b0kVar2, ((i6 >> 3) & 14) | ((i6 << 3) & 112));
                    b0kVar2.r(false);
                }
                b0kVar2.r(true);
                qim0Var3 = qim0Var6;
                erl1Var2 = erl1Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                erl1Var2 = erl1Var;
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(dbpVar, cceVar, q9l1Var, z0iVar, consumer, z, qim0Var3, erl1Var2, i, i2);
            }
        }
        i3 |= 1572864;
        qim0Var2 = qim0Var;
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((4793491 & i3) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar3.Y(i3 & 1, z2)) {
            b0kVar3.d0();
            i4 = i & 1;
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                erl1VarD = cev0.D(b0kVar3);
                i5 = i3 & (-29360129);
            } else {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                erl1VarD = cev0.D(b0kVar3);
                i5 = i3 & (-29360129);
            }
            i6 = i5;
            qim0Var5 = qim0Var2;
            b0kVar3.s();
            qim0 qim0VarY2 = too1.y(u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3), poo1.F(erl1VarD, 16));
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(tgp1.l(b0kVar3));
            xos0VarM = b0kVar3.m();
            qim0VarE = zr7.E(b0kVar3, qim0VarY2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a != null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            objT = b0kVar3.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t((Object) null);
                b0kVar3.s0(objT);
            }
            ven0Var = (ven0) objT;
            objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = xto.t((Object) null);
                b0kVar3.s0(objT2);
            }
            tob1Var = (ven0) objT2;
            objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = xto.t(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            tob1Var2 = (ven0) objT3;
            zI = b0kVar3.i(q9l1Var) | b0kVar3.i(ven0Var) | b0kVar3.i(tob1Var) | b0kVar3.i(tob1Var2);
            Object objT7 = b0kVar3.T();
            if (zI) {
                erl1 erl1Var5 = erl1VarD;
                ven0Var2 = ven0Var;
                tob1Var3 = tob1Var;
                qim0Var6 = qim0Var5;
                qim0Var7 = qim0Var4;
                erl1Var3 = erl1Var5;
                nsf1Var = new nsf1(q9l1Var, ven0Var2, tob1Var3, tob1Var2, (lnm) null, (byte) 15);
                tob1Var4 = tob1Var2;
                b0kVar3.s0(nsf1Var);
            } else {
                erl1 erl1Var6 = erl1VarD;
                ven0Var2 = ven0Var;
                tob1Var3 = tob1Var;
                qim0Var6 = qim0Var5;
                qim0Var7 = qim0Var4;
                erl1Var3 = erl1Var6;
                nsf1Var = new nsf1(q9l1Var, ven0Var2, tob1Var3, tob1Var2, (lnm) null, (byte) 15);
                tob1Var4 = tob1Var2;
                b0kVar3.s0(nsf1Var);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) nsf1Var);
            ven0VarV = xto.v(consumer, b0kVar3);
            zI2 = b0kVar3.i(ven0VarV);
            objT4 = b0kVar3.T();
            if (zI2) {
                objT4 = new i2g1(ven0VarV, (byte) 19);
                b0kVar3.s0(objT4);
            } else {
                objT4 = new i2g1(ven0VarV, (byte) 19);
                b0kVar3.s0(objT4);
            }
            iu30 iu30Var3 = (iu30) objT4;
            qim0 qim0VarThen2 = lrn1.x(u291.s(uyn1.z(0.0f, 4.0f, 1, uyn1.B(anm1.N("watch_feed_back_button", qim0Var7), 8.0f, 0.0f, 0.0f, 0.0f, 14)), 48.0f, 48.0f), 1.0f).then(dgo1.s((ew50) tob1Var3.getValue()));
            zI3 = b0kVar3.i(ven0Var2);
            objT5 = b0kVar3.T();
            if (zI3) {
                objT5 = new i2g1(ven0Var2, (byte) 20);
                b0kVar3.s0(objT5);
            } else {
                objT5 = new i2g1(ven0Var2, (byte) 20);
                b0kVar3.s0(objT5);
            }
            iu30 iu30Var4 = (iu30) objT5;
            b0kVar2 = b0kVar3;
            dm5.a(iu30Var3, qim0VarThen2, iu30Var4, b0kVar2, 0, 0);
            if (z0iVar == null) {
                b0kVar2.i0(36401339);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(36401340);
                if (z) {
                    n1iVar = n1i.d;
                } else {
                    n1iVar = n1i.a;
                }
                n1i n1iVar3 = n1iVar;
                qim0 qim0VarF2 = u291.f(qim0Var7, 1.0f);
                if (((Boolean) tob1Var4.getValue()).booleanValue()) {
                    qim0VarX = lrn1.x(qim0Var7, 2.0f);
                } else {
                    qim0VarX = qim0Var7;
                }
                rwq.e(cceVar, dbpVar, z0iVar, n1iVar3, qim0VarF2.then(qim0VarX), b0kVar2, ((i6 >> 3) & 14) | ((i6 << 3) & 112));
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            qim0Var3 = qim0Var6;
            erl1Var2 = erl1Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            erl1Var2 = erl1Var;
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new s2g(dbpVar, cceVar, q9l1Var, z0iVar, consumer, z, qim0Var3, erl1Var2, i, i2);
        }
    }

    public static final gt40 k(gt40 gt40Var, z9h z9hVar) {
        return gt40Var.c(new hy9(z9hVar));
    }

    public static final gt40 l(gt40 gt40Var, long j) {
        return k(gt40Var, d5p1.a(j));
    }

    public static gt40 m(gt40 gt40Var, p05 p05Var) {
        return gt40Var.c(new iy9(p05Var));
    }

    public static byte[] n(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                k220.r("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final b7 o(tka0 tka0Var) {
        List listF = mod.f(tka0Var);
        ArrayList arrayList = new ArrayList(q7h.U(listF, 10));
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(new tma0(1, anm1.u((qma0) it.next(), (ArrayList) null, 7)));
        }
        return anm1.u(tka0Var, arrayList, 6);
    }

    public static u4r p(String str, e761 e761Var, ze3 ze3Var, llm llmVar) {
        return new u4r(str, e761Var, ze3Var, d4r.d1, llmVar);
    }

    public static final boolean q(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static final String r(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((gq70) it.next()).a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof p57) {
                arrayList2.add(obj);
            }
        }
        p57 p57Var = (p57) o7h.s0(arrayList2);
        String strB = p57Var != null ? p57Var.b() : null;
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public static Object s(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return yh5.d(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static Serializable t(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return yh5.e(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static final boolean u(q6w0 q6w0Var) {
        return (q6w0Var.K() == null && q6w0Var.h() == null && q6w0Var.j() == null && q6w0Var.s() == null && q6w0Var.t() == null && q6w0Var.B() == null && q6w0Var.x() == null && q6w0Var.H() == null && q6w0Var.F() == null && q6w0Var.g() == null && q6w0Var.b() == null && q6w0Var.l() == null && q6w0Var.k() == null && q6w0Var.r() == null && q6w0Var.n() == null) ? false : true;
    }

    public static int v(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return uah.c(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean w(vq31 vq31Var) {
        long j = vq31Var.e;
        return (j >>> 32) == (4294967295L & j) && j == vq31Var.f && j == vq31Var.g && j == vq31Var.h;
    }

    public static final boolean x(tka0 tka0Var, tka0 tka0Var2) {
        if (tka0Var.equals(tka0Var2)) {
            return true;
        }
        List listX = k4p1.x(tka0Var);
        hla0 hla0Var = hla0.b;
        return syo1.s(listX, new ypa(), new gla0((Object) tka0Var2, (byte) 0)).booleanValue();
    }

    public static final w4b1 y(vhc vhcVar, String str, Executor executor, Function0 function0) {
        return new w4b1(upn1.t(new ulq0(executor, vhcVar, str, function0, new kdn0(w4b1.d))), (byte) 1);
    }

    public static float z(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }
}
