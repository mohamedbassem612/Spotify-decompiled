package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6r extends w6r {
    public final LocalDate a;

    public v6r(LocalDate localDate) {
        this.a = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6r) && u890.j(this.a, ((v6r) obj).a);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
