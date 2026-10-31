package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t03 extends u03 {
    public final String a;

    public t03(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t03) && u890.j(this.a, ((t03) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
