package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class apu implements bpu {
    public final ArrayList a;

    public apu(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apu) && this.a.equals(((apu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
