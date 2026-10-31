package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nu00 implements ez00 {
    public final ArrayList a;

    public nu00(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nu00) && this.a.equals(((nu00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
