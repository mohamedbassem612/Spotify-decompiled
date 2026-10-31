package com.spotify.mobius.coroutines;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.mobius.functions.Consumer;
import kotlin.Metadata;
import p.a8d1;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.l2;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@q8r(c = "com.spotify.mobius.coroutines.MobiusCoroutines$Companion$effectHandler$1$1$accept$1", f = "MobiusCoroutines.kt", l = {BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "F", "E", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
final class MobiusCoroutines$Companion$effectHandler$1$1$accept$1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ l2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Consumer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobiusCoroutines$Companion$effectHandler$1$1$accept$1(l2 l2Var, Object obj, Consumer consumer, lnm lnmVar) {
        super(2, lnmVar);
        this.b = l2Var;
        this.c = obj;
        this.d = consumer;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new MobiusCoroutines$Companion$effectHandler$1$1$accept$1(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        d9n d9nVar = rih1.a;
        if (!z) {
            hm5.M(obj);
            this.a = true;
            this.b.invoke(this.c, this.d, this);
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return d9nVar;
    }
}
