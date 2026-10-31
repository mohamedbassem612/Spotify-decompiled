package p;

import android.net.Uri;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cdm1 {
    public final aof1 a;
    public final long b;
    public final Uri c;

    public cdm1(aof1 aof1Var, long j, Uri uri) {
        this.a = aof1Var;
        this.b = j;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdm1)) {
            return false;
        }
        cdm1 cdm1Var = (cdm1) obj;
        return this.a == cdm1Var.a && Offset.c(this.b, cdm1Var.b) && this.c.equals(cdm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
