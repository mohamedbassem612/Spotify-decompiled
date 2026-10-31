package p;

import com.spotify.yourupdates.domain.models.ApplicationState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0n1 extends q1n1 {
    public final ApplicationState a;

    public y0n1(ApplicationState applicationState) {
        this.a = applicationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0n1) && this.a == ((y0n1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
