package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class spm extends onm {
    public int N0;
    public /* synthetic */ Object O0;
    public final /* synthetic */ p2o0 P0;
    public int Q0;
    public tom X;
    public int Y;
    public int Z;
    public List a;
    public Map b;
    public Map c;
    public Map d;
    public Map e;
    public Map f;
    public Collection g;
    public Iterator h;
    public ArrayList i;
    public ArrayList t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spm(p2o0 p2o0Var, onm onmVar) {
        super(onmVar);
        this.P0 = p2o0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.O0 = obj;
        this.Q0 |= Integer.MIN_VALUE;
        return this.P0.v(null, null, this);
    }
}
