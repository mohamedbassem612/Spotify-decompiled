package p;

import com.spotify.playlist.proto.ModificationRequest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vyc0 extends onm {
    public String a;
    public ModificationRequest b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xyc0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyc0(xyc0 xyc0Var, onm onmVar) {
        super(onmVar);
        this.d = xyc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.n((String) null, (String) null, (List) null, (String) null, (String) null, this);
    }
}
