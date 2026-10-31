package p;

import android.content.Context;
import android.graphics.Rect;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sd5 implements o1i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public sd5(q9l1 q9l1Var, lzn0 lzn0Var, bcl1 bcl1Var) {
        this.a = (byte) 0;
        this.d = q9l1Var;
        this.b = lzn0Var;
        this.c = bcl1Var;
        this.e = f46.S0(new String[]{"playlist_page:carousel", "playlist_page:entity_explorer"});
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((qd5) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((e3o) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 2:
                e((aab0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 3:
                f((lvn0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 4:
                g((j701) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                h((lbl1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        switch (this.a) {
            case 0:
                return new x0i(new w0i(o0iVar.e, "animation_header", ((qd5) z0iVar).c, null, 8));
            case 1:
                hp80 hp80Var = o0iVar.e;
                String str = (String) o7h.s0(((e3o) z0iVar).a);
                if (str == null) {
                    str = "";
                }
                return new x0i(new w0i(hp80Var, "creator_row", str, null, 8));
            case 2:
                return new x0i(new w0i(o0iVar.e, "labeled_share_button", ((aab0) z0iVar).a, null, 8));
            case 3:
                return new x0i(new w0i(o0iVar.e, "navigation_header_body", ((lvn0) z0iVar).c, null, 8));
            case 4:
                return new x0i(new w0i(o0iVar.e, "read_along_content", ((j701) z0iVar).f, null, 8));
            default:
                lbl1 lbl1Var = (lbl1) z0iVar;
                return new x0i(new w0i(o0iVar.e, "survey_layout", lbl1Var.b, lbl1Var.c));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    public void c(qd5 qd5Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        q9l1 q9l1Var = (q9l1) this.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(93206010);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(qd5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            pe peVarA = ef.a(b0kVar3);
            float fM0 = ((wat) b0kVar3.k(t4k.h)).M0(((Rect) q9l1Var.h.d.e).width());
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarH = rwq.h(q9l1Var.k, b0kVar3, 0);
            if (peVarA.b(5)) {
                ke71 ke71Var = q9l1Var.i;
                if (((dma1) ke71Var.b).h((bma1) ke71Var.c, false) || ((Set) this.e).contains(q9l1Var.l)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = new pz50();
                b0kVar3.s0(objT2);
            }
            pz50 pz50Var = (pz50) objT2;
            boolean zH = b0kVar3.h(z) | b0kVar3.h(((Boolean) ven0VarH.getValue()).booleanValue()) | b0kVar3.h(((Boolean) ven0Var.getValue()).booleanValue());
            Object objT3 = b0kVar3.T();
            if (zH || objT3 == obj) {
                objT3 = Boolean.valueOf(z && ((Boolean) ven0Var.getValue()).booleanValue() && !((Boolean) ven0VarH.getValue()).booleanValue());
                b0kVar3.s0(objT3);
            }
            Boolean bool = (Boolean) objT3;
            boolean zBooleanValue = bool.booleanValue();
            int i3 = i2 & 14;
            boolean zH2 = b0kVar3.h(zBooleanValue) | b0kVar3.i(pz50Var) | (i3 == 4);
            Object objT4 = b0kVar3.T();
            if (zH2 || objT4 == obj) {
                objT4 = new kv1(zBooleanValue, pz50Var, qd5Var, (lnm) null);
                b0kVar3.s0(objT4);
            }
            qxd0.t(bool, b0kVar3, (vu30) objT4);
            boolean z2 = i3 == 4;
            Object objT5 = b0kVar3.T();
            if (z2 || objT5 == obj) {
                objT5 = new ve3(qd5Var, (byte) 12);
                b0kVar3.s0(objT5);
            }
            qim0 qim0VarZ = uyn1.z(fM0, 0.0f, 2, s161.b(qim0Var, false, (iu30) objT5));
            int i4 = i2;
            gra graVar = een.h;
            kgx kgxVar = new kgx(0, (vu30) null, (vu30) null, (vu30) null, 15);
            boolean zI = (i3 == 4) | b0kVar3.i(this) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && b0kVar3.i(o0iVar)));
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == obj) {
                objT6 = new hh(this, qd5Var, o0iVar, (byte) 15);
                b0kVar3.s0(objT6);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarZ, graVar, (hw61) null, kgxVar, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT6), (gbx) null, apo.r(-1748694095, new n891(pz50Var, qd5Var, ven0Var, (byte) 15), b0kVar3), b0kVar2, 100663344, 48, 1268);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, qd5Var, o0iVar, qim0Var, (byte) 14);
        }
    }

    public void d(e3o e3oVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-813116248);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(e3oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            sp00 sp00Var = (sp00) this.e;
            h290 h290Var = e3oVar.a;
            ezc ezcVarG = yoi1.g(((g7h) sp00Var.b).c("", h290Var, false).map(new mev(h290Var, (byte) 18)).onErrorComplete().distinctUntilChanged().observeOn((Scheduler) sp00Var.e));
            c9 c9VarF = mqo1.F(e3oVar.b);
            String str = e3oVar.c;
            int i3 = i2;
            String str2 = e3oVar.d;
            a3o a3oVar = e3oVar.e;
            c3o c3oVar = e3oVar.f;
            int i4 = i3 & 112;
            boolean zI = b0kVar3.i(this) | (i4 == 32 || ((i3 & 64) != 0 && b0kVar3.i(o0iVar)));
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new g3o(this, o0iVar);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI2 = (i4 == 32 || ((i3 & 64) != 0 && b0kVar3.i(o0iVar))) | b0kVar3.i(this);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new g3o(o0iVar, this, (byte) 1);
                b0kVar3.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI3 = (i4 == 32 || ((i3 & 64) != 0 && b0kVar3.i(o0iVar))) | b0kVar3.i(this);
            Object objT3 = b0kVar3.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new g3o(o0iVar, this, (byte) 2);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            hso1.k(c9VarF, str, str2, c3oVar, iu30Var, iu30Var2, (iu30) objT3, ezcVarG, qim0Var, a3oVar, b0kVar2, (i3 << 18) & 234881024);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(this, e3oVar, o0iVar, qim0Var, i, (byte) 24);
        }
    }

    public void e(aab0 aab0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(245378054);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(aab0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            lfc lfcVar = aab0Var.e;
            aec aecVar = aab0Var.g;
            String str = aab0Var.b;
            String str2 = aab0Var.c;
            boolean zI = ((i2 & 14) == 4) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new dt90(this, o0iVar, aab0Var, (byte) 2);
                x340Var.s0(objT);
            }
            vbe.u(lfcVar, aecVar, str, str2, fsx.c, new gbx(z50.c, (Function0) objT), (qim0) null, (yf) null, x340Var, fsx.d << 12, 192);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, aab0Var, o0iVar, qim0Var, (byte) 3);
        }
    }

    public void f(lvn0 lvn0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1151228038);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lvn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = true;
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (((t75) this.e).f()) {
            x340Var.i0(920824426);
            boolean zI = x340Var.i(this);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !x340Var.i(o0iVar))) {
                z = false;
            }
            boolean z2 = zI | z;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new j9n0(this, o0iVar, (byte) 11);
                x340Var.s0(objT);
            }
            lrn1.l(0, x340Var, (iu30) objT, uyn1.z(56.0f, 0.0f, 2, qim0Var));
            x340Var.r(false);
        } else {
            x340Var.i0(921346900);
            int i3 = i2 & 14;
            boolean zI2 = x340Var.i(this) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | (i3 == 4);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new mvn0(this, o0iVar, lvn0Var, (byte) 0);
                x340Var.s0(objT2);
            }
            irn1.s(lvn0Var, (iu30) objT2, ((q9l1) this.d).h, qim0Var, x340Var, ((i2 << 3) & 7168) | i3);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, lvn0Var, o0iVar, qim0Var, (byte) 13);
        }
    }

    public void g(j701 j701Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        sd5 sd5Var;
        x340 x340Var;
        tob1 tob1Var;
        Object t3t0Var;
        j701 j701Var2 = j701Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(169041286);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(j701Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(o0iVar) : x340Var2.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q((Object) null);
                x340Var2.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == obj) {
                objT2 = v8r.q((Object) null);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).c;
            wat watVar = (wat) x340Var2.k(t4k.h);
            f930 f930Var = (f930) x340Var2.k(t4k.k);
            boolean zG = x340Var2.g(lee1Var) | x340Var2.g(watVar) | x340Var2.g(f930Var);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == obj) {
                objT4 = new ezj(lee1Var, watVar, f930Var);
                x340Var2.s0(objT4);
            }
            ezj ezjVar = (ezj) objT4;
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT5 = x340Var2.T();
            if (z || objT5 == obj) {
                cik1 cik1Var = (cik1) this.c;
                objT5 = new obl1((lvc1) cik1Var.b, (yua) cik1Var.c, (Scheduler) cik1Var.d, (Scheduler) cik1Var.e, (zn90) this.d, ezjVar);
                x340Var2.s0(objT5);
            }
            obl1 obl1Var = (obl1) objT5;
            boolean zI = x340Var2.i(obl1Var) | (i4 == 4);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == obj) {
                objT6 = new p2z0(obl1Var, j701Var2, (lnm) null, (byte) 7);
                x340Var2.s0(objT6);
            }
            qxd0.t(j701Var2, x340Var2, (vu30) objT6);
            int i5 = i3 & 112;
            boolean zI2 = (i5 == 32 || ((i3 & 64) != 0 && x340Var2.i(o0iVar))) | x340Var2.i(obl1Var) | x340Var2.i(this);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == obj) {
                tob1Var = tob1Var2;
                t3t0Var = new t3t0(o0iVar, obl1Var, tob1Var, this, ven0Var, ven0Var2);
                sd5Var = this;
                x340Var2.s0(t3t0Var);
            } else {
                tob1Var = tob1Var2;
                t3t0Var = objT7;
                sd5Var = this;
            }
            oto1.c(j701Var2, o0iVar, (iu30) t3t0Var, x340Var2, i4 | 64 | i5);
            zqo1.j(j701Var2, (mbl1) tob1Var.getValue(), (edl1) ven0Var.getValue(), ezjVar, (fza) sd5Var.e, ((Boolean) ven0Var2.getValue()).booleanValue(), qim0Var, x340Var2, ((i3 << 12) & 3670016) | i4);
            x340Var = x340Var2;
            j701Var2 = j701Var2;
            boolean z2 = i4 == 4;
            Object objT8 = x340Var.T();
            if (z2 || objT8 == obj) {
                iw9 iw9Var = j701Var2.b;
                ny7 ny7Var = new ny7(iw9Var.a, iw9Var.c, null, iw9Var.b, 5, iw9Var.d, 68);
                x340Var.s0(ny7Var);
                objT8 = ny7Var;
            }
            sto1.a((wdm) sd5Var.b, o0iVar, (ny7) objT8, (Function0) null, x340Var, 64 | i5, 8);
        } else {
            sd5Var = this;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, sd5Var, j701Var2, o0iVar, qim0Var, (byte) 20);
        }
    }

    public void h(lbl1 lbl1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-965006917);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(lbl1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            cwl1.b(dug.f(qim0VarD, cbx.a(b0kVar3).a.c, er31.b(24.0f)), (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-95316636, new p8e1(lbl1Var, this, o0iVar, (byte) 12), b0kVar3), b0kVar2, 24576, 48, 2030);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, lbl1Var, o0iVar, qim0Var, (byte) 6);
        }
    }

    public sd5(lzn0 lzn0Var, bcl1 bcl1Var, q9l1 q9l1Var, t75 t75Var) {
        this.a = (byte) 3;
        this.b = lzn0Var;
        this.c = bcl1Var;
        this.d = q9l1Var;
        this.e = t75Var;
    }

    public sd5(cce cceVar, l7d1 l7d1Var, bih1 bih1Var, bcl1 bcl1Var) {
        this.a = (byte) 5;
        this.d = cceVar;
        this.b = l7d1Var;
        this.e = bih1Var;
        this.c = bcl1Var;
    }

    public sd5(bcl1 bcl1Var, xh71 xh71Var, yp10 yp10Var, Context context) {
        this.a = (byte) 2;
        this.c = bcl1Var;
        this.d = xh71Var;
        this.b = yp10Var;
        this.e = context;
    }

    public /* synthetic */ sd5(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }
}
