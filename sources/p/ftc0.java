package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ftc0 extends htc0 {
    public final List a;

    public ftc0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftc0) && this.a.equals(((ftc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
