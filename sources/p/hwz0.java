package p;

import com.spotify.automix.esperanto.proto.EsAutomix$GetJogwheelBlocksResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetLoopingBlocksResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hwz0 {
    public final EsAutomix$GetJogwheelBlocksResponse a;
    public final EsAutomix$GetLoopingBlocksResponse b;

    public hwz0(EsAutomix$GetJogwheelBlocksResponse esAutomix$GetJogwheelBlocksResponse, EsAutomix$GetLoopingBlocksResponse esAutomix$GetLoopingBlocksResponse) {
        this.a = esAutomix$GetJogwheelBlocksResponse;
        this.b = esAutomix$GetLoopingBlocksResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwz0)) {
            return false;
        }
        hwz0 hwz0Var = (hwz0) obj;
        return u890.j(this.a, hwz0Var.a) && u890.j(this.b, hwz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
