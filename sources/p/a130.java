package p;

import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a130 implements iu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ a130(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) obj;
                if (yourLibraryResponse.q().v() != 0 && yourLibraryResponse.a() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                YourLibraryResponse yourLibraryResponse2 = (YourLibraryResponse) obj;
                return Boolean.valueOf((yourLibraryResponse2.q().v() == 0 || yourLibraryResponse2.a() == 0) && yourLibraryResponse2.r().isEmpty());
            default:
                YourLibraryResponse yourLibraryResponse3 = (YourLibraryResponse) obj;
                if (yourLibraryResponse3.q().v() != 0 && yourLibraryResponse3.a() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
