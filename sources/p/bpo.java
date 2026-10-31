package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bpo {
    public static final bpo N0;
    public static final /* synthetic */ bpo[] O0;
    public static final bpo X;
    public static final bpo Y;
    public static final bpo Z;
    public static final bpo a;
    public static final bpo b;
    public static final bpo c;
    public static final bpo d;
    public static final bpo e;
    public static final bpo f;
    public static final bpo g;
    public static final bpo h;
    public static final bpo i;
    public static final bpo t;

    static {
        bpo bpoVar = new bpo("IN_VOLUME", 0);
        a = bpoVar;
        bpo bpoVar2 = new bpo("OUT_VOLUME", 1);
        b = bpoVar2;
        bpo bpoVar3 = new bpo("IN_LOW_EQ", 2);
        c = bpoVar3;
        bpo bpoVar4 = new bpo("OUT_LOW_EQ", 3);
        d = bpoVar4;
        bpo bpoVar5 = new bpo("IN_FILTER_CUTOFF", 4);
        e = bpoVar5;
        bpo bpoVar6 = new bpo("OUT_FILTER_CUTOFF", 5);
        f = bpoVar6;
        bpo bpoVar7 = new bpo("IN_ECHO_DRY_WET", 6);
        g = bpoVar7;
        bpo bpoVar8 = new bpo("OUT_ECHO_DRY_WET", 7);
        h = bpoVar8;
        bpo bpoVar9 = new bpo("IN_REVERB_DRY_WET", 8);
        i = bpoVar9;
        bpo bpoVar10 = new bpo("OUT_REVERB_DRY_WET", 9);
        t = bpoVar10;
        bpo bpoVar11 = new bpo("IN_DELAY_DRY_WET", 10);
        X = bpoVar11;
        bpo bpoVar12 = new bpo("OUT_DELAY_DRY_WET", 11);
        Y = bpoVar12;
        bpo bpoVar13 = new bpo("IN_NOISE_COLOR", 12);
        Z = bpoVar13;
        bpo bpoVar14 = new bpo("OUT_NOISE_COLOR", 13);
        N0 = bpoVar14;
        O0 = new bpo[]{bpoVar, bpoVar2, bpoVar3, bpoVar4, bpoVar5, bpoVar6, bpoVar7, bpoVar8, bpoVar9, bpoVar10, bpoVar11, bpoVar12, bpoVar13, bpoVar14};
    }

    public static bpo valueOf(String str) {
        return (bpo) Enum.valueOf(bpo.class, str);
    }

    public static bpo[] values() {
        return (bpo[]) O0.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == e || this == f || this == Z || this == N0;
    }
}
