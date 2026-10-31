package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rxc0 implements poa0 {
    public final String a;

    public rxc0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxc0) && u890.j(this.a, ((rxc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
