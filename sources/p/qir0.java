package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qir0 implements Serializable {
    public final String a;

    public qir0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qir0) && u890.j(this.a, ((qir0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
