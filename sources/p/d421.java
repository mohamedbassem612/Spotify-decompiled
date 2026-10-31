package p;

import android.widget.RemoteViews;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d421 {
    public final RemoteViews a;
    public final lk80 b;

    public d421(RemoteViews remoteViews, lk80 lk80Var) {
        this.a = remoteViews;
        this.b = lk80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d421)) {
            return false;
        }
        d421 d421Var = (d421) obj;
        return this.a.equals(d421Var.a) && this.b.equals(d421Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}
