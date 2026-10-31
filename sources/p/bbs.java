package p;

import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bbs {
    public final f130 a;
    public final YourLibraryResponse b;
    public final Map c;

    public bbs(f130 f130Var, YourLibraryResponse yourLibraryResponse, Map map) {
        this.a = f130Var;
        this.b = yourLibraryResponse;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbs)) {
            return false;
        }
        bbs bbsVar = (bbs) obj;
        return u890.j(this.a, bbsVar.a) && u890.j(this.b, bbsVar.b) && u890.j(this.c, bbsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }
}
