package p;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.car.app.model.CarIcon;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yo31 implements Function, k1q0, jrn0, SingleOnSubscribe, pnm, czh1 {
    public static yo31 c;
    public static final zo31 d = new zo31(0, 0, 0, false, false);
    public static final yo31 e = new yo31((Object) new int[]{1, 2, 4}, (byte) 1);
    public static final yo31 f = new yo31((Object) new int[]{1, 2}, (byte) 1);
    public final /* synthetic */ byte a;
    public Object b;

    public yo31(bq6 bq6Var, wp6 wp6Var) {
        this.a = (byte) 23;
        this.b = wp6Var;
    }

    public static synchronized yo31 g() {
        yo31 yo31Var;
        yo31Var = c;
        if (yo31Var == null) {
            yo31Var = new yo31();
            c = yo31Var;
        }
        return yo31Var;
    }

    public static yo31 i(float f2, float f3, float f4) {
        return new yo31((Object) AccessibilityNodeInfo.RangeInfo.obtain(1, f2, f3, f4), (byte) 2);
    }

    public w7h1 a(String str) {
        rsk0 rsk0Var = (rsk0) this.b;
        x6h1 x6h1VarC = rsk0Var.c.c();
        x6h1VarC.i.add(new a7h1("continue_listening_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), y6h1VarA, rsk0Var.b, System.currentTimeMillis());
    }

    public Object apply(Object obj) {
        goj0 goj0VarA;
        te9 te9Var;
        final byte b = 0;
        byte b2 = 4;
        switch (this.a) {
            case 3:
                final Observable observable = (Observable) obj;
                Single singleSingleOrError = observable.take(1L).singleOrError();
                qx qxVar = (qx) this.b;
                return singleSingleOrError.doOnSubscribe(new xu(qxVar, (byte) 1)).doOnSuccess(new tg(qxVar, (byte) 5)).flatMapObservable(new Function() { // from class: p.px
                    public final Object apply(Object obj2) {
                        byte b3 = b;
                        Observable observable2 = observable;
                        switch (b3) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                return observable2.startWithItem((Map) obj2);
                            default:
                                return observable2;
                        }
                    }
                });
            case 5:
                lan1 lan1Var = new lan1((o811) this.b, b2);
                int i = Flowable.a;
                return ((Flowable) obj).A(lan1Var, i, i);
            case 6:
                ou71 ou71Var = ((u11) this.b).b;
                String str = ((ja41) obj).a;
                bma1 bma1Var = ou71.b;
                hma1 hma1VarEdit = ou71Var.a.edit();
                if (str != null) {
                    hma1VarEdit.d(bma1Var, str);
                } else {
                    hma1VarEdit.f(bma1Var);
                }
                hma1VarEdit.g();
                return rn81.a;
            case 7:
                return ((j71) this.b).a.g(((a71) obj).c).ignoreElement().w();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return ((Boolean) obj).booleanValue() ? ((ys4) this.b).o.d().map(rbc.h) : Observable.just(Boolean.FALSE);
            case 23:
                hoj0 hoj0VarC = ((ioj0) obj).c(iq6.class, ((wp6) this.b).a);
                iq6 iq6Var = (iq6) ((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a);
                op6 op6Var = iq6Var != null ? (op6) o7h.q0(iq6Var.a) : null;
                op6Var.getClass();
                return new vp6(op6Var.b, op6Var.c, op6Var.d);
            case 26:
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((xe9) it.next()).c));
                }
                se9 se9Var = ((af9) this.b).b;
                xe9 xe9Var = (xe9) o7h.C0(list);
                fi9 fi9Var = xe9Var != null ? xe9Var.b : fi9.b;
                se9Var.getClass();
                oi9 oi9VarS = u1p1.s(arrayList, fi9Var);
                double d2 = oi9VarS.a;
                int iOrdinal = oi9VarS.b.ordinal();
                if (iOrdinal == 0) {
                    te9Var = te9.b;
                } else if (iOrdinal == 1) {
                    te9Var = te9.c;
                } else if (iOrdinal == 2) {
                    te9Var = te9.d;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    te9Var = te9.a;
                }
                return new mmr0(new ve9(((xe9) o7h.A0(list)).a, new ue9(d2, te9Var, ((Number) o7h.A0(arrayList)).intValue()), ((xe9) o7h.A0(list)).b, ((xe9) o7h.A0(list)).e), o7h.A0(arrayList));
            default:
                jz10 jz10Var = (jz10) obj;
                esa esaVar = (esa) this.b;
                s141 s141Var = esaVar.a;
                int i2 = jz10Var.c.b.a;
                s141Var.getClass();
                return Single.zip(lmt0.u(Single.create(new sw9(s141Var, i2, (byte) 28)), 4).compose(new mta((byte) 0)), lmt0.u(esaVar.b.a().map(njx0.h), 1), new mp8(jz10Var, (byte) 4)).doOnSubscribe(new ura(esaVar, (byte) 0));
        }
    }

    public long b(wat watVar, bav0 bav0Var) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.b;
        int i = Build.VERSION.SDK_INT;
        float f2 = -(i > 26 ? no80.x(viewConfiguration) : watVar.X0(64.0f));
        float f3 = -(i > 26 ? no80.v(viewConfiguration) : watVar.X0(64.0f));
        List list = bav0Var.a;
        Offset offset = new Offset(0L);
        int size = list.size();
        int i2 = 0;
        while (true) {
            long j = offset.a;
            if (i2 >= size) {
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f2)));
            }
            offset = new Offset(Offset.g(j, ((hav0) list.get(i2)).j));
            i2++;
        }
    }

    public mr20 c() {
        return new m441(new wt(this, (lnm) null, (byte) 14));
    }

    public void d(IconCompat iconCompat) {
        int iJ = iconCompat.j();
        for (int i : (int[]) this.b) {
            if (iJ == i) {
                if (iJ != 4 || "content".equalsIgnoreCase(iconCompat.k().getScheme())) {
                    return;
                }
                hhg1.g(iconCompat, "Unsupported URI scheme for: ");
                return;
            }
        }
        hhg1.n(f4i1.c(iJ, "Custom icon type is not allowed: "));
    }

    public Single e(String str) {
        return ((aw0) this.b).a(str).map(stf0.g).onErrorReturn(olj0.d);
    }

    public zo31 f() {
        return (zo31) this.b;
    }

    public ConstraintLayout h() {
        return (BadgeGroupView) this.b;
    }

    public void j(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon != null) {
            d(icon);
        } else {
            eg.m("Custom icon does not have a backing IconCompat");
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        return ((nw3) this.b).c(intent);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        switch (this.a) {
            case 16:
                singleEmitter.onSuccess(new o54(((Boolean) Single.create(new fl1((q54) this.b, (byte) 14)).blockingGet()).booleanValue()));
                break;
            case 17:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            default:
                m26 m26Var = (m26) this.b;
                luk lukVar = m26Var.r;
                if (lukVar == null || !lukVar.i("apps-music-libs-eventsender.heartbeat_interval")) {
                    lukVar = m26Var.s;
                }
                if (lukVar != null) {
                    lukVar.e(new k26(singleEmitter, m26Var, (byte) 4));
                }
                break;
            case 18:
                bk4 bk4Var = (bk4) this.b;
                luk lukVar2 = bk4Var.k;
                if (lukVar2 == null || !lukVar2.i("android-gen-alpha-account-creation.parental_consent_flow_enabled")) {
                    lukVar2 = bk4Var.l;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new ak4(singleEmitter, bk4Var, (byte) 0));
                }
                break;
            case 19:
                jk4 jk4Var = (jk4) this.b;
                luk lukVar3 = jk4Var.b;
                if (lukVar3 == null || !lukVar3.i("android-genalpha-limitedexperienceindicator.enabled")) {
                    lukVar3 = jk4Var.c;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new p54(singleEmitter, jk4Var, (byte) 6));
                }
                break;
            case 21:
                ox4 ox4Var = (ox4) this.b;
                luk lukVar4 = ox4Var.b;
                if (lukVar4 == null || !lukVar4.i("android-player-settings-automix.automix_enabled")) {
                    lukVar4 = ox4Var.c;
                }
                if (lukVar4 != null) {
                    lukVar4.e(new p54(singleEmitter, ox4Var, (byte) 8));
                }
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(655);
        ScrollView scrollView = (ScrollView) ((u22) this.b).d.b;
        int i = nk80VarI.c;
        scrollView.setPadding(nk80VarI.a, scrollView.getPaddingTop(), i, nk80VarI.d);
        return hsl1Var;
    }

    public /* synthetic */ yo31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ yo31(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ yo31() {
        this.a = (byte) 0;
    }
}
