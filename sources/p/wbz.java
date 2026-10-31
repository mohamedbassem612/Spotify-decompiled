package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wbz extends onm {
    public int X;
    public String a;
    public String b;
    public ybz c;
    public Collection d;
    public Iterator e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ xbz t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbz(xbz xbzVar, lnm lnmVar) {
        super(lnmVar);
        this.t = xbzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.X |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
