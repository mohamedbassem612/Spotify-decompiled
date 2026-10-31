package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v1x extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ w0x e;
    public PlayerState f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1x(w0x w0xVar, lnm lnmVar) {
        super(lnmVar);
        this.e = w0xVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.e.emit(null, this);
    }
}
