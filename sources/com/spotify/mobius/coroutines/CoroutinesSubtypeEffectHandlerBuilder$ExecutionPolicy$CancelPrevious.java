package com.spotify.mobius.coroutines;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.a8d1;
import p.bbc;
import p.c9n;
import p.d9n;
import p.eg;
import p.faa0;
import p.hm5;
import p.lnm;
import p.q8r;
import p.r261;
import p.rih1;
import p.smo1;
import p.uac;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0005\u0010\u0001*\u00028\u0006*\u0004\b\u0006\u0010\u0002*\u0004\b\u0007\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious", "G", "F", "E", "", "<init>", "()V", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious<G extends F, F, E> {
    public final CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler a(final CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler) {
        return new CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler() { // from class: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1

            /* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1, reason: invalid class name */
            @q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {347}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0001\"\u0004\b\u0005\u0010\u0002\"\b\b\u0006\u0010\u0001*\u00020\u0003\"\b\b\u0007\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"G", "F", "E", "", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
            final class AnonymousClass1 extends a8d1 implements vu30 {
                public faa0 a;
                public uac b;
                public boolean c;
                public /* synthetic */ Object d;
                public final /* synthetic */ bbc e;
                public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler f;
                public final /* synthetic */ r261 g;

                /* JADX INFO: renamed from: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1, reason: invalid class name and collision with other inner class name */
                @q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {349}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0001\"\u0004\b\u0005\u0010\u0002\"\b\b\u0006\u0010\u0001*\u00020\u0003\"\b\b\u0007\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"G", "F", "E", "", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
                final class C00051 extends a8d1 implements vu30 {
                    public boolean a;
                    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler b;
                    public final /* synthetic */ Object c;
                    public final /* synthetic */ r261 d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00051(CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler, Object obj, r261 r261Var, lnm lnmVar) {
                        super(2, lnmVar);
                        this.b = effectHandler;
                        this.c = obj;
                        this.d = r261Var;
                    }

                    @Override // p.faa
                    public final lnm create(Object obj, lnm lnmVar) {
                        return new C00051(this.b, this.c, this.d, lnmVar);
                    }

                    @Override // p.vu30
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C00051) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
                    }

                    @Override // p.faa
                    public final Object invokeSuspend(Object obj) {
                        boolean z = this.a;
                        if (!z) {
                            hm5.M(obj);
                            this.a = true;
                            Object objA = this.b.a(this.c, this.d, this);
                            d9n d9nVar = d9n.a;
                            if (objA == d9nVar) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(bbc bbcVar, CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler, r261 r261Var, lnm lnmVar) {
                    super(2, lnmVar);
                    this.e = bbcVar;
                    this.f = effectHandler;
                    this.g = r261Var;
                }

                @Override // p.faa
                public final lnm create(Object obj, lnm lnmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.f, this.g, lnmVar);
                    anonymousClass1.d = obj;
                    return anonymousClass1;
                }

                @Override // p.vu30
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0042 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x004b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0040 -> B:12:0x0043). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // p.faa
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        boolean r0 = r7.c
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L1c
                        if (r0 != r1) goto L16
                        p.uac r0 = r7.b
                        p.faa0 r3 = r7.a
                        p.faa0 r3 = (p.faa0) r3
                        java.lang.Object r4 = r7.d
                        p.c9n r4 = (p.c9n) r4
                        p.hm5.M(r8)
                        goto L43
                    L16:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        p.eg.m(r7)
                        return r2
                    L1c:
                        p.hm5.M(r8)
                        java.lang.Object r8 = r7.d
                        p.c9n r8 = (p.c9n) r8
                        p.gaa0 r0 = p.op71.f()
                        p.uac r3 = new p.uac
                        p.bbc r4 = r7.e
                        r3.<init>(r4)
                        r4 = r3
                        r3 = r0
                        r0 = r4
                        r4 = r8
                    L32:
                        r7.d = r4
                        r7.a = r3
                        r7.b = r0
                        r7.c = r1
                        java.lang.Object r8 = r0.a(r7)
                        p.d9n r5 = p.d9n.a
                        if (r8 != r5) goto L43
                        return r5
                    L43:
                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                        boolean r8 = r8.booleanValue()
                        if (r8 == 0) goto L62
                        java.lang.Object r8 = r0.c()
                        p.ha71.o(r3)
                        com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1 r3 = new com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1$1$1
                        com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$EffectHandler r5 = r7.f
                        p.r261 r6 = r7.g
                        r3.<init>(r5, r8, r6, r2)
                        r8 = 3
                        r5 = 0
                        p.faa0 r3 = p.c921.y(r4, r2, r5, r3, r8)
                        goto L32
                    L62:
                        p.rih1 r7 = p.rih1.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious$createEffectsHandler$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler
            public final Object a(bbc bbcVar, r261 r261Var, lnm lnmVar) {
                Object objS = smo1.s(new AnonymousClass1(bbcVar, effectHandler, r261Var, null), lnmVar);
                return objS == d9n.a ? objS : rih1.a;
            }
        };
    }
}
