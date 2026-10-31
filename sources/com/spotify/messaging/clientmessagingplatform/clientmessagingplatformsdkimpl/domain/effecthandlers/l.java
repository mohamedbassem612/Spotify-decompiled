package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageListRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageListResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import p.akc;
import p.djc;
import p.dma1;
import p.flc;
import p.jlc;
import p.l1d;
import p.lag;
import p.m321;
import p.n321;
import p.oz10;
import p.skc;
import p.upn1;
import p.wic;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l {
    public final lag a;
    public final oz10 b;
    public final dma1 c;
    public final wic d;

    public l(lag lagVar, oz10 oz10Var, dma1 dma1Var, wic wicVar) {
        this.a = lagVar;
        this.b = oz10Var;
        this.c = dma1Var;
        this.d = wicVar;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchRemoteMessagesEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(Observable<akc> observable) {
                final l lVar = this.this$0;
                return observable.switchMapSingle(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchRemoteMessagesEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final SingleSource<? extends jlc> apply(akc akcVar) {
                        boolean zH = lVar.c.h(djc.a, false);
                        l lVar2 = lVar;
                        if (zH) {
                            wic wicVar = lVar2.d;
                            CacheState cacheState = CacheState.LOADED;
                            wicVar.a.onNext(cacheState);
                            Single<T> singleFirstOrError = Observable.just(new skc(cacheState)).firstOrError();
                            singleFirstOrError.getClass();
                            return singleFirstOrError;
                        }
                        Single singleG = lVar2.a.g(new FetchMessageListRequest(upn1.m()));
                        final l lVar3 = lVar;
                        Single<R> map = singleG.map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchRemoteMessagesEffectHandlerImpl.transformer.1.1.1
                            @Override // io.reactivex.rxjava3.functions.Function
                            public final flc apply(FetchMessageListResponse fetchMessageListResponse) {
                                return new flc(new n321((Map) lVar3.b.invoke(fetchMessageListResponse)));
                            }
                        });
                        final l lVar4 = lVar;
                        Single<R> singleOnErrorResumeNext = map.onErrorResumeNext(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchRemoteMessagesEffectHandlerImpl.transformer.1.1.2
                            @Override // io.reactivex.rxjava3.functions.Function
                            public final SingleSource<? extends flc> apply(Throwable th) {
                                wic wicVar2 = lVar4.d;
                                wicVar2.a.onNext(CacheState.UPDATE_FAILED);
                                return Single.just(new flc(new m321(l1d.m("Unable to fetch the requested message list.: ", th.getMessage()))));
                            }
                        });
                        singleOnErrorResumeNext.getClass();
                        return singleOnErrorResumeNext;
                    }
                });
            }
        };
    }
}
