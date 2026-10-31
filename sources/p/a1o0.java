package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a1o0 implements byf0 {
    public final /* synthetic */ byte a = 1;
    public final llm b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public a1o0(poj0 poj0Var, drj0 drj0Var, v4o0 v4o0Var, Context context, q8n q8nVar) {
        this.c = poj0Var;
        this.d = drj0Var;
        this.e = v4o0Var;
        this.f = context;
        this.b = us71.h(q8nVar);
    }

    public final void c() {
        switch (this.a) {
            case 0:
                break;
            default:
                if (((ex4) this.f).a()) {
                    fn31.T(this.b, (o8n) null, 0, new i7u0(this, (lnm) null, (byte) 3), 3);
                }
                break;
        }
    }

    public final void d() {
        byte b = this.a;
        llm llmVar = this.b;
        switch (b) {
            case 0:
                op71.q(llmVar.a, (CancellationException) null);
                break;
            default:
                op71.q(llmVar.a, (CancellationException) null);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(String str, onm onmVar) {
        p411 p411Var;
        if (onmVar instanceof p411) {
            p411Var = (p411) onmVar;
            int i = p411Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p411Var.c = i - Integer.MIN_VALUE;
            } else {
                p411Var = new p411(this, onmVar);
            }
        } else {
            p411Var = new p411(this, onmVar);
        }
        Object objJ = p411Var.a;
        int i2 = p411Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleC = ljg.c((ljg) this.c, l1d.m("recs-quality:foreground:v1:", str), (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510);
            p411Var.c = 1;
            objJ = fc11.j(singleC, p411Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public final void g(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                fn31.T(this.b, (o8n) null, 0, new bu(this, (lnm) null, (byte) 26), 3);
                break;
        }
    }

    private final void b() {
    }

    public a1o0(ljg ljgVar, wm70 wm70Var, Flowable flowable, ex4 ex4Var, q8n q8nVar) {
        this.c = ljgVar;
        this.d = wm70Var;
        this.e = flowable;
        this.f = ex4Var;
        this.b = smo1.e(q8nVar);
    }

    private final void a(ViewGroup viewGroup) {
    }
}
