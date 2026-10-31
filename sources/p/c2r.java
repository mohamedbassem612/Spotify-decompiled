package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c2r extends DataSectionStatus {
    public final String a;
    public final String b;
    public final String c;

    public c2r(String str, String str2, String str3) {
        super((DefaultConstructorMarker) null);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2r)) {
            return false;
        }
        c2r c2rVar = (c2r) obj;
        return u890.j(this.a, c2rVar.a) && u890.j(this.b, c2rVar.b) && u890.j(this.c, c2rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
