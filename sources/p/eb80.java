package p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.messages.ListeningPartyJoinDevice;
import com.spotify.metadata.esperanto.proto.GetEntityRequest;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.profileconfig.proto.v1.Avatar;
import com.spotify.trending.v1.TnyLocationSuggestRequest;
import com.spotify.trending.v1.TnyLocationSuggestResponse;
import com.spotify.wrapped.v1.proto.CounterResponse;
import com.spotify.wrapped.v1.proto.GetCounterRequest;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eb80 implements tzf1, Function, qiw, jfc1, BiFunction, bra, kir0, Predicate {
    public final /* synthetic */ byte a;
    public Object b;

    public eb80(ji3 ji3Var, mrd0 mrd0Var, wmo0 wmo0Var, jx5 jx5Var, blp0 blp0Var, mu40 mu40Var) {
        this.a = (byte) 2;
        int i = t380.c;
        r380 r380Var = new r380(4);
        r380Var.g(ji3Var);
        r380Var.g(mrd0Var);
        r380Var.g(wmo0Var);
        r380Var.g(jx5Var);
        r380Var.g(blp0Var);
        r380Var.g(mu40Var);
        this.b = r380Var.i();
    }

    public Object A(Object obj) {
        return ((LinkedHashMap) this.b).remove(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(String str, onm onmVar) {
        lje0 lje0Var;
        if (onmVar instanceof lje0) {
            lje0Var = (lje0) onmVar;
            int i = lje0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lje0Var.c = i - Integer.MIN_VALUE;
            } else {
                lje0Var = new lje0(this, onmVar);
            }
        } else {
            lje0Var = new lje0(this, onmVar);
        }
        Object objA = lje0Var.a;
        int i2 = lje0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            uye1 uye1VarN = TnyLocationSuggestRequest.n();
            uye1VarN.q(str);
            uye1VarN.n();
            TnyLocationSuggestRequest tnyLocationSuggestRequestBuild = uye1VarN.build();
            yne0 yne0Var = (yne0) this.b;
            tnyLocationSuggestRequestBuild.getClass();
            lje0Var.c = 1;
            objA = yne0Var.a(tnyLocationSuggestRequestBuild, lje0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return ((TnyLocationSuggestResponse) objA).n();
    }

    public Observable a() {
        bwe0 bwe0Var = ((LoginActivity) this.b).k1;
        if (bwe0Var != null) {
            return bwe0Var.a.distinctUntilChanged();
        }
        u890.C("loginActivityNavigationDelegate");
        throw null;
    }

    public Object apply(Object obj) {
        Single singleJust;
        Observable observableFlatMapObservable;
        uh80 uh80VarB;
        Observable observableOnErrorReturn;
        u3s0 w3s0Var;
        long j;
        u3s0 t3s0Var;
        Single singleDoOnError;
        byte b = 0;
        switch (this.a) {
            case 1:
                uh80 uh80Var = (wh80) obj;
                h72 h72Var = (h72) this.b;
                boolean z = uh80Var instanceof uh80;
                if (((z && uh80Var.a) || !uh80Var.a()) && !uh80Var.g()) {
                    if (z) {
                        uh80VarB = uh80Var;
                    } else {
                        if (!(uh80Var instanceof vh80)) {
                            eg.o();
                            return null;
                        }
                        uh80VarB = uh80Var.b(false);
                    }
                    return Flowable.I(uh80VarB);
                }
                String contextUri = uh80Var.getContextUri();
                String strC = uh80Var.c();
                if (strC == null) {
                    strC = uh80Var.getUri();
                }
                if (uh80Var.f()) {
                    observableFlatMapObservable = ((fl1) h72Var.f).c(contextUri).c().map(d710.g);
                } else {
                    Set set = s4b1.f;
                    if (uic.x(strC).c == blc0.ti) {
                        singleJust = ((nwf1) h72Var.g).a(Collections.singletonList(strC));
                    } else {
                        singleJust = Single.just(Collections.singletonList(strC));
                        singleJust.getClass();
                    }
                    observableFlatMapObservable = singleJust.flatMapObservable(new vx40(h72Var, contextUri, (byte) 18));
                    observableFlatMapObservable.getClass();
                }
                return Observable.combineLatest(observableFlatMapObservable, ((ip91) h72Var.b).i(uh80Var.getUid(), uh80Var.getUri(), uh80Var.getContextUri(), Boolean.valueOf(uh80Var.g())), new mjv(uh80Var, (byte) 27)).distinctUntilChanged().toFlowable(BackpressureStrategy.d).N(uh80Var.b(false));
            case 3:
                qxt0 qxt0Var = (qxt0) obj;
                y6b1 y6b1Var = qxt0Var.a;
                boolean zEquals = y6b1Var.toString().equals("spotify:room:58z5rSz7BvXdayPbEUf8Xv");
                zd1 zd1Var = (zd1) this.b;
                if (zEquals) {
                    long j2 = qxt0Var.b;
                    List listM = p7h.M(new x3s0[]{new v3s0(y6b1.m("2VEZx7NWsZ1D0eJ4uv5Fym"), 0L, 5000L, "1"), new u3s0(15000L, "2"), new v3s0(y6b1.m("2VEZx7NWsZ1D0eJ4uv5Fym"), 10000L, 20000L, "3"), new w3s0(0L, 25000L, "4", p7h.M(new y6b1[]{y6b1.m("6W5IhtPGffSW3HIVS0i4nH"), y6b1.m("6XwKyBDAMcumT4XRAWaSIk")})), new t3s0(60000L, "5")});
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listM) {
                        if (((x3s0) obj2).a() <= j2) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    List<u3s0> listE1 = o7h.e1(1, arrayList);
                    ArrayList arrayList3 = new ArrayList(q7h.U(listE1, 10));
                    for (u3s0 u3s0Var : listE1) {
                        if (u3s0Var instanceof u3s0) {
                            t3s0Var = new u3s0(j2, u3s0Var.b);
                        } else {
                            if (u3s0Var instanceof t3s0) {
                                t3s0Var = new t3s0(j2, ((t3s0) u3s0Var).b);
                            } else {
                                if (u3s0Var instanceof v3s0) {
                                    v3s0 v3s0Var = (v3s0) u3s0Var;
                                    j = j2;
                                    w3s0Var = new v3s0(v3s0Var.a, (j2 - v3s0Var.c) + v3s0Var.b, j, v3s0Var.d);
                                } else {
                                    long j3 = j2;
                                    if (!(u3s0Var instanceof w3s0)) {
                                        eg.o();
                                        return null;
                                    }
                                    w3s0 w3s0Var2 = (w3s0) u3s0Var;
                                    w3s0Var = new w3s0((j3 - w3s0Var2.c) + w3s0Var2.b, j3, w3s0Var2.d, w3s0Var2.a);
                                    j = j3;
                                }
                                t3s0Var = w3s0Var;
                            }
                            arrayList3.add(t3s0Var);
                            j2 = j;
                        }
                        j = j2;
                        arrayList3.add(t3s0Var);
                        j2 = j;
                    }
                    observableOnErrorReturn = Observable.fromIterable(o7h.N0(arrayList2, arrayList3)).compose(new m4t(j2, new n4t((byte) 0, Long.MAX_VALUE))).map(ua20.h);
                } else {
                    t2j0 t2j0Var = (t2j0) zd1Var.c;
                    akd0 akd0VarN = ListeningPartyJoinDevice.n();
                    akd0VarN.n(y6b1Var.toString());
                    t2j0Var.a(akd0VarN.build());
                    rkd0 rkd0Var = (rkd0) zd1Var.b;
                    long j4 = qxt0Var.b;
                    rkd0Var.getClass();
                    observableOnErrorReturn = Observable.defer(new qkd0(rkd0Var, y6b1Var, j4)).map(va20.g).onErrorReturn(kc20.h);
                }
                return observableOnErrorReturn.takeUntil(((PublishSubject) zd1Var.d).filter(new eea0(qxt0Var, b)));
            case 5:
                List<Avatar> list = (List) obj;
                at7 at7Var = (at7) this.b;
                ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
                for (Avatar avatar : list) {
                    avatar.getClass();
                    q1b0 q1b0Var = new q1b0(avatar.getName(), avatar.getImageUrl(), avatar.getDescription());
                    String imageUrl = avatar.getImageUrl();
                    arrayList4.add(new pv51(q1b0Var, (imageUrl == null || ihc1.y0(imageUrl) || !u890.j(avatar.getImageUrl(), (String) at7Var.d)) ? false : true));
                }
                return arrayList4;
            case 8:
                l3c0 l3c0Var = (l3c0) obj;
                q3c0 q3c0Var = (q3c0) this.b;
                i1k0 i1k0VarS = q3c0Var.g.s();
                p5y p5yVar = q3c0Var.f;
                String strP = i1k0VarS.p();
                p5yVar.getClass();
                return q3c0Var.c.a(new f1y(i1k0VarS, l3c0Var.c, l3c0Var.d)).e(q3c0Var.a.c().x(new ye90(i1k0VarS, (String) q5y.a.get(strP), (byte) 19)).y(PlayerState.EMPTY)).timeout(30L, TimeUnit.SECONDS).flatMapObservable(new eea0(q3c0Var, i1k0VarS)).onErrorReturn(f610.t);
            case 9:
                wsc0 wsc0Var = (wsc0) obj;
                icc0 icc0Var = (icc0) this.b;
                sjj0 sjj0Var = icc0Var.e;
                List list2 = wsc0Var.e;
                ArrayList arrayList5 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((zuc0) it.next()).c);
                }
                return sjj0Var.a(arrayList5).map(icc0Var.i).map(new ye90(icc0Var, wsc0Var, (byte) 20));
            case 13:
                return (Boolean) ((PlayerState) obj).track().i(new we50((s6z0) ((fad0) this.b).c, (byte) 2)).e(Boolean.FALSE);
            case 14:
                return ((muz) ((d2d0) this.b).f).a(PlayCommand.create((Context) obj, PlayOrigin.create(nik1.o1.a)));
            case 15:
                z1e0 z1e0Var = (z1e0) this.b;
                xd7 xd7Var = ((wc7) obj).e;
                boolean z2 = xd7Var instanceof xd7;
                z6x z6xVar = z6x.a;
                if (z2) {
                    r961 r961Var = z1e0Var.a;
                    String str = xd7Var.a.a;
                    singleDoOnError = Single.zip(((o241) r961Var.c).b("audio-preview-url-template").take(1L).singleOrError(), rqt0.F((q8n) r961Var.d, new d481(r961Var, str, (lnm) null)), new eoc(r961Var, (byte) 24)).doOnError(new f93(str, (byte) 8)).onErrorReturnItem(new hey("", z6xVar));
                } else if (xd7Var instanceof td7) {
                    yo31 yo31Var = z1e0Var.b;
                    String str2 = ((td7) xd7Var).a.a;
                    singleDoOnError = ((sjj0) yo31Var.b).b(str2).flatMap(new lan1(yo31Var, (byte) 11)).doOnError(new f93(str2, (byte) 0));
                } else if (xd7Var instanceof ud7) {
                    t4d1 t4d1Var = z1e0Var.c;
                    String str3 = ((ud7) xd7Var).a.a;
                    singleDoOnError = ((sjj0) t4d1Var.b).b(str3).flatMap(new e4b1(t4d1Var, (byte) 24)).doOnError(new f93(str3, (byte) 1));
                } else if (xd7Var instanceof vd7) {
                    ytp0 ytp0Var = z1e0Var.d;
                    String str4 = ((vd7) xd7Var).a.a;
                    singleDoOnError = rqt0.F((q8n) ytp0Var.e, new k1e0(ytp0Var, str4, (lnm) null, (byte) 24)).doOnError(new f93(str4, (byte) 7)).onErrorReturnItem(new hey("", z6xVar));
                } else {
                    if (!(xd7Var instanceof wd7)) {
                        eg.o();
                        return null;
                    }
                    ow3 ow3Var = z1e0Var.e;
                    wd7 wd7Var = (wd7) xd7Var;
                    String str5 = wd7Var.a;
                    singleDoOnError = ((sjj0) ow3Var.c).b(str5).flatMap(new ln6(wd7Var.b, ow3Var)).doOnError(new f93(str5, (byte) 2));
                }
                return singleDoOnError.map(a020.X).onErrorReturn(sa20.X);
            case 21:
                pmf0 pmf0Var = (pmf0) ((o3e0) this.b).b;
                iff0 iff0Var = pmf0Var.a;
                return m5n1.p(iff0Var.a, new j2d0((String) obj, iff0Var, (byte) 14)).map(yj20.Y).subscribeOn(pmf0Var.b);
            case 24:
                String strO = o4p1.o((PlayerState) obj);
                if (strO.length() > 0) {
                    ((oie) ((s24) this.b).f).a.a(new nie(strO));
                }
                return CompletableEmpty.a;
            default:
                oy21 oy21Var = (py21) obj;
                if (!(oy21Var instanceof oy21)) {
                    if (oy21Var instanceof ly21) {
                        return new q7z0(false, false);
                    }
                    eg.o();
                    return null;
                }
                kby kbyVar = ((wsc0) oy21Var.a).f;
                boolean z3 = Boolean.parseBoolean((String) kbyVar.q.get("mix")) || kbyVar.w.c;
                wuj0 wuj0VarA = kbyVar.x.a(wuj0.class);
                boolean z4 = wuj0VarA != null ? wuj0VarA.a : false;
                return new q7z0(((ibk0) this.b).equals(ebk0.a) && !z3 && z4, z6k0.a(kbyVar.q));
        }
    }

    @Override // p.tzf1
    public ConstraintLayout b() {
        return (ConstraintLayout) ((ks6) this.b).P0;
    }

    @Override // p.tzf1
    public EnhancedBadgeView c() {
        return (EnhancedBadgeView) ((ks6) this.b).f;
    }

    @Override // p.tzf1
    public QuickActionView d() {
        return (QuickActionView) ((ks6) this.b).Z;
    }

    @Override // p.tzf1
    public ViewStub e() {
        return (ViewStub) ((ks6) this.b).Y;
    }

    @Override // p.tzf1
    public View f() {
        return w2g0.p((ks6) this.b, 2131624471);
    }

    @Override // p.tzf1
    public View g() {
        ViewStub viewStub = (ViewStub) ((ks6) this.b).O0;
        viewStub.setLayoutResource(2131625162);
        return viewStub.inflate();
    }

    @Override // p.tzf1
    public ArtworkView getArtwork() {
        return (ArtworkView) ((ks6) this.b).d;
    }

    @Override // p.tzf1
    public ConstraintLayout getRoot() {
        return (ConstraintLayout) ((ks6) this.b).a;
    }

    @Override // p.tzf1
    public TextView getSubtitle() {
        return (TextView) ((ks6) this.b).Q0;
    }

    @Override // p.tzf1
    public TextView getTitle() {
        return (TextView) ((ks6) this.b).R0;
    }

    public mpj0 h() {
        Double d = (Double) this.b;
        if (d != null) {
            return new lpj0(d.doubleValue());
        }
        return null;
    }

    @Override // p.tzf1
    public DownloadBadgeView i() {
        return (DownloadBadgeView) ((ks6) this.b).e;
    }

    @Override // p.tzf1
    public ContentRestrictionBadgeView j() {
        return (ContentRestrictionBadgeView) ((ks6) this.b).N0;
    }

    @Override // p.tzf1
    public PremiumBadgeView k() {
        return (PremiumBadgeView) ((ks6) this.b).X;
    }

    @Override // p.tzf1
    public PlayIndicatorComposeView l() {
        return (PlayIndicatorComposeView) ((ks6) this.b).t;
    }

    @Override // p.tzf1
    public FrameLayout m() {
        return (FrameLayout) ((ks6) this.b).S0;
    }

    @Override // p.tzf1
    public void n() {
        mf20 mf20Var = new mf20(z561.T(vm31.c1, new i46((ConstraintLayout) ((ks6) this.b).a, (byte) 8)));
        while (mf20Var.hasNext()) {
            View view = (View) mf20Var.next();
            view.setVisibility(view.getId() != 2131430716 ? 0 : 8);
        }
    }

    @Override // p.tzf1
    public LockedBadgeView o() {
        return (LockedBadgeView) ((ks6) this.b).i;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(onm onmVar) {
        umd0 umd0Var;
        san sanVar;
        if (onmVar instanceof umd0) {
            umd0Var = (umd0) onmVar;
            int i = umd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                umd0Var.c = i - Integer.MIN_VALUE;
            } else {
                umd0Var = new umd0(this, onmVar);
            }
        } else {
            umd0Var = new umd0(this, onmVar);
        }
        Object objA = umd0Var.a;
        int i2 = umd0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            tmd0 tmd0Var = (tmd0) this.b;
            GetCounterRequest getCounterRequestN = GetCounterRequest.n();
            umd0Var.c = 1;
            objA = tmd0Var.a(getCounterRequestN, umd0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        CounterResponse counterResponse = (CounterResponse) objA;
        if ((counterResponse.q() == 0 && counterResponse.o() == 0 && counterResponse.n() == 0) || counterResponse.o() <= 0 || counterResponse.q() < 0 || counterResponse.o() < counterResponse.q() || counterResponse.n() < 0 || !counterResponse.r()) {
            return null;
        }
        String format = counterResponse.p().getFormat();
        String strO = counterResponse.p().o();
        if (strO.length() != 0) {
            san sanVar2 = new san(format, strO);
            try {
                sanVar = sanVar2;
            } catch (IllegalArgumentException e) {
                Logger.l(e, "Invalid live counter value_format pattern '%s'", new Object[]{format});
                sanVar = null;
            }
            if (sanVar == null) {
                return null;
            }
            return new qan(counterResponse.q(), counterResponse.o(), counterResponse.n(), sanVar);
        }
        Logger.k("Empty live counter value_format delimiter", new Object[0]);
        sanVar = null;
        if (sanVar == null) {
            return null;
        }
        return new qan(counterResponse.q(), counterResponse.o(), counterResponse.n(), sanVar);
    }

    public mpj0 peek() {
        Double d = (Double) this.b;
        if (d != null) {
            return new lpj0(d.doubleValue());
        }
        return null;
    }

    public Object q(Object obj) {
        return ((LinkedHashMap) this.b).get(obj);
    }

    public Set r() {
        return ((LinkedHashMap) this.b).entrySet();
    }

    public void record(double d) {
        this.b = Double.valueOf(d);
    }

    public boolean s() {
        return ((LinkedHashMap) this.b).isEmpty();
    }

    @Override // p.tzf1
    public void setEnabled(boolean z) {
        w2g0.w((ks6) this.b, z);
    }

    public Maybe t(String str) {
        x390 x390Var = (x390) this.b;
        Set set = s4b1.f;
        byte b = 3;
        if (uic.x(str).c == blc0.Pg) {
            k72 k72Var = new k72(str, d3d1.e, 8);
            return x390Var.b(k72Var).firstOrError().flatMapMaybe(new eea0(k72Var, b));
        }
        if (uic.x(str).c != blc0.ti) {
            Set set2 = s4b1.f;
            v5b1 v5b1Var = uic.x(str).d;
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                return MaybeEmpty.a;
            }
        }
        l72 l72Var = new l72(str);
        return x390Var.b(l72Var).firstOrError().flatMapMaybe(new eea0(l72Var, b));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                Logger.e((Throwable) obj, f4i1.f("Failed to complete action ", ((kxh0) this.b).name(), "."), new Object[0]);
                break;
            default:
                ((h1i0) this.b).d.b();
                break;
        }
        return true;
    }

    public Single u(String str) {
        ueg uegVar = (ueg) this.b;
        dn40 dn40VarN = GetEntityRequest.n();
        dn40VarN.n(str);
        return uegVar.a(dn40VarN.build()).map(c710.O0);
    }

    public void v(Object obj) {
        Drawable drawable;
        switch (this.a) {
            case 4:
                wva0 wva0Var = (wva0) this.b;
                p410 p410Var = (p410) wva0Var.d;
                int iOrdinal = ((xgk1) obj).ordinal();
                if (iOrdinal == 0) {
                    wva0Var.b();
                    ((EncoreButton) p410Var.e).setEnabled(false);
                } else if (iOrdinal == 1) {
                    wva0Var.b();
                    ((EncoreButton) p410Var.e).setEnabled(true);
                } else if (iOrdinal != 2) {
                    eg.o();
                } else {
                    EncoreTextView encoreTextView = (EncoreTextView) p410Var.d;
                    EditText editText = (EditText) p410Var.c;
                    encoreTextView.setVisibility(0);
                    editText.setTextColor(-65536);
                    Resources resources = ((FrameLayout) p410Var.b).getResources();
                    ThreadLocal threadLocal = qx21.a;
                    editText.setBackground(resources.getDrawable(2131231314, null));
                    ((EncoreTextView) p410Var.d).performAccessibilityAction(64, null);
                    ((EncoreButton) p410Var.e).setEnabled(false);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MessageInputView messageInputView = (MessageInputView) this.b;
                w6e0 w6e0Var = messageInputView.T0;
                boolean z = !zBooleanValue;
                ((EncoreButton) w6e0Var.c).setEnabled(z);
                EditText editText2 = (EditText) w6e0Var.b;
                editText2.setEnabled(z);
                editText2.setAlpha(zBooleanValue ? 0.4f : 1.0f);
                if (zBooleanValue) {
                    Resources resources2 = messageInputView.getRootView().getResources();
                    ThreadLocal threadLocal2 = qx21.a;
                    drawable = resources2.getDrawable(2131233378, null);
                } else {
                    Resources resources3 = messageInputView.getRootView().getResources();
                    ThreadLocal threadLocal3 = qx21.a;
                    drawable = resources3.getDrawable(2131233377, null);
                }
                messageInputView.U0 = drawable;
                editText2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r10 == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r10 == r9) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(p.rhy r11, p.wwy r12, android.net.Uri r13, android.net.Uri r14, p.onm r15) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            r3 = r0
            p.k3i0 r3 = (p.k3i0) r3
            boolean r0 = r15 instanceof p.gkc0
            if (r0 == 0) goto L18
            r0 = r15
            p.gkc0 r0 = (p.gkc0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r2
            if (r4 == 0) goto L18
            int r1 = r1 - r2
            r0.c = r1
            goto L1d
        L18:
            p.gkc0 r0 = new p.gkc0
            r0.<init>(r10, r15)
        L1d:
            java.lang.Object r10 = r0.a
            int r15 = r0.c
            r1 = 3
            r2 = 2
            r4 = 1
            r8 = 0
            if (r15 == 0) goto L40
            if (r15 == r4) goto L3c
            if (r15 == r2) goto L38
            if (r15 != r1) goto L32
            p.hm5.M(r10)
            goto Lb6
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r8
        L38:
            p.hm5.M(r10)
            goto L90
        L3c:
            p.hm5.M(r10)
            goto L6d
        L40:
            p.hm5.M(r10)
            p.yny r10 = r11.a
            p.vny r11 = p.vny.a
            boolean r11 = p.u890.j(r10, r11)
            p.d9n r9 = p.d9n.a
            if (r11 == 0) goto L70
            r11 = r4
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r0.c = r11
            if (r13 == 0) goto L67
            if (r14 == 0) goto L67
            p.ae1 r1 = new p.ae1
            r6 = 0
            r7 = 15
            r5 = r13
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r13 = p.smo1.s(r1, r0)
            goto L69
        L67:
            r14 = r13
            r13 = r14
        L69:
            if (r13 != r9) goto L6c
            goto Lb5
        L6c:
            r10 = r13
        L6d:
            android.net.Uri r10 = (android.net.Uri) r10
            goto Lb8
        L70:
            r11 = r14
            r14 = r13
            p.wny r13 = p.wny.a
            boolean r13 = p.u890.j(r10, r13)
            if (r13 == 0) goto L95
            if (r14 == 0) goto L93
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG
            r0.c = r2
            p.uaw0 r10 = new p.uaw0
            r15 = 0
            r13 = 20
            r12 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Object r10 = p.smo1.s(r10, r0)
            if (r10 != r9) goto L90
            goto Lb5
        L90:
            android.net.Uri r10 = (android.net.Uri) r10
            goto Lb8
        L93:
            r10 = r8
            goto Lb8
        L95:
            p.xny r13 = p.xny.a
            boolean r10 = p.u890.j(r10, r13)
            if (r10 == 0) goto Lc0
            java.util.List r10 = r12.Y
            int r12 = r12.X
            java.lang.Object r10 = p.o7h.t0(r12, r10)
            boolean r10 = r10 instanceof p.t8d1
            if (r10 == 0) goto L93
            if (r14 == 0) goto L93
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG
            r0.c = r1
            java.lang.Object r10 = p.saw0.a(r3, r14, r11, r0)
            if (r10 != r9) goto Lb6
        Lb5:
            return r9
        Lb6:
            android.net.Uri r10 = (android.net.Uri) r10
        Lb8:
            if (r10 == 0) goto Lbf
            java.lang.String r10 = r10.toString()
            return r10
        Lbf:
            return r8
        Lc0:
            p.eg.o()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eb80.w(p.rhy, p.wwy, android.net.Uri, android.net.Uri, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object x(o571 o571Var, List list, wwy wwyVar, Uri uri, Uri uri2, onm onmVar) {
        hkc0 hkc0Var;
        rhy rhyVar;
        rhy rhyVar2;
        String str;
        String str2;
        if (onmVar instanceof hkc0) {
            hkc0Var = (hkc0) onmVar;
            int i = hkc0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hkc0Var.d = i - Integer.MIN_VALUE;
            } else {
                hkc0Var = new hkc0(this, onmVar);
            }
        } else {
            hkc0Var = new hkc0(this, onmVar);
        }
        hkc0 hkc0Var2 = hkc0Var;
        Object objW = hkc0Var2.b;
        int i2 = hkc0Var2.d;
        if (i2 == 0) {
            hm5.M(objW);
            rhyVar = wwyVar.t;
            if (rhyVar != null) {
                p471 p471Var = p471.d;
                Object obj = d9n.a;
                if (o571Var == p471Var) {
                    hkc0Var2.a = rhyVar;
                    hkc0Var2.d = 1;
                    Object objY = y(uri, uri2, hkc0Var2);
                    if (objY != obj) {
                        objW = objY;
                        rhyVar2 = rhyVar;
                        str2 = (String) objW;
                        str = str2;
                        rhyVar = rhyVar2;
                        if (str != null) {
                            return new bkc0(str, rhyVar.b, rhyVar.c, rhyVar.d, rhyVar.e, rhyVar.f);
                        }
                    }
                } else {
                    if (aq8.B(list)) {
                        str = null;
                    } else {
                        hkc0Var2.a = rhyVar;
                        hkc0Var2.d = 2;
                        objW = w(rhyVar, wwyVar, uri, uri2, hkc0Var2);
                        if (objW != obj) {
                            rhyVar2 = rhyVar;
                            str2 = (String) objW;
                            str = str2;
                            rhyVar = rhyVar2;
                        }
                    }
                    if (str != null) {
                        return new bkc0(str, rhyVar.b, rhyVar.c, rhyVar.d, rhyVar.e, rhyVar.f);
                    }
                }
                return obj;
            }
        } else if (i2 == 1) {
            rhyVar2 = hkc0Var2.a;
            hm5.M(objW);
            str2 = (String) objW;
            str = str2;
            rhyVar = rhyVar2;
            if (str != null) {
                return new bkc0(str, rhyVar.b, rhyVar.c, rhyVar.d, rhyVar.e, rhyVar.f);
            }
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rhyVar2 = hkc0Var2.a;
            hm5.M(objW);
            str2 = (String) objW;
            str = str2;
            rhyVar = rhyVar2;
            if (str != null) {
                return new bkc0(str, rhyVar.b, rhyVar.c, rhyVar.d, rhyVar.e, rhyVar.f);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(Uri uri, Uri uri2, onm onmVar) {
        ikc0 ikc0Var;
        if (onmVar instanceof ikc0) {
            ikc0Var = (ikc0) onmVar;
            int i = ikc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikc0Var.c = i - Integer.MIN_VALUE;
            } else {
                ikc0Var = new ikc0(this, onmVar);
            }
        } else {
            ikc0Var = new ikc0(this, onmVar);
        }
        Object obj = ikc0Var.a;
        int i2 = ikc0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            ikc0Var.c = 1;
            Object objS = (uri == null || uri2 == null) ? uri : smo1.s(new ae1(uri2, (k3i0) this.b, Bitmap.CompressFormat.PNG, uri, (lnm) null, (byte) 15), ikc0Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            obj = objS;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        Uri uri3 = (Uri) obj;
        if (uri3 != null) {
            return uri3.toString();
        }
        return null;
    }

    public Object z(Object obj, Object obj2) {
        return ((LinkedHashMap) this.b).put(obj, obj2);
    }

    public /* synthetic */ eb80(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public eb80(byte b) {
        this.a = b;
        switch (b) {
            case 20:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public /* synthetic */ eb80(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                return new w051("", ((hx41) this.b).b, new b951((List) obj, (List) obj2));
            default:
                return ((v6e0) this.b).e.a(((l5e0) obj).b, (des) obj2);
        }
    }
}
