package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class flu0 extends onm {
    public final /* synthetic */ hlu0 X;
    public int Y;
    public g3d0 a;
    public List b;
    public List c;
    public Object d;
    public Collection e;
    public Iterator f;
    public Collection g;
    public int h;
    public int i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flu0(hlu0 hlu0Var, onm onmVar) {
        super(onmVar);
        this.X = hlu0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.g(null, null, this);
    }
}
