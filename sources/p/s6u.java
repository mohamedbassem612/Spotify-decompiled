package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s6u {
    public final Function0 a;
    public final Function0 b;

    public s6u(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6u)) {
            return false;
        }
        s6u s6uVar = (s6u) obj;
        return u890.j(this.a, s6uVar.a) && u890.j(this.b, s6uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
