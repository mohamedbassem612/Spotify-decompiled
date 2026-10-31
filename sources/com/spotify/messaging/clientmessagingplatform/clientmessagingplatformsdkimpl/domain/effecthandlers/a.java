package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import p.c5j0;
import p.d3j0;
import p.d5j0;
import p.i5j0;
import p.jlc;
import p.kkc;
import p.n57;
import p.ulc;
import p.vks;
import p.x2j0;
import p.z2j0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a {
    public final c5j0 a;

    public a(c5j0 c5j0Var) {
        this.a = c5j0Var;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CacheRefreshRequestEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(Observable<kkc> observable) {
                final a aVar = this.this$0;
                return observable.flatMap(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CacheRefreshRequestEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final ObservableSource<? extends jlc> apply(kkc kkcVar) {
                        c5j0 c5j0Var = aVar.a;
                        TriggerType triggerType = TriggerType.CLIENT_EVENT;
                        DynamicTagsMetadata dynamicTagsMetadata = new DynamicTagsMetadata(null, null, null, null, 15, null);
                        ConflictResolutionStrategy conflictResolutionStrategy = ConflictResolutionStrategy.DISCARD_SELF;
                        d3j0 d3j0Var = new d3j0(new z2j0(false), x2j0.a);
                        i5j0 i5j0Var = (i5j0) c5j0Var;
                        i5j0Var.getClass();
                        String strP = ulc.p();
                        z6x z6xVar = z6x.a;
                        Maybe<T> maybeOnErrorComplete = Single.defer(new d5j0(z6xVar, new MessageRequest("spotify:internal:cacheRefresh", triggerType, z6xVar, null, "", vks.a, dynamicTagsMetadata, conflictResolutionStrategy, d3j0Var), strP, i5j0Var)).doOnError(new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CacheRefreshRequestEffectHandlerImpl.transformer.1.1.1
                            @Override // io.reactivex.rxjava3.functions.Consumer
                            public final void accept(Throwable th) {
                                n57.e("Error requesting refresh cache message " + th.getMessage());
                            }
                        }).onErrorComplete();
                        maybeOnErrorComplete.getClass();
                        return new MaybeIgnoreElementCompletable(maybeOnErrorComplete).w();
                    }
                });
            }
        };
    }
}
