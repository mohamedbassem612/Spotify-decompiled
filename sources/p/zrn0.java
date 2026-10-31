package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zrn0 extends nsn0 {
    public final UUID a;

    public zrn0(UUID uuid) {
        this.a = uuid;
    }

    public final boolean a() {
        return false;
    }

    public final String b() {
        return "backend(" + this.a + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrn0) && this.a.equals(((zrn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
