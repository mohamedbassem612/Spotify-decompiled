package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qbs extends onm {
    public int N0;
    public /* synthetic */ Object O0;
    public final /* synthetic */ pbq P0;
    public int Q0;
    public Collection X;
    public boolean Y;
    public int Z;
    public Set a;
    public Set b;
    public Map c;
    public Map d;
    public List e;
    public ArrayList f;
    public Collection g;
    public Iterator h;
    public String i;
    public Collection t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbs(pbq pbqVar, onm onmVar) {
        super(onmVar);
        this.P0 = pbqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.O0 = obj;
        this.Q0 |= Integer.MIN_VALUE;
        return this.P0.t(null, null, null, null, false, this);
    }
}
