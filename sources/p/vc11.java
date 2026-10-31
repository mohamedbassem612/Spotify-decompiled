package p;

import com.spotify.musicappplatform.bottomsheet.compose.ReflectionBasedDragHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vc11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ReflectionBasedDragHandler b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc11(ReflectionBasedDragHandler reflectionBasedDragHandler, lnm lnmVar) {
        super(lnmVar);
        this.b = reflectionBasedDragHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.settle(0.0f, this);
    }
}
