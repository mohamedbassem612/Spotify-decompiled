package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oar0 implements Serializable {
    public final int a;

    public oar0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oar0) && this.a == ((oar0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
