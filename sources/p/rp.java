package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;
import com.spotify.mobius.Connection;
import com.spotify.puffin.setup.setupflow.autodetect.ui.AutodetectView;
import com.spotify.puffin.setup.setupflow.ui.ErrorView;
import com.spotify.puffin.sharedui.views.DisconnectedView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rp implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(int i, String str, int i2, ArrayList arrayList, iu30 iu30Var) {
        int iNextIndex;
        String string = ((Context) ((he7) this.b).c).getString(i);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (((Boolean) iu30Var.invoke((bw31) it.next())).booleanValue()) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            arrayList.add(i3, new pv31(string, "section".concat(string)));
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            if (((Boolean) iu30Var.invoke((bw31) listIterator.previous())).booleanValue()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex >= 0) {
            arrayList.add(iNextIndex + 1, new qv31(new wd7(str, i2), "seeAll".concat(string)));
        }
    }

    public final void accept(Object obj) {
        ArrayList arrayList;
        int i;
        String str;
        k1v k1vVar;
        se81 se81Var;
        a layoutManager;
        byte b = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((r4u) ((sp) obj2).g).e((hp) obj);
                return;
            case 1:
                if (((lu1) obj).equals(lu1.a)) {
                    ((ma0) ((ku1) obj2).b).invoke();
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 2:
                h52 h52Var = (h52) obj;
                u961 u961Var = ((n42) obj2).Y1;
                if (u961Var != null) {
                    ((hrr0) u961Var.b).setValue(h52Var);
                    return;
                } else {
                    u890.C("adsDsaView");
                    throw null;
                }
            case 3:
                rk2 rk2Var = ((xm2) obj).a;
                int i3 = AgeVerificationDialogActivity.n1;
                ((AgeVerificationDialogActivity) obj2).l1.setValue(rk2Var);
                return;
            case 4:
                if (((r04) obj) == r04.a) {
                    ((z04) obj2).a.invoke();
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 5:
                eo5 eo5Var = (eo5) obj;
                hv41 hv41Var = ((ko5) obj2).b;
                List<tn5> list = eo5Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (tn5 tn5Var : list) {
                    do5 do5Var = tn5Var.a;
                    arrayList2.add(new u01(do5Var, tn5Var.b, do5Var.equals(eo5Var.b)));
                }
                hv41Var.C(arrayList2);
                return;
            case 6:
                bpb1 bpb1Var = (wen0) ((idd1) ((co6) obj2).f).getValue();
                bpb1Var.getClass();
                bpb1Var.m((Object) null, (vn6) obj);
                return;
            case 7:
                fr6 fr6Var = (fr6) obj;
                cr6 cr6Var = (cr6) obj2;
                if (!(fr6Var instanceof fr6)) {
                    eg.o();
                    return;
                }
                ow3 ow3Var = (ow3) cr6Var.d;
                String str2 = fr6Var.a;
                i8h1 i8h1Var = (i8h1) ((ewo) ow3Var.b).get();
                x6h1 x6h1VarC = ((dsk0) ow3Var.c).b.c();
                x6h1VarC.i.add(new a7h1("artist_row", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC.j = false;
                ((lzn0) cr6Var.c).a(str2, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 8:
                dg7 dg7Var = (dg7) obj;
                he7 he7Var = (he7) obj2;
                sd7 sd7Var = dg7Var.j;
                String str3 = sd7Var.b;
                if (str3 != null) {
                    he7Var.g.setText(str3);
                }
                List<hi90> list2 = sd7Var.f;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (hi90 hi90Var : list2) {
                    boolean z = sd7Var.d;
                    boolean z2 = dg7Var.b;
                    sfu0 sfu0Var = dg7Var.h;
                    boolean z3 = dg7Var.d;
                    List list3 = dg7Var.c;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((hi90) it.next()).getUri());
                    }
                    arrayList3.add(icx0.a(hi90Var, arrayList4.contains(hi90Var.getUri()), z, z2, z3, dg7Var.e, dg7Var.f, dg7Var.g, sfu0Var));
                }
                ArrayList arrayList5 = new ArrayList(arrayList3);
                yd7 yd7Var = sd7Var.h;
                if (yd7Var instanceof ud7) {
                    String str4 = ((ud7) yd7Var).a.a;
                    arrayList = arrayList5;
                    a(2131952542, str4, 1, arrayList, ge7.b);
                    a(2131952507, str4, 2, arrayList, ge7.c);
                    a(2131952540, str4, 3, arrayList, ge7.d);
                    a(2131952508, str4, 4, arrayList, ge7.e);
                } else {
                    arrayList = arrayList5;
                }
                ((emc0) ((lcb0) he7Var.e)).d.b(o7h.l1(arrayList), new is3(new i26(he7Var, (byte) 13), (byte) 2));
                return;
            case 9:
                vc7 vc7Var = vc7.b;
                dg7 dg7Var2 = (dg7) obj;
                mg7 mg7Var = (mg7) obj2;
                qzh qzhVar = mg7Var.Z;
                RecyclerView recyclerView = mg7Var.i;
                ComposeView composeView = mg7Var.t;
                qzh qzhVar2 = mg7Var.N0;
                lcb0 lcb0Var = mg7Var.d;
                sd7 sd7Var2 = dg7Var2.j;
                int i4 = sd7Var2.g;
                String str5 = sd7Var2.a;
                List list4 = sd7Var2.f;
                ogr0 ogr0Var = ogr0.a;
                z6x z6xVar = z6x.a;
                if (i4 == 3) {
                    ((emc0) lcb0Var).d.b(z6xVar, new is3(vc7Var, (byte) 2));
                    composeView.setVisibility(8);
                    recyclerView.setVisibility(4);
                    qzhVar2.getView().setVisibility(0);
                    qzhVar.getView().setVisibility(8);
                    mg7Var.Q0.setValue(ogr0Var);
                    qzhVar2.f(new fkz(dg7Var2.a));
                    return;
                }
                if (list4.isEmpty()) {
                    ((emc0) lcb0Var).d.b(z6xVar, new is3(vc7Var, (byte) 2));
                    composeView.setVisibility(0);
                    w(dg7Var2);
                    recyclerView.setVisibility(4);
                    qzhVar.getView().setVisibility(0);
                    qzhVar2.getView().setVisibility(8);
                    mg7Var.Q0.setValue(ogr0Var);
                    List list5 = sd7Var2.t;
                    if ((list5 instanceof Collection) && list5.isEmpty()) {
                        i = 2;
                    } else {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((gzy) it2.next()) != gzy.f) {
                                i = 1;
                            }
                        }
                        i = 2;
                    }
                    qzhVar.f(new i9x(str5, i));
                    return;
                }
                composeView.setVisibility(!sd7Var2.i.isEmpty() ? 0 : 8);
                recyclerView.setVisibility(0);
                qzhVar.getView().setVisibility(8);
                qzhVar2.getView().setVisibility(8);
                w(dg7Var2);
                boolean z4 = str5.length() == 0 && !list4.isEmpty();
                smc0 smc0VarN = k4p1.n();
                if (z4) {
                    String string = mg7Var.a.getString(2131952537);
                    smc0VarN.add(new pv31(string, string));
                }
                List list6 = list4;
                ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    hi90 hi90Var2 = (hi90) it3.next();
                    boolean z5 = sd7Var2.d;
                    boolean z6 = dg7Var2.b;
                    sfu0 sfu0Var2 = dg7Var2.h;
                    boolean z7 = dg7Var2.d;
                    List list7 = dg7Var2.c;
                    Iterator it4 = it3;
                    ArrayList arrayList7 = new ArrayList(q7h.U(list7, 10));
                    Iterator it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(((hi90) it5.next()).getUri());
                    }
                    arrayList6.add(icx0.a(hi90Var2, arrayList7.contains(hi90Var2.getUri()), z5, z6, z7, dg7Var2.e, dg7Var2.f, dg7Var2.g, sfu0Var2));
                    it3 = it4;
                }
                smc0VarN.addAll(arrayList6);
                if (z4) {
                    smc0VarN.add(new zu31());
                }
                ((emc0) lcb0Var).d.b(k4p1.k(smc0VarN), new is3(new hh(mg7Var, dg7Var2, this, (byte) 22), (byte) 2));
                return;
            case 10:
                wq8 wq8Var = ((tq8) obj).a;
                if (wq8Var != null) {
                    AuthorizationActivity authorizationActivity = (AuthorizationActivity) obj2;
                    authorizationActivity.j1 = wq8Var.c;
                    authorizationActivity.h1 = wq8Var;
                    return;
                }
                return;
            case 11:
                t59 t59Var = (x59) obj;
                s59 s59Var = (s59) obj2;
                bjx bjxVar = (bjx) s59Var.d;
                EncoreButton encoreButton = (EncoreButton) bjxVar.c;
                DisconnectedView disconnectedView = (DisconnectedView) bjxVar.e;
                ErrorView errorView = (ErrorView) bjxVar.f;
                AutodetectView autodetectView = (AutodetectView) bjxVar.b;
                encoreButton.setVisibility(t59Var.a() ? 0 : 8);
                boolean z8 = t59Var instanceof w59;
                ((ProgressBar) bjxVar.g).setVisibility(z8 ? 0 : 8);
                boolean z9 = t59Var instanceof t59;
                autodetectView.setVisibility(z9 ? 0 : 8);
                boolean z10 = t59Var instanceof v59;
                errorView.setVisibility(z10 ? 0 : 8);
                boolean z11 = t59Var instanceof u59;
                disconnectedView.setVisibility(z11 ? 0 : 8);
                if (z9) {
                    autodetectView.a(t59Var, new kr60(s59Var, (byte) 26));
                    return;
                }
                if (z10) {
                    v59 v59Var = (v59) t59Var;
                    errorView.y(v59Var.a, new q59(v59Var, s59Var, (byte) 0));
                    return;
                } else {
                    if (z8) {
                        return;
                    }
                    if (z11) {
                        disconnectedView.setActions(new dg8((Object) s59Var, (byte) 1));
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
            case 12:
                p5e p5eVar = (p5e) obj;
                s5e s5eVar = (s5e) obj2;
                q4e q4eVar = s5eVar.b;
                List list8 = p5eVar.a;
                ArrayList arrayList8 = new ArrayList(q7h.U(list8, 10));
                int i5 = 0;
                for (Object obj3 : list8) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    u8e u8eVar = (u8e) obj3;
                    arrayList8.add(new z8e(u8eVar, ((oto0) q4eVar.h).a.g(), new gu2(q4eVar, u8eVar, i5, (byte) 8)));
                    i5 = i6;
                }
                j4u j4uVarP = w0h1.p(new w0e(q4eVar.e, arrayList8, (byte) 1));
                q4eVar.e = arrayList8;
                j4uVarP.b(q4eVar);
                scb0 scb0Var = p5eVar.b;
                boolean z12 = s5eVar.f;
                cab cabVar = s5eVar.O0;
                if (cabVar != null) {
                    haa0 haa0Var = (haa0) cabVar.c;
                    TextView textView = (TextView) haa0Var.d;
                    ConstraintLayout constraintLayout = (ConstraintLayout) haa0Var.b;
                    if (u890.j(scb0Var, tcb0.a)) {
                        constraintLayout.setVisibility(z12 ? 0 : 8);
                        textView.setText(2131959169);
                        return;
                    }
                    if (u890.j(scb0Var, vcb0.a)) {
                        constraintLayout.setVisibility(z12 ? 0 : 8);
                        textView.setText(2131959168);
                        TypedValue typedValue = new TypedValue();
                        constraintLayout.getContext().getTheme().resolveAttribute(2130968782, typedValue, true);
                        textView.setTextColor(typedValue.data);
                        ((IconExclamationCircle) haa0Var.c).setVisibility(0);
                        return;
                    }
                    if (u890.j(scb0Var, ucb0.a)) {
                        textView.setText(2131959170);
                        constraintLayout.setVisibility(z12 ? 0 : 8);
                        return;
                    } else if (!(scb0Var instanceof scb0)) {
                        eg.o();
                        return;
                    } else {
                        textView.setText(scb0Var.b);
                        constraintLayout.setVisibility(z12 ? 0 : 8);
                        return;
                    }
                }
                return;
            case 13:
                g8e g8eVar = (g8e) obj2;
                rh90 rh90Var = g8eVar.d;
                an anVar = g8eVar.b;
                if (rh90Var instanceof rh90) {
                    str = rh90Var.d;
                } else {
                    if (!(rh90Var instanceof mh90)) {
                        eg.o();
                        return;
                    }
                    str = ((mh90) rh90Var).d;
                }
                cab cabVar2 = g8eVar.Y;
                if (cabVar2 != null) {
                    ((TextView) cabVar2.c).setText(str);
                }
                if (rh90Var instanceof rh90) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    yge ygeVar = rh90Var.e;
                    if (ygeVar.b != null) {
                        linkedHashSet.add(kfe.a);
                    }
                    if (ygeVar.a != null) {
                        linkedHashSet.add(kfe.b);
                    }
                    ArrayList arrayList9 = new ArrayList(q7h.U(linkedHashSet, 10));
                    for (Object obj4 : linkedHashSet) {
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        arrayList9.add(new tge(rh90Var, (kfe) obj4, new du0(anVar, i2, (byte) 9)));
                        i2 = i7;
                    }
                    anVar.e = arrayList9;
                } else {
                    if (!(rh90Var instanceof mh90)) {
                        eg.o();
                        return;
                    }
                    anVar.e = anVar.A((mh90) rh90Var, true);
                }
                anVar.h();
                return;
            case 14:
                i2h i2hVar = (i2h) obj;
                imb1 imb1Var = i2hVar.c;
                q2r0 q2r0Var = i2hVar.a;
                if (!(q2r0Var instanceof q2r0)) {
                    hhg1.n("Failed requirement.");
                    return;
                }
                if (!(imb1Var instanceof imb1)) {
                    hhg1.n("Failed requirement.");
                    return;
                }
                sp spVar = (sp) obj2;
                imb1 imb1Var2 = imb1Var;
                u2h u2hVar = imb1Var2.c;
                spVar.h = imb1Var2;
                q2r0 q2r0Var2 = q2r0Var;
                qz50 qz50Var = q2r0Var2.a;
                String str6 = qz50Var.a;
                spVar.f = qz50Var;
                spVar.e = u2hVar;
                qzh qzhVar3 = (qzh) spVar.d;
                Integer num = i2hVar.b;
                int iIntValue = num != null ? num.intValue() : 0;
                boolean zIsEmpty = q2r0Var2.b.a.isEmpty();
                String str7 = str6 == null ? "" : str6;
                zbm zbmVar = new zbm(4, str6 == null ? "" : str6);
                if (imb1Var2.a && qz50Var.d) {
                    String str8 = qz50Var.e;
                    int i8 = qz50Var.f;
                    xwp0 xwp0VarO = dm5.O(i8, str8);
                    if (xwp0VarO.equals(rwp0.a) || xwp0VarO.equals(pwp0.a)) {
                        k1vVar = h1v.a;
                    } else if (xwp0VarO.equals(hwp0.a) || xwp0VarO.equals(twp0.a)) {
                        k1vVar = i1v.a;
                    } else if (xwp0VarO instanceof jwp0) {
                        k1vVar = new k1v(Float.valueOf(yoi1.o(i8 / 100.0f, 0.0f, 1.0f)));
                    } else if ((xwp0VarO instanceof vwp0) || xwp0VarO.equals(nwp0.a)) {
                        k1vVar = n1v.a;
                    } else {
                        if (!xwp0VarO.equals(lwp0.a)) {
                            eg.o();
                            return;
                        }
                        k1vVar = l1v.a;
                    }
                } else {
                    k1vVar = m1v.a;
                }
                sru sruVar = new sru(k1vVar, (String) null, (String) null, (String) null, 14);
                g330 g330Var = new g330(qz50Var.c ? 1 : 2, false, 14);
                cet0 cet0Var = new cet0(u2hVar instanceof p2h, zIsEmpty ? yft0.a : new zft0(false, false), (String) null, 4);
                if (zIsEmpty) {
                    se81Var = null;
                } else {
                    boolean z13 = imb1Var2.d;
                    Context context = (Context) spVar.b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    se81Var = new se81(z13, context.getString(2131955425, str6));
                }
                qzhVar3.f(new z1h(str7, iIntValue, cet0Var, se81Var, g330Var, sruVar, zbmVar));
                return;
            case 15:
                bpb1 bpb1Var2 = (wen0) ((rak) obj2).g.getValue();
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, (xbk) obj);
                return;
            case 16:
                ljk ljkVar = (ljk) obj2;
                nkk nkkVar = (nkk) ljkVar.a.apply((ca00) obj);
                nsg nsgVar = ljkVar.f;
                Runnable runnable = ljkVar.i;
                if (runnable != null) {
                    nsgVar.a.removeCallbacks(runnable);
                }
                ljkVar.i = null;
                xik xikVar = nkkVar.a.a;
                ljkVar.t.f(xikVar);
                Long l = xikVar.s;
                if (xikVar.r && l != null) {
                    Runnable nx30Var = new nx30(ljkVar, xikVar, (byte) 13);
                    ConstraintLayout constraintLayout2 = nsgVar.a;
                    long jLongValue = l.longValue() - ljkVar.e.b();
                    if (jLongValue < 0) {
                        jLongValue = 0;
                    }
                    constraintLayout2.postDelayed(nx30Var, jLongValue);
                    ljkVar.i = nx30Var;
                }
                bpb1 bpb1Var3 = (wen0) ljkVar.g.getValue();
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, nkkVar);
                return;
            case 17:
                spk spkVar = (spk) obj2;
                idd1 idd1Var = (idd1) spkVar.f;
                bpb1 bpb1Var4 = (wen0) idd1Var.getValue();
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, (gpk) obj);
                gpk gpkVar = (gpk) ((wen0) idd1Var.getValue()).getValue();
                uy30 uy30Var = gpkVar.a;
                if (uy30Var != null) {
                    if (uy30Var.d != null) {
                        gpkVar.c.f(((cir0) spkVar.b).e(), new jp5(gpkVar, spkVar, (byte) 1));
                        return;
                    } else {
                        ((mpk) spkVar.e).a(uy30Var);
                        return;
                    }
                }
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                mj mjVar = ((qcr) obj).b;
                odr odrVar = ((ej) obj2).f;
                if (odrVar != null) {
                    odrVar.f(mjVar);
                    return;
                }
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                bfj0 bfj0Var = (bfj0) obj;
                paj0 paj0Var = (paj0) ((r8s) obj2).e;
                if (bfj0Var instanceof yej0) {
                    paj0Var.l(((yej0) bfj0Var).a);
                    return;
                }
                if (bfj0Var instanceof zej0) {
                    paj0Var.j(((zej0) bfj0Var).a);
                    return;
                } else if (bfj0Var instanceof afj0) {
                    paj0Var.g(((afj0) bfj0Var).a);
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 20:
                egj0 egj0Var = (hgj0) obj;
                paj0 paj0Var2 = ((g9s) obj2).b;
                if (egj0Var instanceof bgj0) {
                    bgj0 bgj0Var = (bgj0) egj0Var;
                    paj0Var2.h(bgj0Var.c, bgj0Var.d, bgj0Var.b, bgj0Var.a);
                    return;
                }
                if (egj0Var instanceof egj0) {
                    paj0Var2.c(egj0Var.a);
                    return;
                }
                if (egj0Var instanceof cgj0) {
                    cgj0 cgj0Var = (cgj0) egj0Var;
                    paj0Var2.a(cgj0Var.a, cgj0Var.b);
                    return;
                } else {
                    if (egj0Var instanceof fgj0) {
                        paj0Var2.i(((fgj0) egj0Var).a);
                        return;
                    }
                    if (egj0Var instanceof dgj0) {
                        paj0Var2.k();
                        return;
                    } else if (egj0Var instanceof ggj0) {
                        paj0Var2.d(((ggj0) egj0Var).a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
            case 21:
                ((c1t) obj2).a.m((Object) null, new mum1(((tr3) obj).b.a.d));
                return;
            case 22:
                hpc0 hpc0Var = (hpc0) obj;
                qn qnVar = (qn) obj2;
                if (hpc0Var instanceof gpc0) {
                    ((qwc1) qnVar.b).invoke(((gpc0) hpc0Var).a);
                    return;
                } else if (hpc0Var instanceof fpc0) {
                    ((cmd1) qnVar.c).invoke(((fpc0) hpc0Var).a);
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 23:
                ((kdn0) ((x2y) obj2).b).m(hqq0.m0((u3y) obj));
                return;
            case 24:
                tr3 tr3Var = (tr3) obj;
                ley leyVar = (ley) obj2;
                leyVar.f = h4p1.w(tr3Var.b.a.d);
                leyVar.g = (Set) tr3Var.c.a(h0v0.a);
                return;
            case 25:
                ((Connection) obj2).accept((coy) obj);
                return;
            case 26:
                ir61 ir61Var = (ir61) obj;
                r5z r5zVar = (r5z) obj2;
                u800 u800Var = (u800) r5zVar.b;
                bk7 bk7Var = (bk7) r5zVar.e;
                i5z i5zVar = (i5z) r5zVar.c;
                if (bk7Var != null) {
                    i5zVar.a.getClass();
                    ArrayList arrayListA = f5z.a(ir61Var);
                    c21 c21Var = (c21) bk7Var.e;
                    ArrayList arrayList10 = (ArrayList) c21Var.f;
                    j4u j4uVarP2 = w0h1.p(new r0i((byte) 0, arrayList10, (LinkedHashMap) c21Var.b, arrayListA));
                    arrayList10.clear();
                    arrayList10.addAll(arrayListA);
                    j4uVarP2.b(bk7Var);
                    return;
                }
                nty ntyVar = new nty(r5zVar, (byte) 9);
                i5zVar.getClass();
                bk7 bk7VarF = bbp1.f(new djx(i5zVar, ir61Var, ntyVar, (byte) 9));
                r5zVar.e = bk7VarF;
                Parcelable parcelable = (Parcelable) r5zVar.f;
                if (parcelable != null && (layoutManager = u800Var.a().getLayoutManager()) != null) {
                    layoutManager.w0(parcelable);
                }
                u800Var.a().setAdapter(bk7VarF);
                return;
            case 27:
                lht0 lht0Var = (lht0) obj;
                v7z v7zVar = (v7z) obj2;
                jar0 jar0Var = v7zVar.b;
                if (lht0Var instanceof fht0) {
                    v7zVar.e.e(new r0u0(((fht0) lht0Var).a));
                    return;
                }
                if (lht0Var instanceof ght0) {
                    ght0 ght0Var = (ght0) lht0Var;
                    v7zVar.a(ght0Var.a, ght0Var.b, ght0Var.c, -1L, -1L, -1L);
                    return;
                }
                if (lht0Var instanceof iht0) {
                    iht0 iht0Var = (iht0) lht0Var;
                    v7zVar.a(iht0Var.a, iht0Var.b, iht0Var.c, iht0Var.d, -1L, -1L);
                    return;
                }
                if (lht0Var instanceof hht0) {
                    hht0 hht0Var = (hht0) lht0Var;
                    v7zVar.a(hht0Var.a, hht0Var.b, null, -1L, -1L, hht0Var.c);
                    return;
                } else if (lht0Var.equals(jht0.a)) {
                    jar0Var.getClass();
                    return;
                } else {
                    if (!(lht0Var instanceof bht0)) {
                        eg.o();
                        return;
                    }
                    bht0 bht0Var = (bht0) lht0Var;
                    v7zVar.a(bht0Var.a, bht0Var.b, null, bht0Var.c, bht0Var.d, -1L);
                    jar0Var.getClass();
                    return;
                }
            case 28:
                id40 id40Var = (id40) obj;
                boolean z14 = id40Var.d;
                boolean z15 = id40Var.c;
                boolean z16 = id40Var.b;
                kd40 kd40Var = (kd40) obj2;
                ProgressBar progressBar = kd40Var.h;
                Button button = kd40Var.d;
                Button button2 = kd40Var.g;
                Button button3 = kd40Var.f;
                Button button4 = kd40Var.e;
                if (button4.getVisibility() == 0 && !z16) {
                    button4.setVisibility(8);
                } else if (button4.getVisibility() == 8 && z16) {
                    button4.setVisibility(0);
                } else if (button3.getVisibility() == 0 && !z15) {
                    button3.setVisibility(8);
                } else if (button3.getVisibility() == 8 && z15) {
                    button3.setVisibility(0);
                } else if (button2.getVisibility() == 0 && !z14) {
                    button2.setVisibility(8);
                } else if (button2.getVisibility() == 8 && z14) {
                    button2.setVisibility(0);
                }
                boolean z17 = id40Var.e;
                Button button5 = kd40Var.c;
                if (z17) {
                    button5.setEnabled(false);
                    button.setEnabled(false);
                    button4.setEnabled(false);
                    progressBar.setVisibility(0);
                    return;
                }
                button5.setEnabled(true);
                button.setEnabled(true);
                button4.setEnabled(true);
                progressBar.setVisibility(8);
                return;
            default:
                r5z r5zVar2 = (r5z) obj2;
                ((vku) r5zVar2.f).a(((Flowable) r5zVar2.b).z().map(yz10.e).filter(zz10.e).subscribe(new lgr((df50) obj, r5zVar2, (byte) 25), k530.X));
                return;
        }
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                hv41 hv41Var = ((ko5) obj).b;
                hv41Var.g = null;
                hv41Var.h = null;
                break;
            case 6:
                break;
            case 7:
                ((vku) ((cr6) obj).g).c();
                break;
            case 8:
            case 9:
            case 10:
                break;
            case 11:
                ((s59) obj).b = null;
                break;
            case 12:
            case 13:
            case 14:
                break;
            case 15:
                ((rak) obj).h.l((Object) null);
                break;
            case 16:
                ljk ljkVar = (ljk) obj;
                Runnable runnable = ljkVar.i;
                if (runnable != null) {
                    ljkVar.f.a.removeCallbacks(runnable);
                }
                ljkVar.i = null;
                break;
            case 17:
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                break;
            case 25:
                ((Connection) obj).dispose();
                break;
            case 26:
                ((r5z) obj).d = null;
                break;
            case 27:
                Disposable disposable = ((v7z) obj).i;
                if (disposable != null) {
                    disposable.dispose();
                }
                break;
            case 28:
                break;
            default:
                ((vku) ((r5z) obj).f).c();
                break;
        }
    }

    public void w(dg7 dg7Var) {
        r620 r620Var;
        hrr0 hrr0Var = ((mg7) this.b).P0;
        sd7 sd7Var = dg7Var.j;
        List list = sd7Var.i;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            switch (((gzy) it.next()).ordinal()) {
                case 0:
                    r620Var = r620.SHOWS;
                    break;
                case 1:
                    r620Var = r620.TRACKS;
                    break;
                case 2:
                    r620Var = r620.ALBUMS;
                    break;
                case 3:
                    r620Var = r620.ARTISTS;
                    break;
                case 4:
                    r620Var = r620.EPISODES;
                    break;
                case 5:
                    r620Var = r620.AUDIOBOOKS;
                    break;
                case 6:
                    r620Var = r620.PLAYLISTS;
                    break;
                default:
                    eg.o();
                    return;
            }
            arrayList.add(r620Var);
        }
        r620 r620Var2 = sd7Var.e;
        if (r620Var2 == r620.TOP) {
            r620Var2 = null;
        }
        hrr0Var.setValue(new s820(arrayList, r620Var2));
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }
}
