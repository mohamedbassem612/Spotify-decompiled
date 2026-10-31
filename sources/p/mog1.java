package p;

import com.spotify.esperanto.esperanto.Transport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mog1 implements pog1 {
    public final Transport a;

    public mog1(Transport transport) {
        this.a = transport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mog1) && u890.j(this.a, ((mog1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
