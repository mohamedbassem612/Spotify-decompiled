package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ciy {
    public final Bitmap a;
    public final gpr0 b;

    public ciy(Bitmap bitmap, gpr0 gpr0Var) {
        this.a = bitmap;
        this.b = gpr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciy)) {
            return false;
        }
        ciy ciyVar = (ciy) obj;
        return u890.j(this.a, ciyVar.a) && this.b.equals(ciyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
