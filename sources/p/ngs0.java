package p;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.martini.martinidata.model.Mode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ngs0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final psw c;
    public final Object d;
    public final Object e;

    public ngs0(g3t0 g3t0Var) {
        this.a = (byte) 2;
        this.d = g3t0Var;
        this.b = x3p1.m(new x010(g3t0Var.a(), rqt0.u(hu20.e(g3t0Var.a.b(), new t4o0((lnm) null, (Object) g3t0Var, (byte) 12))), new o2t0(3, (lnm) null, (byte) 1), (byte) 1), egs0.W0, cps0.W0, (o8n) null, new fgs0(this, (byte) 6), 8);
        this.e = n3o1.q(this).a(f2s0.W0, f2s0.X0);
        j2i j2iVar = o7j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public static final /* synthetic */ iu30 k(ngs0 ngs0Var) {
        return (q4h0) ngs0Var.d;
    }

    public static final /* synthetic */ cd91 l(ngs0 ngs0Var) {
        return (cd91) ngs0Var.d;
    }

    public static String m(jba1 jba1Var) {
        if (jba1Var instanceof iba1) {
            return ((iba1) jba1Var).a.concat(":dna");
        }
        if (jba1Var instanceof gba1) {
            return ((gba1) jba1Var).a.concat(":dna");
        }
        if (!(jba1Var instanceof hba1)) {
            eg.o();
            return null;
        }
        hba1 hba1Var = (hba1) jba1Var;
        return gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(hba1Var.a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(hba1Var.b, new String[]{":"}, 0, 6)));
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return (ia00) obj;
            case 1:
                return (zus0) obj;
            case 2:
                return (ia00) obj;
            case 3:
                return n3o1.q(this).a(e9t0.i, e9t0.Y);
            case 4:
                return (eih1) obj;
            case 5:
                return (hy00) obj;
            case 6:
                return (azg) obj;
            case 7:
                return (hy00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (eih1) obj;
            case 10:
                return (ia00) obj;
            case 11:
                return (eih1) obj;
            case 12:
                return (ia00) obj;
            case 13:
                return (eih1) obj;
            case 14:
                return (ia00) obj;
            case 15:
                return (eih1) obj;
            case 16:
                return (eih1) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (eih1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (hy00) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (eih1) obj;
            case 22:
                return (eih1) obj;
            case 23:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (ia00) obj;
            case 25:
                return (eih1) obj;
            case 26:
                return (ia00) obj;
            case 27:
                return (ia00) obj;
            case 28:
                return (eih1) obj;
            default:
                return (u7h1) obj;
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
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return this.c;
    }

    public void e(uzu0 uzu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1655693861);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(uzu0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gdx gdxVarS = yla.s(x340Var);
            jdx jdxVar = jdx.c;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new wpu0((Object) iu30Var, (Object) uzu0Var, (byte) 20);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdxVar, qim0VarB, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-695552826, new t1t0(uzu0Var, (byte) 17), x340Var), x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, uzu0Var, iu30Var, i, (byte) 26);
        }
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(33619529);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            float f = 8.0f * ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).fontScale;
            String strO0 = cwl1.o0(x340Var, 2131957344);
            qim0 qim0VarR = u291.r(nim0.a, f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, cbx.a(x340Var).c.g, er31.a);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new pg61(strO0, (byte) 21);
                x340Var.s0(objT);
            }
            t1c.a(s161.b(qim0VarF, false, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i, (byte) 15);
        }
    }

    public void g(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-631868230);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j3y0((Object) this, (Object) iu30Var, (byte) 12);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, iu30Var, i, (byte) 2);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (rey0) obj;
            case 1:
                return (rey0) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (js20) this.e;
            case 4:
                return (js20) obj;
            case 5:
                return (k8d1) obj;
            case 6:
                return (rey0) obj;
            case 7:
                return (rey0) obj;
            case 8:
                return (rey0) obj;
            case 9:
                return (rey0) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (rey0) obj;
            case 12:
                return (rey0) obj;
            case 13:
                return (ljm0) obj;
            case 14:
                return (ljm0) obj;
            case 15:
                return (rey0) obj;
            case 16:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (rey0) obj;
            case 22:
                return (rey0) obj;
            case 23:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (js20) obj;
            case 25:
                return (rey0) obj;
            case 26:
                return (rey0) obj;
            case 27:
                return (rey0) obj;
            case 28:
                return (rey0) obj;
            default:
                return (rey0) obj;
        }
    }

    public void h(String str, String str2, uzu0 uzu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        uzu0 uzu0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2088128690);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(uzu0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, cbx.b(x340Var).b.c, 5);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i3 = i2 >> 6;
            int i4 = i3 & 896;
            j(160.0f, 80.0f, x340Var, i4);
            j(120.0f, 60.0f, x340Var, i4);
            x340Var.r(true);
            h2c h2cVar = h2c.a;
            int i5 = i2;
            t1c.a(dug.e(h2cVar.b(nim0Var), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.j)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
            era eraVar2 = een.Q0;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.c, 0.0f, 2, uyn1.B(u291.f(h2cVar.a(nim0Var, een.X), 1.0f), 0.0f, cbx.b(x340Var).b.f, 0.0f, 0.0f, 13));
            mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i5 & 14, 0, 2026);
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i5 >> 3) & 14, 0, 2016);
            x340Var = x340Var;
            if (uzu0Var != null) {
                x340Var.i0(478354079);
                uzu0Var2 = uzu0Var;
                e(uzu0Var2, iu30Var, x340Var, i3 & 1022);
                x340Var.r(false);
            } else {
                uzu0Var2 = uzu0Var;
                x340Var.i0(478448257);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            uzu0Var2 = uzu0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 17, i, this, str, str2, uzu0Var2, iu30Var);
        }
    }

    public void i(lt51 lt51Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1669710370);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(lt51Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(nim0.a, 12.0f, 16.0f);
            boolean z = lt51Var.c;
            lex lexVarZ = yoo1.z(b0kVar3);
            pex pexVar = pex.b;
            if (lt51Var.a) {
                b0kVar3.i0(1970101786);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(1970152347);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131959935));
                b0kVar3.r(false);
            }
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new hf31(iu30Var, lt51Var, (byte) 28);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, pexVar, lexVarZ, qim0VarY, 0, (qex) null, (String) null, haxVar, apo.r(549055272, new nt51(lt51Var, (byte) 0), b0kVar3), (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1879594949, new nt51(lt51Var, (byte) 1), b0kVar3), b0kVar2, 805306368, 196608, 31968);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, lt51Var, iu30Var, i, (byte) 9);
        }
    }

    public void j(float f, float f2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1268049537);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(this) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            jto1.b((qim0) null, new uvx(1, null, 3, null, null, null, null, 1, null, 378), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(1131400298, new rvh(jA, cuaVar), b0kVar3), (xu30) null, apo.r(1239084105, new wzu0(f2, jA, cuaVar, (byte) 0), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(2084834757, new wzu0(f, jA, cuaVar, (byte) 1), b0kVar3), b0kVar2, 805306432, 196656, 30205);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kck(this, f, f2, i);
        }
    }

    public ngs0(cd91 cd91Var) {
        this.a = (byte) 25;
        this.d = cd91Var;
        this.b = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(-735930617, new u491(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(s8w0 s8w0Var) {
        this.a = (byte) 7;
        this.d = s8w0Var;
        this.b = new rey0(new ac8(this, (byte) 22));
        this.e = n3o1.r(this).c(nzv0.g, nzv0.h);
        j2i j2iVar = new j2i(-380945235, new qsu0(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(p40 p40Var) {
        this.a = (byte) 17;
        this.d = p40Var;
        this.b = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(331556331, new dr01(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(vtq vtqVar) {
        this.a = (byte) 28;
        this.d = vtqVar;
        this.b = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(1144797045, new u491(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(Resources resources) {
        this.a = (byte) 14;
        this.d = resources;
        this.b = h7w.B(new ak01(this, (byte) 1), null, null, new g001(this, (byte) 10), 6);
        this.e = n3o1.q(this).a(kxz0.V0, kxz0.W0);
        j2i j2iVar = acj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(ufd ufdVar) {
        this.a = (byte) 15;
        this.d = ufdVar;
        this.e = new eih1();
        this.b = k1o1.p();
        j2i j2iVar = new j2i(681914205, new dr01(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(sus0 sus0Var) {
        this.a = (byte) 1;
        this.d = sus0Var;
        this.b = new rey0(new n1r0(this, (byte) 18));
        this.e = new zus0((byte) 0);
        j2i j2iVar = h7j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(u210 u210Var) {
        this.a = (byte) 16;
        this.d = u210Var;
        this.b = new rey0(new f2z0(this, (byte) 25));
        this.e = new eih1();
        j2i j2iVar = ocj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(i8h1 i8h1Var, v3v0 v3v0Var) {
        this.a = (byte) 6;
        this.d = v3v0Var;
        this.e = new azg(i8h1Var);
        this.b = new rey0(new dvt0(this, (byte) 7));
        j2i j2iVar = b9j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(gjz gjzVar) {
        this.a = (byte) 21;
        this.d = gjzVar;
        this.b = new rey0(new u451(this, (byte) 21));
        this.e = new eih1();
        j2i j2iVar = ehj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(vu60 vu60Var, lbl0 lbl0Var) {
        this.a = (byte) 0;
        this.d = vu60Var;
        this.b = new rey0(new n1r0(this, (byte) 16));
        this.e = n3o1.q(this).a(new x3o0(lbl0Var, (byte) 19), f2s0.g);
        j2i j2iVar = v6j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(los losVar) {
        this.a = (byte) 12;
        this.d = losVar;
        this.b = new rey0(mgn0.e1);
        this.e = n3o1.q(this).a(g2z0.X0, g2z0.Y0);
        j2i j2iVar = new j2i(214638350, new zyy0(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(h991 h991Var) {
        this.a = (byte) 24;
        this.d = h991Var;
        this.b = x3p1.m(r6x.a, new c991(this, (byte) 0), new dj71(this, (byte) 23), (o8n) null, new c991(this, (byte) 1), 8);
        this.e = n3o1.q(this).a(v691.h, v691.i);
        j2i j2iVar = sij.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(z8b0 z8b0Var) {
        this.a = (byte) 9;
        this.d = z8b0Var;
        this.b = new rey0(new dvt0(this, (byte) 26));
        this.e = new eih1();
        j2i j2iVar = iaj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(gc01 gc01Var) {
        this.a = (byte) 13;
        this.d = gc01Var;
        this.b = h7w.B(oa01.Y, null, null, new g001(this, (byte) 4), 6);
        this.e = new eih1();
        j2i j2iVar = obj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(String str, lwp lwpVar) {
        this.a = (byte) 11;
        this.d = lwpVar.a(new lik1(str), false, Mode.PROMPT_PLAYLIST);
        this.b = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(1947907021, new qsu0(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(q4h0 q4h0Var) {
        this.a = (byte) 18;
        this.d = q4h0Var;
        this.b = new rey0(new ec3(this, (byte) 8));
        this.e = n3o1.q(this).a(ve21.R0, ve21.S0);
        j2i j2iVar = zdj.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(kx21 kx21Var, amx0 amx0Var) {
        this.a = (byte) 8;
        this.d = amx0Var;
        this.b = new rey0(new dvt0(this, (byte) 21));
        this.e = n3o1.q(this).a(nzv0.b1, nzv0.c1);
        j2i j2iVar = new j2i(-360237751, new qsu0(kx21Var, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(mjm mjmVar) {
        this.a = (byte) 26;
        this.d = mjmVar;
        this.b = new rey0(new k681(this, (byte) 19));
        this.e = n3o1.q(this).a(new aaq0(this, (byte) 26), new aaq0(this, (byte) 27));
        j2i j2iVar = sjj.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(xh71 xh71Var) {
        this.a = (byte) 27;
        this.d = xh71Var;
        this.b = new rey0(new k681(this, (byte) 21));
        this.e = n3o1.q(this).a(r8a1.P0, r8a1.Q0);
        j2i j2iVar = bkj.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(rrk0 rrk0Var) {
        this.a = (byte) 29;
        this.d = rrk0Var;
        this.b = new rey0(xi81.Z);
        this.e = new u7h1(new gsc1(this, (byte) 1), new bxb1(this, (byte) 11));
        j2i j2iVar = zlj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(d0r d0rVar) {
        this.a = (byte) 20;
        this.d = d0rVar;
        this.b = x3p1.m(new cly0(d3p1.F(d0rVar, ujo1.t(), rih1.a), (byte) 5), wp51.Z0, qr51.i, (o8n) null, new mn41(this, (byte) 22), 8);
        j2i j2iVar = sfj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.e = n3o1.r(this).c(vp51.g, vp51.h);
    }

    public ngs0(s061 s061Var) {
        this.a = (byte) 19;
        this.d = s061Var;
        this.b = x3p1.n(new ot51(this, (byte) 0), wp51.Y0, qr51.g, (o8n) null, new ot51(this, (byte) 1), 8);
        j2i j2iVar = new j2i(1389937944, new hg31(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(vp51.e, vp51.f);
    }

    public ngs0(lzn0 lzn0Var) {
        this.a = (byte) 23;
        this.d = lzn0Var;
        this.b = x3p1.n(oa81.T0, oa81.U0, yd81.i, (o8n) null, new d781(this, (byte) 12), 8);
        this.e = n3o1.q(this).a(c781.O0, new aaq0(this, (byte) 24));
        j2i j2iVar = new j2i(-1563752022, new c771(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(r0s0 r0s0Var, iwt0 iwt0Var) {
        this.a = (byte) 3;
        this.d = r0s0Var;
        this.b = iwt0Var;
        this.e = x3p1.n(new eft0(this, (byte) 0), iet0.O0, cps0.b1, (o8n) null, new eft0(this, (byte) 1), 8);
        j2i j2iVar = a8j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(z6c z6cVar, m3n m3nVar) {
        this.a = (byte) 22;
        this.d = new yup0(z6cVar.a, m3nVar);
        this.b = k1o1.p();
        this.e = new eih1();
        j2i j2iVar = new j2i(-1651402128, new c771(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(hz5 hz5Var) {
        this.a = (byte) 10;
        this.d = hz5Var;
        this.b = k1o1.p();
        this.e = n3o1.q(this).a(cnx0.X, cnx0.Y);
        j2i j2iVar = new j2i(687888018, new qsu0(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public ngs0(f1n0 f1n0Var) {
        this.a = (byte) 5;
        this.d = f1n0Var;
        this.b = k1o1.u(new xzu0((Object) this, (lnm) null, (byte) 0));
        j2i j2iVar = new j2i(-153485736, new qsu0(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.e = n3o1.r(this).c(gou0.Z, gou0.N0);
    }

    public ngs0(zob1 zob1Var) {
        this.a = (byte) 4;
        this.d = new xgx0(zob1Var, 1);
        this.b = x3p1.n(new aft0(zob1Var, this, (byte) 9), ent0.P0, fnt0.h, (o8n) null, (iu30) null, 24);
        this.e = new eih1();
        this.c = new psw(new j2i(-1351658626, new t9r0(this, (byte) 24), true), (byte) 0);
    }
}
