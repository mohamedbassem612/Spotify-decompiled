package p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcel;
import android.view.GestureDetector;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.Any;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profilelist.datasource.PartialProfileListDataException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.mdata.proto.Mdata;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse$EntityExtension;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse$ExtensionHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mev implements SingleTransformer, Function, ya, i2q0, lqw, cy81, ci7, ix30, BiFunction {
    public final /* synthetic */ byte a;
    public Object b;

    public mev(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = (byte) 21;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public Object a(Class cls, mmr0 mmr0Var) {
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e((String) mmr0Var.a);
        Integer num = (Integer) mmr0Var.b;
        k370Var.g(num != null ? num.intValue() : 443);
        return ((RetrofitMaker) this.b).createCustomHostService(cls, k370Var.b());
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 3:
                ksk kskVar = (ksk) obj;
                return ((ytp0) this.b).v(kskVar.c, kskVar.a, 1);
            default:
                return ((gal1) this.b).c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x02a8  */
    public Object apply(Object obj) {
        h290<Mdata$LocalBatchedExtensionResponse$EntityExtension> h290VarN;
        boolean z;
        byte[] bArrT;
        z6q0 z6q0Var;
        phc phcVarQ;
        Single singleUnsubscribeOn;
        boolean z2 = true;
        Integer numValueOf = null;
        switch (this.a) {
            case 2:
                return (mnw) ((nfa0) ((yfu) this.b).c).a((String) obj, mnw.Companion.serializer());
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 14:
            case 16:
            case 17:
            default:
                dma1 dma1Var = (dma1) obj;
                a450 a450Var = (a450) this.b;
                String strE = dma1Var.e(a450.g, (String) null);
                return strE != null ? Single.just(strE) : a450Var.a.a(f3s0.e).subscribeOn(a450Var.e).observeOn(a450Var.d).compose(new dn81((byte) 2)).doOnSuccess(new od30(dma1Var, (byte) 10));
            case 6:
                Uri.Builder builderBuildUpon = ((Uri) this.b).buildUpon();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                return builderBuildUpon.build();
            case 7:
                return ((nt8) this.b).c().map(pbo1.a1);
            case 9:
                juz juzVar = (juz) this.b;
                Mdata.LocalBatchedExtensionResponse.Extension extension = (Mdata.LocalBatchedExtensionResponse.Extension) o7h.s0(((Mdata.LocalBatchedExtensionResponse) obj).getExtensionList());
                if (extension == null || (h290VarN = extension.n()) == null) {
                    return b7x.a;
                }
                int iS = zno1.s(q7h.U(h290VarN, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Mdata$LocalBatchedExtensionResponse$EntityExtension mdata$LocalBatchedExtensionResponse$EntityExtension : h290VarN) {
                    String entityUri = mdata$LocalBatchedExtensionResponse$EntityExtension.getEntityUri();
                    Mdata$LocalBatchedExtensionResponse$ExtensionHeader mdata$LocalBatchedExtensionResponse$ExtensionHeaderO = mdata$LocalBatchedExtensionResponse$EntityExtension.o();
                    if (mdata$LocalBatchedExtensionResponse$ExtensionHeaderO == null || mdata$LocalBatchedExtensionResponse$ExtensionHeaderO.getStatusCode() != 200) {
                        z = false;
                    } else {
                        int number = hz00.d4.getNumber();
                        Any anyN = mdata$LocalBatchedExtensionResponse$EntityExtension.n();
                        if (anyN == null || (phcVarQ = anyN.q()) == null || (bArrT = phcVarQ.t()) == null) {
                            bArrT = new byte[0];
                        }
                        a7q0 a7q0VarA = juzVar.b.a(Collections.singletonList(new jz00(bArrT, number))).a(a7q0.class);
                        if (a7q0VarA == null || (z6q0Var = a7q0VarA.f) == null || !z6q0Var.b) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    linkedHashMap.put(entityUri, Boolean.valueOf(z));
                }
                return linkedHashMap;
            case 10:
                spq0 spq0Var = (spq0) obj;
                xc00 xc00Var = (xc00) this.b;
                zq4 zq4Var = xc00Var.e;
                try {
                    xc00Var.a((iy30) spq0Var.b());
                    zq4Var.a();
                    break;
                } catch (Throwable th) {
                    th.toString();
                    zq4Var.g();
                }
                return rih1.a;
            case 12:
                z310 z310Var = (z310) obj;
                List list = z310Var.a;
                list.size();
                short s = ((r9c) this.b).j.a;
                return list.size() > s ? z310.a(z310Var, list.subList(0, s), z310Var.b, 12) : z310Var;
            case 13:
                ContextTrack contextTrack = (ContextTrack) obj;
                ac10 ac10Var = (ac10) this.b;
                try {
                    numValueOf = Integer.valueOf(Color.parseColor("#" + contextTrack.metadata().get("extracted_color")));
                    break;
                } catch (IllegalArgumentException unused) {
                }
                if (numValueOf == null || (singleUnsubscribeOn = Single.just(Integer.valueOf(numValueOf.intValue()))) == null) {
                    singleUnsubscribeOn = Single.create(new w2z((byte) 14, ac10Var, l4o1.a0(contextTrack, "image_url"))).unsubscribeOn((Scheduler) ac10Var.d);
                }
                singleUnsubscribeOn.getClass();
                return singleUnsubscribeOn.map(new ekb(ac10Var, (byte) 10)).map(new lmw(contextTrack, ac10Var));
            case 15:
                vaw vawVar = (vaw) obj;
                b020 b020Var = (b020) this.b;
                if (vawVar.a && b020Var.e) {
                    return rqt0.F(o6x.a, new xr00(vawVar, b020Var, (lnm) null, (byte) 6)).ignoreElement().w().onErrorReturn(zz10.b);
                }
                Observable observableJust = Observable.just(vawVar.c);
                Observable observableTake = new ObservableFromPublisher(b020Var.a).take(1L);
                String str = vawVar.d;
                Set set = vawVar.g;
                String str2 = vawVar.c;
                int i = vawVar.h;
                Set<String> set2 = vawVar.e;
                ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                for (String str3 : set2) {
                    Set set3 = s4b1.f;
                    arrayList.add(uic.x(str3).h());
                }
                Set setP1 = o7h.p1(arrayList);
                Set<String> set4 = set;
                ArrayList arrayList2 = new ArrayList(q7h.U(set4, 10));
                for (String str4 : set4) {
                    Set set5 = s4b1.f;
                    arrayList2.add(uic.x(str4).h());
                }
                Observable observableOnErrorReturn = Observable.combineLatest(observableJust, observableTake, b020Var.c.a(new py00(i, str, str2, o7h.p1(arrayList2.subList(Math.max(0, set.size() - 6), set.size())), setP1)).toObservable(), a020.b).flatMap(new t7y(b020Var, vawVar, (byte) 20)).map(new lmw(vawVar, (byte) 14)).onErrorReturn(yz10.b);
                observableOnErrorReturn.getClass();
                return observableOnErrorReturn;
            case 18:
                Map map = (Map) obj;
                h290 h290Var = (h290) this.b;
                if (!h290Var.isEmpty()) {
                    Iterator it = h290Var.iterator();
                    while (it.hasNext()) {
                        f7h f7hVar = (f7h) map.get((String) it.next());
                        if (!(f7hVar != null ? f7hVar.a : false)) {
                            z2 = false;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 19:
                Throwable th2 = (Throwable) obj;
                return Observable.error(th2 instanceof PartialProfileListDataException ? (PartialProfileListDataException) th2 : new PartialProfileListDataException((j8x0) this.b, th2));
        }
    }

    public void b(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public Single c(Single single) {
        return single.flatMap(new h9n((nkv) this.b, (byte) 28));
    }

    public void d(Object obj) {
        h141 h141Var = (h141) this.b;
        h141Var.e(em10.a((em10) obj, ((em10) h141Var.getState()).c));
    }

    public void e(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    public void f(long j) {
        long jB = TextUnit.b(j);
        byte b = 0;
        if (!wee1.a(jB, 0L)) {
            if (wee1.a(jB, 4294967296L)) {
                b = 1;
            } else if (wee1.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        b(b);
        if (wee1.a(TextUnit.b(j), 0L)) {
            return;
        }
        e(TextUnit.c(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, wxn0 wxn0Var, onm onmVar) {
        pp40 pp40Var;
        if (onmVar instanceof pp40) {
            pp40Var = (pp40) onmVar;
            int i = pp40Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp40Var.e = i - Integer.MIN_VALUE;
            } else {
                pp40Var = new pp40(this, onmVar);
            }
        } else {
            pp40Var = new pp40(this, onmVar);
        }
        Object objH = pp40Var.c;
        int i2 = pp40Var.e;
        if (i2 == 0) {
            hm5.M(objH);
            gj10 gj10Var = (gj10) this.b;
            pp40Var.a = wxn0Var;
            pp40Var.b = str;
            pp40Var.e = 1;
            objH = gj10Var.h(str, pp40Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = pp40Var.b;
            wxn0Var = pp40Var.a;
            hm5.M(objH);
        }
        return new fpi0(str, (vni0) objH, mpi0.a, wxn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(uzl1 uzl1Var, onm onmVar) {
        lev levVar;
        if (onmVar instanceof lev) {
            levVar = (lev) onmVar;
            int i = levVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                levVar.d = i - Integer.MIN_VALUE;
            } else {
                levVar = new lev(this, onmVar);
            }
        } else {
            levVar = new lev(this, onmVar);
        }
        Object obj = levVar.b;
        int i2 = levVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ((n2t) ((tzo) this.b).b).b(vt7.d, 800, 0.1f);
                levVar.a = uzl1Var;
                levVar.d = 1;
                Object objI = hap1.i(800L, levVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uzl1Var = levVar.a;
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return new m1m1(uzl1Var.a);
    }

    public cwl i(yf51 yf51Var, lby lbyVar, int i, d8r0 d8r0Var, String str, String str2, String str3, String str4) {
        return ((di4) this.b).Z() ? new fvl(j(yf51Var, lbyVar, i, d8r0Var, str, str2, str3, 1, str4)) : new gvl(new wo80(yf51Var.d, j(yf51Var, lbyVar, i, d8r0Var, str, str2, str3, 2, str4)));
    }

    public so80 j(yf51 yf51Var, lby lbyVar, int i, d8r0 d8r0Var, String str, String str2, String str3, int i2, String str4) {
        int i3;
        String str5 = lbyVar.b;
        String str6 = lbyVar.c;
        String str7 = lbyVar.a;
        String str8 = yf51Var.a;
        String strH = gvg.h("spotify:internal:search:prompt:generate:", Uri.encode(str2), ":", Uri.encode(str5));
        int iOrdinal = ((di4) this.b).W().ordinal();
        int i4 = 1;
        if (iOrdinal == 0) {
            i3 = i4;
        } else if (iOrdinal == 1) {
            i3 = 2;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            i4 = 3;
            i3 = i4;
        }
        return new so80(str5, str6, str7, i2, i3, d8r0Var, i, str8, str, strH, str3, str4);
    }

    public void k(Object obj, tqw tqwVar) {
        h141 h141Var = (h141) this.b;
        h141Var.e(em10.a((em10) h141Var.getState(), !((em10) h141Var.getState()).c));
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public void onFailure(Throwable th) {
        ((zq70) this.b).close();
    }

    public void onSuccess(Object obj) {
    }

    public void z() {
        sq20 sq20Var = (sq20) this.b;
        ConstraintLayout constraintLayout = sq20Var.F;
        if (constraintLayout == null) {
            u890.C("mediaContainer");
            throw null;
        }
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = sq20Var.I;
        if (constraintLayout2 == null) {
            u890.C("achievementCardContainer");
            throw null;
        }
        constraintLayout2.setVisibility(4);
        ParagraphView paragraphView = sq20Var.J;
        if (paragraphView == null) {
            u890.C("achievementLabelView");
            throw null;
        }
        paragraphView.setVisibility(4);
        ConstraintLayout constraintLayout3 = sq20Var.E;
        if (constraintLayout3 != null) {
            constraintLayout3.setAlpha(sq20Var.B ? 0.0f : 1.0f);
        } else {
            u890.C("mediaSceneContainer");
            throw null;
        }
    }

    public /* synthetic */ mev(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void dispose() {
    }

    public mev(hny hnyVar, Uri uri) {
        this.a = (byte) 6;
        this.b = uri;
    }

    public Object apply(Object obj, Object obj2) {
        return ((PlayerState) obj).position(((h690) this.b).b.b());
    }

    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public n8d0 m932apply(Object obj) {
        return poz0.B(((hv30) this.b).apply(obj));
    }
}
