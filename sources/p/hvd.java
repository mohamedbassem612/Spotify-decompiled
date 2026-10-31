package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class hvd {
    public static final List a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        pud pudVar = pud.SIMILAR_TO;
        pud pudVar2 = pud.SIMILAR_TO_EPISODE;
        pud pudVar3 = pud.SIMILAR_TO_AUDIOBOOK;
        pud pudVar4 = pud.SUGGESTED_SONGS;
        pud pudVar5 = pud.BRIDGE_TRACKS;
        pud pudVar6 = pud.SUGGESTED_EPISODES;
        pud pudVar7 = pud.SUGGESTED_AUDIOBOOKS;
        pud pudVar8 = pud.YOUR_EPISODES;
        pud pudVar9 = pud.TOP_GENRES;
        pud pudVar10 = pud.RECENTLY_PLAYED;
        pud pudVar11 = pud.LIKED_SONGS;
        a = p7h.M(new pud[]{pudVar, pudVar2, pudVar3, pudVar4, pudVar5, pudVar6, pudVar7, pudVar8, pudVar9, pudVar10, pudVar11});
        pud pudVar12 = pud.MOST_PLAYED_SONGS;
        b = p7h.M(new pud[]{pudVar, pudVar2, pudVar3, pudVar4, pudVar5, pudVar9, pudVar12, pudVar6, pudVar7, pudVar10, pudVar11, pudVar8});
        c = p7h.M(new pud[]{pudVar, pudVar2, pudVar3, pudVar4, pudVar5, pudVar12, pudVar10, pudVar11, pudVar6, pudVar7, pudVar8});
        d = p7h.M(new pud[]{pudVar, pudVar2, pudVar6, pudVar8, pudVar4, pudVar5, pudVar9, pudVar10, pudVar11});
        e = p7h.M(new pud[]{pudVar, pudVar2, pudVar6, pudVar8, pudVar4, pudVar5, pudVar12, pudVar10, pudVar11});
        f = p7h.M(new pud[]{pudVar, pudVar2, pudVar4, pudVar5, pudVar9, pudVar12, pudVar10, pudVar11, pudVar6});
        g = p7h.M(new pud[]{pudVar3, pudVar7});
    }
}
