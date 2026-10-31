package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xed extends onm {
    public int X;
    public List a;
    public String b;
    public aod c;
    public Collection d;
    public Iterator e;
    public boolean f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ bfd t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xed(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.t = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.X |= Integer.MIN_VALUE;
        return this.t.H(null, this);
    }
}
