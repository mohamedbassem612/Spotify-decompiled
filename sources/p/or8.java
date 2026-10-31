package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class or8 implements byf0 {
    public final kly0 a;
    public final q8n b;
    public final Observable c;
    public final cue0 d;
    public llm e;

    public or8(thq thqVar, q8n q8nVar, Observable observable, cue0 cue0Var) {
        this.a = thqVar;
        this.b = q8nVar;
        this.c = observable;
        this.d = cue0Var;
    }

    public final void c() {
        llm llmVarE = smo1.e(this.b);
        c921.y(llmVarE, (o8n) null, 0, new zx0(this, null, (byte) 1), 3);
        c921.y(llmVarE, (o8n) null, 0, new vk6(this, (lnm) null, (byte) 6), 3);
        this.e = llmVarE;
    }

    public final void d() {
        llm llmVar = this.e;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
