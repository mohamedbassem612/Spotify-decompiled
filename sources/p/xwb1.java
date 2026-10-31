package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwb1 {
    public final List a;

    public /* synthetic */ xwb1() {
        this(z6x.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwb1) && u890.j(this.a, ((xwb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xwb1(List list) {
        this.a = list;
    }
}
