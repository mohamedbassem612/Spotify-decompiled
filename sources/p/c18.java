package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c18 {
    public static final c18 e = new c18(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c18(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = zoi1.P(i3) ? zoi1.z(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c18)) {
            return false;
        }
        c18 c18Var = (c18) obj;
        return this.a == c18Var.a && this.b == c18Var.b && this.c == c18Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return l1d.o(sb, this.c, ']');
    }

    public c18(ie30 ie30Var) {
        this(ie30Var.L, ie30Var.J, ie30Var.M);
    }
}
