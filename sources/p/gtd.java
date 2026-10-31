package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gtd extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gtd(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        vif vifVar = (vif) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        xif xifVar = (xif) this.b;
        w4i1 w4i1Var = xifVar.f;
        ic9 ic9Var = xifVar.a;
        Context context = (Context) ic9Var.b;
        fjf fjfVar = new fjf(w4i1Var.b, xifVar.c.f());
        int i = (iIntValue & 896) ^ 384;
        boolean z = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new c5a(iu30Var, (byte) 19);
            x340Var2.s0(objT);
        }
        oto1.a(fjfVar, (iu30) objT, (qim0) null, x340Var2, 0);
        int i2 = vifVar.a;
        byte b = 5;
        if (i2 == 0) {
            x340Var2.i0(-2033673243);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-2033673242);
            int iC = l1d.C(i2);
            if (iC == 0) {
                x340Var2.i0(144016456);
                String str = w4i1Var.b;
                boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new ggf(iu30Var, (byte) 4);
                    x340Var2.s0(objT2);
                }
                ic9Var.q(context.getString(2131953679, str), (Function0) objT2);
                x340Var2.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var2, 144014756, false);
                }
                x340Var2.i0(144020421);
                String str2 = w4i1Var.b;
                boolean z3 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT3 = x340Var2.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new ggf(iu30Var, b);
                    x340Var2.s0(objT3);
                }
                ic9Var.q(context.getString(2131953692, str2), (Function0) objT3);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        }
        int i3 = vifVar.b;
        if (i3 == 0) {
            x340Var2.i0(-2033303444);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-2033303443);
            int iC2 = l1d.C(i3);
            if (iC2 == 0) {
                x340Var2.i0(-1781479582);
                String str3 = w4i1Var.b;
                boolean z4 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT4 = x340Var2.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new ggf(iu30Var, (byte) 6);
                    x340Var2.s0(objT4);
                }
                Function0 function0 = (Function0) objT4;
                boolean z5 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT5 = x340Var2.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new ggf(iu30Var, (byte) 7);
                    x340Var2.s0(objT5);
                }
                r2p1.f(str3, function0, (Function0) objT5, x340Var2, 0);
                x340Var2.r(false);
            } else if (iC2 == 1) {
                x340Var2.i0(608985506);
                b7b b7bVar = xifVar.b;
                String str4 = w4i1Var.b;
                boolean zI = ((i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(xifVar);
                Object objT6 = x340Var2.T();
                if (zI || objT6 == m4cVar) {
                    objT6 = new ame(iu30Var, xifVar, b);
                    x340Var2.s0(objT6);
                }
                Function0 function1 = (Function0) objT6;
                boolean z6 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT7 = x340Var2.T();
                if (z6 || objT7 == m4cVar) {
                    objT7 = new ggf(iu30Var, (byte) 8);
                    x340Var2.s0(objT7);
                }
                b7bVar.a(str4, function1, (Function0) objT7, x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (iC2 != 2) {
                    throw p3d1.k(x340Var2, -1781480778, false);
                }
                x340Var2.i0(-1781455614);
                String str5 = w4i1Var.b;
                boolean z7 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT8 = x340Var2.T();
                if (z7 || objT8 == m4cVar) {
                    objT8 = new ggf(iu30Var, (byte) 9);
                    x340Var2.s0(objT8);
                }
                Function0 function2 = (Function0) objT8;
                boolean z8 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT9 = x340Var2.T();
                if (z8 || objT9 == m4cVar) {
                    objT9 = new ggf(iu30Var, (byte) 10);
                    x340Var2.s0(objT9);
                }
                yto1.a(str5, function2, (Function0) objT9, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        njf njfVar = (njf) this.b;
        boolean zG = njfVar.d.a.g(njfVar.a);
        boolean zF = njfVar.c.f();
        kjf kjfVar = ((jjf) obj2).a;
        boolean z = true;
        if (kjfVar instanceof kjf) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1413724621);
            kjf kjfVar2 = kjfVar;
            rjf rjfVar = new rjf(kjfVar2.a, zG, kjfVar2.b, zF);
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new c5a(iu30Var, (byte) 20);
                x340Var2.s0(objT);
            }
            sto1.b(rjfVar, (iu30) objT, (qim0) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (!(kjfVar instanceof ljf)) {
                throw p3d1.k(x340Var, -1413725763, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1413701000);
            sjf sjfVar = new sjf(zG, ((ljf) kjfVar).a, zF);
            if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new c5a(iu30Var, (byte) 21);
                x340Var3.s0(objT2);
            }
            sto1.b(sjfVar, (iu30) objT2, (qim0) null, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 p.skf, still in use, count: 2, list:
          (r9v1 p.skf) from 0x016b: MOVE (r22v2 p.skf) = (r9v1 p.skf) (LINE:364)
          (r9v1 p.skf) from 0x015e: MOVE (r22v7 p.skf) = (r9v1 p.skf) (LINE:351)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object e(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gtd.e(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        enf enfVar = (enf) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        inf infVar = (inf) this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            x340Var.i0(91341941);
            boolean zI = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new bp9(ven0Var, (byte) 29);
                x340Var.s0(objT3);
            }
            infVar.f((iIntValue >> 3) & 112, (Function0) objT3, x340Var, iu30Var);
            x340Var.r(false);
        } else if (((Boolean) ven0Var2.getValue()).booleanValue()) {
            x340Var.i0(91347179);
            vmf vmfVar = infVar.d;
            boolean zI2 = x340Var.i(ven0Var2);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new hnf(ven0Var2, (byte) 0);
                x340Var.s0(objT4);
            }
            infVar.e(vmfVar, (Function0) objT4, iu30Var, x340Var, iIntValue & 896);
            x340Var.r(false);
        } else {
            x340Var.i0(-1463032540);
            x340Var.r(false);
        }
        boolean z = (enfVar.a && enfVar.b) ? false : true;
        hax haxVar = z ? new hax("Disabled") : jax.a;
        qim0 qim0VarK = d9y0.k(u291.f(nim0.a, 1.0f), z ? 0.5f : 1.0f);
        int i = (iIntValue & 112) ^ 48;
        boolean zH = ((i > 32 && x340Var.g(enfVar)) || (iIntValue & 48) == 32) | x340Var.h(z);
        Object objT5 = x340Var.T();
        byte b = 2;
        if (zH || objT5 == m4cVar) {
            objT5 = new cb8(enfVar, z, b);
            x340Var.s0(objT5);
        }
        qim0 qim0VarB = s161.b(qim0VarK, true, (iu30) objT5);
        String str = infVar.a;
        boolean zI3 = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((i > 32 && x340Var.g(enfVar)) || (iIntValue & 48) == 32) | x340Var.i(ven0Var) | x340Var.i(infVar) | x340Var.i(ven0Var2);
        Object objT6 = x340Var.T();
        if (zI3 || objT6 == m4cVar) {
            objT6 = new f80(enfVar, iu30Var, infVar, ven0Var, ven0Var2);
            x340Var.s0(objT6);
        }
        Function0 function0 = (Function0) objT6;
        if (ihc1.y0(str)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        jto1.b(qim0VarB, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str), function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(219469862, new gnf(infVar, (byte) 1), x340Var), apo.r(-668567675, new ef8(enfVar, haxVar, (byte) 19), x340Var), (xu30) null, (xu30) null, apo.r(962287010, new gnf(infVar, (byte) 2), x340Var), x340Var, 0, 197040, 26558);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wpf wpfVar = (wpf) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
        rwj rwjVar = (rwj) this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        cvx cvxVar2 = cbx.b(x340Var).b;
        uwo1.e(cwl1.o0(x340Var, 2131953302), uyn1.z(12.0f, 0.0f, 2, qim0VarF), cbx.d(x340Var).d, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        if (wpfVar.d.isEmpty()) {
            x340Var3.i0(-2079323536);
            rwjVar.g(wpfVar.g, x340Var, 0);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-2079375089);
            rwjVar.i(wpfVar, iu30Var, x340Var, (iIntValue >> 3) & 126);
            x340Var3.r(false);
        }
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        j2i j2iVarR;
        wrf wrfVar = (wrf) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        asf asfVar = (asf) this.b;
        l2a l2aVar = asfVar.c;
        int i = (iIntValue >> 3) & 14;
        x340 x340Var = (b0k) obj4;
        boolean zI = x340Var.i(wrfVar) | x340Var.i(asfVar);
        Object objT = x340Var.T();
        Function0 function0 = null;
        if (zI || objT == m4cVar) {
            objT = new vs0(wrfVar, asfVar, false, (lnm) null, (byte) 24);
            x340Var.s0(objT);
        }
        ven0 ven0VarP = yto.p(bhd0.a, wrfVar, (vu30) objT, x340Var, ((i << 3) & 112) | 6);
        boolean z = ((ehd0) ven0VarP.getValue()) instanceof bhd0;
        if (z) {
            x340Var.i0(1718752469);
            x340Var.r(false);
            j2iVarR = null;
        } else {
            x340Var.i0(1718677604);
            j2iVarR = apo.r(181482450, new a7e(asfVar, ven0VarP, (byte) 18), x340Var);
            x340Var.r(false);
        }
        if (z) {
            x340Var.i0(1719356597);
            x340Var.r(false);
        } else {
            x340Var.i0(1719294225);
            boolean zI2 = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(ven0VarP);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wq9(iu30Var, ven0VarP, (byte) 8);
                x340Var.s0(objT2);
            }
            function0 = (Function0) objT2;
            x340Var.r(false);
        }
        Function0 function1 = function0;
        if (wrfVar instanceof trf) {
            x340Var.i0(1719446714);
            trf trfVar = (trf) wrfVar;
            w4i1 w4i1Var = trfVar.a;
            boolean z2 = trfVar.b;
            Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
            uwo1.c(w4i1Var, z2, j2iVarR, iu30Var, function1, l2aVar, x340Var, (iIntValue << 3) & 7168);
            x340Var.r(false);
        } else if (wrfVar instanceof urf) {
            x340Var.i0(1719773454);
            urf urfVar = (urf) wrfVar;
            List list = urfVar.c;
            boolean zG = x340Var.g(list);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jwm) it.next()).a);
                }
                objT3 = mqo1.A(arrayList);
                x340Var.s0(objT3);
            }
            c380 c380Var = (c380) objT3;
            String str = urfVar.a;
            w4i1 w4i1Var2 = urfVar.b.a;
            boolean z3 = urfVar.d;
            Parcelable.Creator<w4i1> creator2 = w4i1.CREATOR;
            uwo1.g(str, w4i1Var2, c380Var, z3, j2iVarR, iu30Var, function1, l2aVar, x340Var, (iIntValue << 9) & 458752);
            x340Var.r(false);
        } else if (wrfVar instanceof srf) {
            x340Var.i0(1163874494);
            srf srfVar = (srf) wrfVar;
            w4i1 w4i1Var3 = srfVar.a;
            uu2 uu2Var = srfVar.b;
            Parcelable.Creator<w4i1> creator3 = w4i1.CREATOR;
            uwo1.a(w4i1Var3, uu2Var, l2aVar, x340Var, 0);
            x340Var.r(false);
        } else {
            if (!(wrfVar instanceof vrf)) {
                throw p3d1.k(x340Var, 1163843966, false);
            }
            x340Var.i0(1163879455);
            vrf vrfVar = (vrf) wrfVar;
            String str2 = vrfVar.a;
            w4i1 w4i1Var4 = vrfVar.b;
            c380 c380VarA = mqo1.A(vrfVar.c);
            Parcelable.Creator<w4i1> creator4 = w4i1.CREATOR;
            l2aVar.a(str2, w4i1Var4, c380VarA, x340Var, 0);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cxc0 cxc0Var = (cxc0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(cxc0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            ((m3g) this.b).e(cxc0Var, x340Var2, (iIntValue >> 3) & 14);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(1735728940, new swc((w4g) obj2, (iu30) obj3, (br0) this.b, (byte) 18), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        */
    private final java.lang.Object k(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gtd.k(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dmg dmgVar = (dmg) obj2;
        int iIntValue = ((Number) obj5).intValue();
        ((fmg) this.b).e(dmgVar.a, dmgVar.b, dmgVar.c, dmgVar.d, dmgVar.e, dmgVar.f, dmgVar.g, (iu30) obj3, (b0k) obj4, (iIntValue << 15) & 29360128);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0149  */
    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        boolean z;
        boolean z2;
        Object objT;
        boolean zI;
        Object objT2;
        boolean zI2;
        Object objT3;
        nng nngVar = (nng) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qng qngVar = (qng) this.b;
        boolean z3 = nngVar.a;
        nim0 nim0Var = nim0.a;
        if (z3) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-185785605);
            p1p1.e(u291.f(nim0Var, 1.0f), x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-186853834);
            Object objT4 = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT4 == m4cVar) {
                objT4 = v8r.q(new pz20(0, false));
                x340Var3.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            Object objT5 = x340Var3.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(new pz20(0, false));
                x340Var3.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            y7e1 y7e1Var = qngVar.e;
            y7e1 y7e1Var2 = qngVar.f;
            pz20 pz20Var = (pz20) ven0Var.getValue();
            int i = (iIntValue & 896) ^ 384;
            boolean z4 = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT6 = x340Var3.T();
            if (z4 || objT6 == m4cVar) {
                objT6 = new frf(iu30Var, (byte) 25);
                x340Var3.s0(objT6);
            }
            o1p1.g(y7e1Var, pz20Var, (Function0) objT6, x340Var3, 0);
            pz20 pz20Var2 = (pz20) ven0Var2.getValue();
            boolean z5 = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT7 = x340Var3.T();
            if (z5 || objT7 == m4cVar) {
                objT7 = new frf(iu30Var, (byte) 26);
                x340Var3.s0(objT7);
            }
            o1p1.g(y7e1Var2, pz20Var2, (Function0) objT7, x340Var3, 0);
            String str2 = nngVar.b;
            boolean z6 = nngVar.c;
            y7e1 y7e1Var3 = qngVar.e;
            String str3 = nngVar.d;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if (!qngVar.d) {
                y7e1Var2 = null;
            }
            boolean zI3 = x340Var3.i(ven0Var);
            if (i <= 256 || !x340Var3.g(iu30Var)) {
                str = str3;
                if ((iIntValue & 384) != 256) {
                    z = false;
                }
                z2 = z | zI3;
                objT = x340Var3.T();
                if (z2 || objT == m4cVar) {
                    objT = new gp0(iu30Var, ven0Var, (byte) 8);
                    x340Var3.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                zI = x340Var3.i(ven0Var2) | ((i <= 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256);
                objT2 = x340Var3.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new gp0(iu30Var, ven0Var2, (byte) 9);
                    x340Var3.s0(objT2);
                }
                iu30 iu30Var3 = (iu30) objT2;
                zI2 = ((i <= 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var3.i(qngVar);
                objT3 = x340Var3.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new w9f(iu30Var, qngVar, (byte) 14);
                    x340Var3.s0(objT3);
                }
                n1p1.b(str2, z6, y7e1Var3, qim0VarF, str, y7e1Var2, iu30Var2, iu30Var3, (iu30) objT3, x340Var3, 0, 0);
                x340Var3.r(false);
            } else {
                str = str3;
            }
            z = true;
            z2 = z | zI3;
            objT = x340Var3.T();
            if (z2) {
                objT = new gp0(iu30Var, ven0Var, (byte) 8);
                x340Var3.s0(objT);
            } else {
                objT = new gp0(iu30Var, ven0Var, (byte) 8);
                x340Var3.s0(objT);
            }
            iu30 iu30Var4 = (iu30) objT;
            zI = x340Var3.i(ven0Var2) | ((i <= 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256);
            objT2 = x340Var3.T();
            if (zI) {
                objT2 = new gp0(iu30Var, ven0Var2, (byte) 9);
                x340Var3.s0(objT2);
            } else {
                objT2 = new gp0(iu30Var, ven0Var2, (byte) 9);
                x340Var3.s0(objT2);
            }
            iu30 iu30Var5 = (iu30) objT2;
            zI2 = ((i <= 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var3.i(qngVar);
            objT3 = x340Var3.T();
            if (zI2) {
                objT3 = new w9f(iu30Var, qngVar, (byte) 14);
                x340Var3.s0(objT3);
            } else {
                objT3 = new w9f(iu30Var, qngVar, (byte) 14);
                x340Var3.s0(objT3);
            }
            n1p1.b(str2, z6, y7e1Var3, qim0VarF, str, y7e1Var2, iu30Var4, iu30Var5, (iu30) objT3, x340Var3, 0, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strK;
        String strN0;
        String strK2;
        wog wogVar = (xog) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        yog yogVar = (yog) this.b;
        boolean z = wogVar instanceof vog;
        if (z) {
            x340 x340Var2 = x340Var;
            strK = x0d.k(x340Var2, 1474025054, 2131953936, x340Var2, false);
        } else {
            x340 x340Var3 = x340Var;
            strK = x0d.k(x340Var3, 1474112164, 2131953938, x340Var3, false);
        }
        if (z) {
            x340 x340Var4 = x340Var;
            strN0 = x0d.k(x340Var4, 1474247076, 2131953935, x340Var4, false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1474329350);
            strN0 = cwl1.n0(2131953934, new Object[]{Integer.valueOf(yogVar.b)}, x340Var5);
            x340Var5.r(false);
        }
        boolean z2 = wogVar instanceof wog;
        e671 e671Var = z2 ? new e671(wogVar.f) : g671.a;
        if (z2 && yogVar.a) {
            x340 x340Var6 = x340Var;
            strK2 = x0d.k(x340Var6, 1474735543, 2131953937, x340Var6, false);
        } else {
            x340 x340Var7 = x340Var;
            x340Var7.i0(1474828078);
            x340Var7.r(false);
            strK2 = null;
        }
        i671 i671Var = new i671(strK, strN0, e671Var, strK2, cwl1.o0(x340Var, 2131953933));
        boolean z3 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var8 = x340Var;
        Object objT = x340Var8.T();
        if (z3 || objT == fkj0.X) {
            objT = new wqf(iu30Var, (byte) 3);
            x340Var8.s0(objT);
        }
        ryo1.k(i671Var, (iu30) objT, x340Var8, 0);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:275:0x079c A[PHI: r7
      0x079c: PHI (r7v32 java.lang.String) = (r7v30 java.lang.String), (r7v35 java.lang.String) binds: [B:284:0x07b5, B:273:0x0799] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        Object obj6;
        Function0 function0;
        xtx xtxVar;
        Date date;
        String str;
        String str2;
        aoe aoeVar;
        coe coeVar;
        ArrayList arrayList;
        eoe eoeVar;
        String str3;
        yif1 yif1Var;
        Object obj7;
        tyq tyqVar;
        String strK;
        mrg mrgVar;
        Object obj8;
        byte b = this.a;
        String strF = "";
        nim0 nim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) ((tm) obj9).e), apo.r(-2085619153, new hj8(obj2, obj3, (byte) 27), b0kVar), b0kVar, 56);
                return rih1Var;
            case 1:
                cwd cwdVar = (cwd) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                gzd gzdVar = cwdVar.a;
                xho xhoVar = (xho) ((umf0) obj9).d;
                boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.g(cwdVar)) && (iIntValue & 48) != 32) {
                    z = false;
                }
                boolean z3 = z2 | z;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z3 || objT == fkj0.X) {
                    obj6 = objT;
                    rqa rqaVar = new rqa(iu30Var, cwdVar, (byte) 17);
                    x340Var2.s0(rqaVar);
                    obj6 = rqaVar;
                }
                obj6 = objT;
                xfo1.b(gzdVar, xhoVar, (Function0) obj6, (qim0) null, x340Var2, 0);
                return rih1Var;
            case 2:
                w6e w6eVar = (w6e) obj9;
                dio1.b((t6e) obj2, (iu30) obj3, w6eVar.a, w6eVar.c, w6eVar.b, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 3:
                l8e l8eVar = (l8e) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                qj0 qj0Var = (qj0) obj9;
                int i = (iIntValue2 & 48) == 0 ? iIntValue2 | (x340Var3.g(l8eVar) ? 32 : 16) : iIntValue2;
                if ((iIntValue2 & 384) == 0) {
                    i |= x340Var3.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i & 1, (i & 1169) != 1168)) {
                    t0z<jx11> t0zVar = jx11.f;
                    for (jx11 jx11Var : t0zVar) {
                        if (jx11Var.a().equals(l8eVar.a)) {
                            ArrayList<jx11> arrayList2 = new ArrayList();
                            for (Object obj10 : t0zVar) {
                                if (l8eVar.b.contains(((jx11) obj10).a())) {
                                    arrayList2.add(obj10);
                                }
                            }
                            x340Var4.i0(1828304365);
                            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                            for (jx11 jx11Var2 : arrayList2) {
                                String strA = jx11Var2.a();
                                String strO0 = cwl1.o0(x340Var4, jx11Var2.b());
                                int iOrdinal = jx11Var2.ordinal();
                                if (iOrdinal == 0) {
                                    xtxVar = akx.c;
                                } else if (iOrdinal == 1) {
                                    xtxVar = ltx.c;
                                } else {
                                    if (iOrdinal != 2) {
                                        eg.o();
                                        return null;
                                    }
                                    xtxVar = xtx.c;
                                }
                                arrayList3.add(new b9e(strA, strO0, xtxVar));
                            }
                            x340Var4.r(false);
                            String strO1 = cwl1.o0(x340Var4, jx11Var.b());
                            if (arrayList2.size() > 1) {
                                x340Var4.i0(843184233);
                                boolean zI = x340Var4.i(qj0Var) | ((i & 896) == 256) | x340Var4.e(jx11Var.ordinal()) | x340Var4.i(arrayList3);
                                Object objT2 = x340Var4.T();
                                if (zI || objT2 == fkj0.X) {
                                    objT2 = new f80(iu30Var2, qj0Var, jx11Var, arrayList3, (byte) 18);
                                    x340Var4.s0(objT2);
                                }
                                function0 = (Function0) objT2;
                                x340Var4.r(false);
                            } else {
                                x340Var4.i0(843533107);
                                x340Var4.r(false);
                                function0 = null;
                            }
                            sio1.a(0, strO1, function0, x340Var4, (qim0) null);
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                x340Var4.b0();
                return rih1Var;
            case 4:
                ajo1.b((w8e) obj2, (g9e) ((idd1) ((qlb) obj9).f).getValue(), (qim0) null, (b0k) obj4, ((((Number) obj5).intValue() >> 3) & 14) | 64);
                return rih1Var;
            case 5:
                ((iee) obj9).c.b((hhm0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 6:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                kby kbyVar = ((cxc0) obj2).f;
                zne zneVar = (zne) obj9;
                try {
                    String str4 = (String) kbyVar.q.get("last_updated");
                    if (str4 == null) {
                        str4 = "2000-01-01:00:00:00Z";
                    }
                    date = ((SimpleDateFormat) zneVar.e).parse(nhc1.W(str4, "Z", "+00:00"));
                    break;
                } catch (ParseException e) {
                    Logger.e(e, "Failed to parse chart last updated date", new Object[0]);
                    date = null;
                }
                if (date == null || (str = ((DateFormat) zneVar.f).format(date)) == null) {
                    str = "";
                }
                String str5 = (String) kbyVar.q.get("new_entries_count");
                int i2 = str5 != null ? Integer.parseInt(str5) : 0;
                vne vneVar = (vne) zneVar.d;
                Object[] objArr = {Integer.valueOf(i2)};
                Resources resources = (Resources) ((WeakReference) ((k9) vneVar).b).get();
                String quantityString = resources == null ? "" : resources.getQuantityString(2131820606, i2, objArr);
                if (i2 <= 0 || str.length() <= 0) {
                    if (i2 > 0) {
                        str2 = quantityString;
                    } else if (str.length() > 0) {
                        str2 = str;
                    }
                    uwr uwrVar = cbx.a;
                    uwo1.e(str2, anm1.N("metadata_text", nim0Var), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
                    return rih1Var;
                }
                strF = f4i1.f(str, " • ", quantityString);
                str2 = strF;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, anm1.N("metadata_text", nim0Var), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
                return rih1Var;
            case 7:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                boe boeVar = (boe) obj9;
                j7e0 j7e0Var = ((hwq) obj2).g;
                boolean z4 = j7e0Var instanceof j7e0;
                tne tneVar = tne.a;
                if (z4) {
                    zuc0 zuc0Var = j7e0Var.a;
                    String str6 = (String) zuc0Var.g.get("current_pos");
                    if (str6 == null) {
                        str6 = "0";
                    }
                    int i3 = Integer.parseInt(str6);
                    Enum[] enumArr = (Enum[]) tne.class.getEnumConstants();
                    HashMap map = new HashMap(mno1.k(enumArr.length));
                    for (Enum r11 : enumArr) {
                        map.put(r11.name().toUpperCase(Locale.US), r11);
                    }
                    String str7 = (String) zuc0Var.g.get("status");
                    if (str7 == null) {
                        str7 = "UNKNOWN";
                    }
                    Enum r0 = (Enum) map.get(str7.toUpperCase(Locale.US));
                    aoeVar = new aoe(i3, (tne) (r0 != null ? new i5w0(r0) : j5.a).e(tneVar));
                } else {
                    aoeVar = new aoe(0, tneVar);
                }
                boeVar.e(aoeVar, b0kVar3, 0);
                return rih1Var;
            case 8:
                hwq hwqVar = (hwq) obj2;
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                doe doeVar = (doe) obj9;
                j7e0 j7e0Var2 = hwqVar.g;
                if (j7e0Var2 instanceof j7e0) {
                    fjf1 fjf1Var = j7e0Var2.a.p;
                    fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                    LinkedHashMap linkedHashMap = sne.b;
                    sne sneVar = (sne) sne.b.get((String) hwqVar.f.c.get("chart_entity_type"));
                    if (sneVar == null) {
                        sneVar = sne.TRACK;
                    }
                    if (fjf1Var2 != null) {
                        List list = fjf1Var2.b;
                        ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((yif1) it.next()).a);
                        }
                        arrayList = new ArrayList();
                        for (Object obj11 : arrayList4) {
                            if (((String) obj11).length() > 0) {
                                arrayList.add(obj11);
                            }
                        }
                    } else {
                        arrayList = z6x.a;
                    }
                    int iOrdinal2 = sneVar.ordinal();
                    if (iOrdinal2 == 0) {
                        strF = o7h.y0(arrayList, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                    } else if (iOrdinal2 == 1) {
                        strF = o7h.y0(o7h.d1(arrayList, 1), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                    } else if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    coeVar = new coe(strF);
                } else {
                    coeVar = new coe("");
                }
                doeVar.f(coeVar, b0kVar4, 0);
                return rih1Var;
            case 9:
                hwq hwqVar2 = (hwq) obj2;
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                foe foeVar = (foe) obj9;
                j7e0 j7e0Var3 = hwqVar2.g;
                if (j7e0Var3 instanceof j7e0) {
                    zuc0 zuc0Var2 = j7e0Var3.a;
                    int i4 = hwqVar2.c ? 3 : hwqVar2.b ? 2 : 1;
                    LinkedHashMap linkedHashMap2 = sne.b;
                    sne sneVar2 = (sne) sne.b.get((String) hwqVar2.f.c.get("chart_entity_type"));
                    if (sneVar2 == null) {
                        sneVar2 = sne.TRACK;
                    }
                    int iOrdinal3 = sneVar2.ordinal();
                    if (iOrdinal3 == 0) {
                        strF = zuc0Var2.i;
                    } else if (iOrdinal3 == 1) {
                        fjf1 fjf1Var3 = zuc0Var2.p;
                        fjf1 fjf1Var4 = fjf1Var3 instanceof fjf1 ? fjf1Var3 : null;
                        str3 = fjf1Var4 != null ? fjf1Var4.a.a : null;
                        if (str3 != null) {
                            strF = str3;
                        }
                    } else {
                        if (iOrdinal3 != 2) {
                            eg.o();
                            return null;
                        }
                        fjf1 fjf1Var5 = zuc0Var2.p;
                        fjf1 fjf1Var6 = fjf1Var5 instanceof fjf1 ? fjf1Var5 : null;
                        str3 = (fjf1Var6 == null || (yif1Var = (yif1) o7h.s0(fjf1Var6.b)) == null) ? null : yif1Var.a;
                        if (str3 != null) {
                            strF = str3;
                        }
                    }
                    eoeVar = new eoe(strF, i4);
                } else {
                    eoeVar = new eoe("", 1);
                }
                foeVar.f(eoeVar, b0kVar5, 0);
                return rih1Var;
            case 10:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                rqe rqeVar = (rqe) obj9;
                mod.b(ef.a.a(rqeVar.Z), apo.r(-1168370581, new swc(rqeVar, (ppe) obj2, (iu30) obj3, (byte) 6), b0kVar6), b0kVar6, 56);
                return rih1Var;
            case 11:
                wre wreVar = (wre) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                ((Number) obj5).intValue();
                String str8 = wreVar.a;
                kre kreVar = (kre) obj9;
                x340 x340Var5 = (b0k) obj4;
                Object objT3 = x340Var5.T();
                m4c m4cVar = fkj0.X;
                Object obj12 = objT3;
                if (objT3 == m4cVar) {
                    oql oqlVar = kreVar.g;
                    jge jgeVarE = hu20.e(new dkm((mr20) oqlVar.b, (byte) 12), new tno((lnm) null, (v5n) oqlVar.c, (byte) 0));
                    x340Var5.s0(jgeVarE);
                    obj12 = jgeVarE;
                }
                ven0 ven0VarJ = f4p1.j((mr20) obj12, (Object) null, (iac0) null, x340Var5, 48, 14);
                boolean zG = x340Var5.g(str8);
                Object objT4 = x340Var5.T();
                Object obj13 = objT4;
                if (zG || objT4 == m4cVar) {
                    hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                    x340Var5.s0(hrr0VarQ);
                    obj13 = hrr0VarQ;
                }
                ven0 ven0Var = (ven0) obj13;
                boolean zG2 = x340Var5.g(str8);
                Object objT5 = x340Var5.T();
                Object obj14 = objT5;
                if (zG2 || objT5 == m4cVar) {
                    s0f s0fVarA = kreVar.d.a((i8h1) kreVar.c.get(), new cy7(ven0Var, (byte) 22));
                    x340Var5.s0(s0fVarA);
                    obj14 = s0fVarA;
                }
                mod.b(oi7.a.a(kreVar.f), apo.r(-1015233073, new k40((s0f) obj14, wreVar, iu30Var3, kreVar, ven0Var, ven0VarJ, (byte) 14), x340Var5), x340Var5, 56);
                return rih1Var;
            case 12:
                wve wveVar = (wve) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean z5 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var4)) || (iIntValue3 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT6 = x340Var7.T();
                if (z5 || objT6 == fkj0.X) {
                    obj7 = objT6;
                    gob gobVar = new gob(iu30Var4, (byte) 20);
                    x340Var7.s0(gobVar);
                    obj7 = gobVar;
                }
                obj7 = objT6;
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) obj7), (gbx) null, apo.r(-1123776845, new xve(wveVar, (byte) 0), x340Var7), (xu30) null, apo.r(1559595858, new ef8((yve) obj9, wveVar, (byte) 15), x340Var7), apo.r(-1783539599, new xve(wveVar, (byte) 1), x340Var7), apo.r(-831707760, new ip0(iu30Var4, (byte) 7), x340Var7), (xu30) null, (xu30) null, apo.r(2023787757, new xve(wveVar, (byte) 2), x340Var7), x340Var7, 100663360, 197046, 25276);
                return rih1Var;
            case 13:
                v4f v4fVar = (v4f) obj2;
                x340 x340Var8 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (v4fVar.b.isEmpty()) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(1583857881);
                    x340Var9.r(false);
                } else {
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(1583571503);
                    w4f w4fVar = (w4f) obj9;
                    Object objT7 = x340Var10.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT7 == m4cVar2) {
                        ueq ueqVar = w4fVar.a;
                        String str9 = v4fVar.a;
                        teq teqVar = ueqVar.a.c;
                        p4f p4fVar = new p4f(str9, (a1r0) teqVar.V0.get(), xqu.a(teqVar.a.Jg), xqu.a(teqVar.a.Kg));
                        x340Var10.s0(p4fVar);
                        objT7 = p4fVar;
                    }
                    p4f p4fVar2 = (p4f) objT7;
                    boolean zI2 = x340Var10.i(v4fVar) | x340Var10.i(p4fVar2);
                    Object objT8 = x340Var10.T();
                    if (zI2 || objT8 == m4cVar2) {
                        objT8 = new ztb(v4fVar, p4fVar2, (byte) 29);
                        x340Var10.s0(objT8);
                    }
                    too1.b((qim0) null, (xtb0) null, (vzq0) null, (iu30) objT8, x340Var10, 0, 7);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 14:
                t6f t6fVar = (t6f) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                h7f h7fVar = (h7f) obj9;
                x340 x340Var11 = (b0k) obj4;
                Object objT9 = x340Var11.T();
                m4c m4cVar3 = fkj0.X;
                if (objT9 == m4cVar3) {
                    idd1 idd1Var = new idd1(new g7f(h7fVar, (byte) 2));
                    x340Var11.s0(idd1Var);
                    objT9 = idd1Var;
                }
                znb0 znb0Var = (znb0) objT9;
                boolean zI3 = x340Var11.i(znb0Var);
                Object objT10 = x340Var11.T();
                if (zI3 || objT10 == m4cVar3) {
                    objT10 = new m4d(znb0Var, (byte) 22);
                    x340Var11.s0(objT10);
                }
                qxd0.i(znb0Var, (iu30) objT10, x340Var11);
                h7q0 h7q0Var = t6fVar.a;
                h7q0 h7q0Var2 = h7q0Var instanceof h7q0 ? h7q0Var : null;
                if ((h7q0Var2 != null ? h7q0Var2.a : null) instanceof mpl) {
                    x340Var11.i0(745043036);
                    boolean zG3 = x340Var11.g(znb0Var);
                    Object objT11 = x340Var11.T();
                    if (zG3 || objT11 == m4cVar3) {
                        objT11 = h7fVar.e.a((d0r) znb0Var.getValue());
                        x340Var11.s0(objT11);
                    }
                    x340Var11.r(false);
                    tyqVar = (tyq) objT11;
                } else {
                    x340Var11.i0(745144809);
                    x340Var11.r(false);
                    tyqVar = null;
                }
                yqg yqgVar = h7fVar.a;
                add addVar = h7fVar.b;
                t7q0 t7q0Var = t6fVar.a;
                bc71 bc71Var = t6fVar.k;
                yxb0 yxb0Var = h7fVar.c;
                e821 e821Var = h7fVar.Q0;
                boolean zO = addVar.o();
                boolean z6 = addVar.o() && addVar.b.f();
                boolean zC = addVar.c();
                nu nuVar = h7fVar.d;
                rjh0 rjh0Var = (rjh0) h7fVar.S0.getValue();
                w4i1 w4i1Var = h7fVar.N0;
                String str10 = h7fVar.X;
                boolean z7 = t6fVar.b;
                boolean z8 = t6fVar.c;
                c380 c380Var = t6fVar.g;
                boolean z9 = t6fVar.h;
                String str11 = t6fVar.i;
                wwb1 wwb1Var = t6fVar.d ? h7fVar.i : null;
                yuu0 yuu0Var = h7fVar.t;
                int i5 = t6fVar.f;
                boolean zS = addVar.s();
                String str12 = h7fVar.O0;
                iu30 iu30Var6 = h7fVar.P0;
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(x340Var11).b;
                qim0 qim0VarP = vby0.p(too1.y(uyn1.x(nim0Var, 16.0f), poo1.s(0.0f, 14)), h7fVar.Z);
                Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
                two1.a(yqgVar, t7q0Var, bc71Var, yxb0Var, nuVar, tyqVar, rjh0Var, yuu0Var, z7, z8, w4i1Var, str10, str11, iu30Var5, i5, zS, e821Var, zO, z6, qim0VarP, zC, c380Var, z9, wwb1Var, str12, iu30Var6, x340Var11, 0, (iIntValue4 << 3) & 7168);
                return rih1Var;
            case 15:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                tba0 tba0Var = ((caf) obj2).a;
                boolean z10 = ((b0a0) ((res) obj9).h).a() && (!(tba0Var instanceof tba0) || tba0Var.c);
                if (tba0Var instanceof tba0) {
                    x340 x340Var13 = x340Var12;
                    x340Var13.i0(-1705660638);
                    if (z10) {
                        x340Var13.i0(-1335813448);
                        strK = cwl1.n0(2131957420, new Object[]{tba0Var.a}, x340Var13);
                        x340Var13.r(false);
                    } else {
                        strK = x0d.k(x340Var13, -1335628719, 2131957416, x340Var13, false);
                    }
                    String str13 = strK;
                    int i6 = z10 ? 2131957419 : 2131957408;
                    int i7 = z10 ? 2131957419 : 2131956892;
                    idx idxVar = z10 ? new idx(4) : mdx.a;
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var13.g(iu30Var7)) && (iIntValue5 & 384) != 256) {
                        z = false;
                    }
                    boolean zI4 = x340Var13.i(tba0Var) | z;
                    Object objT12 = x340Var13.T();
                    Object obj15 = objT12;
                    if (zI4 || objT12 == m4cVar4) {
                        faf fafVar = new faf(iu30Var7, tba0Var, (byte) 0);
                        x340Var13.s0(fafVar);
                        obj15 = fafVar;
                    }
                    iro1.a(str13, i6, i7, idxVar, z10, (Function0) obj15, x340Var13, 0);
                    x340Var13.r(false);
                } else if (tba0Var instanceof uba0) {
                    x340 x340Var14 = x340Var12;
                    x340Var14.i0(-1705622768);
                    String strO2 = cwl1.o0(x340Var14, 2131957418);
                    hdx hdxVar = mdx.b;
                    boolean zI5 = ((((iIntValue5 & 896) ^ 384) > 256 && x340Var14.g(iu30Var7)) || (iIntValue5 & 384) == 256) | x340Var14.i(tba0Var);
                    Object objT13 = x340Var14.T();
                    Object obj16 = objT13;
                    if (zI5 || objT13 == m4cVar4) {
                        faf fafVar2 = new faf(iu30Var7, tba0Var, (byte) 1);
                        x340Var14.s0(fafVar2);
                        obj16 = fafVar2;
                    }
                    iro1.a(strO2, 2131957417, 2131956893, hdxVar, z10, (Function0) obj16, x340Var14, 0);
                    x340Var14.r(false);
                } else if (tba0Var instanceof qba0) {
                    x340 x340Var15 = x340Var12;
                    x340Var15.i0(-1705605756);
                    ps60 ps60Var = ((qba0) tba0Var).a.b;
                    String str14 = ps60Var.b;
                    if (str14 == null) {
                        str14 = ps60Var.a;
                    }
                    String strN0 = cwl1.n0(2131957383, new Object[]{str14}, x340Var15);
                    hdx hdxVar2 = mdx.b;
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var15.g(iu30Var7)) && (iIntValue5 & 384) != 256) {
                        z = false;
                    }
                    boolean zI6 = x340Var15.i(tba0Var) | z;
                    Object objT14 = x340Var15.T();
                    Object obj17 = objT14;
                    if (zI6 || objT14 == m4cVar4) {
                        faf fafVar3 = new faf(iu30Var7, tba0Var, (byte) 2);
                        x340Var15.s0(fafVar3);
                        obj17 = fafVar3;
                    }
                    iro1.a(strN0, 2131957382, 2131956889, hdxVar2, false, (Function0) obj17, x340Var15, 24576);
                    x340Var15.r(false);
                } else if (tba0Var instanceof sba0) {
                    x340 x340Var16 = x340Var12;
                    x340Var16.i0(-1705584758);
                    String strO3 = cwl1.o0(x340Var16, 2131957418);
                    hdx hdxVar3 = mdx.b;
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var7)) && (iIntValue5 & 384) != 256) {
                        z = false;
                    }
                    boolean zI7 = x340Var16.i(tba0Var) | z;
                    Object objT15 = x340Var16.T();
                    Object obj18 = objT15;
                    if (zI7 || objT15 == m4cVar4) {
                        faf fafVar4 = new faf(iu30Var7, tba0Var, (byte) 3);
                        x340Var16.s0(fafVar4);
                        obj18 = fafVar4;
                    }
                    iro1.a(strO3, 2131957400, 2131956890, hdxVar3, z10, (Function0) obj18, x340Var16, 0);
                    x340Var16.r(false);
                } else {
                    if (!tba0Var.equals(rba0.a)) {
                        throw p3d1.k(x340Var12, -1705661225, false);
                    }
                    x340 x340Var17 = x340Var12;
                    x340Var17.i0(-1333038359);
                    x340Var17.r(false);
                }
                return rih1Var;
            case 16:
                ohf ohfVar = (ohf) obj2;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                phf phfVar = (phf) obj9;
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= x340Var18.g(ohfVar) ? 32 : 16;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue6 & 1, (iIntValue6 & 1041) != 1040)) {
                    mod.c(new ely0[]{mge0.a.a(phfVar.a), mge0.b.a(phfVar.b), mge0.c.a(phfVar.c), fm31.a.a(phfVar.e)}, apo.r(-96322701, new a7e(ohfVar, phfVar, (byte) 12), x340Var19), x340Var19, 56);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 17:
                return a(obj, obj2, obj3, obj4, obj5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case 20:
                return f(obj, obj2, obj3, obj4, obj5);
            case 21:
                return g(obj, obj2, obj3, obj4, obj5);
            case 22:
                return h(obj, obj2, obj3, obj4, obj5);
            case 23:
                return i(obj, obj2, obj3, obj4, obj5);
            case 24:
                return j(obj, obj2, obj3, obj4, obj5);
            case 25:
                return k(obj, obj2, obj3, obj4, obj5);
            case 26:
                return m(obj, obj2, obj3, obj4, obj5);
            case 27:
                return n(obj, obj2, obj3, obj4, obj5);
            case 28:
                return o(obj, obj2, obj3, obj4, obj5);
            default:
                rrg rrgVar = (rrg) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if (((hf2) obj9).b) {
                    x340 x340Var21 = x340Var20;
                    x340Var21.i0(-483101312);
                    z47.j(rrgVar instanceof qrg, x340Var21, 0);
                    x340Var21.r(false);
                } else {
                    x340 x340Var22 = x340Var20;
                    x340Var22.i0(-483027315);
                    x340Var22.r(false);
                }
                if (rrgVar instanceof qrg) {
                    x340 x340Var23 = x340Var20;
                    x340Var23.i0(-482978211);
                    int iC = l1d.C(((qrg) rrgVar).a);
                    if (iC == 0) {
                        mrgVar = mrg.a;
                    } else if (iC == 1) {
                        mrgVar = nrg.a;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        mrgVar = null;
                    }
                    String strO4 = cwl1.o0(x340Var23, 2131954280);
                    boolean zI8 = x340Var23.i(mrgVar);
                    if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var23.g(iu30Var8)) && (iIntValue7 & 384) != 256) {
                        z = false;
                    }
                    boolean z11 = zI8 | z;
                    Object objT16 = x340Var23.T();
                    if (z11 || objT16 == fkj0.X) {
                        obj8 = objT16;
                        ame ameVar = new ame(mrgVar, iu30Var8, (byte) 18);
                        x340Var23.s0(ameVar);
                        obj8 = ameVar;
                    }
                    obj8 = objT16;
                    wro1.h(new gbx(new y50(strO4), (Function0) obj8), ldx.c, (qim0) null, mrgVar == null ? new hax(strO4) : jax.a, yla.p(x340Var23).a(), (vzq0) null, false, (idn0) null, (ga80) null, gdi.a, x340Var23, 0, 6, 972);
                    x340Var23.r(false);
                } else {
                    x340 x340Var24 = x340Var20;
                    x340Var24.i0(-482317043);
                    x340Var24.r(false);
                }
                return rih1Var;
        }
    }
}
