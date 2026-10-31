package p;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Notification;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jgp0 extends lgp0 {
    public final Emitter a;
    public final List b;

    public jgp0(Emitter emitter, Notification... notificationArr) {
        List listQ0 = f46.Q0(notificationArr);
        this.a = emitter;
        this.b = listQ0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgp0)) {
            return false;
        }
        jgp0 jgp0Var = (jgp0) obj;
        return this.a.equals(jgp0Var.a) && this.b.equals(jgp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // p.lgp0
    public final String toString() {
        return super.toString();
    }
}
