package p;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.share.destinations.smartsorting.networking.request.Destination;
import com.spotify.share.destinations.smartsorting.networking.request.SortedDestinationsProtoResponse;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dn81 implements Function, SingleTransformer, Function3, xi7, qiw, BiFunction, wae1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public dn81(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new dgp0();
                break;
            case 29:
                this.b = new i92((byte) 16);
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public float a(StringBuilder sb) {
        return ((TextPaint) this.b).measureText(sb, 0, sb.length());
    }

    public Object apply(Object obj) {
        uz21 uz21Var;
        Single singleJust;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                HttpException httpException = (Throwable) obj;
                if (!(httpException instanceof HttpException)) {
                    Single singleError = Single.error(httpException);
                    singleError.getClass();
                    return singleError;
                }
                sy21 sy21Var = httpException.c;
                if (sy21Var != null && (uz21Var = sy21Var.c) != null) {
                    h hVarB = ((qzr0) obj2).b(uz21Var.a(), bf40.b);
                    if (hVarB != null && (singleJust = Single.just(hVarB)) != null) {
                        return singleJust;
                    }
                }
                return Single.error(httpException);
            case 14:
                ((wec1) obj2).V((StatusResponseOuterClass$StatusResponse) obj, 3);
                return CompletableEmpty.a;
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return ((j6p0) obj2).m();
                }
                int i = Flowable.a;
                return FlowableEmpty.b;
            case 19:
                feh fehVar = (feh) obj;
                if (!(fehVar instanceof ceh)) {
                    return Single.just(fehVar);
                }
                jwe1 jwe1Var = (jwe1) obj2;
                return jwe1Var.c.a(new g9u0(jwe1Var.b, false));
            case 20:
                im0 im0Var = (im0) obj2;
                return new FlowableTake(Flowable.h(im0Var.b, ((o241) im0Var.g).a.map(mgx0.R0).distinctUntilChanged().onErrorReturnItem(Boolean.TRUE).toFlowable(BackpressureStrategy.d), djx0.S0).J(njx0.S0)).m(w1x0.X0);
            case 26:
                y4z0 y4z0Var = (y4z0) obj;
                return fbp1.n(((nmh1) obj2).a, "up-next-card", y4z0Var.d, ykk1.b).filter(h2x0.U0).map(i2x0.S0).onErrorReturn(new qeh1(y4z0Var, (byte) 1));
            default:
                drx0 drx0Var = (drx0) obj;
                j23 j23Var = (c23) ((yon) obj2).b;
                String str = drx0Var.a;
                String str2 = drx0Var.b;
                Set set = drx0Var.c;
                Set set2 = drx0Var.d;
                return j23Var.i(str, str2, set, set2).h(iqa1.X0).o(Functions.h).d(Observable.just(new bsx0(str, str2, set, set2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object b(onm onmVar) {
        rnc1 rnc1Var;
        if (onmVar instanceof rnc1) {
            rnc1Var = (rnc1) onmVar;
            int i = rnc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnc1Var.c = i - Integer.MIN_VALUE;
            } else {
                rnc1Var = new rnc1(this, onmVar);
            }
        } else {
            rnc1Var = new rnc1(this, onmVar);
        }
        Object objA = rnc1Var.a;
        int i2 = rnc1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                snc1 snc1Var = (snc1) this.b;
                rnc1Var.c = 1;
                objA = snc1Var.a(rnc1Var);
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
            ry21 ry21Var = ((sy21) objA).a;
            if (ry21Var.Q0) {
                return rih1.a;
            }
            String str = "Failed to confirm subscription cancellation. HTTP " + ry21Var.d + ": " + ry21Var.c;
            Logger.d("SubscriptionCancellationConfirmationUseCase", new Object[]{str});
            return new m231(new Exception(str));
        } catch (Exception e) {
            Logger.d("SubscriptionCancellationConfirmationUseCase", new Object[]{"Error confirming subscription cancellation", e});
            return new m231(e);
        }
    }

    public Single c(Single single) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                return single.toObservable().compose((dgp0) obj).singleOrError();
            default:
                return single.map(new qeh1((vnd1) obj, (byte) 0));
        }
    }

    public Context d() {
        return ((n3c) this.b).d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(onm onmVar) {
        bq91 bq91Var;
        if (onmVar instanceof bq91) {
            bq91Var = (bq91) onmVar;
            int i = bq91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq91Var.c = i - Integer.MIN_VALUE;
            } else {
                bq91Var = new bq91(this, onmVar);
            }
        } else {
            bq91Var = new bq91(this, onmVar);
        }
        Object objA = bq91Var.a;
        int i2 = bq91Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            aq91 aq91Var = (aq91) this.b;
            bq91Var.c = 1;
            objA = aq91Var.a(bq91Var);
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
        LinkedHashMap linkedHashMap = cja1.a;
        List listA1 = o7h.a1(((SortedDestinationsProtoResponse) objA).n().entrySet(), new be21((byte) 13));
        ArrayList arrayList = new ArrayList();
        Iterator it = listA1.iterator();
        while (it.hasNext()) {
            o571 o571Var = (o571) cja1.a.get(((Destination) ((Map.Entry) it.next()).getValue()).o());
            if (o571Var != null) {
                arrayList.add(o571Var);
            }
        }
        return new v571(arrayList);
    }

    public boolean f() {
        return !((n3c) this.b).b.F("bnc_identity").equals("bnc_no_value");
    }

    public vr51 g(f710 f710Var) {
        ynb0 ynb0Var = ((SpotifyMainActivity) this.b).B1;
        if (ynb0Var != null) {
            return new vr51(((vn41) ynb0Var.get()).b(f710Var), (byte) 17);
        }
        u890.C("navigationSessionGate");
        throw null;
    }

    public void h(int i) {
        lm5 lm5Var = (lm5) this.b;
        if (lm5Var != null) {
            lm5Var.n(i);
        }
    }

    public boolean i(Function0 function0) {
        ynb0 ynb0Var = ((SpotifyMainActivity) this.b).B1;
        if (ynb0Var != null) {
            m021 m021VarA = ((vn41) ynb0Var.get()).a();
            return (m021VarA == null || m021VarA.i(new pt61(function0, (byte) 22)) == null) ? false : true;
        }
        u890.C("navigationSessionGate");
        throw null;
    }

    public void j() {
        ne neVar = ((n3c) this.b).b;
        ((SharedPreferences.Editor) neVar.b).putBoolean("bnc_dma_eea", true).apply();
        SharedPreferences.Editor editor = (SharedPreferences.Editor) neVar.b;
        editor.putBoolean("bnc_dma_ad_personalization", true).apply();
        editor.putBoolean("bnc_dma_ad_user_data", true).apply();
    }

    public void k(z740 z740Var, boolean z) {
        Parcelable v1i1Var = new v1i1(z740Var, (fyl) null);
        a1r0 a1r0Var = (a1r0) this.b;
        Bundle bundle = new Bundle();
        bundle.putParcelable("upsells_page_params", v1i1Var);
        a1r0.j(a1r0Var, "spotify:internal:upsells-sheet", (String) null, bundle, z, 2);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((v5a1) this.b).b(intent);
    }

    public void m() {
        n3c n3cVar = (n3c) this.b;
        i1k0.B("unlockPendingIntent removing INTENT_PENDING_WAIT_LOCK");
        n3cVar.m = 2;
        y861 y861Var = n3cVar.f;
        y861Var.r(t861.c);
        y861Var.p("unlockPendingIntent");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    public Object n(Object obj, Object obj2, Object obj3) {
        boolean z;
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        if (!((Boolean) obj).booleanValue() && !bool.booleanValue()) {
            c811 c811Var = (c811) ((p1f0) this.b).h;
            z = (!c811Var.b.n() ? true : c811Var.a.h(10) ^ true) && bool2.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                b9c1 b9c1Var = (b9c1) obj;
                v9c1 v9c1Var = (v9c1) obj2;
                b9c1Var.getClass();
                View view = v9c1Var.g;
                View view2 = v9c1Var.f;
                b8c1 b8c1Var = b9c1Var.b;
                if (b8c1Var instanceof z7c1) {
                    view2.setVisibility(0);
                    view.setVisibility(8);
                } else if (b8c1Var instanceof x7c1) {
                    view2.setVisibility(8);
                    view.setVisibility(0);
                } else if (!(b8c1Var instanceof a8c1)) {
                    eg.o();
                } else {
                    int i = b9c1Var.a;
                    kas0 kas0Var = b9c1Var.d;
                    u6c1 u6c1Var = b9c1Var.e;
                    l9c1 l9c1Var = (n9c1) v9c1Var.a.invoke(Integer.valueOf(i));
                    if (l9c1Var instanceof l9c1) {
                        a6c1 a6c1Var = l9c1Var.a;
                        if (v9c1Var.h == null) {
                            v9c1Var.h = a6c1Var;
                            view2.setVisibility(8);
                            view.setVisibility(8);
                            v9c1Var.i = false;
                            View viewE = a6c1Var.e(v9c1Var.d, v9c1Var.c);
                            aiq0.a(viewE, new cv70(viewE, a6c1Var, v9c1Var, i, (byte) 2));
                            v9c1Var.e.addView(viewE, 0);
                            v9c1Var.a(kas0Var);
                            a6c1 a6c1Var2 = v9c1Var.h;
                            if (a6c1Var2 != null) {
                                a6c1Var2.g(u6c1Var);
                            }
                        }
                    }
                }
                break;
            default:
                ((c4c1) ((he7) obj2).d).a(((Boolean) obj).booleanValue() ? d5c1.a : j5c1.a);
                break;
        }
    }

    public dn81(int i, long j, int i2) {
        this.a = (byte) 2;
        this.b = new dgp0(i, j, i2);
    }

    public dn81(hp31 hp31Var, qe41 qe41Var) {
        this.a = (byte) 7;
        this.b = new kdn0();
    }

    public dn81(TextPaint textPaint) {
        this.a = (byte) 23;
        this.b = new TextPaint(textPaint);
    }

    public /* synthetic */ dn81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 16:
                stc1 stc1Var = (ttc1) obj2;
                List<yrd> list = (List) obj;
                hmm0 hmm0Var = (hmm0) obj3;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (yrd yrdVarA : list) {
                    if (!stc1Var.equals(rtc1.a)) {
                        if (stc1Var instanceof stc1) {
                            stc1 stc1Var2 = stc1Var;
                            String str = stc1Var2.a;
                            String str2 = stc1Var2.b;
                            utc1 utc1Var = stc1Var2.c;
                            List listSingletonList = Collections.singletonList(new avd(str, str2, new yud(utc1Var.a, utc1Var.b), new bvd(str, stc1Var2.d)));
                            List<avd> list2 = yrdVarA.g;
                            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                            for (avd avdVar : list2) {
                                String string = avdVar.b;
                                if (string == null) {
                                    string = hmm0Var.c.getString(2131952492);
                                }
                                arrayList2.add(avd.a(avdVar, string, (cvd) null, 13));
                            }
                            yrdVarA = yrd.a(yrdVarA, o7h.N0(arrayList2, listSingletonList));
                        } else {
                            eg.o();
                            return null;
                        }
                    }
                    arrayList.add(yrdVarA);
                }
                return arrayList;
            default:
                re70 re70Var = (re70) obj;
                Object obj4 = ((e331) obj2).a;
                wpf1 wpf1Var = (wpf1) obj3;
                if (e331.a(obj4) != null) {
                    return re70Var;
                }
                try {
                    y570 y570VarA = wpf1Var.a(((MessageResponse.Success) obj4).getToken());
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(0, y570VarA);
                    arrayList3.addAll(re70Var.k());
                    return re70Var.toBuilder().o(arrayList3).f();
                } catch (Exception e) {
                    Logger.d(l1d.m("Failed to build HubsComponentModel for inline card: ", e.getMessage()), new Object[0]);
                    return re70Var;
                }
        }
    }
}
