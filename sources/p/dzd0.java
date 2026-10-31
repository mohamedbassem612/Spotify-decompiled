package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dzd0 extends onm {
    public iud0 a;
    public String b;
    public Consumer c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cr6 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzd0(cr6 cr6Var, lnm lnmVar) {
        super(lnmVar);
        this.f = cr6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, 0, null, null, this);
    }
}
