package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sam {
    public final ram a;
    public final int b;
    public final int c;
    public final String d;

    public sam(ram ramVar, String str, int i, int i2) {
        this.a = ramVar;
        this.d = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sam) && ((sam) obj).a.a == this.a.a;
    }

    public final int hashCode() {
        return this.a.a;
    }
}
