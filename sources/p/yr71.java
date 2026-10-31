package p;

import com.spotify.campfire.elements.sharedbychip.impl.proto.NudgeData;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yr71 extends onm {
    public NudgeData a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dc31 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr71(dc31 dc31Var, onm onmVar) {
        super(onmVar);
        this.c = dc31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, this);
    }
}
