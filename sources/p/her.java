package p;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class her implements qiw, Function, hs31, nyc, ya {
    public final /* synthetic */ byte a;
    public Object b;

    public her(byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = vvt.a.m(SmallDisplaySizeQuirk.class);
                break;
            case 29:
                break;
            default:
                this.b = a4x.d() ? f() : null;
                break;
        }
    }

    public mr20 a() {
        inr inrVar = (g0l) this.b;
        return rqt0.u(hu20.e(yoi1.g(inrVar.m()), new qd0((lnm) null, yoi1.g(hqq0.J(inrVar)), this, (byte) 13)));
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        return ((ytp0) this.b).v(kskVar.c, kskVar.a, 2);
    }

    public Object apply(Object obj) {
        lnm lnmVar = null;
        switch (this.a) {
            case 3:
                s1l s1lVar = (s1l) obj;
                pnr pnrVar = (pnr) this.b;
                s1lVar.getClass();
                return j2h1.D(pnrVar.f, new clo(pnrVar, s1lVar, lnmVar, (byte) 14)).g(new bm0(pnrVar, s1lVar, (byte) 18)).o(Functions.h);
            case 9:
                return Observable.fromIterable((List) obj).flatMapSingle(new vun((e8s) this.b, (byte) 15)).toList();
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    return ((j0n1) ((l6s) this.b).b).b.hide();
                }
                Observable observableJust = Observable.just(BadgingState.HIDE_BADGE);
                observableJust.getClass();
                return observableJust;
            case 15:
                return new mmr0((tss) this.b, (spq0) obj);
            case 20:
                Logger.d("MBS: %s", new Object[]{((Throwable) obj).getLocalizedMessage()});
                spq0 spq0Var = (spq0) this.b;
                if (!spq0Var.c()) {
                    tc4.Companion.getClass();
                    w7x w7xVar = w7x.a;
                    return new tc4(w7xVar, w7xVar);
                }
                ctc ctcVar = (ctc) spq0Var.b();
                sc4 sc4Var = tc4.Companion;
                Set set = ctcVar.a;
                Set set2 = ctcVar.b;
                sc4Var.getClass();
                return new tc4(set, set2);
            case 22:
                return (CompletableSource) ((g6u) this.b).c.invoke((me20) obj);
            default:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (a2v a2vVar : (xj61) this.b) {
                    f2v f2vVar = (h2v) map.get(a2vVar);
                    int i = a2vVar.b;
                    String str = a2vVar.a;
                    int iC = l1d.C(i);
                    if (iC != 0) {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        if (f2vVar == null) {
                            f2vVar = f2v.a;
                        }
                        linkedHashMap2.put(str, f2vVar);
                    } else if (f2vVar != null) {
                        linkedHashMap.put(str, f2vVar);
                    }
                }
                return new gwu(linkedHashMap, linkedHashMap2);
        }
    }

    public jhm b(s6t s6tVar, String str, String str2) {
        return new jhm("campfire_delete_chat", cmx.c, (fhm) null, 2131958527, (String) null, false, (tm81) null, new ihm(new ygm(3), hhm.c, new ghm(d0t.Z0, d0t.a1), new ggh(this, s6tVar, str, str2, (byte) 19)), 244);
    }

    public void c(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void d(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    public void e(long j) {
        long jB = TextUnit.b(j);
        byte b = 0;
        if (!wee1.a(jB, 0L)) {
            if (wee1.a(jB, 4294967296L)) {
                b = 1;
            } else if (wee1.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (wee1.a(TextUnit.b(j), 0L)) {
            return;
        }
        d(TextUnit.c(j));
    }

    public tob1 f() {
        a4x a4xVarA = a4x.a();
        if (a4xVarA.c() == 1) {
            return new m280(true);
        }
        hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
        a4xVarA.i(new p2s(hrr0VarQ, this, (byte) 0));
        return hrr0VarQ;
    }

    public tob1 g() {
        tob1 tob1Var = (tob1) this.b;
        if (tob1Var != null) {
            return tob1Var;
        }
        if (!a4x.d()) {
            return w2g0.b;
        }
        tob1 tob1VarF = f();
        this.b = tob1VarF;
        return tob1VarF;
    }

    public boolean h() {
        return ((ya91) this.b).a();
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        ((fur) ((wf2) this.b).b).a(intent.getStringExtra("DEVICE_PICKER_INTERACTION_ID"), intent.getBooleanExtra("DEVICE_PICKER_OPEN_PARTICIPANTS", false));
    }

    public void k(jf01 jf01Var, IOException iOException) {
        ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
        if (observableEmitter.isDisposed()) {
            return;
        }
        observableEmitter.onError(iOException);
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
        try {
            String strF = ry21Var.g.f();
            if (ry21Var.Q0) {
                if (strF == null) {
                    strF = "";
                }
                observableEmitter.onNext(strF);
                observableEmitter.onComplete();
                return;
            }
            Exception exc = new Exception(strF);
            if (observableEmitter.isDisposed()) {
                return;
            }
            observableEmitter.onError(exc);
        } catch (Exception e) {
            if (observableEmitter.isDisposed()) {
                return;
            }
            observableEmitter.onError(e);
        }
    }

    public void v(Object obj) {
        switch (this.a) {
            case 1:
                Boolean bool = (Boolean) obj;
                View view = ((plr) this.b).b;
                bool.getClass();
                view.setVisibility(bool.booleanValue() ? 0 : 8);
                return;
            case 2:
                xik xikVar = (xik) obj;
                zmr zmrVar = (zmr) this.b;
                xikVar.getClass();
                ((EncoreButton) zmrVar.f.c).setVisibility(xikVar.r ? 0 : 8);
                return;
            case 4:
                String str = (String) obj;
                SeeMoreTextView seeMoreTextView = ((err) this.b).X;
                seeMoreTextView.setVisibility(ihc1.y0(str) ? 8 : 0);
                seeMoreTextView.A(new wk51(6, ihc1.e1(Html.fromHtml(str, 0).toString()).toString()));
                return;
            case 7:
                ((AddToButtonView) ((d520) ((odr) this.b).c).b).a(new pk1(((Boolean) obj).booleanValue() ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30));
                return;
            case 11:
                civ0 civ0Var = (civ0) obj;
                ngr ngrVar = (ngr) this.b;
                civ0Var.getClass();
                em0 em0Var = (em0) ngrVar.c;
                ((ArtworkView) em0Var.h).h(new k07(new g07(civ0Var.a, new zz6(((ConstraintLayout) em0Var.b).getContext().getResources().getDimensionPixelSize(2131167033))), true));
                ArtworkView artworkView = (ArtworkView) em0Var.h;
                artworkView.n(new vas(ngrVar, (byte) 6));
                ((ArtworkShadow) em0Var.f).b(artworkView, true);
                return;
            case 12:
                Integer num = (Integer) obj;
                uhs uhsVar = (uhs) this.b;
                Context context = uhsVar.a;
                num.getClass();
                int iIntValue = num.intValue();
                mzr0 mzr0Var = uhsVar.e;
                j4w0 j4w0Var = uhsVar.X;
                if (j4w0Var == null) {
                    u890.C("headerModel");
                    throw null;
                }
                if (j4w0Var.k) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) mzr0Var.f;
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    qhl qhlVar = layoutParams instanceof qhl ? (qhl) layoutParams : null;
                    if (qhlVar != null) {
                        qhlVar.setMarginStart(iIntValue);
                        qhlVar.setMarginEnd(iIntValue);
                        qhlVar.G = context.getString(2131960382);
                        constraintLayout.setLayoutParams(qhlVar);
                        constraintLayout.requestLayout();
                    }
                    for (TextView textView : p7h.M(new TextView[]{(TextView) mzr0Var.b, (TextView) mzr0Var.d})) {
                        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                        qhl qhlVar2 = layoutParams2 instanceof qhl ? (qhl) layoutParams2 : null;
                        if (qhlVar2 != null) {
                            qhlVar2.setMarginStart(((int) (context.getResources().getDisplayMetrics().density * 16.0f)) + iIntValue);
                            qhlVar2.setMarginEnd(((int) (16.0f * context.getResources().getDisplayMetrics().density)) + iIntValue);
                            textView.setLayoutParams(qhlVar2);
                        }
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) uhsVar.f.b;
                    constraintLayout2.setPadding(iIntValue, constraintLayout2.getPaddingTop(), iIntValue, constraintLayout2.getPaddingBottom());
                    return;
                }
                return;
            case 16:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ip31 ip31Var = ((lvs) this.b).d;
                ((BanButton) ip31Var.d).setVisibility(zBooleanValue ? 0 : 8);
                ((AddToButtonView) ip31Var.c).setVisibility(zBooleanValue ? 8 : 0);
                ((BanButton) ip31Var.d).a(zBooleanValue);
                return;
            case 17:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                qws qwsVar = (qws) this.b;
                idd1 idd1Var = qwsVar.i;
                qwsVar.X = zBooleanValue2;
                if (!zBooleanValue2 || ((Animator) idd1Var.getValue()).isStarted()) {
                    return;
                }
                ((Animator) idd1Var.getValue()).start();
                return;
            default:
                ((TextView) ((s880) ((odr) this.b).c).h).setText((String) obj);
                return;
        }
    }

    public her(l6s l6sVar, spq0 spq0Var) {
        this.a = (byte) 20;
        this.b = spq0Var;
    }

    public /* synthetic */ her(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
