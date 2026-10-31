package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class abf1 extends onm {
    public g7m1 a;
    public SceneTemplate.TopGenreContent.Card2 b;
    public ArrayList c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ebf1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abf1(ebf1 ebf1Var, onm onmVar) {
        super(onmVar);
        this.f = ebf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
