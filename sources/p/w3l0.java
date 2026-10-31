package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w3l0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public w3l0(String str, String str2) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-creative-work-page";
        x6h1VarI.f = "7.5.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.a = x6h1VarI.a();
        this.b = p7h.M(new String[]{"album", "podcast", "podcast/episode", "shows/audio", "podcast/show/audiobook", "prerelease/audiobook", "prerelease/music-video"});
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
