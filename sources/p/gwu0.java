package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gwu0 implements ez00 {
    public final List a;

    public gwu0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwu0) && u890.j(this.a, ((gwu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
