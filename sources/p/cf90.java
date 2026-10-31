package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cf90 implements ty31 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public cf90(q8n q8nVar, zwz0 zwz0Var) {
        this.a = (byte) 1;
        llm llmVarE = smo1.e(flo1.l(guo1.B(), q8nVar).y(new v62(olj0.T0, (byte) 12)));
        this.b = llmVarE;
        this.c = d5p1.t(zwz0Var.c(), llmVarE, ey71.a, Boolean.TRUE);
    }

    public final rqg0 a(Message message, gmc gmcVar, klc klcVar) {
        byte b = this.a;
        vy31 vy31Var = vy31.f;
        switch (b) {
            case 0:
                return u890.j(((BehaviorSubject) this.b).h(), Boolean.TRUE) ? vy31Var : new wy31(null);
            default:
                return ((Boolean) ((xe01) this.c).a.getValue()).booleanValue() ? vy31Var : new wy31(null);
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                ((vku) this.c).c();
                break;
            default:
                smo1.p((llm) this.b, (CancellationException) null);
                break;
        }
    }

    public cf90(crd crdVar) {
        this.a = (byte) 0;
        this.b = BehaviorSubject.g(Boolean.FALSE);
        vku vkuVar = new vku();
        this.c = vkuVar;
        vkuVar.a(((drd) crdVar).c.distinctUntilChanged().subscribe(new od30(this, (byte) 23)));
    }
}
