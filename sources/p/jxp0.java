package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.TrackListView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jxp0 implements Function, BiFunction, ObservableOnSubscribe, qiw, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    public jxp0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = (byte) 11;
        this.b = frameLayout;
    }

    public boolean accept(Object obj) {
        le30 le30Var = ((ksk) obj).c;
        return (le30Var == le30.b1 || le30Var == le30.c1) && ((i5y0) this.b).g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0415  */
    /* JADX WARN: Code duplicated, block: B:74:0x036c  */
    public Object apply(Object obj) {
        rz21 az21Var;
        oyc oycVar;
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                EsOffline.Progress progress = (EsOffline.Progress) obj;
                ((exp0) ((g9r) obj2).b).e("bulk", progress);
                return Boolean.valueOf(progress.s());
            case 1:
            case 2:
            case 4:
            case 7:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                trz0 trz0Var = (trz0) obj2;
                return new CompletableFromAction(new tt60(trz0Var.a, trz0Var.c, (byte) 18)).s(Schedulers.c).x(Boolean.TRUE).onErrorReturnItem(Boolean.FALSE).toObservable();
            case 3:
                u310 u310Var = (u310) obj;
                String str = ((u310) obj2).c;
                return str != null ? u310.b(u310Var, null, null, null, 0, null, null, 0, null, null, Collections.singletonMap("com.spotify.music.extra.FOLDER_NAME", str), null, null, -1073741825, 15) : u310Var;
            case 5:
                xcs0 xcs0Var = ((lbs0) obj2).c;
                String str2 = ((caw) obj).a;
                dma1 dma1Var = xcs0Var.a;
                bma1 bma1Var = xcs0.h;
                String strE = dma1Var.e(bma1Var, (String) null);
                if (strE == null) {
                    oycVar = null;
                } else {
                    bma1 bma1Var2 = xcs0.i;
                    String strE2 = dma1Var.e(bma1Var2, (String) null);
                    bma1 bma1Var3 = xcs0.j;
                    String strE3 = dma1Var.e(bma1Var3, (String) null);
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.f(bma1Var);
                    hma1VarEdit.f(bma1Var2);
                    hma1VarEdit.f(bma1Var3);
                    hma1VarEdit.g();
                    Long lD0 = nhc1.d0(10, strE);
                    if (lD0 == null) {
                        oycVar = null;
                    } else if (xcs0Var.b.b() - lD0.longValue() <= 300000 && (strE3 == null || strE3.equals(str2))) {
                        if (strE2 != null) {
                            try {
                                i3c1 i3c1Var = (i3c1) xcs0Var.c.a(strE2, i3c1.Companion.serializer());
                                String str3 = i3c1Var.a;
                                String str4 = i3c1Var.c;
                                String str5 = i3c1Var.b;
                                switch (str3) {
                                    case "discount_blocker":
                                        az21Var = new az21(str5, str4);
                                        break;
                                    case "country_mismatch":
                                        az21Var = new xy21(str5, str4);
                                        break;
                                    case "error":
                                        az21Var = new iz21(str5);
                                        break;
                                    case "payment_method_discount_blocker":
                                        az21Var = new mz21(str5, str4);
                                        break;
                                    default:
                                        az21Var = null;
                                        break;
                                }
                            } catch (Exception e) {
                                Logger.e(e, "Invalid JSON in pending error action prefs: %s", new Object[]{strE2});
                            }
                        } else {
                            az21Var = null;
                        }
                        oycVar = new oyc(az21Var);
                    } else {
                        oycVar = null;
                    }
                }
                if (oycVar != null) {
                    rz21 rz21Var = oycVar.a;
                    Observable observableJust = Observable.just(rz21Var != null ? new dwz(rz21Var) : ewz.a);
                    if (observableJust != null) {
                        return observableJust;
                    }
                }
                return Observable.empty();
            case 6:
                nx41 nx41Var = (nx41) obj;
                yon yonVar = (yon) obj2;
                ((t5h1) yonVar.d).getClass();
                String strA = t5h1.a();
                String str6 = nx41Var.b;
                boolean z = nx41Var.e;
                l651 l651Var = (l651) yonVar.e;
                o39 o39Var = new o39(strA, str6, z, l651Var);
                yu3 yu3Var = (yu3) yonVar.c;
                vi11 vi11Var = (vi11) yu3Var.b;
                p39 p39Var = (p39) yu3Var.c;
                mmr0 mmr0Var = new mmr0("query", str6);
                mmr0 mmr0Var2 = new mmr0("locale", p39Var.a);
                m39 m39Var = p39Var.d;
                di4 di4Var = p39Var.b;
                List<mmr0> listM = p7h.M(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("entity_types", o7h.y0(m39Var.c(z, di4Var.n0(), di4Var.M()), ",", (String) null, (String) null, (iu30) null, 62)), new mmr0("limit", "20"), new mmr0("album_states", "live,prerelease"), new mmr0("on_demand_sets_enabled", p39Var.c ? "true" : null), new mmr0("audiobook_states", "live,prerelease"), new mmr0("podcast_chapter_types", di4Var.Q() ? "talk,music" : null), new mmr0("features", p39Var.e.o()), new mmr0("experience", bzn1.x(l651Var)), new mmr0("_t", p39Var.f.a())});
                ArrayList arrayList = new ArrayList();
                for (mmr0 mmr0Var3 : listM) {
                    String str7 = (String) mmr0Var3.a;
                    String str8 = (String) mmr0Var3.b;
                    mmr0 mmr0Var4 = str8 != null ? new mmr0(str7, str8) : null;
                    if (mmr0Var4 != null) {
                        arrayList.add(mmr0Var4);
                    }
                }
                return zho1.H((hc51) vi11Var.e, new uw41(vi11Var, sqg0.T(arrayList), sqg0.J(new mmr0[]{new mmr0("x-search-request-id", strA), new mmr0("x-search-timestamp", String.valueOf(((n39) yu3Var.d).a.b()))}), strA, (byte) 0)).map(zp8.X).map(new myq0(yonVar, o39Var, nx41Var)).doOnError(new vrk1((byte) 26)).onErrorReturn(new sjq0(yonVar, o39Var, nx41Var, (byte) 14)).toObservable().compose((lk1) yonVar.b);
            case 8:
                PlayerState playerState = (PlayerState) obj;
                return new fvf1(((Number) playerState.position(((t1u0) obj2).f.b()).e(0L)).longValue(), ((Number) playerState.duration().e(0L)).longValue());
            case 9:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                String strB0 = contextTrack != null ? l4o1.b0(contextTrack) : null;
                if (strB0 == null) {
                    strB0 = "";
                }
                if (strB0.length() > 0) {
                    if ((contextTrack != null ? l4o1.a0(contextTrack, "pointer.uri") : null) == null) {
                        return yoi1.h(hno1.i((uu00) ((tzr0) obj2).e, "queue", strB0), o6x.a);
                    }
                }
                return Flowable.I(Boolean.FALSE);
            case 12:
                cf7 cf7Var = (cf7) obj;
                zd1 zd1Var = (zd1) obj2;
                return ((ow3) zd1Var.c).a(cf7Var.d).n((Scheduler) zd1Var.d).c(new urn0(zd1Var, cf7Var, b2)).w();
            case 14:
                qhf0 qhf0Var = (qhf0) obj;
                oov0 oov0Var = (oov0) obj2;
                s8a1 s8a1Var = oov0Var.b;
                d0r d0rVar = oov0Var.a;
                if (s8a1Var != null && d0rVar != null) {
                    return anm1.L(oov0Var.c, new elu0(d0rVar, s8a1Var, qhf0Var, (lnm) null, (byte) 5));
                }
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
            case 16:
                Observable observable = (Observable) obj;
                return observable.take(1L).concatWith(observable.debounce(500L, TimeUnit.MILLISECONDS, (Scheduler) obj2));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((az11) ((cvw0) obj2).b.get()).b.d();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                q730 q730Var = (q730) obj;
                p1x0 p1x0Var = (p1x0) obj2;
                return p1x0Var.i ? q730.a(q730Var, false, p1x0Var.h.d, 7) : q730Var;
            case 20:
                w8x0 w8x0Var = (w8x0) obj;
                j8x0 j8x0Var = w8x0Var.c;
                return ((k8x0) obj2).i(j8x0.a(j8x0Var, 0, z6x.a, (String) null, false, false, j8x0Var.b.size(), 1, 25)).map(new rut0(w8x0Var, (byte) 11)).onErrorReturn(new sks0(w8x0Var, (byte) 18));
            case 21:
                return j8x0.a((j8x0) obj2, 0, (List) obj, (String) null, false, false, 0, 0, 125);
            case 26:
                return ((Boolean) obj).booleanValue() ? new hrn0(ity0.class, new kty0(((Intent) obj2).getBooleanExtra("puffin_setup_flow_should_resume_music_when_exiting_flow", false)), new c6w0(1, false, (hd5) null, 14)) : crn0.a;
            case 27:
                return ((Observable) obj).flatMap(new hyy0(new n811(), ((yaz0) obj2).g, (byte) 4));
            case 28:
                ofz0 ofz0Var = (ofz0) ifz0.b((ifz0) obj2).get();
                ofz0Var.getClass();
                return new nfz0(ofz0Var.b.b(ofz0Var.a, (String) obj));
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        ((lxg) ((tzr0) this.b).d).d(new olv0(observableEmitter, (byte) 0));
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 22:
                irx0 irx0Var = (irx0) obj2;
                ((EncoreButton) irx0Var.a.b).setOnClickListener(new t230(irx0Var, (ktx0) obj, (byte) 28));
                break;
            default:
                Boolean bool = (Boolean) obj;
                TrackListView trackListView = (TrackListView) ((p1f0) ((ytp0) obj2).d).e;
                bool.getClass();
                trackListView.setIsWaitingForAnswer(bool.booleanValue());
                break;
        }
    }

    public /* synthetic */ jxp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        boolean z = true;
        switch (b) {
            case 7:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                yut0 yut0Var = (yut0) obj3;
                ArrayList arrayList = ((spc) obj).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    avt0 avt0Var = (avt0) obj4;
                    if (!zBooleanValue || !avt0Var.f) {
                        arrayList2.add(obj4);
                    }
                }
                Context context = yut0Var.b;
                v6b1 v6b1Var = v6b1.V0;
                f410 f410Var = new f410(6, context.getString(2131957639), (String) null, arrayList2.isEmpty() ? z6x.a : p7h.M(new e410[]{p8p1.s(context, new y6b1(v6b1Var).toString()), p8p1.t(context, new y6b1(v6b1Var).toString())}));
                List<avt0> listD1 = o7h.d1(arrayList2, 350);
                ArrayList arrayList3 = new ArrayList(q7h.U(listD1, 10));
                for (avt0 avt0Var2 : listD1) {
                    String string = new y6b1(v6b1.V0).toString();
                    String str = avt0Var2.b;
                    Uri uri = Uri.EMPTY;
                    arrayList3.add(new u310(str, avt0Var2.a, avt0Var2.c, TextUtils.join(", ", avt0Var2.d), Uri.parse(avt0Var2.e), (Uri) null, uri, uri, uri, Uri.parse(str), (Uri) null, 1, false, avt0Var2.f, avt0Var2.h, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, string, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12));
                }
                return new z310(arrayList3, f410Var, (m510) null, (String) null);
            default:
                PlayerState playerState = (PlayerState) obj;
                kby kbyVar = (kby) obj2;
                boolean z2 = kbyVar.g;
                qp31 qp31VarA = kbyVar.x.a(qp31.class);
                boolean z3 = qp31VarA != null && qp31VarA.a;
                boolean z4 = kbyVar.j;
                boolean z5 = !z4 || (z4 && !z2);
                int iQ = o0c.Q(playerState, ((fhu0) obj3).a);
                if (!z3 || !z5 || (kbyVar.w.a && z2)) {
                    z = false;
                }
                return new p910(iQ, z2, z);
        }
    }
}
