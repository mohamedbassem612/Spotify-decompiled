package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yxb0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final psw b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public yxb0(t8h t8hVar, n1q n1qVar, uxb0 uxb0Var, r5q r5qVar, gw70 gw70Var, i8h1 i8h1Var) {
        txb0 txb0Var;
        this.a = (byte) 0;
        this.c = uxb0Var;
        this.d = r5qVar;
        this.e = gw70Var;
        this.f = i8h1Var;
        wxb0 wxb0Var = wxb0.h;
        xxb0 xxb0Var = xxb0.b;
        switch (n1qVar.a) {
            case 0:
                i2q i2qVar = n1qVar.b;
                daq daqVar = i2qVar.a;
                q8n q8nVar = (q8n) daqVar.V2.get();
                teq teqVar = i2qVar.b;
                txb0Var = new txb0(q8nVar, teqVar.H1(), (dg30) teqVar.f.a, new t700(xqu.a(i2qVar.c.z2), (byte) 10), (i44) teqVar.v7.get(), (jjh1) daqVar.nb.get());
                break;
            case 1:
                thq thqVar = n1qVar.b;
                daq daqVar2 = thqVar.b;
                q8n q8nVar2 = (q8n) daqVar2.V2.get();
                v5q v5qVar = thqVar.c;
                txb0Var = new txb0(q8nVar2, v5qVar.Z(), (dg30) v5qVar.i.a, new t700(xqu.a(v5qVar.Z2), (byte) 10), (i44) v5qVar.h5.get(), (jjh1) daqVar2.nb.get());
                break;
            default:
                r7q r7qVar = n1qVar.b;
                daq daqVar3 = r7qVar.b;
                q8n q8nVar3 = (q8n) daqVar3.V2.get();
                teq teqVar2 = r7qVar.d;
                txb0Var = new txb0(q8nVar3, teqVar2.H1(), (dg30) teqVar2.f.a, new t700(xqu.a(teqVar2.Nf), (byte) 10), (i44) teqVar2.v7.get(), (jjh1) daqVar3.nb.get());
                break;
        }
        this.g = sbl.A(wxb0Var, xxb0Var, txb0Var, k9b0.c1, new vq80(this, t8hVar, (byte) 19));
        this.h = n3o1.q(this).a(lta0.Q0, new bt70(this, (byte) 21));
        j2i j2iVar = new j2i(-1928572404, new pba0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public static final /* synthetic */ gw70 h(yxb0 yxb0Var) {
        return (gw70) yxb0Var.e;
    }

    public static void k(ov90 ov90Var, lv90 lv90Var) {
        du90 du90Var = lv90Var.b;
        du90 du90Var2 = du90Var instanceof du90 ? du90Var : null;
        if (du90Var2 != null) {
            ju90 ju90Var = new ju90(du90Var2.a);
            synchronized (ov90Var) {
                if (ov90Var.b.get()) {
                    ov90Var.d.a(new mv90(ju90Var, (f4s) null));
                }
            }
        }
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                return (ia00) obj;
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
                return (eih1) obj;
            case 7:
                return (ybo) obj;
            case 8:
                return (hy00) obj;
            case 9:
                return (eih1) obj;
            case 10:
                return n3o1.q(this).a(new am80(this, (byte) 0), new am80(this, (byte) 1));
            case 11:
                return (eih1) obj;
            case 12:
                return (hy00) obj;
            case 13:
                return (hy00) obj;
            case 14:
                return (ia00) obj;
            case 15:
                return (ia00) obj;
            case 16:
                return (ia00) obj;
            case 17:
                return (hy00) obj;
            case 18:
                return (ia00) obj;
            case 19:
                return (eih1) obj;
            case 20:
                return (ia00) obj;
            case 21:
                return (eih1) obj;
            case 22:
                return (eih1) obj;
            case 23:
                return (hy00) obj;
            case 24:
                return (ia00) obj;
            default:
                return (ia00) obj;
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
        }
        return this.b;
    }

    public void e(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1519010439);
        int i4 = i3 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.e(i2) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, i2);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).k;
            long j = cbx.a(b0kVar3).b.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("CreateMenuSectionTitle_" + i, uyn1.z(16.0f, 0.0f, 2, qim0Var));
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = th51.e;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.e(strO0, s161.b(qim0VarN, true, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2((byte) 17, i, i2, i3, this, qim0Var);
        }
    }

    public void f(boolean z, ArrayList arrayList, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-135656735);
        int i3 = i2 | (x340Var.h(z) ? 4 : 2) | (x340Var.i(arrayList) ? 32 : 16) | (x340Var.e(l1d.C(i)) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            w2g0.c(qim0Var, (tl3) null, apo.r(-1574689845, new ok7(this, i, arrayList, (byte) 5, z), x340Var), x340Var, ((i3 >> 9) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(this, z, arrayList, i, qim0Var, i2);
        }
    }

    public void g(vhj1 vhj1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1248626795);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vhj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = vhj1Var.b;
            if (z2 || !vhj1Var.a) {
                z = true;
            }
            xtx xtxVar = xtx.c;
            t2g t2gVar = new t2g(z2, false, (qex) null, 6);
            String strO0 = cwl1.o0(x340Var, 2131954774);
            String strO1 = cwl1.o0(x340Var, z2 ? 2131954772 : 2131954773);
            boolean zH = x340Var.h(z2) | ((i2 & 112) != 32 ? z : true) | x340Var.g(vhj1Var);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = new vm1(iu30Var, z2, vhj1Var, (byte) 26);
                x340Var.s0(objT);
            }
            kyo1.c(strO0, xtxVar, (Function0) objT, (qim0) null, z, strO1, t2gVar, (vu30) null, x340Var, xtx.d << 3, 136);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(this, vhj1Var, iu30Var, i, (byte) 5);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                return (e7m0) obj;
            case 1:
                return (js20) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (poy0) obj;
            case 4:
                return (ljm0) obj;
            case 5:
                return (rey0) obj;
            case 6:
                return (rey0) obj;
            case 7:
                return (js20) obj;
            case 8:
                return (js20) obj;
            case 9:
                return (rey0) obj;
            case 10:
                return (rey0) this.h;
            case 11:
                return (js20) obj;
            case 12:
                return (js20) obj;
            case 13:
                return (js20) obj;
            case 14:
                return (ljm0) obj;
            case 15:
                return (js20) obj;
            case 16:
                return (js20) obj;
            case 17:
                return (rey0) obj;
            case 18:
                return (rey0) obj;
            case 19:
                return (js20) obj;
            case 20:
                return (js20) obj;
            case 21:
                return (js20) obj;
            case 22:
                return (js20) obj;
            case 23:
                return (ljm0) obj;
            case 24:
                return (e7m0) obj;
            default:
                return (js20) obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x015d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0163  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183 A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #5 {, blocks: (B:119:0x017b, B:121:0x0183), top: B:149:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:149:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c A[Catch: all -> 0x013d, Exception -> 0x013f, CancellationException -> 0x0141, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x0141, Exception -> 0x013f, all -> 0x013d, blocks: (B:80:0x0106, B:83:0x011c), top: B:158:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x012c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    public Object i(sv90 sv90Var, lv90 lv90Var, onm onmVar) throws Throwable {
        fv90 fv90Var;
        yxb0 yxb0Var;
        yxb0 yxb0Var2;
        f4s f4sVar;
        yxb0 yxb0Var3;
        av90 av90Var;
        f4s f4sVar2;
        yxb0 yxb0Var4;
        ku90 ju90Var;
        du90 du90Var;
        du90 du90Var2;
        yxb0 yxb0Var5;
        yxb0 yxb0Var6;
        lv90 lv90Var2;
        gv90 gv90Var;
        yxb0 yxb0Var7 = this;
        lv90 lv90Var3 = lv90Var;
        if (onmVar instanceof fv90) {
            fv90Var = (fv90) onmVar;
            int i = fv90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fv90Var.f = i - Integer.MIN_VALUE;
            } else {
                fv90Var = new fv90(yxb0Var7, onmVar);
            }
        } else {
            fv90Var = new fv90(yxb0Var7, onmVar);
        }
        fv90 fv90Var2 = fv90Var;
        Object objY = fv90Var2.d;
        d9n d9nVar = d9n.a;
        lv90 lv90Var4 = fv90Var2.f;
        try {
            if (lv90Var4 == 0) {
                hm5.M(objY);
                rv90 rv90Var = sv90Var instanceof rv90 ? (rv90) sv90Var : null;
                if (rv90Var == null || (yxb0Var = rv90Var.a) == null) {
                    return rih1.a;
                }
                if (yxb0Var != lv90Var3.a || !((ov90) yxb0Var).b.get()) {
                    return rih1.a;
                }
                f4s f4sVar3 = (f4s) ((i4s) yxb0Var7.f).b.get();
                f4s f4sVar4 = (f4sVar3 == null || !f4sVar3.b.isActive()) ? null : f4sVar3;
                if (f4sVar4 == null) {
                    k(yxb0Var, lv90Var3);
                    return rih1.a;
                }
                try {
                    gv90 gv90Var2 = new gv90(yxb0Var7, f4sVar4, yxb0Var, lv90Var3, null, (byte) 0);
                    fv90Var2.a = lv90Var3;
                    fv90Var2.b = yxb0Var;
                    fv90Var2.c = f4sVar4;
                    fv90Var2.f = 1;
                    Object objY2 = !((ov90) yxb0Var).b.get() ? null : fn31.Y(((ov90) yxb0Var).c, new w73(gv90Var2, (lnm) null, (byte) 6), fv90Var2);
                    if (objY2 != d9nVar) {
                        yxb0Var3 = yxb0Var;
                        f4sVar = f4sVar4;
                        objY = objY2;
                        av90Var = (dv90) objY;
                        if (av90Var == null) {
                            if (!((i4s) yxb0Var7.f).b(f4sVar)) {
                                k(yxb0Var3, lv90Var3);
                            }
                            return rih1.a;
                        }
                        if (av90Var instanceof av90) {
                            f4sVar2 = f4sVar;
                            yxb0Var4 = yxb0Var3;
                            if (av90Var instanceof cv90) {
                                ju90Var = new ku90(((cv90) av90Var).a);
                            } else {
                                if (av90Var instanceof bv90) {
                                    eg.o();
                                    return null;
                                }
                                ju90Var = new ju90(((bv90) av90Var).a);
                            }
                            synchronized (yxb0Var4) {
                                if (((ov90) yxb0Var4).b.get()) {
                                    ((ov90) yxb0Var4).d.a(new mv90(ju90Var, f4sVar2));
                                }
                                return rih1.a;
                            }
                        }
                        du90Var = lv90Var3.b;
                        if (du90Var instanceof du90) {
                            du90Var2 = du90Var;
                        } else {
                            du90Var2 = null;
                        }
                        if (du90Var2 == null) {
                            return rih1.a;
                        }
                        if (av90Var.a != du90Var2.a) {
                            return rih1.a;
                        }
                        f4s f4sVar5 = f4sVar;
                        yxb0Var5 = yxb0Var3;
                        gv90Var = new gv90(yxb0Var7, f4sVar5, yxb0Var5, lv90Var3, null, (byte) 2);
                        fv90Var2.a = lv90Var3;
                        fv90Var2.b = yxb0Var5;
                        fv90Var2.c = null;
                        fv90Var2.f = 2;
                        if (((ov90) yxb0Var5).b.get()) {
                            objY = fn31.Y(((ov90) yxb0Var5).c, new w73(gv90Var, (lnm) null, (byte) 6), fv90Var2);
                        } else {
                            objY = null;
                        }
                        if (objY != d9nVar) {
                            yxb0Var6 = yxb0Var5;
                            lv90Var2 = lv90Var3;
                        }
                    }
                    return d9nVar;
                } catch (CancellationException e) {
                    e = e;
                    yxb0Var2 = yxb0Var;
                    f4sVar = f4sVar4;
                    if (!((i4s) yxb0Var7.f).b(f4sVar)) {
                        k(yxb0Var2, lv90Var3);
                    }
                    throw e;
                }
            }
            if (lv90Var4 == 1) {
                f4sVar = fv90Var2.c;
                yxb0 yxb0Var8 = fv90Var2.b;
                lv90 lv90Var5 = fv90Var2.a;
                try {
                    hm5.M(objY);
                    yxb0Var3 = yxb0Var8;
                    lv90Var3 = lv90Var5;
                    try {
                        av90Var = (dv90) objY;
                        if (av90Var == null) {
                            if (!((i4s) yxb0Var7.f).b(f4sVar)) {
                                k(yxb0Var3, lv90Var3);
                            }
                            return rih1.a;
                        }
                        if (av90Var instanceof av90) {
                            f4sVar2 = f4sVar;
                            yxb0Var4 = yxb0Var3;
                            if (av90Var instanceof cv90) {
                                ju90Var = new ku90(((cv90) av90Var).a);
                            } else {
                                if (av90Var instanceof bv90) {
                                    eg.o();
                                    return null;
                                }
                                ju90Var = new ju90(((bv90) av90Var).a);
                            }
                            synchronized (yxb0Var4) {
                                if (((ov90) yxb0Var4).b.get()) {
                                    ((ov90) yxb0Var4).d.a(new mv90(ju90Var, f4sVar2));
                                }
                            }
                            return rih1.a;
                        }
                        du90Var = lv90Var3.b;
                        if (du90Var instanceof du90) {
                            du90Var2 = du90Var;
                        } else {
                            du90Var2 = null;
                        }
                        if (du90Var2 == null) {
                            return rih1.a;
                        }
                        if (av90Var.a != du90Var2.a) {
                            return rih1.a;
                        }
                        try {
                            f4s f4sVar6 = f4sVar;
                            yxb0Var5 = yxb0Var3;
                            try {
                                gv90Var = new gv90(yxb0Var7, f4sVar6, yxb0Var5, lv90Var3, null, (byte) 2);
                                fv90Var2.a = lv90Var3;
                                fv90Var2.b = yxb0Var5;
                                fv90Var2.c = null;
                                fv90Var2.f = 2;
                                if (((ov90) yxb0Var5).b.get()) {
                                    objY = null;
                                } else {
                                    objY = fn31.Y(((ov90) yxb0Var5).c, new w73(gv90Var, (lnm) null, (byte) 6), fv90Var2);
                                }
                                if (objY != d9nVar) {
                                    yxb0Var6 = yxb0Var5;
                                    lv90Var2 = lv90Var3;
                                }
                                return d9nVar;
                            } catch (CancellationException e2) {
                                e = e2;
                                throw e;
                            } catch (Exception e3) {
                                e = e3;
                                yxb0Var6 = yxb0Var5;
                                lv90Var2 = lv90Var3;
                                Logger.e(e, "Jam chat disclaimer presentation failed", new Object[0]);
                            } catch (Throwable th) {
                                th = th;
                                yxb0Var7 = yxb0Var5;
                                lv90Var4 = lv90Var3;
                                k(yxb0Var7, lv90Var4);
                                throw th;
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            yxb0Var5 = yxb0Var3;
                        } catch (Exception e5) {
                            e = e5;
                            yxb0Var5 = yxb0Var3;
                        } catch (Throwable th2) {
                            th = th2;
                            yxb0Var5 = yxb0Var3;
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        f4sVar = f4sVar;
                        yxb0Var2 = yxb0Var3;
                        if (!((i4s) yxb0Var7.f).b(f4sVar)) {
                            k(yxb0Var2, lv90Var3);
                        }
                        throw e;
                    }
                } catch (CancellationException e7) {
                    e = e7;
                    yxb0Var2 = yxb0Var8;
                    lv90Var3 = lv90Var5;
                    if (!((i4s) yxb0Var7.f).b(f4sVar)) {
                        k(yxb0Var2, lv90Var3);
                    }
                    throw e;
                }
            } else {
                if (lv90Var4 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yxb0Var6 = fv90Var2.b;
                lv90Var2 = fv90Var2.a;
                try {
                    hm5.M(objY);
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Exception e9) {
                    e = e9;
                    Logger.e(e, "Jam chat disclaimer presentation failed", new Object[0]);
                }
            }
            k(yxb0Var6, lv90Var2);
            return rih1.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object j(vr20 vr20Var, dnk0 dnk0Var, onm onmVar) {
        gmk0 gmk0Var;
        o3r o3rVar = (o3r) this.f;
        d0r d0rVar = (d0r) this.c;
        if (onmVar instanceof gmk0) {
            gmk0Var = (gmk0) onmVar;
            int i = gmk0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmk0Var.e = i - Integer.MIN_VALUE;
            } else {
                gmk0Var = new gmk0(this, onmVar);
            }
        } else {
            gmk0Var = new gmk0(this, onmVar);
        }
        Object obj = gmk0Var.c;
        int i2 = gmk0Var.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            dnk0 dnk0VarA = dnk0.a(dnk0Var, null, null);
            gmk0Var.a = vr20Var;
            gmk0Var.b = dnk0Var;
            gmk0Var.e = 1;
            if (vr20Var.emit(dnk0VarA, gmk0Var) != d9nVar) {
            }
        }
        if (i2 == 1) {
            dnk0Var = gmk0Var.b;
            vr20Var = gmk0Var.a;
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        mr20 mr20VarH = d3p1.H(d0rVar, o3rVar, dnk0Var.a);
        String str = dnk0Var.c;
        ay8 ay8VarH = str != null ? d3p1.H(d0rVar, o3rVar, str) : new huz((Object) null, (byte) 10);
        dwf0 dwf0Var = new dwf0(dnk0Var, (lnm) null, (byte) 6);
        dgk0 dgk0Var = new dgk0(vr20Var, (byte) 3);
        gmk0Var.a = null;
        gmk0Var.b = null;
        gmk0Var.e = 2;
        Object objS = fc11.s(vrl.c, gmk0Var, dgk0Var, new ekv(dwf0Var, (lnm) null), new mr20[]{mr20VarH, ay8VarH});
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(i4z i4zVar, onm onmVar) {
        e4z e4zVar;
        if (onmVar instanceof e4z) {
            e4zVar = (e4z) onmVar;
            int i = e4zVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4zVar.c = i - Integer.MIN_VALUE;
            } else {
                e4zVar = new e4z(this, onmVar);
            }
        } else {
            e4zVar = new e4z(this, onmVar);
        }
        Object obj = e4zVar.a;
        int i2 = e4zVar.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                c4z c4zVar = (c4z) this.e;
                String str = i4zVar.a;
                e4zVar.c = 1;
                if (c4zVar.invoke(str, e4zVar) == d9nVar) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            dt71 dt71Var = (dt71) this.f;
            e4zVar.c = 2;
            return dt71Var.emit(rih1Var, e4zVar) == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public yxb0(rm9 rm9Var, kt91 kt91Var, jly0 jly0Var) {
        this.a = (byte) 5;
        this.c = rm9Var;
        this.d = kt91Var;
        this.e = jly0Var;
        this.g = new rey0(new ub3(this, (byte) 27));
        this.h = n3o1.q(this).a(new v72(this, (byte) 29), jb8.e1);
        j2i j2iVar = q8i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(gw70 gw70Var, lzn0 lzn0Var, fg60 fg60Var, l6m0 l6m0Var) {
        this.a = (byte) 12;
        this.e = gw70Var;
        this.c = lzn0Var;
        this.d = fg60Var;
        this.f = l6m0Var;
        this.g = x3p1.m(fg60Var.a, new gwb0(this, (byte) 0), k9b0.b1, (o8n) null, new gwb0(this, (byte) 1), 8);
        this.h = n3o1.r(this).c(new bt70(this, (byte) 20), lta0.N0);
        j2i j2iVar = new j2i(-683804830, new pba0(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(gwh1 gwh1Var, zwh1 zwh1Var, ulc ulcVar, q8n q8nVar, q8n q8nVar2, q8n q8nVar3) {
        this.a = (byte) 24;
        this.c = zwh1Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        this.f = q8nVar3;
        osh1 osh1Var = osh1.Y;
        gp71 gp71Var = gp71.s;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        cwh1 cwh1Var = new cwh1(gwh1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lwh1.class), cancelPrevious.a(cwh1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jwh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new dwh1(gwh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kwh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ewh1(gwh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hwh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fwh1(gwh1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(iwh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bwh1(gwh1Var)));
        this.g = sbl.A(osh1Var, gp71Var, new a(gwh1Var.e, coroutinesSubtypeEffectHandlerBuilderI), lbg1.a1, new ymg1(this, (byte) 19));
        this.h = n3o1.q(this).a(ruh1.c, ruh1.d);
        j2i j2iVar = new j2i(2063431418, new y2f1(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(los losVar, vu60 vu60Var, up90 up90Var, c9c0 c9c0Var) {
        this.a = (byte) 17;
        this.c = vu60Var;
        this.d = up90Var;
        this.e = c9c0Var;
        this.f = new svh0(losVar, (byte) 16);
        this.g = new rey0(new n1r0(this, (byte) 17));
        this.h = n3o1.r(this).c(f2s0.X, f2s0.Y);
        j2i j2iVar = new j2i(-1862508635, new t9r0(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(los losVar, c9c0 c9c0Var, ats atsVar, c9n c9nVar) {
        this.a = (byte) 22;
        this.c = losVar;
        this.d = c9c0Var;
        this.e = atsVar;
        this.f = c9nVar;
        this.g = x3p1.n(new tib1(this, (byte) 0), cgb1.X, nva1.Q0, (o8n) null, new tib1(this, (byte) 1), 8);
        this.h = new eih1();
        j2i j2iVar = zkj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(hj91 hj91Var, ruz ruzVar, Flowable flowable) {
        this.a = (byte) 18;
        this.c = hj91Var;
        this.d = ruzVar;
        this.e = flowable;
        this.f = new SerialDisposable();
        this.g = new rey0(new f2z0(this, (byte) 7));
        j2i j2iVar = waj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(g2z0.N0, g2z0.O0);
    }

    public yxb0(String str, na9 na9Var, w4f w4fVar, umf0 umf0Var) {
        this.a = (byte) 9;
        this.c = str;
        this.d = na9Var;
        this.e = w4fVar;
        this.f = umf0Var;
        this.g = k1o1.p();
        this.h = new eih1();
        j2i j2iVar = new j2i(2068676406, new zq30(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(zr00 zr00Var, lc71 lc71Var, gm31 gm31Var, em31 em31Var) {
        this.a = (byte) 21;
        this.c = zr00Var;
        this.d = lc71Var;
        this.e = gm31Var;
        this.f = em31Var;
        this.g = x3p1.n(new q961((Object) this, (byte) 24), qi71.S0, ea71.P0, (o8n) null, qi71.U0, 8);
        this.h = new eih1();
        j2i j2iVar = new j2i(442086729, new c771(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(gw70 gw70Var, lo60 lo60Var, bpb1 bpb1Var, vgm vgmVar) {
        this.a = (byte) 3;
        this.e = gw70Var;
        this.c = lo60Var;
        this.d = bpb1Var;
        this.f = vgmVar;
        this.g = d4o1.f(new j04(this, (byte) 0), dt3.f, v30.c, new j04(this, (byte) 1), 8);
        this.h = n3o1.r(this).c(h40.d, k63.a1);
        j2i j2iVar = new j2i(21658274, new m04(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(jq jqVar, kw kwVar, uzl0 uzl0Var, lzn0 lzn0Var) {
        this.a = (byte) 1;
        this.c = lzn0Var;
        this.d = jqVar;
        this.e = kwVar;
        this.f = uzl0Var;
        this.g = x3p1.n(new ns(this, (byte) 0), new ns(this, (byte) 1), e3.h, (o8n) null, new ns(this, (byte) 2), 8);
        this.h = n3o1.r(this).c(new m3(this, (byte) 5), n1.i);
        j2i j2iVar = u2i.c;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(e4s e4sVar, iir iirVar, n4s n4sVar, i4s i4sVar) {
        this.a = (byte) 11;
        this.c = e4sVar;
        this.d = iirVar;
        this.e = n4sVar;
        this.f = i4sVar;
        this.g = x3p1.m(new m441(new ss90(this, (lnm) null, (byte) 2)), mr90.f, ul90.g, (o8n) null, new hu90(this, (byte) 1), 8);
        this.h = new eih1();
        j2i j2iVar = tti.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(Context context, lzn0 lzn0Var, n6r0 n6r0Var, String str) {
        this.a = (byte) 13;
        this.c = lzn0Var;
        this.d = n6r0Var;
        this.e = str;
        gm61 gm61Var = new gm61(context.getString(2131957373));
        this.f = gm61Var;
        this.g = x3p1.m(new huz(gm61Var, (byte) 10), new i8d0(this, (byte) 0), x5d0.e, (o8n) null, new i8d0(this, (byte) 1), 8);
        this.h = n3o1.r(this).c(new bt70(this, (byte) 26), i2d0.X);
        j2i j2iVar = tvi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(gw70 gw70Var, ytp0 ytp0Var, lzn0 lzn0Var, fii1 fii1Var, l6m0 l6m0Var) {
        this.a = (byte) 10;
        this.e = gw70Var;
        this.c = ytp0Var;
        this.d = lzn0Var;
        this.f = fii1Var;
        this.g = l6m0Var;
        this.h = new rey0(new gn50(this, (byte) 26));
        j2i j2iVar = new j2i(-1343801361, new wv60(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(ymd0 ymd0Var, p410 p410Var, uei0 uei0Var, gw70 gw70Var, lzn0 lzn0Var, fza fzaVar, vgm vgmVar, hvp0 hvp0Var, fiv0 fiv0Var, nwt nwtVar, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, cua cuaVar, n801 n801Var, e9g1 e9g1Var, dnc dncVar, yqg yqgVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar, ytp0 ytp0Var2, yy4 yy4Var) {
        this.a = (byte) 15;
        kko kkoVar = (kko) p410Var.c;
        this.c = kkoVar;
        ojv0 ojv0Var = (ojv0) p410Var.d;
        Function0 function0 = (Function0) p410Var.b;
        Function0 function1 = (Function0) p410Var.e;
        p731 p731Var = (p731) p410Var.f;
        this.d = p731Var;
        this.e = (vu30) p410Var.g;
        this.f = (vu30) p410Var.h;
        this.g = x3p1.n(new z1(this, uei0Var, yy4Var, clmVar, ymd0Var, nwtVar, ytp0Var2, (byte) 15), new vd6(ymd0Var, uei0Var, yy4Var, this, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, (byte) 8), new uuy(this, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, (byte) 19), (o8n) null, new j96(lzn0Var, vgmVar, dncVar, ytp0Var2, this, uei0Var, (byte) 22), 8);
        this.h = n3o1.q(this).a(h40.V0, ytg0.X0);
        j2i j2iVar = new j2i(-518968702, new t20(new aci0(uei0Var.b.a, uei0Var.i, false), new qq(gw70Var, function1, function0, p731Var, kkoVar, ojv0Var, aru0Var, ycmVar, aru0Var2, myq0Var, cuaVar, n801Var, e9g1Var, tbw0Var, iujVar, yqgVar, (mev) null, (zob1) null, (oyo) null), (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(ja8 ja8Var, sfz sfzVar, m4e0 m4e0Var, uu00 uu00Var) {
        this.a = (byte) 19;
        this.c = ja8Var;
        this.d = sfzVar;
        this.e = m4e0Var;
        this.f = uu00Var;
        this.g = x3p1.n(new ua01(this, (byte) 0), oa01.X, atz0.N0, (o8n) null, new ua01(this, (byte) 1), 8);
        this.h = new eih1();
        j2i j2iVar = nbj.c;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(ldo ldoVar, imn imnVar, ym81 ym81Var, List list) {
        this.a = (byte) 20;
        this.c = ldoVar;
        this.d = imnVar;
        this.e = ym81Var;
        this.f = list;
        this.g = x3p1.n(new mn41((Object) this, (byte) 12), th51.f, jh31.X0, (o8n) null, (iu30) null, 24);
        this.h = n3o1.q(this).a(v451.t, v451.X);
        j2i j2iVar = new j2i(-1621648475, new hg31(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(d0r d0rVar, String str, ptf1 ptf1Var) {
        this.a = (byte) 25;
        this.c = d0rVar;
        this.d = str;
        this.e = ptf1Var;
        this.f = x2p1.t(str);
        this.g = x3p1.n(new xhj1(this, (byte) 0), egj1.O0, zhi1.c1, (o8n) null, new xhj1(this, (byte) 1), 8);
        this.h = n3o1.q(this).a(k3j1.Q0, k3j1.R0);
        j2i j2iVar = new j2i(-825627379, new l6i1(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(Context context, lik1 lik1Var, oj3 oj3Var) {
        this.a = (byte) 2;
        this.c = lik1Var;
        this.d = oj3Var;
        this.e = context.getString(2131951925);
        this.f = context.getString(2131951924);
        this.g = x3p1.n(im1.b, im1.d, ah1.h, (o8n) null, new jm1(this, (byte) 1), 8);
        this.h = n3o1.q(this).a(mm1.b, mm1.c);
        j2i j2iVar = new j2i(-39706793, new r1(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(xmu0 xmu0Var, jab jabVar, c4z c4zVar) {
        this.a = (byte) 7;
        this.c = xmu0Var;
        this.d = jabVar;
        this.e = c4zVar;
        this.f = mgo1.e(0, 0, 0, 7);
        this.g = x3p1.n(new d4z(this, (byte) 0), s3z.X0, yty.Y, (o8n) null, new d4z(this, (byte) 1), 8);
        this.h = new ybo(n3o1.q(this).a(c0z.e, c0z.f), (byte) 3);
        j2i j2iVar = smi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(dr41 dr41Var, bnj0 bnj0Var, j4f1 j4f1Var, q8n q8nVar) {
        this.a = (byte) 23;
        this.c = dr41Var;
        this.d = bnj0Var;
        this.e = q8nVar;
        this.g = h7w.B(vxd1.b1, (o8n) null, vxd1.d1, new nsb1(this, (byte) 14), 2);
        this.h = new hy00(j4f1Var, xi81.b1, i6d1.Z0);
        j2i j2iVar = zmj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(e27 e27Var, aqs0 aqs0Var, smf0 smf0Var, m3e0 m3e0Var, cce cceVar, blp blpVar, sqs0 sqs0Var, boolean z, mr20 mr20Var, iac0 iac0Var, boolean z2) {
        jge jgeVarE;
        this.a = (byte) 14;
        this.c = e27Var;
        this.d = blpVar;
        this.e = sqs0Var;
        evz evzVarR = h5p1.r((x010) cceVar.d, aqs0Var.b, smf0Var.a, z ? mr20Var : new huz(Boolean.FALSE, (byte) 10), new mp6(5, (lnm) null, (byte) 3));
        if (z2) {
            jgeVarE = hu20.e(rqt0.u(new f8f0(iac0Var.getLifecycle().c(), (byte) 4)), new l3e0((lnm) null, m3e0Var, (byte) 1));
        } else {
            jgeVarE = m3e0Var.g;
        }
        this.f = new x010(evzVarR, jgeVarE, new jlf0(3, (lnm) null, (byte) 0), (byte) 1);
        this.g = h7w.B(z1f0.d1, (o8n) null, (iu30) null, new kmd0(this, (byte) 17), 6);
        this.h = n3o1.q(this).a(clf0.c, clf0.d);
        j2i j2iVar = new j2i(-939880690, new qcd0(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(Context context, haa0 haa0Var, kt91 kt91Var, cw7 cw7Var) {
        this.a = (byte) 4;
        this.c = context;
        this.d = haa0Var;
        this.e = kt91Var;
        this.f = cw7Var;
        this.g = h7w.D(rq7.T0, (bs50) null, rq7.V0, new j2i(-322015133, new sw1(this, (byte) 2), true), 2);
        this.h = n3o1.q(this).a(d27.R0, d27.S0);
        j2i j2iVar = u7i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(z710 z710Var, lzn0 lzn0Var, i8h1 i8h1Var, zob1 zob1Var) {
        this.a = (byte) 8;
        this.c = z710Var;
        this.d = lzn0Var;
        this.f = i8h1Var;
        this.e = zob1Var;
        this.g = z0o1.j(new n120(this, (byte) 0), wo10.e, new n120(this, (byte) 1), 4);
        this.h = n3o1.r(this).c(jq00.X0, jq00.Y0);
        j2i j2iVar = new j2i(-1625319518, new yhy(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public yxb0(zob1 zob1Var, xe01 xe01Var, qka qkaVar) {
        this.a = (byte) 6;
        this.c = zob1Var;
        this.d = xe01Var;
        this.e = qkaVar;
        this.f = new it8((byte) 18);
        this.g = k1o1.p();
        j2i j2iVar = new j2i(-1898888830, new zk9(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.h = new eih1();
    }

    public yxb0(jnk0 jnk0Var, gw70 gw70Var, d0r d0rVar, fn4 fn4Var) {
        this.a = (byte) 16;
        this.e = gw70Var;
        this.c = d0rVar;
        this.d = fn4Var;
        this.f = w3p1.o(new l4r(new xv00(rc11.a.b(xkk1.class)), 2, qkk0.X0, new j4r(qkk0.Z0), qkk0.Y0), qkk0.a1);
        this.g = x3p1.m(hu20.e(jnk0Var.a, new gg00(this, (lnm) null, (byte) 3)), qkk0.W0, qlk0.g, (o8n) null, (iu30) null, 24);
        j2i j2iVar = new j2i(936272854, new hmk0(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(w7k0.e1, fmk0.b);
    }
}
