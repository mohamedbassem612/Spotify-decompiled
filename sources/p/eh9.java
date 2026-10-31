package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eh9 implements jh9 {
    public final String a;
    public final UUID b;

    public eh9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eh9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        eh9 eh9Var = (eh9) obj;
        return u890.j(this.a, eh9Var.a) && u890.j(this.b, eh9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
