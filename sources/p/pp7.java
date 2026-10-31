package p;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pp7 {
    public static final pp7 d;
    public final int a;
    public final int b;
    public final t380 c;

    static {
        pp7 pp7Var;
        if (Build.VERSION.SDK_INT >= 33) {
            r380 r380Var = new r380(4);
            for (int i = 1; i <= 10; i++) {
                r380Var.g(Integer.valueOf(zoi1.x(i)));
            }
            pp7Var = new pp7(2, (Set) r380Var.i());
        } else {
            pp7Var = new pp7(2, 10);
        }
        d = pp7Var;
    }

    public pp7(int i, Set set) {
        this.a = i;
        t380 t380VarP = t380.p(set);
        this.c = t380VarP;
        mjh1 mjh1VarK = t380VarP.k();
        int iMax = 0;
        while (mjh1VarK.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) mjh1VarK.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp7)) {
            return false;
        }
        pp7 pp7Var = (pp7) obj;
        return this.a == pp7Var.a && this.b == pp7Var.b && Objects.equals(this.c, pp7Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        t380 t380Var = this.c;
        return i + (t380Var == null ? 0 : t380Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public pp7(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
