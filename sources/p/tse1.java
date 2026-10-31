package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tse1 {
    public final ArrayList a;

    public tse1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tse1) && this.a.equals(((tse1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
