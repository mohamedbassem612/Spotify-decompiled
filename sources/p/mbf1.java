package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mbf1 extends onm {
    public g7m1 a;
    public SceneTemplate.TopPlaylistsContent.List b;
    public ArrayList c;
    public kia d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xbf1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbf1(xbf1 xbf1Var, onm onmVar) {
        super(onmVar);
        this.g = xbf1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
