package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v990 extends onm {
    public g7m1 a;
    public StoryCard b;
    public SceneTemplate.IntroContent.LiveCounterCard c;
    public /* synthetic */ Object d;
    public final /* synthetic */ oe6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v990(oe6 oe6Var, onm onmVar) {
        super(onmVar);
        this.e = oe6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
