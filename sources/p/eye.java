package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eye implements nye {
    public final int a;

    public eye(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eye) && this.a == ((eye) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
