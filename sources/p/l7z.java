package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l7z extends yon1 {
    public final ArrayList d;
    public final j7z e;

    public l7z(ArrayList arrayList, j7z j7zVar) {
        this.d = arrayList;
        this.e = j7zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7z)) {
            return false;
        }
        l7z l7zVar = (l7z) obj;
        return this.d.equals(l7zVar.d) && this.e.equals(l7zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
