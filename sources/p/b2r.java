package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b2r {
    public final DataSectionType a;
    public final DataSectionStatus b;

    public b2r(DataSectionType dataSectionType, DataSectionStatus dataSectionStatus) {
        this.a = dataSectionType;
        this.b = dataSectionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2r)) {
            return false;
        }
        b2r b2rVar = (b2r) obj;
        return this.a == b2rVar.a && u890.j(this.b, b2rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
