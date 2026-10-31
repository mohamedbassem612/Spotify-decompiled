package p;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class op71 {
    public static final tw20 a = new tw20((byte) 15);
    public static b180 b;

    public static final qku A(faa0 faa0Var, boolean z, iaa0 iaa0Var) {
        return faa0Var instanceof saa0 ? ((saa0) faa0Var).k0(z, iaa0Var) : faa0Var.F(iaa0Var.k(), z, new v6a(1, iaa0Var, iaa0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 6));
    }

    public static qku B(faa0 faa0Var, iaa0 iaa0Var) {
        return A(faa0Var, true, iaa0Var);
    }

    public static final boolean C(o8n o8nVar) {
        faa0 faa0VarA = o8nVar.A(fkj0.W0);
        if (faa0VarA != null) {
            return faa0VarA.isActive();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EventSource D(Observable observable) {
        return RxEventSources.a(new ObservableSource[]{observable});
    }

    public static de70 E(de70 de70Var) {
        tw20 tw20Var = a;
        if (de70Var == tw20Var) {
            return tw20Var;
        }
        return de70Var instanceof ce70 ? de70Var : new ce70(de70Var);
    }

    public static final of01 F(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new of01();
            x340Var.s0(objT);
        }
        return (of01) objT;
    }

    public static final ArrayList G(ArrayList arrayList) {
        v9x0 v9x0Var;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            if (!(((v9x0) obj) instanceof zbx0) || ((v9x0Var = (v9x0) o7h.t0(i2, arrayList)) != null && !(v9x0Var instanceof zbx0))) {
                arrayList2.add(obj);
            }
            i = i2;
        }
        return arrayList2;
    }

    public static final void H(ConstraintLayout constraintLayout, iu30 iu30Var) {
        kil kilVar = new kil();
        kilVar.f(constraintLayout);
        iu30Var.invoke(kilVar);
        kilVar.b(constraintLayout);
    }

    public static final void a(c380 c380Var, qim0 qim0Var, lee1 lee1Var, long j, float f, b0k b0kVar, int i, int i2) {
        int i3;
        lee1 lee1Var2;
        float f2;
        long j2;
        lee1 lee1Var3;
        float f3;
        lee1 lee1Var4;
        long j3;
        lee1 lee1Var5;
        float f4;
        int i4;
        Function0 function0;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1563725932);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                lee1Var2 = lee1Var;
                int i5 = x340Var.i(lee1Var2) ? 256 : 128;
                i3 |= i5;
            } else {
                lee1Var2 = lee1Var;
            }
            i3 |= i5;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && x340Var.f(j)) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f2 = f;
                int i6 = x340Var.d(f2) ? 16384 : 8192;
                i3 |= i6;
            } else {
                f2 = f;
            }
            i3 |= i6;
        } else {
            f2 = f;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 4) != 0) {
                    uwr uwrVar = cbx.a;
                    lee1Var4 = cbx.d(x340Var).g;
                    i3 &= -897;
                } else {
                    lee1Var4 = lee1Var2;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar2 = cbx.a;
                    j3 = cbx.a(x340Var).b.a;
                    i3 &= -7169;
                } else {
                    j3 = j;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    i3 &= -57345;
                    f2 = 8.0f;
                }
                int i7 = i3;
                lee1Var5 = lee1Var4;
                f4 = f2;
                i4 = i7;
            } else {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                f4 = f2;
                i4 = i3;
                lee1Var5 = lee1Var2;
                j3 = j;
            }
            x340Var.s();
            boolean z = (i4 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new xr1(c380Var, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            mbh mbhVarA = jbh.a(new d36(f4, true, new um5(false)), een.P0, x340Var, 0);
            lee1 lee1Var6 = lee1Var5;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            x0d.q(iHashCode, x340Var, lljVar, x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE, vu30Var, -1775177435, c380Var);
            int i8 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) next;
                float f5 = p3v.b(f4, 0.0f) > 0 ? 2.0f : 0.0f;
                nim0 nim0Var = nim0.a;
                Iterator it = itN;
                qim0 qim0VarZ = uyn1.z(0.0f, f5, 1, nim0Var);
                boolean zE = x340Var.e(i8);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new uv4(i8, (byte) 7);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarB2 = s161.b(qim0VarZ, true, (iu30) objT2);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                Function0 function2 = function1;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB3 = uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = iub.W0;
                    x340Var.s0(objT3);
                }
                x340 x340Var2 = x340Var;
                int i10 = i4;
                uwo1.e("•", s161.a(qim0VarB3, (iu30) objT3), lee1Var6, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, (i4 & 896) | 6 | (i4 & 7168), 0, 2032);
                uwo1.e(str, new wnb0(1.0f, true), lee1Var6, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i10 & 8064, 0, 2032);
                x340Var = x340Var2;
                x340Var.r(true);
                i4 = i10;
                function1 = function0;
                i8 = i9;
                vu30Var = vu30Var;
                itN = it;
            }
            x340Var.r(false);
            x340Var.r(true);
            f3 = f4;
            lee1Var3 = lee1Var6;
            j2 = j3;
        } else {
            x340Var.b0();
            j2 = j;
            lee1Var3 = lee1Var2;
            f3 = f2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kcc(c380Var, qim0Var, lee1Var3, j2, f3, i, i2);
        }
    }

    public static final void b(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-143689681);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wro1.h(new gbx(z50.c, function0), ldx.c, anm1.N("go-to-profile-context-menu-button-test-tag", nim0.a), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1333161030, new dz40(str, (byte) 0), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 8);
        }
    }

    public static final void c(bjk1 bjk1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        o95 o95Var;
        Object obj;
        jsq0 jsq0Var = jsq0.b;
        ksq0 ksq0Var = ksq0.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(427736172);
        int i2 = (x340Var.i(ksq0Var) ? 256 : 128) | (x340Var.g(bjk1Var) ? 4 : 2) | i | (x340Var.i(jsq0Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(bjk1Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            int i3 = i2 & 14;
            ven0 ven0VarS = v8r.s(bjk1Var, x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = c97.b(1.0f);
                x340Var.s0(objT2);
            }
            o95 o95Var2 = (o95) objT2;
            Object obj2 = jsq0Var.get(bjk1Var);
            int i4 = i2 & 112;
            boolean zI = (i4 == 32) | x340Var.i(ven0Var) | x340Var.i(obj2) | ((i2 & 896) == 256) | x340Var.i(ven0VarS) | x340Var.i(o95Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                o95Var = o95Var2;
                obj = obj2;
                k1e0 k1e0Var = new k1e0(obj, o95Var, ven0Var, ven0VarS, (lnm) null);
                x340Var.s0(k1e0Var);
                objT3 = k1e0Var;
            } else {
                obj = obj2;
                o95Var = o95Var2;
            }
            qxd0.t(obj, x340Var, (vu30) objT3);
            boolean zI2 = (i4 == 32) | x340Var.i(ven0Var) | x340Var.i(obj) | (i3 == 4);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new rwm0(obj, bjk1Var, ven0Var, (lnm) null);
                x340Var.s0(objT4);
            }
            qxd0.t(bjk1Var, x340Var, (vu30) objT4);
            qim0 qim0VarK = d9y0.k(qim0Var, ((Number) o95Var.e()).floatValue());
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
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
            j2iVar.invoke(ven0Var.getValue(), x340Var, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(bjk1Var, qim0Var, j2iVar, i);
        }
    }

    public static final void d(String str, String str2, boolean z, String str3, boolean z2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(271289807);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("go-to-profile-row-test-tag", qim0Var3);
            boolean z3 = (i3 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (z2) {
                b0kVar3.i0(-1132762220);
                j2iVarR = apo.r(-1235620759, new jpy(str2, iu30Var, (byte) 1), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1132664291);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            j2i j2iVar = j2iVarR;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(1214575321, new go7(str3, str, str2, (byte) 2), b0kVar3), (xu30) null, (xu30) null, apo.r(2140826007, new aw1((byte) 28, z), b0kVar3), j2iVar, (xu30) null, (xu30) null, apo.r(1194354707, new z3y(str2, (byte) 9), b0kVar3), b0kVar2, 100663296, 196656, 26302);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ez40(str, str2, z, str3, z2, iu30Var, qim0Var2, i);
        }
    }

    public static final gaa0 e(faa0 faa0Var) {
        return new gaa0(faa0Var);
    }

    public static gaa0 f() {
        return new gaa0((faa0) null);
    }

    public static final void g(b0k b0kVar, qim0 qim0Var) {
        d7x d7xVar = d7x.e;
        x340 x340Var = (x340) b0kVar;
        int iHashCode = Long.hashCode(x340Var.T);
        qim0 qim0VarE = zr7.E(b0kVar, qim0Var);
        xos0 xos0VarM = x340Var.m();
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar;
        if (x340Var2.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(hmb0.t1);
        } else {
            x340Var2.v0();
        }
        nko1.H(d7xVar, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        x340Var2.r(true);
    }

    public static final void h(mbl1 mbl1Var, u7h u7hVar, lee1 lee1Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        lee1 lee1Var2;
        lee1 lee1Var3;
        int i2 = mbl1Var.c;
        String str = mbl1Var.a;
        tr80 tr80Var = mbl1Var.b;
        int i3 = ((rr80) tr80Var).b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1729955982);
        int i4 = i | (b0kVar3.g(mbl1Var) ? 4 : 2) | (b0kVar3.g(u7hVar) ? 256 : 128) | 1024;
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                uwr uwrVar = cbx.a;
                lee1Var3 = cbx.d(b0kVar3).c;
            } else {
                b0kVar3.b0();
                lee1Var3 = lee1Var;
            }
            b0kVar3.s();
            b0kVar3.i0(-335346876);
            ye5 ye5Var = new ye5();
            ye5Var.g(str);
            uwr uwrVar2 = cbx.a;
            ye5Var.d(new zma1(cbx.a(b0kVar3).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), 0, str.length());
            ye5Var.d(new zma1(cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), Integer.valueOf(((rr80) tr80Var).a).intValue(), Integer.valueOf(i3).intValue());
            if (i2 != -1 && u7hVar != null) {
                ye5Var.d(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, u7hVar.a, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63487), i2, Integer.valueOf(i3).intValue() + 1);
            }
            af5 af5VarP = ye5Var.p();
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            lee1 lee1Var4 = lee1Var3;
            uwo1.d(af5VarP, cbx.a(b0kVar3).b.b, nim0.a, lee1Var4, new a0e1(5), (iu30) null, 0, false, bjc0.a, 0, (qx8) null, (cqs0) null, b0kVar2, 100663680, 0, 3808);
            lee1Var2 = lee1Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            lee1Var2 = lee1Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(mbl1Var, u7hVar, lee1Var2, i, (byte) 29);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(751251565);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | 48;
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), ((vex) zex.a.e).i, d4o1.a);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var2, 2131963879), new wnb0(1.0f, true), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, bjc0.a, 0, (qx8) null, x340Var2, 0, 0, 1712);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            g(x340Var2, u291.v(qim0Var2, 12.0f));
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var2);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new tpj1(function0, (byte) 22);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, (qim0) null, jax.a, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, gsj.a, x340Var2, 0, 48, 1996);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 15);
        }
    }

    public static final wlb0 j(xly xlyVar) {
        if (xlyVar.equals(vly.a)) {
            return ulb0.a;
        }
        if (!(xlyVar instanceof wly)) {
            eg.o();
            return null;
        }
        int iC = l1d.C(((wly) xlyVar).a);
        int i = 1;
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return null;
            }
            i = 2;
        }
        return new vlb0(i);
    }

    public static final void k(kg kgVar, v161 v161Var) {
        o161 o161Var = v161Var.d;
        nen0 nen0Var = o161Var.a;
        Object objG = o161Var.a.g(z161.z);
        if (objG == null) {
            objG = null;
        }
        pm31 pm31Var = (pm31) objG;
        if (v161Var.k().a.c(z161.j)) {
            return;
        }
        if (pm31Var != null && pm31Var.a == 8) {
            return;
        }
        Object objG2 = nen0Var.g(m161.y);
        if (objG2 == null) {
            objG2 = null;
        }
        we weVar = (we) objG2;
        if (weVar != null) {
            kgVar.b(new fg(R.id.accessibilityActionPageUp, weVar.a));
        }
        Object objG3 = nen0Var.g(m161.A);
        if (objG3 == null) {
            objG3 = null;
        }
        we weVar2 = (we) objG3;
        if (weVar2 != null) {
            kgVar.b(new fg(R.id.accessibilityActionPageDown, weVar2.a));
        }
        Object objG4 = nen0Var.g(m161.z);
        if (objG4 == null) {
            objG4 = null;
        }
        we weVar3 = (we) objG4;
        if (weVar3 != null) {
            kgVar.b(new fg(R.id.accessibilityActionPageLeft, weVar3.a));
        }
        Object objG5 = nen0Var.g(m161.B);
        we weVar4 = (we) (objG5 != null ? objG5 : null);
        if (weVar4 != null) {
            kgVar.b(new fg(R.id.accessibilityActionPageRight, weVar4.a));
        }
    }

    public static final void l(ConstraintLayout constraintLayout, View view, int i, int i2, iu30 iu30Var) {
        qhl qhlVar = new qhl(i, i2);
        iu30Var.invoke(qhlVar);
        constraintLayout.addView(view, qhlVar);
    }

    public static final void m(o8n o8nVar, CancellationException cancellationException) {
        faa0 faa0VarA = o8nVar.A(fkj0.W0);
        if (faa0VarA != null) {
            faa0VarA.d(cancellationException);
        }
    }

    public static void n(o8n o8nVar) {
        m(o8nVar, null);
    }

    public static void o(faa0 faa0Var, String str) {
        faa0Var.d(lgo1.b(str, (Throwable) null));
    }

    public static final Object p(faa0 faa0Var, lnm lnmVar) {
        faa0Var.d((CancellationException) null);
        Object objJ = faa0Var.j(lnmVar);
        return objJ == d9n.a ? objJ : rih1.a;
    }

    public static final void q(o8n o8nVar, CancellationException cancellationException) {
        faa0 faa0VarA = o8nVar.A(fkj0.W0);
        if (faa0VarA != null) {
            Iterator it = faa0VarA.a().iterator();
            while (it.hasNext()) {
                ((faa0) it.next()).d(cancellationException);
            }
        }
    }

    public static void r(o8n o8nVar) {
        q(o8nVar, null);
    }

    public static void s(j0d1 j0d1Var) {
        r561 r561VarA = j2h1.A((vu30) ((i46) j0d1Var.a()).b);
        while (r561VarA.hasNext()) {
            ((faa0) r561VarA.next()).d((CancellationException) null);
        }
    }

    public static final void t(View view, kil kilVar) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        kilVar.g(view.getId(), 3, viewGroup.getId(), 3);
        kilVar.g(view.getId(), 4, viewGroup.getId(), 4);
    }

    public static de70 u(de70 de70Var, de70 de70Var2) {
        de70Var.getClass();
        de70Var2.getClass();
        tw20 tw20Var = a;
        if (de70Var == tw20Var) {
            return de70Var2;
        }
        return de70Var2 == tw20Var ? de70Var : new uk4(de70Var, de70Var2, (byte) 29);
    }

    public static Bundle v(ujt ujtVar) {
        Bundle bundle = new Bundle();
        bundle.putString("MAGIC_LINK_USERNAME", ujtVar.a);
        bundle.putString("MAGIC_LINK_TOKEN", ujtVar.b);
        bundle.putString("MAGIC_LINK_FLOW", ujtVar.c);
        return bundle;
    }

    public static final qku w(faa0 faa0Var, qku qkuVar) {
        return A(faa0Var, true, new alu(qkuVar));
    }

    public static final void x(o8n o8nVar) {
        faa0 faa0VarA = o8nVar.A(fkj0.W0);
        if (faa0VarA != null) {
            y(faa0VarA);
        }
    }

    public static final void y(faa0 faa0Var) {
        if (!faa0Var.isActive()) {
            throw faa0Var.g();
        }
    }

    public static final faa0 z(o8n o8nVar) {
        faa0 faa0VarA = o8nVar.A(fkj0.W0);
        if (faa0VarA != null) {
            return faa0VarA;
        }
        hhg1.o(o8nVar, "Current context doesn't contain Job in it: ");
        return null;
    }
}
