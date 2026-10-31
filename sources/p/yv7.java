package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yv7 implements zv7 {
    public final String a;

    public yv7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv7) && u890.j(this.a, ((yv7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
