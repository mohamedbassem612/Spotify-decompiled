package j$.time.temporal;

import j$.nio.file.r;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class o implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public o(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static o f(long j, long j2) {
        if (j <= j2) {
            return new o(j, j, j2, j2);
        }
        r.a("Minimum value must be less than maximum value");
        return null;
    }

    public static o g(long j, long j2, long j3) {
        if (j > 1) {
            r.a("Smallest minimum value must be less than largest minimum value");
            return null;
        }
        if (j2 > j3) {
            r.a("Smallest maximum value must be less than largest maximum value");
            return null;
        }
        if (1 <= j3) {
            return new o(j, 1L, j2, j3);
        }
        r.a("Minimum value must be less than maximum value");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(TemporalField temporalField, long j) {
        if (d() && e(j)) {
            return (int) j;
        }
        r.h(c(temporalField, j));
        return 0;
    }

    public final void b(TemporalField temporalField, long j) {
        if (e(j)) {
            return;
        }
        r.h(c(temporalField, j));
    }

    public final String c(TemporalField temporalField, long j) {
        if (temporalField == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + temporalField + " (valid values " + this + "): " + j;
    }

    public final boolean d() {
        return this.a >= -2147483648L && this.d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.a && j <= this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a == oVar.a && this.b == oVar.b && this.c == oVar.c && this.d == oVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }
}
