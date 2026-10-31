package p;

import android.content.res.Resources;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Messenger;
import android.text.Spanned;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mmo1 {
    public static final j690 a = new j690((byte) 10);
    public static b180 b;

    public static final boolean A(za60 za60Var) {
        return za60Var.a.a() || za60Var.b.a();
    }

    public static final String E(int i, Resources resources) {
        Integer num;
        switch (i) {
            case 1:
                num = 2131964222;
                break;
            case 2:
                num = 2131964219;
                break;
            case 3:
                num = 2131964225;
                break;
            case 4:
                num = 2131964214;
                break;
            case 5:
                num = 2131964226;
                break;
            case 6:
                num = 2131964224;
                break;
            case 7:
                num = 2131964223;
                break;
            case 8:
                num = 2131964215;
                break;
            case 9:
                num = 2131964233;
                break;
            case 10:
                num = 2131964231;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                num = 2131964229;
                break;
            case grn1.d /* 12 */:
                num = 2131964218;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            String string = resources.getString(num.intValue());
            string.getClass();
            return string;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, i - 1);
        String str = new SimpleDateFormat("MMMM", Locale.getDefault()).format(calendar.getTime());
        str.getClass();
        return str;
    }

    public static final void F(Throwable th, o8n o8nVar) {
        Throwable runtimeException;
        Iterator it = s8n.a.iterator();
        while (it.hasNext()) {
            try {
                ((r8n) it.next()).p(th, o8nVar);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    j2h1.h(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            j2h1.h(th, new DiagnosticCoroutineContextException(o8nVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r12 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r12 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        return r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a3 -> B:35:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G(p.cke r9, p.pie r10, java.lang.String r11, p.onm r12) {
        /*
            boolean r0 = r12 instanceof p.vie
            if (r0 == 0) goto L13
            r0 = r12
            p.vie r0 = (p.vie) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.vie r0 = new p.vie
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f
            int r1 = r0.g
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L35
            int r9 = r0.e
            int r10 = r0.d
            java.util.Iterator r11 = r0.c
            p.cke r1 = r0.a
            p.hm5.M(r12)
            goto La6
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r5
        L3b:
            java.lang.String r11 = r0.b
            p.cke r9 = r0.a
            p.hm5.M(r12)
            goto L53
        L43:
            p.hm5.M(r12)
            r0.a = r9
            r0.b = r11
            r0.g = r4
            java.lang.Object r12 = r10.a(r0)
            if (r12 != r6) goto L53
            goto La5
        L53:
            java.util.List r12 = (java.util.List) r12
            int r10 = r12.indexOf(r11)
            if (r10 < 0) goto Lc3
            int r11 = r12.size()
            int r11 = r11 - r4
            if (r10 < r11) goto L63
            goto Lc3
        L63:
            int r11 = r10 + 1
            int r1 = r12.size()
            java.util.List r11 = r12.subList(r11, r1)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L7d
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L7d
            goto Lbe
        L7d:
            java.util.Iterator r11 = r11.iterator()
            r1 = r9
            r9 = r3
        L83:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lbe
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            p.mr20 r12 = r1.y(r12)
            r0.a = r1
            r0.b = r5
            r0.c = r11
            r0.d = r10
            r0.e = r9
            r0.g = r2
            java.lang.Object r12 = p.b5p1.k(r12, r0)
            if (r12 != r6) goto La6
        La5:
            return r6
        La6:
            p.iix0 r12 = (p.iix0) r12
            boolean r7 = p.smo1.v(r12)
            p.ake r8 = p.ake.b
            if (r7 == 0) goto Lb3
            p.ake r12 = p.ake.a
            goto Lbb
        Lb3:
            boolean r12 = r12 instanceof p.gix0
            if (r12 == 0) goto Lba
            p.ake r12 = p.ake.c
            goto Lbb
        Lba:
            r12 = r8
        Lbb:
            if (r12 == r8) goto L83
            r3 = r4
        Lbe:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        Lc3:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mmo1.G(p.cke, p.pie, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r10 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r10 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (p.smo1.v((p.iix0) r10) == false) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0098 -> B:34:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H(p.cke r7, p.pie r8, java.lang.String r9, p.onm r10) {
        /*
            boolean r0 = r10 instanceof p.wie
            if (r0 == 0) goto L13
            r0 = r10
            p.wie r0 = (p.wie) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.wie r0 = new p.wie
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L34
            int r7 = r0.e
            int r8 = r0.d
            java.util.Iterator r9 = r0.c
            p.cke r1 = r0.a
            p.hm5.M(r10)
            goto L9b
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L3a:
            java.lang.String r9 = r0.b
            p.cke r7 = r0.a
            p.hm5.M(r10)
            goto L52
        L42:
            p.hm5.M(r10)
            r0.a = r7
            r0.b = r9
            r0.g = r3
            java.lang.Object r10 = r8.a(r0)
            if (r10 != r6) goto L52
            goto L9a
        L52:
            java.util.List r10 = (java.util.List) r10
            int r8 = r10.indexOf(r9)
            if (r8 > 0) goto L5d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L5d:
            java.util.List r9 = r10.subList(r4, r8)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L72
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L72
        L70:
            r3 = r4
            goto La3
        L72:
            java.util.Iterator r9 = r9.iterator()
            r1 = r7
            r7 = r4
        L78:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L70
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            p.mr20 r10 = r1.y(r10)
            r0.a = r1
            r0.b = r5
            r0.c = r9
            r0.d = r8
            r0.e = r7
            r0.g = r2
            java.lang.Object r10 = p.b5p1.k(r10, r0)
            if (r10 != r6) goto L9b
        L9a:
            return r6
        L9b:
            p.iix0 r10 = (p.iix0) r10
            boolean r10 = p.smo1.v(r10)
            if (r10 != 0) goto L78
        La3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mmo1.H(p.cke, p.pie, java.lang.String, p.onm):java.lang.Object");
    }

    public static boolean I(Messenger messenger) {
        if (messenger != null) {
            try {
                if (messenger.getBinder() != null) {
                    return true;
                }
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Enum J(cke ckeVar, String str, onm onmVar) throws AbortFlowException {
        xie xieVar;
        if (onmVar instanceof xie) {
            xieVar = (xie) onmVar;
            int i = xieVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xieVar.b = i - Integer.MIN_VALUE;
            } else {
                xieVar = new xie(onmVar);
            }
        } else {
            xieVar = new xie(onmVar);
        }
        Object objK = xieVar.a;
        int i2 = xieVar.b;
        if (i2 == 0) {
            hm5.M(objK);
            mr20 mr20VarY = ckeVar.y(str);
            xieVar.b = 1;
            objK = b5p1.k(mr20VarY, xieVar);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        iix0 iix0Var = (iix0) objK;
        if (smo1.v(iix0Var)) {
            return ake.a;
        }
        return iix0Var instanceof gix0 ? ake.c : ake.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final y7u K(pr31 pr31Var, ekb ekbVar) {
        boolean zContainsKey;
        gvh0 gvh0Var;
        gvh0 gvh0Var2;
        gvh0 gvh0Var3;
        Bundle bundleD;
        lwh0 lwh0Var = pr31Var.l;
        c3e c3eVarH = ekb.H(pr31Var.k);
        if (c3eVarH == null) {
            return null;
        }
        boolean z = c3eVarH.g;
        if (lwh0Var == null || (gvh0Var3 = lwh0Var.u) == null || (bundleD = gvh0Var3.d()) == null) {
            zContainsKey = false;
        } else {
            try {
                bundleD.setClassLoader(c3e.class.getClassLoader());
                zContainsKey = bundleD.containsKey("com.google.android.gms.cast.EXTRA_SESSION_ID");
            } catch (BadParcelableException e) {
                Logger.d("CastBasic->%s", new Object[]{l1d.m("isSessionCastDevice failed to unparcel extras: ", e.getMessage())});
                zContainsKey = false;
            }
        }
        if ((lwh0Var != null && (gvh0Var2 = lwh0Var.u) != null && gvh0Var2.a.getBoolean("isDynamicGroupRoute", false)) || zContainsKey) {
            if (lwh0Var != null && (gvh0Var = lwh0Var.u) != null) {
                gvh0Var.a.getBoolean("isDynamicGroupRoute", false);
            }
            return null;
        }
        boolean z2 = c3eVarH.f;
        Object[] objArr = z2 && !z;
        return new y7u(c3eVarH.h ? 1 : 0, c3eVarH.a, c3eVarH.b, c3eVarH.c, c3eVarH.d, c3eVarH.e, objArr != false ? "CASTAUDIO" : "CASTVIDEO", objArr != false ? "PREMIUM" : "FREE", z2 && !z && c3eVarH.i);
    }

    public static Object L(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            hhg1.n(gvg.l(new StringBuilder(String.valueOf(i).length() + 41), "must be power of 2 between 2^1 and 2^30: ", i));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static int M(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static void N(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int O(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZ = omo1.z(obj);
        int i2 = iZ & i;
        int iM = M(i2, obj3);
        if (iM != 0) {
            int i3 = ~i;
            int i4 = iZ & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !Objects.equals(obj, objArr[i6]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iM = i8;
                } else {
                    if (i5 == -1) {
                        N(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = (iArr[i5] & i3) | (i8 & i);
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x013e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0193  */
    /* JADX WARN: Code duplicated, block: B:95:0x019e  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void g(boolean z, String str, ArrayList arrayList, Function0 function0, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z2;
        x340 x340Var;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        vy71 vy71VarF;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        Object objT2;
        c9n c9nVar;
        boolean z3;
        boolean zI;
        vy71 vy71Var;
        Object hl0Var;
        boolean z4;
        boolean z5;
        Object yt6Var;
        c9n c9nVar2;
        qim0 qim0Var5;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-396215110);
        if ((i & 6) == 0) {
            i3 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.g(arrayList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.i(vu30Var) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var2.i(qim0Var2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i4 & 1, z2)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                vy71VarF = dem0.f(0, 3, x340Var2, (iu30) null, false);
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0Var = (ven0) objT;
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(objT2);
                }
                c9nVar = (c9n) objT2;
                Boolean boolValueOf = Boolean.valueOf(z);
                if ((i4 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI = z3 | x340Var2.i(ven0Var) | x340Var2.i(vy71VarF);
                Object objT3 = x340Var2.T();
                if (!zI || objT3 == m4cVar) {
                    vy71Var = vy71VarF;
                    hl0Var = new hl0(z, vy71Var, ven0Var, (lnm) null, (byte) 3);
                    x340Var2.s0(hl0Var);
                } else {
                    vy71Var = vy71VarF;
                    hl0Var = objT3;
                }
                qxd0.t(boolValueOf, x340Var2, (vu30) hl0Var);
                if (!((Boolean) ven0Var.getValue()).booleanValue() || z) {
                    x340Var2.i0(-1073675587);
                    boolean zI2 = x340Var2.i(c9nVar) | x340Var2.i(vy71Var) | x340Var2.i(ven0Var);
                    if ((i4 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zI2 | z4;
                    Object objT4 = x340Var2.T();
                    if (!z5 || objT4 == m4cVar) {
                        c9nVar2 = c9nVar;
                        yt6Var = new yt6(c9nVar2, vy71Var, function0, ven0Var, (byte) 0);
                        x340Var2.s0(yt6Var);
                    } else {
                        yt6Var = objT4;
                        c9nVar2 = c9nVar;
                    }
                    qim0Var5 = qim0Var4;
                    poo1.k(qim0Var5, (Function0) yt6Var, vy71Var, 0L, null, 0, 0.0f, null, apo.r(-659226051, new k40(str, arrayList, c9nVar2, vy71Var, ven0Var, vu30Var, (byte) 7), x340Var2), x340Var2, ((i4 >> 15) & 14) | 100663296);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var2.i0(-1073019224);
                    x340Var2.r(false);
                    x340Var = x340Var2;
                    qim0Var5 = qim0Var4;
                }
                qim0Var3 = qim0Var5;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(z, str, arrayList, function0, vu30Var, qim0Var3, i, i2);
            }
        }
        i3 |= 196608;
        qim0Var2 = qim0Var;
        i4 = i3;
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i4 & 1, z2)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            vy71VarF = dem0.f(0, 3, x340Var2, (iu30) null, false);
            objT = x340Var2.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0Var = (ven0) objT;
            objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT2);
            }
            c9nVar = (c9n) objT2;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            if ((i4 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zI = z3 | x340Var2.i(ven0Var) | x340Var2.i(vy71VarF);
            Object objT5 = x340Var2.T();
            if (zI) {
                vy71Var = vy71VarF;
                hl0Var = new hl0(z, vy71Var, ven0Var, (lnm) null, (byte) 3);
                x340Var2.s0(hl0Var);
            } else {
                vy71Var = vy71VarF;
                hl0Var = new hl0(z, vy71Var, ven0Var, (lnm) null, (byte) 3);
                x340Var2.s0(hl0Var);
            }
            qxd0.t(boolValueOf2, x340Var2, (vu30) hl0Var);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var2.i0(-1073675587);
                boolean zI3 = x340Var2.i(c9nVar) | x340Var2.i(vy71Var) | x340Var2.i(ven0Var);
                if ((i4 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zI3 | z4;
                Object objT6 = x340Var2.T();
                if (z5) {
                    c9nVar2 = c9nVar;
                    yt6Var = new yt6(c9nVar2, vy71Var, function0, ven0Var, (byte) 0);
                    x340Var2.s0(yt6Var);
                } else {
                    c9nVar2 = c9nVar;
                    yt6Var = new yt6(c9nVar2, vy71Var, function0, ven0Var, (byte) 0);
                    x340Var2.s0(yt6Var);
                }
                qim0Var5 = qim0Var4;
                poo1.k(qim0Var5, (Function0) yt6Var, vy71Var, 0L, null, 0, 0.0f, null, apo.r(-659226051, new k40(str, arrayList, c9nVar2, vy71Var, ven0Var, vu30Var, (byte) 7), x340Var2), x340Var2, ((i4 >> 15) & 14) | 100663296);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var2.i0(-1073675587);
                boolean zI4 = x340Var2.i(c9nVar) | x340Var2.i(vy71Var) | x340Var2.i(ven0Var);
                if ((i4 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zI4 | z4;
                Object objT7 = x340Var2.T();
                if (z5) {
                    c9nVar2 = c9nVar;
                    yt6Var = new yt6(c9nVar2, vy71Var, function0, ven0Var, (byte) 0);
                    x340Var2.s0(yt6Var);
                } else {
                    c9nVar2 = c9nVar;
                    yt6Var = new yt6(c9nVar2, vy71Var, function0, ven0Var, (byte) 0);
                    x340Var2.s0(yt6Var);
                }
                qim0Var5 = qim0Var4;
                poo1.k(qim0Var5, (Function0) yt6Var, vy71Var, 0L, null, 0, 0.0f, null, apo.r(-659226051, new k40(str, arrayList, c9nVar2, vy71Var, ven0Var, vu30Var, (byte) 7), x340Var2), x340Var2, ((i4 >> 15) & 14) | 100663296);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            qim0Var3 = qim0Var5;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(z, str, arrayList, function0, vu30Var, qim0Var3, i, i2);
        }
    }

    public static final void h(String str, ArrayList arrayList, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1215044669);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(arrayList) ? 32 : 16) | (b0kVar2.i(vu30Var) ? 256 : 128) | 3072;
        byte b2 = 1;
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwo1.e(str, uyn1.z(cbx.b(b0kVar2).b.c, 0.0f, 2, u291.f(qim0Var3, 1.0f)), cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2016);
            avw0 avw0Var = cbx.b(b0kVar2).c;
            long j = cbx.a(b0kVar2).d.b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            b0kVar2 = b0kVar2;
            hr80.d(uyn1.z(0.0f, 16.0f, 1, qim0Var3), 1.0f, j, b0kVar2, 0, 0);
            b0kVar2.i0(1346408756);
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                au6 au6Var = (au6) obj;
                boolean zG = ((i2 & 896) == 256) | b0kVar2.g(au6Var) | b0kVar2.e(i3);
                Object objT = b0kVar2.T();
                if (zG || objT == fkj0.X) {
                    objT = new wv1(vu30Var, au6Var, i3, b2);
                    b0kVar2.s0(objT);
                }
                i(au6Var, (Function0) objT, null, b0kVar2, 0);
                i3 = i4;
            }
            b0kVar2.r(false);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) str, (Object) arrayList, (Object) vu30Var, (Object) qim0Var2, (byte) 8);
        }
    }

    public static final void i(au6 au6Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-988826075);
        int i2 = i | (x340Var.g(au6Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarF, (idn0) objT, ny3.a, false, null, null, function0, 28);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarV);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            Uri uri = Uri.parse(au6Var.c);
            as80 as80Var = mif1.P0;
            nkx nkxVar = nkx.c;
            nux nuxVar = new nux(nkxVar, nkxVar);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var = qim0Var2;
            eso1.e(uri, isl.a, i1p1.q(u291.r(qim0Var2, 48.0f), er31.a), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073741872, 0, 3512);
            uwo1.e(au6Var.b, new wnb0(1.0f, true), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(au6Var, function0, qim0Var3, i, (byte) 0);
        }
    }

    public static final void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(376931430);
        if (x340Var.Y(i & 1, i != 0)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            ryx ryxVarM = axo1.m(0, x340Var, 7);
            ywo1.b(cwl1.o0(x340Var, 2131959658), ryxVarM, null, null, apo.r(-1799984217, new yyr0((c9n) objT, ryxVarM, (byte) 0), x340Var), x340Var, 24576, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 2);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(525029823);
        if (x340Var.Y(i & 1, i != 0)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            ryx ryxVarM = axo1.m(0, x340Var, 7);
            ywo1.b(cwl1.o0(x340Var, 2131959659), ryxVarM, null, null, apo.r(2037159646, new yyr0((c9n) objT, ryxVarM, (byte) 1), x340Var), x340Var, 24576, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 3);
        }
    }

    public static final void l(ArrayList arrayList, cmt cmtVar, String str, String str2, String str3, String str4, ijp ijpVar, jjp jjpVar, kjp kjpVar, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1815388018);
        int i2 = i | (x340Var.g(arrayList) ? 4 : 2) | (x340Var.i(cmtVar) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.g(str3) ? 16384 : 8192) | (x340Var.g(str4) ? 131072 : 65536) | (x340Var.i(ijpVar) ? 1048576 : 524288) | (x340Var.i(jjpVar) ? 8388608 : 4194304) | (x340Var.i(kjpVar) ? 67108864 : 33554432) | 805306368;
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && ((x340Var.i(vu30Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean zB = ef.a(x340Var).b(6);
            qim0 qim0Var3 = nim0.a;
            w2g0.c(u291.c(qim0Var3, 1.0f), (tl3) null, apo.r(1175063544, new kb60(str2, arrayList, str3, vu30Var, zB, cmtVar, str, str4, kjpVar, ijpVar, jjpVar), x340Var), x340Var, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r6k(arrayList, cmtVar, str, str2, str3, str4, ijpVar, jjpVar, kjpVar, qim0Var2, vu30Var, i);
        }
    }

    public static final void m(String str, boolean z, jlz0 jlz0Var, b0k b0kVar, int i) {
        float f;
        lee1 lee1Var;
        FontFamily fontFamily;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1371215063);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(jlz0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.i0(817288250);
            float fM0 = ((wat) x340Var.k(t4k.h)).M0((int) (((crl1) x340Var.k(t4k.u)).a() >> 32));
            x340Var.r(false);
            se11 se11Var = lzj.a;
            boolean z3 = p3v.b(fM0, 300.0f) < 0;
            if (z3) {
                x340Var.i0(817294385);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 2.0f;
            } else {
                x340Var.i0(817295697);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 6.0f;
            }
            if (z3) {
                x340Var.i0(817297617);
                lee1Var = cbx.d(x340Var).m;
            } else {
                x340Var.i0(817298642);
                lee1Var = cbx.d(x340Var).j;
            }
            x340Var.r(false);
            lee1 lee1Var2 = lee1Var;
            if (z3) {
                x340Var.i0(-433492862);
                fontFamily = cbx.d(x340Var).n.a.f;
                x340Var.r(false);
            } else {
                x340Var.i0(-433432319);
                fontFamily = cbx.d(x340Var).k.a.f;
                x340Var.r(false);
            }
            FontFamily fontFamily2 = fontFamily;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            if (z) {
                x340Var.i0(750876620);
                zov0 zov0Var = cbx.b(x340Var).g;
                z2 = false;
                w0h1.a(wtx.c, new jsl(cwl1.o0(x340Var, 2131959022)), u291.r(nim0Var, 12.0f), jlz0Var.e, 0L, true, x340Var, 196608 | wtx.d, 16);
                ab80.p(nim0Var, f, x340Var, false);
            } else {
                z2 = false;
                x340Var.i0(751254293);
                x340Var.r(false);
            }
            x340Var.i0(-391406502);
            ye5 ye5Var = new ye5();
            x340Var.i0(-391405583);
            int iO = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65503));
            try {
                ye5Var.g(cwl1.o0(x340Var, 2131959021));
                ye5Var.k(iO);
                x340Var.r(z2);
                if (str != null) {
                    ye5Var.g(": ");
                    ye5Var.g(str);
                }
                af5 af5VarP = ye5Var.p();
                x340Var.r(z2);
                uwo1.d(af5VarP, cbx.a(x340Var).b.a, null, lee1Var2, new a0e1(3), null, 0, false, new cjc0(1), 0, null, null, x340Var, 0, 0, 3812);
                x340Var = x340Var;
                x340Var.r(true);
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yiz0(str, z, jlz0Var, i);
        }
    }

    public static final void n(String str, Boolean bool, boolean z, jlz0 jlz0Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(547907797);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(bool) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(jlz0Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x7f1 x7f1VarL = kkn.l(u7h.j, 0L, 0L, x340Var, 30);
            j2i j2iVarR = apo.r(-1916468294, new yiz0(str, z, jlz0Var), x340Var);
            j2i j2iVarR2 = apo.r(-1793186628, new tse0(function0, (byte) 26), x340Var);
            j2i j2iVarR3 = apo.r(-478722843, new hov0(bool, iu30Var, (byte) 6), x340Var);
            qim0 qim0Var3 = nim0.a;
            ti5.a(j2iVarR, qim0Var3, j2iVarR2, j2iVarR3, 0.0f, (erl1) null, x7f1VarL, x340Var, 3510, 176);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(str, bool, z, jlz0Var, function0, iu30Var, qim0Var2, i);
        }
    }

    public static final void o(uyr0 uyr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        b0k b0kVar2;
        int i2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(69112226);
        int i3 = i | (b0kVar3.g(uyr0Var) ? 4 : 2) | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var4);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            boolean z = uyr0Var.e;
            int i4 = uyr0Var.h;
            if (z) {
                b0kVar3.i0(-1084117577);
                kqn1.d(2, 6, 0, b0kVar3, i541.D(qim0Var4, 0.0f, 0.0f, i4 != 1 ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571));
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                ab80.p(qim0Var4, 4.0f, b0kVar3, false);
            } else {
                b0kVar3.i0(-1083889820);
                b0kVar3.r(false);
            }
            if (uyr0Var.f) {
                b0kVar3.i0(-1083854170);
                xtx xtxVar = xtx.c;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                i2 = i4;
                b0kVar2 = b0kVar3;
                qim0Var3 = qim0Var4;
                w0h1.a(xtxVar, isl.a, i541.D(u291.r(qim0Var4, 12.0f), 0.0f, 0.0f, i4 != 1 ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571), 0L, 0L, false, b0kVar2, xtx.d | 48, 56);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                ab80.p(qim0Var3, 4.0f, b0kVar2, false);
            } else {
                qim0Var3 = qim0Var4;
                b0kVar2 = b0kVar3;
                i2 = i4;
                b0kVar2.i0(-1083517820);
                b0kVar2.r(false);
            }
            String strN0 = cwl1.n0(2131959656, new Object[]{uyr0Var.c}, b0kVar2);
            uwr uwrVar3 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).j;
            long j = cbx.a(b0kVar2).b.b;
            cjc0 cjc0Var = new cjc0(1);
            float f = i2 != 1 ? 0.7f : 1.0f;
            qim0 qim0Var5 = qim0Var3;
            b0kVar3 = b0kVar2;
            uwo1.e(strN0, i541.D(qim0Var5, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, b0kVar3, 1572864, 0, 1712);
            b0kVar3.r(true);
            qim0Var2 = qim0Var5;
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new zyr0(uyr0Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void p(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-2111476768, i, x340Var) ? 4 : 2) | i2 | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.b0();
        } else if (i != 3) {
            x340Var.i0(1086747776);
            wkt0.a(i == 1 ? zkt0.a : zkt0.b, u291.r(qim0Var, 16.0f), (ksl) null, 0L, false, x340Var, 0, 28);
            x340Var.r(false);
        } else {
            x340Var.i0(1086934210);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 24, i, i2, qim0Var);
        }
    }

    public static final void q(uyr0 uyr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1264419142);
        int i2 = (x340Var.g(uyr0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            int i3 = uyr0Var.j;
            int i4 = uyr0Var.h;
            if (i3 != 3) {
                x340Var.i0(1854141921);
                p(i3, 0, x340Var, i541.D(qim0Var3, 0.0f, 0.0f, i4 != 1 ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571));
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                ab80.p(qim0Var3, 4.0f, x340Var, false);
            } else {
                x340Var.i0(1854379288);
                x340Var.r(false);
            }
            String str = uyr0Var.b;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            if (i3 != 3) {
                x340Var.i0(1854530785);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                x340Var.i0(1854591049);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            b2 = 1;
            uwo1.e(str, i541.D(qim0Var3, 0.0f, 0.0f, i4 != 1 ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571), lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1712);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zyr0(uyr0Var, qim0Var2, i, b2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void r(uyr0 uyr0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        hax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-25681105);
        int i2 = (x340Var.g(uyr0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iC = l1d.C(uyr0Var.h);
            if (iC == 0 || iC == 1) {
                x340Var.i0(-561162836);
                boolean z = !uyr0Var.g;
                if (uyr0Var.i) {
                    x340Var.i0(1090280287);
                    haxVar = new hax(cwl1.o0(x340Var, 2131959657));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1090284291);
                    x340Var.r(false);
                    haxVar = jax.a;
                }
                hax haxVar2 = haxVar;
                qim0 qim0VarN = anm1.N("switch_test_tag_" + uyr0Var.a, nim0.a);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new azr0(iu30Var, (byte) 0);
                    x340Var.s0(objT);
                }
                anm1.c(z, (iu30) objT, qim0VarN, haxVar2, (idn0) null, x340Var, 0, 16);
                x340Var.r(false);
            } else if (iC == 2) {
                x340Var.i0(-561453585);
                j(x340Var, 0);
                x340Var.r(false);
            } else {
                if (iC != 3) {
                    throw p3d1.k(x340Var, 1090264829, false);
                }
                x340Var.i0(-561343380);
                k(x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(uyr0Var, iu30Var, i, (byte) 25);
        }
    }

    public static final sgm s(mje mjeVar, d0r d0rVar, kdy0 kdy0Var, pie pieVar, cke ckeVar, ahe aheVar, String str, boolean z, iu30 iu30Var, iu30 iu30Var2) {
        return new sgm(aheVar.a, new i24(ckeVar, aheVar, (lnm) null, (byte) 15), new tie(ckeVar, pieVar, aheVar, null, (byte) 0), new tie(ckeVar, pieVar, aheVar, null, (byte) 1), z, new uie(mjeVar, d0rVar, kdy0Var, pieVar, ckeVar, aheVar, str, (lnm) null), new ela(mjeVar, d0rVar, kdy0Var, aheVar, str, (lnm) null), iu30Var, iu30Var2);
    }

    public static final ArrayList t(List list, ekb ekbVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ekb.H(((pr31) obj).k) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    public static final int u(int i, String str) {
        ?? r3;
        ?? r4;
        int spanEnd;
        a4x a4xVarY = y();
        Integer num = null;
        if (a4xVarY != null) {
            o0c.q("Not initialized yet", a4xVarY.e());
            o0c.p((Object) str, "charSequence cannot be null");
            zeu zeuVar = a4xVarY.d.a;
            zeuVar.getClass();
            if (i < 0 || i >= str.length()) {
                r4 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                b2h1[] b2h1VarArr = (b2h1[]) spanned.getSpans(i, i + 1, b2h1.class);
                if (b2h1VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(b2h1VarArr[0]);
                    r4 = str;
                } else {
                    ?? r5 = str;
                    spanEnd = ((d5x) zeuVar.s((CharSequence) r5, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new d5x(i))).c;
                    r4 = r5;
                }
            } else {
                ?? r6 = str;
                spanEnd = ((d5x) zeuVar.s((CharSequence) r6, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new d5x(i))).c;
                r4 = r6;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r3 = r4;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r3 = str;
        }
        if (num != null) {
            r3 = r4;
            return num.intValue();
        }
        r3 = r4;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r3);
        return characterInstance.following(i);
    }

    public static final int v(int i, String str) {
        a4x a4xVarY = y();
        Integer num = null;
        if (a4xVarY != null) {
            Integer numValueOf = Integer.valueOf(a4xVarY.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final h46 x(q0z q0zVar) {
        return new h46(q0zVar, (byte) 4);
    }

    public static final a4x y() {
        if (!a4x.d()) {
            return null;
        }
        a4x a4xVarA = a4x.a();
        if (a4xVarA.c() == 1) {
            return a4xVarA;
        }
        return null;
    }

    public static final max z(lax laxVar, b0k b0kVar) {
        if (laxVar.equals(iax.a)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(839077734);
            x340Var.r(false);
            return jax.a;
        }
        if (!(laxVar instanceof gax)) {
            throw p3d1.k((x340) b0kVar, 839076602, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(839082300);
        gax gaxVar = (gax) laxVar;
        String strO0 = gaxVar.b;
        if (strO0 == null) {
            x340Var2.i0(839083840);
            Integer num = gaxVar.a;
            strO0 = cwl1.o0(x340Var2, num != null ? num.intValue() : 2131961688);
        } else {
            x340Var2.i0(839082910);
        }
        x340Var2.r(false);
        hax haxVar = new hax(strO0);
        x340Var2.r(false);
        return haxVar;
    }

    public abstract mgc B();

    public int C() {
        return B().b;
    }

    public Object D(int i) {
        Object objInvoke;
        g890 g890VarQ = B().q(i);
        int i2 = i - g890VarQ.a;
        iu30 key = ((trb0) g890VarQ.c).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new k5s(i) : objInvoke;
    }

    public Object w(int i) {
        g890 g890VarQ = B().q(i);
        return ((trb0) g890VarQ.c).getType().invoke(Integer.valueOf(i - g890VarQ.a));
    }
}
