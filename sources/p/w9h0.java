package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w9h0 implements cah0 {
    public final List a;

    public w9h0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9h0) && this.a.equals(((w9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
