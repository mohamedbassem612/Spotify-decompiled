package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class myb1 {
    public final String a;

    public myb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myb1) && this.a.equals(((myb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
