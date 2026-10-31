package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m8h {
    public final int a;
    public final int b;
    public final int c;

    public m8h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8h)) {
            return false;
        }
        m8h m8hVar = (m8h) obj;
        return this.a == m8hVar.a && this.b == m8hVar.b && this.c == m8hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
