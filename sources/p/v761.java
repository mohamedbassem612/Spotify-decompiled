package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v761 implements y761 {
    public final ArrayList a;

    public v761(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v761) && this.a.equals(((v761) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
