package p;

import android.content.Context;
import com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import com.spotify.storage.localstorage.DiskAlmostFullActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g1i implements qjd, vkn0, dl4, qkd {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public g1i(h1i h1iVar) {
        this.a = (byte) 0;
        this.b = new ArrayList(h1iVar.a);
        this.c = new ArrayList(h1iVar.b);
        this.d = new ArrayList(h1iVar.c);
        List list = (List) h1iVar.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new hx4((mmr0) it.next(), (byte) 17));
        }
        this.e = arrayList;
        List list2 = (List) h1iVar.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new f1i((bar) it2.next(), (byte) 1));
        }
        this.f = arrayList2;
    }

    public static final /* synthetic */ iac0 h(g1i g1iVar) {
        return (iac0) g1iVar.b;
    }

    public nkd a() {
        return (nkd) ((jly0) this.f).get();
    }

    public njd b() {
        return (njd) ((jly0) this.f).get();
    }

    public lud0 c() {
        return new lud0((xup) ((jly0) this.f).get(), (byte) 1);
    }

    public void d(gpk gpkVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        q7r0 q7r0Var = (q7r0) this.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1340869244);
        int i2 = i | (x340Var.i(gpkVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ((bnr) this.b).a(cwl1.C(q7r0Var));
                x340Var.s0(objT);
            }
            tyq tyqVar = (tyq) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ((k7p) ((jly0) new b6p(((nmr) this.c).a).c).get()).a(cwl1.C(q7r0Var));
                x340Var.s0(objT2);
            }
            tyq tyqVar2 = (tyq) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ((q7p) this.d).a(cwl1.C(q7r0Var));
                x340Var.s0(objT3);
            }
            ovi1 ovi1Var = (ovi1) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = (z8x) ((kly0) this.e).get();
                x340Var.s0(objT4);
            }
            z8x z8xVar = (z8x) objT4;
            i6o0 i6o0VarQ = k1o1.q(x340Var);
            upb0 upb0VarB = wpb0.b(x340Var);
            e(upb0VarB, gpkVar.d, iu30Var, x340Var, (i2 & 7168) | ((i2 << 3) & 896));
            long jT = ((wat) x340Var.k(t4k.h)).t(o0c.R(((crl1) x340Var.k(t4k.u)).a()));
            int i3 = !d9y0.n(s3v.b(jT), s3v.a(jT)).a.equals(ltl1.b) ? 4 : 2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var3, i6o0VarQ, (g6o0) null);
            pf50 pf50Var = new pf50(i3);
            zzq0 zzq0Var = new zzq0(8.0f, 16.0f, 8.0f, 16.0f);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            d36 d36Var2 = new d36(16.0f, true, new um5(false));
            boolean zI = x340Var.i(gpkVar) | x340Var.i(tyqVar) | x340Var.i(this) | x340Var.i(tyqVar2) | x340Var.i(ovi1Var) | x340Var.i(z8xVar);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                j96 j96Var = new j96(gpkVar, tyqVar, this, tyqVar2, ovi1Var, z8xVar, (byte) 5);
                x340Var.s0(j96Var);
                objT5 = j96Var;
            }
            dko1.g(pf50Var, qim0VarL, upb0VarB, zzq0Var, d36Var, d36Var2, (iq20) null, false, (hxq0) null, (iu30) objT5, x340Var, 0, 912);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, this, gpkVar, iu30Var, qim0Var2, (byte) 25);
        }
    }

    public void e(upb0 upb0Var, String str, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-562430131);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(upb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(upb0Var) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new qpk(upb0Var, str, iu30Var, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.s(upb0Var, str, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, upb0Var, str, iu30Var, (byte) 9);
        }
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1165633214);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            qim0 qim0VarQ = i1p1.q(u291.f(nim0Var, 1.0f), er31.b(8.0f));
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(xcg1.k(cbx.a, qim0VarQ), cbx.a(x340Var).a.b.a(), er31.b(8.0f)), 0L, er31.b(8.0f), 13), x340Var, 0);
            t1c.a(cwl1.l0(dug.f(i1p1.q(uyn1.B(u291.h(u291.f(nim0Var, 1.0f), 40.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), er31.b(8.0f)), cbx.a(x340Var).a.b.a(), er31.b(8.0f)), 0L, er31.b(8.0f), 13), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new opk(this, i);
        }
    }

    public void g(iye1 iye1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(581415345);
        int i2 = i | (x340Var.g(iye1Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = iye1Var.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(str, qim0Var3, lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 48, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(this, iye1Var, qim0Var2, i, (byte) 11);
        }
    }

    public void i(q8y q8yVar) {
        ((ArrayList) this.b).add(q8yVar);
    }

    public void j(k120 k120Var, tka0 tka0Var) {
        ((ArrayList) this.e).add(new og(k120Var, tka0Var, (byte) 17));
    }

    public void k(aqg0 aqg0Var, tka0 tka0Var) {
        ((ArrayList) this.c).add(new mmr0(aqg0Var, tka0Var));
    }

    public h1i l() {
        return new h1i(ila0.F((ArrayList) this.b), ila0.F((ArrayList) this.c), ila0.F((ArrayList) this.d), ila0.F((ArrayList) this.e), ila0.F((ArrayList) this.f));
    }

    public biz m() {
        qyj qyjVar = (qyj) ((ciz) this.b).a.get();
        c8o.l(qyjVar);
        return new biz(qyjVar, (eiz) this.c, (tep) ((jly0) this.f).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, String str2, onm onmVar) {
        pbo pboVar;
        String str3;
        Object next;
        Object next2;
        if (onmVar instanceof pbo) {
            pboVar = (pbo) onmVar;
            int i = pboVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pboVar.d = i - Integer.MIN_VALUE;
            } else {
                pboVar = new pbo(this, onmVar);
            }
        } else {
            pboVar = new pbo(this, onmVar);
        }
        Object obj = pboVar.b;
        int i2 = pboVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ((t5h1) this.d).getClass();
                String strA = t5h1.a();
                mmr0 mmr0Var = new mmr0("query", str);
                mmr0 mmr0Var2 = new mmr0("locale", (String) this.e);
                mmr0 mmr0Var3 = new mmr0("entity_types", "section");
                mmr0 mmr0Var4 = new mmr0("features", ((uny) this.c).m());
                mmr0 mmr0Var5 = new mmr0("limit", "16");
                mmr0 mmr0Var6 = new mmr0("timestamp", String.valueOf(((yqg) this.f).b()));
                mmr0 mmr0Var7 = new mmr0("request_id", strA);
                if (str2 == null) {
                    str2 = "submit";
                }
                Map mapJ = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, new mmr0("query_complete", str2)});
                vi11 vi11Var = (vi11) this.b;
                pboVar.a = strA;
                pboVar.d = 1;
                Object objR = vi11Var.R(mapJ, b7x.a, pboVar);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
                str3 = strA;
                obj = objR;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = pboVar.a;
                hm5.M(obj);
                str3 = str4;
            }
            z2g0 z2g0Var = (z2g0) obj;
            Iterator it = z2g0Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                yf51 yf51Var = ((lby) next).e;
                if ((yf51Var instanceof yf51) && yf51Var.b == 9) {
                    break;
                }
            }
            lby lbyVar = (lby) next;
            if (lbyVar == null) {
                return null;
            }
            Iterator it2 = z2g0Var.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                yf51 yf51Var2 = ((lby) next2).e;
                if ((yf51Var2 instanceof yf51) && yf51Var2.b == 8) {
                    break;
                }
            }
            lby lbyVar2 = (lby) next2;
            String str5 = lbyVar.b;
            yf51 yf51Var3 = lbyVar.e;
            ei90 ei90Var = lbyVar2 != null ? lbyVar2.e : null;
            return new ax2(str3, str5, yf51Var3, ei90Var instanceof yf51 ? (yf51) ei90Var : null, lbyVar2 != null ? lbyVar2.b : null);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public bpb1 o() {
        return (bpb1) this.f;
    }

    public void p() {
        ((ruz) this.e).a(new d9u0("", false)).subscribe();
    }

    public void q() {
        ((ruz) this.e).a(new g9u0("", false)).subscribe();
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 22:
                AppRaterActivity appRaterActivity = (AppRaterActivity) obj;
                daq daqVar = (daq) obj4;
                ((t3b1) appRaterActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) appRaterActivity).c1 = new tuk(xqu.a((p2p) obj3));
                appRaterActivity.f1 = (ajg) daqVar.a2.get();
                break;
            case 23:
                CallingCodePickerActivity callingCodePickerActivity = (CallingCodePickerActivity) obj;
                daq daqVar2 = (daq) obj4;
                callingCodePickerActivity.c1 = (jgu) daqVar2.a.g0.get();
                callingCodePickerActivity.d1 = (mir0) ((jly0) this.e).get();
                callingCodePickerActivity.b1 = new q0d(new aus0((Context) daqVar2.x1.a, (nfa0) daqVar2.b2.get(), rt71.y((br81) ((p2p) obj3).get())), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.A2.get(), (i8h1) daqVar2.A5.get(), (mwn0) daqVar2.Wd.get());
                break;
            case 24:
            default:
                PictureSelectionActivity pictureSelectionActivity = (PictureSelectionActivity) obj;
                daq daqVar3 = (daq) obj4;
                ((t3b1) pictureSelectionActivity).b1 = (jgu) daqVar3.a.g0.get();
                ((t3b1) pictureSelectionActivity).c1 = new tuk(xqu.a((s2q) obj3));
                pictureSelectionActivity.i1 = new st60((PictureSelectionActivity) obj2, (String) daqVar3.Fo.get(), (g420) daqVar3.O2.get());
                pictureSelectionActivity.h1 = (gw70) daqVar3.d8.get();
                pictureSelectionActivity.g1 = (Scheduler) daqVar3.A2.get();
                pictureSelectionActivity.j1 = new r0w((i8h1) daqVar3.A5.get());
                pictureSelectionActivity.f1 = (Scheduler) daqVar3.z1.get();
                break;
            case 25:
                DiskAlmostFullActivity diskAlmostFullActivity = (DiskAlmostFullActivity) obj;
                ((t3b1) diskAlmostFullActivity).b1 = (jgu) ((daq) obj4).a.g0.get();
                ((t3b1) diskAlmostFullActivity).c1 = new tuk(xqu.a((p2p) obj3));
                break;
            case 26:
                InAppBrowserLauncherActivity inAppBrowserLauncherActivity = (InAppBrowserLauncherActivity) obj;
                daq daqVar4 = (daq) obj4;
                ((t3b1) inAppBrowserLauncherActivity).b1 = (jgu) daqVar4.a.g0.get();
                ((t3b1) inAppBrowserLauncherActivity).c1 = new tuk(xqu.a((s2q) obj3));
                inAppBrowserLauncherActivity.f1 = (qi0) daqVar4.lb.get();
                break;
            case 27:
                LiveSharingRecordingDialogsHostActivity liveSharingRecordingDialogsHostActivity = (LiveSharingRecordingDialogsHostActivity) obj;
                daq daqVar5 = (daq) obj4;
                ((t3b1) liveSharingRecordingDialogsHostActivity).b1 = (jgu) daqVar5.a.g0.get();
                ((t3b1) liveSharingRecordingDialogsHostActivity).c1 = new tuk(xqu.a((s2q) obj3));
                liveSharingRecordingDialogsHostActivity.f1 = (d350) daqVar5.ho.get();
                break;
            case 28:
                u0s0 u0s0Var = (u0s0) obj;
                h72 h72Var = (h72) obj4;
                ((hip) u0s0Var).F1 = (jgu) ((s2q) h72Var.f).get();
                u0s0Var.G1 = (c1s0) ((jly0) obj3).get();
                u0s0Var.H1 = new nl51((u2f0) ((daq) obj2).Cf.get(), (byte) 21);
                u0s0Var.I1 = (x0s0) ((jly0) h72Var.Y).get();
                u0s0Var.J1 = (v0s0) ((jly0) h72Var.X).get();
                u0s0Var.K1 = new mka((byte) 19);
                break;
        }
    }

    public g1i(iac0 iac0Var, Flowable flowable, c3s c3sVar, ruz ruzVar) {
        this.a = (byte) 3;
        this.b = iac0Var;
        this.c = flowable;
        this.d = c3sVar;
        this.e = ruzVar;
        this.f = gio1.b(Boolean.FALSE);
        fn31.T(cto1.q(iac0Var), (o8n) null, 0, new mx(this, (lnm) null, (byte) 11), 3);
    }

    public g1i(buk bukVar, auk aukVar) {
        this.a = (byte) 7;
        this.b = bukVar;
        this.c = aukVar;
        byte b = 5;
        this.d = xqu.b(new d7p(this, 0, b));
        this.e = xqu.b(new d7p(this, 2, b));
        this.f = xqu.b(new d7p(this, 1, b));
    }

    public g1i(p410 p410Var) {
        this.a = (byte) 21;
        this.b = p410Var;
        byte b = 0;
        this.c = new ywp(this, 1, b);
        this.d = iy81.a(new ywp(this, b, b));
        this.e = iy81.a(new ywp(this, 2, b));
        this.f = new ywp(this, 3, b);
    }

    public g1i(ciz cizVar, eiz eizVar) {
        this.a = (byte) 11;
        this.b = cizVar;
        this.c = eizVar;
        this.d = iy81.a(new lbp(this, 1, (byte) 26));
        this.e = iy81.a(new lbp(this, 2, (byte) 26));
        this.f = iy81.a(new lbp(this, 0, (byte) 26));
    }

    public g1i(lim limVar, nim nimVar) {
        this.a = (byte) 8;
        this.b = limVar;
        byte b = 11;
        this.c = xqu.b(new d7p(this, 0, b));
        this.d = new d7p(this, 2, b);
        this.e = new d7p(this, 1, b);
        this.f = xqu.b(new d7p(this, 3, b));
    }

    public g1i(ozp ozpVar, qop qopVar, bct bctVar) {
        this.a = (byte) 18;
        this.b = ozpVar;
        byte b = 13;
        this.c = iy81.a(new bsp(this, 1, b));
        this.d = iy81.a(new bsp(this, 2, b));
        this.e = iy81.a(new bsp(this, 3, b));
        this.f = iy81.a(new bsp(this, 0, b));
    }

    public g1i(vwa0 vwa0Var, yjn0 yjn0Var, q7r0 q7r0Var) {
        this.a = (byte) 13;
        this.b = vwa0Var;
        this.c = yjn0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new i8p(this, 1, (byte) 27));
        this.f = iy81.a(new i8p(this, 0, (byte) 27));
    }

    public g1i(h8e h8eVar, i8e i8eVar, q7r0 q7r0Var) {
        this.a = (byte) 6;
        this.b = h8eVar;
        this.c = q7r0Var;
        this.d = xqu.b(new b2p(this, 1, (byte) 10));
        this.e = new b2p(this, 2, (byte) 10);
        this.f = iy81.a(new b2p(this, 0, (byte) 10));
    }

    public g1i(hbn hbnVar, van vanVar, q7r0 q7r0Var) {
        this.a = (byte) 9;
        this.b = hbnVar;
        this.c = q7r0Var;
        byte b = 15;
        this.d = xqu.b(new d7p(this, 0, b));
        this.e = xqu.b(new d7p(this, 2, b));
        this.f = iy81.a(new d7p(this, 1, b));
    }

    public g1i(x0f0 x0f0Var, y0f0 y0f0Var, q7r0 q7r0Var) {
        this.a = (byte) 15;
        this.b = x0f0Var;
        this.c = q7r0Var;
        this.d = iy81.a(new blp(this, 0, (byte) 15));
        this.e = iy81.a(new blp(this, 1, (byte) 15));
        this.f = new blp(this, 2, (byte) 15);
    }

    public g1i(qni0 qni0Var, ryj ryjVar, sni0 sni0Var) {
        this.a = (byte) 16;
        this.b = qni0Var;
        byte b = 0;
        this.c = xqu.b(new bsp(this, b, b));
        this.d = iy81.a(new bsp(this, 2, b));
        this.e = iy81.a(new bsp(this, 3, b));
        this.f = iy81.a(new bsp(this, 1, b));
    }

    public g1i(hhk0 hhk0Var, ihk0 ihk0Var, q7r0 q7r0Var) {
        this.a = (byte) 17;
        this.b = hhk0Var;
        this.c = q7r0Var;
        byte b = 11;
        this.d = xqu.b(new bsp(this, 1, b));
        this.e = new bsp(this, 0, b);
        this.f = new bsp(this, 2, b);
    }

    public g1i(uct uctVar, ivj ivjVar, wne0 wne0Var, q7r0 q7r0Var, tso tsoVar) {
        this.a = (byte) 14;
        this.b = tsoVar;
        this.c = uctVar;
        this.d = q7r0Var;
        this.e = new dlp(this, 1, (byte) 12);
        this.f = xqu.b(new dlp(this, 0, (byte) 12));
    }

    public g1i(yb60 yb60Var, ivj ivjVar, zb60 zb60Var) {
        this.a = (byte) 12;
        this.b = yb60Var;
        this.c = iy81.a(new chp(this, 1, (byte) 20));
        this.d = iy81.a(new chp(this, 2, (byte) 20));
        this.e = iy81.a(new chp(this, 3, (byte) 20));
        this.f = iy81.a(new chp(this, 0, (byte) 20));
    }

    public g1i(nyv nyvVar, w0w w0wVar, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = nyvVar;
        this.c = q7r0Var;
        this.d = xqu.b(new lbp(this, 1, (byte) 10));
        this.e = xqu.b(new lbp(this, 0, (byte) 10));
        this.f = xqu.b(new lbp(this, 2, (byte) 10));
    }

    public /* synthetic */ g1i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public g1i(nwp nwpVar, q2p0 q2p0Var, byte b) {
        this.a = b;
        switch (b) {
            case 20:
                this.c = nwpVar;
                this.b = q2p0Var;
                this.d = new p2p(nwpVar, this, 1, (byte) 5);
                this.e = iy81.a(new p2p(nwpVar, this, 2, (byte) 5));
                this.f = iy81.a(new p2p(nwpVar, this, 0, (byte) 5));
                break;
            default:
                this.c = nwpVar;
                this.b = q2p0Var;
                this.d = iy81.a(new p2p(nwpVar, this, 2, (byte) 1));
                this.e = iy81.a(new p2p(nwpVar, this, 1, (byte) 1));
                this.f = iy81.a(new p2p(nwpVar, this, 0, (byte) 1));
                break;
        }
    }

    public g1i(daq daqVar, AppRaterActivity appRaterActivity) {
        this.a = (byte) 22;
        this.c = daqVar;
        this.b = appRaterActivity;
        this.d = xqu.b(new p2p(daqVar, this, 2, (byte) 14));
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 14));
        this.f = new p2p(daqVar, this, 0, (byte) 14);
    }

    public g1i(daq daqVar, CallingCodePickerActivity callingCodePickerActivity) {
        this.a = (byte) 23;
        this.c = daqVar;
        this.b = callingCodePickerActivity;
        this.d = xqu.b(new p2p(daqVar, this, 1, (byte) 22));
        this.e = xqu.b(new p2p(daqVar, this, 0, (byte) 22));
        this.f = new p2p(daqVar, this, 2, (byte) 22);
    }

    public g1i(daq daqVar, DiskAlmostFullActivity diskAlmostFullActivity) {
        this.a = (byte) 25;
        this.c = daqVar;
        this.b = diskAlmostFullActivity;
        this.d = xqu.b(new p2p(daqVar, this, 2, (byte) 28));
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 28));
        this.f = new p2p(daqVar, this, 0, (byte) 28);
    }

    public g1i(daq daqVar, InAppBrowserLauncherActivity inAppBrowserLauncherActivity) {
        this.a = (byte) 26;
        this.c = daqVar;
        this.b = inAppBrowserLauncherActivity;
        byte b = 8;
        this.d = xqu.b(new s2q(daqVar, this, 2, b));
        this.e = xqu.b(new s2q(daqVar, this, 1, b));
        this.f = new s2q(daqVar, this, 0, b);
    }

    public g1i(daq daqVar, LiveSharingRecordingDialogsHostActivity liveSharingRecordingDialogsHostActivity) {
        this.a = (byte) 27;
        this.c = daqVar;
        this.b = liveSharingRecordingDialogsHostActivity;
        byte b = 10;
        this.d = xqu.b(new s2q(daqVar, this, 2, b));
        this.e = xqu.b(new s2q(daqVar, this, 1, b));
        this.f = new s2q(daqVar, this, 0, b);
    }

    public g1i(daq daqVar, h72 h72Var, u0s0 u0s0Var) {
        this.a = (byte) 28;
        this.b = daqVar;
        this.c = h72Var;
        byte b = 3;
        this.d = xqu.b(new x0q(daqVar, this, 1, b));
        this.e = xqu.b(jo80.a(u0s0Var));
        this.f = xqu.b(new x0q(daqVar, this, 0, b));
    }

    public g1i(daq daqVar, PictureSelectionActivity pictureSelectionActivity) {
        this.a = (byte) 29;
        this.c = daqVar;
        this.b = pictureSelectionActivity;
        byte b = 23;
        this.d = xqu.b(new s2q(daqVar, this, 2, b));
        this.e = xqu.b(new s2q(daqVar, this, 1, b));
        this.f = new s2q(daqVar, this, 0, b);
    }

    public g1i(daq daqVar, v5q v5qVar, q2p0 q2p0Var) {
        this.a = (byte) 24;
        this.c = daqVar;
        this.b = q2p0Var;
        this.d = iy81.a(new p2p(daqVar, this, 2, (byte) 24));
        this.e = iy81.a(new p2p(daqVar, this, 1, (byte) 24));
        this.f = iy81.a(new p2p(daqVar, this, 0, (byte) 24));
    }
}
