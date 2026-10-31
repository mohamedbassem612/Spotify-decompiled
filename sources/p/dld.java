package p;

import com.spotify.ads.esperanto.proto.CapabilityRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dld extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fld b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dld(fld fldVar, onm onmVar) {
        super(onmVar);
        this.b = fldVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((CapabilityRequest) null, this);
    }
}
