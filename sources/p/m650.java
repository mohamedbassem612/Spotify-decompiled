package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m650 {
    public final ArrayList a;

    public m650(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m650) && this.a.equals(((m650) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
