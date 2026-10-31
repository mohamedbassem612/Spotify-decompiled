package p;

import com.spotify.cosmos.util.proto.EpisodeShowMetadata;
import com.spotify.cosmos.util.proto.ImageGroup;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class shh1 implements qhh1 {
    public final ga81 a;
    public final lv00 b;

    public shh1(ga81 ga81Var, lv00 lv00Var) {
        this.a = ga81Var;
        this.b = lv00Var;
    }

    public static cen a(ImageGroup imageGroup) {
        if (imageGroup == null) {
            return new cen("", (String) null, (String) null, (String) null);
        }
        String standardLink = imageGroup.getStandardLink();
        if (standardLink == null) {
            standardLink = "";
        }
        String smallLink = imageGroup.getSmallLink();
        if (smallLink == null) {
            smallLink = "";
        }
        String largeLink = imageGroup.getLargeLink();
        if (largeLink == null) {
            largeLink = "";
        }
        String xlargeLink = imageGroup.getXlargeLink();
        return new cen(standardLink, smallLink, largeLink, xlargeLink != null ? xlargeLink : "");
    }

    public static g281 b(EpisodeShowMetadata episodeShowMetadata) {
        b7x b7xVar = b7x.a;
        rwp0 rwp0Var = rwp0.a;
        ru00 ru00Var = tu00.a;
        if (episodeShowMetadata == null) {
            return new g281("", "", "", "", 0L, "", (String) null, new cen(), false, false, false, "", -1L, "", "", 0, f281.d, d281.a, e281.a, false, false, ru00Var, rwp0Var, 1, b7xVar, 134217728);
        }
        cen cenVarA = episodeShowMetadata.hasCovers() ? a(episodeShowMetadata.getCovers()) : a(null);
        f281 f281Var = f281.d;
        d281 d281Var = d281.a;
        e281 e281Var = e281.a;
        String link = episodeShowMetadata.getLink();
        String name = episodeShowMetadata.getName();
        String publisher = episodeShowMetadata.getPublisher();
        if (publisher == null) {
            publisher = "";
        }
        return new g281(link, name, publisher, "", 0L, "", (String) null, cenVarA, false, false, false, "", -1L, "", "", 0, f281Var, d281Var, e281Var, false, false, ru00Var, rwp0Var, 1, b7xVar, 134217728);
    }

    public static boolean c(e3z e3zVar, String str) {
        Map map = e3zVar != null ? e3zVar.c : null;
        if (map == null || !map.containsKey(str)) {
            return false;
        }
        return u890.j(map.get(str), Boolean.TRUE);
    }

    public static boolean d(e3z e3zVar, String str) {
        aqa0 aqa0Var;
        Map map = (e3zVar == null || (aqa0Var = e3zVar.a) == null) ? null : aqa0Var.a;
        if (map == null || !map.containsKey(str)) {
            return false;
        }
        return u890.j(map.get(str), Boolean.TRUE);
    }
}
