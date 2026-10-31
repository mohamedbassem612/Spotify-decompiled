package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uvx0 implements zvx0 {
    public final ArrayList a;

    public uvx0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvx0) && this.a.equals(((uvx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
