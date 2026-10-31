package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qz81 implements uz81 {
    public final List a;

    public qz81(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz81) && this.a.equals(((qz81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
