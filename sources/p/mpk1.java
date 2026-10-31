package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mpk1 implements ppk1 {
    public final ArrayList a;

    public mpk1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpk1) && this.a.equals(((mpk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
