package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aam {
    public static final aam a;
    public static final aam b;
    public static final aam c;
    public static final aam d;
    public static final aam e;
    public static final aam f;
    public static final aam g;
    public static final /* synthetic */ aam[] h;

    static {
        aam aamVar = new aam("Track", 0);
        a = aamVar;
        aam aamVar2 = new aam("Clip", 1);
        b = aamVar2;
        aam aamVar3 = new aam("Episode", 2);
        c = aamVar3;
        aam aamVar4 = new aam("Show", 3);
        d = aamVar4;
        aam aamVar5 = new aam("Kallax", 4);
        e = aamVar5;
        aam aamVar6 = new aam("PodcastChapter", 5);
        f = aamVar6;
        aam aamVar7 = new aam("Transition", 6);
        g = aamVar7;
        h = new aam[]{aamVar, aamVar2, aamVar3, aamVar4, aamVar5, aamVar6, aamVar7};
    }

    public static aam valueOf(String str) {
        return (aam) Enum.valueOf(aam.class, str);
    }

    public static aam[] values() {
        return (aam[]) h.clone();
    }
}
