package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rqk1 {
    public final ArrayList a;

    public rqk1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqk1) && this.a.equals(((rqk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
