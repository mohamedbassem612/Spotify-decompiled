package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hjr extends onm {
    public String a;
    public Set b;
    public Set c;
    public Iterator d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ijr g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjr(ijr ijrVar, onm onmVar) {
        super(onmVar);
        this.g = ijrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g((String) null, (ArrayList) null, this);
    }
}
