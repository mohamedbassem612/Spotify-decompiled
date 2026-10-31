package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bx21 implements zw21 {
    public final int a;

    public bx21(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bx21) {
            return this.a == ((bx21) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        int i = this.a;
        String string = i != 0 ? resources.getString(i) : "";
        string.getClass();
        return string;
    }
}
