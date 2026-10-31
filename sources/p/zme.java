package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zme implements lsg, Iterable, ola0 {
    public final char a;
    public final char b;

    static {
        new zme((char) 1, (char) 0, false);
    }

    public zme(char c, char c2, boolean z) {
        this.a = c;
        this.b = (char) bmq0.A(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zme)) {
            return false;
        }
        if (isEmpty() && ((zme) obj).isEmpty()) {
            return true;
        }
        zme zmeVar = (zme) obj;
        return this.a == zmeVar.a && this.b == zmeVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return u890.q(this.a, this.b) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yme(this.a, this.b);
    }

    public final Comparable m() {
        return Character.valueOf(this.a);
    }

    public final Comparable n() {
        return Character.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }

    public zme(char c, char c2) {
        this(c, c2, false);
    }
}
