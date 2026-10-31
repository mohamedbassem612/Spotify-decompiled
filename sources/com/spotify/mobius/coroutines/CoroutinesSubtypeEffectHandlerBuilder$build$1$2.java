package com.spotify.mobius.coroutines;

import com.spotify.mobius.Connection;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p.bbc;
import p.c921;
import p.ilo1;
import p.llm;
import p.lnm;
import p.o8n;
import p.smo1;
import p.xgn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$build$1$2", "Lcom/spotify/mobius/Connection;", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class CoroutinesSubtypeEffectHandlerBuilder$build$1$2 implements Connection<Object> {
    public final /* synthetic */ llm a;
    public final /* synthetic */ xgn0 b;
    public final /* synthetic */ LinkedHashMap c;
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder d;
    public final /* synthetic */ bbc e;

    public CoroutinesSubtypeEffectHandlerBuilder$build$1$2(llm llmVar, xgn0 xgn0Var, LinkedHashMap linkedHashMap, CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder, bbc bbcVar) {
        this.a = llmVar;
        this.b = xgn0Var;
        this.c = linkedHashMap;
        this.d = coroutinesSubtypeEffectHandlerBuilder;
        this.e = bbcVar;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        bbc bbcVar = this.e;
        xgn0 xgn0Var = this.b;
        LinkedHashMap linkedHashMap = this.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder = this.d;
        llm llmVar = this.a;
        c921.y(llmVar, (o8n) null, 0, new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1(xgn0Var, obj, linkedHashMap, coroutinesSubtypeEffectHandlerBuilder, llmVar, bbcVar, null), 3);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        smo1.r(this.a, "Effect Handler disposed");
        ilo1.r(this.e);
        c921.C(new dispose.1(this.b, this.c, (lnm) null));
    }
}
