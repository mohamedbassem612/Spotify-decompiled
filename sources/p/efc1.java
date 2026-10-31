package p;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class efc1 implements dec1 {
    public final StreamStartRequestOuterClass$StreamStartRequest a;

    public efc1(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest) {
        this.a = streamStartRequestOuterClass$StreamStartRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efc1) && this.a.equals(((efc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
