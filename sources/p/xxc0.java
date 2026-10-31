package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xxc0 implements poa0 {
    public final String a;

    public xxc0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxc0) && this.a.equals(((xxc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
