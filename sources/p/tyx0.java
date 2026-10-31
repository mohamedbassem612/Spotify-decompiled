package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tyx0 implements uyx0 {
    public final ArrayList a;

    public tyx0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyx0) && this.a.equals(((tyx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
