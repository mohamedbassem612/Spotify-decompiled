package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l5e0 implements o5e0 {
    public final Throwable a;
    public final g7o0 b;

    public l5e0(Throwable th, g7o0 g7o0Var) {
        this.a = th;
        this.b = g7o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5e0)) {
            return false;
        }
        l5e0 l5e0Var = (l5e0) obj;
        return u890.j(this.a, l5e0Var.a) && this.b == l5e0Var.b;
    }

    public final Object f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function7.apply(this);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer7.accept(this);
    }
}
