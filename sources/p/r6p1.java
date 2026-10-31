package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class r6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(mhh mhhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, List list, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(665251143);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(mhhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.g(list) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var2.i(vu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            String str = mhhVar.a;
            boolean zG = x340Var2.g(str);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG2 = x340Var2.g(str);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Boolean bool = Boolean.TRUE;
            boolean zI = x340Var2.i(mhhVar) | x340Var2.i(ven0Var2);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new pid(mhhVar, ven0Var2, (lnm) null, (byte) 26);
                x340Var2.s0(objT3);
            }
            qxd0.t(bool, x340Var2, (vu30) objT3);
            boolean zG3 = x340Var2.g(str);
            Object objT4 = x340Var2.T();
            if (zG3 || objT4 == m4cVar) {
                objT4 = kaa0.h(0L, x340Var2);
            }
            ven0 ven0Var3 = (ven0) objT4;
            boolean zG4 = x340Var2.g(str);
            Object objT5 = x340Var2.T();
            if (zG4 || objT5 == m4cVar) {
                objT5 = new idd1(new ukf(function3, (byte) 22));
                x340Var2.s0(objT5);
            }
            znb0 znb0Var = (znb0) objT5;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(2.0f, true, new um5(false));
            cvx cvxVar2 = cbx.b(x340Var2).b;
            boolean z = true;
            k5p1.d(qim0Var, d36Var, new d36(2.0f, true, new um5(false)), null, 0, 0, apo.r(559003628, new pih(mhhVar, function0, ven0Var, ven0Var3, ven0Var2, function1, function2), x340Var2), x340Var2, ((i3 >> 21) & 14) | 1572864, 56);
            x340Var = x340Var2;
            u201 u201Var = ((Boolean) ven0Var2.getValue()).booleanValue() ? (u201) znb0Var.getValue() : null;
            if (u201Var != null) {
                x340Var.i0(1520669961);
                long j = ((Offset) ven0Var3.getValue()).a;
                kfi1 kfi1Var = (kfi1) ven0Var.getValue();
                String str2 = kfi1Var != null ? kfi1Var.a : null;
                boolean zI2 = x340Var.i(ven0Var2);
                Object objT6 = x340Var.T();
                if (zI2 || objT6 == m4cVar) {
                    objT6 = new hnf(ven0Var2, (byte) 6);
                    x340Var.s0(objT6);
                }
                Function0 function4 = (Function0) objT6;
                boolean zI3 = x340Var.i(ven0Var2);
                if ((i3 & 3670016) != 1048576) {
                    z = false;
                }
                boolean zI4 = zI3 | z | x340Var.i(ven0Var);
                Object objT7 = x340Var.T();
                if (zI4 || objT7 == m4cVar) {
                    objT7 = new o0d(vu30Var, ven0Var2, ven0Var, (byte) 11);
                    x340Var.s0(objT7);
                }
                i(j, u201Var, list, str2, function4, (iu30) objT7, x340Var, (i3 >> 9) & 896);
                x340Var.r(false);
            } else {
                x340Var.i0(1521056283);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(mhhVar, function0, function1, function2, function3, list, vu30Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void b(yg1 yg1Var, af10 af10Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        boolean z;
        af10 af10Var2 = af10Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        fra fraVar = een.N0;
        nl3 nl3Var = een.P0;
        m4c m4cVar = fkj0.X;
        mh1 mh1Var = yg1Var.d;
        p10 p10Var = mh1Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1311806377);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(yg1Var) ? 4 : 2) | (x340Var.i(af10Var2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var, cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 1.0f), 16.0f);
            g36 g36Var = h36.c;
            mbh mbhVarA = jbh.a(g36Var, nl3Var, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            int i3 = i2;
            g36 g36Var2 = g36Var;
            uwo1.e(mh1Var.a, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.i0(-1264655397);
            Iterator it = mh1Var.b.iterator();
            int i4 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                nim0 nim0Var = nim0.a;
                isl islVar = isl.a;
                Iterator it2 = it;
                if (!zHasNext) {
                    x340Var.r(false);
                    if (p10Var.c.length() > 0) {
                        x340Var.i0(-548059378);
                        d36 d36Var = new d36(12.0f, true, new um5(false));
                        qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, u291.f(nim0Var, 1.0f));
                        jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                        hzj.A.getClass();
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(jw31VarA, x340Var, lljVar4);
                        nko1.H(xos0VarM2, x340Var, lljVar3);
                        x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar);
                        hux huxVarD = xxq0.d(p10Var.a);
                        uwr uwrVar2 = cbx.a;
                        qim0 qim0VarX2 = uyn1.x(u291.r(dug.f(nim0Var, cbx.a(x340Var).a.b.c(), er31.b(48.0f)), 48.0f), 12.0f);
                        int i5 = i3 & 896;
                        boolean z3 = i5 == 256;
                        Object objT = x340Var.T();
                        if (z3 || objT == m4cVar) {
                            iu30Var2 = iu30Var;
                            objT = new cr0(iu30Var2, (byte) 12);
                            x340Var.s0(objT);
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        x340 x340Var2 = x340Var;
                        w0h1.a(huxVarD, islVar, bin.x(qim0VarX2, false, null, null, null, (Function0) objT, 15), 0L, 0L, false, x340Var2, 56, 56);
                        String str = p10Var.c;
                        lee1 lee1Var = cbx.d(x340Var2).g;
                        boolean z4 = i5 == 256;
                        Object objT2 = x340Var2.T();
                        if (z4 || objT2 == m4cVar) {
                            objT2 = new cr0(iu30Var2, (byte) 13);
                            x340Var2.s0(objT2);
                        }
                        uwo1.e(str, bin.x(nim0Var, false, null, null, null, (Function0) objT2, 15), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                        x340Var = x340Var2;
                        z = true;
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var2 = iu30Var;
                        z = true;
                        x340Var.i0(-547191409);
                        x340Var.r(false);
                    }
                    x340Var.r(z);
                    break;
                }
                Object next = it2.next();
                int i6 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                lh1 lh1Var = (lh1) next;
                int i7 = i4;
                m4c m4cVar2 = m4cVar;
                int i8 = i3;
                d36 d36Var2 = new d36(12.0f, true, new um5(false));
                g36 g36Var3 = g36Var2;
                qim0 qim0VarZ2 = uyn1.z(0.0f, 12.0f, 1, u291.f(nim0Var, 1.0f));
                jw31 jw31VarA2 = ew31.a(d36Var2, fraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                p6p1.a(lh1Var, af10Var2, u291.r(nim0Var, 48.0f), x340Var, i8 & 112);
                String str2 = lh1Var.c;
                p10 p10Var2 = lh1Var.e;
                String str3 = p10Var2.c;
                String str4 = p10Var2.b;
                String str5 = p10Var2.a;
                mbh mbhVarA2 = jbh.a(g36Var3, nl3Var, x340Var, 0);
                nl3 nl3Var2 = nl3Var;
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar4);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar);
                String str6 = lh1Var.b;
                uwr uwrVar3 = cbx.a;
                x340 x340Var3 = x340Var;
                uwo1.e(str6, null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2042);
                x340 x340Var4 = x340Var3;
                if (str2.equals("")) {
                    x340Var4.i0(-198643934);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-198826524);
                    uwo1.e(str2, null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                    x340Var4 = x340Var4;
                    x340Var4.r(false);
                }
                x340Var4.r(true);
                op71.g(x340Var4, new wnb0(1.0f, true));
                if (str5.length() > 0) {
                    x340Var4.i0(366486095);
                    x340 x340Var5 = x340Var4;
                    w0h1.a(xxq0.d(str5), islVar, u291.r(nim0Var, 16.0f), xxq0.c(str4), 0L, false, x340Var5, 56, 48);
                    uwo1.e(str3, null, cbx.d(x340Var5).k, xxq0.c(str4), null, null, 0, false, null, 0, null, x340Var5, 0, 0, 2034);
                    x340Var = x340Var5;
                    x340Var.r(false);
                    m4cVar = m4cVar2;
                    i3 = i8;
                } else {
                    x340Var4.i0(366919692);
                    lee1 lee1Var2 = cbx.d(x340Var4).k;
                    i3 = i8;
                    boolean zE = ((i3 & 896) == 256) | x340Var4.e(i7);
                    Object objT3 = x340Var4.T();
                    if (zE) {
                        m4cVar = m4cVar2;
                    } else {
                        m4cVar = m4cVar2;
                        if (objT3 == m4cVar) {
                        }
                        x340 x340Var6 = x340Var4;
                        uwo1.e(str3, bin.x(nim0Var, false, null, null, null, (Function0) objT3, 15), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2040);
                        x340Var = x340Var6;
                        x340Var.r(false);
                    }
                    objT3 = new ck0(iu30Var, i7, (byte) 1);
                    x340Var4.s0(objT3);
                    x340 x340Var7 = x340Var4;
                    uwo1.e(str3, bin.x(nim0Var, false, null, null, null, (Function0) objT3, 15), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var7, 0, 0, 2040);
                    x340Var = x340Var7;
                    x340Var.r(false);
                }
                x340Var.r(true);
                af10Var2 = af10Var;
                g36Var2 = g36Var3;
                it = it2;
                i4 = i6;
                nl3Var = nl3Var2;
            }
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nh1(yg1Var, af10Var, iu30Var2, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(710931522);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = kaa0.h(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new f4g(ven0Var, (byte) 8);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zI2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new qih(function0, iu30Var, ven0Var);
                x340Var.s0(objT3);
            }
            d(0, (Function0) objT3, x340Var, null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rih(function0, iu30Var, qim0Var, i);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1140086833);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131954073);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, ldxVar, anm1.N("social_interactivity_comment_row_add_reaction", qim0Var3), null, gdxVarS, null, false, null, null, ndi.a, x340Var, 0, 6, 984);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 15);
        }
    }

    public static final void e(mhh mhhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, qim0 qim0Var, Function0 function5, List list, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Uri uri;
        Function0 function6;
        Function0 function7 = function4;
        String str = mhhVar.b;
        int i3 = mhhVar.g;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1065441013);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(mhhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(function7) ? 131072 : 65536;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= b0kVar2.i(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= b0kVar2.g(list) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= b0kVar2.i(vu30Var) ? 536870912 : 268435456;
        }
        if (b0kVar2.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            String strN0 = cwl1.n0(2131954074, new Object[]{str}, b0kVar2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            int i5 = i4;
            long jA = cbx.a(b0kVar2).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarN = anm1.N("social_interactivity_comment_row", dug.f(qim0VarF, jA, u5j1Var));
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function8 = hmb0.t1;
            if (z) {
                b0kVar2.l(function8);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 16.0f, 12.0f, 0.0f, 0.0f, 12);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function8);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            String str2 = mhhVar.c;
            if (str2 == null || (uri = Uri.parse(str2)) == null) {
                uri = Uri.EMPTY;
            }
            Uri uri2 = uri;
            uri2.getClass();
            bmq0.a(uri2, anm1.N("social_interactivity_comment_row_author", bin.x(qim0Var3, false, strN0, new pm31(0), null, function0, 9)), hcx.c, (String) null, str, 0L, 0L, false, b0kVar2, 384, 232);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var3, 12.0f));
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function6 = function8;
                b0kVar2.l(function6);
            } else {
                function6 = function8;
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarF3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function6);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarX = bin.x(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, strN0, new pm31(0), null, function0, 9);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM5 = b0kVar2.m();
            qim0 qim0VarE5 = zr7.E(b0kVar2, qim0VarX);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function6);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA3, b0kVar2, lljVar);
            nko1.H(xos0VarM5, b0kVar2, lljVar2);
            x0d.q(iHashCode5, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE5, b0kVar2, lljVar4);
            uwo1.e(str, null, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.a, null, null, 2, false, new zic0(1), 0, null, b0kVar2, 0, 0, 1714);
            uwo1.e(mhhVar.e, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, new zic0(1), 0, null, b0kVar2, 0, 0, 1778);
            b0kVar2.r(true);
            function7 = function4;
            f(function7, b0kVar2, (i5 >> 15) & 14);
            b0kVar2.r(true);
            String str3 = mhhVar.d;
            lee1 lee1Var = cbx.d(b0kVar2).j;
            long j = cbx.a(b0kVar2).b.a;
            cjc0 cjc0Var = i3 == 2 ? new cjc0(2) : bjc0.a;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            uwo1.e(str3, anm1.N("social_interactivity_comment_row_text", uyn1.B(qim0Var3, 0.0f, 4.0f, 16.0f, 0.0f, 9)), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, b0kVar2, 0, 0, 1712);
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            cvx cvxVar7 = cbx.b(b0kVar2).b;
            cvx cvxVar8 = cbx.b(b0kVar2).b;
            int i6 = i5 >> 3;
            int i7 = (i5 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168);
            int i8 = i5 >> 9;
            b0kVar2 = b0kVar2;
            a(mhhVar, function1, function2, function3, function5, list, vu30Var, uyn1.B(qim0VarF4, 0.0f, 4.0f, 12.0f, 12.0f, 1), b0kVar2, i7 | (57344 & i8) | (458752 & i8) | (i8 & 3670016));
            b0kVar2.r(true);
            b0kVar2.r(true);
            if (i3 == 1) {
                b0kVar2.i0(-504731433);
                qim0 qim0VarB2 = uyn1.B(u291.f(qim0Var3, 1.0f), cbx.b(b0kVar2).b.f, 0.0f, 0.0f, 0.0f, 14);
                avw0 avw0Var = cbx.b(b0kVar2).c;
                t1c.a(anm1.N("social_interactivity_comment_row_separator", dug.f(u291.h(qim0VarB2, 1.0f), cbx.a(b0kVar2).a.a.c(), u5j1Var)), b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-504414303);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(mhhVar, function0, function1, function2, function3, function7, qim0Var2, function5, list, vu30Var, i);
        }
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-549047308);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131954080);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function0), ldx.c, anm1.N("social_interactivity_comment_row_context_menu", nim0.a), null, yla.s(x340Var), null, false, null, null, ndi.c, x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 4, i, function0, false);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1334060086);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            qim0 qim0VarA = h2c.a.a(qim0Var2, een.h);
            uwr uwrVar = cbx.a;
            xto1.e(anm1.N("loading_progress_circle", uyn1.B(qim0VarA, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.f, 7)), 5, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var2, i, (byte) 28);
        }
    }

    public static final void h(List list, int i, String str, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        String strU;
        String str2;
        qim0 qim0VarB;
        qim0 qim0Var2;
        long jA;
        long j;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(625866174);
        j06 j06Var = ((x340) b0kVar3).a;
        int i3 = i2 | (b0kVar3.g(list) ? 4 : 2) | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | (b0kVar3.i(function1) ? 131072 : 65536) | (b0kVar3.i(qim0Var) ? 1048576 : 524288);
        if (b0kVar3.Y(i3 & 1, (i3 & 599187) != 599186)) {
            if (function0 != null) {
                strU = x0d.k(b0kVar3, 161979775, 2131954092, b0kVar3, false);
            } else {
                b0kVar3.i0(161982430);
                strU = cwl1.U(2131820627, i, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            }
            String strO0 = cwl1.o0(b0kVar3, 2131954075);
            ven0 ven0VarS = v8r.s(function1, b0kVar3);
            String str3 = strU;
            qim0 qim0Var3 = nim0.a;
            if (function0 != null) {
                b0kVar3.i0(726842304);
                b0kVar3.r(false);
                str2 = strO0;
                qim0VarB = bin.z(qim0Var3, new pm31(0), str2, function1, function0, 227);
            } else {
                str2 = strO0;
                b0kVar3.i0(727015005);
                boolean zI = b0kVar3.i(ven0VarS);
                Object objT = b0kVar3.T();
                if (zI || objT == m4cVar) {
                    objT = new p6b(ven0VarS, (byte) 2);
                    b0kVar3.s0(objT);
                }
                qim0VarB = f8d1.b(qim0Var3, rih1.a, (PointerInputEventHandler) objT);
                b0kVar3.r(false);
            }
            cr31 cr31Var = er31.a;
            boolean zG = b0kVar3.g(str3) | ((i3 & 57344) == 16384) | b0kVar3.g(str2) | ((i3 & 458752) == 131072);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                qim0Var2 = qim0Var3;
                ggh gghVar = new ggh(str3, function0, str2, function1, (byte) 3);
                b0kVar3.s0(gghVar);
                objT2 = gghVar;
            } else {
                qim0Var2 = qim0Var3;
            }
            qim0 qim0VarThen = s161.a(qim0Var, (iu30) objT2).then(qim0VarB);
            if (z) {
                b0kVar3.i0(162021122);
                uwr uwrVar = cbx.a;
                jA = cbx.a(b0kVar3).a.b.a();
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(162021641);
                b0kVar3.r(false);
                jA = u7h.j;
            }
            qim0 qim0VarF = dug.f(qim0VarThen, jA, cr31Var);
            uwr uwrVar2 = cbx.a;
            avw0 avw0Var = cbx.b(b0kVar3).c;
            qqb qqbVarD = k1u.d(1.0f, cbx.a(b0kVar3).a.a.c());
            qim0 qim0VarF2 = d1u.F(qim0VarF, qqbVarD.a, qqbVarD.b, cr31Var);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            qim0 qim0VarA = uyn1.A(qim0VarF2, 8.0f, 8.0f, 12.0f, 8.0f);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            jw31 jw31VarA2 = ew31.a(gex0Var, een.Z, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0Var2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            b0kVar3.i0(626433052);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                uwr uwrVar3 = cbx.a;
                b0k b0kVar4 = b0kVar3;
                uwo1.e(str4, null, cbx.d(b0kVar3).j, 0L, null, null, 0, false, null, 0, null, b0kVar4, 0, 0, 2042);
                b0kVar3 = b0kVar4;
            }
            b0k b0kVar5 = b0kVar3;
            b0kVar5.r(false);
            b0kVar5.r(true);
            uwr uwrVar4 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar5).k;
            if (z) {
                b0kVar5.i0(490231582);
                j = cbx.a(b0kVar5).b.a;
            } else {
                b0kVar5.i0(490232577);
                j = cbx.a(b0kVar5).b.b;
            }
            b0kVar5.r(false);
            uwo1.e(str, null, lee1Var, j, null, null, 0, false, null, 0, null, b0kVar5, (i3 >> 6) & 14, 0, 2034);
            b0kVar2 = b0kVar5;
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(list, i, str, z, function0, function1, qim0Var, i2);
        }
    }

    public static final void i(long j, u201 u201Var, List list, String str, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        u201 u201Var2;
        List list2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1323135474);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            u201Var2 = u201Var;
            i2 |= x340Var.i(u201Var2) ? 32 : 16;
        } else {
            u201Var2 = u201Var;
        }
        if ((i & 384) == 0) {
            list2 = list;
            i2 |= x340Var.g(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            sy4.b((tl3) null, 0L, function0, new nfv0(30, true, false, false), apo.r(1964599601, new uih(function0, j, (hdn0) objT2, hdn0Var, u201Var2, list2, str2, iu30Var), x340Var), x340Var, ((i2 >> 6) & 896) | 24576, 3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo1(j, u201Var, list, str, function0, iu30Var, i, (byte) 1);
        }
    }

    public static final void j(guk1 guk1Var, qim0 qim0Var, b0k b0kVar, int i) {
        guk1 guk1Var2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1733011506);
        int i2 = i | (b0kVar2.g(guk1Var) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            long jB = u7h.b(u7h.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
            cr31 cr31VarB = er31.b(10.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.w(dug.f(qim0Var3, jB, cr31VarB), 160.0f, 280.0f), 20.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
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
            cso1.f(x7v.a(guk1Var.b, b0kVar2), isl.a, null, null, null, b0kVar2, 56, 60);
            String str = guk1Var.a;
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 16.0f, 5);
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var3;
            uwo1.e(str, qim0VarB, cbx.d(b0kVar2).k, 0L, new a0e1(3), null, 2, false, cjc0Var, 0, null, b0kVar2, 1572864, 0, 1704);
            b0kVar2 = b0kVar2;
            qim0 qim0VarX2 = u291.x(0.0f, 120.0f, 1, qim0Var2);
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarQ = i1p1.q(qim0VarX2, er31.b(8.0f));
            long j = cbx.a(b0kVar2).b.c;
            long j2 = u7h.f;
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z || objT == m4cVar) {
                guk1Var2 = guk1Var;
                objT = new vwz0(guk1Var2, (byte) 29);
                b0kVar2.s0(objT);
            } else {
                guk1Var2 = guk1Var;
            }
            Function0 function0 = (Function0) objT;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = i021.h;
                b0kVar2.s0(objT2);
            }
            rhx0.c(function0, qim0VarQ, j, j2, 2, 0.0f, (iu30) objT2, b0kVar2, 1772544, 0);
            b0kVar2.r(true);
        } else {
            guk1Var2 = guk1Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(guk1Var2, qim0Var2, i, (byte) 14);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1107770033);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131954089);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldx.c, anm1.N("social_interactivity_comment_row_reply", qim0Var), null, yla.s(x340Var), null, null, null, null, null, ndi.b, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var, i, (byte) 16);
        }
    }

    public static final void l(j681 j681Var, String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-89713825);
        int i2 = (b0kVar3.i(j681Var) ? 4 : 2) | i | (b0kVar3.g(str) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("show_generation_row_artwork", nim0.a);
            String str2 = j681Var.c;
            if (str2 == null || ihc1.y0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                b0kVar3.i0(-1194665094);
                Uri uri = Uri.parse(str2);
                jsl jslVar = new jsl(str);
                b0kVar2 = b0kVar3;
                mrx mrxVar = mrx.c;
                eso1.e(uri, jslVar, qim0VarN, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(mrxVar, mrxVar), false, false, b0kVar2, 1073741824, 0, 3576);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-1194429308);
                eso1.h(hso1.G(mrx.c, 0L, 0L, b0kVar2, mrx.d, 30), new jsl(str), qim0VarN, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar3, 8, 504);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(j681Var, str, i, (byte) 1);
        }
    }

    public static final void m(j681 j681Var, Function0 function0, Function0 function1, qim0 qim0Var, i681 i681Var, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        Function0 function3;
        b0k b0kVar2;
        qim0 qim0Var2;
        i681 i681Var2;
        i681 i681Var3;
        qim0 qim0Var3;
        String str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1721564823);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(j681Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function0;
            i2 |= b0kVar3.i(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            function3 = function1;
            i2 |= b0kVar3.i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                i681Var3 = new i681(cwl1.o0(b0kVar3, 2131952938), cwl1.o0(b0kVar3, 2131952937), cwl1.o0(b0kVar3, 2131952939), cwl1.o0(b0kVar3, 2131952940), cwl1.o0(b0kVar3, 2131952941));
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
                i681Var3 = i681Var;
            }
            b0kVar3.s();
            int iC = l1d.C(j681Var.e);
            if (iC == 0) {
                str = i681Var3.a;
            } else if (iC == 1) {
                str = i681Var3.b;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                str = i681Var3.c;
            }
            String str2 = j681Var.b;
            if (ihc1.y0(str2)) {
                str2 = str;
            }
            i681 i681Var4 = i681Var3;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("show_generation_row", qim0Var3), new uvx(ngx.e, 3, (tvx) null, (p3v) null, 25), null, false, null, null, null, null, null, apo.r(550131730, new rt11(j681Var, str2, (byte) 22), b0kVar3), null, apo.r(-1034785487, new iww0(str, (byte) 27), b0kVar3), apo.r(-1450112304, new kj21(j681Var, i681Var4, function2, function3, (byte) 11), b0kVar3), null, null, apo.r(1598874541, new k681(j681Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 197040, 26108);
            qim0Var2 = qim0Var3;
            i681Var2 = i681Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            i681Var2 = i681Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(j681Var, function0, function1, false, qim0Var2, i681Var2, i, (byte) 3);
        }
    }

    public static final void n(String str, String str2, Function0 function0, boolean z, b0k b0kVar, int i, int i2) {
        boolean z2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1566090538);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (x340Var.h(z2) ? 2048 : 1024);
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = i5 != 0 ? true : z2;
            if (ihc1.y0(str)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), ldx.c, anm1.N(str2, nim0.a), z3 ? jax.a : new hax(str), yla.s(x340Var).a(), null, null, null, null, null, apo.r(-662699189, new nl41(str, (byte) 13), x340Var), x340Var, 0, 48, 1992);
            z2 = z3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i621(str, str2, function0, z2, i, i2);
        }
    }

    public static final void o(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1918237947);
        int i4 = (x340Var.h(z) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = uyn1.y(qim0Var, cbx.b(x340Var).b.b, cbx.b(x340Var).b.d);
            era eraVar = een.P0;
            boolean z2 = (i4 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new mj10((byte) 28, z);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarY, null, null, false, null, eraVar, null, false, null, (iu30) objT, x340Var, 0, 478);
            i3 = 3;
        } else {
            x340Var.b0();
            i3 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt9(z, qim0Var, i3, i2);
        }
    }

    public static final uo5 p(ya yaVar, ya yaVar2) {
        uo5 uo5Var = new uo5(new tve0(yaVar), (byte) 16);
        uo5Var.c = new uo5(yaVar2);
        return new uo5(uo5Var);
    }

    public static final void q(View view) {
        view.setBackgroundTintMode(PorterDuff.Mode.CLEAR);
        view.setBackgroundTintList(ColorStateList.valueOf(0));
        view.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(view);
        bottomSheetBehaviorZ.L(3);
        bottomSheetBehaviorZ.E = true;
    }

    public static final f4n1 r() {
        return new f4n1();
    }

    public static l7m0 s(Context context, String str) {
        uq8 uq8Var = cj4.b;
        File file = new File(context.getDir("remote-config", 0), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new l7m0(new cj4(file), (byte) 20);
    }

    public static ksk0 t(String str, String str2) {
        return new ksk0(str, str2, (byte) 2);
    }

    public static final uo5 u(ya yaVar, ya yaVar2) {
        uo5 uo5Var = new uo5(new tve0(yaVar), (byte) 16);
        uo5Var.d = new uo5(yaVar2);
        return new uo5(uo5Var);
    }

    public static final boolean v(a8b0 a8b0Var) {
        beg begVarS = a8b0Var.t0().s();
        if (begVarS != null) {
            if (vf80.a(begVarS) && vf80.b(begVarS) && !kht.g(begVarS).equals(sfb1.h)) {
                return true;
            }
            beg begVarS2 = a8b0Var.t0().s();
            if (begVarS2 != null && (begVarS2 instanceof beg) && (begVarS2.Q() instanceof brm0) && !o1h1.e(a8b0Var)) {
                return true;
            }
        }
        y0h1 y0h1VarS = a8b0Var.t0().s();
        y0h1 y0h1Var = y0h1VarS instanceof y0h1 ? y0h1VarS : null;
        return y0h1Var != null && v(rzn1.v(y0h1Var));
    }

    public static void w(View view) {
        nda ndaVar;
        if (view.isInEditMode()) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                w(viewGroup.getChildAt(i));
            }
            return;
        }
        if ((view instanceof TextView) && (ndaVar = (nda) view.getTag(2131427696)) != null) {
            TextView textView = (TextView) view;
            int i2 = ndaVar.a ? -((int) Math.ceil(Math.abs(textView.getPaint().getFontMetrics().ascent))) : 0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            Integer num = (Integer) textView.getTag(2131427698);
            int iIntValue = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin;
            if (num == null) {
                textView.setTag(2131427698, Integer.valueOf(iIntValue));
            } else {
                iIntValue = num.intValue();
            }
            marginLayoutParams.topMargin = iIntValue + i2;
            i = ndaVar.b ? -((int) Math.ceil(Math.abs(textView.getPaint().getFontMetrics().descent))) : 0;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            Integer num2 = (Integer) textView.getTag(2131427697);
            int iIntValue2 = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin;
            if (num2 == null) {
                textView.setTag(2131427697, Integer.valueOf(iIntValue2));
            } else {
                iIntValue2 = num2.intValue();
            }
            marginLayoutParams2.bottomMargin = iIntValue2 + i;
        }
    }

    public static void x(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                nda ndaVar = (nda) textView.getTag(2131427696);
                if (ndaVar == null) {
                    ndaVar = new nda();
                    textView.setTag(2131427696, ndaVar);
                }
                ndaVar.b = true;
            }
        }
    }

    public static void y(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (!textView.isInEditMode()) {
                nda ndaVar = (nda) textView.getTag(2131427696);
                if (ndaVar == null) {
                    ndaVar = new nda();
                    textView.setTag(2131427696, ndaVar);
                }
                ndaVar.a = true;
            }
        }
    }
}
