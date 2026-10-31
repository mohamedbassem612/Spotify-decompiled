package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mmm0 implements nmm0 {
    public final List a;

    public mmm0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmm0) && this.a.equals(((mmm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
