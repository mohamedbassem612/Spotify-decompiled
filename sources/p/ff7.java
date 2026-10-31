package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ff7 extends iqo1 {
    public final String d;

    public ff7(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff7) && u890.j(this.d, ((ff7) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
