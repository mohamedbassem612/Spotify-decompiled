package p;

import android.os.Handler;
import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kz20 {
    public final boolean a;
    public final AudioStream b;
    public final enh0 c;
    public final int d;
    public final int e;

    public kz20(boolean z, AudioStream audioStream, enh0 enh0Var, int i, int i2) {
        this.a = z;
        this.b = audioStream;
        this.c = enh0Var;
        this.d = i;
        this.e = i2;
    }

    public static kz20 a(kz20 kz20Var, int i, int i2) {
        boolean z = kz20Var.a;
        AudioStream audioStream = kz20Var.b;
        enh0 enh0Var = kz20Var.c;
        int i3 = kz20Var.d;
        if ((i2 & 16) != 0) {
            i = kz20Var.e;
        }
        kz20Var.getClass();
        return new kz20(z, audioStream, enh0Var, i3, i);
    }

    public final av7 b(lw7 lw7Var, Handler handler) {
        int[] iArr = gnh0.a;
        AudioStream audioStream = this.b;
        int i = iArr[audioStream.ordinal()] == 1 ? 2 : 1;
        Integer numValueOf = Integer.valueOf(iArr[audioStream.ordinal()] == 1 ? 4 : 1);
        enh0 enh0Var = this.c;
        return new av7(i, Boolean.TRUE, new ow3(Integer.valueOf(enh0Var.a), numValueOf, (byte) 20), lw7Var, handler, Boolean.valueOf(gnh0.b[enh0Var.ordinal()] == 1), this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz20)) {
            return false;
        }
        kz20 kz20Var = (kz20) obj;
        return this.a == kz20Var.a && this.b == kz20Var.b && this.c == kz20Var.c && this.d == kz20Var.d && this.e == kz20Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31);
    }

    public /* synthetic */ kz20(boolean z, AudioStream audioStream, enh0 enh0Var, int i) {
        this(z, audioStream, enh0Var, i, 0);
    }
}
