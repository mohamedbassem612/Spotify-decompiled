package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import p.jlc;
import p.k4p1;
import p.lkc;
import p.mjc;
import p.njc;
import p.qyo1;
import p.skc;
import p.smc0;
import p.t6j0;
import p.tug1;
import p.uah0;
import p.wic;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p {
    public final mjc a;
    public final wic b;

    public p(mjc mjcVar, wic wicVar) {
        this.a = mjcVar;
        this.b = wicVar;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SaveMessagesToCacheEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(Observable<lkc> observable) {
                final p pVar = this.this$0;
                Observable<R> map = observable.map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SaveMessagesToCacheEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final jlc apply(lkc lkcVar) {
                        mjc mjcVar = pVar.a;
                        Map map2 = lkcVar.b;
                        njc njcVar = (njc) mjcVar;
                        njcVar.getClass();
                        smc0 smc0VarN = k4p1.n();
                        for (Map.Entry entry : map2.entrySet()) {
                            for (Message message : (Iterable) entry.getValue()) {
                                smc0VarN.add(new tug1((String) entry.getKey(), message instanceof Message.CreativeMessage ? ((Message.CreativeMessage) message).getLoggingData().getMessageId() : -1L, message));
                            }
                        }
                        smc0 smc0VarK = k4p1.k(smc0VarN);
                        t6j0 t6j0Var = njcVar.a;
                        qyo1.x(t6j0Var.a, false, true, new uah0(t6j0Var, smc0VarK, (byte) 15));
                        wic wicVar = pVar.b;
                        CacheState cacheState = CacheState.LOADED;
                        wicVar.a.onNext(cacheState);
                        return new skc(cacheState);
                    }
                });
                final p pVar2 = this.this$0;
                return map.onErrorResumeNext(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SaveMessagesToCacheEffectHandlerImpl$transformer$1.2
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final ObservableSource<? extends jlc> apply(Throwable th) {
                        wic wicVar = pVar2.b;
                        CacheState cacheState = CacheState.UPDATE_FAILED;
                        wicVar.a.onNext(cacheState);
                        return Observable.just(new skc(cacheState));
                    }
                });
            }
        };
    }
}
