package p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ny10 extends onm {
    public String a;
    public ArrayList b;
    public String c;
    public String d;
    public List e;
    public String f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ FeedbackUploadWorker i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny10(FeedbackUploadWorker feedbackUploadWorker, onm onmVar) {
        super(onmVar);
        this.i = feedbackUploadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        Object objN = this.i.n((String) null, (String) null, (ArrayList) null, (String) null, this);
        return objN == d9n.a ? objN : new e331(objN);
    }
}
