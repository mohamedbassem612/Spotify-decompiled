package p;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ffc1 implements eec1 {
    public final StreamStartRequestOuterClass$StreamStartRequest a;

    public ffc1(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest) {
        this.a = streamStartRequestOuterClass$StreamStartRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffc1) && this.a.equals(((ffc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
