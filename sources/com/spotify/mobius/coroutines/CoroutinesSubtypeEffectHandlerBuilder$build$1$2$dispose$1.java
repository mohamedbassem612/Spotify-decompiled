package com.spotify.mobius.coroutines;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p.a8d1;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.jfe;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vu30;
import p.xgn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {391}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "F", "E", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
final class CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1 extends a8d1 implements vu30 {
    public xgn0 a;
    public LinkedHashMap b;
    public boolean c;
    public final /* synthetic */ xgn0 d;
    public final /* synthetic */ LinkedHashMap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1(xgn0 xgn0Var, LinkedHashMap linkedHashMap, lnm lnmVar) {
        super(2, lnmVar);
        this.d = xgn0Var;
        this.e = linkedHashMap;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1(this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        xgn0 xgn0Var;
        boolean z = this.c;
        if (!z) {
            hm5.M(obj);
            xgn0 xgn0Var2 = this.d;
            this.a = xgn0Var2;
            linkedHashMap = this.e;
            this.b = linkedHashMap;
            this.c = true;
            Object objA = xgn0Var2.a(this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            xgn0Var = xgn0Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = this.b;
            xgn0Var = this.a;
            hm5.M(obj);
        }
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((jfe) it.next()).H((Throwable) null);
            }
            linkedHashMap.clear();
            return rih1.a;
        } finally {
            xgn0Var.c((Object) null);
        }
    }
}
