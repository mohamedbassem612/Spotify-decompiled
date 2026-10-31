package p;

import com.spotify.esperanto.esperanto.ClientBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.your_library.esperanto.proto.IsCuratedRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mwm1 extends ClientBase {
    public final Single a(YourLibraryContainsRequest yourLibraryContainsRequest) {
        return callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "Contains", yourLibraryContainsRequest).map(l9x0.Z0);
    }

    public final Observable b(YourLibraryRequest yourLibraryRequest) {
        return callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamAll", yourLibraryRequest).map(n9x0.Y0);
    }

    public final Observable c(YourLibraryDecorateRequest yourLibraryDecorateRequest) {
        return callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamDecorate", yourLibraryDecorateRequest).map(u9x0.Y0);
    }

    public final Observable d(IsCuratedRequest isCuratedRequest) {
        return callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamIsCurated", isCuratedRequest).map(vbx0.Y0);
    }
}
