package p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oy10 extends onm {
    public /* synthetic */ Object a;
    public int b;

    public oy10(onm onmVar) {
        super(onmVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        d9n d9nVarO = FeedbackUploadWorker.o((FeedbackUploadWorker) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, this);
        return d9nVarO == d9n.a ? d9nVarO : new e331(d9nVarO);
    }
}
