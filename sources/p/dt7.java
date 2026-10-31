package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dt7 extends eso1 {
    public final String b;

    public dt7(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt7) && this.b.equals(((dt7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
