package p;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.player.esperanto.proto.EsSignalRequest;
import com.spotify.player.model.command.SignalCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class efr implements Function, qiw, Predicate, s2k1, Function3, yu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ efr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static qau b(abu abuVar) {
        qau.CREATOR.getClass();
        if (abuVar instanceof nj90) {
            return qau.a(qau.U0, (Integer) null, (Integer) null, ((nj90) abuVar).getItemId(), false, false, (Boolean) null, (s9l1) null, (k9u) null, false, false, false, false, abuVar, false, false, (pau) null, (String) null, false, 1040379);
        }
        eg.o();
        return null;
    }

    public jhm a() {
        return new jhm("endless_dj_commentary", ftx.c, (fhm) null, 2131954361, (String) null, false, (tm81) null, new ihm(new bhm(2), new ghm(x0y.h, x0y.i), new i5w(this, (byte) 16)), 244);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((uh80) obj).a ? CompletableEmpty.a : ljg.c((ljg) ((wj3) obj2).Y, "aligned-curation:npv-add-button-onboarding:v1", (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510).ignoreElement();
            case 17:
                ymg0 ymg0Var = (ymg0) obj;
                if (!(ymg0Var instanceof xmg0)) {
                    Single singleJust = Single.just(jwu.a);
                    singleJust.getClass();
                    return singleJust;
                }
                umg0 umg0Var = ((xmg0) ymg0Var).a;
                kb10 kb10Var = umg0Var.c;
                fb10 fb10Var = new fb10(kb10Var.c, kb10Var.d, kb10Var.a, n1p1.q(kb10Var.b));
                eb10 eb10Var = umg0Var.d;
                za10 za10Var = new za10(eb10Var.c, eb10Var.d, eb10Var.a, n1p1.q(eb10Var.b));
                soa1 soa1Var = umg0Var.b;
                le20 le20Var = new le20(fb10Var, za10Var, (woa1) null, new noa1(soa1Var.c, soa1Var.d, soa1Var.a, n1p1.q(soa1Var.b)));
                return ((Completable) ((p5) ((na) obj2).b).invoke(le20Var)).e(Single.just(new kwu(le20Var)));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                bja1 bja1Var = (bja1) obj;
                k3v k3vVar = (k3v) obj2;
                return k3vVar.d.map(new j3v(bja1Var.a, (byte) 0)).switchMap(new qmr(k3vVar, (byte) 20)).map(new otu(k3vVar, bja1Var.b, (byte) 4));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((bkv) obj2).a.c().h((LoggingParams) obj).ignoreElement();
            case 20:
                yvg1 yvg1Var = (yvg1) obj;
                if (((Number) yvg1Var.b).intValue() >= 3) {
                    return Boolean.FALSE;
                }
                long jLongValue = ((Number) yvg1Var.a).longValue();
                Date date = new Date();
                if (jLongValue >= 0 && new Date(jLongValue + 604800000).after(date)) {
                    return Boolean.FALSE;
                }
                return ((Number) yvg1Var.c).intValue() < ((h84) ((yjq) obj2).e).c() ? Boolean.FALSE : Boolean.TRUE;
            case 26:
                yvg1 yvg1Var2 = (yvg1) obj;
                kuy kuyVar = (kuy) obj2;
                String str = (String) yvg1Var2.a;
                boolean zBooleanValue = ((Boolean) yvg1Var2.b).booleanValue();
                if (((Boolean) yvg1Var2.c).booleanValue() || !(zBooleanValue || ((wu4) kuyVar.t).a())) {
                    return Flowable.I(fuy.a);
                }
                Flowable flowable = rqt0.F((q8n) kuyVar.i, new ymu(kuyVar, str, (lnm) null, (byte) 23)).toFlowable();
                flowable.getClass();
                return flowable;
            case 28:
                nez nezVar = ((qez) obj2).a;
                List list = ((rgw) obj).a;
                nezVar.getClass();
                List<n620> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (n620 n620Var : list2) {
                    bqz bqzVar = nezVar.a;
                    String strF = i3a.f(n620Var.a);
                    long j = (int) ((n620Var.b / 12.0f) * 2.1474836E9f);
                    iqz iqzVarR = EsPrefs.Value.r();
                    iqzVarR.q(j);
                    EsPrefs.Value valueBuild = iqzVarR.build();
                    valueBuild.getClass();
                    arrayList.add(bqzVar.d(strF, valueBuild));
                }
                return new CompletableConcatIterable(arrayList);
            default:
                ruz ruzVar = (ruz) obj2;
                SignalCommand signalCommand = ((k9u0) obj).a;
                srz srzVarN = EsSignalRequest.SignalRequest.n();
                srzVarN.r(signalCommand.signalId());
                srzVarN.n(tgp1.s(ruzVar.b.a(signalCommand.loggingParams())));
                String str2 = (String) signalCommand.parameters().h();
                if (str2 != null) {
                    srzVarN.q(str2);
                }
                EsSignalRequest.SignalRequest signalRequestBuild = srzVarN.build();
                ujm ujmVar = ruzVar.a;
                signalRequestBuild.getClass();
                return ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", signalRequestBuild).map(xbp1.S0).map(v560.c1);
        }
    }

    public boolean c() {
        Activity activity = (Activity) this.b;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public void d() {
        ((k0t) this.b).e();
    }

    public void f(Intent intent, x871 x871Var) {
        ((dr41) this.b).j(intent, x871Var.a, x871Var.b);
    }

    public void g() {
        k0t k0tVar = (k0t) this.b;
        k0tVar.t = false;
        View view = k0tVar.i;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        h7z h7zVar = (h7z) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        t7y t7yVar = (t7y) this.b;
        smc0 smc0VarN = k4p1.n();
        if (h7zVar.b) {
            djd1 djd1Var = djd1.a;
            smc0VarN.add(new h8k1(djd1Var, djd1Var));
        }
        if (zBooleanValue2 && h7zVar.e) {
            yid1 yid1Var = yid1.a;
            smc0VarN.add(new h8k1(yid1Var, yid1Var));
        }
        rjd1 rjd1Var = rjd1.a;
        smc0VarN.add(new h8k1(rjd1Var, rjd1Var));
        zid1 zid1Var = zid1.a;
        smc0VarN.add(new h8k1(zid1Var, zid1Var));
        if (zBooleanValue) {
            ajd1 ajd1Var = ajd1.a;
            smc0VarN.add(new h8k1(ajd1Var, ajd1Var));
        }
        if (h7zVar.a) {
            njd1 njd1Var = njd1.a;
            smc0VarN.add(new h8k1(njd1Var, njd1Var));
        }
        if (h7zVar.c) {
            bjd1 bjd1Var = bjd1.a;
            smc0VarN.add(new h8k1(bjd1Var, bjd1Var));
        }
        if (((mh4) t7yVar.b).b()) {
            vhd1 vhd1Var = vhd1.a;
            smc0VarN.add(new h8k1(vhd1Var, vhd1Var));
        }
        if (h7zVar.d) {
            sjd1 sjd1Var = sjd1.a;
            smc0VarN.add(new h8k1(sjd1Var, sjd1Var));
        }
        if (h7zVar.f) {
            qjd1 qjd1Var = qjd1.a;
            smc0VarN.add(new h8k1(qjd1Var, qjd1Var));
        }
        ejd1 ejd1Var = ejd1.a;
        smc0VarN.add(new h8k1(ejd1Var, ejd1Var));
        pjd1 pjd1Var = pjd1.a;
        smc0VarN.add(new h8k1(pjd1Var, pjd1Var));
        return k4p1.k(smc0VarN);
    }

    public boolean test(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                g2h g2hVar = ((ias) obj2).f;
                obj.getClass();
                return !((Boolean) g2hVar.invoke(obj)).booleanValue();
            default:
                wqk1 wqk1Var = ((ifs) obj2).b;
                Double d = ((l0u) obj).a;
                boolean z = (d == null || u890.g(d, -1.0d) || wqk1Var.a.b() - wqk1Var.b < 200) ? false : true;
                if (!z) {
                    wqk1Var.a.b();
                }
                return z;
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                zmr zmrVar = (zmr) obj2;
                String str = ((xik) obj).b;
                ((TextView) zmrVar.d.Y).setText(str);
                e93 e93Var = zmrVar.e;
                TextView textView = (TextView) e93Var.U0;
                aiq0.a(textView, new n9m(textView, textView, str, (Object) null, o9m.a, (byte) 0));
                ((TextView) e93Var.Q0).setText(str);
                ContextMenuButton contextMenuButton = (ContextMenuButton) zmrVar.f.f;
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(2131962408, str));
                break;
            case 4:
                String str2 = (String) obj;
                boolean zY0 = ihc1.y0(str2);
                wdm wdmVar = ((srr) obj2).b;
                if (!zY0) {
                    ((TextView) wdmVar.Y).setText(str2);
                    ((TextView) wdmVar.Y).setVisibility(0);
                } else {
                    ((TextView) wdmVar.Y).setVisibility(8);
                }
                break;
            case 6:
                z800 z800Var = (z800) obj;
                z800Var.getClass();
                dxy dxyVar = (dxy) ((yir) obj2).c;
                if (z800Var.d == null || z800Var.e == null) {
                    ((CalendarIconView) dxyVar.d).setVisibility(8);
                } else {
                    ((CalendarIconView) dxyVar.d).setVisibility(0);
                    ((CalendarIconView) dxyVar.d).c(new xwc(124, (Integer) null, (Integer) null, z800Var.d, z800Var.e, false));
                }
                break;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                ((ConstraintLayout) ((ngr) obj2).f).setContentDescription(str3);
                break;
            default:
                snf1 snf1Var = (snf1) obj;
                lvs lvsVar = (lvs) obj2;
                snf1Var.getClass();
                ((AddToButtonView) lvsVar.d.c).a(new pk1(snf1Var.h ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30));
                break;
        }
    }

    public void e() {
    }
}
