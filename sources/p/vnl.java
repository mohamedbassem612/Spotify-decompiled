package p;

import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vnl {
    public final boolean a;
    public final mml b;
    public final YourLibraryResponseHeader c;

    public vnl(boolean z, mml mmlVar, YourLibraryResponseHeader yourLibraryResponseHeader) {
        this.a = z;
        this.b = mmlVar;
        this.c = yourLibraryResponseHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnl)) {
            return false;
        }
        vnl vnlVar = (vnl) obj;
        return this.a == vnlVar.a && u890.j(this.b, vnlVar.b) && this.c.equals(vnlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
