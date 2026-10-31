package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e4b1 implements e670, qiw, Function, fyf, Function3, xi7, Producer, SingleOnSubscribe, Function6 {
    public static final bx8 c = new bx8((byte) 15);
    public final /* synthetic */ byte a;
    public final Object b;

    public e4b1() {
        this.a = (byte) 0;
        this.b = new rm5(s570.class, rm5.t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(UUID uuid, long j, onm onmVar) {
        v85 v85Var;
        if (onmVar instanceof v85) {
            v85Var = (v85) onmVar;
            int i = v85Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v85Var.c = i - Integer.MIN_VALUE;
            } else {
                v85Var = new v85(this, onmVar);
            }
        } else {
            v85Var = new v85(this, onmVar);
        }
        Object objO = v85Var.a;
        int i2 = v85Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            hi2 hi2Var = new hi2(this, uuid, (lnm) null, (byte) 24);
            v85Var.c = 1;
            objO = rc2.O(j, hi2Var, v85Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        iy10 iy10Var = (iy10) objO;
        return iy10Var == null ? hy10.a : iy10Var;
    }

    public Object apply(Object obj) {
        Observable observableJust;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                return !((Boolean) obj).booleanValue() ? Observable.empty() : ((vbd1) ((yu) obj2).a.get()).a;
            case 5:
                return new d1f0(((u11) obj2).j.n, new m231((Throwable) obj));
            case 6:
                return Single.fromCallable(new e71((j71) obj2, (hwe0) obj, (byte) 0));
            case 7:
                return new r401(((g401) obj2).a, (Throwable) obj);
            case 13:
                return ((bl3) obj2).h(nk3.b, cl3.c);
            case 16:
                return Single.create(new t4d1((o84) obj2, (byte) 12));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ch90 ch90Var = (hi90) obj;
                List listD1 = o7h.d1(ch90Var.e, 4);
                List listD2 = o7h.d1(ch90Var.f, 4);
                List listD3 = o7h.d1(ch90Var.g, 4);
                List listD4 = o7h.d1(ch90Var.h, 4);
                return ((sjj0) ((t4d1) obj2).b).a(o7h.N0(listD4, o7h.N0(listD2, o7h.N0(listD1, listD3)))).map(new yu3((Object) ch90Var, (Object) listD1, (Object) listD2, (Object) listD4, (byte) 7));
            case 25:
                djo djoVar = (djo) obj;
                xb7 xb7Var = (xb7) obj2;
                xb7Var.P0 = djoVar;
                x0p x0pVar = (x0p) xb7Var.i.a.c;
                luk lukVar = (luk) x0pVar.b.A.get();
                c8o.l(lukVar);
                qdy0 qdy0Var = new qdy0(new pl4(lukVar));
                yvd yvdVar = (yvd) x0pVar.k.get();
                ub7 ub7Var = x0pVar.b;
                p241 p241Var = (o241) ub7Var.n.get();
                c8o.l(p241Var);
                xvo xvoVar = (xvo) ub7Var.r.get();
                c8o.l(xvoVar);
                rg7 rg7Var = (rg7) x0pVar.e.get();
                zx11 zx11Var = (zx11) x0pVar.p.get();
                Flowable flowable = (Flowable) ub7Var.z.get();
                c8o.l(flowable);
                ec7 ec7Var = (ec7) x0pVar.n.get();
                yh2 yh2Var = (yh2) ub7Var.H.get();
                c8o.l(yh2Var);
                zr00 zr00Var = (zr00) ub7Var.F.get();
                c8o.l(zr00Var);
                ux3 ux3Var = (ux3) ub7Var.v.get();
                c8o.l(ux3Var);
                sx3 sx3Var = (sx3) ub7Var.t.get();
                c8o.l(sx3Var);
                qns0 qns0Var = (qns0) ub7Var.u.get();
                c8o.l(qns0Var);
                y87 y87Var = new y87(qdy0Var, yvdVar, p241Var, xvoVar, rg7Var, zx11Var, flowable, ec7Var, yh2Var, zr00Var, ux3Var, sx3Var, qns0Var, djoVar);
                xb7Var.O0 = y87Var;
                Bundle bundle = xb7Var.N0;
                if (bundle != null) {
                    y87Var.a(bundle);
                }
                Observable map = xvoVar.a(true).map(v560.h);
                Observable observable = p241Var.a;
                Observable observablePublish = Observable.combineLatest(map, observable, qz70.h).distinctUntilChanged().switchMap(new ymm0(y87Var, (byte) 23)).publish(new w4b1(y87Var, (byte) 29));
                ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(flowable.J(b6j0.g).t(Functions.a));
                Observable observableI = yoi1.i(hu20.e(ec7Var.e, new qt((lnm) null, ec7Var, (byte) 15)), o6xVar);
                Observable observableI2 = yoi1.i(zr00Var.a, o6xVar);
                Observable observableDistinctUntilChanged = yh2Var.a().distinctUntilChanged();
                Observable observableDistinctUntilChanged2 = observable.map(fmv.h).distinctUntilChanged();
                if (ux3Var.a()) {
                    observableJust = yoi1.i(ux3Var.b(), o6xVar);
                } else {
                    observableJust = Observable.just(Boolean.FALSE);
                    observableJust.getClass();
                }
                return Observable.combineLatest(observablePublish, observableFromPublisher, observableI, observableI2, observableDistinctUntilChanged, observableDistinctUntilChanged2, observableJust, new t7o0(y87Var, (byte) 24));
            case 27:
                return yoi1.h(((u961) obj2).B((PlayerState) obj), o6xVar);
            case 28:
                return new CompletableFromAction(new xe8((dma1) obj, (ye8) obj2, (byte) 0));
            default:
                Throwable th = (Throwable) obj;
                try {
                    ((zwe0) obj2).b.e.invoke();
                    break;
                } catch (Throwable unused) {
                }
                return new rxe0(kto1.E(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(UUID uuid, onm onmVar) {
        x85 x85Var;
        if (onmVar instanceof x85) {
            x85Var = (x85) onmVar;
            int i = x85Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x85Var.c = i - Integer.MIN_VALUE;
            } else {
                x85Var = new x85(this, onmVar);
            }
        } else {
            x85Var = new x85(this, onmVar);
        }
        Object obj = x85Var.a;
        int i2 = x85Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            pzc pzcVar = (pzc) bzn1.q(uuid, (awl1) this.b).b;
            x85Var.c = 1;
            Object objN = w0h1.n(pzcVar, x85Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Map map = (Map) obj2;
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        ktl ktlVar = (ktl) obj4;
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj6).booleanValue();
        ys4 ys4Var = (ys4) this.b;
        eu4 eu4Var = ys4Var.m;
        return new ghh0(zBooleanValue, map, eu4Var.m(), eu4Var.a(), zBooleanValue2, ktlVar, ys4Var.l.b && zBooleanValue4, zBooleanValue3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(diq0 diq0Var, onm onmVar) {
        y85 y85Var;
        if (onmVar instanceof y85) {
            y85Var = (y85) onmVar;
            int i = y85Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y85Var.c = i - Integer.MIN_VALUE;
            } else {
                y85Var = new y85(this, onmVar);
            }
        } else {
            y85Var = new y85(this, onmVar);
        }
        Object obj = y85Var.a;
        int i2 = y85Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            pzc pzcVar = (pzc) ((awl1) this.b).a(diq0Var).b;
            y85Var.c = 1;
            Object objN = w0h1.n(pzcVar, y85Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(tzl1 tzl1Var, onm onmVar) {
        st7 st7Var;
        if (onmVar instanceof st7) {
            st7Var = (st7) onmVar;
            int i = st7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                st7Var.d = i - Integer.MIN_VALUE;
            } else {
                st7Var = new st7(this, onmVar);
            }
        } else {
            st7Var = new st7(this, onmVar);
        }
        Object objC = st7Var.b;
        int i2 = st7Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                xaz0 xaz0Var = (xaz0) this.b;
                String str = tzl1Var.a;
                st7Var.a = tzl1Var;
                st7Var.d = 1;
                objC = xaz0Var.c(str, st7Var);
                Object obj = d9n.a;
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tzl1Var = st7Var.a;
                hm5.M(objC);
            }
            return new k1m1(tzl1Var.b, (byte[]) objC);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            teo teoVarA = ueo.a(e2, 6);
            String message = e2.getMessage();
            if (message == null) {
                message = "Download failed";
            }
            return new l1m1(teoVarA.a, message, teoVarA.b, tzl1Var.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(UUID uuid, onm onmVar) {
        z85 z85Var;
        if (onmVar instanceof z85) {
            z85Var = (z85) onmVar;
            int i = z85Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z85Var.c = i - Integer.MIN_VALUE;
            } else {
                z85Var = new z85(this, onmVar);
            }
        } else {
            z85Var = new z85(this, onmVar);
        }
        Object objI = z85Var.a;
        int i2 = z85Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarN = w361.n(((awl1) this.b).c.A(), uuid);
            z85Var.c = 1;
            objI = b5p1.i(mr20VarN, z85Var);
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
        xvl1 xvl1Var = (xvl1) objI;
        if (xvl1Var != null) {
            return myo1.v(xvl1Var);
        }
        return null;
    }

    public void g() {
        dg30 dg30Var = (dg30) this.b;
        Logger.g(l1d.m("Finishing ", dg30Var.getLocalClassName()), new Object[0]);
        dg30Var.finish();
    }

    public Object get() {
        return new SchedulerWorkRunner(((ks3) this.b).b);
    }

    public int h(y570 y570Var) {
        return ((Integer) ((rm5) this.b).G(y570Var.h().b()).i(c).e(0)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum i(UUID uuid, onm onmVar) {
        a95 a95Var;
        if (onmVar instanceof a95) {
            a95Var = (a95) onmVar;
            int i = a95Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a95Var.c = i - Integer.MIN_VALUE;
            } else {
                a95Var = new a95(this, onmVar);
            }
        } else {
            a95Var = new a95(this, onmVar);
        }
        Object objI = a95Var.a;
        int i2 = a95Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarN = w361.n(((awl1) this.b).c.A(), uuid);
            a95Var.c = 1;
            objI = b5p1.i(mr20VarN, a95Var);
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
        xvl1 xvl1Var = (xvl1) objI;
        if (xvl1Var != null) {
            return xvl1Var.b;
        }
        return null;
    }

    public Single l(Intent intent, th61 th61Var) {
        b72 b72Var = (b72) this.b;
        return ((g341) b72Var.b).b(Uri.parse((String) b72Var.c)).map(v560.d);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((View) this.b).isShown() && ((Boolean) obj).booleanValue() && ((Float) obj2).floatValue() >= 0.67f && ((w8c0) obj3).a(w8c0.e));
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                f44 f44Var = (f44) obj;
                luk lukVar = f44Var.b;
                if (lukVar == null || !lukVar.i("android-address.show_address_settings_item")) {
                    lukVar = f44Var.c;
                }
                if (lukVar != null) {
                    lukVar.e(new e44(singleEmitter, f44Var, (byte) 0));
                }
                break;
            case 16:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.retry_db_operations")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 13));
                }
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                eh4 eh4Var = (eh4) obj;
                luk lukVar3 = eh4Var.l;
                if (lukVar3 == null || !lukVar3.i("android-feature-nowplaying-queue-bottom-sheet.enable_mft_plus_queue")) {
                    lukVar3 = eh4Var.m;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new dh4(singleEmitter, eh4Var, (byte) 0));
                }
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                singleEmitter.onSuccess(new fk4(((Boolean) Single.create(new t4d1((hk4) obj, (byte) 14)).blockingGet()).booleanValue()));
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ax4 ax4Var = (ax4) obj;
                luk lukVar4 = ax4Var.q;
                if (lukVar4 == null || !lukVar4.i("android-perf-tracking.jank_coordinator_enabled")) {
                    lukVar4 = ax4Var.r;
                }
                if (lukVar4 != null) {
                    lukVar4.e(new zw4(singleEmitter, ax4Var, (byte) 0));
                }
                break;
            case 22:
                c26 c26Var = (c26) obj;
                luk lukVar5 = c26Var.d;
                if (lukVar5 == null || !lukVar5.i("apps-music-features-remoteconfiguration.button_color")) {
                    lukVar5 = c26Var.e;
                }
                if (lukVar5 != null) {
                    lukVar5.e(new p54(singleEmitter, c26Var, (byte) 11));
                }
                break;
        }
    }

    public void v(Object obj) {
        ((EncoreTextView) ((ajq0) ((sp) this.b).b).c).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }

    public /* synthetic */ e4b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public e4b1(Context context) {
        this.a = (byte) 21;
        this.b = awl1.d(context);
    }
}
