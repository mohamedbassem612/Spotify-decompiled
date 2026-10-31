package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e921 extends onm {
    public /* synthetic */ Object X;
    public final /* synthetic */ g2z Y;
    public int Z;
    public List a;
    public Map b;
    public Set c;
    public Set d;
    public List e;
    public Iterator f;
    public String g;
    public boolean h;
    public int i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e921(g2z g2zVar, onm onmVar) {
        super(onmVar);
        this.Y = g2zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.L((Map) null, false, this);
    }
}
