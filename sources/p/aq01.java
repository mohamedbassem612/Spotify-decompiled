package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aq01 implements bq01 {
    public final List a;

    public aq01(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq01) && this.a.equals(((aq01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
