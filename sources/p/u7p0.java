package p;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u7p0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public u7p0(emv0 emv0Var, nfc1 nfc1Var, eip0 eip0Var, u7f0 u7f0Var, b9o b9oVar, ufc1 ufc1Var, Scheduler scheduler, dg90 dg90Var, dg90 dg90Var2) {
        this.a = (byte) 10;
        yfc1 yfc1Var = new yfc1(2, zfc1.a, 2);
        wam0 wam0Var = new wam0((byte) 19);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        final ua91 ua91Var = nfc1Var.a;
        final byte b = 0;
        Action action = new Action() { // from class: p.mfc1
            public final void run() {
                byte b2 = b;
                ua91 ua91Var2 = ua91Var;
                switch (b2) {
                    case 0:
                        a1r0.j((a1r0) ua91Var2.d, ((x9f0) ua91Var2.e).a() ? nik1.q3.b("spotify:internal:unboxing:feature:lossless").a : nik1.b3.a, (String) null, (Bundle) null, false, 14);
                        break;
                    default:
                        String str = nik1.d3.a;
                        lzn0 lzn0Var = (lzn0) ua91Var2.c;
                        if (!lzn0Var.j((Activity) ua91Var2.b)) {
                            a1r0.j((a1r0) ua91Var2.d, str, (String) null, (Bundle) null, false, 14);
                        } else {
                            lzn0Var.h(str);
                        }
                        break;
                }
            }
        };
        Scheduler scheduler2 = nfc1Var.b;
        subtypeEffectHandlerBuilderC.b(lfc1.class, action, scheduler2);
        final byte b2 = 1;
        subtypeEffectHandlerBuilderC.b(kfc1.class, new Action() { // from class: p.mfc1
            public final void run() {
                byte b3 = b2;
                ua91 ua91Var2 = ua91Var;
                switch (b3) {
                    case 0:
                        a1r0.j((a1r0) ua91Var2.d, ((x9f0) ua91Var2.e).a() ? nik1.q3.b("spotify:internal:unboxing:feature:lossless").a : nik1.b3.a, (String) null, (Bundle) null, false, 14);
                        break;
                    default:
                        String str = nik1.d3.a;
                        lzn0 lzn0Var = (lzn0) ua91Var2.c;
                        if (!lzn0Var.j((Activity) ua91Var2.b)) {
                            a1r0.j((a1r0) ua91Var2.d, str, (String) null, (Bundle) null, false, 14);
                        } else {
                            lzn0Var.h(str);
                        }
                        break;
                }
            }
        }, scheduler2);
        this.b = sbl.z(yfc1Var, wam0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), nva1.Z0, new fgc1(eip0Var, u7f0Var, b9oVar, ufc1Var, scheduler));
        this.c = new eih1();
        j2i j2iVar = new j2i(-798323180, new pj0(emv0Var, dg90Var, dg90Var2, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return (ia00) obj2;
            case 1:
                return (eih1) obj;
            case 2:
                return (i7h1) obj2;
            case 3:
                return (ia00) obj2;
            case 4:
                return (eih1) obj2;
            case 5:
                return (eih1) obj2;
            case 6:
                return (eih1) obj2;
            case 7:
                return (eih1) obj;
            case 8:
                return (hy00) obj2;
            case 9:
                return (hy00) obj2;
            case 10:
                return (eih1) obj2;
            case 11:
                return (eih1) obj2;
            default:
                return (eih1) obj2;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return (psw) obj2;
            case 1:
                return (f70) obj;
            case 2:
                return (psw) obj2;
            case 3:
                return (psw) obj2;
            case 4:
                return (f70) obj2;
            case 5:
                return (lz9) obj2;
            case 6:
                return (psw) obj2;
            case 7:
                return (f70) obj;
            case 8:
                return (psw) obj2;
            case 9:
                return (psw) obj2;
            case 10:
                return (psw) obj2;
            case 11:
                return (rzj) obj2;
            default:
                return (v5k1) obj2;
        }
    }

    public void e(String str, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1100543226);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("standard_share_element_button", nim0.a);
            ldx ldxVar = ldx.c;
            boolean z2 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new m861(iu30Var, (byte) 6);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (z) {
                b0kVar3.i0(1497422546);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(1497473696);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131962910));
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            wro1.h(gbxVar, ldxVar, qim0VarN, haxVar, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-537826033, new nl41(str, (byte) 11), b0kVar3), b0kVar2, 0, 6, 1000);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(this, str, z, iu30Var, i, (byte) 10);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (e7m0) obj2;
            case 1:
                return (ys7) obj;
            case 2:
                return (rey0) obj2;
            case 3:
                return (poy0) obj2;
            case 4:
                return (xnf0) obj2;
            case 5:
                return (v6n0) obj2;
            case 6:
                return (poy0) obj2;
            case 7:
                return (uq7) obj;
            case 8:
                return (rey0) obj2;
            case 9:
                return (js20) obj2;
            case 10:
                return (e7m0) obj2;
            case 11:
                return (rey0) obj2;
            default:
                return (uq7) obj2;
        }
    }

    public u7p0(v6n0 v6n0Var, lz9 lz9Var) {
        this.a = (byte) 5;
        this.b = v6n0Var;
        this.c = new eih1();
        this.d = lz9Var;
    }

    public u7p0(f70 f70Var, uq7 uq7Var) {
        this.a = (byte) 7;
        this.b = f70Var;
        this.c = uq7Var;
        this.d = new eih1();
    }

    public u7p0(Flowable flowable) {
        this.a = (byte) 6;
        this.b = d4o1.g(flowable, hxt0.U0, fnt0.N0, (iu30) null, 24);
        this.c = new eih1();
        j2i j2iVar = o8j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public u7p0(xnf0 xnf0Var, f70 f70Var) {
        this.a = (byte) 4;
        this.b = xnf0Var;
        this.c = new eih1();
        this.d = f70Var;
    }

    public u7p0(dmj1 dmj1Var, w9u0 w9u0Var, klm1 klm1Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 0;
        this.b = sbl.z(new w9p0(), t7p0.b, b9p0.a(w9u0Var, klm1Var, q8nVar2), ofo0.Q0, new e9p0(q8nVar, dmj1Var));
        this.c = n3o1.q(this).a(n3o0.Y0, n3o0.Z0);
        j2i j2iVar = i4j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public u7p0(f70 f70Var, ys7 ys7Var) {
        this.a = (byte) 1;
        this.b = f70Var;
        this.c = ys7Var;
        this.d = new eih1();
    }

    public u7p0(yqg yqgVar, gw70 gw70Var, urk0 urk0Var, g7h g7hVar, f8b f8bVar, iu30 iu30Var) {
        this.a = (byte) 3;
        this.c = n3o1.q(this).a(new z63(urk0Var, (byte) 19), vn50.e1);
        this.b = d4o1.f(new xf3(g7hVar, f8bVar, (byte) 2), z860.N0, oq50.R0, new z720(iu30Var, (byte) 22), 8);
        j2i j2iVar = new j2i(1817394329, new t20(gw70Var, yqgVar, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public u7p0(v5k1 v5k1Var, uq7 uq7Var) {
        this.a = (byte) 12;
        this.b = uq7Var;
        this.c = new eih1();
        this.d = v5k1Var;
    }

    public u7p0() {
        this.a = (byte) 2;
        this.b = k1o1.p();
        this.c = new i7h1(c0z.O0, c0z.Q0);
        j2i j2iVar = zmi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public u7p0(vu30 vu30Var) {
        this.a = (byte) 8;
        this.b = new rey0(new a2(vu30Var, this));
        j2i j2iVar = gej.e;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.c = n3o1.r(this).c(vs31.e, vs31.f);
    }

    public u7p0(lzn0 lzn0Var) {
        this.a = (byte) 11;
        this.b = new rey0(new kk11(this, (byte) 9));
        this.c = new eih1();
        this.d = new rzj(this, (byte) 12);
    }

    public u7p0(koc0 koc0Var, xh71 xh71Var, mp8 mp8Var) {
        this.a = (byte) 9;
        this.b = x3p1.n(new g5b0(koc0Var, (byte) 4), s571.g, qr51.e1, (o8n) null, new ny51(this, xh71Var, mp8Var, (byte) 5), 8);
        this.c = n3o1.r(this).c(vy61.Y, vy61.Z);
        j2i j2iVar = new j2i(-1794720006, new c771(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
