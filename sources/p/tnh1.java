package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tnh1 {
    public final ArrayList a;

    public tnh1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnh1) && this.a.equals(((tnh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
