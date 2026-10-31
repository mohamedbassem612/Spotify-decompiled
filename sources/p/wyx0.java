package p;

import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wyx0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ PromptSuggestionsWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyx0(PromptSuggestionsWorker promptSuggestionsWorker, onm onmVar) {
        super(onmVar);
        this.b = promptSuggestionsWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
