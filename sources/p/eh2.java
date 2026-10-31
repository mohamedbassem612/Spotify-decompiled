package p;

import com.spotify.mobius.EventSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eh2 extends hab0 implements iu30 {
    public final /* synthetic */ EventSource a;
    public final /* synthetic */ hh2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(EventSource eventSource, hh2 hh2Var) {
        super(1);
        this.a = eventSource;
        this.b = hh2Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = ah1.U0;
        casVar.b = this.a;
        casVar.d = ou1.h;
        casVar.a(ny1.Y0, dh2.a);
        casVar.g = new se2(this.b.e);
        return rih1.a;
    }
}
