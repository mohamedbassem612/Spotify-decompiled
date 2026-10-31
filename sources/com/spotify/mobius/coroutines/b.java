package com.spotify.mobius.coroutines;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p.fn31;
import p.llm;
import p.lnm;
import p.mr20;
import p.o8n;
import p.p811;
import p.smo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class b implements EventSource {
    public final /* synthetic */ o8n a;
    public final /* synthetic */ mr20[] b;

    public /* synthetic */ b(o8n o8nVar, mr20[] mr20VarArr) {
        this.a = o8nVar;
        this.b = mr20VarArr;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.Companion.a;
        final llm llmVarE = smo1.e(this.a);
        final p811 p811Var = new p811();
        p811Var.a = new AtomicBoolean(false);
        fn31.T(llmVarE, (o8n) null, 0, new FlowEventSources.Companion.fromFlows.1.1(this.b, p811Var, consumer, (lnm) null), 3);
        return new Disposable() { // from class: p.ls20
            public final void dispose() {
                p811 p811Var2 = p811Var;
                llm llmVar = llmVarE;
                FlowEventSources.Companion companion2 = FlowEventSources.Companion.a;
                synchronized (p811Var2.a) {
                    ((AtomicBoolean) p811Var2.a).set(true);
                }
                smo1.p(llmVar, new CancellationException("EventSource disposed"));
            }
        };
    }
}
