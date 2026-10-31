package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q681 implements t681 {
    public final ArrayList a;

    public q681(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q681) && this.a.equals(((q681) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
