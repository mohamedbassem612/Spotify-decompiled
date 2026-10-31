package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t4i1 implements a5i1 {
    public final String a;

    public t4i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4i1) && u890.j(this.a, ((t4i1) obj).a);
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
