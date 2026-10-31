package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k5e0 implements o5e0 {
    public static final k5e0 a = new k5e0();

    @Override // p.o5e0
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        return obj instanceof k5e0;
    }

    @Override // p.o5e0
    public final Object f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function.apply(this);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p.o5e0
    public final void i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer.accept(this);
    }
}
