package p;

import com.spotify.mobius.disposables.Disposable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gre0 implements Disposable {
    public final /* synthetic */ xab1 a;
    public final /* synthetic */ x8c0 b;
    public final /* synthetic */ hre0 c;

    public gre0(xab1 xab1Var, x8c0 x8c0Var, hre0 hre0Var) {
        this.a = xab1Var;
        this.b = x8c0Var;
        this.c = hre0Var;
    }

    public final void dispose() {
        this.a.d((CancellationException) null);
        this.b.d(this.c);
    }
}
