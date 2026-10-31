package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dlf1 extends elf1 {
    public final ArrayList a;

    public dlf1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlf1) && this.a.equals(((dlf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
