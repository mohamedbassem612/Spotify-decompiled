package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class olw0 implements vlw0 {
    public final String a;

    public olw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olw0) && u890.j(this.a, ((olw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
