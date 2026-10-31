package p;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenObservable;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wb00 implements qiw, Function, qp91, hs31, BiFunction, a2i, ya, e5q0, hfv {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ wb00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        qcc0 qcc0Var;
        Object next;
        String str;
        if (onmVar instanceof qcc0) {
            qcc0Var = (qcc0) onmVar;
            int i = qcc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qcc0Var.c = i - Integer.MIN_VALUE;
            } else {
                qcc0Var = new qcc0(this, onmVar);
            }
        } else {
            qcc0Var = new qcc0(this, onmVar);
        }
        Object objI = qcc0Var.a;
        int i2 = qcc0Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            evz evzVarB = ((ff20) this.b).b();
            qcc0Var.c = 1;
            objI = b5p1.i(evzVarB, qcc0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        Iterator it = ((Iterable) objI).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((xe20) next).d);
        xe20 xe20Var = (xe20) next;
        if (xe20Var == null || (str = xe20Var.b) == null || ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    public boolean accept(Object obj) {
        gq4 gq4Var = (gq4) this.b;
        return gq4Var.b() > 0 && gq4Var.a() > 0;
    }

    public Object apply(Object obj) throws InterruptedException {
        Single singleFlatMap;
        Map<String, ?> all;
        us60 us60Var;
        Object obj2;
        byte b = this.a;
        byte b2 = 12;
        z6x z6xVar = z6x.a;
        o6x o6xVar = o6x.a;
        boolean z = false;
        int i = 1;
        p0b0 p0b0Var = null;
        Object next = null;
        p0b0Var = null;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                return ((r410) obj3).b.b((Set) obj);
            case 2:
                aqc aqcVar = (aqc) obj;
                RestrictedIntegrationsResponse restrictedIntegrationsResponse = aqcVar.b;
                return aqcVar.a ? new CompletableCreate(new nt21(restrictedIntegrationsResponse, ((q610) obj3).b, (byte) 1)).e(Single.just(restrictedIntegrationsResponse)).onErrorReturnItem(restrictedIntegrationsResponse) : Single.just(restrictedIntegrationsResponse);
            case 3:
            case 5:
            case 9:
            case 11:
            case 14:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            default:
                zj20 zj20Var = zj20.h;
                tg60 tg60Var = (tg60) obj;
                t0c0 t0c0Var = (t0c0) obj3;
                r6c0 r6c0Var = t0c0Var.c;
                boolean z2 = tg60Var.a;
                boolean z3 = tg60Var.b;
                boolean z4 = tg60Var.c;
                bma1 bma1Var = t0c0.l;
                evm1 evm1Var = t0c0Var.b;
                boolean zD = evm1Var.d();
                boolean zN = evm1Var.n();
                boolean zG = evm1Var.G();
                boolean zS = evm1Var.s();
                if (!zD && !zN && !zG) {
                    return zS ? yoi1.i(new x880(rqt0.u(new xs4(r6c0Var.a.a, "library-import-transfer-results-banner-visible", (byte) 6)), r6c0Var, (byte) 19), o6xVar).map(zj20Var) : Observable.just(z6xVar);
                }
                CompletableSubscribeOn completableSubscribeOnS = z2 ? new CompletableFromRunnable(new s0c0(t0c0Var, zD, zN, zG)).s(t0c0Var.d) : CompletableEmpty.a;
                completableSubscribeOnS.getClass();
                CompletableAndThenObservable completableAndThenObservableD = completableSubscribeOnS.d(Observable.combineLatest(t0c0Var.d(t0c0.l), t0c0Var.d(t0c0.m), t0c0Var.d(t0c0.n), t0c0Var.d(t0c0.o), new r0c0(t0c0Var, z2, z3, z4)).map(new bm00(t0c0Var, (byte) 27)));
                return !zS ? completableAndThenObservableD : Observable.combineLatest(completableAndThenObservableD, yoi1.i(new x880(rqt0.u(new xs4(r6c0Var.a.a, "library-import-transfer-results-banner-visible", (byte) 6)), r6c0Var, (byte) 19), o6xVar).map(zj20Var), ak20.g);
            case 4:
                bk1 bk1Var = (bk1) obj3;
                return rqt0.F(o6xVar, new j020(bk1Var, (lnm) null, (byte) 1)).map(new mhc(bk1Var, (byte) 10)).toMaybe().h();
            case 6:
                return Flowable.I(new mmr0((tfs0) obj3, (Throwable) obj));
            case 7:
                return new gru(((th61) obj).b, ((gru) obj3).b);
            case 8:
                Bitmap bitmap = (Bitmap) obj;
                ur00 ur00Var = (ur00) obj3;
                l8s l8sVar = (l8s) ur00Var.b;
                bitmap.getClass();
                return l8sVar.c(new gjo0(new kp00(bitmap, ur00Var, (byte) 24), new jl00(ur00Var, (byte) 9)));
            case 10:
                ek40 ek40Var = (gk40) obj;
                hgo hgoVar = (hgo) obj3;
                if (ek40Var.equals(fk40.a)) {
                    return Single.just(new ac20(vwt.d));
                }
                if (ek40Var instanceof ek40) {
                    Single singleJust = Single.just(new ac20(new twt(new anv0(ek40Var.b))));
                    singleJust.getClass();
                    return singleJust;
                }
                if (!(ek40Var instanceof dk40)) {
                    eg.o();
                    return null;
                }
                dk40 dk40Var = (dk40) ek40Var;
                Single map = ((Single) ((g7t) hgoVar.b).invoke(dk40Var.d, dk40Var.e)).map(new jl00(hgoVar, ek40Var, z, (byte) 11));
                map.getClass();
                return map;
            case 12:
                k050 k050Var = (k050) obj;
                vsw0 vsw0Var = k050Var.a.a;
                r050 r050Var = (r050) obj3;
                return r050Var.b.m.filter(new jl00(r050Var, vsw0Var, z, b2)).take(1L).map(new lc20(r050Var, vsw0Var, k050Var, (byte) 17));
            case 13:
                wza0 wza0Var = (wza0) obj3;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                p811 p811Var = new p811();
                wza0Var.m.execute(new uu1(p811Var, wza0Var, countDownLatch, (byte) 19));
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                SharedPreferences sharedPreferences = (SharedPreferences) p811Var.a;
                if (sharedPreferences != null && (all = sharedPreferences.getAll()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        p0b0 p0b0VarB = wza0Var.b(key, value instanceof String ? (String) value : null);
                        if (p0b0VarB != null) {
                            arrayList.add(p0b0VarB);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            Long l = ((p0b0) next).f;
                            long jLongValue = l != null ? l.longValue() : 0L;
                            do {
                                Object next2 = it.next();
                                Long l2 = ((p0b0) next2).f;
                                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                                if (jLongValue < jLongValue2) {
                                    next = next2;
                                    jLongValue = jLongValue2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    p0b0Var = (p0b0) next;
                }
                if (p0b0Var == null) {
                    singleFlatMap = Single.just(Boolean.FALSE);
                    singleFlatMap.getClass();
                } else {
                    singleFlatMap = wza0Var.g.firstOrError().flatMap(new x390(p0b0Var, wza0Var, (byte) 12));
                    singleFlatMap.getClass();
                }
                return singleFlatMap.toObservable().map(xi10.e).onErrorReturn(dj10.e);
            case 15:
                tg60 tg60Var2 = (tg60) obj;
                qg60 qg60Var = (qg60) obj3;
                q280 q280VarO = qg60Var.a.o();
                ArrayList arrayList2 = new ArrayList(q7h.U(q280VarO, 10));
                Iterator it2 = q280VarO.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((sg60) it2.next()).b(tg60Var2));
                }
                if (arrayList2.isEmpty()) {
                    Observable observableJust = Observable.just(z6xVar);
                    observableJust.getClass();
                    return observableJust;
                }
                Observable observableSubscribeOn = Observable.combineLatest(arrayList2, si10.f).subscribeOn(qg60Var.b);
                observableSubscribeOn.getClass();
                return observableSubscribeOn;
            case 16:
                sy21 sy21Var = (sy21) obj;
                if (sy21Var.a.Q0 && (obj2 = sy21Var.b) != null) {
                    return new au60((q47) obj2);
                }
                uz21 uz21Var = sy21Var.c;
                kv60 kv60VarB = uz21Var != null ? ut60.b(uz21Var, (nfa0) obj3) : null;
                if (kv60VarB != null) {
                    String str = kv60VarB.b;
                    if (u890.j(str, "PARTICIPANT_ALREADY_IN_SESSION")) {
                        i = 2;
                    } else if (!u890.j(str, "SESSION_FULL")) {
                        i = 3;
                    }
                    us60Var = new us60(i);
                } else {
                    us60Var = new us60(3);
                }
                return new zt60(us60Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                so soVar = (so) obj3;
                if (((jux0) soVar.b).a.h(jux0.b, false) || ((i5y0) soVar.c).e()) {
                    Observable observableJust2 = Observable.just(wrx0.a);
                    observableJust2.getClass();
                    return observableJust2;
                }
                Observable observableJust3 = Observable.just(esx0.a);
                observableJust3.getClass();
                return observableJust3;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (ou80) obj3;
        }
    }

    public void b(un91 un91Var) {
        ((p2p0) this.b).d(un91Var, "PlayModePicker.Dialog");
    }

    public void c() {
        iu30 iu30Var;
        LibraryChipsView libraryChipsView = (LibraryChipsView) this.b;
        if ((!libraryChipsView.getRequireModelUpdate$src_main_java_com_spotify_yourlibrary_uiusecases_filterrow_filterrow() || libraryChipsView.Z0.compareAndSet(false, true)) && (iu30Var = libraryChipsView.X0) != null) {
            iu30Var.invoke(ud20.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object d(sy21 sy21Var, lnm lnmVar) {
        ez70 ez70Var;
        String strC;
        String str;
        List list;
        String str2;
        String str3;
        boolean z;
        if (lnmVar instanceof ez70) {
            ez70Var = (ez70) lnmVar;
            int i = ez70Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ez70Var.i = i - Integer.MIN_VALUE;
            } else {
                ez70Var = new ez70(this, (onm) lnmVar);
            }
        } else {
            ez70Var = new ez70(this, (onm) lnmVar);
        }
        Object obj = ez70Var.g;
        int i2 = ez70Var.i;
        if (i2 == 0) {
            hm5.M(obj);
            ry21 ry21Var = sy21Var.a;
            v360 v360Var = ry21Var.f;
            String strC2 = ry21Var.f.c("X-Background-Top-Color");
            strC = v360Var.c("X-Background-Bottom-Color");
            String strC3 = v360Var.c("X-Sticker-Title");
            String strC4 = v360Var.c("X-Sticker-Subtitle");
            boolean z2 = Boolean.parseBoolean(v360Var.c("X-Is-Preselected"));
            String strC5 = v360Var.c("X-Background-Image-Url");
            Uri uri = strC5 != null ? Uri.parse(strC5) : null;
            List listSingletonList = uri != null ? Collections.singletonList(uri) : z6x.a;
            xmu0 xmu0Var = (xmu0) this.b;
            Object obj2 = sy21Var.b;
            obj2.getClass();
            InputStream inputStreamA = ((uz21) obj2).a();
            ez70Var.a = strC2;
            ez70Var.b = strC;
            ez70Var.c = strC3;
            ez70Var.d = strC4;
            ez70Var.e = listSingletonList;
            ez70Var.f = z2;
            ez70Var.i = 1;
            d9n d9nVarH = xmu0Var.h(inputStreamA, ez70Var);
            d9n d9nVar = d9n.a;
            if (d9nVarH == d9nVar) {
                return d9nVar;
            }
            str = strC2;
            list = listSingletonList;
            str2 = strC3;
            str3 = strC4;
            z = z2;
            obj = d9nVarH;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = ez70Var.f;
            List list2 = ez70Var.e;
            String str4 = ez70Var.d;
            String str5 = ez70Var.c;
            strC = ez70Var.b;
            str = ez70Var.a;
            hm5.M(obj);
            z = z3;
            list = list2;
            str3 = str4;
            str2 = str5;
        }
        Uri uri2 = (Uri) obj;
        if (uri2 != null) {
            return new jq71(uri2, str != null ? new Integer(Color.parseColor(str)) : null, strC != null ? new Integer(Color.parseColor(strC)) : null, str2, str3, z, list);
        }
        return null;
    }

    public String e(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            f(stringWriter, obj);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void f(Writer writer, Object obj) throws IOException {
        aga0 aga0Var = (aga0) this.b;
        qha0 qha0Var = new qha0(writer, aga0Var.a, aga0Var.b, aga0Var.c, aga0Var.d);
        qha0Var.h(obj);
        qha0Var.j();
        qha0Var.b.flush();
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        ru9 ru9Var = (ru9) this.b;
        ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
        ou80 ou80Var = serializableExtra instanceof ou80 ? serializableExtra : null;
        ((p4s) ru9Var.d).a(ou80Var, new gu2(ru9Var, ou80Var, intent.hasExtra("push_data") ? 1 : 2, (byte) 22));
    }

    public af5 o(km61 km61Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1273443259);
        oza0 oza0Var = (oza0) this.b;
        boolean zI = x340Var.i(oza0Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new mza0(oza0Var, (byte) 0);
            x340Var.s0(objT);
        }
        af5 af5VarA = wmo1.A(2131957117, 2131957118, "https://support.spotify.com/article/kids-and-family-music", (zma1) null, (iu30) objT, x340Var, 384, 8);
        x340Var.r(false);
        return af5VarA;
    }

    public void v(Object obj) {
        ((TextView) ((g2z) ((zpr) this.b).f).e).setText((String) obj);
    }

    public Object apply(Object obj, Object obj2) {
        String str;
        View.OnClickListener zfsVar;
        k1a0 k1a0Var = (k1a0) this.b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i = ((aei1) obj).a;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        Integer numValueOf = Integer.valueOf(i);
        if (zBooleanValue) {
            str = null;
            zfsVar = null;
        } else {
            String string = ((Context) k1a0Var.j).getString(2131956899);
            zfsVar = new zfs(k1a0Var, (byte) 22);
            str = string;
        }
        return new er91((fs91) null, "", numValueOf, str, (Integer) null, zfsVar, (cvr) null, (xq91) null, true);
    }
}
