package p;

import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jpa0 implements Function, FlowableOnSubscribe, SingleTransformer, f420, Predicate {
    public final /* synthetic */ byte a;
    public Object b;

    public jpa0(byte b) {
        this.a = b;
        switch (b) {
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.b = new LinkedHashMap();
                break;
            default:
                this.b = (ExtraCroppingQuirk) vvt.a.m(ExtraCroppingQuirk.class);
                break;
        }
    }

    public void a(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Object objH = linkedHashMap.get(lowerCase);
        if (objH == null) {
            objH = cfm0.h(lowerCase, linkedHashMap);
        }
        ((List) objH).add(str2);
    }

    public Object apply(Object obj) {
        boolean z = true;
        Boolean boolValueOf = null;
        switch (this.a) {
            case 1:
                p0b0 p0b0Var = (p0b0) ((spq0) obj).h();
                if (p0b0Var == null) {
                    p0b0Var = (p0b0) this.b;
                }
                return new l941(wza0.c(p0b0Var));
            case 2:
                gdb0 gdb0Var = (gdb0) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    Observable observableJust = Observable.just(ldb0.a);
                    observableJust.getClass();
                    return observableJust;
                }
                if (gdb0Var.t.isEmpty()) {
                    kp00 kp00Var = gdb0Var.b;
                    return Single.zip(((x89) ((ps7) kp00Var.b).b).a().map(bya0.X).onErrorReturn(stf0.O0), ((odi1) ((o2b1) kp00Var.c).b).b().map(r3x0.W0).onErrorReturn(u3x0.W0), aj20.d).onErrorReturn(bj20.d).subscribeOn(gdb0Var.e).map(a020.i).toObservable().startWithItem(kdb0.a);
                }
                Observable observableJust2 = Observable.just(new idb0(gdb0Var.t));
                observableJust2.getClass();
                return observableJust2;
            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 25:
            default:
                o4o0 o4o0Var = (o4o0) this.b;
                int iIntValue = ((Integer) obj).intValue();
                q2o0 q2o0Var = o4o0Var.f;
                if (q2o0Var != null) {
                    boolean zBooleanValue = ((Boolean) q2o0Var.invoke()).booleanValue();
                    if (iIntValue != 0 && !zBooleanValue) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
            case 4:
                q3c0 q3c0Var = (q3c0) this.b;
                String strP = q3c0Var.g.s().p();
                q3c0Var.f.getClass();
                Observable observable = ((String) q5y.a().get(strP)) != null ? rqt0.F(q3c0Var.m, new n3c0(q3c0Var, (lnm) null, (byte) 0)).toObservable() : Observable.just(Boolean.TRUE);
                observable.getClass();
                return Observable.combineLatest(q3c0Var.d.a.map(b610.i), observable, new fey((Object) q3c0Var, (byte) 29));
            case 7:
                return new mmr0((qsn) this.b, (py21) obj);
            case 8:
                return Long.valueOf((((Long) obj).longValue() * 1000) + ((Long) this.b).longValue());
            case 10:
                return rqt0.F(o6x.a, new p6d0((ak1) this.b, (lnm) null, (byte) 7)).onErrorReturn(va20.t);
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    qx qxVar = (qx) ((dg90) this.b).b;
                    return qxVar.a.a.h(SubValuesRequest.o()).map(kuw0.b).publish(new yo31(qxVar, (byte) 3)).map(fmv.b).compose(qxVar.c);
                }
                Observable observableJust3 = Observable.just(gg11.g);
                observableJust3.getClass();
                return observableJust3;
            case 14:
                PlayerState playerState = (PlayerState) obj;
                return new tif0((ContextTrack) playerState.track().b(), (String) playerState.playbackId().e("absent"), ((sm4) ((ekf0) this.b).a.get()).a());
            case 15:
                ((nxf0) this.b).a(new vp80(2, ""));
                return new ss21(ns21.a);
            case 20:
                return new dli0(!((nki0) this.b).c);
            case 21:
                pzi0 pzi0Var = (pzi0) this.b;
                String str = ((ro3) obj).d;
                pd80 pd80Var = pzi0Var.a;
                lik1 lik1Var = pzi0Var.b;
                return pd80.b(pd80Var, str, lik1Var.a, new DynamicTagsMetadata(lik1Var.a, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), 8).toObservable().map(new ozi0(str)).onErrorReturnItem(z6x.a);
            case 23:
                tfm0 tfm0Var = (tfm0) obj;
                return Flowable.I(tfm0Var.a).r(tfm0Var.b != 0 ? 100L : 0L, (Scheduler) ((r24) this.b).e);
            case 24:
                return ((Boolean) obj).booleanValue() ? ((uym0) this.b).b.J(mi10.Q0) : Flowable.I(new rym0(false, new fvf1(0L, 0L)));
            case 26:
                return new CompletableFromAction(new r1o0((t1o0) this.b, (Integer) obj, (byte) 0));
        }
    }

    public w7o0 b() {
        return new w7o0(sqg0.U((LinkedHashMap) this.b));
    }

    public Single c(Single single) {
        qig0 qig0Var = (qig0) this.b;
        l6s l6sVar = qig0Var.d;
        return ((q1o0) l6sVar.a).a().doOnSuccess(new ecs(l6sVar, (byte) 2)).ignoreElement().e(single).flatMap(new z8c0(qig0Var, (byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(String str, onm onmVar) {
        x0e0 x0e0Var;
        if (onmVar instanceof x0e0) {
            x0e0Var = (x0e0) onmVar;
            int i = x0e0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                x0e0Var.c = i - os00.INVALID_ID;
            } else {
                x0e0Var = new x0e0(this, onmVar);
            }
        } else {
            x0e0Var = new x0e0(this, onmVar);
        }
        Object objB = x0e0Var.a;
        int i2 = x0e0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            r7b r7bVar = (r7b) this.b;
            x0e0Var.c = 1;
            objB = r7bVar.b(str, x0e0Var);
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
        b8b b8bVar = (b8b) objB;
        ArrayList arrayList = b8bVar.d;
        ArrayList<z7b> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof z7b) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (z7b z7bVar : arrayList2) {
            arrayList3.add(new y4g0(UUID.randomUUID().toString(), z7bVar.d, z7bVar.e, z7bVar.f, true, false, false));
        }
        ArrayList arrayList4 = b8bVar.d;
        ArrayList<a8b> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (obj2 instanceof a8b) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        for (a8b a8bVar : arrayList5) {
            arrayList6.add(new f7g0(UUID.randomUUID().toString(), a8bVar.d, a8bVar.e, a8bVar.f, a8bVar.h, a8bVar.g, a8bVar.i, a8bVar.j, true, a8bVar.k, false, false));
        }
        return new w0e0(b8bVar.a, arrayList3, arrayList6);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r6 == r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.p5e0
            if (r0 == 0) goto L13
            r0 = r6
            p.p5e0 r0 = (p.p5e0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.p5e0 r0 = new p.p5e0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L52
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L45
        L35:
            p.hm5.M(r6)
            java.lang.Object r5 = r5.b
            p.p3t r5 = (p.p3t) r5
            r0.c = r3
            java.lang.Object r6 = p.b5p1.k(r5, r0)
            if (r6 != r4) goto L45
            goto L51
        L45:
            p.nw80 r6 = (p.nw80) r6
            if (r6 == 0) goto L56
            r0.c = r2
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r4) goto L52
        L51:
            return r4
        L52:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L58
        L56:
            p.z6x r6 = p.z6x.a
        L58:
            p.jt81 r5 = new p.jt81
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jpa0.e(p.onm):java.lang.Object");
    }

    public boolean f(int i) {
        if (i < 0) {
            return false;
        }
        mgc mgcVar = (mgc) this.b;
        if (i >= mgcVar.b) {
            return false;
        }
        g890 g890VarQ = mgcVar.q(i);
        iu30 iu30Var = ((nub0) g890VarQ.c).c;
        return iu30Var != null && iu30Var.invoke(Integer.valueOf(i - g890VarQ.a)) == jcx0.Q0;
    }

    public m420 j(l420 l420Var) {
        return ((oi) this.b).j(l420Var);
    }

    public l420 k(String str) {
        return ((oi) this.b).k(str);
    }

    public r420 l(l420 l420Var) {
        return ((oi) this.b).l(l420Var);
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        ek2 ek2Var = new ek2(flowableEmitter, (byte) 10);
        x8c0 x8c0Var = (x8c0) this.b;
        flowableEmitter.onNext(x8c0Var.b());
        x8c0Var.a(ek2Var);
        flowableEmitter.setCancellable(new pc6(x8c0Var, ek2Var, (byte) 9));
    }

    public boolean test(Object obj) {
        return ((Map) ((bjx) this.b).c).containsKey((NowPlayingMiniMode) obj);
    }

    public /* synthetic */ jpa0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ jpa0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }
}
