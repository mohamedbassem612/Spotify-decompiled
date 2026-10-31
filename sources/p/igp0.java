package p;

import io.reactivex.rxjava3.core.Notification;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class igp0 extends lgp0 {
    public final Notification a;

    public igp0(Notification notification) {
        this.a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igp0) && this.a.equals(((igp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.lgp0
    public final String toString() {
        return super.toString();
    }
}
