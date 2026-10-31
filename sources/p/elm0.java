package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class elm0 extends glm0 {
    public final ArrayList a;

    public elm0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elm0) && this.a.equals(((elm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
