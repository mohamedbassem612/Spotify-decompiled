package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sad0 implements vad0 {
    public final ArrayList a;

    public sad0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sad0) && this.a.equals(((sad0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
