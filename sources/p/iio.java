package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iio implements kio {
    public final String a;

    public iio(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iio) && u890.j(this.a, ((iio) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
