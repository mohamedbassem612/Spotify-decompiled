package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class onk implements snk {
    public final List a;

    public onk(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onk) && u890.j(this.a, ((onk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
