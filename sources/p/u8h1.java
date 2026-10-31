package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u8h1 implements Serializable {
    public final v9r0 a;

    public u8h1(v9r0 v9r0Var) {
        this.a = v9r0Var;
    }

    public final v9r0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8h1) && this.a.equals(((u8h1) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "UbiPageMetadata(pageName=" + this.a + ", isContextualPage=false)";
    }
}
