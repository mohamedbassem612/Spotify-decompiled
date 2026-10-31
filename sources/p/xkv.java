package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xkv extends onm {
    public LinkedHashMap a;
    public alv b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zkv d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkv(zkv zkvVar, lnm lnmVar) {
        super(lnmVar);
        this.d = zkvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b((alv) null, this);
    }
}
