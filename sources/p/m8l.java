package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m8l implements yw0 {
    public final Flowable a;
    public final g0l b;
    public final qq0 c;
    public final xn0 d;
    public final tl4 e;
    public final llm f;
    public final LinkedHashSet g = new LinkedHashSet();
    public ContextTrack h;

    public m8l(Flowable flowable, g0l g0lVar, qq0 qq0Var, q8n q8nVar, xn0 xn0Var, tl4 tl4Var) {
        this.a = flowable;
        this.b = g0lVar;
        this.c = qq0Var;
        this.d = xn0Var;
        this.e = tl4Var;
        this.f = smo1.e(q8nVar);
    }

    @Override // p.yw0
    public final void start() {
        if (this.e.c()) {
            mx mxVar = new mx(this, null, (byte) 10);
            llm llmVar = this.f;
            c921.y(llmVar, (o8n) null, 0, mxVar, 3);
            c921.y(llmVar, (o8n) null, 0, new awe(this, (lnm) null, (byte) 15), 3);
        }
    }

    @Override // p.yw0
    public final void stop() {
        smo1.q(this.f);
    }
}
