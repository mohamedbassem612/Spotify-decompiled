package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ip3 extends hr3 {
    public final List a;

    public ip3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip3) && this.a.equals(((ip3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
