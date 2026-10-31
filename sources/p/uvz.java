package p;

import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uvz implements o700 {
    public final SubmitFormResponse a;
    public final Map b;

    public uvz(SubmitFormResponse submitFormResponse, Map map) {
        this.a = submitFormResponse;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvz)) {
            return false;
        }
        uvz uvzVar = (uvz) obj;
        return u890.j(this.a, uvzVar.a) && this.b.equals(uvzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
