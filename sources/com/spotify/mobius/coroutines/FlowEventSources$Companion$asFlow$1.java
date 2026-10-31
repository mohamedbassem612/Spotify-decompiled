package com.spotify.mobius.coroutines;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.d9n;
import p.eg;
import p.hab0;
import p.hm5;
import p.jch0;
import p.lnm;
import p.ms20;
import p.q8r;
import p.rih1;
import p.ssw0;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@q8r(c = "com.spotify.mobius.coroutines.FlowEventSources$Companion$asFlow$1", f = "FlowEventSources.kt", l = {90}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "Lp/ssw0;", "Lp/rih1;", "<anonymous>", "(Lp/ssw0;)V"}, k = 3, mv = {1, 9, 0})
final class FlowEventSources$Companion$asFlow$1 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ EventSource c;

    /* JADX INFO: renamed from: com.spotify.mobius.coroutines.FlowEventSources$Companion$asFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "E", "Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    final class AnonymousClass1 extends hab0 implements Function0 {
        public final /* synthetic */ Disposable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Disposable disposable) {
            super(0);
            this.a = disposable;
        }

        public final Object invoke() {
            this.a.dispose();
            return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowEventSources$Companion$asFlow$1(EventSource eventSource, lnm lnmVar) {
        super(2, lnmVar);
        this.c = eventSource;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        FlowEventSources$Companion$asFlow$1 flowEventSources$Companion$asFlow$1 = new FlowEventSources$Companion$asFlow$1(this.c, lnmVar);
        flowEventSources$Companion$asFlow$1.b = obj;
        return flowEventSources$Companion$asFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ssw0 ssw0Var = (ssw0) this.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c.a(new ms20(ssw0Var, (byte) 0)));
            this.a = true;
            Object objS = jch0.s(ssw0Var, anonymousClass1, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
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
