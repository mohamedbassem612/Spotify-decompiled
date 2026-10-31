package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zef1 {
    public final ArrayList a;

    public zef1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zef1) && this.a.equals(((zef1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
