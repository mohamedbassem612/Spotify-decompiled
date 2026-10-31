package com.spotify.mobius.coroutines;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import p.a8d1;
import p.bbc;
import p.c921;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.jd11;
import p.jfe;
import p.llm;
import p.lnm;
import p.mno1;
import p.o8n;
import p.q8r;
import p.rc11;
import p.rih1;
import p.smo1;
import p.tka0;
import p.vu30;
import p.xgn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {391, 278}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "F", "E", "Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
final class CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1 extends a8d1 implements vu30 {
    public final /* synthetic */ bbc N0;
    public final /* synthetic */ LinkedHashMap X;
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder Y;
    public final /* synthetic */ llm Z;
    public xgn0 a;
    public LinkedHashMap b;
    public Object c;
    public CoroutinesSubtypeEffectHandlerBuilder d;
    public llm e;
    public bbc f;
    public byte g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xgn0 i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1(xgn0 xgn0Var, Object obj, LinkedHashMap linkedHashMap, CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder, llm llmVar, bbc bbcVar, lnm lnmVar) {
        super(2, lnmVar);
        this.i = xgn0Var;
        this.t = obj;
        this.X = linkedHashMap;
        this.Y = coroutinesSubtypeEffectHandlerBuilder;
        this.Z = llmVar;
        this.N0 = bbcVar;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1 coroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1 = new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1(this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
        coroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1.h = obj;
        return coroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        c9n c9nVar;
        xgn0 xgn0Var;
        LinkedHashMap linkedHashMap;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder;
        llm llmVar;
        bbc bbcVar;
        Object obj2;
        byte b = this.g;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                c9nVar = (c9n) this.h;
                this.h = c9nVar;
                xgn0Var = this.i;
                this.a = xgn0Var;
                linkedHashMap = this.X;
                this.b = linkedHashMap;
                this.c = obj3;
                coroutinesSubtypeEffectHandlerBuilder = this.Y;
                this.d = coroutinesSubtypeEffectHandlerBuilder;
                llm llmVar2 = this.Z;
                this.e = llmVar2;
                bbc bbcVar2 = this.N0;
                this.f = bbcVar2;
                this.g = (byte) 1;
                if (xgn0Var.a(this) != d9nVar) {
                    llmVar = llmVar2;
                    bbcVar = bbcVar2;
                    obj2 = obj3;
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bbcVar = this.f;
            llmVar = this.e;
            coroutinesSubtypeEffectHandlerBuilder = this.d;
            obj2 = this.c;
            linkedHashMap = this.b;
            xgn0Var = this.a;
            c9nVar = (c9n) this.h;
            hm5.M(obj);
            if (!smo1.u(c9nVar)) {
                xgn0Var.c(null);
                return rih1Var;
            }
            Class<?> cls = obj2.getClass();
            jd11 jd11Var = rc11.a;
            tka0 tka0VarB = jd11Var.b(cls);
            Object obj4 = linkedHashMap.get(tka0VarB);
            if (obj4 == null) {
                bbc bbcVarA = mno1.a(0, 0, 7);
                CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler effectsHandler = (CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler) coroutinesSubtypeEffectHandlerBuilder.a.get(jd11Var.b(obj2.getClass()));
                if (effectsHandler == null) {
                    throw new IllegalStateException(("No effectHandler for " + obj2).toString());
                }
                c921.y(llmVar, (o8n) null, 0, new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1$subEffectChannel$1$1$1(effectsHandler, bbcVarA, bbcVar, null), 3);
                linkedHashMap.put(tka0VarB, bbcVarA);
                obj4 = bbcVarA;
            }
            jfe jfeVar = (jfe) obj4;
            xgn0Var.c(null);
            if (smo1.u(c9nVar)) {
                this.h = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = (byte) 2;
                if (jfeVar.b(obj3, this) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        } catch (Throwable th) {
            xgn0Var.c(null);
            throw th;
        }
    }
}
