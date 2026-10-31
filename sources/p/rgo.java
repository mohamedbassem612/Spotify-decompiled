package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rgo extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ gal b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgo(gal galVar, onm onmVar) {
        super(onmVar);
        this.b = galVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = this.b.f((CurrentTrackMetadata) null, false, this);
        return objF == d9n.a ? objF : new e331(objF);
    }
}
