package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class med0 implements ned0 {
    public final ArrayList a;

    public med0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof med0) && this.a.equals(((med0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
