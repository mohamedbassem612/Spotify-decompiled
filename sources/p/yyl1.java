package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yyl1 extends onm {
    public dma1 a;
    public Set b;
    public Set c;
    public Set d;
    public LinkedHashSet e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zyl1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyl1(zyl1 zyl1Var, onm onmVar) {
        super(onmVar);
        this.g = zyl1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
