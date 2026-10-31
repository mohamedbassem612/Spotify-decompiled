package p;

import com.spotify.home.evopage.mobius.Event;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ezz implements Event {
    public final List a;
    public final boolean b;
    public final x4e0 c;
    public final String d;

    public ezz(List list, boolean z, x4e0 x4e0Var, String str) {
        this.a = list;
        this.b = z;
        this.c = x4e0Var;
        this.d = str;
    }

    public final String breadcrumb() {
        return ab80.n("GotMoreHomeStructure: ", " sections, pageToken ", this.a.size(), this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezz)) {
            return false;
        }
        ezz ezzVar = (ezz) obj;
        return this.a.equals(ezzVar.a) && this.b == ezzVar.b && this.c == ezzVar.c && this.d.equals(ezzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
