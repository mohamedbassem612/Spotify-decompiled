package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class fc11 {
    public static final l5o a = new l5o();
    public static final StackTraceElement[] b = new StackTraceElement[0];

    public static final Object A(dc11 dc11Var) {
        Class clsL;
        Object objU = dc11Var.u();
        if (!(dc11Var instanceof ic11) || !yxo1.D((ic11) dc11Var)) {
            Iterator it = dc11Var.f().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (((hc11) next).s() != 4) {
                    if (!z) {
                        z = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            hc11 hc11Var = (hc11) obj;
            oma0 oma0VarT = hc11Var != null ? hc11Var.t() : null;
            if (oma0VarT != null && (clsL = yxo1.L(oma0VarT)) != null) {
                return yxo1.y(clsL, dc11Var).invoke(objU, null);
            }
        }
        return objU;
    }

    public static Object C(Future future) {
        dm5.A(future.isDone(), "Future was expected to be done: %s", future);
        return iho1.o(future);
    }

    public static final long D(double d) {
        return Y((float) d, 8589934592L);
    }

    public static final long E(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static final long F(double d) {
        return Y((float) d, 4294967296L);
    }

    public static final long G(int i) {
        return Y(i, 4294967296L);
    }

    public static f280 J(Object obj) {
        return obj == null ? f280.b : new f280(obj);
    }

    public static int K(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        hhg1.n(f4i1.c(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final boolean M(dc11 dc11Var) {
        return P(dc11Var) && dc11Var.a().n().isAnnotation();
    }

    public static final boolean N(dc11 dc11Var) {
        return dc11Var.u() != lyc.NO_RECEIVER;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038  */
    public static boolean O(ry21 ry21Var, ln21 ln21Var) {
        String strC;
        int i = ry21Var.d;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                strC = ry21Var.f.c("Expires");
                if (strC == null) {
                    strC = null;
                }
                if (strC == null && ry21Var.a().c == -1 && !ry21Var.a().f && !ry21Var.a().e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        strC = ry21Var.f.c("Expires");
                        if (strC == null) {
                            strC = null;
                        }
                        if (strC == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (ry21Var.a().b || ln21Var.a().b) ? false : true;
    }

    public static final boolean P(dc11 dc11Var) {
        return u890.j(dc11Var.getName(), "<init>");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q(ob01 ob01Var, onm onmVar) {
        g1a0 g1a0Var;
        Object m231Var;
        if (onmVar instanceof g1a0) {
            g1a0Var = (g1a0) onmVar;
            int i = g1a0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                g1a0Var.b = i - Integer.MIN_VALUE;
            } else {
                g1a0Var = new g1a0(onmVar);
            }
        } else {
            g1a0Var = new g1a0(onmVar);
        }
        Object objInvoke = g1a0Var.a;
        int i2 = g1a0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                g1a0Var.b = 1;
                objInvoke = ob01Var.invoke(g1a0Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objInvoke);
            }
            m231Var = (f1a0) objInvoke;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        return thA == null ? (f1a0) m231Var : new b1a0(thA);
    }

    public static pzc R(o8n o8nVar, vu30 vu30Var) {
        return upn1.t(new o8d0(o8nVar, 1, vu30Var, (byte) 0));
    }

    public static void S(Bundle bundle, String str) {
        try {
            wi20.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = swm0.t(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            oz3 oz3Var = (nz3) wi20.c().b(nz3.class);
            if (oz3Var != null) {
                oz3Var.a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static final long Y(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        wee1[] wee1VarArr = TextUnit.b;
        return jFloatToRawIntBits;
    }

    public static hfp1 Z(Task task, Task task2) {
        dp5 dp5Var = new dp5((byte) 8);
        bsd1 bsd1Var = new bsd1((y1t0) dp5Var.b);
        ajn ajnVar = new ajn(bsd1Var, new AtomicBoolean(false), dp5Var);
        l5o l5oVar = a;
        task.e(l5oVar, ajnVar);
        task2.e(l5oVar, ajnVar);
        return bsd1Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x014b  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0152  */
    /* JADX WARN: Code duplicated, block: B:122:0x0156  */
    /* JADX WARN: Code duplicated, block: B:125:0x0160  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    public static final void a(c380 c380Var, qim0 qim0Var, hcx hcxVar, hux huxVar, boolean z, int i, gbx gbxVar, String str, idn0 idn0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        int iOrdinal;
        int i6;
        int i7;
        boolean zI;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        gbx gbxVar2;
        int i15;
        int i16;
        int i17;
        boolean z3;
        hux huxVar2;
        String str2;
        idn0 idn0Var2;
        gbx gbxVar3;
        hcx hcxVar2;
        qim0 qim0Var3;
        boolean z4;
        int i18;
        h311 h311VarV;
        hcx hcxVar3;
        hux huxVar3;
        String str3;
        Object objT;
        idn0 idn0Var3;
        int i19;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-245695744);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(c380Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i20 = i3 & 2;
        if (i20 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                if (hcxVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = hcxVar.ordinal();
                }
                if (x340Var.e(iOrdinal)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if ((i2 & 4096) == 0) {
                    zI = x340Var.g(huxVar);
                } else {
                    zI = x340Var.i(huxVar);
                }
                if (zI) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    if ((196608 & i2) == 0) {
                        i12 = i;
                        if (x340Var.e(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                    i14 = i3 & 64;
                    if (i14 != 0) {
                        i4 |= 1572864;
                        gbxVar2 = gbxVar;
                    } else {
                        gbxVar2 = gbxVar;
                        if ((i2 & 1572864) == 0) {
                            if (x340Var.i(gbxVar2)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i4 |= i15;
                        }
                    }
                    i16 = i3 & 128;
                    if (i16 != 0) {
                        if ((i2 & 12582912) == 0) {
                            if (x340Var.g(str)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i4 |= i17;
                        }
                        if ((i2 & 100663296) == 0) {
                            i4 |= 33554432;
                        }
                        if ((i4 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (x340Var.Y(i4 & 1, z3)) {
                            x340Var.d0();
                            if ((i2 & 1) != 0 || x340Var.E()) {
                                if (i20 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if (i5 != 0) {
                                    hcxVar3 = hcx.b;
                                } else {
                                    hcxVar3 = hcxVar;
                                }
                                if (i7 != 0) {
                                    huxVar3 = null;
                                } else {
                                    huxVar3 = huxVar;
                                }
                                if (i9 != 0) {
                                    z2 = true;
                                }
                                if (i11 != 0) {
                                    i12 = 4;
                                }
                                if (i14 != 0) {
                                    gbxVar2 = null;
                                }
                                str3 = i16 == 0 ? str : null;
                                objT = x340Var.T();
                                if (objT == fkj0.X) {
                                    objT = zr7.d();
                                    x340Var.s0(objT);
                                }
                                idn0Var3 = (idn0) objT;
                                i19 = (-234881025) & i4;
                            } else {
                                x340Var.b0();
                                huxVar3 = huxVar;
                                str3 = str;
                                idn0Var3 = idn0Var;
                                i19 = i4 & (-234881025);
                                hcxVar3 = hcxVar;
                            }
                            x340Var.s();
                            int i21 = ((i19 >> 3) & 14) | 24576;
                            int i22 = i19 >> 15;
                            ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i22 & 896) | i21 | (i22 & 112));
                            huxVar2 = huxVar3;
                            idn0Var2 = idn0Var3;
                            gbxVar3 = gbxVar2;
                            str2 = str3;
                            hcxVar2 = hcxVar3;
                            qim0Var3 = qim0Var2;
                            i18 = i12;
                            z4 = z2;
                        } else {
                            x340Var.b0();
                            huxVar2 = huxVar;
                            str2 = str;
                            idn0Var2 = idn0Var;
                            gbxVar3 = gbxVar2;
                            hcxVar2 = hcxVar;
                            qim0Var3 = qim0Var2;
                            z4 = z2;
                            i18 = i12;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                        }
                    }
                    i4 |= 12582912;
                    if ((i2 & 100663296) == 0) {
                        i4 |= 33554432;
                    }
                    if ((i4 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        } else {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        }
                        x340Var.s();
                        int i23 = ((i19 >> 3) & 14) | 24576;
                        int i24 = i19 >> 15;
                        ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i24 & 896) | i23 | (i24 & 112));
                        huxVar2 = huxVar3;
                        idn0Var2 = idn0Var3;
                        gbxVar3 = gbxVar2;
                        str2 = str3;
                        hcxVar2 = hcxVar3;
                        qim0Var3 = qim0Var2;
                        i18 = i12;
                        z4 = z2;
                    } else {
                        x340Var.b0();
                        huxVar2 = huxVar;
                        str2 = str;
                        idn0Var2 = idn0Var;
                        gbxVar3 = gbxVar2;
                        hcxVar2 = hcxVar;
                        qim0Var3 = qim0Var2;
                        z4 = z2;
                        i18 = i12;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                    }
                }
                i4 |= 196608;
                i12 = i;
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    gbxVar2 = gbxVar;
                } else {
                    gbxVar2 = gbxVar;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var.i(gbxVar2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                i16 = i3 & 128;
                if (i16 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (x340Var.g(str)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i4 |= i17;
                    }
                    if ((i2 & 100663296) == 0) {
                        i4 |= 33554432;
                    }
                    if ((i4 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        } else {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        }
                        x340Var.s();
                        int i25 = ((i19 >> 3) & 14) | 24576;
                        int i26 = i19 >> 15;
                        ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i26 & 896) | i25 | (i26 & 112));
                        huxVar2 = huxVar3;
                        idn0Var2 = idn0Var3;
                        gbxVar3 = gbxVar2;
                        str2 = str3;
                        hcxVar2 = hcxVar3;
                        qim0Var3 = qim0Var2;
                        i18 = i12;
                        z4 = z2;
                    } else {
                        x340Var.b0();
                        huxVar2 = huxVar;
                        str2 = str;
                        idn0Var2 = idn0Var;
                        gbxVar3 = gbxVar2;
                        hcxVar2 = hcxVar;
                        qim0Var3 = qim0Var2;
                        z4 = z2;
                        i18 = i12;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                    }
                }
                i4 |= 12582912;
                if ((i2 & 100663296) == 0) {
                    i4 |= 33554432;
                }
                if ((i4 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    } else {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    }
                    x340Var.s();
                    int i27 = ((i19 >> 3) & 14) | 24576;
                    int i28 = i19 >> 15;
                    ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i28 & 896) | i27 | (i28 & 112));
                    huxVar2 = huxVar3;
                    idn0Var2 = idn0Var3;
                    gbxVar3 = gbxVar2;
                    str2 = str3;
                    hcxVar2 = hcxVar3;
                    qim0Var3 = qim0Var2;
                    i18 = i12;
                    z4 = z2;
                } else {
                    x340Var.b0();
                    huxVar2 = huxVar;
                    str2 = str;
                    idn0Var2 = idn0Var;
                    gbxVar3 = gbxVar2;
                    hcxVar2 = hcxVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    i18 = i12;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                }
            }
            i4 |= 24576;
            z2 = z;
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    i12 = i;
                    if (x340Var.e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    gbxVar2 = gbxVar;
                } else {
                    gbxVar2 = gbxVar;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var.i(gbxVar2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                i16 = i3 & 128;
                if (i16 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (x340Var.g(str)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i4 |= i17;
                    }
                    if ((i2 & 100663296) == 0) {
                        i4 |= 33554432;
                    }
                    if ((i4 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        } else {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        }
                        x340Var.s();
                        int i29 = ((i19 >> 3) & 14) | 24576;
                        int i210 = i19 >> 15;
                        ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i210 & 896) | i29 | (i210 & 112));
                        huxVar2 = huxVar3;
                        idn0Var2 = idn0Var3;
                        gbxVar3 = gbxVar2;
                        str2 = str3;
                        hcxVar2 = hcxVar3;
                        qim0Var3 = qim0Var2;
                        i18 = i12;
                        z4 = z2;
                    } else {
                        x340Var.b0();
                        huxVar2 = huxVar;
                        str2 = str;
                        idn0Var2 = idn0Var;
                        gbxVar3 = gbxVar2;
                        hcxVar2 = hcxVar;
                        qim0Var3 = qim0Var2;
                        z4 = z2;
                        i18 = i12;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                    }
                }
                i4 |= 12582912;
                if ((i2 & 100663296) == 0) {
                    i4 |= 33554432;
                }
                if ((i4 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    } else {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    }
                    x340Var.s();
                    int i211 = ((i19 >> 3) & 14) | 24576;
                    int i212 = i19 >> 15;
                    ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i212 & 896) | i211 | (i212 & 112));
                    huxVar2 = huxVar3;
                    idn0Var2 = idn0Var3;
                    gbxVar3 = gbxVar2;
                    str2 = str3;
                    hcxVar2 = hcxVar3;
                    qim0Var3 = qim0Var2;
                    i18 = i12;
                    z4 = z2;
                } else {
                    x340Var.b0();
                    huxVar2 = huxVar;
                    str2 = str;
                    idn0Var2 = idn0Var;
                    gbxVar3 = gbxVar2;
                    hcxVar2 = hcxVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    i18 = i12;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                }
            }
            i4 |= 196608;
            i12 = i;
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                gbxVar2 = gbxVar;
            } else {
                gbxVar2 = gbxVar;
                if ((i2 & 1572864) == 0) {
                    if (x340Var.i(gbxVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            i16 = i3 & 128;
            if (i16 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (x340Var.g(str)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i4 |= i17;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= 33554432;
                }
                if ((i4 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    } else {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    }
                    x340Var.s();
                    int i213 = ((i19 >> 3) & 14) | 24576;
                    int i214 = i19 >> 15;
                    ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i214 & 896) | i213 | (i214 & 112));
                    huxVar2 = huxVar3;
                    idn0Var2 = idn0Var3;
                    gbxVar3 = gbxVar2;
                    str2 = str3;
                    hcxVar2 = hcxVar3;
                    qim0Var3 = qim0Var2;
                    i18 = i12;
                    z4 = z2;
                } else {
                    x340Var.b0();
                    huxVar2 = huxVar;
                    str2 = str;
                    idn0Var2 = idn0Var;
                    gbxVar3 = gbxVar2;
                    hcxVar2 = hcxVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    i18 = i12;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                }
            }
            i4 |= 12582912;
            if ((i2 & 100663296) == 0) {
                i4 |= 33554432;
            }
            if ((i4 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                } else {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                }
                x340Var.s();
                int i215 = ((i19 >> 3) & 14) | 24576;
                int i216 = i19 >> 15;
                ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i216 & 896) | i215 | (i216 & 112));
                huxVar2 = huxVar3;
                idn0Var2 = idn0Var3;
                gbxVar3 = gbxVar2;
                str2 = str3;
                hcxVar2 = hcxVar3;
                qim0Var3 = qim0Var2;
                i18 = i12;
                z4 = z2;
            } else {
                x340Var.b0();
                huxVar2 = huxVar;
                str2 = str;
                idn0Var2 = idn0Var;
                gbxVar3 = gbxVar2;
                hcxVar2 = hcxVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                i18 = i12;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (hcxVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = hcxVar.ordinal();
            }
            if (x340Var.e(iOrdinal)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                zI = x340Var.g(huxVar);
            } else {
                zI = x340Var.i(huxVar);
            }
            if (zI) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    i12 = i;
                    if (x340Var.e(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 64;
                if (i14 != 0) {
                    i4 |= 1572864;
                    gbxVar2 = gbxVar;
                } else {
                    gbxVar2 = gbxVar;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var.i(gbxVar2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i4 |= i15;
                    }
                }
                i16 = i3 & 128;
                if (i16 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (x340Var.g(str)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i4 |= i17;
                    }
                    if ((i2 & 100663296) == 0) {
                        i4 |= 33554432;
                    }
                    if ((i4 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        } else {
                            if (i20 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i5 != 0) {
                                hcxVar3 = hcx.b;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i7 != 0) {
                                huxVar3 = null;
                            } else {
                                huxVar3 = huxVar;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                i12 = 4;
                            }
                            if (i14 != 0) {
                                gbxVar2 = null;
                            }
                            if (i16 == 0) {
                            }
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = zr7.d();
                                x340Var.s0(objT);
                            }
                            idn0Var3 = (idn0) objT;
                            i19 = (-234881025) & i4;
                        }
                        x340Var.s();
                        int i217 = ((i19 >> 3) & 14) | 24576;
                        int i218 = i19 >> 15;
                        ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i218 & 896) | i217 | (i218 & 112));
                        huxVar2 = huxVar3;
                        idn0Var2 = idn0Var3;
                        gbxVar3 = gbxVar2;
                        str2 = str3;
                        hcxVar2 = hcxVar3;
                        qim0Var3 = qim0Var2;
                        i18 = i12;
                        z4 = z2;
                    } else {
                        x340Var.b0();
                        huxVar2 = huxVar;
                        str2 = str;
                        idn0Var2 = idn0Var;
                        gbxVar3 = gbxVar2;
                        hcxVar2 = hcxVar;
                        qim0Var3 = qim0Var2;
                        z4 = z2;
                        i18 = i12;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                    }
                }
                i4 |= 12582912;
                if ((i2 & 100663296) == 0) {
                    i4 |= 33554432;
                }
                if ((i4 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    } else {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    }
                    x340Var.s();
                    int i219 = ((i19 >> 3) & 14) | 24576;
                    int i2110 = i19 >> 15;
                    ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i2110 & 896) | i219 | (i2110 & 112));
                    huxVar2 = huxVar3;
                    idn0Var2 = idn0Var3;
                    gbxVar3 = gbxVar2;
                    str2 = str3;
                    hcxVar2 = hcxVar3;
                    qim0Var3 = qim0Var2;
                    i18 = i12;
                    z4 = z2;
                } else {
                    x340Var.b0();
                    huxVar2 = huxVar;
                    str2 = str;
                    idn0Var2 = idn0Var;
                    gbxVar3 = gbxVar2;
                    hcxVar2 = hcxVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    i18 = i12;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                }
            }
            i4 |= 196608;
            i12 = i;
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                gbxVar2 = gbxVar;
            } else {
                gbxVar2 = gbxVar;
                if ((i2 & 1572864) == 0) {
                    if (x340Var.i(gbxVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            i16 = i3 & 128;
            if (i16 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (x340Var.g(str)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i4 |= i17;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= 33554432;
                }
                if ((i4 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    } else {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    }
                    x340Var.s();
                    int i2111 = ((i19 >> 3) & 14) | 24576;
                    int i2112 = i19 >> 15;
                    ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i2112 & 896) | i2111 | (i2112 & 112));
                    huxVar2 = huxVar3;
                    idn0Var2 = idn0Var3;
                    gbxVar3 = gbxVar2;
                    str2 = str3;
                    hcxVar2 = hcxVar3;
                    qim0Var3 = qim0Var2;
                    i18 = i12;
                    z4 = z2;
                } else {
                    x340Var.b0();
                    huxVar2 = huxVar;
                    str2 = str;
                    idn0Var2 = idn0Var;
                    gbxVar3 = gbxVar2;
                    hcxVar2 = hcxVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    i18 = i12;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                }
            }
            i4 |= 12582912;
            if ((i2 & 100663296) == 0) {
                i4 |= 33554432;
            }
            if ((i4 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                } else {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                }
                x340Var.s();
                int i2113 = ((i19 >> 3) & 14) | 24576;
                int i2114 = i19 >> 15;
                ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i2114 & 896) | i2113 | (i2114 & 112));
                huxVar2 = huxVar3;
                idn0Var2 = idn0Var3;
                gbxVar3 = gbxVar2;
                str2 = str3;
                hcxVar2 = hcxVar3;
                qim0Var3 = qim0Var2;
                i18 = i12;
                z4 = z2;
            } else {
                x340Var.b0();
                huxVar2 = huxVar;
                str2 = str;
                idn0Var2 = idn0Var;
                gbxVar3 = gbxVar2;
                hcxVar2 = hcxVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                i18 = i12;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
            }
        }
        i4 |= 24576;
        z2 = z;
        i11 = i3 & 32;
        if (i11 != 0) {
            if ((196608 & i2) == 0) {
                i12 = i;
                if (x340Var.e(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            }
            i14 = i3 & 64;
            if (i14 != 0) {
                i4 |= 1572864;
                gbxVar2 = gbxVar;
            } else {
                gbxVar2 = gbxVar;
                if ((i2 & 1572864) == 0) {
                    if (x340Var.i(gbxVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
            }
            i16 = i3 & 128;
            if (i16 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (x340Var.g(str)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i4 |= i17;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= 33554432;
                }
                if ((i4 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    } else {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            hcxVar3 = hcx.b;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i7 != 0) {
                            huxVar3 = null;
                        } else {
                            huxVar3 = huxVar;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            i12 = 4;
                        }
                        if (i14 != 0) {
                            gbxVar2 = null;
                        }
                        if (i16 == 0) {
                        }
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = zr7.d();
                            x340Var.s0(objT);
                        }
                        idn0Var3 = (idn0) objT;
                        i19 = (-234881025) & i4;
                    }
                    x340Var.s();
                    int i2115 = ((i19 >> 3) & 14) | 24576;
                    int i2116 = i19 >> 15;
                    ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i2116 & 896) | i2115 | (i2116 & 112));
                    huxVar2 = huxVar3;
                    idn0Var2 = idn0Var3;
                    gbxVar3 = gbxVar2;
                    str2 = str3;
                    hcxVar2 = hcxVar3;
                    qim0Var3 = qim0Var2;
                    i18 = i12;
                    z4 = z2;
                } else {
                    x340Var.b0();
                    huxVar2 = huxVar;
                    str2 = str;
                    idn0Var2 = idn0Var;
                    gbxVar3 = gbxVar2;
                    hcxVar2 = hcxVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    i18 = i12;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
                }
            }
            i4 |= 12582912;
            if ((i2 & 100663296) == 0) {
                i4 |= 33554432;
            }
            if ((i4 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                } else {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                }
                x340Var.s();
                int i2117 = ((i19 >> 3) & 14) | 24576;
                int i2118 = i19 >> 15;
                ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i2118 & 896) | i2117 | (i2118 & 112));
                huxVar2 = huxVar3;
                idn0Var2 = idn0Var3;
                gbxVar3 = gbxVar2;
                str2 = str3;
                hcxVar2 = hcxVar3;
                qim0Var3 = qim0Var2;
                i18 = i12;
                z4 = z2;
            } else {
                x340Var.b0();
                huxVar2 = huxVar;
                str2 = str;
                idn0Var2 = idn0Var;
                gbxVar3 = gbxVar2;
                hcxVar2 = hcxVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                i18 = i12;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
            }
        }
        i4 |= 196608;
        i12 = i;
        i14 = i3 & 64;
        if (i14 != 0) {
            i4 |= 1572864;
            gbxVar2 = gbxVar;
        } else {
            gbxVar2 = gbxVar;
            if ((i2 & 1572864) == 0) {
                if (x340Var.i(gbxVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
        }
        i16 = i3 & 128;
        if (i16 != 0) {
            if ((i2 & 12582912) == 0) {
                if (x340Var.g(str)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i4 |= i17;
            }
            if ((i2 & 100663296) == 0) {
                i4 |= 33554432;
            }
            if ((i4 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                } else {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        hcxVar3 = hcx.b;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i7 != 0) {
                        huxVar3 = null;
                    } else {
                        huxVar3 = huxVar;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        i12 = 4;
                    }
                    if (i14 != 0) {
                        gbxVar2 = null;
                    }
                    if (i16 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = zr7.d();
                        x340Var.s0(objT);
                    }
                    idn0Var3 = (idn0) objT;
                    i19 = (-234881025) & i4;
                }
                x340Var.s();
                int i2119 = ((i19 >> 3) & 14) | 24576;
                int i21110 = i19 >> 15;
                ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i21110 & 896) | i2119 | (i21110 & 112));
                huxVar2 = huxVar3;
                idn0Var2 = idn0Var3;
                gbxVar3 = gbxVar2;
                str2 = str3;
                hcxVar2 = hcxVar3;
                qim0Var3 = qim0Var2;
                i18 = i12;
                z4 = z2;
            } else {
                x340Var.b0();
                huxVar2 = huxVar;
                str2 = str;
                idn0Var2 = idn0Var;
                gbxVar3 = gbxVar2;
                hcxVar2 = hcxVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                i18 = i12;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
            }
        }
        i4 |= 12582912;
        if ((i2 & 100663296) == 0) {
            i4 |= 33554432;
        }
        if ((i4 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    hcxVar3 = hcx.b;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i7 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    i12 = 4;
                }
                if (i14 != 0) {
                    gbxVar2 = null;
                }
                if (i16 == 0) {
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = zr7.d();
                    x340Var.s0(objT);
                }
                idn0Var3 = (idn0) objT;
                i19 = (-234881025) & i4;
            } else {
                if (i20 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    hcxVar3 = hcx.b;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i7 != 0) {
                    huxVar3 = null;
                } else {
                    huxVar3 = huxVar;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    i12 = 4;
                }
                if (i14 != 0) {
                    gbxVar2 = null;
                }
                if (i16 == 0) {
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = zr7.d();
                    x340Var.s0(objT);
                }
                idn0Var3 = (idn0) objT;
                i19 = (-234881025) & i4;
            }
            x340Var.s();
            int i21111 = ((i19 >> 3) & 14) | 24576;
            int i21112 = i19 >> 15;
            ero1.c(qim0Var2, gbxVar2, str3, idn0Var3, apo.r(-182897948, new qhx(hcxVar3, huxVar3, i12, z2, c380Var), x340Var), x340Var, (i21112 & 896) | i21111 | (i21112 & 112));
            huxVar2 = huxVar3;
            idn0Var2 = idn0Var3;
            gbxVar3 = gbxVar2;
            str2 = str3;
            hcxVar2 = hcxVar3;
            qim0Var3 = qim0Var2;
            i18 = i12;
            z4 = z2;
        } else {
            x340Var.b0();
            huxVar2 = huxVar;
            str2 = str;
            idn0Var2 = idn0Var;
            gbxVar3 = gbxVar2;
            hcxVar2 = hcxVar;
            qim0Var3 = qim0Var2;
            z4 = z2;
            i18 = i12;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rhx(c380Var, qim0Var3, hcxVar2, huxVar2, z4, i18, gbxVar3, str2, idn0Var2, i2, i3);
        }
    }

    public static final void b(phx phxVar, hcx hcxVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-345233287);
        int i2 = (x340Var.i(phxVar) ? 4 : 2) | i | (x340Var.e(hcxVar.ordinal()) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            bmq0.a(Uri.parse(phxVar.c()), vqo1.l(nim0.a), hcxVar, phxVar.d(), phxVar.b(), phxVar.a(), 0L, false, x340Var, (i2 << 3) & 896, 192);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(phxVar, hcxVar, i, (byte) 12);
        }
    }

    public static final void c(int i, hcx hcxVar, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(749850852);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.e(hcxVar == null ? -1 : hcxVar.ordinal()) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            f(hcxVar, null, apo.r(922340657, new du0(hcxVar, i, (byte) 23), x340Var), x340Var, ((i3 >> 3) & 14) | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d6a(i, hcxVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    public static final void d(ebr0 ebr0Var, Parcelable parcelable, ecr0 ecr0Var, phi0 phi0Var, mr20 mr20Var, Function0 function0, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj;
        ven0 ven0Var;
        Context context;
        int i2;
        ven0 ven0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1856028607);
        int i3 = i | (x340Var.i(ebr0Var) ? 4 : 2) | (x340Var.g(parcelable) ? 32 : 16) | (x340Var.i(ecr0Var) ? 256 : 128) | (x340Var.i(phi0Var) ? 2048 : 1024) | (x340Var.i(mr20Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | 12582912 | (x340Var.i(vu30Var) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            Context context2 = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objK = x340Var.k(AndroidCompositionLocals_androidKt.f);
            ViewGroup viewGroup = objK instanceof ViewGroup ? (ViewGroup) objK : null;
            if (viewGroup == null) {
                eg.m("Page composable must be placed within a ViewGroup");
                return;
            }
            x8c0 lifecycle = ((iac0) x340Var.k(jfe0.a)).getLifecycle();
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                w0n0 w0n0Var = w0n0.Y;
                x340Var.s0(w0n0Var);
                obj = w0n0Var;
            }
            obj = objT;
            ven0 ven0Var3 = (ven0) k5p1.s(objArr, (Function0) obj, x340Var, 48);
            boolean zG = ((i3 & 112) == 32) | x340Var.g(ebr0Var) | x340Var.g(ecr0Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                ven0Var = ven0Var3;
                context = context2;
                i2 = 0;
                dcr0 dcr0Var = new dcr0(ecr0Var, ebr0Var, parcelable, function0, (Bundle) ven0Var3.getValue(), (x8c0) null, (rck1) null, 160);
                dcr0Var.f();
                x340Var.s0(dcr0Var);
                objT2 = dcr0Var;
            } else {
                context = context2;
                ven0Var = ven0Var3;
                i2 = 0;
            }
            dcr0 dcr0Var2 = (dcr0) objT2;
            Object[] objArr2 = new Object[i2];
            Object objT3 = x340Var.T();
            Object obj2 = objT3;
            if (objT3 == m4cVar) {
                v0r0 v0r0Var = v0r0.h;
                x340Var.s0(v0r0Var);
                obj2 = v0r0Var;
            }
            ven0 ven0Var4 = (ven0) k5p1.s(objArr2, (Function0) obj2, x340Var, 48);
            boolean zG2 = x340Var.g(dcr0Var2) | x340Var.g(phi0Var) | x340Var.g(mr20Var) | x340Var.g(context) | x340Var.g(viewGroup);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == m4cVar) {
                ven0Var2 = ven0Var4;
                air0 air0Var = new air0(dcr0Var2, phi0Var, mr20Var, null, context, viewGroup, (Bundle) ven0Var4.getValue(), lifecycle, 8);
                x340Var.s0(air0Var);
                objT4 = air0Var;
            } else {
                ven0Var2 = ven0Var4;
            }
            air0 air0Var2 = (air0) objT4;
            k2r0.a(air0Var2.t.Y, apo.r(-2023851313, new b2o0(air0Var2, ven0Var2, ven0Var, dcr0Var2), x340Var), x340Var, 48);
            if (vu30Var != null) {
                x340Var.i0(-458430731);
                h0r0 h0r0VarC = dcr0Var2.c();
                c7r0 c7r0VarB = dcr0Var2.b();
                int i4 = ((i3 & 234881024) == 67108864 ? 1 : i2) | (x340Var.i(h0r0VarC) ? 1 : 0) | (x340Var.i(c7r0VarB) ? 1 : 0);
                Object objT5 = x340Var.T();
                if (i4 != 0 || objT5 == m4cVar) {
                    os20 os20Var = new os20(vu30Var, h0r0VarC, c7r0VarB, (lnm) null, (byte) 1);
                    x340Var.s0(os20Var);
                    objT5 = os20Var;
                }
                qxd0.s(h0r0VarC, c7r0VarB, (vu30) objT5, x340Var);
                x340Var.r(i2);
            } else {
                x340Var.i0(-458263517);
                x340Var.r(i2);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(ebr0Var, parcelable, ecr0Var, phi0Var, mr20Var, function0, qim0Var2, vu30Var, i);
        }
    }

    public static final void e(String str, Function0 function0, hux huxVar, b0k b0kVar, int i, int i2) {
        int i3;
        b0k b0kVar2;
        hux huxVar2 = huxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1829234025);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i4 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= b0kVar3.g(nim0Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? b0kVar3.g(huxVar2) : b0kVar3.i(huxVar2) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            j2i j2iVarR = null;
            if (i5 != 0) {
                huxVar2 = null;
            }
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gbx gbxVar = new gbx(z50.c, function0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 1, uyn1.i(16.0f, 12.0f, 16.0f, 12.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499);
            if (huxVar2 != null) {
                b0kVar3.i0(166704822);
                j2iVarR = apo.r(-572022086, new g70(huxVar2, (byte) 9), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(166960355);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, j2iVarR, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1419918245, new iww0(str, (byte) 13), b0kVar3), b0kVar2, 64, 196608, 32444);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        hux huxVar3 = huxVar2;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(str, function0, huxVar3, i, i2);
        }
    }

    public static final void f(hcx hcxVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1735120623);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(hcxVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            float fA = hcxVar.a(x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = vqo1.l(u291.h(u291.x(fA, 0.0f, 2, qim0Var3), hcxVar.a(x340Var)));
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarL, cbx.a(x340Var).a.b.a(), er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i3 >> 6) & 14, j2iVar, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zmn(hcxVar, qim0Var2, j2iVar, i, (byte) 1);
        }
    }

    public static final void g(gt40 gt40Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1380468206);
        if ((((x340Var.g(gt40Var) ? 4 : 2) | i) & 3) == 2 && x340Var.H()) {
            x340Var.b0();
        } else {
            qma1 qma1Var = qma1.a;
            x340Var.j0(-1115894518);
            x340Var.j0(1886828752);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(new zg20(qma1Var, (byte) 18));
            } else {
                x340Var.v0();
            }
            nko1.H(gt40Var, x340Var, h9a1.a1);
            x340Var.r(true);
            x340Var.r(false);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m7x(gt40Var, i, (byte) 2);
        }
    }

    public static boolean g0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void h(n8d0 n8d0Var, hx30 hx30Var, Executor executor) {
        n8d0Var.b(new nx30(n8d0Var, hx30Var, (byte) 24), executor);
    }

    public static final Object i(CompletableSource completableSource, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        completableSource.subscribe(new n141(ohdVar));
        Object objR = ohdVar.r();
        return objR == d9n.a ? objR : rih1.a;
    }

    public static nwg1 i0(Runnable runnable, Executor executor) {
        nwg1 nwg1VarY = nwg1.y(runnable, (Object) null);
        executor.execute(nwg1VarY);
        return nwg1VarY;
    }

    public static final Object j(SingleSource singleSource, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        singleSource.subscribe(new o141(ohdVar));
        return ohdVar.r();
    }

    public static nwg1 j0(uh7 uh7Var, Executor executor) {
        nwg1 nwg1VarA = nwg1.A(uh7Var);
        executor.execute(nwg1VarA);
        return nwg1VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(Observable observable, Function0 function0, onm onmVar) {
        p141 p141Var;
        if (onmVar instanceof p141) {
            p141Var = (p141) onmVar;
            int i = p141Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p141Var.c = i - Integer.MIN_VALUE;
            } else {
                p141Var = new p141(onmVar);
            }
        } else {
            p141Var = new p141(onmVar);
        }
        Object objL = p141Var.b;
        int i2 = p141Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            p141Var.a = function0;
            p141Var.c = 1;
            objL = l(observable, 2, null, p141Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function0 = p141Var.a;
            hm5.M(objL);
        }
        return objL == null ? function0.invoke() : objL;
    }

    public static int k0(c5u c5uVar, dg41 dg41Var) {
        if (c5uVar instanceof w4u) {
            return ((w4u) c5uVar).a;
        }
        int iOrdinal = dg41Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        eg.o();
        return 0;
    }

    public static final Object l(ObservableSource observableSource, int i, Object obj, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        observableSource.subscribe(new q141(ohdVar, i, obj));
        return ohdVar.r();
    }

    public static void l0(StringBuilder sb, List list) {
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, list.size()), 2);
        int i = rr80VarO.a;
        int i2 = rr80VarO.b;
        int i3 = rr80VarO.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static final Object m(Maybe maybe, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        maybe.subscribe(new r141(ohdVar));
        return ohdVar.r();
    }

    public static final void m0(int i, String str, String str2) {
        StringBuilder sbS = l1d.s(i, "Expected ", str2, " at index ", ", but was '");
        sbS.append(str.charAt(i));
        sbS.append('\'');
        throw new IllegalArgumentException(sbS.toString());
    }

    public static final qim0 n(qim0 qim0Var, float f, float f2, hw61 hw61Var) {
        boolean z;
        int i;
        if (hw61Var != null) {
            i = 0;
            z = true;
        } else {
            z = false;
            i = 3;
        }
        return ((p3v.b(f, 0.0f) <= 0 || p3v.b(f2, 0.0f) <= 0) && !z) ? qim0Var : i541.C(qim0Var, new skb(f, f2, i, hw61Var, z));
    }

    public static void n0(int i, Object obj) {
        if (obj != null) {
            return;
        }
        bhn0.i(gvg.l(new StringBuilder(String.valueOf(i).length() + 9), "at index ", i));
    }

    public static final void o(long j) {
        wee1[] wee1VarArr = TextUnit.b;
        if ((j & 1095216660480L) == 0) {
            sf80.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void p(long j, long j2) {
        wee1[] wee1VarArr = TextUnit.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            sf80.a("Cannot perform operation for Unspecified type.");
        }
        if (wee1.a(TextUnit.b(j), TextUnit.b(j2))) {
            return;
        }
        sf80.a("Cannot perform operation for " + wee1.b(TextUnit.b(j)) + " and " + wee1.b(TextUnit.b(j2)));
    }

    public static final Object s(Function0 function0, lnm lnmVar, vr20 vr20Var, xu30 xu30Var, mr20[] mr20VarArr) {
        Object objX = t3p1.x(new zbh(function0, null, vr20Var, xu30Var, mr20VarArr), lnmVar);
        return objX == d9n.a ? objX : rih1.a;
    }

    public static final long t(int i, int i2, k291 k291Var, dg41 dg41Var, k291 k291Var2) {
        int i3;
        int i4;
        if (!u890.j(k291Var, k291.c)) {
            i = k0(k291Var.a, dg41Var);
            i2 = k0(k291Var.b, dg41Var);
        }
        w4u w4uVar = k291Var2.a;
        w4u w4uVar2 = k291Var2.b;
        if ((w4uVar instanceof w4u) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = w4uVar.a)) {
            i = i4;
        }
        if ((w4uVar2 instanceof w4u) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = w4uVar2.a)) {
            i2 = i3;
        }
        return cbp1.i(i, i2);
    }

    public static final double u(int i, int i2, int i3, int i4, dg41 dg41Var) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = dg41Var.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        eg.o();
        return 0.0d;
    }

    public static final a1z v(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        q0z q0zVar = new q0z(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) f46.n0(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            q0zVar.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) f46.n0(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = q0zVar.d;
                    List[] listArr = q0zVar.f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[q0zVar.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        a1z a1zVar = new a1z(str, enumArr);
        a1zVar.b = q0zVar;
        return a1zVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static final Object w(oma0 oma0Var) throws i9n {
        Class clsN = ((wdg) jhc1.s(oma0Var)).n();
        if (clsN.isArray()) {
            return Array.newInstance(clsN.getComponentType(), 0);
        }
        throw new i9n("Cannot instantiate the default empty array of type " + clsN.getSimpleName() + ", because it is not an array type");
    }

    public static final void y(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = a860.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static bjy0 z(String str) {
        if (str.equals("http/1.0")) {
            return bjy0.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return bjy0.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return bjy0.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return bjy0.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return bjy0.SPDY_3;
        }
        if (str.equals("quic")) {
            return bjy0.QUIC;
        }
        if (nhc1.Y(str, "h3", false)) {
            return bjy0.HTTP_3;
        }
        k220.i("Unexpected protocol: ".concat(str));
        return null;
    }

    public abstract int B();

    public abstract Context H();

    public abstract void I();

    public boolean L() {
        return false;
    }

    public abstract boolean V(int i, KeyEvent keyEvent);

    public boolean W(KeyEvent keyEvent) {
        return false;
    }

    public boolean X() {
        return false;
    }

    public abstract void b0(boolean z);

    public abstract void c0();

    public abstract void d0(g4b1 g4b1Var);

    public abstract void f0(CharSequence charSequence);

    public o60 h0(em3 em3Var) {
        return null;
    }

    public boolean q() {
        return false;
    }

    public abstract boolean r();

    public abstract void x(boolean z);

    public void T() {
    }

    public void U() {
    }

    public void a0(boolean z) {
    }

    public void e0(boolean z) {
    }
}
