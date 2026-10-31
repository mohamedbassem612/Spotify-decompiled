package p;

import com.spotify.wrapped.v1.proto.Image;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3k extends onm {
    public Image a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u3k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3k(u3k u3kVar, lnm lnmVar) {
        super(lnmVar);
        this.c = u3kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, null, this);
    }
}
