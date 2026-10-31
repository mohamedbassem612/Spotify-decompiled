package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class de9 implements ee9 {
    public final UUID a;

    public de9(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (de9.class.equals(obj != null ? obj.getClass() : null)) {
            return u890.j(this.a, ((de9) obj).a);
        }
        return false;
    }

    @Override // p.ee9
    public final UUID getUuid() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
