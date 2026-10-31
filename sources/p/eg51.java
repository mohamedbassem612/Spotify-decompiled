package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eg51 {
    public final ArrayList a;

    public eg51(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg51) && this.a.equals(((eg51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
