package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p.anm1;
import p.b7x;
import p.bkc;
import p.gnf0;
import p.jlc;
import p.m5n1;
import p.mif1;
import p.mjc;
import p.mmr0;
import p.njc;
import p.oqn1;
import p.rkc;
import p.t6j0;
import p.yic;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m {
    public final mjc a;
    public final yic b;

    public m(mjc mjcVar, yic yicVar) {
        this.a = mjcVar;
        this.b = yicVar;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(Observable<bkc> observable) {
                final m mVar = this.this$0;
                return observable.flatMap(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final ObservableSource<? extends jlc> apply(final bkc bkcVar) {
                        mjc mjcVar = mVar.a;
                        Set set = bkcVar.c;
                        t6j0 t6j0Var = ((njc) mjcVar).a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT * FROM messages WHERE `trigger` IN (");
                        anm1.h(set.size(), sb);
                        sb.append(")");
                        Flowable flowableM = m5n1.n(t6j0Var.a, new gnf0(sb.toString(), set, t6j0Var, (byte) 17)).f(mif1.Y).m();
                        Flowable flowableM2 = mVar.b.c().m();
                        mVar.getClass();
                        return new ObservableFromPublisher(new FlowableSwitchIfEmpty(flowableM.c0(flowableM2, new BiFunction() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$loadMessagesAndCapping$1
                            @Override // io.reactivex.rxjava3.functions.BiFunction
                            public final mmr0 apply(List<? extends Message> list, Map<CappingKey, CappingState> map) {
                                return oqn1.n(list, map);
                            }
                        }).J(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$loadMessagesAndCapping$2
                            @Override // io.reactivex.rxjava3.functions.Function
                            public final rkc apply(mmr0 mmr0Var) {
                                List list = (List) mmr0Var.a;
                                Map map = (Map) mmr0Var.b;
                                bkc bkcVar2 = bkcVar;
                                return new rkc(bkcVar2.c, bkcVar2.b, list, map);
                            }
                        }), Flowable.I(new rkc(set, bkcVar.b, z6x.a, b7x.a))));
                    }
                });
            }
        };
    }
}
