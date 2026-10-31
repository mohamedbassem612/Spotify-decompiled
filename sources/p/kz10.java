package p;

import com.spotify.home.slotloading.SlotEffect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kz10 extends onm {
    public SlotEffect.FetchLayout a;
    public ks21 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w2z d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz10(w2z w2zVar, onm onmVar) {
        super(onmVar);
        this.d = w2zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g((SlotEffect.FetchLayout) null, (qkg) null, (ks21) null, this);
    }
}
