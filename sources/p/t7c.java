package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t7c implements shh0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ t7c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean a(r9c r9cVar) {
        switch (this.a) {
            case 0:
                return ihc1.h0(r9cVar.b, "spotify:genre:", false);
            case 1:
                return "com.spotify.browse".equals(r9cVar.b);
            case 2:
                Set set = s4b1.f;
                return uic.x(r9cVar.b).c == blc0.k4;
            case 3:
                return r9cVar.b.equals("com.spotify.offline");
            case 4:
                return "com.spotify.recently-played".equals(r9cVar.b);
            case 5:
                return "com.spotify.your-albums".equals(r9cVar.b);
            case 6:
                return "com.spotify.your-artists".equals(r9cVar.b);
            case 7:
                return "com.spotify.your-audiobooks".equals(r9cVar.b);
            case 8:
                return "com.spotify.your-library".equals(r9cVar.b);
            case 9:
                String str = r9cVar.b;
                return "com.spotify.your-playlists".equals(str) || str.contains(":folder:");
            case 10:
                return "com.spotify.your-podcasts".equals(r9cVar.b);
            default:
                return u890.j(r9cVar.b, "com.spotify.downloaded");
        }
    }

    public final rhh0 b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (rhh0) ((ynb0) obj).get();
            case 1:
                return (rhh0) ((ynb0) obj).get();
            case 2:
                return (rhh0) ((ynb0) obj).get();
            case 3:
                return (rhh0) ((ynb0) obj).get();
            case 4:
                return (rhh0) ((ynb0) obj).get();
            case 5:
                return (rhh0) ((ynb0) obj).get();
            case 6:
                return (rhh0) ((ynb0) obj).get();
            case 7:
                return (rhh0) ((ynb0) obj).get();
            case 8:
                return (rhh0) ((ynb0) obj).get();
            case 9:
                return (rhh0) ((ynb0) obj).get();
            case 10:
                return (rhh0) ((ynb0) obj).get();
            default:
                return (rhh0) ((kly0) obj).get();
        }
    }
}
