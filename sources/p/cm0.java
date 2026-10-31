package p;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cm0 implements xpw, cvl1 {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object t;

    public cm0(vfp vfpVar, lo60 lo60Var, vh4 vh4Var, d0r d0rVar, bpb1 bpb1Var, kdy0 kdy0Var, sq01 sq01Var) {
        this.a = (byte) 9;
        this.c = vfpVar;
        this.d = vh4Var;
        this.e = d0rVar;
        this.f = bpb1Var;
        this.g = kdy0Var;
        this.h = sq01Var;
        this.i = new w460(lo60Var, false, true, false, (a1r0) null, 56);
        this.t = w3p1.n(new l4r(hvm.c, 1, jt01.O0, new j4r(jt01.Z), jt01.P0), new l4r(pwc0.b, 1, jt01.Q0, new j4r(jt01.N0), jt01.R0), atz0.W0);
        this.X = x3p1.n(new hu01(this, (byte) 1), jt01.Y, new ziz0((Object) this, (byte) 14), (o8n) null, (iu30) null, 24);
        this.Y = n3o1.q(this).a(kxz0.d1, kxz0.e1);
        this.b = new psw(new j2i(228063224, new dr01(this, (byte) 3), true), (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return (eih1) obj;
            case 1:
                return (hy00) obj;
            case 2:
                return (ia00) obj;
            case 3:
                return (hy00) obj;
            case 4:
                return (ia00) obj;
            case 5:
                return (ia00) obj;
            case 6:
                return (ia00) obj;
            case 7:
                return (ia00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (ia00) obj;
            case 10:
                return (hy00) obj;
            case 11:
                return (hy00) obj;
            case 12:
                return n3o1.q(this).a(kle1.d, kle1.e);
            default:
                return (eih1) obj;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                return (psw) obj;
            case 2:
                return (psw) obj;
            case 3:
                return (psw) obj;
            case 4:
                return (psw) obj;
            case 5:
                return (psw) obj;
            case 6:
                return (psw) obj;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj;
            case 10:
                return (psw) obj;
            case 11:
                return (psw) obj;
            case 12:
                j2i j2iVar = new j2i(-739357884, new vsb1(this, (byte) 26), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            default:
                return (psw) obj;
        }
    }

    public void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(367160706);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131960643);
            String strO1 = cwl1.o0(x340Var, 2131960642);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new h7w0(iu30Var, (byte) 29);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            String strO2 = cwl1.o0(x340Var, 2131960645);
            String strO3 = cwl1.o0(x340Var, 2131960644);
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ccy0(iu30Var, (byte) 0);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function1));
            boolean z3 = i3 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ccy0(iu30Var, (byte) 1);
                x340Var.s0(objT3);
            }
            Function0 function2 = (Function0) objT3;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function0, (i3u) null, (hux) null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(this, iu30Var, i, (byte) 21);
        }
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-938066915);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c((cx0) this.h, new b460(((Context) this.d).getString(2131958900), (String) null), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vkm0(this, i, (byte) 0);
        }
    }

    public void g(ehm0 ehm0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(84762333);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ehm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w2g0.c((qim0) null, (tl3) null, apo.r(153412935, new ukm0(this, ehm0Var, (byte) 1), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, ehm0Var, i, (byte) 13);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.X;
        switch (b) {
            case 0:
                return (poy0) obj;
            case 1:
                return (js20) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (rey0) obj;
            case 4:
                return (js20) obj;
            case 5:
                return (e7m0) obj;
            case 6:
                return (ljm0) obj;
            case 7:
                return (ljm0) obj;
            case 8:
                return (rey0) obj;
            case 9:
                return (js20) obj;
            case 10:
                return (js20) obj;
            case 11:
                return (k8d1) obj;
            case 12:
                return new rey0(new bxb1(this, (byte) 26));
            default:
                return (js20) obj;
        }
    }

    public void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-855089757);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarB = uyn1.B(u291.f(nim0.a, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = i2 & 14;
            f(x340Var, i3);
            j(x340Var, i3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vkm0(this, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void i(tcy0 tcy0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        cm0 cm0Var;
        tcy0 tcy0Var2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        gra graVar = een.d;
        kly0 kly0Var = (kly0) this.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-647835552);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(tcy0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            cm0Var = this;
            tcy0Var2 = tcy0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (tcy0Var instanceof scy0) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mcy0(this, tcy0Var, iu30Var, i);
                    return;
                }
                return;
            }
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(u291.j(184.0f, 0.0f, 2, qim0Var4), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var4);
            if (tcy0Var instanceof ocy0) {
                x340Var.i0(-431207208);
                ocy0 ocy0Var = (ocy0) tcy0Var;
                String str = ocy0Var.b;
                if (str == null) {
                    x340Var.i0(-431187400);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-431187399);
                    ((iuj) kly0Var.get()).a(new hvl1(str, 182, (String) null, (String) null, false, (String) null), x340Var, 0);
                    x340Var.r(false);
                }
                List list = ocy0Var.d;
                boolean z3 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new ccy0(iu30Var, (byte) 3);
                    x340Var.s0(objT);
                }
                szy.b(list, qim0VarZ, (Function0) objT, x340Var, 0);
                x340Var.r(false);
            } else {
                if (tcy0Var instanceof rcy0) {
                    x340Var.i0(-430759878);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    ((iuj) kly0Var.get()).a(new hvl1(cwl1.o0(x340Var, 2131960649), 182, (String) null, (String) null, true, (String) null), x340Var, 0);
                    x340Var.r(true);
                    tf40.b(0, x340Var, qim0VarZ, false);
                    x340Var.r(false);
                } else if (tcy0Var instanceof qcy0) {
                    x340Var.i0(-430228755);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
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
                    ((iuj) kly0Var.get()).a(new hvl1(cwl1.o0(x340Var, 2131960647), 182, (String) null, (String) null, false, (String) null), x340Var, 0);
                    x340Var.r(true);
                    qcy0 qcy0Var = (qcy0) tcy0Var;
                    String str2 = qcy0Var.g;
                    String str3 = qcy0Var.b;
                    Integer num = qcy0Var.h;
                    u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
                    boolean z4 = qcy0Var.i;
                    int i3 = i2 & 112;
                    boolean z5 = i3 == 32;
                    Object objT2 = x340Var.T();
                    if (z5 || objT2 == m4cVar) {
                        objT2 = new ccy0(iu30Var, (byte) 4);
                        x340Var.s0(objT2);
                    }
                    qim0Var3 = qim0Var4;
                    fj30.q(str2, str3, u7hVar, z4, qim0VarZ, (Function0) objT2, x340Var, 0);
                    op71.g(x340Var, u291.h(qim0Var3, 8.0f));
                    Uri.Builder builderPath = new Uri.Builder().path(qcy0Var.d);
                    String str4 = qcy0Var.f;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String strEncodeToString = Base64.encodeToString(builderPath.appendQueryParameter("userPrompt", str4).appendQueryParameter("title", qcy0Var.b).appendQueryParameter("contentDescription", "").appendQueryParameter("itemsInResponse", qcy0Var.e).build().toString().getBytes(nne.a), 2);
                    mr10 mr10Var = (mr10) ((idd1) this.t).getValue();
                    boolean z6 = i3 == 32;
                    Object objT3 = x340Var.T();
                    if (z6 || objT3 == m4cVar) {
                        objT3 = new ccy0(iu30Var, (byte) 5);
                        x340Var.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean z7 = i3 == 32;
                    Object objT4 = x340Var.T();
                    if (z7 || objT4 == m4cVar) {
                        objT4 = new ccy0(iu30Var, (byte) 6);
                        x340Var.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean z8 = i3 == 32;
                    Object objT5 = x340Var.T();
                    if (z8 || objT5 == m4cVar) {
                        objT5 = new ccy0(iu30Var, (byte) 7);
                        x340Var.s0(objT5);
                    }
                    cm0Var = this;
                    t3k1.k(strEncodeToString, mr10Var, function0, function1, (Function0) objT5, qim0VarZ, x340Var, 0);
                    if (qcy0Var.t) {
                        x340Var.i0(-429064333);
                        cm0Var.e(iu30Var, x340Var, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
                        z = false;
                        x340Var.r(false);
                    } else {
                        z = false;
                        x340Var.i0(-428998024);
                        x340Var.r(false);
                    }
                    x340Var.r(z);
                    tcy0Var2 = tcy0Var;
                } else {
                    cm0Var = this;
                    tcy0Var2 = tcy0Var;
                    qim0Var3 = qim0Var4;
                    if (!(tcy0Var2 instanceof pcy0)) {
                        throw p3d1.k(x340Var, -13909156, false);
                    }
                    x340Var.i0(-428955523);
                    pcy0 pcy0Var = (pcy0) tcy0Var2;
                    boolean z9 = (i2 & 112) == 32;
                    Object objT6 = x340Var.T();
                    if (z9 || objT6 == m4cVar) {
                        objT6 = new ccy0(iu30Var, (byte) 2);
                        x340Var.s0(objT6);
                    }
                    vzn1.f(pcy0Var, (Function0) objT6, qim0VarZ, x340Var, i2 & 14);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
            cm0Var = this;
            tcy0Var2 = tcy0Var;
            qim0Var3 = qim0Var4;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new pby0(cm0Var, tcy0Var2, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1162471206);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("standard_more_like_this_loading_spinner", u291.f(nim0.a, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            otw.c((fqg0) this.t, y9e0.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vkm0(this, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object k(String str, ou80 ou80Var, onm onmVar) {
        wc61 wc61Var;
        bpb1 bpb1Var = (bpb1) this.t;
        if (onmVar instanceof wc61) {
            wc61Var = (wc61) onmVar;
            int i = wc61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wc61Var.c = i - Integer.MIN_VALUE;
            } else {
                wc61Var = new wc61(this, onmVar);
            }
        } else {
            wc61Var = new wc61(this, onmVar);
        }
        wc61 wc61Var2 = wc61Var;
        Object obj = wc61Var2.a;
        int i2 = wc61Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                mzr0 mzr0Var = (mzr0) this.g;
                String str2 = (String) this.h;
                r6h1 r6h1Var = (r6h1) this.i;
                n641 n641Var = new n641(this, str, (lnm) null, (byte) 22);
                Integer num = new Integer(2131961639);
                wc61Var2.c = 1;
                Object objD = mzr0Var.d(str2, str, 2131961638, ou80Var, n641Var, r6h1Var, num, wc61Var2);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            Boolean bool2 = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool2);
            return rih1.a;
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool3);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public String l(m9a1 m9a1Var) {
        String str = m9a1Var.e;
        a7a1 a7a1Var = (a7a1) this.c;
        if (!a7a1Var.d || str == null) {
            str = null;
        } else {
            nyu0 nyu0VarC = oxu0.a.c(str);
            if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) == null) {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = m9a1Var.g;
        if (a7a1Var.e && str2 != null) {
            nyu0 nyu0VarC2 = oxu0.a.c(str2);
            if ((nyu0VarC2 instanceof nyu0 ? nyu0VarC2 : null) != null) {
                return str2;
            }
        }
        return null;
    }

    public ww60 m(os60 os60Var, int i) {
        String str;
        int i2;
        cd90 cd90Var;
        cd90 cd90Var2;
        ms60 ms60Var = os60Var != null ? os60Var.b : null;
        boolean z = ms60Var instanceof ls60;
        z6x z6xVar = z6x.a;
        if (!z) {
            return new ww60(4, "", 0, new cd90(z6xVar));
        }
        ArrayList arrayList = ((ls60) ms60Var).b.a;
        if (arrayList.isEmpty()) {
            return new ww60(4, "", 0, new cd90(z6xVar));
        }
        js60 js60Var = (js60) o7h.q0(arrayList);
        ps60 ps60Var = js60Var.a;
        if (ps60Var == null || (str = ps60Var.b) == null) {
            str = js60Var.b;
        }
        int size = arrayList.size();
        int iC = l1d.C(i);
        if (iC == 0) {
            i2 = 1;
        } else if (iC == 1) {
            i2 = 2;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            i2 = 3;
        }
        Context context = (Context) this.d;
        int iC2 = l1d.C(i2);
        if (iC2 == 0) {
            cd90Var = new cd90(p7h.M(new String[]{context.getString(2131956915), context.getString(2131956916)}));
        } else {
            if (iC2 != 1) {
                if (iC2 == 2) {
                    cd90Var = new cd90(p7h.M(new String[]{context.getString(2131956912), context.getString(2131956913)}));
                } else {
                    if (iC2 != 3) {
                        eg.o();
                        return null;
                    }
                    cd90Var2 = new cd90(z6xVar);
                }
                return new ww60(i2, str, size, cd90Var2);
            }
            cd90Var = new cd90(p7h.M(new String[]{context.getString(2131956909), context.getString(2131956910)}));
        }
        cd90Var2 = cd90Var;
        return new ww60(i2, str, size, cd90Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (p.f1n0.d(r3, r9, r4) == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r3.a(r4) == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(java.lang.String r21, java.lang.String r22, p.onm r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            java.lang.Object r3 = r0.e
            p.f1n0 r3 = (p.f1n0) r3
            boolean r4 = r2 instanceof p.nyz0
            if (r4 == 0) goto L1d
            r4 = r2
            p.nyz0 r4 = (p.nyz0) r4
            int r5 = r4.c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.c = r5
            goto L22
        L1d:
            p.nyz0 r4 = new p.nyz0
            r4.<init>(r0, r2)
        L22:
            java.lang.Object r0 = r4.a
            int r2 = r4.c
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L35
            p.hm5.M(r0)
            goto L8a
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r7
        L3b:
            p.hm5.M(r0)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
            goto L8a
        L3f:
            r0 = move-exception
            goto L6e
        L41:
            p.hm5.M(r0)
            if (r1 == 0) goto L4d
            r0 = 6
            java.lang.String r0 = p.pcf.d(r0, r1, r7)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
        L4b:
            r10 = r0
            goto L52
        L4d:
            java.lang.String r0 = p.pcf.g(r21)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
            goto L4b
        L52:
            java.lang.String r11 = ""
            p.dwn0 r9 = new p.dwn0     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
            r19 = 0
            r18 = 0
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
            r4.c = r6     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
            java.lang.Object r0 = p.f1n0.d(r3, r9, r4)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L8d
            if (r0 != r8) goto L8a
            goto L89
        L6e:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "Navigate to chat failed: "
            java.lang.String r0 = p.l1d.m(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "BUZZ: ReactionPickerRow"
            com.spotify.base.java.logging.Logger.d(r1, r0)
            r4.c = r5
            java.lang.Object r0 = r3.a(r4)
            if (r0 != r8) goto L8a
        L89:
            return r8
        L8a:
            p.rih1 r0 = p.rih1.a
            return r0
        L8d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cm0.n(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, String str2, onm onmVar) {
        oyz0 oyz0Var;
        if (onmVar instanceof oyz0) {
            oyz0Var = (oyz0) onmVar;
            int i = oyz0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oyz0Var.c = i - Integer.MIN_VALUE;
            } else {
                oyz0Var = new oyz0(this, onmVar);
            }
        } else {
            oyz0Var = new oyz0(this, onmVar);
        }
        Object objQ = oyz0Var.a;
        int i2 = oyz0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                bfd bfdVar = (bfd) this.t;
                List listM = p7h.M(new String[]{str, str2});
                oyz0Var.c = 1;
                objQ = bfdVar.q(listM, false, oyz0Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objQ);
            }
            return ((goe) objQ).a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r7 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(java.lang.String r6, p.onm r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.tom1
            if (r0 == 0) goto L13
            r0 = r7
            p.tom1 r0 = (p.tom1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.tom1 r0 = new p.tom1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
            p.hm5.M(r7)
            goto L69
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r4
        L2f:
            p.hm5.M(r7)
            return r7
        L33:
            p.hm5.M(r7)
            java.lang.Object r7 = r5.h
            p.hgd0 r7 = (p.hgd0) r7
            boolean r7 = r7.c()
            if (r7 != 0) goto L41
            goto L72
        L41:
            if (r6 == 0) goto L72
            boolean r7 = p.z6b1.b(r6)
            if (r7 != 0) goto L4a
            goto L72
        L4a:
            boolean r7 = p.z6b1.c(r6)
            p.d9n r1 = p.d9n.a
            if (r7 == 0) goto L5c
            r0.c = r3
            java.lang.Object r5 = r5.s(r6, r0)
            if (r5 != r1) goto L5b
            goto L68
        L5b:
            return r5
        L5c:
            java.lang.Object r5 = r5.f
            p.l7m0 r5 = (p.l7m0) r5
            r0.c = r2
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            p.zlj0 r7 = (p.zlj0) r7
            java.lang.Object r5 = r7.a()
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cm0.p(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(onm onmVar) {
        ryz0 ryz0Var;
        if (onmVar instanceof ryz0) {
            ryz0Var = (ryz0) onmVar;
            int i = ryz0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ryz0Var.c = i - Integer.MIN_VALUE;
            } else {
                ryz0Var = new ryz0(this, onmVar);
            }
        } else {
            ryz0Var = new ryz0(this, onmVar);
        }
        Object objJ = ryz0Var.a;
        int i2 = ryz0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Flowable flowable = (Flowable) this.d;
                vbm[] vbmVarArr = q601.a;
                wzv0 wzv0Var = new wzv0(new dy20(new kge(flowable), (byte) 29), (byte) 6);
                zio0 zio0Var = new zio0(2, (lnm) null, (byte) 27);
                ryz0Var.c = 1;
                objJ = b5p1.j(wzv0Var, zio0Var, ryz0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            String str = (String) objJ;
            return new w4i1(str, str, 12, (String) null);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(g3d0 g3d0Var, onm onmVar) {
        fov fovVar;
        Integer num;
        int i;
        String strA;
        if (onmVar instanceof fov) {
            fovVar = (fov) onmVar;
            int i2 = fovVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fovVar.d = i2 - Integer.MIN_VALUE;
            } else {
                fovVar = new fov(this, onmVar);
            }
        } else {
            fovVar = new fov(this, onmVar);
        }
        Object objI = fovVar.b;
        int i3 = fovVar.d;
        if (i3 == 0) {
            hm5.M(objI);
            if ((g3d0Var == null || (g3d0Var instanceof u2d0)) && (num = (Integer) ((jbt) this.h).e.getValue()) != null) {
                int iIntValue = num.intValue();
                any anyVarC = ((roc0) ((koc0) this.d)).c();
                fovVar.a = iIntValue;
                fovVar.d = 1;
                objI = b5p1.i(anyVarC, fovVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                i = iIntValue;
            }
            return jbr.a;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = fovVar.a;
        hm5.M(objI);
        l7e0 l7e0Var = (l7e0) o7h.t0(i, ((m7e0) objI).b);
        if (l7e0Var != null && (strA = l7e0Var.a()) != null) {
            return new hbr(strA);
        }
        return jbr.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(String str, onm onmVar) throws NoWhenBranchMatchedException {
        uom1 uom1Var;
        if (onmVar instanceof uom1) {
            uom1Var = (uom1) onmVar;
            int i = uom1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uom1Var.c = i - Integer.MIN_VALUE;
            } else {
                uom1Var = new uom1(this, onmVar);
            }
        } else {
            uom1Var = new uom1(this, onmVar);
        }
        Object objP = uom1Var.a;
        int i2 = uom1Var.c;
        boolean zContains = true;
        if (i2 == 0) {
            hm5.M(objP);
            v6a0 v6a0Var = (v6a0) this.g;
            uom1Var.c = 1;
            objP = v6a0Var.p(str, uom1Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        bxc0 bxc0Var = (bxc0) ((zlj0) objP).a();
        if (bxc0Var != null) {
            boolean z = bxc0Var.b != wls0.c;
            ywu0 ywu0Var = bxc0Var.c;
            if (!(ywu0Var instanceof xwu0)) {
                if (!(ywu0Var instanceof wwu0)) {
                    eg.o();
                    return null;
                }
                zContains = ne30.a.contains(((wwu0) ywu0Var).a);
            }
            if (z && zContains) {
                return bxc0Var.a;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object t(lpl lplVar, long j, String str, String str2, onm onmVar) {
        syz0 syz0Var;
        lpl lplVar2;
        String str3;
        String str4;
        long j2;
        String str5;
        lpl lplVar3;
        w4i1 w4i1Var;
        w4i1 w4i1Var2;
        lpl lplVar4;
        bfd bfdVar;
        g8d g8dVar;
        String str6;
        if (onmVar instanceof syz0) {
            syz0Var = (syz0) onmVar;
            int i = syz0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                syz0Var.h = i - Integer.MIN_VALUE;
            } else {
                syz0Var = new syz0(this, onmVar);
            }
        } else {
            syz0Var = new syz0(this, onmVar);
        }
        Object obj = syz0Var.f;
        int i2 = syz0Var.h;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                syz0Var.a = lplVar;
                syz0Var.b = str;
                syz0Var.c = str2;
                syz0Var.e = j;
                syz0Var.h = 1;
                Object objQ = q(syz0Var);
                if (objQ != obj2) {
                    lplVar2 = lplVar;
                    obj = objQ;
                    str3 = str;
                    str4 = str2;
                    j2 = j;
                }
                return obj2;
            }
            if (i2 == 1) {
                j2 = syz0Var.e;
                str4 = syz0Var.c;
                str3 = syz0Var.b;
                lplVar2 = syz0Var.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = syz0Var.e;
                w4i1Var2 = syz0Var.d;
                lplVar4 = syz0Var.a;
                hm5.M(obj);
            }
            str6 = (String) obj;
            if (str6 == null) {
                str5 = str6;
                w4i1Var = w4i1Var2;
                lplVar3 = lplVar4;
                long j3 = j2;
                String strValueOf = String.valueOf(j3);
                tom tomVar = new tom(strValueOf, str5, w4i1Var, j3, true, lplVar3, new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                bfdVar = (bfd) this.t;
                g8dVar = new g8d(str5, strValueOf, new e8d(tomVar, false), true);
                syz0Var.a = null;
                syz0Var.b = null;
                syz0Var.c = null;
                syz0Var.d = null;
                syz0Var.e = j3;
                syz0Var.h = 3;
                if (bfdVar.G(g8dVar, syz0Var) == obj2) {
                    return obj2;
                }
            }
            return rih1Var;
            w4i1 w4i1Var3 = (w4i1) obj;
            if (w4i1Var3 != null) {
                if (str4 == null) {
                    String str7 = w4i1Var3.a;
                    syz0Var.a = lplVar2;
                    syz0Var.b = null;
                    syz0Var.c = null;
                    syz0Var.d = w4i1Var3;
                    syz0Var.e = j2;
                    syz0Var.h = 2;
                    Object objO = o(str7, str3, syz0Var);
                    if (objO != obj2) {
                        w4i1Var2 = w4i1Var3;
                        obj = objO;
                        lplVar4 = lplVar2;
                        str6 = (String) obj;
                        if (str6 == null) {
                            str5 = str6;
                            w4i1Var = w4i1Var2;
                            lplVar3 = lplVar4;
                            long j4 = j2;
                            String strValueOf2 = String.valueOf(j4);
                            tom tomVar2 = new tom(strValueOf2, str5, w4i1Var, j4, true, lplVar3, new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                            bfdVar = (bfd) this.t;
                            g8dVar = new g8d(str5, strValueOf2, new e8d(tomVar2, false), true);
                            syz0Var.a = null;
                            syz0Var.b = null;
                            syz0Var.c = null;
                            syz0Var.d = null;
                            syz0Var.e = j4;
                            syz0Var.h = 3;
                            if (bfdVar.G(g8dVar, syz0Var) == obj2) {
                            }
                        }
                    }
                } else {
                    str5 = str4;
                    lplVar3 = lplVar2;
                    w4i1Var = w4i1Var3;
                    long j5 = j2;
                    String strValueOf3 = String.valueOf(j5);
                    tom tomVar3 = new tom(strValueOf3, str5, w4i1Var, j5, true, lplVar3, new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                    bfdVar = (bfd) this.t;
                    g8dVar = new g8d(str5, strValueOf3, new e8d(tomVar3, false), true);
                    syz0Var.a = null;
                    syz0Var.b = null;
                    syz0Var.c = null;
                    syz0Var.d = null;
                    syz0Var.e = j5;
                    syz0Var.h = 3;
                    if (bfdVar.G(g8dVar, syz0Var) == obj2) {
                    }
                }
                return obj2;
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d("BUZZ: ReactionPickerRow failed to send reaction via Campfire API", new Object[]{e2});
            return rih1Var;
        }
    }

    public cm0(iu30 iu30Var, lsq lsqVar, msq msqVar, auq auqVar, buq buqVar, cuq cuqVar, duq duqVar, xtq xtqVar, fhi1 fhi1Var, yqg yqgVar) {
        this.a = (byte) 12;
        this.c = iu30Var;
        this.d = lsqVar;
        this.e = msqVar;
        this.f = auqVar;
        this.g = buqVar;
        this.h = cuqVar;
        this.i = duqVar;
        this.t = xtqVar;
        this.X = fhi1Var;
        this.b = yqgVar;
        this.Y = new idd1(new fjc1(this, (byte) 25));
    }

    public cm0(vu60 vu60Var, Context context, pkp pkpVar, qkp qkpVar, rkp rkpVar, los losVar, xvo xvoVar, vbl0 vbl0Var) {
        this.a = (byte) 2;
        this.c = vu60Var;
        this.d = context;
        this.e = pkpVar;
        this.f = qkpVar;
        this.g = rkpVar;
        this.h = losVar;
        this.i = vbl0Var;
        this.t = rqt0.u(yoi1.g(xvoVar.a(true)));
        this.X = x3p1.n(new yw60(this, (byte) 0), new yw60(this, (byte) 1), oq50.e1, (o8n) null, (iu30) null, 24);
        this.Y = n3o1.q(this).a(new wx00(this, (byte) 28), oe60.i);
        j2i j2iVar = new j2i(-1186653068, new wv60(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public cm0(gw70 gw70Var, s4w0 s4w0Var, ZoneId zoneId, Locale locale, mzr0 mzr0Var, quc0 quc0Var, xmu0 xmu0Var, e9k e9kVar) {
        this.a = (byte) 6;
        this.c = gw70Var;
        this.d = s4w0Var;
        this.e = zoneId;
        this.f = locale;
        this.g = mzr0Var;
        this.h = quc0Var;
        this.i = xmu0Var;
        this.t = e9kVar;
        this.X = h7w.B(xuv0.P0, null, null, new ixt0(this, (byte) 10), 6);
        this.Y = n3o1.q(this).a(gou0.e1, new aaq0(this, (byte) 6));
        j2i j2iVar = new j2i(2049090018, new qsu0(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public cm0(r4h1 r4h1Var, btf1 btf1Var, wml wmlVar, l7m0 l7m0Var, v6a0 v6a0Var, hgd0 hgd0Var, ihd0 ihd0Var, yqg yqgVar) {
        this.a = (byte) 13;
        this.c = r4h1Var;
        this.d = btf1Var;
        this.e = wmlVar;
        this.f = l7m0Var;
        this.g = v6a0Var;
        this.h = hgd0Var;
        this.i = ihd0Var;
        this.t = yqgVar;
        this.X = x3p1.n(new c4m1(this, (byte) 11), gbm1.U0, bom1.d, (o8n) null, (iu30) null, 24);
        this.Y = new eih1();
        j2i j2iVar = tsj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public cm0(Observable observable, Flowable flowable, Scheduler scheduler, a62 a62Var, ao0 ao0Var, j62 j62Var, u601 u601Var, hnl hnlVar) {
        this.a = (byte) 0;
        this.c = observable;
        this.d = flowable;
        this.e = scheduler;
        this.f = a62Var;
        this.g = ao0Var;
        this.h = j62Var;
        this.i = u601Var;
        this.t = hnlVar;
        this.X = d4o1.g(observable.toFlowable(BackpressureStrategy.d), di0.g, new ab(this, (byte) 12), new j2(this, (byte) 10), 8);
        j2i j2iVar = new j2i(1151063135, new r1(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.Y = new eih1();
    }

    public cm0(lzn0 lzn0Var, u9c0 u9c0Var, String str, zob1 zob1Var, mzr0 mzr0Var, String str2, xe01 xe01Var) {
        this.a = (byte) 10;
        this.c = lzn0Var;
        this.d = u9c0Var;
        this.e = str;
        this.f = zob1Var;
        this.g = mzr0Var;
        this.h = str2;
        this.i = r6h1.c;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.t = bpb1VarB;
        this.X = z0o1.k(d5p1.t(new x010(xe01Var, bpb1VarB, new w1t(3, (lnm) null, (byte) 3), (byte) 1), u9c0Var, new alb1(0L, Long.MAX_VALUE), new aqx0((List) xe01Var.a.getValue(), false)), qr51.T0, new q961(this, (byte) 3), 4);
        j2i j2iVar = igj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.r(this).c(new z821(this, (byte) 26), vp51.W0);
    }

    public cm0(a7a1 a7a1Var, vu1 vu1Var, op31 op31Var, kt91 kt91Var, lzn0 lzn0Var, i8h1 i8h1Var, String str) {
        this.a = (byte) 11;
        this.c = a7a1Var;
        this.d = vu1Var;
        this.e = op31Var;
        this.f = kt91Var;
        this.g = lzn0Var;
        this.h = i8h1Var;
        this.i = str;
        this.X = k1o1.u(new kw0(this, (lnm) null, (byte) 16));
        this.Y = n3o1.r(this).c(new o9a1(this, (byte) 0), new o9a1(this, (byte) 1));
        j2i j2iVar = new j2i(-1209160261, new u491(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public cm0(yqg yqgVar, f1n0 f1n0Var, b1r0 b1r0Var, c9n c9nVar, q8n q8nVar, blp blpVar, bfd bfdVar, Flowable flowable) {
        this.a = (byte) 8;
        this.c = yqgVar;
        this.e = f1n0Var;
        this.f = b1r0Var;
        this.g = c9nVar;
        this.h = q8nVar;
        this.i = blpVar;
        this.t = bfdVar;
        this.d = flowable;
        this.X = new rey0(new f2z0(this, (byte) 14));
        j2i j2iVar = hbj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.q(this).a(kxz0.d, kxz0.e);
    }

    public cm0(u3p u3pVar, jly0 jly0Var, jgi0 jgi0Var, l0x0 l0x0Var, epb1 epb1Var, Function0 function0, kko kkoVar, ohi0 ohi0Var, cgi0 cgi0Var, Function0 function1, hs00 hs00Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, p731 p731Var) {
        this.a = (byte) 4;
        this.c = u3pVar;
        this.d = epb1Var;
        this.e = function0;
        this.f = kkoVar;
        this.g = ohi0Var;
        this.h = hs00Var;
        this.i = vu30Var;
        this.t = p731Var;
        this.X = pro1.r(this, new z6h0(this, (byte) 19), new z8i0(this, (byte) 7), iu30Var, iu30Var2);
        this.Y = n3o1.q(this).a(h40.X0, new bii0(l0x0Var, (byte) 1));
        j2i j2iVar = new j2i(-1115767524, new hef0(function1, jgi0Var, cgi0.a(cgi0Var, ohi0Var.a), jly0Var, new j2i(-899339384, new y3i0(this, (byte) 2), true), (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public cm0(lzn0 lzn0Var, gw70 gw70Var, tl7 tl7Var, i8p i8pVar, vtm0 vtm0Var, i3b i3bVar, abu0 abu0Var, iac0 iac0Var) {
        this.a = (byte) 3;
        this.c = lzn0Var;
        this.d = gw70Var;
        this.e = tl7Var;
        this.f = i8pVar;
        this.g = vtm0Var;
        this.h = i3bVar;
        this.i = abu0Var;
        this.t = iac0Var;
        this.X = new rey0(new gn50(this, (byte) 24));
        this.Y = n3o1.r(this).c(rb80.f, rb80.g);
        j2i j2iVar = new j2i(-280556502, new wv60(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public cm0(d0r d0rVar, String str, z6k0 z6k0Var, koc0 koc0Var, m980 m980Var, mnk0 mnk0Var, ktv ktvVar, jbt jbtVar) {
        this.a = (byte) 1;
        this.c = str;
        this.d = koc0Var;
        this.e = m980Var;
        this.f = mnk0Var;
        this.g = ktvVar;
        this.h = jbtVar;
        this.i = new vvu(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, rnv.h, new j4r(rnv.f), rnv.i), rnv.g), str), (byte) 2);
        this.t = new vvu(vxo1.l(d0rVar, str), (byte) 3);
        this.X = x3p1.n(new cov(this, (byte) 0), rnv.e, fdv.t, (o8n) null, new cov(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-2043042056, new ent(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.r(this).c(lnv.d, new k9s(this, (byte) 13));
    }

    public cm0(Context context, ygp ygpVar, ku1 ku1Var, ctp ctpVar, Scheduler scheduler, Scheduler scheduler2, String str, Observable observable) {
        this.a = (byte) 5;
        this.d = context;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = str;
        this.c = observable;
        this.h = ygpVar.a();
        f1n0 f1n0Var = (f1n0) ((ozp) ((g1i) ctpVar.a.c).b).b.T2.get();
        c8o.l(f1n0Var);
        this.i = new ud1(f1n0Var, (byte) 3);
        this.t = q1o1.u(new d83((byte) 6), (qim0) null, (FrameLayout.LayoutParams) null, 7);
        this.X = sbl.z(new ehm0(), new wam0((byte) 1), ku1Var, dbm0.O0, new xkm0(this, (byte) 0));
        j2i j2iVar = new j2i(-1598141692, new hmk0(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.q(this).a(fmk0.f, fmk0.g);
    }

    public cm0(kly0 kly0Var, l0x0 l0x0Var, bsn bsnVar, lwp lwpVar, lo60 lo60Var, gw70 gw70Var, uu00 uu00Var) {
        this.a = (byte) 7;
        this.c = kly0Var;
        this.d = l0x0Var;
        this.e = bsnVar;
        this.f = lwpVar;
        this.g = lo60Var;
        this.h = gw70Var;
        this.i = uu00Var;
        this.t = new idd1(new h2y0(this, (byte) 15));
        this.X = h7w.D(e6y0.e1, null, ucy0.c, new j2i(1679449918, new wcy0(this, (byte) 0), true), 2);
        this.Y = n3o1.q(this).a(cnx0.V0, cnx0.W0);
        j2i j2iVar = new j2i(-798551722, new qsu0(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }
}
