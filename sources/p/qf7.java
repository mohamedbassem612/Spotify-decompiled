package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qf7 implements xf7 {
    public final List a;

    public qf7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf7) && u890.j(this.a, ((qf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
