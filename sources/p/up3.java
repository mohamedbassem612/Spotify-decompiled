package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class up3 extends hr3 {
    public final List a;

    public up3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up3) && this.a.equals(((up3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
