package com.spotify.mobius.coroutines;

import com.spotify.mobius.functions.Consumer;
import kotlin.Metadata;
import p.a8d1;
import p.bbc;
import p.c9n;
import p.lnm;
import p.q8r;
import p.rih1;
import p.uac;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {250}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "F", "E", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
final class CoroutinesSubtypeEffectHandlerBuilder$build$1$1 extends a8d1 implements vu30 {
    public uac a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bbc d;
    public final /* synthetic */ Consumer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesSubtypeEffectHandlerBuilder$build$1$1(bbc bbcVar, Consumer consumer, lnm lnmVar) {
        super(2, lnmVar);
        this.d = bbcVar;
        this.e = consumer;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        CoroutinesSubtypeEffectHandlerBuilder$build$1$1 coroutinesSubtypeEffectHandlerBuilder$build$1$1 = new CoroutinesSubtypeEffectHandlerBuilder$build$1$1(this.d, this.e, lnmVar);
        coroutinesSubtypeEffectHandlerBuilder$build$1$1.c = obj;
        return coroutinesSubtypeEffectHandlerBuilder$build$1$1;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesSubtypeEffectHandlerBuilder$build$1$1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x003e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.faa
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.b
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            p.uac r0 = r4.a
            java.lang.Object r2 = r4.c
            p.c9n r2 = (p.c9n) r2
            p.hm5.M(r5)
            goto L36
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L18:
            p.hm5.M(r5)
            java.lang.Object r5 = r4.c
            p.c9n r5 = (p.c9n) r5
            p.uac r0 = new p.uac
            p.bbc r2 = r4.d
            r0.<init>(r2)
            r2 = r5
        L27:
            r4.c = r2
            r4.a = r0
            r4.b = r1
            java.lang.Object r5 = r0.a(r4)
            p.d9n r3 = p.d9n.a
            if (r5 != r3) goto L36
            return r3
        L36:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r0.c()
            boolean r3 = p.smo1.u(r2)
            if (r3 == 0) goto L27
            com.spotify.mobius.functions.Consumer r3 = r4.e
            r3.accept(r5)
            goto L27
        L4e:
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
