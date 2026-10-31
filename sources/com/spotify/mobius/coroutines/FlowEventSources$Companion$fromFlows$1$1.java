package com.spotify.mobius.coroutines;

import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p.a8d1;
import p.c9n;
import p.d9n;
import p.eg;
import p.f46;
import p.hm5;
import p.hu20;
import p.kge;
import p.lnm;
import p.mr20;
import p.p811;
import p.q8r;
import p.rih1;
import p.vr20;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@q8r(c = "com.spotify.mobius.coroutines.FlowEventSources$Companion$fromFlows$1$1", f = "FlowEventSources.kt", l = {PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
final class FlowEventSources$Companion$fromFlows$1$1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ mr20[] b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ Consumer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowEventSources$Companion$fromFlows$1$1(mr20[] mr20VarArr, p811 p811Var, Consumer consumer, lnm lnmVar) {
        super(2, lnmVar);
        this.b = mr20VarArr;
        this.c = p811Var;
        this.d = consumer;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new FlowEventSources$Companion$fromFlows$1$1(this.b, this.c, this.d, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowEventSources$Companion$fromFlows$1$1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Iterable iterableG = f46.G(this.b);
            int i = hu20.a;
            kge kgeVar = new kge(iterableG);
            final p811 p811Var = this.c;
            final Consumer consumer = this.d;
            vr20 vr20Var = new vr20() { // from class: com.spotify.mobius.coroutines.FlowEventSources$Companion$fromFlows$1$1.1
                @Override // p.vr20
                public final Object emit(Object obj2, lnm lnmVar) {
                    p811 p811Var2 = p811Var;
                    Object obj3 = p811Var2.a;
                    Consumer consumer2 = consumer;
                    synchronized (obj3) {
                        if (!((AtomicBoolean) p811Var2.a).get()) {
                            consumer2.accept(obj2);
                        }
                    }
                    return rih1.a;
                }
            };
            this.a = true;
            Object objCollect = kgeVar.collect(vr20Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
