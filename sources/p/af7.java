package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class af7 extends iqo1 {
    public final String d;

    public af7(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af7) && u890.j(this.d, ((af7) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
