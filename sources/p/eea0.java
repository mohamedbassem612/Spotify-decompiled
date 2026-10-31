package p;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListCommentsRequest;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eea0 implements Predicate, Function, ya, xi7, leh, BiPredicate, qiw, Producer, mkf1 {
    public final /* synthetic */ byte a;
    public Object b;

    public eea0(i8h1 i8h1Var) {
        this.a = (byte) 7;
        this.b = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
    }

    public static final eea0 a(eva0 eva0Var) {
        if (eva0Var.o() > 0) {
            return new eea0((Object) eva0Var, (byte) 1);
        }
        k220.r("empty keyset");
        return null;
    }

    public static final eea0 k(ke71 ke71Var, gl4 gl4Var) throws GeneralSecurityException {
        dzx dzxVarO = dzx.o(ke71Var.p(), tz00.a());
        if (dzxVarO.m().size() == 0) {
            k220.r("empty keyset");
            return null;
        }
        try {
            eva0 eva0VarS = eva0.s(gl4Var.b(dzxVarO.m().i(), new byte[0]), tz00.a());
            if (eva0VarS.o() > 0) {
                return new eea0((Object) eva0VarS, (byte) 1);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            k220.r("invalid keyset, corrupted key material");
            return null;
        }
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        if (kskVar.c == le30.S0) {
            return true;
        }
        agc0 agc0Var = (agc0) this.b;
        String str = kskVar.a;
        agc0Var.getClass();
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false);
    }

    public Object apply(Object obj) {
        Observable map;
        Single singleFirstOrError;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 2:
                deb0 deb0Var = (deb0) this.b;
                return deb0Var.a.c.b("notification-locale", ((vdb0) obj).a).d(Observable.just(zdb0.a)).onErrorReturnItem(ydb0.a).subscribeOn(deb0Var.d);
            case 3:
                List list = (List) obj;
                return list.isEmpty() ? MaybeEmpty.a : Maybe.e(new tyb0(((n72) this.b).a, list));
            case 4:
                CharSequence charSequence = (CharSequence) ((PlayerState) obj).contextMetadata().get("loading.failed");
                if (charSequence != null && !ihc1.y0(charSequence)) {
                    z = false;
                }
                if (z) {
                    Observable observableJust = Observable.just(new w3c0(((i1k0) this.b).p()));
                    observableJust.getClass();
                    return observableJust;
                }
                Observable observableJust2 = Observable.just(v3c0.a);
                observableJust2.getClass();
                return observableJust2;
            case 11:
                enh enhVar = (enh) obj;
                h1e0 h1e0Var = (h1e0) this.b;
                tjh tjhVar = h1e0Var.b;
                String str = enhVar.a;
                String str2 = enhVar.b;
                ldi1 ldi1Var = (ldi1) tjhVar.c.b;
                zmc0 zmc0VarO = ListCommentsRequest.o();
                zmc0VarO.n(str);
                if (str2 != null) {
                    zmc0VarO.q(str2);
                }
                return ldi1Var.f(zmc0VarO.build()).map(new dg90(h1e0Var, enhVar, (byte) 13)).onErrorReturn(new upa0(enhVar, (byte) 10));
            case 12:
                hx41 hx41Var = (hx41) obj;
                k4e0 k4e0Var = (k4e0) this.b;
                boolean z3 = hx41Var.d instanceof ral;
                boolean z4 = hx41Var.c;
                if (z3) {
                    if (z4 && ((di4) k4e0Var.d).z()) {
                        z2 = true;
                    }
                    Observable observableA = k4e0Var.a(z2, true);
                    int iOrdinal = ((l651) k4e0Var.e).ordinal();
                    if (iOrdinal == 0) {
                        z211 z211Var = (z211) k4e0Var.c;
                        singleFirstOrError = z211Var.d.a(true).map(new xaz0(z211Var, (byte) 7)).firstOrError();
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        singleFirstOrError = Single.just(z6x.a);
                    }
                    map = Observable.combineLatest(observableA, singleFirstOrError.toObservable(), new eb80(k4e0Var, hx41Var, (byte) 16));
                } else {
                    map = k4e0Var.a(z4, false).map(new zud0(k4e0Var, hx41Var));
                }
                map.getClass();
                return map.doOnError(zzc0.d).onErrorReturn(new upa0(k4e0Var, hx41Var));
            case 13:
                return rqt0.F(o6x.a, new m2a0((zd1) this.b, (lnm) null, (byte) 15)).toObservable().filter(bk20.t).onErrorResumeNext(b610.X);
            case 15:
                Optional optional = (Optional) obj;
                p811 p811Var = (p811) this.b;
                optional.getClass();
                qir0 qir0Var = (qir0) optional.orElse(null);
                xnh1 xnh1Var = (xnh1) p811Var.a;
                return qir0Var != null ? xnh1Var.c(qir0Var) : xnh1Var;
            case 17:
                qug0 qug0Var = (qug0) this.b;
                return rqt0.F(qug0Var.a, new vse0(qug0Var, (lnm) null, (byte) 3));
            case 21:
                oki0 oki0Var = (oki0) obj;
                return j2h1.D(igu.b, new d7i0((gj10) this.b, oki0Var, (lnm) null, (byte) 3)).d(Observable.just(new wki0(oki0Var.c))).onErrorReturn(new upa0(oki0Var, (byte) 22));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                List list2 = (List) obj;
                yg7 yg7Var = ((sjj0) this.b).d;
                xkg0 xkg0Var = new xkg0();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof eh90) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((hi90) it.next()).getUri());
                }
                xkg0Var.put(v6v0.class, arrayList2);
                xkg0Var.put(w281.class, arrayList2);
                xkg0Var.put(l98.class, arrayList2);
                xkg0Var.put(z070.class, arrayList2);
                xkg0Var.put(zc8.class, arrayList2);
                return yg7Var.b(new wu00(xkg0Var.b())).map(new j9c1(list2));
            case 24:
                String str3 = (String) obj;
                zsc zscVar = (zsc) this.b;
                return (str3 == null || str3.length() == 0) ? Observable.just(new q7z0(false, false)) : ((o241) zscVar.e).a.switchMap(new yge0(zscVar, str3, (byte) 28));
            default:
                return ((g3s0) this.b).a(f3s0.c);
        }
    }

    public eva0 b() {
        return (eva0) this.b;
    }

    public void c(py8 py8Var) {
        Intent intent = py8Var.a.a;
        lik1 lik1Var = nik1.z0;
        Uri data = intent.getData();
        if (u890.j(lik1Var.a, data != null ? data.toString() : null)) {
            ((lxg) this.b).e("navigate_to_home");
            Trace.beginSection("startup_test_end");
            Trace.endSection();
        }
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        xup xupVar = (xup) ((lud0) this.b).b;
        switch (xupVar.a) {
            case 0:
                p2p p2pVar = xupVar.b;
                nwp nwpVar = (nwp) p2pVar.c;
                Scheduler scheduler = (Scheduler) nwpVar.s.get();
                Flowable flowable = (Flowable) nwpVar.l.get();
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                ypa ypaVar = new ypa((byte) 8, false);
                mr20 mr20Var = (mr20) ((daq) nwpVar.a.b).ul.get();
                c8o.l(mr20Var);
                mr20 mr20Var2 = mr20Var;
                mr20 mr20VarB = w2x.B((fdp) ((daq) nwpVar.a.b).a.a.u9.get());
                g1i g1iVar = (g1i) p2pVar.d;
                nwp nwpVar2 = (nwp) g1iVar.c;
                pe peVarG = nwpVar2.a.g();
                c8o.l(peVarG);
                Optional optionalOf = Optional.of(new vnu((Flowable) nwpVar2.l.get()));
                ynb0 ynb0VarA = xqu.a((p2p) g1iVar.d);
                xm41 xm41Var = (xm41) ((daq) nwpVar2.a.b).Yl.get();
                c8o.l(xm41Var);
                return new wkn0(viewGroup, scheduler, flowable, gw70VarA0, ypaVar, mr20Var2, mr20VarB, new rm0(peVarG, optionalOf, ynb0VarA, new rnu(new p3t(eth.V(xm41Var), (byte) 14)), (mr20) nwpVar2.L1.get()), (iac0) ((jly0) g1iVar.e).get(), new on4(true, (luk) ((nwp) g1iVar.c).g.get()));
            default:
                s2q s2qVar = xupVar.b;
                daq daqVar = s2qVar.b;
                Scheduler scheduler2 = (Scheduler) daqVar.z1.get();
                Flowable flowable2 = (Flowable) daqVar.D5.get();
                gw70 gw70Var = (gw70) daqVar.d8.get();
                ypa ypaVar2 = new ypa((byte) 8, false);
                mr20 mr20Var3 = (mr20) daqVar.ul.get();
                mr20 mr20VarB2 = w2x.B((fdp) daqVar.a.a.u9.get());
                cp31 cp31Var = (cp31) s2qVar.d;
                daq daqVar2 = (daq) cp31Var.b;
                pe peVar = (pe) daqVar2.p9.get();
                Optional optionalOf2 = Optional.of(new vnu((Flowable) daqVar2.D5.get()));
                ynb0 ynb0VarA2 = xqu.a((s2q) cp31Var.d);
                v5q v5qVar = (v5q) cp31Var.c;
                return new wkn0(viewGroup, scheduler2, flowable2, gw70Var, ypaVar2, mr20Var3, mr20VarB2, new rm0(peVar, optionalOf2, ynb0VarA2, new rnu(new p3t(eth.V((xm41) v5qVar.b.Yl.get()), (byte) 14)), (mr20) v5qVar.ma.get()), (iac0) ((jly0) cp31Var.e).get(), new on4(true, (luk) ((daq) cp31Var.b).L1.get()));
        }
    }

    public void e(py8 py8Var, Throwable th) {
        n57.g(cy30.p("Command failed: ", py8Var.c, " (", py8Var.b, ")"), th);
    }

    public Object f(Class cls) throws GeneralSecurityException {
        Object obj;
        byte[] bArrArray;
        eva0 eva0Var = (eva0) this.b;
        unw0 unw0Var = (unw0) vf11.e.get(cls);
        Object obj2 = null;
        Class clsB = unw0Var == null ? null : unw0Var.b();
        if (clsB == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i = woi1.a;
        int iQ = eva0Var.q();
        Iterator it = eva0Var.p().iterator();
        byte b = 1;
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            rpa0 rpa0Var = rpa0.c;
            if (!zHasNext) {
                if (i2 == 0) {
                    k220.r("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z2 && !z) {
                    k220.r("keyset doesn't contain a valid primary key");
                    return null;
                }
                aru0 aru0Var = new aru0(clsB);
                Class cls2 = (Class) aru0Var.d;
                for (dva0 dva0Var : eva0Var.p()) {
                    if (dva0Var.p() == rpa0Var) {
                        Object objD = vf11.d(dva0Var.m().o(), dva0Var.m().p(), clsB);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aru0Var.b;
                        if (dva0Var.p() != rpa0Var) {
                            Object obj3 = obj2;
                            k220.r("only ENABLED key is allowed");
                            return obj3;
                        }
                        int iOrdinal = dva0Var.o().ordinal();
                        if (iOrdinal != b) {
                            obj = obj2;
                            if (iOrdinal == 2) {
                                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(dva0Var.n()).array();
                            } else if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    k220.r("unknown output prefix type");
                                    return obj;
                                }
                                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(dva0Var.n()).array();
                            } else {
                                bArrArray = e130.a;
                            }
                        } else {
                            obj = obj2;
                            bArrArray = ByteBuffer.allocate(5).put(b).putInt(dva0Var.n()).array();
                        }
                        rnw0 rnw0Var = new rnw0(objD, bArrArray, dva0Var.p(), dva0Var.o());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(rnw0Var);
                        snw0 snw0Var = new snw0(rnw0Var.a());
                        List list = (List) concurrentHashMap.put(snw0Var, Collections.unmodifiableList(arrayList));
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(rnw0Var);
                            concurrentHashMap.put(snw0Var, Collections.unmodifiableList(arrayList2));
                        }
                        if (dva0Var.n() != eva0Var.q()) {
                            continue;
                        } else {
                            if (rnw0Var.c != rpa0Var) {
                                hhg1.n("the primary entry has to be ENABLED");
                                return obj;
                            }
                            if (aru0Var.j(rnw0Var.a()).isEmpty()) {
                                hhg1.n("the primary entry cannot be set to an entry which is not held by this primitive set");
                                return obj;
                            }
                            aru0Var.c = rnw0Var;
                        }
                    } else {
                        obj = obj2;
                    }
                    b = 1;
                    obj2 = obj;
                }
                unw0 unw0Var2 = (unw0) vf11.e.get(cls);
                if (unw0Var2 == null) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                }
                if (unw0Var2.b().equals(cls2)) {
                    return unw0Var2.a(aru0Var);
                }
                throw new GeneralSecurityException("Wrong input primitive class, expected " + unw0Var2.b() + ", got " + cls2);
            }
            dva0 dva0Var2 = (dva0) it.next();
            if (dva0Var2.p() == rpa0Var) {
                if (!dva0Var2.q()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(dva0Var2.n())));
                }
                if (dva0Var2.o() == fuq0.b) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(dva0Var2.n())));
                }
                if (dva0Var2.p() == rpa0.b) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(dva0Var2.n())));
                }
                if (dva0Var2.n() == iQ) {
                    if (z2) {
                        k220.r("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                if (dva0Var2.m().n() != apa0.e) {
                    z = false;
                }
                i2++;
            }
        }
    }

    public b5l0 g(String str, String str2) {
        return new b5l0(str, str2, (r6h1) this.b);
    }

    public Object get() {
        return new DispatcherWorker(((m8m0) this.b).a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(o571 o571Var, List list, Uri uri, Uri uri2, onm onmVar) {
        j6n0 j6n0Var;
        String str;
        if (onmVar instanceof j6n0) {
            j6n0Var = (j6n0) onmVar;
            int i = j6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                j6n0Var = new j6n0(this, onmVar);
            }
        } else {
            j6n0Var = new j6n0(this, onmVar);
        }
        Object obj = j6n0Var.a;
        int i2 = j6n0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (!aq8.B(list)) {
                p471 p471Var = p471.d;
                Object obj2 = d9n.a;
                if (o571Var == p471Var) {
                    j6n0Var.c = 1;
                    Object objJ = j(uri, uri2, j6n0Var);
                    if (objJ != obj2) {
                        obj = objJ;
                        str = (String) obj;
                        if (str != null) {
                            return new bkc0(str, null, 62, null);
                        }
                    }
                } else {
                    j6n0Var.c = 2;
                    Object objI = i(uri, uri2, j6n0Var);
                    if (objI != obj2) {
                        obj = objI;
                        str = (String) obj;
                        if (str != null) {
                            return new bkc0(str, null, 62, null);
                        }
                    }
                }
                return obj2;
            }
        } else if (i2 == 1) {
            hm5.M(obj);
            str = (String) obj;
            if (str != null) {
                return new bkc0(str, null, 62, null);
            }
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            str = (String) obj;
            if (str != null) {
                return new bkc0(str, null, 62, null);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(Uri uri, Uri uri2, onm onmVar) {
        k6n0 k6n0Var;
        if (onmVar instanceof k6n0) {
            k6n0Var = (k6n0) onmVar;
            int i = k6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                k6n0Var = new k6n0(this, onmVar);
            }
        } else {
            k6n0Var = new k6n0(this, onmVar);
        }
        Object objS = k6n0Var.a;
        int i2 = k6n0Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            if (uri != null) {
                k3i0 k3i0Var = (k3i0) this.b;
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                k6n0Var.c = 1;
                objS = smo1.s(new uaw0(uri2, k3i0Var, 68, uri, null), k6n0Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objS);
        Uri uri3 = (Uri) objS;
        if (uri3 != null) {
            return uri3.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(Uri uri, Uri uri2, onm onmVar) {
        l6n0 l6n0Var;
        if (onmVar instanceof l6n0) {
            l6n0Var = (l6n0) onmVar;
            int i = l6n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6n0Var.c = i - Integer.MIN_VALUE;
            } else {
                l6n0Var = new l6n0(this, onmVar);
            }
        } else {
            l6n0Var = new l6n0(this, onmVar);
        }
        Object objS = l6n0Var.a;
        int i2 = l6n0Var.c;
        if (i2 == 0) {
            hm5.M(objS);
            if (uri != null && uri2 != null) {
                k3i0 k3i0Var = (k3i0) this.b;
                l6n0Var.c = 1;
                objS = smo1.s(new ae1(uri2, k3i0Var, Bitmap.CompressFormat.PNG, uri, (lnm) null, (byte) 15), l6n0Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else if (uri != null) {
                return uri.toString();
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objS);
        Uri uri3 = (Uri) objS;
        if (uri3 != null) {
            return uri3.toString();
        }
        return null;
    }

    public Single l(Intent intent, th61 th61Var) {
        CompletableEmpty completableEmptyFlatMapCompletable;
        switch (this.a) {
            case 10:
                d2d0 d2d0Var = (d2d0) this.b;
                boolean zA = ((y3n0) d2d0Var.e).a();
                crn0 crn0Var = crn0.a;
                if (zA) {
                    String strValueOf = String.valueOf(intent.getData());
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(strValueOf);
                    if (!TextUtils.isEmpty(strValueOf) && s4b1VarX.c == blc0.da) {
                        String strJ = s4b1VarX.j();
                        if (strJ == null) {
                            completableEmptyFlatMapCompletable = CompletableEmpty.a;
                        } else {
                            completableEmptyFlatMapCompletable = ((ve00) ((RetrofitMaker) d2d0Var.b).createCustomHostService(ve00.class, hud0.a)).a(strJ).onErrorReturnItem(new vnd0()).map(new zjp1(strJ, (byte) 6)).observeOn((Scheduler) d2d0Var.c).timeout(5L, TimeUnit.SECONDS, Single.error(new TimeoutException())).flatMap(new eb80(d2d0Var, (byte) 14)).flatMapCompletable(new zud0(d2d0Var, (byte) 0));
                        }
                        return completableEmptyFlatMapCompletable.e(Single.just(crn0Var));
                    }
                }
                return Single.just(crn0Var);
            default:
                return ((Observable) ((ct8) this.b).b.invoke()).firstOrError().map(new f71(intent, (byte) 1)).onErrorReturn(va20.Z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(p371 p371Var, bkc0 bkc0Var, onm onmVar) {
        fkc0 fkc0Var;
        yy61 yy61Var;
        if (onmVar instanceof fkc0) {
            fkc0Var = (fkc0) onmVar;
            int i = fkc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fkc0Var.c = i - Integer.MIN_VALUE;
            } else {
                fkc0Var = new fkc0(this, onmVar);
            }
        } else {
            fkc0Var = new fkc0(this, onmVar);
        }
        Object objU = fkc0Var.a;
        int i2 = fkc0Var.c;
        if (i2 == 0) {
            hm5.M(objU);
            List list = zlw0.a;
            if (p371Var instanceof g9c1) {
                yy61Var = yy61.f;
            } else if (p371Var instanceof f9c1) {
                yy61Var = yy61.e;
            } else if (p371Var instanceof h9c1) {
                yy61Var = yy61.g;
            } else if (p371Var instanceof pz70) {
                yy61Var = yy61.d;
            } else {
                boolean z = p371Var instanceof a6j0;
                yy61 yy61Var2 = yy61.b;
                if (z) {
                    String str = ((a6j0) p371Var).b;
                    if (str != null && !ihc1.y0(str)) {
                        yy61Var = yy61.c;
                    }
                } else if (!(p371Var instanceof vkc0)) {
                    eg.o();
                    return null;
                }
                yy61Var = yy61Var2;
            }
            if (!list.contains(yy61Var)) {
                return null;
            }
            v6a0 v6a0Var = (v6a0) this.b;
            ckc0 ckc0Var = new ckc0(bkc0Var.a, new xjc0(bkc0Var.b, bkc0Var.c, bkc0Var.d, bkc0Var.e, bkc0Var.f));
            fkc0Var.c = 1;
            objU = v6a0Var.u(ckc0Var, fkc0Var);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        return ((ekc0) objU).a;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((rxt0) obj).a.equals(((qxt0) this.b).a);
            default:
                ((h1i0) this.b).d.b();
                return true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return woi1.a((eva0) this.b).toString();
            default:
                return super.toString();
        }
    }

    public void v(Object obj) {
        yvg1 yvg1Var = (yvg1) obj;
        MessageInputView messageInputView = (MessageInputView) this.b;
        boolean zBooleanValue = ((Boolean) yvg1Var.a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) yvg1Var.b).booleanValue();
        boolean zBooleanValue3 = ((Boolean) yvg1Var.c).booleanValue();
        w6e0 w6e0Var = messageInputView.T0;
        EncoreButton encoreButton = (EncoreButton) w6e0Var.d;
        boolean z = false;
        encoreButton.setEnabled(encoreButton.getVisibility() == 0 && !zBooleanValue && !zBooleanValue2 && zBooleanValue3);
        EncoreButton encoreButton2 = (EncoreButton) w6e0Var.e;
        if (encoreButton2.getVisibility() == 0 && !zBooleanValue && !zBooleanValue2 && zBooleanValue3) {
            z = true;
        }
        encoreButton2.setEnabled(z);
    }

    public /* synthetic */ eea0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public eea0(q3c0 q3c0Var, i1k0 i1k0Var) {
        this.a = (byte) 4;
        this.b = i1k0Var;
    }

    public eea0(v6a0 v6a0Var, zlw0 zlw0Var) {
        this.a = (byte) 6;
        this.b = v6a0Var;
    }

    public eea0(x5u x5uVar, Flowable flowable, rkd0 rkd0Var, muz muzVar, x8c0 x8c0Var, t8u0 t8u0Var, zeu0 zeu0Var, ez11 ez11Var, t2j0 t2j0Var) {
        this.a = (byte) 8;
        this.b = ez11Var;
    }

    public boolean test(Object obj, Object obj2) {
        return u890.j((jeh0) obj, (jeh0) obj2) && !((Boolean) ((gpc) this.b).invoke()).booleanValue();
    }
}
