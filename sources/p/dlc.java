package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dlc extends jlc {
    public final qtg a;

    public dlc(qtg qtgVar) {
        this.a = qtgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlc) && this.a.equals(((dlc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
