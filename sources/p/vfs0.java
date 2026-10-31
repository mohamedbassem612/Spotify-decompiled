package p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vfs0 extends ClientBase {
    public final Single a(ReplacePendingEventRequest replacePendingEventRequest) {
        return callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "ReplacePendingEvent", replacePendingEventRequest).map(yj20.U0);
    }
}
