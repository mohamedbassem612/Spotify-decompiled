package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sy4 {
    public static final kiv a = new kiv(new xh3((byte) 2), (byte) 0);
    public static final kiv b = new kiv(new ya4((byte) 18), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:0x022b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0231  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x025c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0266  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0203  */
    public static final void a(mfv0 mfv0Var, Function0 function0, final nfv0 nfv0Var, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        int i3;
        Function0 function1;
        nfv0 nfv0Var2;
        int i4;
        boolean z;
        final Function0 function2;
        h311 h311VarV;
        final Function0 function3;
        View view;
        wat watVar;
        String str;
        final flb0 flb0Var;
        v3k v3kVarU;
        ven0 ven0VarS;
        Object objT;
        m4c m4cVar;
        Object obj;
        UUID uuid;
        boolean zBooleanValue;
        Object objT2;
        String str2;
        byte b2;
        final ifv0 ifv0Var;
        int i5;
        byte b3;
        int i6;
        byte b4;
        boolean z2;
        Object objT3;
        byte b5;
        byte b6;
        boolean z3;
        Object objT4;
        byte b7;
        byte b8;
        int i7;
        Object obj2;
        boolean zI;
        Object obj3;
        boolean zI2;
        Object obj4;
        boolean zI3;
        Object obj5;
        gfh0 gfh0Var;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i8;
        int i9;
        final mfv0 mfv0Var2 = mfv0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(mfv0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= x340Var.i(function1) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                nfv0Var2 = nfv0Var;
                if (x340Var.g(nfv0Var2)) {
                    i9 = SemanticState.Hidden;
                } else {
                    i9 = SemanticState.Focused;
                }
                i3 |= i9;
            } else {
                nfv0Var2 = nfv0Var;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(j2iVar)) {
                    i8 = SemanticState.Modal;
                } else {
                    i8 = SemanticState.ReadOnly;
                }
                i3 |= i8;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                watVar = (wat) x340Var.k(t4k.h);
                str = (String) x340Var.k(a);
                flb0Var = (flb0) x340Var.k(t4k.n);
                v3kVarU = tgp1.u(x340Var);
                ven0VarS = v8r.s(j2iVar, x340Var);
                Object[] objArr = new Object[0];
                objT = x340Var.T();
                m4cVar = fkj0.X;
                obj = objT;
                if (objT == m4cVar) {
                    xh3 xh3Var = new xh3((byte) 3);
                    x340Var.s0(xh3Var);
                    obj = xh3Var;
                }
                uuid = (UUID) k5p1.s(objArr, (Function0) obj, x340Var, 48);
                zBooleanValue = ((Boolean) x340Var.k(b)).booleanValue();
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    str2 = str;
                    b2 = 0;
                    ifv0 ifv0Var2 = new ifv0(function3, nfv0Var2, str2, view, watVar, mfv0Var2, uuid, zBooleanValue);
                    mfv0Var2 = mfv0Var2;
                    ifv0Var2.z(v3kVarU, new j2i(-297523940, new ny4(ifv0Var2, ven0VarS, b2), true));
                    x340Var.s0(ifv0Var2);
                    objT2 = ifv0Var2;
                } else {
                    str2 = str;
                    b2 = 0;
                }
                ifv0Var = (ifv0) objT2;
                boolean zI4 = x340Var.i(ifv0Var);
                i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
                if (i5 == 32) {
                    b3 = 1;
                } else {
                    b3 = b2;
                }
                int i11 = (zI4 ? 1 : 0) | b3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    b4 = 1;
                } else {
                    b4 = b2;
                }
                z2 = (((i11 | b4) | (x340Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (x340Var.e(flb0Var.ordinal()) ? 1 : 0);
                objT3 = x340Var.T();
                if (z2 == 0 || objT3 == m4cVar) {
                    kl4 kl4Var = new kl4(ifv0Var, function3, nfv0Var, str2, flb0Var, (byte) 1);
                    x340Var.s0(kl4Var);
                    objT3 = kl4Var;
                }
                qxd0.i(ifv0Var, (iu30) objT3, x340Var);
                boolean zI5 = x340Var.i(ifv0Var);
                if (i5 == 32) {
                    b5 = 1;
                } else {
                    b5 = b2;
                }
                int i12 = b5 | (zI5 ? 1 : 0);
                if (i6 == 256) {
                    b6 = 1;
                } else {
                    b6 = b2;
                }
                z3 = ((((i12 == true ? 1 : 0) | b6) | (x340Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (x340Var.e(flb0Var.ordinal()) ? 1 : 0);
                objT4 = x340Var.T();
                if (z3 == 0 || objT4 == m4cVar) {
                    final String str3 = str2;
                    Function0 function4 = new Function0() { // from class: p.oy4
                        public final Object invoke() {
                            ifv0Var.A(function3, nfv0Var, str3, flb0Var);
                            return rih1.a;
                        }
                    };
                    x340Var.s0(function4);
                    objT4 = function4;
                }
                qxd0.S((Function0) objT4, x340Var);
                boolean zI6 = x340Var.i(ifv0Var);
                b7 = 4;
                if ((i4 & 14) == 4) {
                    b8 = 1;
                } else {
                    b8 = b2;
                }
                i7 = b8 | (zI6 ? 1 : 0);
                Object objT5 = x340Var.T();
                obj2 = objT5;
                if (i7 == 0 || objT5 == m4cVar) {
                    b6 b6Var = new b6(ifv0Var, mfv0Var2, b7);
                    x340Var.s0(b6Var);
                    obj2 = b6Var;
                }
                qxd0.i(mfv0Var2, (iu30) obj2, x340Var);
                zI = x340Var.i(ifv0Var);
                Object objT6 = x340Var.T();
                obj3 = objT6;
                if (zI || objT6 == m4cVar) {
                    hi2 hi2Var = new hi2(ifv0Var, (lnm) null, (byte) 22);
                    x340Var.s0(hi2Var);
                    obj3 = hi2Var;
                }
                qxd0.t(ifv0Var, x340Var, (vu30) obj3);
                zI2 = x340Var.i(ifv0Var);
                Object objT7 = x340Var.T();
                obj4 = objT7;
                if (zI2 || objT7 == m4cVar) {
                    ly4 ly4Var = new ly4(ifv0Var, (byte) 1);
                    x340Var.s0(ly4Var);
                    obj4 = ly4Var;
                }
                qim0 qim0VarX = ern1.x(nim0.a, (iu30) obj4);
                zI3 = x340Var.i(ifv0Var) | x340Var.e(flb0Var.ordinal());
                Object objT8 = x340Var.T();
                obj5 = objT8;
                if (zI3 || objT8 == m4cVar) {
                    qy4 qy4Var = new qy4(ifv0Var, flb0Var, b2);
                    x340Var.s0(qy4Var);
                    obj5 = qy4Var;
                }
                gfh0Var = (gfh0) obj5;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var.r(true);
                function2 = function3;
            } else {
                x340Var.b0();
                function2 = function1;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.py4
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        sy4.a(mfv0Var2, function2, nfv0Var, j2iVar, (b0k) obj6, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 48;
        function1 = function0;
        if ((i & 384) == 0) {
            nfv0Var2 = nfv0Var;
            if (x340Var.g(nfv0Var2)) {
                i9 = SemanticState.Hidden;
            } else {
                i9 = SemanticState.Focused;
            }
            i3 |= i9;
        } else {
            nfv0Var2 = nfv0Var;
        }
        if ((i & 3072) == 0) {
            if (x340Var.i(j2iVar)) {
                i8 = SemanticState.Modal;
            } else {
                i8 = SemanticState.ReadOnly;
            }
            i3 |= i8;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i10 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            watVar = (wat) x340Var.k(t4k.h);
            str = (String) x340Var.k(a);
            flb0Var = (flb0) x340Var.k(t4k.n);
            v3kVarU = tgp1.u(x340Var);
            ven0VarS = v8r.s(j2iVar, x340Var);
            Object[] objArr2 = new Object[0];
            objT = x340Var.T();
            m4cVar = fkj0.X;
            obj = objT;
            if (objT == m4cVar) {
                xh3 xh3Var2 = new xh3((byte) 3);
                x340Var.s0(xh3Var2);
                obj = xh3Var2;
            }
            uuid = (UUID) k5p1.s(objArr2, (Function0) obj, x340Var, 48);
            zBooleanValue = ((Boolean) x340Var.k(b)).booleanValue();
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                str2 = str;
                b2 = 0;
                ifv0 ifv0Var3 = new ifv0(function3, nfv0Var2, str2, view, watVar, mfv0Var2, uuid, zBooleanValue);
                mfv0Var2 = mfv0Var2;
                ifv0Var3.z(v3kVarU, new j2i(-297523940, new ny4(ifv0Var3, ven0VarS, b2), true));
                x340Var.s0(ifv0Var3);
                objT2 = ifv0Var3;
            } else {
                str2 = str;
                b2 = 0;
            }
            ifv0Var = (ifv0) objT2;
            boolean zI7 = x340Var.i(ifv0Var);
            i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
            if (i5 == 32) {
                b3 = 1;
            } else {
                b3 = b2;
            }
            int i13 = (zI7 ? 1 : 0) | b3;
            i6 = i4 & 896;
            if (i6 == 256) {
                b4 = 1;
            } else {
                b4 = b2;
            }
            z2 = (((i13 | b4) | (x340Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (x340Var.e(flb0Var.ordinal()) ? 1 : 0);
            objT3 = x340Var.T();
            if (z2 == 0) {
                kl4 kl4Var2 = new kl4(ifv0Var, function3, nfv0Var, str2, flb0Var, (byte) 1);
                x340Var.s0(kl4Var2);
                objT3 = kl4Var2;
            } else {
                kl4 kl4Var3 = new kl4(ifv0Var, function3, nfv0Var, str2, flb0Var, (byte) 1);
                x340Var.s0(kl4Var3);
                objT3 = kl4Var3;
            }
            qxd0.i(ifv0Var, (iu30) objT3, x340Var);
            boolean zI8 = x340Var.i(ifv0Var);
            if (i5 == 32) {
                b5 = 1;
            } else {
                b5 = b2;
            }
            int i14 = b5 | (zI8 ? 1 : 0);
            if (i6 == 256) {
                b6 = 1;
            } else {
                b6 = b2;
            }
            z3 = ((((i14 == true ? 1 : 0) | b6) | (x340Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (x340Var.e(flb0Var.ordinal()) ? 1 : 0);
            objT4 = x340Var.T();
            if (z3 == 0) {
                final String str4 = str2;
                Function0 function5 = new Function0() { // from class: p.oy4
                    public final Object invoke() {
                        ifv0Var.A(function3, nfv0Var, str4, flb0Var);
                        return rih1.a;
                    }
                };
                x340Var.s0(function5);
                objT4 = function5;
            } else {
                final String str5 = str2;
                Function0 function6 = new Function0() { // from class: p.oy4
                    public final Object invoke() {
                        ifv0Var.A(function3, nfv0Var, str5, flb0Var);
                        return rih1.a;
                    }
                };
                x340Var.s0(function6);
                objT4 = function6;
            }
            qxd0.S((Function0) objT4, x340Var);
            boolean zI9 = x340Var.i(ifv0Var);
            b7 = 4;
            if ((i4 & 14) == 4) {
                b8 = 1;
            } else {
                b8 = b2;
            }
            i7 = b8 | (zI9 ? 1 : 0);
            Object objT9 = x340Var.T();
            obj2 = objT9;
            if (i7 == 0) {
                b6 b6Var2 = new b6(ifv0Var, mfv0Var2, b7);
                x340Var.s0(b6Var2);
                obj2 = b6Var2;
            } else {
                b6 b6Var3 = new b6(ifv0Var, mfv0Var2, b7);
                x340Var.s0(b6Var3);
                obj2 = b6Var3;
            }
            qxd0.i(mfv0Var2, (iu30) obj2, x340Var);
            zI = x340Var.i(ifv0Var);
            Object objT10 = x340Var.T();
            obj3 = objT10;
            if (zI) {
                hi2 hi2Var2 = new hi2(ifv0Var, (lnm) null, (byte) 22);
                x340Var.s0(hi2Var2);
                obj3 = hi2Var2;
            } else {
                hi2 hi2Var3 = new hi2(ifv0Var, (lnm) null, (byte) 22);
                x340Var.s0(hi2Var3);
                obj3 = hi2Var3;
            }
            qxd0.t(ifv0Var, x340Var, (vu30) obj3);
            zI2 = x340Var.i(ifv0Var);
            Object objT11 = x340Var.T();
            obj4 = objT11;
            if (zI2) {
                ly4 ly4Var2 = new ly4(ifv0Var, (byte) 1);
                x340Var.s0(ly4Var2);
                obj4 = ly4Var2;
            } else {
                ly4 ly4Var3 = new ly4(ifv0Var, (byte) 1);
                x340Var.s0(ly4Var3);
                obj4 = ly4Var3;
            }
            qim0 qim0VarX2 = ern1.x(nim0.a, (iu30) obj4);
            zI3 = x340Var.i(ifv0Var) | x340Var.e(flb0Var.ordinal());
            Object objT12 = x340Var.T();
            obj5 = objT12;
            if (zI3) {
                qy4 qy4Var2 = new qy4(ifv0Var, flb0Var, b2);
                x340Var.s0(qy4Var2);
                obj5 = qy4Var2;
            } else {
                qy4 qy4Var3 = new qy4(ifv0Var, flb0Var, b2);
                x340Var.s0(qy4Var3);
                obj5 = qy4Var3;
            }
            gfh0Var = (gfh0) obj5;
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX2);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.r(true);
            function2 = function3;
        } else {
            x340Var.b0();
            function2 = function1;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.py4
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    sy4.a(mfv0Var2, function2, nfv0Var, j2iVar, (b0k) obj6, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void b(tl3 tl3Var, long j, Function0 function0, nfv0 nfv0Var, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        tl3 tl3Var2;
        int i3;
        long j2;
        int i4;
        Function0 function1;
        int i5;
        int i6;
        nfv0 nfv0Var2;
        int i7;
        j2i j2iVar2;
        boolean z;
        final tl3 tl3Var3;
        final Function0 function2;
        final nfv0 nfv0Var3;
        final long j3;
        h311 h311VarV;
        tl3 tl3Var4;
        nfv0 nfv0Var4;
        boolean z2;
        boolean zG;
        Object objT;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(71005054);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            tl3Var2 = tl3Var;
        } else if ((i & 6) == 0) {
            tl3Var2 = tl3Var;
            i3 = (x340Var.g(tl3Var2) ? 4 : 2) | i;
        } else {
            tl3Var2 = tl3Var;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                j2 = j;
                i3 |= x340Var.f(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function1 = function0;
                    if (x340Var.i(function1)) {
                        i5 = SemanticState.Hidden;
                    } else {
                        i5 = SemanticState.Focused;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        nfv0Var2 = nfv0Var;
                        if (x340Var.g(nfv0Var2)) {
                            i7 = SemanticState.Modal;
                        } else {
                            i7 = SemanticState.ReadOnly;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        j2iVar2 = j2iVar;
                        if (x340Var.i(j2iVar2)) {
                            i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                        } else {
                            i8 = SemanticState.Multiline;
                        }
                        i3 |= i8;
                    } else {
                        j2iVar2 = j2iVar;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        if (i9 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if (i10 != 0) {
                            j2 = 0;
                        }
                        if (i4 != 0) {
                            function1 = null;
                        }
                        if (i6 != 0) {
                            nfv0Var4 = new nfv0(31, false, false, false);
                        } else {
                            nfv0Var4 = nfv0Var2;
                        }
                        short s = nfv0Var4.g;
                        if ((i3 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s);
                        objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            objT = new dm3(tl3Var4, j2);
                            x340Var.s0(objT);
                        }
                        Function0 function3 = function1;
                        a((dm3) objT, function3, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                        nfv0Var3 = nfv0Var4;
                        function2 = function3;
                        tl3Var3 = tl3Var4;
                    } else {
                        x340Var.b0();
                        tl3Var3 = tl3Var2;
                        function2 = function1;
                        nfv0Var3 = nfv0Var2;
                    }
                    j3 = j2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.my4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                nfv0Var2 = nfv0Var;
                if ((i & 24576) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i8 = SemanticState.Multiline;
                    }
                    i3 |= i8;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    if (i9 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        nfv0Var4 = new nfv0(31, false, false, false);
                    } else {
                        nfv0Var4 = nfv0Var2;
                    }
                    short s2 = nfv0Var4.g;
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s2);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new dm3(tl3Var4, j2);
                        x340Var.s0(objT);
                    } else {
                        objT = new dm3(tl3Var4, j2);
                        x340Var.s0(objT);
                    }
                    Function0 function4 = function1;
                    a((dm3) objT, function4, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                    nfv0Var3 = nfv0Var4;
                    function2 = function4;
                    tl3Var3 = tl3Var4;
                } else {
                    x340Var.b0();
                    tl3Var3 = tl3Var2;
                    function2 = function1;
                    nfv0Var3 = nfv0Var2;
                }
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.my4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 384;
            function1 = function0;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    nfv0Var2 = nfv0Var;
                    if (x340Var.g(nfv0Var2)) {
                        i7 = SemanticState.Modal;
                    } else {
                        i7 = SemanticState.ReadOnly;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i8 = SemanticState.Multiline;
                    }
                    i3 |= i8;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    if (i9 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        nfv0Var4 = new nfv0(31, false, false, false);
                    } else {
                        nfv0Var4 = nfv0Var2;
                    }
                    short s3 = nfv0Var4.g;
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s3);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new dm3(tl3Var4, j2);
                        x340Var.s0(objT);
                    } else {
                        objT = new dm3(tl3Var4, j2);
                        x340Var.s0(objT);
                    }
                    Function0 function5 = function1;
                    a((dm3) objT, function5, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                    nfv0Var3 = nfv0Var4;
                    function2 = function5;
                    tl3Var3 = tl3Var4;
                } else {
                    x340Var.b0();
                    tl3Var3 = tl3Var2;
                    function2 = function1;
                    nfv0Var3 = nfv0Var2;
                }
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.my4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            nfv0Var2 = nfv0Var;
            if ((i & 24576) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i8 = SemanticState.Multiline;
                }
                i3 |= i8;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i9 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if (i6 != 0) {
                    nfv0Var4 = new nfv0(31, false, false, false);
                } else {
                    nfv0Var4 = nfv0Var2;
                }
                short s4 = nfv0Var4.g;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s4);
                objT = x340Var.T();
                if (zG) {
                    objT = new dm3(tl3Var4, j2);
                    x340Var.s0(objT);
                } else {
                    objT = new dm3(tl3Var4, j2);
                    x340Var.s0(objT);
                }
                Function0 function6 = function1;
                a((dm3) objT, function6, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                nfv0Var3 = nfv0Var4;
                function2 = function6;
                tl3Var3 = tl3Var4;
            } else {
                x340Var.b0();
                tl3Var3 = tl3Var2;
                function2 = function1;
                nfv0Var3 = nfv0Var2;
            }
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.my4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 48;
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function1 = function0;
                if (x340Var.i(function1)) {
                    i5 = SemanticState.Hidden;
                } else {
                    i5 = SemanticState.Focused;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    nfv0Var2 = nfv0Var;
                    if (x340Var.g(nfv0Var2)) {
                        i7 = SemanticState.Modal;
                    } else {
                        i7 = SemanticState.ReadOnly;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i8 = SemanticState.Multiline;
                    }
                    i3 |= i8;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    if (i9 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i10 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        function1 = null;
                    }
                    if (i6 != 0) {
                        nfv0Var4 = new nfv0(31, false, false, false);
                    } else {
                        nfv0Var4 = nfv0Var2;
                    }
                    short s5 = nfv0Var4.g;
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s5);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new dm3(tl3Var4, j2);
                        x340Var.s0(objT);
                    } else {
                        objT = new dm3(tl3Var4, j2);
                        x340Var.s0(objT);
                    }
                    Function0 function7 = function1;
                    a((dm3) objT, function7, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                    nfv0Var3 = nfv0Var4;
                    function2 = function7;
                    tl3Var3 = tl3Var4;
                } else {
                    x340Var.b0();
                    tl3Var3 = tl3Var2;
                    function2 = function1;
                    nfv0Var3 = nfv0Var2;
                }
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.my4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            nfv0Var2 = nfv0Var;
            if ((i & 24576) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i8 = SemanticState.Multiline;
                }
                i3 |= i8;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i9 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if (i6 != 0) {
                    nfv0Var4 = new nfv0(31, false, false, false);
                } else {
                    nfv0Var4 = nfv0Var2;
                }
                short s6 = nfv0Var4.g;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s6);
                objT = x340Var.T();
                if (zG) {
                    objT = new dm3(tl3Var4, j2);
                    x340Var.s0(objT);
                } else {
                    objT = new dm3(tl3Var4, j2);
                    x340Var.s0(objT);
                }
                Function0 function8 = function1;
                a((dm3) objT, function8, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                nfv0Var3 = nfv0Var4;
                function2 = function8;
                tl3Var3 = tl3Var4;
            } else {
                x340Var.b0();
                tl3Var3 = tl3Var2;
                function2 = function1;
                nfv0Var3 = nfv0Var2;
            }
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.my4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 384;
        function1 = function0;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                nfv0Var2 = nfv0Var;
                if (x340Var.g(nfv0Var2)) {
                    i7 = SemanticState.Modal;
                } else {
                    i7 = SemanticState.ReadOnly;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i8 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i8 = SemanticState.Multiline;
                }
                i3 |= i8;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i9 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i10 != 0) {
                    j2 = 0;
                }
                if (i4 != 0) {
                    function1 = null;
                }
                if (i6 != 0) {
                    nfv0Var4 = new nfv0(31, false, false, false);
                } else {
                    nfv0Var4 = nfv0Var2;
                }
                short s7 = nfv0Var4.g;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s7);
                objT = x340Var.T();
                if (zG) {
                    objT = new dm3(tl3Var4, j2);
                    x340Var.s0(objT);
                } else {
                    objT = new dm3(tl3Var4, j2);
                    x340Var.s0(objT);
                }
                Function0 function9 = function1;
                a((dm3) objT, function9, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
                nfv0Var3 = nfv0Var4;
                function2 = function9;
                tl3Var3 = tl3Var4;
            } else {
                x340Var.b0();
                tl3Var3 = tl3Var2;
                function2 = function1;
                nfv0Var3 = nfv0Var2;
            }
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.my4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 3072;
        nfv0Var2 = nfv0Var;
        if ((i & 24576) == 0) {
            j2iVar2 = j2iVar;
            if (x340Var.i(j2iVar2)) {
                i8 = TlsSocketProvider.READ_BUFFER_SIZE;
            } else {
                i8 = SemanticState.Multiline;
            }
            i3 |= i8;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i9 != 0) {
                tl3Var4 = een.d;
            } else {
                tl3Var4 = tl3Var2;
            }
            if (i10 != 0) {
                j2 = 0;
            }
            if (i4 != 0) {
                function1 = null;
            }
            if (i6 != 0) {
                nfv0Var4 = new nfv0(31, false, false, false);
            } else {
                nfv0Var4 = nfv0Var2;
            }
            short s8 = nfv0Var4.g;
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zG = x340Var.g((Object) null) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | z2 | x340Var.e(s8);
            objT = x340Var.T();
            if (zG) {
                objT = new dm3(tl3Var4, j2);
                x340Var.s0(objT);
            } else {
                objT = new dm3(tl3Var4, j2);
                x340Var.s0(objT);
            }
            Function0 function10 = function1;
            a((dm3) objT, function10, nfv0Var4, j2iVar2, x340Var, (i3 >> 3) & 8176, 0);
            nfv0Var3 = nfv0Var4;
            function2 = function10;
            tl3Var3 = tl3Var4;
        } else {
            x340Var.b0();
            tl3Var3 = tl3Var2;
            function2 = function1;
            nfv0Var3 = nfv0Var2;
        }
        j3 = j2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.my4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sy4.b(tl3Var3, j3, function2, nfv0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & SemanticState.Multiline) == 0) ? false : true;
    }
}
