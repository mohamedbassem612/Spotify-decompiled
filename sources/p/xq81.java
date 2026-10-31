package p;

import android.net.Uri;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsSignalRequest;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.timesyncedtext.v1.GetTimeSyncedTextResponse;
import com.spotify.usersnearby.v1.AddUserRequest;
import com.spotify.usersnearby.v1.AddUserResponse;
import com.spotify.usersnearby.v1.CheckinRequest;
import com.spotify.usersnearby.v1.CreateSessionRequest;
import com.spotify.usersnearby.v1.CreateSessionResponse;
import com.spotify.usersnearby.v1.DismissUsersRequest;
import com.spotify.usersnearby.v1.ResolveTokenRequest;
import com.spotify.usersnearby.v1.ResolveTokenResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xq81 implements Function, hj71, k1q0, l6u0, ya, ix30, ksi0, BiFunction, sh, qiw {
    public final /* synthetic */ byte a;
    public final Object b;

    public xq81(long[] jArr) {
        ldn0 ldn0Var;
        this.a = (byte) 3;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            ldn0Var = new ldn0(jArrCopyOf.length);
            int i = ldn0Var.b;
            if (i < 0) {
                eqr0.O("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                ldn0Var.c(jArrCopyOf.length + i);
                long[] jArr2 = ldn0Var.a;
                int i2 = ldn0Var.b;
                if (i != i2) {
                    f46.T(jArr2, jArr2, jArrCopyOf.length + i, i, i2);
                }
                f46.Y(jArrCopyOf, jArr2, i);
                ldn0Var.b += jArrCopyOf.length;
            }
        } else {
            ldn0Var = new ldn0();
        }
        this.b = ldn0Var;
    }

    public void a(eqh1 eqh1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(24285038);
        int i2 = i | (x340Var.i(eqh1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b(eqh1Var, function0, function1, x340Var, i2 & 8190);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gqh1(this, eqh1Var, function0, function1, i, (byte) 0);
        }
    }

    public boolean accept(Object obj) {
        ((vjc1) this.b).getClass();
        return false;
    }

    public Object apply(Object obj) {
        uz21 uz21Var;
        Single singleJust;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
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
            case 1:
                zuc0 zuc0Var = (zuc0) obj;
                ji91 ji91Var = (ji91) obj2;
                jo91 jo91Var = ji91Var.e;
                String str = ji91Var.a;
                ip91 ip91Var = ji91Var.c;
                return ((t35) jo91Var.a.get()).i() ? ji91Var.d.J(new lfb(ji91Var, (byte) 25)).t(Functions.a).x(new ke71(ji91Var, zuc0Var, (byte) 24)).z().ignoreElement().c(ip91Var.h(str, zuc0Var.a, zuc0Var.c, "tap")).o(Functions.h) : ip91Var.h(str, zuc0Var.a, zuc0Var.c, "tap").o(Functions.h);
            case 2:
                ip91 ip91Var2 = (ip91) obj2;
                ujm ujmVar = (ujm) ip91Var2.q.getValue();
                srz srzVarN = EsSignalRequest.SignalRequest.n();
                srzVarN.r("minus");
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(ip91Var2.a.b());
                cozVarR.s(qpzVarP.build());
                srzVarN.n(cozVarR.build());
                Completable completableIgnoreElement = ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", srzVarN.build()).map(xbp1.S0).doOnSuccess(new z0u0(ip91Var2, (jdu0) obj, (byte) 17)).doOnError(w841.b1).ignoreElement();
                completableIgnoreElement.getClass();
                return completableIgnoreElement.o(Functions.h);
            case 4:
                return new g4a1(((p2a1) obj2).a, false);
            case 9:
                String str2 = ((nz01) obj).a;
                return str2.length() == 0 ? Observable.just(new f011("PreviewId is empty")) : new CompletableFromAction(new dkb1((fjp0) obj2, str2, (byte) 0)).x(g011.a).onErrorReturn(wdx0.P0).toObservable();
            case 14:
                v491 v491Var = (v491) obj2;
                return v491.h(v491Var, v491Var.a.j((List) obj), (LinkedHashSet) null, 6);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((lih1) obj2).c((CollectionGetUnplayedEpisodesResponse) obj);
            default:
                String str3 = (String) obj;
                hce1 hce1Var = (hce1) obj2;
                HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) hce1Var.b;
                Observable observableO = m5n1.o(headphoneFilterStateDatabase.u().a, new String[]{"BluetoothHeadphoneFilterStateEntity"}, new nb9(str3, (byte) 21));
                Scheduler scheduler = (Scheduler) hce1Var.e;
                return Observable.combineLatest(observableO.subscribeOn(scheduler), m5n1.o(headphoneFilterStateDatabase.v().a, new String[]{"WiredHeadphoneFilterStateEntity"}, new bek1(str3, (byte) 8)).subscribeOn(scheduler), new ezb1(hce1Var, (byte) 17));
        }
    }

    public void b(eqh1 eqh1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        xq81 xq81Var;
        jrl0 jrl0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1056726828);
        int i2 = i | (x340Var.i(eqh1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new jrl0();
                x340Var.s0(objT);
            }
            jrl0 jrl0Var2 = (jrl0) objT;
            boolean zI = x340Var.i(this) | x340Var.i(jrl0Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new kwb1(this, jrl0Var2, (lnm) null, (byte) 20);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            String strO0 = cwl1.o0(x340Var, 2131954754);
            String strO1 = cwl1.o0(x340Var, 2131954755);
            String strO2 = cwl1.o0(x340Var, eqh1Var.a());
            int i3 = i2 & 896;
            boolean zI2 = x340Var.i(eqh1Var) | x340Var.i(jrl0Var2) | x340Var.i(this) | (i3 == 256) | ((i2 & 112) == 32);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                jrl0Var = jrl0Var2;
                kbp0 kbp0Var = new kbp0(eqh1Var, jrl0Var, this, function1, function0, (byte) 19);
                xq81Var = this;
                x340Var.s0(kbp0Var);
                objT3 = kbp0Var;
            } else {
                jrl0Var = jrl0Var2;
                xq81Var = this;
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT3));
            String strO3 = cwl1.o0(x340Var, 2131954758);
            boolean zI3 = x340Var.i(xq81Var) | x340Var.i(jrl0Var) | (i3 == 256);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new o8e1(xq81Var, jrl0Var, function1, (byte) 14);
                x340Var.s0(objT4);
            }
            mqo1.d(function1, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT4)), x340Var, ((i2 >> 6) & 14) | 2359296, 6);
        } else {
            xq81Var = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gqh1(xq81Var, eqh1Var, function0, function1, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(qgw qgwVar, onm onmVar) {
        kvg1 kvg1Var;
        if (onmVar instanceof kvg1) {
            kvg1Var = (kvg1) onmVar;
            int i = kvg1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kvg1Var.d = i - Integer.MIN_VALUE;
            } else {
                kvg1Var = new kvg1(this, onmVar);
            }
        } else {
            kvg1Var = new kvg1(this, onmVar);
        }
        Object obj = kvg1Var.b;
        int i2 = kvg1Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzz jzzVar = kvg1Var.a;
            hm5.M(obj);
            return jzzVar;
        }
        hm5.M(obj);
        ol61 ol61Var = (ol61) this.b;
        Uri uri = qgwVar.b;
        String str = qgwVar.a;
        jzz jzzVar2 = jzz.a;
        kvg1Var.a = jzzVar2;
        kvg1Var.d = 1;
        ol61Var.a(uri, str, true);
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        return d9nVar == d9nVar2 ? d9nVar2 : jzzVar2;
    }

    public boolean d(msi0 msi0Var, ysi0 ysi0Var) {
        return false;
    }

    public void e(long j) {
        ((ldn0) this.b).a(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, String str2, String str3, onm onmVar) {
        iki1 iki1Var;
        uz21 uz21Var;
        if (onmVar instanceof iki1) {
            iki1Var = (iki1) onmVar;
            int i = iki1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iki1Var.c = i - Integer.MIN_VALUE;
            } else {
                iki1Var = new iki1(this, onmVar);
            }
        } else {
            iki1Var = new iki1(this, onmVar);
        }
        Object obj = iki1Var.a;
        int i2 = iki1Var.c;
        sz1 sz1Var = sz1.a;
        nz1 nz1VarO = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                dmi1 dmi1Var = (dmi1) this.b;
                pz1 pz1VarN = AddUserRequest.n();
                pz1VarN.n(str);
                pz1VarN.r(str2);
                pz1VarN.q(str3);
                AddUserRequest addUserRequest = (AddUserRequest) pz1VarN.build();
                iki1Var.c = 1;
                Object objE = dmi1Var.e(addUserRequest, iki1Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return qz1.a;
        } catch (HttpException e) {
            Logger.e(e, "addUser failed with status %d", new Object[]{new Integer(e.a)});
            try {
                sy21 sy21Var = e.c;
                if (sy21Var != null && (uz21Var = sy21Var.c) != null) {
                    nz1VarO = AddUserResponse.o(uz21Var.c()).n().o();
                }
            } catch (IOException e2) {
                Logger.e(e2, "addUser error body could not be read", new Object[0]);
            }
            return (nz1VarO == null ? -1 : nki1.a[nz1VarO.ordinal()]) == 1 ? rz1.a : sz1Var;
        } catch (IOException e3) {
            Logger.e(e3, "addUser failed", new Object[0]);
            return sz1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, onm onmVar) {
        jki1 jki1Var;
        if (onmVar instanceof jki1) {
            jki1Var = (jki1) onmVar;
            int i = jki1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jki1Var.c = i - Integer.MIN_VALUE;
            } else {
                jki1Var = new jki1(this, onmVar);
            }
        } else {
            jki1Var = new jki1(this, onmVar);
        }
        Object obj = jki1Var.a;
        int i2 = jki1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                dmi1 dmi1Var = (dmi1) this.b;
                pvf pvfVarN = CheckinRequest.n();
                pvfVarN.n(str);
                CheckinRequest checkinRequest = (CheckinRequest) pvfVarN.build();
                jki1Var.c = 1;
                Object objB = dmi1Var.b(checkinRequest, jki1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return ztf.a;
        } catch (IOException e) {
            Logger.e(e, "checkin failed", new Object[0]);
            return new wtf(e);
        } catch (HttpException e2) {
            int i3 = e2.a;
            Logger.e(e2, "checkin failed with status %d", new Object[]{new Integer(i3)});
            return new ytf(i3, e2.b);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            Logger.e(e4, "checkin failed", new Object[0]);
            return new wtf(e4);
        }
    }

    public void h(msi0 msi0Var) {
        a2f1 a2f1Var = (a2f1) this.b;
        boolean zN = a2f1Var.c.a.n();
        Window.Callback callback = a2f1Var.d;
        if (zN) {
            callback.onPanelClosed(108, msi0Var);
        } else if (callback.onPreparePanel(0, null, msi0Var)) {
            callback.onMenuOpened(108, msi0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, String str2, onm onmVar) {
        kki1 kki1Var;
        Long l;
        if (onmVar instanceof kki1) {
            kki1Var = (kki1) onmVar;
            int i = kki1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kki1Var.c = i - Integer.MIN_VALUE;
            } else {
                kki1Var = new kki1(this, onmVar);
            }
        } else {
            kki1Var = new kki1(this, onmVar);
        }
        Object objD = kki1Var.a;
        int i2 = kki1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                xqn xqnVarN = CreateSessionRequest.n();
                xqnVarN.q(str);
                xqnVarN.n(str2);
                CreateSessionRequest createSessionRequestBuild = xqnVarN.build();
                dmi1 dmi1Var = (dmi1) this.b;
                createSessionRequestBuild.getClass();
                kki1Var.c = 1;
                objD = dmi1Var.d(createSessionRequestBuild, kki1Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            CreateSessionResponse createSessionResponse = (CreateSessionResponse) objD;
            if (createSessionResponse.p().length() == 0) {
                Logger.d("createSession returned an empty token", new Object[0]);
                return brn.a;
            }
            String strP = createSessionResponse.p();
            if (createSessionResponse.q()) {
                Timestamp timestampN = createSessionResponse.n();
                l = new Long((timestampN.q() * 1000) + ((long) (timestampN.p() / 1000000)));
            } else {
                l = null;
            }
            Integer num = new Integer(createSessionResponse.o());
            return new arn(strP, l, num.intValue() > 0 ? num : null);
        } catch (IOException e) {
            Logger.e(e, "createSession failed", new Object[0]);
            return new zqn(e);
        } catch (HttpException e2) {
            int i3 = e2.a;
            Logger.e(e2, "createSession failed with status %d", new Object[]{new Integer(i3)});
            return new drn(i3, e2.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, onm onmVar) {
        lki1 lki1Var;
        if (onmVar instanceof lki1) {
            lki1Var = (lki1) onmVar;
            int i = lki1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lki1Var.c = i - Integer.MIN_VALUE;
            } else {
                lki1Var = new lki1(this, onmVar);
            }
        } else {
            lki1Var = new lki1(this, onmVar);
        }
        Object obj = lki1Var.a;
        int i2 = lki1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                dmi1 dmi1Var = (dmi1) this.b;
                qfu qfuVarN = DismissUsersRequest.n();
                qfuVarN.n(str);
                DismissUsersRequest dismissUsersRequest = (DismissUsersRequest) qfuVarN.build();
                lki1Var.c = 1;
                Object objC = dmi1Var.c(dismissUsersRequest, lki1Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "dismissUsers failed", new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object k(String str, long j, Long l, onm onmVar) {
        spe1 spe1Var;
        mwz0 m231Var;
        uz21 uz21Var;
        if (onmVar instanceof spe1) {
            spe1Var = (spe1) onmVar;
            int i = spe1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                spe1Var.f = i - Integer.MIN_VALUE;
            } else {
                spe1Var = new spe1(this, onmVar);
            }
        } else {
            spe1Var = new spe1(this, onmVar);
        }
        spe1 spe1Var2 = spe1Var;
        Object objA = spe1Var2.d;
        int i2 = spe1Var2.f;
        z6x z6xVar = z6x.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                tpe1 tpe1Var = (tpe1) this.b;
                spe1Var2.a = str;
                spe1Var2.b = l;
                spe1Var2.c = j;
                spe1Var2.f = 1;
                objA = tpe1Var.a(str, j, l, spe1Var2);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = spe1Var2.c;
                l = spe1Var2.b;
                str = spe1Var2.a;
                hm5.M(objA);
            }
            sy21 sy21Var = (sy21) objA;
            if (sy21Var.a.Q0 && (uz21Var = (uz21) sy21Var.b) != null) {
                GetTimeSyncedTextResponse getTimeSyncedTextResponseO = GetTimeSyncedTextResponse.o(uz21Var.c());
                getTimeSyncedTextResponseO.getClass();
                m231Var = cbp1.s(cbp1.q(getTimeSyncedTextResponseO), j, l);
            } else {
                m231Var = new mwz0(z6xVar);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        Logger.l(thA, l1d.m("Error while fetching time-synced text for entity: ", str), new Object[0]);
        return new mwz0(z6xVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(String str, onm onmVar) {
        mki1 mki1Var;
        iu21 m231Var;
        if (onmVar instanceof mki1) {
            mki1Var = (mki1) onmVar;
            int i = mki1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mki1Var.c = i - Integer.MIN_VALUE;
            } else {
                mki1Var = new mki1(this, onmVar);
            }
        } else {
            mki1Var = new mki1(this, onmVar);
        }
        Object objA = mki1Var.a;
        int i2 = mki1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                dmi1 dmi1Var = (dmi1) this.b;
                gu21 gu21VarN = ResolveTokenRequest.n();
                gu21VarN.n(str);
                ResolveTokenRequest resolveTokenRequest = (ResolveTokenRequest) gu21VarN.build();
                mki1Var.c = 1;
                objA = dmi1Var.a(resolveTokenRequest, mki1Var);
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
            ResolveTokenResponse resolveTokenResponse = (ResolveTokenResponse) objA;
            m231Var = resolveTokenResponse.o() ? new iu21(resolveTokenResponse.n().getUsername(), resolveTokenResponse.n().o()) : ju21.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        Logger.e(thA, "resolveToken failed", new Object[0]);
        return hu21.a;
    }

    public long[] m() {
        ldn0 ldn0Var = (ldn0) this.b;
        int i = ldn0Var.b;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = ldn0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, lnm lnmVar) {
        xea1 xea1Var;
        if (lnmVar instanceof xea1) {
            xea1Var = (xea1) lnmVar;
            int i = xea1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xea1Var.c = i - Integer.MIN_VALUE;
            } else {
                xea1Var = new xea1(this, (onm) lnmVar);
            }
        } else {
            xea1Var = new xea1(this, (onm) lnmVar);
        }
        Object objV = xea1Var.a;
        int i2 = xea1Var.c;
        if (i2 == 0) {
            hm5.M(objV);
            if (!k371Var.d.contains(yea1.a)) {
                eg.m("Cannot invoke SongDNA share entry point plugin without SongDNA signal. This indicates an error with the plugin configuration");
                return null;
            }
            wea1 wea1Var = (wea1) jhc1.t(k371Var.b, "song_dna.loader_type", wea1.class);
            if (wea1Var == null) {
                return null;
            }
            mxr mxrVar = (mxr) this.b;
            xea1Var.c = 1;
            objV = mxrVar.v(wea1Var, xea1Var);
            d9n d9nVar = d9n.a;
            if (objV == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objV);
        }
        return new qj71((List) objV, 0, puk.d);
    }

    public void onSuccess(Object obj) {
        ((k3d1) this.b).run();
    }

    public boolean r(View view) {
        ((qvs) this.b).invoke(fzf1.c);
        return true;
    }

    public void v(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        j5g1 j5g1Var = (j5g1) this.b;
        j5g1Var.t.setEnabled(zBooleanValue);
        j5g1Var.Z.setEnabled(zBooleanValue);
        j5g1Var.i.setEnabled(zBooleanValue);
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        ((ConstraintLayout) this.b).setPadding(0, hsl1Var.a.i(519).b, 0, 0);
        return hsl1.b;
    }

    public void onFailure(Throwable th) {
    }

    public xq81(g661 g661Var) {
        this.a = (byte) 28;
        this.b = new AtomicInteger(0);
    }

    public /* synthetic */ xq81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public Object apply(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Single.fromCallable(new wra((mtf1) obj3, (String) obj, (fvf1) obj2, (byte) 9));
            default:
                Boolean bool = (Boolean) obj;
                PlayerState playerState = (PlayerState) obj2;
                l0l l0lVarC = ((wlk1) obj3).a.c();
                if (l0lVarC != null ? l0lVarC.l() : true) {
                    z = (bool.booleanValue() || ((PlaybackQuality) playerState.playbackQuality().b()).bitrateLevel() == BitrateLevel.LOW) ? false : true;
                }
                return Boolean.valueOf(z);
        }
    }

    public void apply(long j) {
        rec1 rec1Var = (rec1) this.b;
        if (rec1Var.P0 != null) {
            rec1Var.Q0 = j;
            rec1Var.T(j, rec1Var.c.b());
        }
    }
}
