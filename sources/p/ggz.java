package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ggz {
    public static final ggz a;
    public static final ggz b;
    public static final ggz c;
    public static final ggz d;
    public static final ggz e;
    public static final ggz f;
    public static final ggz g;
    public static final /* synthetic */ ggz[] h;

    static {
        ggz ggzVar = new ggz("NO_SEARCH_RESULTS", 0);
        a = ggzVar;
        ggz ggzVar2 = new ggz("NO_EVENTS_FOUND", 1);
        b = ggzVar2;
        ggz ggzVar3 = new ggz("EMPTY_SECTION", 2);
        c = ggzVar3;
        ggz ggzVar4 = new ggz("EMPTY_SECTION_FOR_LOCATION", 3);
        d = ggzVar4;
        ggz ggzVar5 = new ggz("EMPTY_INTERESTED_SECTION", 4);
        e = ggzVar5;
        ggz ggzVar6 = new ggz("EMPTY_PAST_EVENT", 5);
        f = ggzVar6;
        ggz ggzVar7 = new ggz("EMPTY_CUSTOM", 6);
        g = ggzVar7;
        h = new ggz[]{ggzVar, ggzVar2, ggzVar3, ggzVar4, ggzVar5, ggzVar6, ggzVar7};
    }

    public static ggz valueOf(String str) {
        return (ggz) Enum.valueOf(ggz.class, str);
    }

    public static ggz[] values() {
        return (ggz[]) h.clone();
    }
}
