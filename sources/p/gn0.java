package p;

import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gn0 extends ClientBase {
    public final Single a(AdDetectionOuterClass.MapTimestampRequest mapTimestampRequest) {
        return callSingle("spotify.ad_detection.impl.ad_detection_proto.AdDetection", "MapTimestamp", mapTimestampRequest).map(p9w.d);
    }
}
