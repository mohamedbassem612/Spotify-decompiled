package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cf9 implements pf9 {
    public final String a;
    public final UUID b;
    public final int c;

    public cf9(String str, UUID uuid, int i) {
        this.a = str;
        this.b = uuid;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf9)) {
            return false;
        }
        cf9 cf9Var = (cf9) obj;
        return this.a.equals(cf9Var.a) && this.b.equals(cf9Var.b) && this.c == cf9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
