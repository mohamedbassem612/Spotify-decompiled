package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.familyviewservice.v1.GenAlphaManagedSettings;
import com.spotify.familyviewservice.v1.TransitionToManagedAccountRequest;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ltf1 implements BiFunction, xi7, Function, drj1, sh, kvp0, vy11, weo1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ltf1(Context context, Handler handler) {
        this.a = (byte) 17;
        llm llmVarE = smo1.e(new z8n("WiFiDisabledDetectorScope"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.b = d5p1.r(new ph11(h4p1.f(new ary(tr20.a, context, intentFilter, handler, (lnm) null, (byte) 4)), (byte) 24), llmVarE, ey71.a, 1);
    }

    public static svi1 h(ltf1 ltf1Var, lby lbyVar, xui1 xui1Var, d8r0 d8r0Var, String str, int i) {
        return new svi1(lbyVar.a, lbyVar.b, tb51.g((tb51) ltf1Var.b, lbyVar), lbyVar.c, d8r0Var, str, i, (Integer) null, (String) null);
    }

    public mr20 a() {
        return (ve01) this.b;
    }

    public void accept(Object obj, Object obj2) {
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) this.b;
        IBinder z9n1Var = new z9n1((bsd1) obj2);
        qan1 qan1VarN = ((pan1) obj).n();
        Parcel parcelS = qan1VarN.s();
        int i = ean1.a;
        parcelS.writeStrongBinder(z9n1Var);
        ean1.b(parcelS, saveAccountLinkingTokenRequest);
        qan1VarN.B0(1, parcelS);
    }

    public Object apply(Object obj) {
        Single singleError;
        boolean z;
        Object objJust;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                dlg1 dlg1Var = (dlg1) obj2;
                cmg1 cmg1Var = (cmg1) dlg1Var.c;
                String str = cmg1Var.b;
                dxr0 dxr0Var = cmg1Var.e;
                String str2 = cmg1Var.c;
                if (str == null || ihc1.y0(str) || str2 == null || ihc1.y0(str2)) {
                    singleError = Single.error(new IllegalStateException("Unable to create kid account. Missing required data"));
                } else {
                    ewr0 ewr0Var = dxr0Var.a;
                    boolean z2 = ewr0Var instanceof ewr0;
                    boolean z3 = false;
                    lwr0 lwr0Var = lwr0.a;
                    if (z2) {
                        z = ewr0Var.a;
                    } else {
                        if (!u890.j(ewr0Var, lwr0Var)) {
                            eg.o();
                            return null;
                        }
                        z = false;
                    }
                    ewr0 ewr0Var2 = dxr0Var.b;
                    if (ewr0Var2 instanceof ewr0) {
                        z3 = ewr0Var2.a;
                    } else if (!u890.j(ewr0Var2, lwr0Var)) {
                        eg.o();
                        return null;
                    }
                    uxa0 uxa0Var = cmg1Var.a;
                    if (uxa0Var instanceof wxa0) {
                        singleError = rqt0.F(o6x.a, new es9(dlg1Var, uxa0Var, z, z3, (lnm) null, (byte) 5)).map(wdx0.T0);
                    } else if (uxa0Var instanceof uxa0) {
                        gj10 gj10Var = (gj10) dlg1Var.a;
                        String str3 = uxa0Var.a;
                        String str4 = cmg1Var.d;
                        lmg1 lmg1VarO = TransitionToManagedAccountRequest.o();
                        lmg1VarO.n(str3);
                        if (str4 != null) {
                            int i = hu50.a;
                            lmg1VarO.q(gu50.a.F(str4, nne.a).toString());
                        }
                        nc40 nc40VarN = GenAlphaManagedSettings.n();
                        nc40VarN.t(str);
                        nc40VarN.s(str2);
                        nc40VarN.q(z);
                        nc40VarN.r(z3);
                        lmg1VarO.r(nc40VarN.build());
                        TransitionToManagedAccountRequest transitionToManagedAccountRequestBuild = lmg1VarO.build();
                        hj10 hj10Var = gj10Var.a;
                        transitionToManagedAccountRequestBuild.getClass();
                        singleError = hj10Var.e(transitionToManagedAccountRequestBuild).map(fj10.b);
                    } else {
                        singleError = Single.error(new IllegalStateException("Unexpected flow type: " + uxa0Var));
                    }
                }
                return singleError.map(kcx0.U0).onErrorReturn(pdx0.U0).toObservable();
            case 6:
                e5z0 e5z0Var = (e5z0) obj;
                return fbp1.n(((nmh1) obj2).a, "up-next-card", e5z0Var.d, mmh1.b).filter(u3x0.V0).map(a4x0.U0).onErrorReturn(new owf1(e5z0Var, (byte) 5));
            case 15:
                lrk1 lrk1Var = (lrk1) obj;
                xl61 xl61Var = lrk1Var.a;
                return urk1.b((bih1) obj2, lrk1Var, jch0.S(65535.0d * xl61Var.a), xl61Var.a, xl61Var.c);
            case 18:
                ly21 ly21Var = (py21) obj;
                yvf1 yvf1Var = new yvf1((upm1) obj2, (byte) 22);
                if (ly21Var instanceof ly21) {
                    objJust = yvf1Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objJust = Single.just(bjo.a);
                }
                return (SingleSource) objJust;
            default:
                return ((vxm1) obj2).a.b((YourLibraryRequest) obj);
        }
    }

    public void b() {
        ((ven0) this.b).setValue(Boolean.TRUE);
    }

    public void c() {
        ((ven0) this.b).setValue(Boolean.FALSE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void d(zwj1 zwj1Var, iu30 iu30Var, xu30 xu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        xu30 xu30Var2;
        Function0 function0;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1306931623);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zwj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            qim0 qim0VarH = pqo.h(hno1.f(qim0VarF, uwr.d()), !zwj1Var.f);
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ni6(iu30Var, (byte) 7);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = f8d1.b(qim0VarH, rih1.a, (PointerInputEventHandler) objT);
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
            boolean z2 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var.l(function1);
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
            Uri uri = zwj1Var.e;
            as80 as80Var = mif1.P0;
            ecx ecxVarD = uwr.d();
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
            eso1.e(uri, isl.a, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, ecxVarD, as80Var, (tl3) null, new f2b(u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), 24), new pux(fwxVarG, fwxVarG), false, false, x340Var, 1075342768, 0, 3200);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            era eraVar = een.Q0;
            qim0 qim0VarZ = uyn1.z(32.0f, 0.0f, 2, u291.d(nim0Var, 1.0f));
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 54);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            String str = zwj1Var.c;
            cjc0 cjc0Var = new cjc0(1);
            int iC = l1d.C(zwj1Var.h);
            if (iC == 0) {
                x340Var.i0(1186149443);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1186151851);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1186146931, false);
                }
                x340Var.i0(1186154539);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            Function0 function2 = function0;
            uwo1.e(str, (qim0) null, (lee1) null, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1718);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            ((uq8) this.b).D(false, 1, swp0.c, zwj1Var.i, (vu30) null, x340Var, 24630);
            uwo1.e(zwj1Var.d, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 1572864, 0, 1714);
            x340Var = x340Var;
            us71.m(x340Var, true, true, true);
            if (xu30Var != null) {
                x340Var.i0(-1624512193);
                gra graVar = een.f;
                qim0 qim0VarX = uyn1.x(u291.d(nim0Var, 1.0f), 6.0f);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function2);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM5, x340Var, lljVar2);
                x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar4);
                xu30Var2 = xu30Var;
                hrt.k(((i3 >> 3) & 112) | 6, xu30Var2, h2c.a, x340Var, true);
                x340Var.r(false);
            } else {
                xu30Var2 = xu30Var;
                x340Var.i0(-1624340825);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            xu30Var2 = xu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, zwj1Var, iu30Var, xu30Var2, (byte) 26);
        }
    }

    public void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(298021809);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            qim0 qim0VarN = anm1.N("video_row_shimmer_box", u291.h(u291.f(nim0.a, 1.0f), 210.0f));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarN, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new muh1(this, i, (byte) 26);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r8 == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p.zp1 r7, p.onm r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ltf1.f(p.zp1, p.onm):java.lang.Object");
    }

    public void g(String str, String str2, int i, String str3, Throwable th) {
        Logger.e(th, str3, new Object[0]);
        ((g871) this.b).b(new w771(i, str2, str, str3, e9p1.p(th)));
    }

    public u8h1 i() {
        return (u8h1) this.b;
    }

    public void j() {
        y7e1 y7e1Var = (y7e1) this.b;
        esa1 esa1Var = y7e1Var.a;
        if (((ghh1) esa1Var.b).c.isEmpty() || ((vee1) ((hrr0) esa1Var.c).getValue()) != null) {
            return;
        }
        ghh1 ghh1Var = (ghh1) esa1Var.b;
        if (ghh1Var.c.isEmpty()) {
            tf80.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        Object objD0 = r7h.d0(ghh1Var.c);
        ghh1Var.b.add(objD0);
        vee1 vee1Var = (vee1) objD0;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        int i = vee1Var.a;
        h4e1Var.k(i, vee1Var.b.length() + i, vee1Var.c);
        long j = vee1Var.e;
        u2p1.v(h4e1Var, (int) (j >> 32), (int) (j & 4294967295L));
        y7e1Var.j(y7e1Var.d(), h4e1.q(y7e1Var.b, 0L, (nbe1) null, 15), true);
    }

    public void k() {
        y7e1 y7e1Var = (y7e1) this.b;
        esa1 esa1Var = y7e1Var.a;
        if (((ghh1) esa1Var.b).b.isEmpty() && ((vee1) ((hrr0) esa1Var.c).getValue()) == null) {
            return;
        }
        esa1Var.p();
        ghh1 ghh1Var = (ghh1) esa1Var.b;
        if (ghh1Var.b.isEmpty()) {
            tf80.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        Object objD0 = r7h.d0(ghh1Var.b);
        ghh1Var.c.add(objD0);
        vee1 vee1Var = (vee1) objD0;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        int i = vee1Var.a;
        h4e1Var.k(i, vee1Var.c.length() + i, vee1Var.b);
        long j = vee1Var.d;
        u2p1.v(h4e1Var, (int) (j >> 32), (int) (j & 4294967295L));
        y7e1Var.j(y7e1Var.d(), h4e1.q(y7e1Var.b, 0L, (nbe1) null, 15), true);
    }

    public Single l(Intent intent, th61 th61Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                qwf1 qwf1Var = (qwf1) obj;
                return qwf1Var.b(s4b1VarX).flatMap(new ffe1(qwf1Var, s4b1VarX, (byte) 9));
            default:
                return ((uii1) obj).a.b().firstOrError().map(jcx0.V0).onErrorReturn(kcx0.V0);
        }
    }

    public Bundle m() {
        Bundle bundleG = pzm.g("A", false);
        bg11 bg11Var = (bg11) this.b;
        if (!bg11Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            w280 w280VarR = bg11Var.r(0);
            while (w280VarR.hasNext()) {
                arrayList.add(((mby) w280VarR.next()).a());
            }
            bundleG.putParcelableArrayList("C", arrayList);
        }
        return bundleG;
    }

    public void n(int i, Object obj, qjn1 qjn1Var) {
        w4c0 w4c0Var = (w4c0) this.b;
        nhn1 nhn1Var = (nhn1) obj;
        w4c0Var.b0(i, 2);
        w4c0Var.k0(nhn1Var.e(qjn1Var));
        qjn1Var.h(nhn1Var, this);
    }

    public boolean r(View view) {
        vdk1 vdk1Var = (vdk1) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = vdk1Var.d;
        if (viewPager2.U0) {
            viewPager2.e(currentItem, true);
        }
        return true;
    }

    @Override // p.weo1
    public ogo1 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            weo1 weo1Var = ((weo1[]) this.b)[i];
            if (weo1Var.zzc(cls)) {
                return weo1Var.zzb(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p.weo1
    public boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((weo1[]) this.b)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ ltf1(aan1 aan1Var, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.a = (byte) 20;
        this.b = saveAccountLinkingTokenRequest;
    }

    public ltf1(w4c0 w4c0Var) {
        this.a = (byte) 21;
        this.b = w4c0Var;
        w4c0Var.d = this;
    }

    public /* synthetic */ ltf1(i2i1 i2i1Var) {
        this.a = (byte) 23;
        this.b = ((v280) i2i1Var.b).g();
    }

    public ltf1(ndi1 ndi1Var, nfa0 nfa0Var) {
        this.a = (byte) 8;
        this.b = nfa0Var;
        new a1b1(new a1b1(new lt20(ndi1Var.a("home_custom_feeds").getData(), new w1e0(3, (lnm) null, (byte) 29), (byte) 0), j8i1.c, (byte) 25), this, (byte) 24);
    }

    public /* synthetic */ ltf1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ltf1(String str) {
        this.a = (byte) 4;
        this.b = new u8h1(new v9r0(str));
    }

    public Object apply(Object obj, Object obj2) {
        return new CompletableFromAction(new dkb1((mtf1) this.b, mtf1.b((PlayerState) obj, ((Boolean) obj2).booleanValue(), false), (byte) 7));
    }
}
