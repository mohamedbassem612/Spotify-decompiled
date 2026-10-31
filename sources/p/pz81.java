package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pz81 implements yz81 {
    public final List a;

    public pz81(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz81) && this.a.equals(((pz81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
