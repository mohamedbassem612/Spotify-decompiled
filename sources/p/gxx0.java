package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxx0 {
    public final ArrayList a;

    public gxx0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxx0) && this.a.equals(((gxx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
