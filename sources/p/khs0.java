package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class khs0 {
    public final String a;
    public final Bundle b;
    public final String c;
    public final long d;

    public khs0(long j, String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = j;
    }

    public final String a() {
        return this.c;
    }

    public final Bundle b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khs0)) {
            return false;
        }
        khs0 khs0Var = (khs0) obj;
        return u890.j(this.a, khs0Var.a) && u890.j(this.b, khs0Var.b) && u890.j(this.c, khs0Var.c) && this.d == khs0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        return Long.hashCode(this.d) + cy30.d((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31, 31, this.c);
    }
}
