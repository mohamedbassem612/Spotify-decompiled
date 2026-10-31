package p;

import com.spotify.player.model.command.PlayCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class anc extends onm {
    public String a;
    public PlayCommand b;
    public ou80 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dnc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anc(dnc dncVar, onm onmVar) {
        super(onmVar);
        this.e = dncVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c((String) null, false, (PlayCommand) null, (ou80) null, this);
    }
}
