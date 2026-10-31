package p;

import com.spotify.home.slotloading.SlotEffect$LoadSlotContent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w4e0 extends onm {
    public SlotEffect$LoadSlotContent a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fad0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4e0(fad0 fad0Var, onm onmVar) {
        super(onmVar);
        this.d = fad0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(null, null, false, false, null, this);
    }
}
