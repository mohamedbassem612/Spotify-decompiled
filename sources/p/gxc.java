package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gxc {
    public final UUID a;
    public final mxc b;
    public final boolean c;

    public gxc(UUID uuid, mxc mxcVar, boolean z) {
        this.a = uuid;
        this.b = mxcVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxc)) {
            return false;
        }
        gxc gxcVar = (gxc) obj;
        return this.a.equals(gxcVar.a) && this.b.equals(gxcVar.b) && this.c == gxcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
