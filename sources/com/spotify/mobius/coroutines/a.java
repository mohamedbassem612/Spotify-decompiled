package com.spotify.mobius.coroutines;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.LinkedHashMap;
import p.bbc;
import p.fn31;
import p.llm;
import p.lnm;
import p.mno1;
import p.o8n;
import p.smo1;
import p.xgn0;
import p.ygn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class a implements Connectable {
    public final /* synthetic */ o8n a;
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder b;

    public /* synthetic */ a(o8n o8nVar, CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder) {
        this.a = o8nVar;
        this.b = coroutinesSubtypeEffectHandlerBuilder;
    }

    public final Connection L(Consumer consumer) {
        llm llmVarE = smo1.e(this.a);
        bbc bbcVarA = mno1.a(0, 0, 7);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xgn0 xgn0VarA = ygn0.a();
        fn31.T(llmVarE, (o8n) null, 0, new CoroutinesSubtypeEffectHandlerBuilder.build.1.1(bbcVarA, consumer, (lnm) null), 3);
        return new CoroutinesSubtypeEffectHandlerBuilder.build.1.2(llmVarE, xgn0VarA, linkedHashMap, this.b, bbcVarA);
    }
}
