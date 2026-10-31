package p;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vq80 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq80(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        Object objInvoke;
        op80 op80Var;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 3;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                vx40 vx40Var = (vx40) obj3;
                String str = (String) obj2;
                Throwable thA = e331.a(((e331) obj).a);
                if (thA != null) {
                    ae5 ae5Var = (ae5) vx40Var.c;
                    String strF = f4i1.f(str, "|", nmn1.s(thA));
                    t2j0 t2j0Var = ae5Var.a;
                    t210 t210VarN = ExternalAccessoryRemoteError.n();
                    t210VarN.n("ui_navigate");
                    t210VarN.r();
                    t210VarN.q(strF);
                    t2j0Var.a(t210VarN.build());
                }
                return rih1Var;
            case 1:
                lsl lslVar = (lsl) obj;
                mw80 mw80Var = (mw80) obj3;
                o95 o95Var = mw80Var.Y0;
                if (o95Var != null) {
                    objInvoke = o95Var.e();
                } else {
                    objInvoke = mw80Var.R0.b.invoke(mw80Var.S0, mw80Var.V0.isEmpty() ? mw80Var.U0 ? vux.c : vux.a : vux.b);
                }
                long j = ((u7h) objInvoke).a;
                if (u7h.c(j) > 0.0f) {
                    vpb1.w(lslVar, (z1a1) obj2, j, (phc1) null, 60);
                }
                lslVar.s1();
                return rih1Var;
            case 2:
                sbu0 sbu0VarG = ((ExoPlayer) obj).G(new zc80((r390) obj2, (byte) 2));
                sbu0VarG.c((xw7) obj3);
                sbu0VarG.b();
                return rih1Var;
            case 3:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                r390 r390Var = (r390) obj3;
                Surface surface = (Surface) obj2;
                surface.getClass();
                if (r390Var.Q0.a == surface) {
                    r390Var.G0(exoPlayer, new i390((Surface) null, (l291) null, 7));
                }
                return rih1Var;
            case 4:
                e261 e261Var = (e261) obj;
                fam famVar = (fam) obj3;
                if (famVar == null) {
                    b261.m(e261Var, m9h.T0);
                } else {
                    b261.o(e261Var, famVar);
                }
                String str2 = (String) obj2;
                if (str2 != null) {
                    e261Var.b(z161.O, str2);
                }
                return rih1Var;
            case 5:
                x390 x390Var = (x390) obj3;
                String str3 = (String) obj2;
                ((byp) x390Var.c).A(str3, new xvy(str3, x390Var, (tv80) obj, (byte) 28));
                return rih1Var;
            case 6:
                zd90 zd90Var = (zd90) obj2;
                st60 st60Var = ((ae90) obj3).c;
                int iOrdinal = ((xd90) obj).ordinal();
                if (iOrdinal == 0) {
                    yd90 yd90Var = zd90Var.f;
                    if (yd90Var == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    String strF2 = f4i1.f("spotify:managed-account-linking:share-parental-consent:", yd90Var.a, "");
                    i8h1 i8h1Var = (i8h1) ((ikp) st60Var.b).get();
                    x6h1 x6h1VarC = ((txk0) st60Var.c).b.c();
                    x6h1VarC.i.add(new a7h1("scan_qr_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    ((lzn0) st60Var.d).a(strF2, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    yd90 yd90Var2 = zd90Var.f;
                    if (yd90Var2 == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    String strF3 = f4i1.f("spotify:managed-account-linking:share-invite-link:", yd90Var2.a, "");
                    i8h1 i8h1Var2 = (i8h1) ((ikp) st60Var.b).get();
                    x6h1 x6h1VarC2 = ((txk0) st60Var.c).b.c();
                    x6h1VarC2.i.add(new a7h1("share_link_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    ((lzn0) st60Var.d).a(strF3, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF3)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                }
                return rih1Var;
            case 7:
                vu30 vu30Var = (vu30) obj;
                ArrayList<j0v0> arrayList = (ArrayList) obj3;
                fl90 fl90Var = (fl90) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (j0v0 j0v0Var : arrayList) {
                    arrayList2.add((bl90) vu30Var.invoke(j0v0Var, new x680(j0v0Var, fl90Var, (byte) 12)));
                }
                return arrayList2;
            case 8:
                return new n59((cir0) obj, (vx40) obj3, (j2i) obj2, (byte) 3);
            case 9:
                return new n59((cir0) obj, (ye90) obj3, (j2i) obj2, (byte) 4);
            case 10:
                ArrayList arrayList3 = (ArrayList) obj3;
                ((rtb0) obj).e(arrayList3.size(), new qbb0(arrayList3, (byte) 0), new qbb0(arrayList3, (byte) 1), new j2i(2039820996, new rbb0(arrayList3, (vu30) obj2, (byte) 0), true));
                return rih1Var;
            case 11:
                tv80 tv80Var = (tv80) obj2;
                mwn0 mwn0Var = (mwn0) ((o860) obj3).d;
                lsn0 lsn0Var = tv80Var != null ? new lsn0((String) null, tv80Var.a) : jsn0.a;
                mwn0Var.e(lsn0Var);
                mwn0Var.f(lsn0Var);
                return new tj4((byte) 12);
            case 12:
                ogb0 ogb0Var = (ogb0) obj;
                ggb0 ggb0Var = (ggb0) obj3;
                igb0 igb0Var = (igb0) obj2;
                ArrayList arrayList4 = ogb0Var.c;
                if (arrayList4 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList4) {
                        if (nhc1.Y(((t081) obj4).b, "customshortcut-lastvisitedpage-", false)) {
                            arrayList5.add(obj4);
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        arrayList5 = null;
                    }
                    if (arrayList5 != null) {
                        Context context = ogb0Var.a;
                        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                        Iterator it = arrayList5.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(((t081) it.next()).b);
                        }
                        w081.v(context, arrayList6);
                        arrayList4.removeAll(r7h.Y(arrayList5));
                    }
                }
                if (ggb0Var != null) {
                    String lowerCase = ggb0Var.b.toLowerCase(Locale.ROOT);
                    List list = ogb0Var.b;
                    if ((list == null || !nfb.e(list).contains(lowerCase)) && (arrayList4 == null || !nfb.e(arrayList4).contains(lowerCase))) {
                        Context context2 = igb0Var.c;
                        egb0 egb0Var = igb0Var.a;
                        Scheduler scheduler = egb0Var.a;
                        Scheduler scheduler2 = egb0Var.b;
                        if (context2 == null) {
                            u890.C("context");
                            throw null;
                        }
                        t081 t081VarA = ggb0Var.a(context2, ogb0Var.a(), egb0Var.e);
                        ((lb) ogb0Var.e.c).c(t081VarA);
                        Disposable disposable = igb0Var.g;
                        if (disposable != null) {
                            disposable.dispose();
                        }
                        igb0Var.g = null;
                        vz6 vz6Var = ggb0Var.c;
                        if (vz6Var instanceof vz6) {
                            String str4 = vz6Var.a;
                            hgb0 hgb0Var = new hgb0(ogb0Var, ggb0Var, igb0Var, t081VarA, (byte) 0);
                            ixg ixgVarF = egb0Var.c.f(str4);
                            ixgVarF.s((dgb0) egb0Var.f.getValue());
                            igb0Var.g = ixgVarF.i().map(va20.h).timeout(1500L, TimeUnit.MILLISECONDS, Single.error(new TimeoutException())).onErrorComplete().j(scheduler2).g(scheduler).subscribe(new rwa0(hgb0Var, b2));
                        } else if (vz6Var instanceof tz6) {
                            igb0Var.g = Single.just(((tz6) vz6Var).a).map(new hl00(egb0Var, (byte) 23)).map(kc20.i).onErrorComplete().j(scheduler2).g(scheduler).subscribe(new rwa0(new hgb0(ogb0Var, ggb0Var, igb0Var, t081VarA, (byte) 1), b3));
                        } else if (!(vz6Var instanceof uz6)) {
                            eg.o();
                            return null;
                        }
                    }
                }
                return rih1Var;
            case 13:
                dw91 dw91Var = (dw91) obj3;
                rib0 rib0Var = (rib0) obj2;
                dw91Var.put(rib0Var.a(), rih1Var);
                return new ht0(dw91Var, rib0Var, (byte) 26);
            case 14:
                fib0 fib0Var = (fib0) obj3;
                return new hp0(fib0Var.f.c(new lb50(fib0Var.g, new l811(), new x680((iu30) obj2, fib0Var, (byte) 20), (byte) 12)), (byte) 9);
            case 15:
                kil kilVar = (kil) obj;
                Flow flow = (Flow) obj3;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj2;
                kilVar.g(flow.getId(), 6, constraintLayout.getId(), 6);
                kilVar.g(flow.getId(), 3, constraintLayout.getId(), 3);
                kilVar.g(flow.getId(), 4, constraintLayout.getId(), 4);
                return rih1Var;
            case 16:
                ((kd31) obj).b(((Number) ((iu30) obj3).invoke((mhy) obj2)).floatValue());
                return rih1Var;
            case 17:
                tvb0 tvb0Var = (tvb0) obj3;
                mhy mhyVar = (mhy) ((List) obj2).get(((Number) obj).intValue());
                fzy fzyVarA = tvb0Var.a.a(mhyVar);
                mtm1 mtm1Var = (mtm1) tvb0Var.e.get(fzyVarA);
                String strA = mtm1Var != null ? mtm1Var.a(mhyVar) : null;
                if (strA == null) {
                    n57.e("No stable key for entity type " + fzyVarA + ", you need to provide a factory for it, with a stableKey implementation");
                }
                return strA == null ? l1d.m("your_library_list_composer_", fzyVarA.name()) : strA;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ji0 ji0Var = (ji0) obj3;
                kxb0 kxb0Var = (kxb0) obj2;
                if (bpo1.C(ji0Var, kxb0Var.f, kxb0Var.e)) {
                    kxb0Var.d.c(ji0Var.a);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                cas casVar = (a7m0) obj;
                casVar.a = k9b0.d1;
                if (((uxb0) ((yxb0) obj3).c).a) {
                    casVar.b = (t8h) obj2;
                }
                return rih1Var;
            case 20:
                vpu0 vpu0Var = (vpu0) obj3;
                List list2 = vpu0Var.b.f;
                if (!list2.isEmpty()) {
                    return new bol0(new qgl0(new qgl0(Integer.valueOf(vpu0Var.a), ((fji0) list2.get(0)).a.a, ((myb0) obj2).i), (short) 0));
                }
                hhg1.n("Missing member in members list.");
                return null;
            case 21:
                kkb kkbVar = (kkb) ((dxy) obj3).c;
                int iOrdinal2 = ((pc31) obj).ordinal();
                if (iOrdinal2 == 0) {
                    i8h1 i8h1Var3 = kkbVar.a;
                    r6h1 r6h1Var = r6h1.c;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-dialogs-try-again";
                    x6h1VarI.f = "3.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1 x6h1VarC3 = x6h1VarI.a().c();
                    x6h1VarC3.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_playlist", 1, Collections.singletonMap("playlist", (String) obj2)), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    i8h1 i8h1Var4 = kkbVar.a;
                    r6h1 r6h1Var2 = r6h1.c;
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-dialogs-try-again";
                    x6h1VarI2.f = "3.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1 x6h1VarC5 = x6h1VarI2.a().c();
                    x6h1VarC5.i.add(new a7h1("try_again_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis()), (xj61) null);
                }
                return rih1Var;
            case 22:
                int iOrdinal3 = ((vco) obj).ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                pdb0 pdb0Var = (pdb0) ((lcb0) obj3).g;
                if (pdb0Var != null) {
                    syb0 syb0Var = (syb0) obj2;
                    ji0 ji0Var2 = syb0Var.V0;
                    if (ji0Var2 == null) {
                        u890.C("ad");
                        throw null;
                    }
                    pdb0Var.invoke(new szb0(ji0Var2, syb0Var.n(), z));
                }
                return rih1Var;
            case 23:
                return new ht0((uh0) obj3, (tob1) obj2, (byte) 29);
            case 24:
                uv11 uv11Var = (uv11) obj2;
                return (t6g1) ((mbc0) obj3).b.invoke(uv11Var.a, uv11Var.b, (ioj0) obj);
            case 25:
                ((ggc0) obj3).c.invoke(new d5z(((fgc0) obj2).a));
                return rih1Var;
            case 26:
                cas casVar2 = (a7m0) obj;
                casVar2.a = f7c0.W0;
                casVar2.e = fnc0.c;
                casVar2.d = fnc0.d;
                casVar2.c = new x2y((zob1) obj3, (fai0) ((w2s) obj2).i);
                casVar2.a(xdc0.Z0, xdc0.a1);
                return rih1Var;
            case 27:
                x880 x880Var = new x880((mr20) obj3, (qoa0) obj, (byte) 25);
                return ((yo4) obj2).a() ? rqt0.u(x880Var) : x880Var;
            case 28:
                y6h1 y6h1Var3 = ((z2l0) obj).a;
                if (!((wls0) obj3).a()) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis());
                }
                String str5 = (String) obj2;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_public", 1, Collections.singletonMap("playlist_to_be_made_public", str5 != null ? str5 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
            default:
                op80 op80Var2 = (op80) obj;
                q1d0 q1d0Var = (q1d0) obj3;
                vu30 vu30Var2 = (vu30) q1d0Var.d.get(obj2.getClass());
                if (vu30Var2 == null || (op80Var = (op80) vu30Var2.invoke(obj2, op80Var2)) == null) {
                    op80Var = q6x.b;
                }
                q6x q6xVar = q1d0Var.e;
                if (q6xVar == null) {
                    q6xVar = q6x.b;
                }
                wch wchVar = q6x.b;
                if (!op80Var.equals(wchVar) || !q6xVar.equals(wchVar)) {
                    if (op80Var.equals(wchVar)) {
                        return q6xVar;
                    }
                    if (q6xVar.equals(wchVar)) {
                        return op80Var;
                    }
                    wchVar = new wch(op80Var, q6xVar);
                }
                return wchVar;
        }
    }
}
