package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ck3 implements dk3 {
    public final String a;

    public ck3(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck3) && u890.j(this.a, ((ck3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
