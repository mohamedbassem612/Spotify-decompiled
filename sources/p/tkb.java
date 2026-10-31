package p;

import android.graphics.Bitmap;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tkb {
    public final Bitmap a;
    public final long b;
    public final float c;

    public tkb(Bitmap bitmap, long j, float f) {
        this.a = bitmap;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkb)) {
            return false;
        }
        tkb tkbVar = (tkb) obj;
        return u890.j(this.a, tkbVar.a) && Offset.c(this.b, tkbVar.b) && Float.compare(this.c, tkbVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
