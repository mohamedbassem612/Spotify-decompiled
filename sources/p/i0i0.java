package p;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class i0i0 {
    public final String a;
    public final int b;
    public final int c;

    public i0i0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0i0)) {
            return false;
        }
        i0i0 i0i0Var = (i0i0) obj;
        int i = i0i0Var.c;
        String str = i0i0Var.a;
        int i2 = i0i0Var.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
