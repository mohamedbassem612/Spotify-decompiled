package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tw21 implements z9h {
    public final int a;

    public tw21(int i) {
        this.a = i;
    }

    public final long a(Context context) {
        return z4p1.e(aah.a.a(context, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw21) && this.a == ((tw21) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return l1d.o(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}
