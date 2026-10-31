package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.gander.v2.proto.UpdateNotificationStateRequest;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import com.spotify.yourupdates.domain.models.State;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ks21 implements Function, it41, jrn0, ya, BiFunction, b2i, ObservableOnSubscribe, k1q0, sya1 {
    public final /* synthetic */ byte a;
    public Object b;

    public Iterator a(tya1 tya1Var, CharSequence charSequence) {
        return new qya1(this, tya1Var, charSequence, (byte) 0);
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        d2f1 d2f1Var = (d2f1) this.b;
        String str = kskVar.a;
        boolean z = kskVar.b;
        le30 le30Var = kskVar.c;
        jq4 jq4Var = d2f1Var.c;
        if (!d2f1Var.a.b()) {
            return false;
        }
        if (d2f1.a(str, le30Var)) {
            return jq4Var.e();
        }
        return z ? jq4Var.h() : jq4Var.f();
    }

    public Object apply(Object obj) {
        gzy gzyVar;
        Single singleDoOnError;
        byte b = 12;
        byte b2 = 16;
        byte b3 = 1;
        Long l = null;
        switch (this.a) {
            case 1:
                bih1 bih1Var = (bih1) ((ij01) this.b).b;
                List listSingletonList = Collections.singletonList(((p0n1) obj).c.a.g);
                State state = State.AVAILABLE;
                y2n1 y2n1Var = (y2n1) bih1Var.b;
                nth1 nth1VarQ = UpdateNotificationStateRequest.q();
                nth1VarQ.n(listSingletonList);
                nth1VarQ.r((oth1) ((emv0) bih1Var.c).invoke(state));
                return y2n1Var.e(nth1VarQ.build()).map(n9x0.U0).map(r3x0.h).onErrorReturn(u3x0.h);
            case 2:
                uv00 uv00Var = (uv00) obj;
                g281 g281Var = (g281) this.b;
                return new mmr0(uv00Var.a(w281.class, g281Var.a), uv00Var.a(v740.class, g281Var.a));
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 14:
            case 16:
            case 19:
            case 21:
            case 23:
            case 24:
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
            default:
                bkb1 bkb1Var = (bkb1) this.b;
                return ((Boolean) obj).booleanValue() ? bkb1Var.Z.b.firstOrError().flatMap(new zb91((Object) bkb1Var, (byte) 5)) : Single.just(new yvg1(Boolean.FALSE, (Object) null, (Object) null));
            case 5:
                v6u v6uVar = (v6u) this.b;
                return rqt0.F(o6x.a, new w4c(fn31.q(v6uVar.c, (o8n) null, 0, new lc41(v6uVar, (wqx0) obj, (lnm) null, (byte) 0), 3), l, b3)).flatMapObservable(vbx0.i).onErrorReturnItem(new wsx0(false));
            case 7:
                ad7 ad7Var = (ad7) obj;
                up41 up41Var = (up41) ((yx11) this.b).b;
                String str = ad7Var.e;
                r620 r620Var = ad7Var.h;
                boolean z = ad7Var.g;
                String str2 = ad7Var.f;
                List list = ad7Var.i;
                List list2 = ad7Var.j;
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        switch (((gzy) obj2).ordinal()) {
                            case 0:
                            case 4:
                            case 5:
                                break;
                            case 1:
                            case 2:
                            case 3:
                            case 6:
                                arrayList.add(obj2);
                                break;
                            default:
                                eg.o();
                                return null;
                        }
                    }
                    list = arrayList;
                }
                if (str.length() == 0) {
                    z6x z6xVar = z6x.a;
                    singleDoOnError = Single.just(new tw41("", z6xVar, z6xVar));
                    singleDoOnError.getClass();
                } else {
                    py41 py41Var = (py41) up41Var.b;
                    ue7 ue7Var = py41Var.b;
                    if (r620Var == r620.c) {
                        String string = ihc1.e1(str).toString();
                        List list3 = list;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(t4n1.y((gzy) it.next()));
                        }
                        singleDoOnError = ue7Var.a(string, o7h.y0(arrayList2, ",", (String) null, (String) null, (iu30) null, 62), (Integer) null, str2).flatMap(new zgz0(py41Var, (byte) 17)).map(new dc31(str2, list2, b)).doOnError(w841.t);
                    } else {
                        String str3 = r620Var.a;
                        switch (r620Var.ordinal()) {
                            case 0:
                                eg.m("Top filter does not have one specific EntityType");
                                return null;
                            case 1:
                                gzyVar = gzy.a;
                                break;
                            case 2:
                                gzyVar = gzy.b;
                                break;
                            case 3:
                                gzyVar = gzy.c;
                                break;
                            case 4:
                                gzyVar = gzy.d;
                                break;
                            case 5:
                                gzyVar = gzy.e;
                                break;
                            case 6:
                            case 8:
                                gzyVar = gzy.g;
                                break;
                            case 7:
                                gzyVar = gzy.f;
                                break;
                            default:
                                eg.o();
                                return null;
                        }
                        singleDoOnError = ue7Var.c(ihc1.e1(str).toString(), t4n1.y(gzyVar).toString(), (Integer) null, str2, str3).flatMap(new rpv0((Object) py41Var, (byte) 27)).map(new m7y0(list2, (byte) 21)).doOnError(w841.X);
                    }
                    singleDoOnError.getClass();
                }
                return singleDoOnError.map(new ep31(ad7Var, (byte) 4)).toObservable().onErrorReturn(new bb01(ad7Var, (byte) 16));
            case 10:
                EsDownload.RequestDataResponse requestDataResponse = (EsDownload.RequestDataResponse) obj;
                iq51 iq51Var = (iq51) this.b;
                iq51Var.m = requestDataResponse.s() > 0 ? Long.valueOf(requestDataResponse.s()) : null;
                return new g1r(requestDataResponse.r(), requestDataResponse.getData(), iq51Var.m, requestDataResponse.o(), requestDataResponse.n() == xmz.b ? 1 : 2, requestDataResponse.p(), requestDataResponse.q());
            case 12:
                tz51 tz51Var = (tz51) obj;
                a061 a061Var = (a061) this.b;
                return a061Var.d.b(new oi("transcript-selection-page", false, new mn41((Object) tz51Var, (byte) 24))).filter(e2x0.X).map(new bb01(tz51Var, (byte) 20)).first(new mq70((List) null, 7)).onErrorReturn(f2x0.X).observeOn(a061Var.b).doOnSuccess(new z0u0(tz51Var, a061Var, (byte) 12)).flatMapObservable(h2x0.X);
            case 13:
                return new ysx0(((xqx0) this.b).b);
            case 15:
                return (SingleSource) ((p5) ((ffr) this.b).b).invoke((l3c1) obj);
            case 17:
                ContextTrack contextTrack = (ContextTrack) obj;
                l6s l6sVar = (l6s) ((cax) this.b).b;
                return Single.zip(pqs.a((pqs) l6sVar.c), ((xvo) l6sVar.a).a(true).firstOrError(), new zfr((Object) l6sVar, (Object) contextTrack, (byte) 23)).onErrorReturnItem(Boolean.FALSE).toFlowable().J(new vs10(contextTrack, (byte) 3));
            case 18:
                return rmy.a((rmy) this.b, (kk3) obj);
            case 20:
                return new nrx0(hwb.x(), ((qfl1) this.b).b(2131963957, new Object[0]), ((zqx0) obj).a - 1);
            case 22:
                a911 a911Var = ((ar81) this.b).c;
                MaybeMap maybeMapF = fq7.D(a911Var.b).f(Functions.b(vov0.class));
                Scheduler scheduler = a911Var.c;
                tov0 tov0Var = tov0.a;
                return new MaybeToSingle(new MaybeTimeoutMaybe(maybeMapF, Maybe.l(3L, TimeUnit.SECONDS, scheduler), Maybe.e(tov0Var)), tov0Var).flatMap(new rpv0(a911Var, b2)).cast(vov0.class).subscribeOn(a911Var.d).onErrorReturnItem(tov0Var).map(a2x0.N0);
            case 25:
                return new g4a1(((p2a1) this.b).a, true);
            case 26:
                Float f = (Float) obj;
                Float f2 = (Float) this.b;
                if (f.floatValue() <= 0.0f) {
                    return eqa1.a;
                }
                return new fqa1(jch0.U(f2.floatValue() * f.floatValue()), f2.floatValue() > 1.0f ? 1 : 2);
            case 28:
                if (!((Boolean) obj).booleanValue()) {
                    Single singleJust = Single.just(Boolean.FALSE);
                    singleJust.getClass();
                    return singleJust;
                }
                zrj1 zrj1Var = (zrj1) ((mxa1) this.b).e;
                if (Build.VERSION.SDK_INT >= 26) {
                    rx5 rx5Var = (rx5) zrj1Var.c;
                    return Single.fromCallable(new px5(rx5Var)).onErrorReturn(y580.e).timeout(2L, TimeUnit.SECONDS, rx5Var.c, Single.just(Boolean.FALSE));
                }
                Single singleJust2 = Single.just(Boolean.FALSE);
                singleJust2.getClass();
                return singleJust2;
        }
    }

    public Observable b() {
        bqz bqzVar = (bqz) this.b;
        return Observable.combineLatest(bqzVar.c("audio.crossfade_v2").map(u321.c1), bqzVar.c("audio.crossfade.time_v2").map(uh21.d1), gtv0.e).distinctUntilChanged();
    }

    public Next c(z551 z551Var, f051 f051Var) {
        rx41 px41Var;
        val valVar = z551Var.e;
        val valVar2 = f051Var.a;
        if (u890.j(valVar, valVar2)) {
            return Next.j();
        }
        z551 z551VarA = z551.a(z551Var, null, null, 0, null, valVar2, null, jlr0.a, valVar2 instanceof pal ? se20.a : z551Var.h, null, 0, null, null, false, null, false, 32559);
        fw41 fw41Var = z551VarA.f;
        String str = z551VarA.a;
        if (str.length() == 0) {
            String strF = z551VarA.Y.a;
            if (ihc1.y0(strF)) {
                strF = ejb.f();
            }
            return Next.i(z551VarA, Effects.a(new hx41[]{new hx41(strF, false, valVar2)}));
        }
        String strF2 = ejb.f();
        if (valVar2 instanceof ral) {
            gyh gyhVar = z551VarA.N0.a;
            if (gyhVar != null) {
                px41Var = new rx41(z551VarA.a, strF2, "", fw41Var.d, gyhVar, (tv80) null, fw41Var.c, 32);
            } else {
                px41Var = ((di4) this.b).B() ? new mx41(str, strF2, (tv80) null, fw41Var.c) : new nx41(str, strF2, null, fw41Var.c);
            }
        } else {
            if (!(valVar2 instanceof pal)) {
                eg.o();
                return null;
            }
            px41Var = new px41(str, strF2, fw41Var.e);
        }
        if (px41Var instanceof rx41) {
            z551VarA = z551.a(z551VarA, null, null, 0, u851.a, null, null, null, null, null, 0, null, null, false, null, false, 32755);
        }
        return Next.i(z551VarA, f46.S0(new xyn1[]{sc51.b, wc51.b, px41Var}));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[LOOP:0: B:22:0x004b->B:32:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0083 A[EDGE_INSN: B:51:0x0083->B:33:0x0083 BREAK  A[LOOP:0: B:22:0x004b->B:32:0x0080], SYNTHETIC] */
    public Object e(jfe jfeVar, Function0 function0) {
        n191 n191Var;
        r261 r261Var;
        if (((k9) this.b) == null) {
            bmv0.b("Called runAndWatch on a manager that has been disposed of");
        }
        n191 n191Var2 = (k9) this.b;
        if ((n191Var2 instanceof n191) && (r261Var = (n191Var = n191Var2).g) != null && !r261Var.equals(jfeVar)) {
            bvm0 bvm0Var = new bvm0();
            r261 r261Var2 = n191Var.g;
            if (r261Var2 == null) {
                bmv0.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            oen0 oen0Var = n191Var.e;
            if (oen0Var != null) {
                Object[] objArr = oen0Var.b;
                long[] jArr = oen0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    bvm0Var.v1(objArr[(i << 3) + i3], r261Var2);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = n191Var.c;
                obj.getClass();
                bvm0Var.v1(obj, r261Var2);
            }
            bvm0Var.z0();
            n191Var.J0();
            this.b = bvm0Var;
        }
        k9 k9Var = (k9) this.b;
        k9Var.getClass();
        jv91 jv91VarU = pv91.h().u(k9Var.l1(jfeVar));
        k9Var.y0(jfeVar);
        try {
            jv91 jv91VarJ = jv91VarU.j();
            try {
                Object objInvoke = function0.invoke();
                jv91.q(jv91VarJ);
                jv91VarU.c();
                k9Var.z0();
                return objInvoke;
            } catch (Throwable th) {
                jv91.q(jv91VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            jv91VarU.c();
            throw th2;
        }
    }

    public ice0 f(ef91 ef91Var, boolean z) {
        dp60 dp60Var = (dp60) this.b;
        boolean zH = dp60Var.a.h(dp60.b, false);
        ice0 ice0Var = ice0.f;
        if (z) {
            return ice0Var;
        }
        if (!zH || ef91Var != ef91.d) {
            return ef91Var == ef91.b ? ice0.a : ice0.d;
        }
        dp60Var.a(false);
        return ice0Var;
    }

    public void g(int i) {
        ((RecyclerView) this.b).O(0, i);
    }

    public af5 h(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(22721794);
        lq61 lq61Var = (lq61) this.b;
        int i = lq61Var.e;
        x340Var.i0(360812164);
        c380 c380Var = lq61Var.f;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            arrayList.add(cwl1.o0(x340Var, ((kq61) it.next()).g()));
        }
        x340Var.r(false);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        af5 af5Var = new af5(cwl1.n0(i, Arrays.copyOf(strArr, strArr.length), x340Var));
        x340Var.r(false);
        return af5Var;
    }

    public boolean j() {
        return !((RecyclerView) this.b).isLayoutSuppressed();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String stringExtra = intent.getStringExtra("query");
        intent.setData(Uri.parse("spotify:search"));
        fw0 fw0Var = (fw0) this.b;
        String str = th61Var.a;
        Set set = s4b1.f;
        String strZ = uic.x(intent.getDataString()).z();
        strZ.getClass();
        boolean z = th61Var.h;
        Serializable serializableExtra = intent.getSerializableExtra("queryCompletionSource");
        gyh gyhVar = serializableExtra instanceof gyh ? (gyh) serializableExtra : null;
        if ((gyhVar == null ? -1 : e751.a[gyhVar.ordinal()]) == -1) {
            gyhVar = gyh.c;
        }
        return fw0Var.b(new y651(str, strZ, stringExtra, z, gyhVar, (l651) null, 64));
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        yon yonVar = (yon) this.b;
        m021 m021Var = (m021) yonVar.d;
        ((i8h1) m021Var.b).f(((dsk0) m021Var.c).e(), (Set) null);
        ((Handler) yonVar.e).post(new xfz0(yonVar, (byte) 16));
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        int i = nk80VarI.a;
        int i2 = nk80VarI.c;
        fh81 fh81Var = (fh81) this.b;
        th81 mainLayoutConfig = fh81Var.getMainLayoutConfig();
        t8p1 t8p1Var = mainLayoutConfig != null ? mainLayoutConfig.c : null;
        boolean z = t8p1Var instanceof rh81;
        FrameLayout frameLayout = fh81Var.w1;
        if (z) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = ((rh81) t8p1Var).d;
            if (fh81Var.getLayoutDirection() == 1) {
                i = i2;
            }
            int i4 = i + i3;
            int i5 = nk80VarI.b + i3;
            int i6 = i3 + nk80VarI.d;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(i4);
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i6;
            frameLayout.setLayoutParams(marginLayoutParams);
            return hsl1.b;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int marginEnd2 = marginLayoutParams2.getMarginEnd();
        marginLayoutParams2.setMarginStart(0);
        marginLayoutParams2.topMargin = 0;
        marginLayoutParams2.setMarginEnd(marginEnd2);
        marginLayoutParams2.bottomMargin = 0;
        frameLayout.setLayoutParams(marginLayoutParams2);
        CoordinatorLayout coordinatorLayout = fh81Var.x1;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (fh81Var.getLayoutDirection() == 1) {
            i = i2;
        }
        int i7 = marginLayoutParams3.topMargin;
        int marginEnd3 = marginLayoutParams3.getMarginEnd();
        int i8 = marginLayoutParams3.bottomMargin;
        marginLayoutParams3.setMarginStart(i);
        marginLayoutParams3.topMargin = i7;
        marginLayoutParams3.setMarginEnd(marginEnd3);
        marginLayoutParams3.bottomMargin = i8;
        coordinatorLayout.setLayoutParams(marginLayoutParams3);
        return hsl1Var;
    }

    public /* synthetic */ ks21(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ ks21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public Object apply(Object obj, Object obj2) {
        jl8 jl8Var = (jl8) obj;
        mmr0 mmr0Var = (mmr0) obj2;
        Boolean bool = (Boolean) mmr0Var.a;
        xv21 xv21Var = (zv21) mmr0Var.b;
        if (!xv21Var.equals(vv21.a)) {
            if (xv21Var instanceof xv21) {
                ywv0 ywv0Var = (ywv0) this.b;
                th61 th61Var = xv21Var.a;
                yg8 yg8Var = th61Var.f;
                ywv0Var.getClass();
                boolean zBooleanValue = bool.booleanValue();
                if (jl8Var instanceof il8) {
                    if (ywv0.d(th61Var)) {
                        if (zBooleanValue) {
                            return new gl8(th61Var);
                        }
                    } else if (ywv0.e(th61Var)) {
                        return new hl8(yg8Var);
                    }
                } else {
                    if (jl8Var instanceof gl8) {
                        if (ywv0.d(th61Var)) {
                            if (zBooleanValue) {
                                return new gl8(th61Var);
                            }
                            eg.m("Product state disappeared in authenticated state");
                            return null;
                        }
                        if (ywv0.e(th61Var)) {
                            return new hl8(yg8Var);
                        }
                        if (zBooleanValue) {
                            return new gl8(th61Var);
                        }
                        eg.m("Product state disappeared in authenticated state");
                        return null;
                    }
                    if (jl8Var instanceof hl8) {
                        if (!ywv0.d(th61Var)) {
                            return new hl8(yg8Var);
                        }
                        if (zBooleanValue) {
                            return new gl8(th61Var);
                        }
                        return new hl8(yg8Var);
                    }
                    eg.o();
                    return null;
                }
            } else {
                eg.o();
                return null;
            }
        }
        return il8.a;
    }
}
