package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r60 extends onm {
    public ArrayList a;
    public w60 b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ s60 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(s60 s60Var, onm onmVar) {
        super(onmVar);
        this.f = s60Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c((List) null, this);
    }
}
