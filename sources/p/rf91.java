package p;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rf91 {
    public final long a;
    public final long b;
    public final int c;

    public rf91(int i, long j, long j2) {
        dm5.m(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rf91.class == obj.getClass()) {
            rf91 rf91Var = (rf91) obj;
            if (this.a == rf91Var.a && this.b == rf91Var.b && this.c == rf91Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = zoi1.a;
        Locale locale = Locale.US;
        StringBuilder sbS = cy30.s(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbS.append(this.b);
        sbS.append(", speedDivisor=");
        sbS.append(this.c);
        return sbS.toString();
    }
}
