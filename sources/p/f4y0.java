package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f4y0 extends n4y0 implements l4y0 {
    public final String a;

    public f4y0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4y0) && this.a.equals(((f4y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
