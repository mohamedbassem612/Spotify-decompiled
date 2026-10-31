package p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jy10 extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FeedbackUploadWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy10(FeedbackUploadWorker feedbackUploadWorker, onm onmVar) {
        super(onmVar);
        this.c = feedbackUploadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l((String) null, this);
    }
}
