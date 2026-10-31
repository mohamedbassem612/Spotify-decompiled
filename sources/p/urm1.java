package p;

import android.view.View;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class urm1 implements Connectable {
    public final p1f0 a;
    public final cn3 b;
    public final oh20 c;
    public final mxa1 d;
    public final t8h1 e;
    public Consumer f;
    public int g;

    public urm1(p1f0 p1f0Var, cn3 cn3Var, oh20 oh20Var, mxa1 mxa1Var, t8h1 t8h1Var) {
        this.a = p1f0Var;
        this.b = cn3Var;
        this.c = oh20Var;
        this.d = mxa1Var;
        this.e = t8h1Var;
    }

    public final Connection L(Consumer consumer) {
        this.f = consumer;
        return new xj81(this, (byte) 5);
    }

    public final int a(View view) {
        if (view != null) {
            return this.a.n().indexOfChild(view) - 1;
        }
        return -1;
    }
}
