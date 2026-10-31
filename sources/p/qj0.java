package p;

import android.net.Uri;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qj0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final rqw b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final mqw f;

    public qj0(gw70 gw70Var, x3q x3qVar, wj0 wj0Var, fj0 fj0Var, i01 i01Var, ao0 ao0Var, op0 op0Var) {
        dj0 dj0Var;
        this.a = (byte) 0;
        this.d = gw70Var;
        this.e = op0Var;
        nj0 nj0Var = nj0.a;
        n4 n4Var = n4.c;
        switch (x3qVar.a) {
            case 0:
                thq thqVar = x3qVar.b;
                daq daqVar = thqVar.b;
                q8n q8nVar = (q8n) daqVar.V2.get();
                v5q v5qVar = thqVar.c;
                dj0Var = new dj0(fj0Var, i01Var, q8nVar, (pxc) v5qVar.f5.get(), (ao0) daqVar.Hk.get(), (i44) v5qVar.h5.get());
                break;
            default:
                thq thqVar2 = x3qVar.b;
                daq daqVar2 = thqVar2.b;
                q8n q8nVar2 = (q8n) daqVar2.V2.get();
                teq teqVar = thqVar2.c;
                dj0Var = new dj0(fj0Var, i01Var, q8nVar2, (pxc) teqVar.t7.get(), (ao0) daqVar2.Hk.get(), (i44) teqVar.v7.get());
                break;
        }
        this.f = sbl.A(nj0Var, n4Var, dj0Var, e3.O0, new oj0(ao0Var, (byte) 1));
        this.b = n3o1.q(this).a(n1.X0, n1.Y0);
        j2i j2iVar = new j2i(699194889, new pj0(i01Var, wj0Var, this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        eih1 eih1Var = this.b;
        switch (b) {
            case 0:
                return (ia00) eih1Var;
            case 1:
                return (ia00) eih1Var;
            case 2:
                return eih1Var;
            case 3:
                return (ia00) eih1Var;
            case 4:
                return (hy00) eih1Var;
            case 5:
                return (ia00) eih1Var;
            case 6:
                return eih1Var;
            case 7:
                return (ia00) eih1Var;
            case 8:
                return (ia00) eih1Var;
            case 9:
                return (ia00) eih1Var;
            case 10:
                return (hy00) eih1Var;
            case 11:
                return (ia00) eih1Var;
            case 12:
                return (ia00) eih1Var;
            case 13:
                return (ia00) eih1Var;
            case 14:
                return (ia00) eih1Var;
            case 15:
                return (ia00) eih1Var;
            case 16:
                return (ia00) eih1Var;
            case 17:
                return (ia00) eih1Var;
            case 18:
                return (ia00) eih1Var;
            case 19:
                return eih1Var;
            case 20:
                return (hy00) eih1Var;
            case 21:
                return (ia00) eih1Var;
            case 22:
                return (hy00) eih1Var;
            case 23:
                return (wrm) eih1Var;
            case 24:
                return (hy00) eih1Var;
            case 25:
                return (ia00) eih1Var;
            case 26:
                return (ia00) eih1Var;
            case 27:
                return eih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return eih1Var;
            default:
                return eih1Var;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                break;
        }
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void e(bgg0 bgg0Var, na9 na9Var, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z2;
        Uri uri;
        hax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1221780818);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(bgg0Var) : x340Var.i(bgg0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(na9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (bgg0Var instanceof zfg0) {
                x340Var.i0(-418459929);
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0Var3 = qim0Var4;
                z2 = true;
                uwo1.e(cwl1.o0(x340Var, 2131961886), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                String strO0 = cwl1.o0(x340Var, 2131961887);
                boolean z4 = (i3 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z4 || objT == fkj0.X) {
                    objT = new tze0(function0, (byte) 14);
                    x340Var.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strO0), function1);
                jdx jdxVar = jdx.c;
                gdx gdxVarS = yla.s(x340Var);
                if (z) {
                    x340Var.i0(2000063117);
                    haxVar = new hax(cwl1.o0(x340Var, 2131961888));
                    x340Var.r(false);
                } else {
                    x340Var.i0(2000275560);
                    x340Var.r(false);
                    haxVar = jax.a;
                }
                foo1.c(gbxVar, jdxVar, (qim0) null, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fzi.a, x340Var, 0, 48, 1996);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                z2 = true;
                if (!(bgg0Var instanceof agg0)) {
                    throw p3d1.k(x340Var, -1676066783, false);
                }
                x340Var.i0(-416867707);
                List list = ((agg0) bgg0Var).a;
                if (list.isEmpty()) {
                    x340Var.i0(-416838722);
                    String strO1 = cwl1.o0(x340Var, 2131961885);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).j;
                    long j = cbx.a(x340Var).b.b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    uwo1.e(strO1, uyn1.x(qim0Var3, 16.0f), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-416520135);
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        t7g0 t7g0Var = (t7g0) obj;
                        String str = t7g0Var.a;
                        String str2 = t7g0Var.b;
                        int i6 = t7g0Var.c;
                        String str3 = t7g0Var.d;
                        if (str3 == null || (uri = Uri.parse(str3)) == null) {
                            uri = Uri.EMPTY;
                        }
                        Uri uri2 = uri;
                        uri2.getClass();
                        int i7 = t7g0Var.f;
                        Integer num = t7g0Var.e;
                        otw.c(na9Var, new meg0(i4, str, str2, i6, uri2, i7, num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.k), (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
                        i4 = i5;
                    }
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(this, bgg0Var, na9Var, z, function0, qim0Var2, i, (byte) 20);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        rey0 rey0Var = this.f;
        switch (b) {
            case 0:
                return (e7m0) rey0Var;
            case 1:
                return rey0Var;
            case 2:
                return (ljm0) rey0Var;
            case 3:
                return (js20) rey0Var;
            case 4:
                return rey0Var;
            case 5:
                return rey0Var;
            case 6:
                return (js20) rey0Var;
            case 7:
                return rey0Var;
            case 8:
                return rey0Var;
            case 9:
                return rey0Var;
            case 10:
                return rey0Var;
            case 11:
                return rey0Var;
            case 12:
                return rey0Var;
            case 13:
                return (k8d1) rey0Var;
            case 14:
                return rey0Var;
            case 15:
                return rey0Var;
            case 16:
                return rey0Var;
            case 17:
                return (js20) rey0Var;
            case 18:
                return rey0Var;
            case 19:
                return (js20) rey0Var;
            case 20:
                return rey0Var;
            case 21:
                return (e7m0) rey0Var;
            case 22:
                return rey0Var;
            case 23:
                return rey0Var;
            case 24:
                return (js20) rey0Var;
            case 25:
                return rey0Var;
            case 26:
                return (js20) rey0Var;
            case 27:
                return rey0Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return rey0Var;
            default:
                return rey0Var;
        }
    }

    public qj0(xpw xpwVar, vu30 vu30Var) {
        this.a = (byte) 28;
        this.d = xpwVar;
        this.e = vu30Var;
        this.f = xpwVar.getBehavior();
        this.b = xpwVar.a();
        j2i j2iVar = new j2i(-1261405194, new hmk0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(ja8 ja8Var, her herVar) {
        this.a = (byte) 19;
        this.d = ja8Var;
        this.e = herVar;
        this.f = x3p1.n(new rkv(this, (byte) 0), jkv.Z, fdv.g, (o8n) null, new rkv(this, (byte) 1), 8);
        this.b = new eih1();
        j2i j2iVar = oki.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(urk0 urk0Var, res resVar) {
        this.a = (byte) 11;
        this.d = urk0Var;
        this.e = resVar;
        this.f = k1o1.p();
        this.b = n3o1.q(this).a(new cml(this, (byte) 11), fdm.Y0);
        j2i j2iVar = new j2i(1983258496, new bfm(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(z710 z710Var, vbl0 vbl0Var) {
        this.a = (byte) 18;
        this.d = z710Var;
        this.e = vbl0Var;
        this.f = new rey0(new oat(this, (byte) 1));
        this.b = n3o1.q(this).a(new k9s(this, (byte) 7), v0t.O0);
        j2i j2iVar = cji.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(q4d q4dVar, ems0 ems0Var) {
        this.a = (byte) 6;
        this.d = q4dVar;
        this.e = ems0Var;
        this.f = z0o1.k(q4dVar.c, wnb.N0, new m4d(this, (byte) 0), 4);
        this.b = new eih1();
        j2i j2iVar = nai.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(jpg0 jpg0Var, lzn0 lzn0Var) {
        this.a = (byte) 5;
        this.d = jpg0Var;
        this.e = lzn0Var;
        this.f = new rey0(new ub3(this, (byte) 19));
        this.b = n3o1.q(this).a(d27.e1, jb8.b);
        j2i j2iVar = new j2i(-1179459433, new i43(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(ynb0 ynb0Var, yqg yqgVar) {
        this.a = (byte) 23;
        this.d = ynb0Var;
        this.e = yqgVar;
        this.f = k1o1.p();
        this.b = new wrm((byte) 2);
        j2i j2iVar = new j2i(-839813343, new wv60(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(yvk0 yvk0Var, Function0 function0) {
        this.a = (byte) 1;
        this.d = yvk0Var;
        this.e = function0;
        this.f = k1o1.p();
        this.b = n3o1.q(this).a(new m3(this, (byte) 2), n1.f);
        j2i j2iVar = new j2i(889282348, new r1(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(sp00 sp00Var, b0a0 b0a0Var, j2i j2iVar) {
        this.a = (byte) 21;
        this.d = b0a0Var;
        this.e = j2iVar;
        qo50 qo50Var = new qo50(false, (String) null, z6x.a, (phx) null, -7829368, false, false, false, 0, false);
        drm1 drm1Var = new drm1((byte) 20);
        co50 co50Var = (co50) sp00Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(lo50.class, new od30(co50Var, (byte) 15), co50Var.b);
        this.f = sbl.B(qo50Var, drm1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), bp30.e1, new zi50(sp00Var, (byte) 2));
        this.b = n3o1.q(this).a(vn50.d, vn50.e);
        j2i j2iVar2 = new j2i(-455885542, new zq30(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar2, (byte) 0);
    }

    public qj0(lzn0 lzn0Var) {
        this.a = (byte) 25;
        this.d = lzn0Var;
        this.e = nik1.b2.a;
        this.f = new rey0(new k2d0(this, (byte) 28));
        this.b = n3o1.q(this).a(clf0.b, new kmd0(this, (byte) 16));
        j2i j2iVar = dyi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(los losVar, up90 up90Var) {
        this.a = (byte) 22;
        this.d = up90Var;
        this.e = new svh0(losVar, (byte) 16);
        this.f = new rey0(new yy80(this, (byte) 6));
        this.b = n3o1.r(this).c(rb80.T0, rb80.U0);
        j2i j2iVar = new j2i(689441952, new wv60(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(urk0 urk0Var, di4 di4Var, iu30 iu30Var) {
        this.a = (byte) 8;
        this.d = di4Var;
        this.e = iu30Var;
        this.b = n3o1.q(this).a(new z63(urk0Var, (byte) 9), r0f.Z);
        this.f = new rey0(new okg(this, (byte) 0));
        j2i j2iVar = new j2i(-559830942, new gtd(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(los losVar, lzn0 lzn0Var) {
        this.a = (byte) 20;
        this.d = lzn0Var;
        this.e = new svh0(losVar, (byte) 16);
        this.f = new rey0(new mp20(this, (byte) 8));
        this.b = n3o1.r(this).c(rc30.f, rc30.g);
        j2i j2iVar = new j2i(-429831897, new yhy(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(gr91 gr91Var, paj0 paj0Var) {
        this.a = (byte) 16;
        this.d = gr91Var;
        this.e = paj0Var;
        this.f = new rey0(new b1s((Object) this, (byte) 9));
        this.b = n3o1.q(this).a(zyr.S0, new v08(this, (byte) 26));
        j2i j2iVar = new j2i(1401034356, new x8s(this), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(los losVar, c9c0 c9c0Var, lzn0 lzn0Var) {
        this.a = (byte) 24;
        this.d = lzn0Var;
        this.e = new svh0(losVar, (byte) 16);
        this.f = x3p1.m(new buz(new lt20(new p90(c9c0Var.b.current(), (byte) 6), new vv70(3, (lnm) null, (byte) 11), (byte) 1), (byte) 1), new pdb0(c9c0Var, (byte) 28), x5d0.b, (o8n) null, new pdb0(this, (byte) 29), 8);
        this.b = n3o1.r(this).c(i2d0.d, i2d0.e);
        j2i j2iVar = new j2i(2120781566, new pba0(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(gw70 gw70Var, yqg yqgVar, urk0 urk0Var, iu30 iu30Var) {
        this.a = (byte) 9;
        this.e = yqgVar;
        this.d = gw70Var;
        this.b = n3o1.q(this).a(new z63(urk0Var, (byte) 10), c9k.g);
        this.f = new rey0(new ip0(iu30Var, (byte) 20));
        j2i j2iVar = new j2i(-1218554272, new rxg(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(paj0 paj0Var, f0s f0sVar) {
        this.a = (byte) 15;
        this.d = paj0Var;
        this.e = f0sVar;
        this.f = new rey0(new b1s((Object) this, (byte) 6));
        this.b = n3o1.q(this).a(zyr.P0, new v08(this, (byte) 23));
        j2i j2iVar = new j2i(-886042134, new i8s(this), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(String str, qy71 qy71Var) {
        this.a = (byte) 7;
        this.d = str;
        this.e = qy71Var;
        this.f = new rey0(new dwd(this, (byte) 3));
        this.b = n3o1.q(this).a(emd.Z, emd.N0);
        j2i j2iVar = new j2i(1610839253, new gtd(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(lzn0 lzn0Var, z710 z710Var) {
        this.a = (byte) 4;
        this.d = lzn0Var;
        this.e = z710Var;
        this.f = new rey0(new ub3(this, (byte) 6));
        this.b = n3o1.r(this).c(k63.Y0, k63.Z0);
        j2i j2iVar = j6i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(FlowableMap flowableMap, mcu0 mcu0Var) {
        this.a = (byte) 2;
        this.d = flowableMap;
        this.e = mcu0Var;
        this.f = h7w.B(di0.V0, (o8n) null, (iu30) null, new m3(this, (byte) 15), 6);
        this.b = new eih1();
        j2i j2iVar = l3i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(lzn0 lzn0Var, i3l0 i3l0Var) {
        this.a = (byte) 10;
        this.d = lzn0Var;
        this.e = i3l0Var;
        this.f = new rey0(new mgl(this, (byte) 6));
        this.b = n3o1.r(this).c(new cml(this, (byte) 5), new v08(this, (byte) 14));
        j2i j2iVar = vfi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(ov20 ov20Var, vb2 vb2Var, pcl pclVar, i9i1 i9i1Var) {
        this.a = (byte) 3;
        this.d = vb2Var;
        this.e = i9i1Var;
        bw20 bw20Var = (bw20) ov20Var;
        this.f = x3p1.m(h5p1.s(rqt0.u(new c1v0(bw20Var.c("assured-estimated-age", "-1"), (byte) 15)), rqt0.u(new c1v0(bw20Var.c("assured-age-method-type", ""), (byte) 16)), pclVar.a(), new vd2(4, (lnm) null, (byte) 0)), ny1.W0, ah1.S0, (o8n) null, new jm1(this, (byte) 13), 8);
        this.b = qro1.q(n3o1.q(this), o40.t, mm1.X0);
        j2i j2iVar = new j2i(2022980615, new qsj(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(lzn0 lzn0Var, w4f w4fVar) {
        this.a = (byte) 12;
        this.d = lzn0Var;
        this.e = w4fVar;
        this.f = new rey0(new mgl(this, (byte) 20));
        this.b = n3o1.q(this).a(zho.g, zho.h);
        j2i j2iVar = new j2i(1472589375, new bfm(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(add addVar, kgq kgqVar) {
        this.a = (byte) 27;
        this.d = addVar;
        this.e = kgqVar;
        this.f = new rey0(gce0.Z);
        this.b = new eih1();
        j2i j2iVar = new j2i(-2125574149, new y3i0(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(f8s f8sVar, fyk0 fyk0Var) {
        this.a = (byte) 14;
        this.d = f8sVar;
        this.e = fyk0Var;
        this.f = new rey0(new b1s((Object) this, (byte) 3));
        this.b = n3o1.q(this).a(new cml(this, (byte) 29), zyr.Z);
        j2i j2iVar = nii.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(na9 na9Var, czr0 czr0Var) {
        this.a = (byte) 26;
        this.d = na9Var;
        this.e = czr0Var;
        this.f = x3p1.n(new cgg0(this, (byte) 0), j2g0.R0, ujf0.W0, (o8n) null, new cgg0(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(clf0.Y0, clf0.Z0);
        j2i j2iVar = new j2i(705253893, new qcd0(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(yvk0 yvk0Var, Function0 function0, Function0 function1) {
        this.a = (byte) 29;
        this.d = new qj0(yvk0Var, function0);
        this.e = new umf0(yvk0Var, function1);
        this.f = k1o1.p();
        this.b = new eih1();
        this.c = new psw(new j2i(-1364172342, new aso0(this, (byte) 0), true), (byte) 0);
    }

    public qj0(euz euzVar, tbr0 tbr0Var) {
        this.a = (byte) 13;
        this.d = tbr0Var;
        this.e = euzVar;
        this.f = k1o1.u(new r20(this, (lnm) null, (byte) 15));
        this.b = n3o1.q(this).a(zyr.b, zyr.c);
        j2i j2iVar = toi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public qj0(f1n0 f1n0Var, j130 j130Var, vwm1 vwm1Var) {
        this.a = (byte) 17;
        this.d = f1n0Var;
        this.e = j130Var;
        this.f = x3p1.n(new zas(vwm1Var), c6s.e1, szr.Z, (o8n) null, new vas(this, (byte) 9), 8);
        this.b = n3o1.q(this).a(njs.b, njs.c);
        j2i j2iVar = gdj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
