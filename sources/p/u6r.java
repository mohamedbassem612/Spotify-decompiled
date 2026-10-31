package p;

import j$.time.YearMonth;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u6r extends w6r {
    public final YearMonth a;

    public u6r(YearMonth yearMonth) {
        this.a = yearMonth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6r) && this.a.equals(((u6r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
