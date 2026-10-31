package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rxq implements uxq {
    public final DataSectionType a;

    public rxq(DataSectionType dataSectionType) {
        this.a = dataSectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxq) && this.a == ((rxq) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
