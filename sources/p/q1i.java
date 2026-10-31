package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q1i {
    public final qzh a;
    public final ViewGroup b;

    public q1i(qzh qzhVar, ViewGroup viewGroup) {
        this.a = qzhVar;
        this.b = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1i)) {
            return false;
        }
        q1i q1iVar = (q1i) obj;
        return this.a.equals(q1iVar.a) && this.b.equals(q1iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
