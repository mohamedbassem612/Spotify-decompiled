package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ezi0 extends gzi0 {
    public final String a;

    public ezi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezi0) && this.a.equals(((ezi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
