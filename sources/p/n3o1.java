package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n3o1 {
    public static final float[][] a = {new float[]{0.0f, -4.0f}, new float[]{-4.0f, 3.0f}, new float[]{3.0f, -2.0f}, new float[]{-2.0f, 0.0f}, new float[]{0.0f, 0.0f}};
    public static b180 b;

    public static final void a(String str, int i, Function0 function0, qim0 qim0Var, boolean z, boolean z2, Function0 function1, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        qim0 qim0Var2;
        int i4;
        Function0 function2 = function1;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(398478334);
        j06 j06Var = x340Var2.a;
        int i5 = i2 | (x340Var2.g(str) ? 4 : 2) | (x340Var2.e(l1d.C(i)) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | 3072 | (x340Var2.h(z) ? 16384 : 8192) | (x340Var2.h(z2) ? 131072 : 65536) | (x340Var2.i(function2) ? 1048576 : 524288);
        if (x340Var2.Y(i5 & 1, (599187 & i5) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            long j = cbx.a(x340Var2).b.a;
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            mta mtaVar = cbx.b(x340Var2).d;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(str, uyn1.z(72.0f, 0.0f, 2, qim0VarF3), lee1Var, j, new a0e1(3), null, 2, false, cjc0Var, 0, null, x340Var2, i5 & 14, 0, 1696);
            x340Var = x340Var2;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var3, graVar);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            int i6 = ((i5 >> 3) & 126) | ((i5 >> 9) & 896);
            i3 = i;
            b(i3, i6, function0, x340Var, z2);
            x340Var.r(true);
            if (z) {
                x340Var.i0(2018766046);
                function2 = function1;
                foo1.c(new gbx(z50.c, function2), ldx.c, h2cVar.a(qim0Var3, een.i), null, yla.s(x340Var), null, null, null, null, null, uri.b, x340Var, 0, 48, 2008);
                x340Var = x340Var;
                i4 = 0;
                x340Var.r(false);
            } else {
                function2 = function1;
                i4 = 0;
                x340Var.i0(2019306376);
                x340Var.r(false);
            }
            x340Var.r(true);
            t1c.a(dug.f(u291.h(u291.f(qim0Var3, 1.0f), 1.0f), cbx.a(x340Var).a.b.c(), d4o1.a), x340Var, i4);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            i3 = i;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(str, i3, function0, qim0Var2, z, z2, function2, i2);
        }
    }

    public static final void b(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        int i3;
        jax jaxVar;
        gbx gbxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1261467959);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, i == 3 ? 2131952777 : 2131952776);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            if (z) {
                x340Var.i0(-1089914339);
                x340Var.r(false);
                jaxVar = jax.a;
            } else {
                x340Var.i0(-1089912847);
                jax haxVar = new hax(cwl1.o0(x340Var, 2131952785));
                x340Var.r(false);
                jaxVar = haxVar;
            }
            if (i == 1) {
                gbxVar = new gbx(z50.c, function0);
            } else {
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbxVar = new gbx(new y50(strO0), function0);
            }
            foo1.c(gbxVar, ldxVar, null, jaxVar, gdxVarS, null, null, null, null, null, apo.r(60285098, new ue0(i, strO0, (byte) 7), x340Var), x340Var, 0, 48, 1996);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new snv(i, i2, function0, z);
        }
    }

    public static final void c(i3o1 i3o1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        ngx ngxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(931287354);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(i3o1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cr31 cr31Var = er31.a;
            boolean z = i3o1Var instanceof eao0;
            if (z) {
                ngxVar = ngx.e;
            } else {
                if (!i3o1Var.equals(fao0.c)) {
                    eg.o();
                    return;
                }
                ngxVar = ogx.e;
            }
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new nfk0(iu30Var, (byte) 24);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (!z) {
                gbxVar = null;
            }
            cwl1.b((qim0) null, graVar, cr31Var, ngxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-2008832669, new qsn0(i3o1Var, (byte) 5), x340Var), x340Var, 0, 48, 1505);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iao0(i3o1Var, iu30Var, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(i3o1 i3o1Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(983167797);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(i3o1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (i3o1Var instanceof eao0) {
            x340Var.i0(-68546536);
            c(i3o1Var, iu30Var, x340Var, i2 & 126);
            x340Var.r(false);
        } else {
            if (!i3o1Var.equals(fao0.c)) {
                throw p3d1.k(x340Var, -68547836, false);
            }
            x340Var.i0(-2124844654);
            uvx uvxVarB = uvx.b((uvx) x340Var.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new nfk0(iu30Var, (byte) 25);
                x340Var.s0(objT);
            }
            jto1.b(null, uvxVarB, null, false, null, null, new gbx(z50.c, (Function0) objT), null, apo.r(-60094806, new ukm0(i3o1Var, iu30Var, (byte) 7), x340Var), null, null, null, null, null, null, n3j.a, x340Var, 100663360, 196608, 32445);
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iao0(i3o1Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void e(xfx xfxVar, tja tjaVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(63579046);
        int i2 = i | (x340Var.i(xfxVar) ? 4 : 2) | (x340Var.i(tjaVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(tjaVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new vmr0(tjaVar, (byte) 0);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wmr0(xfxVar, tjaVar, qim0Var, iu30Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(rhz0 rhz0Var, boolean z, float f, float f2, boolean z2, iu30 iu30Var, boolean z3, qim0 qim0Var, b0k b0kVar, int i) {
        float f3;
        boolean z4;
        int i2;
        int i3;
        Object obj;
        boolean z5 = z;
        m4c m4cVar = fkj0.X;
        String str = rhz0Var.g;
        List list = rhz0Var.f;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1358874552);
        boolean z6 = z2;
        int i4 = i | (b0kVar2.i(rhz0Var) ? 4 : 2) | (b0kVar2.h(z5) ? 32 : 16) | (b0kVar2.d(f) ? 256 : 128) | (b0kVar2.d(f2) ? 2048 : 1024) | (b0kVar2.h(z6) ? 16384 : 8192) | (b0kVar2.i(iu30Var) ? 131072 : 65536) | (b0kVar2.h(z3) ? 1048576 : 524288) | (b0kVar2.g(qim0Var) ? 8388608 : 4194304);
        if (b0kVar2.Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 112;
            boolean z7 = i5 == 32;
            Object objT = b0kVar2.T();
            tzg1 tzg1Var = rno1.a;
            if (z7 || objT == m4cVar) {
                ArrayList arrayList = new ArrayList(5);
                int i6 = 0;
                int i7 = 0;
                i2 = 1;
                i3 = 0;
                for (int i8 = 5; i7 < i8; i8 = 5) {
                    float[] fArr = a[i7];
                    float f4 = fArr[0];
                    float f5 = fArr[1];
                    ilv.a.getClass();
                    arrayList.add(new hsi1("quiz-item-" + i6 + "-" + z5, Float.valueOf(f4), Float.valueOf(f5), new pxg1(50, i6 * 50, flv.f), tzg1Var));
                    i7++;
                    i6++;
                }
                c9 c9VarF = mqo1.F(arrayList);
                b0kVar2.s0(c9VarF);
                obj = c9VarF;
            } else {
                i2 = 1;
                i3 = 0;
                obj = objT;
            }
            c9 c9Var = (c9) obj;
            int i9 = i5 == 32 ? i2 : i3;
            Object objT2 = b0kVar2.T();
            Object obj2 = objT2;
            if (i9 != 0 || objT2 == m4cVar) {
                hrr0 hrr0VarQ = v8r.q("quiz-shaking-" + z5);
                b0kVar2.s0(hrr0VarQ);
                obj2 = hrr0VarQ;
            }
            ven0 ven0VarP = zod.P(c9Var, false, (String) ((ven0) obj2).getValue(), (Function0) null, (Function0) null, b0kVar2, 8, 26);
            int i10 = i5 == 32 ? i2 : i3;
            Object objT3 = b0kVar2.T();
            if (i10 != 0 || objT3 == m4cVar) {
                ilv.a.getClass();
                objT3 = new hsi1("quiz-check-mark-scale-" + z5, Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(666, i3, flv.b, 2), tzg1Var);
                b0kVar2.s0(objT3);
            }
            ven0 ven0VarR = zod.R((hsi1) objT3, false, (Function0) null, b0kVar2, 8, 6);
            b0k b0kVar3 = b0kVar2;
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
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
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            b0kVar3.i0(-1610930406);
            int i11 = 0;
            for (Object obj3 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p7h.T();
                    throw null;
                }
                phz0 phz0Var = (phz0) obj3;
                boolean z8 = (phz0Var.g && z5) ? i2 : 0;
                boolean zJ = u890.j(str, phz0Var.a);
                b0k b0kVar4 = b0kVar3;
                String str2 = str;
                qhz0 qhz0Var = new qhz0(f, i11, zJ, (str == null || ihc1.y0(str)) ? i2 : 0, (z3 ? ((Number) ven0VarR.getValue()).floatValue() : 1.0f) * ((z8 != 0 || zJ) ? 1.0f : 0.0f), z3, z8, z6, z5);
                boolean z9 = z8;
                int i13 = i11;
                int i14 = (b0kVar4.g(ven0VarP) ? 1 : 0) | (b0kVar4.h(z9) ? 1 : 0) | ((i4 & 3670016) == 1048576 ? i2 : 0);
                Object objT4 = b0kVar4.T();
                Object obj4 = objT4;
                if (i14 != 0 || objT4 == m4cVar) {
                    nxx nxxVar = new nxx(z9, z3, ven0VarP);
                    b0kVar4.s0(nxxVar);
                    obj4 = nxxVar;
                }
                nim0 nim0Var = nim0.a;
                omo1.d(phz0Var, qhz0Var, iu30Var, u291.h(i541.C(nim0Var, (iu30) obj4), f), b0kVar4, (i4 >> 9) & 896);
                if (i13 < list.size() - 1) {
                    v8i0.i(f2, -853940150, b0kVar4, b0kVar4, nim0Var);
                    b0kVar4.r(false);
                } else {
                    b0kVar4.i0(-853888256);
                    b0kVar4.r(false);
                }
                z5 = z;
                z6 = z2;
                b0kVar3 = b0kVar4;
                i11 = i12;
                str = str2;
            }
            f3 = f;
            z4 = z3;
            b0kVar2 = b0kVar3;
            b0kVar2.r(false);
            b0kVar2.r(i2);
        } else {
            f3 = f;
            z4 = z3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mhz0(rhz0Var, z, f3, f2, z2, iu30Var, z4, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void g(boolean z, Function0 function0, boolean z2, Function0 function1, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z3;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        n9d1 n9d1Var;
        n9d1 n9d1Var2;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(122067981);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(function1) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                boolean z4 = !z || z2;
                if (z) {
                    n9d1Var = new n9d1(1, function0, vjx.c);
                } else {
                    n9d1Var = null;
                }
                if (z2) {
                    n9d1Var2 = new n9d1(1, function1, irx.c);
                } else {
                    n9d1Var2 = null;
                }
                puo1.c(u291.f(qim0Var4, 1.0f), n9d1Var, n9d1Var2, z4, apo.r(-1924858825, new j2r0(j2iVar, (byte) 10), x340Var), x340Var, 24576, 0);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oli0(z, function0, z2, function1, qim0Var3, j2iVar, i, i2);
            }
        }
        i3 |= 24576;
        qim0Var2 = qim0Var;
        if ((196608 & i) == 0) {
            if (x340Var.i(j2iVar)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (z) {
            }
            if (z) {
                n9d1Var = new n9d1(1, function0, vjx.c);
            } else {
                n9d1Var = null;
            }
            if (z2) {
                n9d1Var2 = new n9d1(1, function1, irx.c);
            } else {
                n9d1Var2 = null;
            }
            puo1.c(u291.f(qim0Var4, 1.0f), n9d1Var, n9d1Var2, z4, apo.r(-1924858825, new j2r0(j2iVar, (byte) 10), x340Var), x340Var, 24576, 0);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oli0(z, function0, z2, function1, qim0Var3, j2iVar, i, i2);
        }
    }

    public static final void h(boolean z, Function0 function0, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-467821341);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = oa41.R0;
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            g(z, function0, false, (Function0) objT, qim0Var3, j2iVar, x340Var, (i2 & 112) | (i2 & 14) | 3456 | 221184, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kb51(z, function0, qim0Var2, j2iVar, i, (byte) 0);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1828124289);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0Var, cbx.a(x340Var2).a.a.a(), er31.c(16.0f, 16.0f, 0.0f, 0.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131958341);
            lee1 lee1Var = cbx.d(x340Var2).g;
            long j = cbx.a(x340Var2).b.b;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, wnb0Var), lee1Var, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            String strO1 = cwl1.o0(x340Var2, 2131958340);
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 17);
                x340Var2.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO1), function1);
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var2);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            foo1.c(gbxVar, idxVar, uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), null, gdxVarS, null, null, null, ozi.b, null, ozi.c, x340Var2, 805306368, 48, 1496);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var, i, (byte) 11);
        }
    }

    public static final iu30 k(op80 op80Var) {
        h3h1 h3h1VarC;
        iu30 iu30Var;
        return (op80Var == null || (h3h1VarC = j0o1.C(op80Var)) == null || (iu30Var = h3h1VarC.b) == null) ? dw81.Q0 : iu30Var;
    }

    public static final int l(op80 op80Var) {
        Integer numN;
        if (op80Var == null || (numN = l0o1.n(op80Var)) == null) {
            return 0;
        }
        return numN.intValue();
    }

    public static byte[] m(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    public static final rzc n(j7b0 j7b0Var, boolean z) throws i9n {
        n690 g0dVar;
        n690 n690Var;
        boolean zD;
        u7b0 u7b0VarT = j7b0Var.t();
        boolean z2 = u1p1.z(u7b0VarT);
        w3b0 w3b0Var = u7b0VarT.e;
        if (z2) {
            return ehe1.a;
        }
        wdg wdgVar = u7b0VarT.b;
        ija0 ija0Var = z ? don1.v(w3b0Var).c : don1.v(w3b0Var).d;
        Method methodZ = ija0Var != null ? wdgVar.z(ija0Var.c, ija0Var.d) : null;
        if (methodZ == null) {
            if (yxo1.D(u7b0VarT) && u7b0VarT.getVisibility() == xma0.c) {
                Class clsL = yxo1.L(((hc11) o7h.V0(u7b0VarT.getParameters())).t());
                if (clsL == null) {
                    throw new i9n("Underlying property of inline class " + u7b0VarT + " should have a field");
                }
                Method methodY = yxo1.y(clsL, u7b0VarT);
                n690Var = fc11.N(j7b0Var) ? new n690(methodY, fc11.A(j7b0Var.t())) : new o690(methodY);
            } else {
                Field fieldQ = u7b0VarT.q();
                if (fieldQ == null) {
                    mna0.d(u7b0VarT, "No accessors or field is found for property ");
                    return null;
                }
                if ((wdgVar instanceof bla0) && ((bla0) wdgVar).N() == ieg.h) {
                    tka0 tka0VarB = rc11.a.b(((tka0) wdgVar).n().getEnclosingClass());
                    bla0 bla0Var = tka0VarB instanceof bla0 ? (bla0) tka0VarB : null;
                    if (bla0Var == null) {
                        zD = false;
                    } else if (bla0Var.N() == ieg.c || bla0Var.N() == ieg.f) {
                        mgc mgcVar = hia0.b;
                        mma0 mma0Var = hia0.a[6];
                        zD = mgcVar.D(w3b0Var);
                    } else {
                        zD = true;
                    }
                } else {
                    zD = false;
                }
                if (!zD && Modifier.isStatic(fieldQ.getModifiers())) {
                    o(j7b0Var);
                    g0dVar = z ? new yzc(fieldQ, false, (byte) 2) : new c0d(fieldQ, !bpi1.j(u7b0VarT.getReturnType()), false, (byte) 2);
                } else if (z) {
                    g0dVar = fc11.N(j7b0Var) ? new wzc(fieldQ, fc11.A(j7b0Var.t())) : new yzc(fieldQ, true, (byte) 0);
                } else {
                    g0dVar = fc11.N(j7b0Var) ? new a0d(fieldQ, !bpi1.j(u7b0VarT.getReturnType()), fc11.A(j7b0Var.t())) : new c0d(fieldQ, !bpi1.j(u7b0VarT.getReturnType()), true, (byte) 0);
                }
            }
            return yxo1.u(z6x.a, n690Var, j7b0Var, false);
        }
        if (Modifier.isStatic(methodZ.getModifiers())) {
            o(j7b0Var);
            g0dVar = fc11.N(j7b0Var) ? new g0d(methodZ, false, fc11.A(j7b0Var.t())) : new h0d(methodZ, (byte) 2);
        } else {
            g0dVar = fc11.N(j7b0Var) ? new e0d(methodZ, fc11.A(j7b0Var.t())) : new h0d(methodZ, (byte) 0);
        }
        n690Var = g0dVar;
        return yxo1.u(z6x.a, n690Var, j7b0Var, false);
    }

    public static final void o(j7b0 j7b0Var) {
        if (j7b0Var.t().b instanceof ema0) {
            return;
        }
        bhn0.s(j7b0Var, "Only top-level properties are supported for now: ");
    }

    public static j16 p(String str) {
        if (str == null || str.equals("JOIN")) {
            return j16.a;
        }
        return str.equals("UPGRADE") ? j16.b : j16.c;
    }

    public static final xr6 q(avl1 avl1Var) {
        return new xr6(avl1Var.getClass().getName());
    }

    public static final seo0 r(cvl1 cvl1Var) {
        return new seo0(cvl1Var.getClass().getName());
    }

    public static final boolean s(ContextTrack contextTrack) {
        if (!l4o1.V(contextTrack) && !Boolean.parseBoolean((String) contextTrack.metadata().get("mft.externally_injected"))) {
            String str = (String) contextTrack.metadata().get("provider");
            List listM = p7h.M(new String[]{"album/inject_filler_tracks", "mft-lens/mft/inject_filler_tracks/fallback"});
            if ((listM instanceof Collection) && listM.isEmpty()) {
                return false;
            }
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                if (nhc1.S((String) it.next(), str, true)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final thi1 t(Throwable th) {
        boolean z = th instanceof UnknownHostException;
        m2f1 m2f1Var = m2f1.a;
        wgz wgzVar = wgz.a;
        return z ? new thi1(new wsb1(2131956572, 2131956571, true, 2, wgzVar), m2f1Var) : new thi1(new wsb1(2131956570, 2131956567, true, 1, wgzVar), m2f1Var);
    }

    public static hmy0 u(byte[] bArr) {
        UUID[] uuidArr;
        izr0 izr0Var = new izr0(bArr);
        if (izr0Var.c < 32) {
            return null;
        }
        izr0Var.R(0);
        int iA = izr0Var.a();
        int iQ = izr0Var.q();
        if (iQ != iA) {
            oon1.H("Advertised atom size (" + iQ + ") does not match buffer size: " + iA);
            return null;
        }
        int iQ2 = izr0Var.q();
        if (iQ2 != 1886614376) {
            td6.p(iQ2, "Atom type is not pssh: ");
            return null;
        }
        int iE = e2c.e(izr0Var.q());
        if (iE > 1) {
            td6.p(iE, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(izr0Var.y(), izr0Var.y());
        if (iE == 1) {
            int I = izr0Var.I();
            uuidArr = new UUID[I];
            for (int i = 0; i < I; i++) {
                uuidArr[i] = new UUID(izr0Var.y(), izr0Var.y());
            }
        } else {
            uuidArr = null;
        }
        int I2 = izr0Var.I();
        int iA2 = izr0Var.a();
        if (I2 == iA2) {
            byte[] bArr2 = new byte[I2];
            izr0Var.o(0, bArr2, I2);
            return new hmy0(uuid, iE, bArr2, uuidArr);
        }
        oon1.H("Atom data size (" + I2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] v(UUID uuid, byte[] bArr) {
        hmy0 hmy0VarU = u(bArr);
        if (hmy0VarU == null) {
            return null;
        }
        UUID uuid2 = hmy0VarU.a;
        if (uuid.equals(uuid2)) {
            return hmy0VarU.c;
        }
        oon1.H("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static final EventSource w(Flowable flowable, Observable observable) {
        return RxEventSources.a(new ObservableSource[]{new ObservableFromPublisher(flowable.J(mif1.c1).t(Functions.a)), observable.filter(ns80.g1).map(bya0.c1)});
    }

    public static final void x(String str, op80 op80Var) {
        if (op80Var == null) {
            l1d.z("InstrumentationEnvironment must not be null in element ", str, ". Please make sure you have properly configured the environment.");
        }
        if ((op80Var != null ? mno1.C(op80Var) : null) == null) {
            l1d.z("InstrumentationEnvironment.ubiEventFactory must not be null in element ", str, ". Did you forget to add it to your environment?");
        }
    }

    public static final tv80 y(tqw tqwVar) {
        tv80 tv80Var = (tv80) tqwVar.a(rc11.a.b(tv80.class));
        if (tv80Var != null) {
            return tv80Var;
        }
        eg.m("ElementInteractionResult does not contain ubi information. Expected InteractionLoggingResult.");
        return null;
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
