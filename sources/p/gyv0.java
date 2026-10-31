package p;

import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gyv0 {
    public boolean a;
    public boolean b;
    public SpeakeasyDualResponse c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyv0)) {
            return false;
        }
        gyv0 gyv0Var = (gyv0) obj;
        return this.a == gyv0Var.a && this.b == gyv0Var.b && u890.j(this.c, gyv0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        SpeakeasyDualResponse speakeasyDualResponse = this.c;
        return iG + (speakeasyDualResponse == null ? 0 : speakeasyDualResponse.hashCode());
    }
}
