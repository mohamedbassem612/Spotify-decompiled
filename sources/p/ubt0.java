package p;

import com.spotify.pamviewservice.v1.proto.PremiumPlanRow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubt0 {
    public final PremiumPlanRow a;

    public ubt0(PremiumPlanRow premiumPlanRow) {
        this.a = premiumPlanRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubt0) && u890.j(this.a, ((ubt0) obj).a);
    }

    public final int hashCode() {
        PremiumPlanRow premiumPlanRow = this.a;
        if (premiumPlanRow == null) {
            return 0;
        }
        return premiumPlanRow.hashCode();
    }
}
