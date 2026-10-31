package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m5e0 implements o5e0 {
    public final Throwable a;

    public m5e0(Throwable th) {
        this.a = th;
    }

    @Override // p.o5e0
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5e0) && u890.j(this.a, ((m5e0) obj).a);
    }

    @Override // p.o5e0
    public final Object f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function8.apply(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.o5e0
    public final void i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer8.accept(this);
    }
}
