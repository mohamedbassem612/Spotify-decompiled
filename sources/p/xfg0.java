package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xfg0 implements yfg0 {
    public final List a;

    public xfg0(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfg0) && this.a.equals(((xfg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
