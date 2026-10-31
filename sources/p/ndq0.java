package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ndq0 implements ceq0 {
    public final List a;

    public ndq0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndq0) && u890.j(this.a, ((ndq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
