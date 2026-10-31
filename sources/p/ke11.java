package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ke11 extends me11 {
    public final List a;

    public ke11(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke11) && this.a.equals(((ke11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
