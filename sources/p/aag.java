package p;

import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsContextTrack;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlay;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsProvidedTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aag extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gag d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aag(gag gagVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = gagVar;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gag gagVar = this.d;
        String str = this.c;
        switch (b) {
            case 0:
                return new aag(gagVar, str, lnmVar);
            case 1:
                return new aag((byte) 1, str, gagVar, lnmVar);
            default:
                return new aag((byte) 2, str, gagVar, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        EsContextTrack.ContextTrack contextTrackO;
        Single singleD;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        gag gagVar = this.d;
        String str = this.c;
        String uri = null;
        switch (b) {
            case 0:
                jn7 jn7Var = gagVar.c;
                byte b2 = this.b;
                try {
                    if (b2 == 0) {
                        hm5.M(obj);
                        dkm dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
                        this.b = (byte) 1;
                        obj = b5p1.i(dkmVarE, this);
                        if (obj == rih1Var2) {
                        }
                        return rih1Var2;
                    }
                    if (b2 != 1) {
                        if (b2 == 2) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    EsContextPlayerState.ContextPlayerState contextPlayerState = (EsContextPlayerState.ContextPlayerState) obj;
                    if (contextPlayerState.z()) {
                        if (str.equals(contextPlayerState.s())) {
                            return rih1Var;
                        }
                        EsProvidedTrack.ProvidedTrack providedTrackS = contextPlayerState.S();
                        if (providedTrackS != null && (contextTrackO = providedTrackS.o()) != null) {
                            uri = contextTrackO.getUri();
                        }
                        if (str.equals(uri)) {
                            return rih1Var;
                        }
                    }
                    upz upzVarN = EsPlay.PlayRequest.n();
                    jqz jqzVarN = EsPreparePlay.PreparePlayRequest.n();
                    cmz cmzVarP = EsContext.Context.p();
                    cmzVarP.t(str);
                    cmzVarP.u("context://".concat(str));
                    jqzVarN.n(cmzVarP.build());
                    zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                    zpzVarY.s("chromeless-webview");
                    zpzVarY.w(str);
                    zpzVarY.u("chromeless-webview");
                    jqzVarN.r(zpzVarY.build());
                    lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                    lqzVarS.s(true);
                    jqzVarN.q(lqzVarS.build());
                    upzVarN.r(jqzVarN.build());
                    wpz wpzVarO = EsPlayOptions.PlayOptions.o();
                    wpzVarO.q();
                    wpzVarO.s();
                    upzVarN.q(wpzVarO.build());
                    upzVarN.n(EsLoggingParams.LoggingParams.p());
                    EsPlay.PlayRequest playRequestBuild = upzVarN.build();
                    this.b = (byte) 2;
                    if (jn7Var.U(playRequestBuild, this) != rih1Var2) {
                        return rih1Var;
                    }
                    return rih1Var2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    return rih1Var;
                }
            case 1:
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        Set set = gag.z;
                        v9g v9gVarO = syo1.o(str);
                        if (v9gVarO == v9g.c) {
                            Completable completableA = sd41.a(gagVar.f, str, (tv80) null, 6);
                            this.b = (byte) 1;
                            if (fc11.i(completableA, this) == rih1Var2) {
                                rih1Var = rih1Var2;
                            }
                        } else if (v9gVarO == v9g.d) {
                            Completable completableD = gagVar.g.d(str, (tv80) null, false);
                            this.b = (byte) 2;
                            if (fc11.i(completableD, this) == rih1Var2) {
                                rih1Var = rih1Var2;
                            }
                        } else if (syo1.y(str)) {
                            jn7 jn7Var2 = gagVar.d;
                            c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
                            c0hVarQ.r(str);
                            CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequestBuild = c0hVarQ.build();
                            this.b = (byte) 3;
                            if (jn7Var2.d0(collectionAddRemoveItemsRequestBuild, this) == rih1Var2) {
                                rih1Var = rih1Var2;
                            }
                        } else {
                            Completable completableE = oj3.e(gagVar.e, Collections.singletonList(str), "spotify:genui:chromeless", "spotify:genui:chromeless");
                            this.b = (byte) 4;
                            if (fc11.i(completableE, this) == rih1Var2) {
                                rih1Var = rih1Var2;
                            }
                        }
                    } else {
                        if (b3 != 1 && b3 != 2 && b3 != 3 && b3 != 4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                    return rih1Var;
                }
            default:
                byte b4 = this.b;
                try {
                    if (b4 != 0) {
                        if (b4 == 1 || b4 == 2 || b4 == 3) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    Set set2 = gag.z;
                    int iOrdinal = syo1.o(str).ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        singleD = oj3.d(gagVar.e, Collections.singletonList(str), "spotify:genui:chromeless", "spotify:genui:chromeless", false);
                        this.b = (byte) 3;
                        if (fc11.j(singleD, this) != rih1Var2) {
                            return rih1Var;
                        }
                    } else if (iOrdinal == 2) {
                        Completable completableB = sd41.b(gagVar.f, str, (tv80) null, 6);
                        this.b = (byte) 1;
                        if (fc11.i(completableB, this) != rih1Var2) {
                            return rih1Var;
                        }
                    } else if (iOrdinal == 3) {
                        Completable completableD2 = gagVar.g.d(str, (tv80) null, true);
                        this.b = (byte) 2;
                        if (fc11.i(completableD2, this) != rih1Var2) {
                            return rih1Var;
                        }
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        singleD = oj3.d(gagVar.e, Collections.singletonList(str), "spotify:genui:chromeless", "spotify:genui:chromeless", false);
                        this.b = (byte) 3;
                        if (fc11.j(singleD, this) != rih1Var2) {
                            return rih1Var;
                        }
                    }
                    return rih1Var2;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception unused3) {
                    return rih1Var;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aag(byte b, String str, gag gagVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = str;
        this.d = gagVar;
    }
}
