package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ovw0 extends qvw0 {
    public final String a;

    public ovw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovw0) && this.a.equals(((ovw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
