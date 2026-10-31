package p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly10 extends onm {
    public String a;
    public String b;
    public String[] c;
    public String d;
    public boolean e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ FeedbackUploadWorker h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly10(FeedbackUploadWorker feedbackUploadWorker, onm onmVar) {
        super(onmVar);
        this.h = feedbackUploadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(this);
    }
}
