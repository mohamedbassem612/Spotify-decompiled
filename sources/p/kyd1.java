package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kyd1 extends lyd1 {
    public final String a;

    public kyd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyd1) && this.a.equals(((kyd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
