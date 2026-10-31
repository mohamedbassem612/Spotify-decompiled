package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class on {
    public static final on b = new on(z6x.a);
    public final List a;

    public on(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on) && this.a.equals(((on) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
