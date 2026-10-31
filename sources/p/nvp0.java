package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nvp0 {
    public final ArrayList a;

    public nvp0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvp0) && this.a.equals(((nvp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
