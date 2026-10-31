package p;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pub1 {
    public final int a;
    public final long b;
    public final Uri c;
    public final b380 d;
    public final b380 e;

    public pub1(int i, long j, Uri uri, bg11 bg11Var, bg11 bg11Var2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = b380.p(bg11Var);
        this.e = b380.p(bg11Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pub1)) {
            return false;
        }
        pub1 pub1Var = (pub1) obj;
        return this.a == pub1Var.a && this.b == pub1Var.b && Objects.equals(this.c, pub1Var.c) && Objects.equals(this.d, pub1Var.d) && Objects.equals(this.e, pub1Var.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
