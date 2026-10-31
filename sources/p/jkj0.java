package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jkj0 implements kkj0 {
    public final View a;
    public final boolean b;

    public jkj0(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkj0)) {
            return false;
        }
        jkj0 jkj0Var = (jkj0) obj;
        return u890.j(this.a, jkj0Var.a) && this.b == jkj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
