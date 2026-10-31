package p;

import com.spotify.scrollsita.v1.ResponseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fbr {
    public final ResponseInfo a;
    public final ArrayList b;
    public final List c;

    public fbr(ResponseInfo responseInfo, ArrayList arrayList, List list) {
        this.a = responseInfo;
        this.b = arrayList;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbr)) {
            return false;
        }
        fbr fbrVar = (fbr) obj;
        return this.a.equals(fbrVar.a) && this.b.equals(fbrVar.b) && this.c.equals(fbrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
