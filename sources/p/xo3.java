package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xo3 extends hr3 {
    public final ArrayList a;

    public xo3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo3) && this.a.equals(((xo3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
