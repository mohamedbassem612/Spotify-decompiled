package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eg9 extends qg9 {
    public final String a;

    public eg9(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg9) && u890.j(this.a, ((eg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
