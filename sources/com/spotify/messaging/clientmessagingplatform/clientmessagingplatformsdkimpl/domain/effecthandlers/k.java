package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import p.elc;
import p.fzm0;
import p.g4j0;
import p.gmc;
import p.h321;
import p.i321;
import p.j321;
import p.jlc;
import p.k321;
import p.l321;
import p.lag;
import p.qz10;
import p.upn1;
import p.zjc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k {
    public final lag a;
    public final qz10 b;
    public final fzm0 c;

    public k(lag lagVar, qz10 qz10Var, fzm0 fzm0Var) {
        this.a = lagVar;
        this.b = qz10Var;
        this.c = fzm0Var;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchJustInTimeMessageEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(final Observable<zjc> observable) {
                Single singleA = this.this$0.c.a();
                final k kVar = this.this$0;
                return singleA.flatMapObservable(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchJustInTimeMessageEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final ObservableSource<? extends jlc> apply(final Boolean bool) {
                        Observable<zjc> observable2 = observable;
                        final k kVar2 = kVar;
                        return observable2.flatMapSingle(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchJustInTimeMessageEffectHandlerImpl.transformer.1.1.1
                            @Override // io.reactivex.rxjava3.functions.Function
                            public final SingleSource<? extends elc> apply(final zjc zjcVar) {
                                lag lagVar = kVar2.a;
                                String strM = upn1.m();
                                String strName = zjcVar.d.name();
                                List list = zjcVar.c;
                                gmc gmcVar = zjcVar.b;
                                DynamicTagsMetadata dynamicTagsMetadata = gmcVar.h;
                                String entityUri = dynamicTagsMetadata != null ? dynamicTagsMetadata.getEntityUri() : null;
                                String str = gmcVar.a;
                                Boolean bool2 = bool;
                                bool2.getClass();
                                Single singleF = lagVar.f(new FetchMessageRequest(strM, strName, list, entityUri, str, bool2.booleanValue()));
                                final k kVar3 = kVar2;
                                return singleF.map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchJustInTimeMessageEffectHandlerImpl.transformer.1.1.1.1
                                    @Override // io.reactivex.rxjava3.functions.Function
                                    public final elc apply(FetchMessageResponse fetchMessageResponse) {
                                        InAppMessage message = fetchMessageResponse.getMessage();
                                        zjc zjcVar2 = zjcVar;
                                        return message == null ? new elc(zjcVar2.b, new h321(j321.d), zjcVar2.c) : new elc(zjcVar2.b, new l321((Message) kVar3.b.invoke(fetchMessageResponse)), zjcVar.c);
                                    }
                                }).onErrorResumeNext(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.FetchJustInTimeMessageEffectHandlerImpl.transformer.1.1.1.2
                                    @Override // io.reactivex.rxjava3.functions.Function
                                    public final SingleSource<? extends elc> apply(Throwable th) {
                                        h321 h321Var;
                                        if (th instanceof MessageParsingException) {
                                            String message = th.getMessage();
                                            if (message == null) {
                                                message = g4j0.g.a();
                                            }
                                            h321Var = new h321(new k321(message));
                                        } else {
                                            String message2 = th.getMessage();
                                            if (message2 == null) {
                                                message2 = "Unable to fetch the requested message.";
                                            }
                                            h321Var = new h321(new i321(message2));
                                        }
                                        zjc zjcVar2 = zjcVar;
                                        return Single.just(new elc(zjcVar2.b, h321Var, zjcVar2.c));
                                    }
                                });
                            }
                        });
                    }
                });
            }
        };
    }
}
