package p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ykv extends onm {
    public Iterator a;
    public LinkedHashMap b;
    public alv c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zkv f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykv(zkv zkvVar, onm onmVar) {
        super(onmVar);
        this.f = zkvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
