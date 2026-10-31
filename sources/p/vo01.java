package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vo01 implements wo01 {
    public final String a;

    public vo01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo01) && u890.j(this.a, ((vo01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
