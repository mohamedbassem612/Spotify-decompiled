package p;

import com.spotify.concertpageview.v1.SourceReference;
import com.spotify.concertpageview.v1.TimelineAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vqe1 {
    public final TimelineAction a;
    public final SourceReference b;

    public vqe1(TimelineAction timelineAction, SourceReference sourceReference) {
        this.a = timelineAction;
        this.b = sourceReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqe1)) {
            return false;
        }
        vqe1 vqe1Var = (vqe1) obj;
        return this.a.equals(vqe1Var.a) && u890.j(this.b, vqe1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        SourceReference sourceReference = this.b;
        return iHashCode + (sourceReference == null ? 0 : sourceReference.hashCode());
    }
}
