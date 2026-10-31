package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import com.spotify.mobius.Next;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class lvx {
    public static final jm a = new jm("CLOSED", (byte) 5);
    public static b180 b;
    public static b180 c;

    public static Next A(kak0 kak0Var, k3k0 k3k0Var) {
        Boolean bool = k3k0Var.a;
        return bool != null ? Next.h(kak0.a(kak0Var, (pdm0) null, bool, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -33, 1048575)) : Next.j();
    }

    public static final void a(String str, iu30 iu30Var, ven0 ven0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        y7e1 y7e1Var;
        Object ur1Var;
        tob1 tob1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(514586910);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(ven0Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            y7e1 y7e1VarD = c4p1.D(0, 3, (String) null, b0kVar3);
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            az20 az20Var = (az20) b0kVar3.k(t4k.i);
            String strO0 = cwl1.o0(b0kVar3, 2131962622);
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT2;
            if (z) {
                b0kVar3.i0(1320934507);
                boolean zI = b0kVar3.i(lz20Var) | b0kVar3.i(k6a1Var);
                Object objT3 = b0kVar3.T();
                if (zI || objT3 == obj) {
                    objT3 = new j43(lz20Var, k6a1Var, null);
                    b0kVar3.s0(objT3);
                }
                qxd0.t(rih1.a, b0kVar3, (vu30) objT3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1321081540);
                b0kVar3.r(false);
            }
            CharSequence charSequence = y7e1VarD.d().d;
            boolean zI2 = b0kVar3.i(y7e1VarD);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == obj) {
                objT4 = new kk(y7e1VarD, (lnm) null, (byte) 7);
                b0kVar3.s0(objT4);
            }
            qxd0.t(charSequence, b0kVar3, (vu30) objT4);
            Object value = ven0Var.getValue();
            int i3 = i2 & 112;
            boolean zI3 = b0kVar3.i(ven0Var) | b0kVar3.i(y7e1VarD) | b0kVar3.i(tob1Var2) | (i3 == 32) | b0kVar3.g(strO0);
            Object objT5 = b0kVar3.T();
            if (zI3 || objT5 == obj) {
                y7e1Var = y7e1VarD;
                tob1Var = tob1Var2;
                ur1Var = new ur1(ven0Var, y7e1Var, iu30Var, strO0, tob1Var, (lnm) null);
                b0kVar3.s0(ur1Var);
            } else {
                tob1Var = tob1Var2;
                y7e1Var = y7e1VarD;
                ur1Var = objT5;
            }
            qxd0.t(value, b0kVar3, (vu30) ur1Var);
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                b0kVar3.i0(1321890082);
                b0kVar3.i0(596834415);
                float fM0 = ((wat) b0kVar3.k(t4k.h)).M0((int) (((crl1) b0kVar3.k(t4k.u)).a() >> 32));
                b0kVar3.r(false);
                boolean z2 = p3v.b(fM0, 600.0f) >= 0;
                Object objT6 = b0kVar3.T();
                if (objT6 == obj) {
                    objT6 = ou1.Q0;
                    b0kVar3.s0(objT6);
                }
                i3u i3uVar = new i3u(2, false, false, z2);
                j2i j2iVarR = apo.r(638419925, new sm(iu30Var2, (byte) 7), b0kVar3);
                b0kVar2 = b0kVar3;
                anm1.a((Function0) objT6, i3uVar, j2iVarR, b0kVar2, 390, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(1322660804);
                b0kVar2.r(false);
            }
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            cr31 cr31VarB = er31.b(16.0f);
            qim0Var2 = nim0.a;
            qim0 qim0VarQ = i1p1.q(qim0Var2, cr31VarB);
            if (z) {
                qim0VarQ = qim0VarQ.then(vby0.p(qim0Var2, lz20Var));
            }
            lee1 lee1Var = cbx.d(b0kVar2).g;
            zzq0 zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
            y7e1 y7e1Var2 = y7e1Var;
            qim0 qim0Var3 = qim0VarQ;
            zxx zxxVar = new zxx(cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).b.b, cbx.a(b0kVar2).b.d, cbx.a(b0kVar2).a.c, cbx.a(b0kVar2).a.c, cbx.a(b0kVar2).b.c, 0L, 896);
            kua0 kua0VarA = kua0.a(kua0.g, 4, (Boolean) null, 119);
            boolean zI4 = b0kVar2.i(y7e1Var2) | (i3 == 32) | b0kVar2.i(k6a1Var) | b0kVar2.i(az20Var);
            Object objT7 = b0kVar2.T();
            if (zI4 || objT7 == obj) {
                objT7 = new k43(iu30Var, y7e1Var2, k6a1Var, az20Var);
                b0kVar2.s0(objT7);
            }
            rwo1.b(y7e1Var2, qim0Var3, (max) null, str, s5i.a, apo.r(395805481, new xd2(ven0Var, (byte) 1), b0kVar2), false, false, (dk80) null, lee1Var, kua0VarA, (yta0) objT7, (e6e1) null, (vu30) null, (idn0) null, (uwg) null, (es41) null, zzq0Var, 0.0f, false, zxxVar, b0kVar2, ((i2 << 9) & 7168) | 221184, 0, 913860);
        } else {
            iu30Var2 = iu30Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((byte) 3, i, str, iu30Var2, ven0Var, qim0Var2, z);
        }
    }

    public static final void b(lrk lrkVar, tgk tgkVar, float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(261102248);
        int i2 = i | (x340Var.i(lrkVar) ? 4 : 2) | (x340Var.i(tgkVar) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.d(f2) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            d36 d36Var = new d36(f2, true, new um5(false));
            zzq0 zzq0VarH = uyn1.h(2, f, 0.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), 142.0f);
            boolean zI = x340Var.i(lrkVar) | x340Var.i(tgkVar);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new kjk(lrkVar, tgkVar, (byte) 3);
                x340Var.s0(objT);
            }
            s3o1.e(qim0VarH, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, (h3h1) null, (iu30) objT, x340Var, 0, 234);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ub9(lrkVar, tgkVar, f, f2, qim0Var2, i);
        }
    }

    public static final void c(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2075665721);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            String strN0 = cwl1.n0(2131957047, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = ((vex) zex.a.e).m;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(strN0, uyn1.B(qim0Var3, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, j, new a0e1(6), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 5, i, i2, i3, qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    public static final void d(zaw0 zaw0Var, Function0 function0, boolean z, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        String strA;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        Object objT;
        qim0 qim0Var3;
        boolean zG;
        Object objT2;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        m4c m4cVar = fkj0.X;
        miw0 miw0Var = zaw0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-377415074);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zaw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            if (miw0Var instanceof jiw0) {
                i3 = -2043919875;
                i4 = 2131960403;
            } else if (miw0Var instanceof kiw0) {
                i3 = -2043915812;
                i4 = 2131960402;
            } else {
                if (miw0Var instanceof liw0) {
                    i3 = -2043911524;
                    i4 = 2131960407;
                } else if (miw0Var instanceof miw0) {
                    x340Var.i0(-2043907420);
                    strA = cwl1.n0(2131960409, new Object[]{miw0Var.b}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2043904333);
                    x340Var.r(false);
                    strA = miw0Var.a();
                }
                if (!(miw0Var instanceof hiw0) || (miw0Var instanceof niw0)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                pm31 pm31Var = new pm31(0);
                if ((57344 & i5) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new h7w0(iu30Var, (byte) 1);
                    x340Var.s0(objT);
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarN = anm1.N("PreviewButton", bin.x(qim0Var3, z2, (String) null, pm31Var, (idn0) null, (Function0) objT, 10));
                zG = x340Var.g(strA);
                objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new zqu0(strA, (byte) 13);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT2);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarA);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                fiw0.a(miw0Var, function0, z, null, false, x340Var, i5 & 1008, 24);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
            strA = x0d.k(x340Var, i3, i4, x340Var, false);
            if (miw0Var instanceof hiw0) {
                z2 = false;
            } else {
                z2 = false;
            }
            pm31 pm31Var2 = new pm31(0);
            if ((57344 & i5) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT = x340Var.T();
            if (z3) {
                objT = new h7w0(iu30Var, (byte) 1);
                x340Var.s0(objT);
            } else {
                objT = new h7w0(iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarN2 = anm1.N("PreviewButton", bin.x(qim0Var3, z2, (String) null, pm31Var2, (idn0) null, (Function0) objT, 10));
            zG = x340Var.g(strA);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new zqu0(strA, (byte) 13);
                x340Var.s0(objT2);
            } else {
                objT2 = new zqu0(strA, (byte) 13);
                x340Var.s0(objT2);
            }
            qim0 qim0VarA2 = s161.a(qim0VarN2, (iu30) objT2);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarA2);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            fiw0.a(miw0Var, function0, z, null, false, x340Var, i5 & 1008, 24);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(zaw0Var, function0, z, qim0Var2, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    public static Object e(kbf0 kbf0Var, fcf0 fcf0Var, int i, boolean z, float f, bcf0 bcf0Var, float f2, boolean z2, a8d1 a8d1Var, int i2) {
        float f3;
        int iE = kbf0Var.e();
        int iIntValue = (i2 & 4) != 0 ? ((Number) kbf0Var.c.getValue()).intValue() : i;
        boolean zBooleanValue = (i2 & 8) != 0 ? ((Boolean) kbf0Var.d.getValue()).booleanValue() : z;
        float fI = (i2 & 16) != 0 ? kbf0Var.i() : f;
        bcf0 bcf0VarC = (i2 & 32) != 0 ? kbf0Var.c() : bcf0Var;
        if ((i2 & 64) != 0) {
            float fB = 0.0f;
            if (fI < 0.0f && fcf0Var == null) {
                fB = 1.0f;
            } else if (fcf0Var != null) {
                if (fI < 0.0f) {
                    if (bcf0VarC != null) {
                        fB = bcf0VarC.a(fcf0Var);
                    } else {
                        fB = 1.0f;
                    }
                } else if (bcf0VarC != null) {
                    fB = bcf0VarC.b(fcf0Var);
                }
            }
            f3 = fB;
        } else {
            f3 = f2;
        }
        Object objA = kbf0Var.O0.a(hfn0.a, new hbf0(kbf0Var, iE, iIntValue, zBooleanValue, fI, bcf0VarC, fcf0Var, f3, false, (i2 & 128) != 0 ? false : z2, 1, (lnm) null), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    public static final csk f(csk cskVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = csk.a;
            cskVar.getClass();
            Object objectVolatile = avg.a.getObjectVolatile(cskVar, csk.c);
            jm jmVar = a;
            if (objectVolatile == jmVar) {
                return cskVar;
            }
            csk cskVar2 = (csk) objectVolatile;
            if (cskVar2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = csk.a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(cskVar, null, jmVar)) {
                    if (atomicReferenceFieldUpdater2.get(cskVar) != null) {
                    }
                }
                return cskVar;
            }
            cskVar = cskVar2;
        }
    }

    public static Intent g(Context context, String str, String str2, u3u u3uVar) {
        Intent intent = new Intent(context, (Class<?>) SocialListeningInfoDialogActivity.class);
        intent.putExtra("title", str);
        if (str2 != null) {
            intent.putExtra("subtitle", str2);
        }
        intent.putExtra("type", (Parcelable) u3uVar);
        return intent;
    }

    public static final Object h(hp51 hp51Var, long j, vu30 vu30Var) {
        while (true) {
            if (hp51Var.e >= j && !hp51Var.d()) {
                return hp51Var;
            }
            Object objectVolatile = avg.a.getObjectVolatile(hp51Var, csk.c);
            jm jmVar = a;
            if (objectVolatile == jmVar) {
                return jmVar;
            }
            hp51 hp51Var2 = (hp51) ((csk) objectVolatile);
            if (hp51Var2 == null) {
                hp51Var2 = (hp51) vu30Var.invoke(Long.valueOf(hp51Var.e + 1), hp51Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = csk.a;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hp51Var, null, hp51Var2)) {
                        if (hp51Var.d()) {
                            hp51Var.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(hp51Var) == null);
            }
            hp51Var = hp51Var2;
        }
    }

    public static Object i(rjm0 rjm0Var, Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, rjm0Var);
    }

    public static m8n j(rjm0 rjm0Var, n8n n8nVar) {
        return ilo1.u(rjm0Var, n8nVar);
    }

    public static final Map k(s4b1 s4b1Var) {
        LinkedHashMap linkedHashMap;
        Set<String> queryParameterNames;
        Uri uri = s4b1Var.a;
        if (uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null) {
            linkedHashMap = null;
        } else {
            Set<String> set = queryParameterNames;
            int iS = zno1.s(q7h.U(set, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
            for (String str : set) {
                String queryParameter = uri.getQueryParameter(str);
                linkedHashMap2.put(str, queryParameter != null ? nhc1.W(queryParameter, "/", ":") : null);
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap != null ? linkedHashMap : null;
        return linkedHashMap3 == null ? b7x.a : linkedHashMap3;
    }

    public static String l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.waze", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final o3r m() {
        return w3p1.o(new l4r(jd0.x, 2, o390.R0, new j4r(o390.T0), o390.S0), o390.U0);
    }

    public static final void n(ViewGroup viewGroup) {
        WeakHashMap weakHashMap = b8k1.a;
        viewGroup.isImportantForAccessibility();
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
    }

    public static o8n o(rjm0 rjm0Var, n8n n8nVar) {
        return ilo1.z(rjm0Var, n8nVar);
    }

    public static o8n p(rjm0 rjm0Var, o8n o8nVar) {
        return flo1.l(rjm0Var, o8nVar);
    }

    public static final tcf1 q(boolean z, boolean z2, boolean z3, int i, String str, int i2, Function0 function0, Function0 function1, b0k b0kVar, int i3) {
        dlv dlvVar;
        m4c m4cVar = fkj0.X;
        int i4 = (i3 & 32) != 0 ? 1 : i2;
        boolean zE = ((x340) b0kVar).e(i) | ((x340) b0kVar).e(l1d.C(i4));
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zE || objT == m4cVar) {
            ceo ceoVar = scf1.a;
            boolean z4 = i4 == 2;
            int i5 = i + (z4 ? 0 : 300);
            rcf1 rcf1Var = new rcf1(z4 ? new qcf1(i + 100, 700) : new qcf1(i, 300), new qcf1(i5 + 100, 700), new qcf1(i5 + 200, 700), new qcf1(i5 + 300, 700), new qcf1(i5 + 1000, 1000));
            x340Var.s0(rcf1Var);
            objT = rcf1Var;
        }
        rcf1 rcf1Var2 = (rcf1) objT;
        qcf1 qcf1Var = rcf1Var2.b;
        dlv dlvVar2 = scf1.a;
        ven0 ven0VarR = r(z, str, z3, z2, "rank-entry", qcf1Var, dlvVar2, null, x340Var, 390, 8);
        boolean zG = x340Var.g(ven0VarR);
        Object objT2 = x340Var.T();
        if (zG || objT2 == m4cVar) {
            objT2 = yv91.a(new bu2(ven0VarR, (byte) 26));
            x340Var.s0(objT2);
        }
        tob1 tob1Var = (tob1) objT2;
        qcf1 qcf1Var2 = rcf1Var2.a;
        if (i4 == 2) {
            dlvVar = dlvVar2;
        } else {
            ilv.a.getClass();
            dlvVar = flv.h;
        }
        return new tcf1(i4, r(z, str, z3, z2, "visual-entry", qcf1Var2, dlvVar, function0, x340Var, 6, 0), ven0VarR, r(z, str, z3, z2, "song-name-entry", rcf1Var2.c, dlvVar2, null, x340Var, 390, 8), r(z, str, z3, z2, "artist-name-entry", rcf1Var2.d, dlvVar2, null, x340Var, 390, 8), r(z, str, z3, z2, "flavor-text-entry", rcf1Var2.e, scf1.b, function1, x340Var, 390, 0), tob1Var);
    }

    public static final ven0 r(boolean z, String str, boolean z2, boolean z3, String str2, qcf1 qcf1Var, dlv dlvVar, Function0 function0, b0k b0kVar, int i, int i2) {
        Function0 function1;
        Float fValueOf = Float.valueOf(0.0f);
        m4c m4cVar = fkj0.X;
        if ((i2 & 8) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = q9f1.g;
                x340Var.s0(objT);
            }
            function1 = (Function0) objT;
        } else {
            function1 = function0;
        }
        if (!z) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-847577659);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(fValueOf);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            x340Var2.r(false);
            return ven0Var;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-848103946);
        ven0 ven0VarS = zod.S(new hsi1(str + "-" + str2, fValueOf, Float.valueOf(1.0f), new pxg1(qcf1Var.b, qcf1Var.a, dlvVar), rno1.a), z2, z3, function1, x340Var3, (i & 7168) | 8, 0);
        x340Var3.r(false);
        return ven0VarS;
    }

    public static final void s(EncoreListRow encoreListRow, yly ylyVar, gw70 gw70Var, iu30 iu30Var, yky ykyVar) {
        mmy mmyVarB = encoreListRow.getBinding().b();
        if (ylyVar == null) {
            mmyVarB.setVisibility(8);
            return;
        }
        mmyVarB.setVisibility(0);
        mmy mmyVar = !(mmyVarB instanceof mmy) ? null : mmyVarB;
        if (mmyVar != null) {
            mmyVar.f(ylyVar);
            return;
        }
        mmy mmyVar2 = new mmy(encoreListRow.getContext());
        mmyVar2.setViewContext(new f47(gw70Var));
        mmyVar2.V0.a(ylyVar);
        if (iu30Var != null) {
            w(mmyVar2, iu30Var, ykyVar);
        }
        k8p1.o(mmyVarB, mmyVar2);
    }

    public static final void t(View view, float f) {
        if (f == 0.0f) {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            view.setClipToOutline(false);
        } else {
            xnn xnnVar = new xnn((byte) 6, f);
            view.setClipToOutline(true);
            view.setOutlineProvider(new hr31(xnnVar, (byte) 0));
        }
    }

    public static final void u(ArtworkView artworkView, Function0 function0) {
        if (((Number) function0.invoke()).floatValue() == 0.0f) {
            artworkView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            artworkView.setClipToOutline(false);
        } else {
            artworkView.setClipToOutline(true);
            artworkView.setOutlineProvider(new hr31(function0, (byte) 0));
        }
    }

    public static final void v(fcy fcyVar, iu30 iu30Var, Function0 function0) {
        fcyVar.n(new d(iu30Var, function0, (byte) 8));
    }

    public static final void w(mmy mmyVar, iu30 iu30Var, Function0 function0) {
        mmyVar.n(new hvw(iu30Var, function0, (byte) 1));
    }

    public static final void x(mi90 mi90Var, iu30 iu30Var, Function0 function0) {
        mi90Var.n(new hvw(iu30Var, function0, (byte) 2));
    }

    public static Object y(kbf0 kbf0Var, fcf0 fcf0Var, float f, a8d1 a8d1Var, int i) {
        if ((i & 1) != 0) {
            fcf0Var = kbf0Var.d();
        }
        Object objA = kbf0Var.O0.a(hfn0.a, new jbf0(kbf0Var, fcf0Var, f, (i & 4) != 0 ? kbf0Var.e() : 1, !(f == kbf0Var.f()), (lnm) null), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    public static final void z(kd31 kd31Var, float f) {
        kd31Var.b(f);
        kd31Var.i(2);
        kd31Var.E(kd31Var.T0.h() * scf1.c * (1.0f - f));
    }
}
