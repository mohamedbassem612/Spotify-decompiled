package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i3l0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public i3l0(a1l0 a1l0Var, String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-context-menu";
        x6h1VarI.f = "64.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = a1l0Var.a;
        x6h1VarI.d = str;
        this.a = x6h1VarI.a();
        this.b = p7h.M("contextmenu", "contextmenu/album", "contextmenu/albumprerelease", "contextmenu/artist", "contextmenu/artistconcerts", "contextmenu/audiosettings", "contextmenu/author", "contextmenu/course", "contextmenu/djcommentarysettings", "contextmenu/djlanguagesettings", "contextmenu/djnarration", "contextmenu/djsubmitfeedback", "contextmenu/entitysegments", "contextmenu/episode", "contextmenu/liveroom", "contextmenu/merch", "contextmenu/playlist", "contextmenu/track", "contextmenu/yourupdates", "contextmenu/show", "contextmenu/remotedownloads", "contextmenu/showscannablecode", "contextmenu/videosettings", "contextmenu/yourupdates/notification", "episodechapters/episodechapter/contextmenu");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        return dlg1VarS.f();
    }
}
