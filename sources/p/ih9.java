package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ih9 implements jh9 {
    public final String a;
    public final UUID b;
    public final byte[] c;

    public ih9(String str, UUID uuid, byte[] bArr) {
        this.a = str;
        this.b = uuid;
        this.c = bArr;
    }

    @Override // p.jh9
    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public final UUID c() {
        return this.b;
    }

    public final byte[] d() {
        return this.c;
    }

    public final UUID e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ih9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ih9 ih9Var = (ih9) obj;
        if (u890.j(this.a, ih9Var.a) && u890.j(this.b, ih9Var.b)) {
            return Arrays.equals(this.c, ih9Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
