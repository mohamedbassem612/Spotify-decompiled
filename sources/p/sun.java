package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class sun implements qiw, Function, xi7, ya, BiPredicate, Producer {
    public final /* synthetic */ byte a;
    public final Object b;

    public sun(Context context, jtl1 jtl1Var, eh4 eh4Var, dm91 dm91Var, uip0 uip0Var, vqv0 vqv0Var, kdy0 kdy0Var, wmy wmyVar, uxy0 uxy0Var) {
        this.a = (byte) 14;
        this.b = new bjx(dm91Var.a(new kjs(context, jtl1Var), false), new dx0((dx0) uip0Var.b, new ze21(context, jtl1Var, (byte) 0)), new dx0((bs0) vqv0Var.b, new ze21(context, jtl1Var, (byte) 1)), f6o1.A(new rwj((kdy0) kdy0Var.c, (yrg0) kdy0Var.d, (mwn0) kdy0Var.e, (jtl1) kdy0Var.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), f6o1.A(new nl9((jtl1) wmyVar.a, (yu3) wmyVar.b, (jjk0) wmyVar.c, (zwz0) wmyVar.d, (kt91) wmyVar.e, (q8n) wmyVar.f), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rpo1.r(eh4Var.b(), uxy0Var), (byte) 16);
    }

    public void a(Runnable runnable) {
        ((Handler) this.b).removeCallbacks(runnable);
    }

    public boolean accept(Object obj) {
        w7r w7rVar = (w7r) this.b;
        return ((ksk) obj).c == le30.Z && w7rVar.b() && w7rVar.e();
    }

    public Object apply(Object obj) {
        Observable map;
        byte b = this.a;
        byte b2 = 25;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                f7h f7hVar = (f7h) ((Map) obj).get(((yjo) obj2).c);
                return Boolean.valueOf(f7hVar != null ? f7hVar.b : false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (((Boolean) obj).booleanValue()) {
                    return ((g0l) ((iir) obj2).b).d().filter(rzs0.Y0).map(s321.X0).distinctUntilChanged(u321.X0).filter(uh21.Y0).map(j561.Y0);
                }
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
            case 23:
                so soVar = (so) obj2;
                ((t5h1) soVar.c).getClass();
                String strA = t5h1.a();
                String str = ((ex41) obj).b;
                yu3 yu3Var = (yu3) soVar.b;
                return ((rd51) ((vi11) yu3Var.b).b).b(sqg0.T(p7h.M(new mmr0[]{new mmr0("suggestion_uri", str), new mmr0("request_id", strA), new mmr0("locale", ((clv) yu3Var.e).b)}))).d(Observable.just(new ez41(true))).doOnError(new vrk1((byte) 15)).onErrorReturn(new c9c(soVar, (byte) 7));
            case 24:
                tc4 tc4Var = (tc4) obj;
                jmq jmqVar = (jmq) ((l6s) obj2).b;
                bbt bbtVar = (bbt) jmqVar.a;
                en31 en31Var = bbtVar.a;
                CompletableCreate completableCreateL = m5n1.l(en31Var, new qrk(1, (byte) 13));
                Predicate predicate = Functions.h;
                CompletableOnErrorComplete completableOnErrorCompleteO = completableCreateL.o(predicate);
                Scheduler scheduler = (Scheduler) jmqVar.b;
                return completableOnErrorCompleteO.s(scheduler).c(m5n1.l(en31Var, new wrs(bbtVar, new ctc(tc4Var.a, tc4Var.b, ((yqg) jmqVar.c).b()), (byte) 7)).o(predicate).s(scheduler)).e(Single.just(tc4Var));
            case 26:
                g6u g6uVar = (g6u) obj2;
                return ((fbl) obj) == fbl.b ? Observable.defer(new yj1(g6uVar.d, (byte) 27)).firstOrError().flatMapCompletable(new h9n(g6uVar, (byte) 23)).p(drm0.X0) : CompletableEmpty.a;
            case 28:
                un5 un5Var = (un5) obj;
                oo5 oo5Var = (oo5) obj2;
                return Single.create(new km3((Object) oo5Var, (Object) un5Var.a, (byte) 10)).subscribeOn(oo5Var.a).map(new h9n(un5Var, (byte) 25));
            default:
                uuu uuuVar = (uuu) obj;
                xpp0 xpp0Var = (xpp0) obj2;
                uuuVar.getClass();
                boolean z = uuuVar.b;
                Set<String> set = uuuVar.a;
                if (z) {
                    xj61 xj61Var = new xj61();
                    for (String str2 : set) {
                        xj61Var.add(new a2v(str2, 1));
                        xj61Var.add(new a2v(str2, 2));
                    }
                    xj61 xj61VarJ = cwl1.j(xj61Var);
                    map = yoi1.i(yoi1.g(xpp0Var.a(xj61VarJ)), o6x.a).map(new her(xj61VarJ, b2));
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(new a2v((String) it.next(), 1));
                    }
                    map = xpp0Var.a(linkedHashSet).map(bk20.S0).map(qbo1.X0);
                }
                return map.distinctUntilChanged().onErrorComplete();
        }
    }

    public Single b(String str) {
        return ((cp70) this.b).a.callSingle("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "Contains", cp70.a(str)).map(ios.P0).map(t9w.V0);
    }

    public void c(Runnable runnable, long j) {
        ((Handler) this.b).postDelayed(runnable, j);
    }

    public CompletablePeek d(String str, boolean z) {
        w4h w4hVar = ((cp70) this.b).a;
        return (z ? w4hVar.a(cp70.a(str)) : w4hVar.b(cp70.a(str))).flatMapCompletable(e4y.X0).h(fcc.S0);
    }

    public Object get() {
        return new SchedulerWorkRunner(((sss) this.b).b);
    }

    public Single l(Intent intent, th61 th61Var) {
        return yoi1.i(((ov20) ((ifl1) ((wf2) this.b).b).b).a("has-mobile-data-download", false), o6x.a).firstOrError().map(q9w.V0).onErrorReturn(s9w.U0);
    }

    public boolean test(Object obj, Object obj2) {
        s1l s1lVar = (s1l) obj2;
        return u890.j((s1l) obj, s1lVar) && u890.j(s1lVar, ((pnr) this.b).h);
    }

    public void v(Object obj) {
        byte b = this.a;
        int i = 8;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dtn dtnVar = (ftn) obj;
                avn avnVar = (avn) obj2;
                h72 h72Var = avnVar.U0;
                FindInContextView findInContextView = (FindInContextView) h72Var.i;
                BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.d;
                if (findInContextView.getVisibility() != 0) {
                    if (dtnVar instanceof ctn) {
                        behaviorRetainingAppBarLayout.e(false, false, true);
                    } else if (!(dtnVar instanceof dtn)) {
                        if (!(dtnVar instanceof etn)) {
                            eg.o();
                        } else {
                            behaviorRetainingAppBarLayout.getBehavior().v(((etn) dtnVar).a);
                        }
                    } else if (avnVar.c == null) {
                        behaviorRetainingAppBarLayout.e(true, dtnVar.a, true);
                    } else {
                        boolean z = dtnVar.a;
                        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout2 = (BehaviorRetainingAppBarLayout) h72Var.b;
                        aiq0.a(behaviorRetainingAppBarLayout2, new n1d(behaviorRetainingAppBarLayout2, avnVar, z, (byte) 2));
                    }
                    break;
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                num.getClass();
                ColorStateList colorStateListA = plr.a(num.intValue());
                EncoreButton encoreButton = ((plr) obj2).a;
                encoreButton.setStrokeColor(colorStateListA);
                encoreButton.setStrokeWidthResource(2131165936);
                break;
            case 6:
                xik xikVar = (xik) obj;
                zmr zmrVar = (zmr) obj2;
                xikVar.getClass();
                boolean z2 = zmrVar.b;
                boolean z3 = xikVar.q;
                boolean z4 = xikVar.n;
                s24 s24Var = zmrVar.f;
                Space space = (Space) s24Var.g;
                AddToButtonView addToButtonView = (AddToButtonView) s24Var.Z;
                EncoreButton encoreButton2 = (EncoreButton) s24Var.Y;
                AddToButtonView addToButtonView2 = (AddToButtonView) s24Var.X;
                EncoreButton encoreButton3 = (EncoreButton) s24Var.t;
                space.setVisibility(z3 ? 4 : 8);
                encoreButton3.setVisibility((z3 || z2) ? 8 : 0);
                addToButtonView2.setVisibility((!z3 || z2) ? 8 : 0);
                encoreButton2.setVisibility((z3 || !z2) ? 8 : 0);
                if (z3 && z2) {
                    i = 0;
                }
                addToButtonView.setVisibility(i);
                encoreButton3.setChecked(z4);
                qk1 qk1Var = qk1.a;
                qk1 qk1Var2 = qk1.b;
                addToButtonView2.a(new pk1(z4 ? qk1Var2 : qk1Var, false, (String) null, (String) null, (j7p1) null, 30));
                Context context = zmrVar.a;
                String string = z4 ? context.getString(2131955777) : context.getString(2131955776);
                string.getClass();
                encoreButton2.setChecked(z4);
                encoreButton2.setText(string);
                addToButtonView.a(new pk1(z4 ? qk1Var2 : qk1Var, false, (String) null, (String) null, (j7p1) null, 30));
                break;
            case 8:
                oyn oynVar = (oyn) obj;
                int i2 = oynVar.l.a;
                fta ftaVar = ((err) obj2).e;
                if (i2 != 2) {
                    ((TextView) ftaVar.c).setVisibility(8);
                } else {
                    ((TextView) ftaVar.c).setVisibility(0);
                    ((TextView) ftaVar.c).setText(oynVar.k);
                }
                break;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                g1i g1iVar = (g1i) ((jnq) obj2).c;
                ((TextView) g1iVar.c).setVisibility(iIntValue);
                ((TextView) g1iVar.d).setVisibility(iIntValue);
                ((TextView) g1iVar.e).setVisibility(iIntValue);
                ((TextView) g1iVar.f).setVisibility(iIntValue);
                break;
            case 11:
                ((PlayButtonView) ((d520) ((odr) obj2).c).h).B(new cet0(((Boolean) obj).booleanValue(), new vft0(false), (String) null, 4));
                break;
            case 15:
                civ0 civ0Var = (civ0) obj;
                civ0Var.getClass();
                ((ArtworkView) ((em0) ((ngr) obj2).c).d).h(new l07(new g07(civ0Var.a), false));
                break;
            case 16:
                q4w0 q4w0Var = (q4w0) obj;
                qzh qzhVar = ((uhs) obj2).c;
                q4w0Var.getClass();
                qzhVar.f(q4w0Var);
                break;
            case 20:
                Boolean bool = (Boolean) obj;
                BackButtonView backButtonView = (BackButtonView) ((lvs) obj2).b.e;
                bool.getClass();
                backButtonView.setVisibility(bool.booleanValue() ? 0 : 8);
                break;
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CancellableSeekBar cancellableSeekBar = ((qws) obj2).c;
                cancellableSeekBar.setEnabled(zBooleanValue);
                if (!zBooleanValue) {
                    cancellableSeekBar.a();
                }
                break;
            default:
                o17 o17Var = (o17) obj;
                s880 s880Var = (s880) ((odr) obj2).c;
                if (o17Var == null) {
                    ((TextView) s880Var.h).setMaxLines(3);
                    ((ArtworkView) s880Var.c).setVisibility(8);
                } else {
                    TextView textView = (TextView) s880Var.h;
                    ArtworkView artworkView = (ArtworkView) s880Var.c;
                    textView.setMaxLines(2);
                    artworkView.setVisibility(0);
                    artworkView.h(o17Var);
                }
                break;
        }
    }

    public sun(zfu zfuVar) {
        this.a = (byte) 27;
        this.b = new CopyOnWriteArraySet();
        a6n a6nVar = new a6n(this, (byte) 13);
        synchronized (zfuVar) {
            zfuVar.c = a6nVar;
        }
    }

    public sun(opg opgVar, rp5 rp5Var) {
        this.a = (byte) 25;
        hhp0 hhp0Var = hhp0.a;
        this.b = new yjq(opgVar, rp5Var);
        hhp0Var.r("device.cpu_time", jqj0.a, new ntt(this, (byte) 0));
        hhp0Var.r("device.battery_level", iqj0.a, new ntt(this, (byte) 1));
    }

    public /* synthetic */ sun(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public sun() {
        this.a = (byte) 17;
        this.b = zno1.g(Looper.getMainLooper());
    }
}
