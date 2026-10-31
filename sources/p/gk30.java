package p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class gk30 {
    public static final long a = z4p1.e(-872415232);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:146:0x0299  */
    /* JADX WARN: Code duplicated, block: B:188:0x038a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    public static final void a(qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        Float m231Var;
        Display defaultDisplay;
        dk30 dk30Var;
        Activity activity;
        il81 fl81Var;
        cl81 cl81Var;
        cl81 cl81Var2;
        int i3;
        ArrayList arrayList;
        String strE;
        String str;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1870197698);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        String str2 = "WrappedStory";
        if ((i & 48) == 0) {
            i2 |= x340Var.g("WrappedStory") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Activity activity2 = context instanceof Activity ? (Activity) context : null;
            if (activity2 == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mq2(qim0Var, i, (byte) 11);
                    return;
                }
                return;
            }
            Object objT = x340Var.T();
            if (objT == obj) {
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Display display = activity2.getDisplay();
                        if (display != null) {
                            m231Var = Float.valueOf(display.getRefreshRate());
                        } else {
                            m231Var = null;
                        }
                    } else {
                        WindowManager windowManager = activity2.getWindowManager();
                        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                            m231Var = null;
                        } else {
                            m231Var = Float.valueOf(defaultDisplay.getRefreshRate());
                        }
                    }
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                Float f = m231Var;
                objT = Float.valueOf(f != null ? f.floatValue() : 60.0f);
                x340Var.s0(objT);
            }
            float fFloatValue = ((Number) objT).floatValue();
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == obj) {
                objT2 = new dk30(fFloatValue);
                x340Var.s0(objT2);
            }
            dk30 dk30Var2 = (dk30) objT2;
            boolean z2 = i5 == 32;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == obj) {
                objT3 = v8r.q((Object) null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = v8r.q("detecting…");
                x340Var.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            boolean zG = x340Var.g((String) ven0Var2.getValue());
            Object objT5 = x340Var.T();
            if (zG || objT5 == obj) {
                objT5 = mb4.b(context, (String) ven0Var2.getValue());
                x340Var.s0(objT5);
            }
            uqt uqtVar = (uqt) objT5;
            boolean zI = x340Var.i(ven0Var2);
            Object objT6 = x340Var.T();
            if (zI || objT6 == obj) {
                objT6 = new pg6(ven0Var2, (lnm) null);
                x340Var.s0(objT6);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT6);
            boolean zI2 = x340Var.i(dk30Var2) | x340Var.i(activity2) | x340Var.i(context) | (i5 == 32) | x340Var.g(uqtVar);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == obj) {
                Activity activity3 = activity2;
                objT7 = new lhx(dk30Var2, activity3, context, uqtVar, (byte) 11);
                dk30Var = dk30Var2;
                activity = activity3;
                x340Var.s0(objT7);
            } else {
                dk30Var = dk30Var2;
                activity = activity2;
            }
            qxd0.h(dk30Var, activity, (iu30) objT7, x340Var);
            boolean zI3 = x340Var.i(dk30Var) | x340Var.i(ven0Var);
            Object objT8 = x340Var.T();
            if (zI3 || objT8 == obj) {
                objT8 = new xr00(dk30Var, ven0Var, (lnm) null, (byte) 14);
                x340Var.s0(objT8);
            }
            qxd0.t(dk30Var, x340Var, (vu30) objT8);
            ck30 ck30Var = (ck30) ven0Var.getValue();
            if (ck30Var == null) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new mq2(qim0Var, i, (byte) 12);
                    return;
                }
                return;
            }
            List list = ck30Var.J;
            int i6 = ck30Var.I;
            long j = ck30Var.H;
            float f2 = ck30Var.w;
            float f3 = ck30Var.i;
            boolean zG2 = x340Var.g(ck30Var);
            Object objT9 = x340Var.T();
            if (zG2 || objT9 == obj) {
                int i7 = qex0.e;
                int i8 = ck30Var.f;
                long j2 = ck30Var.a;
                if (j2 < 3000) {
                    objT9 = new xyi1(j2);
                    i6 = i6;
                    j = j;
                    f3 = f3;
                    list = list;
                    str2 = "WrappedStory";
                } else {
                    float f4 = ck30Var.b;
                    float f5 = 1000.0f / (f4 < 1.0f ? 1.0f : f4);
                    float f6 = f4 > 0.0f ? f3 / f4 : 0.0f;
                    if (f6 < 0.95f || i8 != 0) {
                        fl81Var = f6 >= 0.85f ? new fl81(i8, f3, f4) : new hl81(i8, f3, f4);
                    } else {
                        fl81Var = new gl81(f3, f4);
                        list = list;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    float f7 = f2 / f5;
                    if (f7 > 0.8f) {
                        arrayList2.add(new bl81(f7));
                    }
                    float f8 = ck30Var.m;
                    if (f8 > 0.0f) {
                        float f9 = ck30Var.n;
                        if (f9 / f8 > 0.25f && f9 > 2.0f) {
                            arrayList2.add(new zk81(f9, f8));
                        }
                    }
                    float f10 = j2 / 1000.0f;
                    float f11 = f10 > 0.0f ? (j / f10) / 1048576.0f : 0.0f;
                    if (f11 > 5.0f) {
                        arrayList2.add(new wk81(f11));
                    } else if (f11 > 1.0f) {
                        arrayList2.add(new vk81(f11));
                    }
                    if (i6 >= 3) {
                        arrayList2.add(new jl81(i6, true));
                    } else if (i6 >= 2) {
                        arrayList2.add(new jl81(i6, false));
                    }
                    if (j2 > 35000) {
                        int i9 = ck30Var.r;
                        if (i9 >= 0) {
                            long j3 = ck30Var.s;
                            if (j3 < 0) {
                                i6 = i6;
                                j = j;
                                cl81Var2 = null;
                            } else {
                                float f12 = ck30Var.u;
                                if (f12 > 0.5f) {
                                    long j4 = ck30Var.F;
                                    if (j4 < 1 || (i3 = ck30Var.t) <= i9 + 5) {
                                        i6 = i6;
                                        j = j;
                                        cl81Var2 = null;
                                    } else {
                                        int i10 = (int) ((j2 - j3) / 1000);
                                        int i11 = ck30Var.o;
                                        ArrayList arrayList3 = ck30Var.v;
                                        if (arrayList3.size() <= 16) {
                                            arrayList = arrayList3;
                                        } else {
                                            float size = arrayList3.size() / 16.0f;
                                            tr80 tr80VarQ = yoi1.Q(0, 16);
                                            ArrayList arrayList4 = new ArrayList(q7h.U(tr80VarQ, 10));
                                            lr80 it = tr80VarQ.iterator();
                                            while (((sr80) it).c) {
                                                int iNextInt = (int) (it.nextInt() * size);
                                                int size2 = arrayList3.size() - 1;
                                                if (iNextInt > size2) {
                                                    iNextInt = size2;
                                                }
                                                arrayList4.add(Integer.valueOf(((Number) arrayList3.get(iNextInt)).intValue()));
                                            }
                                            arrayList = arrayList4;
                                        }
                                        cl81Var2 = new cl81(i9, i11, f12, j4, i3, i10, arrayList);
                                    }
                                } else {
                                    i6 = i6;
                                    j = j;
                                    cl81Var2 = null;
                                }
                            }
                        } else {
                            i6 = i6;
                            j = j;
                            cl81Var2 = null;
                        }
                        cl81Var = cl81Var2;
                    } else {
                        i6 = i6;
                        j = j;
                        cl81Var = null;
                    }
                    objT9 = new wyi1(fl81Var, cl81Var, arrayList2);
                }
                x340Var.s0(objT9);
            } else {
                i6 = i6;
                j = j;
                f3 = f3;
                list = list;
                str2 = "WrappedStory";
            }
            yyi1 yyi1Var = (yyi1) objT9;
            qim0Var2 = qim0Var;
            qim0 qim0VarF = dug.f(qim0Var2, a, d4o1.a);
            boolean zI4 = x340Var.i(dk30Var) | (i5 == 32) | x340Var.g(uqtVar);
            Object objT10 = x340Var.T();
            if (zI4 || objT10 == obj) {
                objT10 = new hs20(dk30Var, uqtVar, (byte) 4);
                x340Var.s0(objT10);
            }
            qim0 qim0VarX = uyn1.x(bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT10, 15), 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            c(yyi1Var, x340Var, 0);
            int i12 = i6;
            long j5 = j;
            b("─────────────────────────", true, 0L, false, x340Var, 54, 12);
            b(String.format("profiler · %.0f Hz · %s", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue), str2}, 2)), false, 0L, false, x340Var, 0, 14);
            b(f4i1.f(uqtVar.a, " · ", uqtVar.c), false, 0L, false, x340Var, 0, 14);
            b(f4i1.f(uqtVar.b, " · ", uqtVar.d), false, 0L, false, x340Var, 0, 14);
            b(String.format("ram %.1f GB · heap %d/%d MB (peak %d)", Arrays.copyOf(new Object[]{Float.valueOf(uqtVar.e / 1024.0f), Integer.valueOf(ck30Var.o), Integer.valueOf(ck30Var.f5p), Integer.valueOf(ck30Var.q)}, 4)), false, 0L, false, x340Var, 0, 14);
            Float fValueOf = Float.valueOf(f3);
            Float fValueOf2 = Float.valueOf(ck30Var.h);
            switch (i12) {
                case -1:
                    strE = "n/a";
                    break;
                case 0:
                    strE = "NONE";
                    break;
                case 1:
                    strE = "LIGHT";
                    break;
                case 2:
                    strE = "MODERATE";
                    break;
                case 3:
                    strE = "SEVERE";
                    break;
                case 4:
                    strE = "CRITICAL";
                    break;
                case 5:
                    strE = "EMERGENCY";
                    break;
                case 6:
                    strE = "SHUTDOWN";
                    break;
                default:
                    strE = gvg.e(i12, "?(", ")");
                    break;
            }
            b(String.format("fps %.1f (avg %.1f) · thermal %s", Arrays.copyOf(new Object[]{fValueOf, fValueOf2, strE}, 3)), false, 0L, false, x340Var, 0, 14);
            b(String.format("frames %d · drop %d · jank %d", Arrays.copyOf(new Object[]{Long.valueOf(ck30Var.c), Long.valueOf(ck30Var.d), Long.valueOf(ck30Var.e)}, 3)), false, 0L, false, x340Var, 0, 14);
            b(String.format("worst %.1f · p50 %.1f · p95 %.1f · p99 %.1f", Arrays.copyOf(new Object[]{Float.valueOf(ck30Var.g), Float.valueOf(ck30Var.j), Float.valueOf(ck30Var.k), Float.valueOf(ck30Var.l)}, 4)), false, 0L, false, x340Var, 0, 14);
            b(String.format("mt %.1f/%.1f · rt %.1f/%.1f ms (avg/last)", Arrays.copyOf(new Object[]{Float.valueOf(f2), Float.valueOf(ck30Var.A), Float.valueOf(ck30Var.x), Float.valueOf(ck30Var.B)}, 4)), false, 0L, false, x340Var, 0, 14);
            b(String.format("cpu-draw %.1f/%.1f · gpu %s ms", Arrays.copyOf(new Object[]{Float.valueOf(ck30Var.y), Float.valueOf(ck30Var.C), ck30Var.E ? String.format("%.1f/%.1f", Arrays.copyOf(new Object[]{Float.valueOf(ck30Var.z), Float.valueOf(ck30Var.D)}, 2)) : "n/a"}, 3)), false, 0L, false, x340Var, 0, 14);
            Long lValueOf = Long.valueOf(ck30Var.F);
            Long lValueOf2 = Long.valueOf(ck30Var.G);
            if (j5 >= 1073741824) {
                str = String.format("%.1f GB", Arrays.copyOf(new Object[]{Float.valueOf(j5 / 1.0737418E9f)}, 1));
            } else if (j5 >= 1048576) {
                str = String.format("%.1f MB", Arrays.copyOf(new Object[]{Float.valueOf(j5 / 1048576.0f)}, 1));
            } else if (j5 >= 1024) {
                str = String.format("%.0f KB", Arrays.copyOf(new Object[]{Float.valueOf(j5 / 1024.0f)}, 1));
            } else {
                str = j5 + " B";
            }
            b(String.format("gc %d · %d ms · alloc %s", Arrays.copyOf(new Object[]{lValueOf, lValueOf2, str}, 3)), false, 0L, false, x340Var, 0, 14);
            if (list.isEmpty()) {
                x340Var.i0(543594422);
                x340Var.r(false);
            } else {
                x340Var.i0(543318615);
                List listE1 = o7h.e1(3, list);
                Object objT11 = x340Var.T();
                if (objT11 == obj) {
                    objT11 = m830.d1;
                    x340Var.s0(objT11);
                }
                b("long: ".concat(o7h.y0(listE1, " ", (String) null, (String) null, (iu30) objT11, 30)), false, 0L, false, x340Var, 0, 14);
                x340Var.r(false);
            }
            b("(tap: log+reset)", true, 0L, false, x340Var, 54, 12);
            x340Var.r(true);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new mq2(qim0Var2, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[PHI: r2 r4 r7
      0x0092: PHI (r2v14 int) = (r2v9 int), (r2v6 int), (r2v16 int) binds: [B:61:0x00a6, B:50:0x008e, B:51:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r4v6 boolean) = (r4v3 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:61:0x00a6, B:50:0x008e, B:51:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r7v8 long) = (r7v2 long), (r7v0 long), (r7v0 long) binds: [B:61:0x00a6, B:50:0x008e, B:51:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, boolean z, long j, boolean z2, b0k b0kVar, int i, int i2) {
        String str2;
        int i3;
        boolean z3;
        long j2;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        b0k b0kVar2;
        boolean z6;
        long j3;
        boolean z7;
        h311 h311VarV;
        int i8;
        long j4;
        boolean z8;
        FontWeight fontWeight;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(751703130);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= b0kVar3.h(z3) ? 32 : 16;
            }
            j2 = j;
            if ((i2 & 4) == 0 || !b0kVar3.f(j2)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i5 = i3 | i4;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (b0kVar3.h(z4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i5 & 1171) != 1170) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b0kVar3.Y(i5 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i9 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 4) != 0) {
                            if (z3) {
                                j2 = u7h.e;
                            } else {
                                j2 = u7h.f;
                            }
                            i5 &= -897;
                        }
                        if (i6 != 0) {
                            i8 = i5;
                            j4 = j2;
                            z8 = false;
                        }
                        b0kVar3.s();
                        long jG = fc11.G(10);
                        if (z8) {
                            fontWeight = FontWeight.Z;
                        } else {
                            fontWeight = FontWeight.t;
                        }
                        b0kVar2 = b0kVar3;
                        q9e1.c(str2, uyn1.z(0.0f, 1.0f, 1, nim0.a), j4, jG, fontWeight, FontFamily.d, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, b0kVar2, i8 & 910, 0, 261928);
                        z7 = z8;
                        z6 = z3;
                        j3 = j4;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                    }
                    i8 = i5;
                    z8 = z4;
                    j4 = j2;
                    b0kVar3.s();
                    long jG2 = fc11.G(10);
                    if (z8) {
                        fontWeight = FontWeight.Z;
                    } else {
                        fontWeight = FontWeight.t;
                    }
                    b0kVar2 = b0kVar3;
                    q9e1.c(str2, uyn1.z(0.0f, 1.0f, 1, nim0.a), j4, jG2, fontWeight, FontFamily.d, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, b0kVar2, i8 & 910, 0, 261928);
                    z7 = z8;
                    z6 = z3;
                    j3 = j4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z3;
                    j3 = j2;
                    z7 = z4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ek30(str, z6, j3, z7, i, i2);
                }
            }
            i5 |= 3072;
            z4 = z2;
            if ((i5 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i5 & 1, z5)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 4) != 0) {
                        if (z3) {
                            j2 = u7h.e;
                        } else {
                            j2 = u7h.f;
                        }
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        i8 = i5;
                        j4 = j2;
                        z8 = false;
                    } else {
                        i8 = i5;
                        z8 = z4;
                        j4 = j2;
                    }
                } else {
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 4) != 0) {
                        if (z3) {
                            j2 = u7h.e;
                        } else {
                            j2 = u7h.f;
                        }
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        i8 = i5;
                        j4 = j2;
                        z8 = false;
                    } else {
                        i8 = i5;
                        z8 = z4;
                        j4 = j2;
                    }
                }
                b0kVar3.s();
                long jG3 = fc11.G(10);
                if (z8) {
                    fontWeight = FontWeight.Z;
                } else {
                    fontWeight = FontWeight.t;
                }
                b0kVar2 = b0kVar3;
                q9e1.c(str2, uyn1.z(0.0f, 1.0f, 1, nim0.a), j4, jG3, fontWeight, FontFamily.d, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, b0kVar2, i8 & 910, 0, 261928);
                z7 = z8;
                z6 = z3;
                j3 = j4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z3;
                j3 = j2;
                z7 = z4;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ek30(str, z6, j3, z7, i, i2);
            }
        }
        i3 |= 48;
        z3 = z;
        j2 = j;
        if ((i2 & 4) == 0) {
            i4 = 128;
        } else {
            i4 = 128;
        }
        i5 = i3 | i4;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (b0kVar3.h(z4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            if ((i5 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i5 & 1, z5)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 4) != 0) {
                        if (z3) {
                            j2 = u7h.e;
                        } else {
                            j2 = u7h.f;
                        }
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        i8 = i5;
                        j4 = j2;
                        z8 = false;
                    } else {
                        i8 = i5;
                        z8 = z4;
                        j4 = j2;
                    }
                } else {
                    if (i9 != 0) {
                        z3 = false;
                    }
                    if ((i2 & 4) != 0) {
                        if (z3) {
                            j2 = u7h.e;
                        } else {
                            j2 = u7h.f;
                        }
                        i5 &= -897;
                    }
                    if (i6 != 0) {
                        i8 = i5;
                        j4 = j2;
                        z8 = false;
                    } else {
                        i8 = i5;
                        z8 = z4;
                        j4 = j2;
                    }
                }
                b0kVar3.s();
                long jG4 = fc11.G(10);
                if (z8) {
                    fontWeight = FontWeight.Z;
                } else {
                    fontWeight = FontWeight.t;
                }
                b0kVar2 = b0kVar3;
                q9e1.c(str2, uyn1.z(0.0f, 1.0f, 1, nim0.a), j4, jG4, fontWeight, FontFamily.d, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, b0kVar2, i8 & 910, 0, 261928);
                z7 = z8;
                z6 = z3;
                j3 = j4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z3;
                j3 = j2;
                z7 = z4;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ek30(str, z6, j3, z7, i, i2);
            }
        }
        i5 |= 3072;
        z4 = z2;
        if ((i5 & 1171) != 1170) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (b0kVar3.Y(i5 & 1, z5)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    z3 = false;
                }
                if ((i2 & 4) != 0) {
                    if (z3) {
                        j2 = u7h.e;
                    } else {
                        j2 = u7h.f;
                    }
                    i5 &= -897;
                }
                if (i6 != 0) {
                    i8 = i5;
                    j4 = j2;
                    z8 = false;
                } else {
                    i8 = i5;
                    z8 = z4;
                    j4 = j2;
                }
            } else {
                if (i9 != 0) {
                    z3 = false;
                }
                if ((i2 & 4) != 0) {
                    if (z3) {
                        j2 = u7h.e;
                    } else {
                        j2 = u7h.f;
                    }
                    i5 &= -897;
                }
                if (i6 != 0) {
                    i8 = i5;
                    j4 = j2;
                    z8 = false;
                } else {
                    i8 = i5;
                    z8 = z4;
                    j4 = j2;
                }
            }
            b0kVar3.s();
            long jG5 = fc11.G(10);
            if (z8) {
                fontWeight = FontWeight.Z;
            } else {
                fontWeight = FontWeight.t;
            }
            b0kVar2 = b0kVar3;
            q9e1.c(str2, uyn1.z(0.0f, 1.0f, 1, nim0.a), j4, jG5, fontWeight, FontFamily.d, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, b0kVar2, i8 & 910, 0, 261928);
            z7 = z8;
            z6 = z3;
            j3 = j4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z6 = z3;
            j3 = j2;
            z7 = z4;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ek30(str, z6, j3, z7, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(yyi1 yyi1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-293007865);
        int i2 = (x340Var.g(yyi1Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (yyi1Var instanceof xyi1) {
            x340Var.i0(-1623671461);
            b(String.format("⏱  warming up… %.1fs / %.1fs", Arrays.copyOf(new Object[]{Float.valueOf(((xyi1) yyi1Var).a / 1000.0f), Float.valueOf(3.0f)}, 2)), false, qex0.a(zyi1.b), true, x340Var, 3072, 2);
            x340Var.r(false);
        } else {
            if (!(yyi1Var instanceof wyi1)) {
                throw p3d1.k(x340Var, 1887285684, false);
            }
            x340Var.i0(-1623434280);
            wyi1 wyi1Var = (wyi1) yyi1Var;
            ArrayList arrayList = wyi1Var.c;
            il81 il81Var = wyi1Var.a;
            b(il81Var.b(), false, qex0.a(il81Var.a()), true, x340Var, 3072, 2);
            cl81 cl81Var = wyi1Var.b;
            if (cl81Var != null) {
                String str = cl81Var.j;
                x340Var.i0(-1623302468);
                String str2 = cl81Var.h;
                zyi1 zyi1Var = zyi1.d;
                b(str2, false, qex0.a(zyi1Var), true, x340Var, 3072, 2);
                b("  ".concat(cl81Var.i), false, qex0.a(zyi1Var), false, x340Var, 0, 10);
                if (str.length() > 0) {
                    x340Var.i0(-1623119165);
                    b("  ".concat(str), false, qex0.a(zyi1Var), false, x340Var, 0, 10);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1623034597);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else if (!arrayList.isEmpty()) {
                x340Var.i0(-1622980099);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = m830.e1;
                    x340Var.s0(objT);
                }
                String strY0 = o7h.y0(arrayList, " · ", (String) null, (String) null, (iu30) objT, 30);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((nl81) it.next()).a());
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        int iOrdinal = ((zyi1) next).ordinal();
                        do {
                            Object next2 = it2.next();
                            int iOrdinal2 = ((zyi1) next2).ordinal();
                            if (iOrdinal < iOrdinal2) {
                                next = next2;
                                iOrdinal = iOrdinal2;
                            }
                        } while (it2.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                zyi1 zyi1Var2 = (zyi1) obj;
                if (zyi1Var2 == null) {
                    zyi1Var2 = zyi1.c;
                }
                b(strY0, false, qex0.a(zyi1Var2), true, x340Var, 3072, 2);
                x340Var.r(false);
            } else if (il81Var instanceof gl81) {
                x340Var.i0(-1622675276);
                b("heap stable · no stutter", false, qex0.a(zyi1.a), true, x340Var, 3078, 2);
                x340Var.r(false);
            } else {
                x340Var.i0(-1622576293);
                x340Var.r(false);
            }
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rr10(yyi1Var, i, (byte) 15);
        }
    }

    public static final trl d(Context context, dk30 dk30Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                dk30Var.n1 = powerManager.getCurrentThermalStatus();
                vi7 vi7Var = new vi7(new Handler(Looper.getMainLooper()), (byte) 2);
                fk30 fk30Var = new fk30(dk30Var, (byte) 0);
                powerManager.addThermalStatusListener(vi7Var, fk30Var);
                return new trl(powerManager, fk30Var);
            }
        }
        return null;
    }
}
