package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uxr0 implements wxr0 {
    public final String a;

    public uxr0(String str) {
        this.a = str;
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxr0) && u890.j(this.a, ((uxr0) obj).a);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
