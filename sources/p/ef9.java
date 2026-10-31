package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ef9 implements pf9 {
    public final String a;
    public final UUID b;
    public final int c;

    public ef9(String str, UUID uuid, int i) {
        this.a = str;
        this.b = uuid;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef9)) {
            return false;
        }
        ef9 ef9Var = (ef9) obj;
        return this.a.equals(ef9Var.a) && this.b.equals(ef9Var.b) && this.c == ef9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
