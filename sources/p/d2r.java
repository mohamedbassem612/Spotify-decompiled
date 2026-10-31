package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d2r extends DataSectionStatus {
    public final String a;

    public d2r(String str) {
        super(null);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2r) && u890.j(this.a, ((d2r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
