package p;

import android.net.Uri;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiResponse;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a42 implements s891, Function, mh0, ya, BiFunction, SingleOnSubscribe, qtl {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public Object b;

    public a42(Scheduler scheduler, aru0 aru0Var, uha uhaVar, Observable observable) {
        this.a = (byte) 1;
        Observable map = observable.startWithItem(vge0.b).map(mm10.f1);
        this.b = Observable.combineLatest(Observable.combineLatest(((crd) aru0Var.b).c, (Observable) aru0Var.d, new vyq0((Object) aru0Var, (byte) 12)), uhaVar.a, map, een.d1).skipWhile(e4y.a1).observeOn(scheduler).distinctUntilChanged().replay(1).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(String str, onm onmVar) {
        pl7 pl7Var;
        if (onmVar instanceof pl7) {
            pl7Var = (pl7) onmVar;
            int i = pl7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pl7Var.c = i - Integer.MIN_VALUE;
            } else {
                pl7Var = new pl7(this, onmVar);
            }
        } else {
            pl7Var = new pl7(this, onmVar);
        }
        Object objB = pl7Var.a;
        int i2 = pl7Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                tcd tcdVar = (tcd) this.b;
                pl7Var.c = 1;
                objB = tcdVar.b(str, pl7Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            Boolean bool = (Boolean) objB;
            bool.getClass();
            return bool;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 11:
                return ((ksk) obj).c == le30.b && ((dp4) this.b).a();
            default:
                return ((ux3) this.b).a();
        }
    }

    public Object apply(Object obj) {
        awi0 awi0VarE;
        byte b = 15;
        switch (this.a) {
            case 3:
                pq pqVar = (pq) this.b;
                ((vbd1) pqVar.d.get()).a.onNext(dwo0.a);
                oq oqVar = (oq) pqVar.b.get();
                String str = pqVar.g;
                if (str == null) {
                    str = "";
                }
                return oqVar.a(str).flatMapCompletable(new fl1(pqVar, (byte) 2));
            case 5:
                return ((pw0) this.b).b.a((q9u0) obj).ignoreElement();
            case 10:
                List itemsList = ((MetadataCosmos$MultiResponse) obj).getItemsList();
                ArrayList<MetadataCosmos$MetadataItem> arrayList = new ArrayList();
                for (Object obj2 : itemsList) {
                    if (((MetadataCosmos$MetadataItem) obj2).r() != 1) {
                        arrayList.add(obj2);
                    }
                }
                j23 j23Var = (j23) this.b;
                ArrayList arrayList2 = new ArrayList();
                for (MetadataCosmos$MetadataItem metadataCosmos$MetadataItem : arrayList) {
                    try {
                        metadataCosmos$MetadataItem.getClass();
                        awi0VarE = j23Var.e(metadataCosmos$MetadataItem);
                    } catch (Exception unused) {
                        awi0VarE = null;
                    }
                    if (awi0VarE != null) {
                        arrayList2.add(awi0VarE);
                    }
                    break;
                }
                return arrayList2;
            case 12:
                if (!((Boolean) obj).booleanValue()) {
                    return Single.just(Boolean.FALSE);
                }
                p2o0 p2o0Var = (p2o0) this.b;
                t2s0 t2s0Var = (t2s0) p2o0Var.d;
                x2s0 x2s0Var = t2s0Var.a;
                return Single.defer(new yj1(x2s0Var, (byte) 18)).subscribeOn(x2s0Var.a).map(new pjq0(t2s0Var, (byte) 5)).map(new u3x0(p2o0Var)).doOnSuccess(new tg(p2o0Var, b));
            case 13:
                hm3 hm3Var = (hm3) obj;
                om3 om3Var = (om3) this.b;
                hm3Var.getClass();
                Observable observableTimer = hm3Var.d ? Observable.timer(3L, TimeUnit.SECONDS) : Observable.just(1L);
                observableTimer.getClass();
                return observableTimer.flatMap(new oj80(om3Var, hm3Var, (byte) 28));
            case 17:
                return Single.create(new cp5((ek4) this.b, (byte) 15));
            case 19:
                return Single.create(new cp5((at4) this.b, (byte) 17));
            case 23:
                return (feh) this.b;
            case 24:
                return ((qs6) ((km3) this.b).c).a((List) obj).toObservable();
            case 28:
                f7h f7hVar = (f7h) ((Map) obj).get(((x78) this.b).a);
                return new l910(f7hVar != null ? f7hVar.c : false);
            default:
                ((Function0) this.b).invoke();
                return xf8.c[((EsCodeRequired.CodeRequiredProceedResult) obj).n().o().ordinal()] == 1 ? new n341(new ug8(400, "Esperanto failure: unknown context")) : new n341(new ug8(400, "Esperanto failure: incomplete response"));
        }
    }

    public void b() {
        Consumer consumer;
        uj ujVar = (uj) this.b;
        if (ujVar.e == null || (consumer = ujVar.d) == null) {
            return;
        }
        consumer.accept(new mcr(gj.a));
    }

    public synchronized eea0 c() {
        return ((ifl1) this.b).i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable d(String str, onm onmVar) throws Throwable {
        ab2 ab2Var;
        Boolean m231Var;
        if (onmVar instanceof ab2) {
            ab2Var = (ab2) onmVar;
            int i = ab2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ab2Var.c = i - Integer.MIN_VALUE;
            } else {
                ab2Var = new ab2(this, onmVar);
            }
        } else {
            ab2Var = new ab2(this, onmVar);
        }
        Object objA = ab2Var.a;
        int i2 = ab2Var.c;
        boolean z = false;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qns0 qns0Var = (qns0) this.b;
                List listSingletonList = Collections.singletonList(str);
                ab2Var.c = 1;
                objA = qns0Var.a("share_video_frame", listSingletonList, ab2Var, false);
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
            qfd qfdVar = (qfd) o7h.s0((List) objA);
            if (qfdVar != null && !qfdVar.b) {
                z = true;
            }
            m231Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
            return m231Var instanceof m231 ? Boolean.TRUE : m231Var;
        }
        throw thA;
    }

    public vd0 e(hti0 hti0Var, rzq rzqVar) {
        return new vd0(new te1(d3p1.F(rzqVar, w3p1.n(new l4r(hvm.b, 1, uh1.X0, new j4r(uh1.Z0), uh1.Y0), new l4r(new xv00(rc11.a.b(qp31.class)), 2, uh1.V0, new j4r(uh1.a1), uh1.W0), ah1.e), hti0Var.a), (byte) 1), this, hti0Var, (byte) 1);
    }

    public void f() {
        yj5 yj5Var = (yj5) this.b;
        ActionBarOverlayLayout actionBarOverlayLayout = yj5Var.Q0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.b();
        }
        if (yj5Var.V0 != null) {
            yj5Var.Y.getDecorView().removeCallbacks(yj5Var.W0);
            if (yj5Var.V0.isShowing()) {
                try {
                    yj5Var.V0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            yj5Var.V0 = null;
        }
        oek1 oek1Var = yj5Var.X0;
        if (oek1Var != null) {
            oek1Var.c();
        }
        msi0 msi0Var = yj5Var.x(0).h;
        if (msi0Var != null) {
            msi0Var.d(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public jhm g(hti0 hti0Var, boolean z, boolean z2) {
        boolean z3;
        int i;
        qxc0 qxc0Var = hti0Var.d;
        String str = hti0Var.a;
        if (qxc0Var == null) {
            z3 = z;
        } else {
            z3 = false;
            if (qxc0Var.h) {
                if (z2 && !z) {
                    z3 = true;
                }
            } else if (z2) {
                z3 = true;
            } else {
                Set set = s4b1.f;
                if (uic.x(str).c == blc0.g1) {
                    z3 = true;
                }
            }
        }
        if (!z3) {
            return null;
        }
        pn1 pn1Var = (pn1) this.b;
        boolean z4 = pn1Var.c;
        if (z && z4) {
            i = 2131960087;
        } else if (z) {
            i = 2131960086;
        } else {
            i = z4 ? 2131960075 : 2131960076;
        }
        return new jhm("aligned_curation_add_to", z ? klx.c : irx.c, (fhm) null, Integer.valueOf(i), (String) null, false, (tm81) null, new ihm(new ygm(1), z ? hhm.b : hhm.a, new ghm(im1.S0, new cl1(z, str, (byte) 1)), new c30(pn1Var, str, z, (byte) 2)), 244);
    }

    public String h(String str) {
        if (str.length() == 0) {
            return "";
        }
        aai0 aai0Var = (aai0) this.b;
        Uri uri = Uri.parse(str);
        aai0Var.getClass();
        return aai0.b(uri).toString();
    }

    public fg0 i(o1p1 o1p1Var, iu30 iu30Var, iu30 iu30Var2) {
        return new fl1(((ch0) this.b).a0(new dh0(iu30Var2, (byte) 0), o1p1Var), (byte) 3);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        switch (this.a) {
            case 16:
                singleEmitter.onSuccess(new fb4(((Boolean) Single.create(new cp5((hb4) this.b, (byte) 14)).blockingGet()).booleanValue()));
                break;
            case 20:
                singleEmitter.onSuccess(new r15(((Boolean) Single.create(new cp5((t15) this.b, (byte) 18)).blockingGet()).booleanValue()));
                break;
            default:
                m26 m26Var = (m26) this.b;
                luk lukVar = m26Var.r;
                if (lukVar == null || !lukVar.i("apps-music-libs-eventsender.max_batch_bytes")) {
                    lukVar = m26Var.s;
                }
                if (lukVar != null) {
                    lukVar.e(new k26(singleEmitter, m26Var, (byte) 6));
                }
                break;
        }
    }

    public /* synthetic */ a42(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public a42(Function0 function0, fg8 fg8Var) {
        this.a = (byte) 29;
        this.b = function0;
    }

    public /* synthetic */ a42() {
        this.a = (byte) 18;
    }

    public Object apply(Object obj, Object obj2) {
        return new z310(Collections.singletonList(dn3.c(((d74) this.b).b, (Map) obj, ((z310) obj2).a, false, 28)), (f410) null, (m510) null, (String) null);
    }
}
