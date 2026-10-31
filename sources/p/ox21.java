package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ox21 {
    public final Resources a;
    public final Resources.Theme b;

    public ox21(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ox21.class == obj.getClass()) {
            ox21 ox21Var = (ox21) obj;
            if (this.a.equals(ox21Var.a) && n8p1.o(this.b, ox21Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return n8p1.r(new Object[]{this.a, this.b});
    }
}
