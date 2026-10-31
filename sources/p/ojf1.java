package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ojf1 implements ez00 {
    public final ArrayList a;

    public ojf1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojf1) && this.a.equals(((ojf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
