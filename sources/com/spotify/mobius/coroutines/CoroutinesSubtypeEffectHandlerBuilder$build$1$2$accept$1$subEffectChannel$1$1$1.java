package com.spotify.mobius.coroutines;

import kotlin.Metadata;
import p.a8d1;
import p.bbc;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.jfe;
import p.lnm;
import p.q8r;
import p.rih1;
import p.smo1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {269}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "F", "E", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
final class CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler c;
    public final /* synthetic */ bbc d;
    public final /* synthetic */ jfe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1(CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler effectsHandler, bbc bbcVar, jfe jfeVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = effectsHandler;
        this.d = bbcVar;
        this.e = jfeVar;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1 coroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1 = new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1(this.c, this.d, this.e, lnmVar);
        coroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1.b = obj;
        return coroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (smo1.u((c9n) this.b)) {
                this.a = true;
                Object objA = this.c.a(this.d, this.e, this);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
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
