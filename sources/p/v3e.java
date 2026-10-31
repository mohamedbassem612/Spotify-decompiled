package p;

import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$PutDeviceRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v3e extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ a4e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3e(a4e a4eVar, onm onmVar) {
        super(onmVar);
        this.b = a4eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((CastMessages$PutDeviceRequest) null, this);
    }
}
