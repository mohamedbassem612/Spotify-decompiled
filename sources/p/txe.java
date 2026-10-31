package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class txe implements nye {
    public final String a;

    public txe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txe) && u890.j(this.a, ((txe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
