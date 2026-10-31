package p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class my10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ FeedbackUploadWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my10(FeedbackUploadWorker feedbackUploadWorker, onm onmVar) {
        super(onmVar);
        this.b = feedbackUploadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        d9n d9nVarM = this.b.m((String) null, (String) null, (ArrayList) null, this);
        return d9nVarM == d9n.a ? d9nVarM : new e331(d9nVarM);
    }
}
