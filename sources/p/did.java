package p;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class did {
    public final Uri a;
    public final Bitmap b;
    public final gqb c;

    public did(Uri uri, Bitmap bitmap, gqb gqbVar) {
        this.a = uri;
        this.b = bitmap;
        this.c = gqbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof did)) {
            return false;
        }
        did didVar = (did) obj;
        return this.a.equals(didVar.a) && u890.j(this.b, didVar.b) && u890.j(this.c, didVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gqb gqbVar = this.c;
        return iHashCode + (gqbVar == null ? 0 : gqbVar.hashCode());
    }
}
