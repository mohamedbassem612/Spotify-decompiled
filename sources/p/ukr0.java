package p;

import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ukr0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vkr0 c;
    public YourLibraryResponse d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukr0(vkr0 vkr0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = vkr0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
