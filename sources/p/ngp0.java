package p;

import io.reactivex.rxjava3.core.Notification;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ngp0 extends pgp0 {
    public final Notification a;

    public ngp0(Notification notification) {
        this.a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngp0) && this.a.equals(((ngp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
