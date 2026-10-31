package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c5e0 implements o5e0 {
    public final Object a;

    public c5e0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5e0) && u890.j(this.a, ((c5e0) obj).a);
    }

    @Override // p.o5e0
    public final Object f(Function function, Function function2, Function function3, Function function4, Function function5, Function function6, Function function7, Function function8) {
        return function5.apply(this);
    }

    @Override // p.o5e0
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // p.o5e0
    public final void i(Consumer consumer, Consumer consumer2, Consumer consumer3, Consumer consumer4, Consumer consumer5, Consumer consumer6, Consumer consumer7, Consumer consumer8) {
        consumer5.accept(this);
    }
}
