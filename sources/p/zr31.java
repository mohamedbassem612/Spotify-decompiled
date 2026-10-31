package p;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zr31 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final CharSequence e;

    public zr31(yr31 yr31Var) {
        this.a = (String) yr31Var.d;
        this.b = yr31Var.a;
        this.c = yr31Var.b;
        int i = yr31Var.c;
        this.d = i;
        CharSequence charSequence = (CharSequence) yr31Var.e;
        this.e = charSequence;
        o0c.k("The custom subtext message cannot be null if subtext is SUBTEXT_CUSTOM.", (i == 10000 && charSequence == null) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr31)) {
            return false;
        }
        zr31 zr31Var = (zr31) obj;
        return this.a.equals(zr31Var.a) && this.b == zr31Var.b && this.c == zr31Var.c && this.d == zr31Var.d && TextUtils.equals(this.e, zr31Var.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }
}
