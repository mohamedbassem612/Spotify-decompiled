package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class swu implements hoh0 {
    public final i0v a;
    public final String b = nhc1.W(UUID.randomUUID().toString(), "-", "");

    public swu(i0v i0vVar) {
        this.a = i0vVar;
    }

    public final String a() {
        return this.a.a;
    }

    public final Map b() {
        return this.a.b;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swu) && this.a.equals(((swu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
