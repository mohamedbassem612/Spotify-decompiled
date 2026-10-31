package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class so61 implements wo61 {
    public final String a;

    public so61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so61) && this.a.equals(((so61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
