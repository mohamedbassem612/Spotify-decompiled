package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z560 extends esz0 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = zoi1.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z560() {
        this.b = false;
        this.c = false;
    }

    @Override // p.esz0
    public final boolean b() {
        return this.b;
    }

    @Override // p.esz0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(esz0.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z560)) {
            return false;
        }
        z560 z560Var = (z560) obj;
        return this.c == z560Var.c && this.b == z560Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public z560(boolean z) {
        this.b = true;
        this.c = z;
    }
}
