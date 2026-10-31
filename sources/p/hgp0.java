package p;

import io.reactivex.rxjava3.core.Notification;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hgp0 extends lgp0 {
    public final Notification a;

    public hgp0(Notification notification) {
        this.a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgp0) && this.a.equals(((hgp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (q490.e.hashCode() * 31);
    }

    @Override // p.lgp0
    public final String toString() {
        return super.toString();
    }
}
