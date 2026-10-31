package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mik extends vik {
    public final ArrayList a;

    public mik(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mik) && this.a.equals(((mik) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
