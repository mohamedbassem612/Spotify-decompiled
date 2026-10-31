package p;

import com.ravelin.core.model.Fingerprint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iug extends onm {
    public /* synthetic */ Object N0;
    public final /* synthetic */ zug O0;
    public int P0;
    public int X;
    public int Y;
    public int Z;
    public cnr a;
    public zug b;
    public Fingerprint c;
    public Fingerprint d;
    public sug e;
    public Object f;
    public Fingerprint g;
    public boolean h;
    public boolean i;
    public short t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iug(zug zugVar, onm onmVar) {
        super(onmVar);
        this.O0 = zugVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.N0 = obj;
        this.P0 |= Integer.MIN_VALUE;
        return this.O0.o(null, false, 0L, this);
    }
}
