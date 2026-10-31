package p;

import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ContentResumedEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f5m {
    public final ResumptionProgressEsperanto$ContentResumedEvent a;
    public final long b;

    public f5m(ResumptionProgressEsperanto$ContentResumedEvent resumptionProgressEsperanto$ContentResumedEvent, long j) {
        this.a = resumptionProgressEsperanto$ContentResumedEvent;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5m)) {
            return false;
        }
        f5m f5mVar = (f5m) obj;
        return this.a.equals(f5mVar.a) && this.b == f5mVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
