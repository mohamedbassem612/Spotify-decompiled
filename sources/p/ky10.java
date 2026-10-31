package p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ky10 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ FeedbackUploadWorker c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky10(FeedbackUploadWorker feedbackUploadWorker, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = feedbackUploadWorker;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        FeedbackUploadWorker feedbackUploadWorker = this.c;
        switch (b) {
            case 0:
                return new ky10(feedbackUploadWorker, lnmVar, (byte) 0);
            default:
                return new ky10(feedbackUploadWorker, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        FeedbackUploadWorker feedbackUploadWorker = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = feedbackUploadWorker.m;
                this.b = true;
                Object objI = b5p1.i(mr20Var, this);
                return objI == d9nVar ? d9nVar : objI;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarA = feedbackUploadWorker.l.a("employee", false);
                this.b = true;
                Object objI2 = b5p1.i(mr20VarA, this);
                return objI2 == d9nVar ? d9nVar : objI2;
        }
    }
}
