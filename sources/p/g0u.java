package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g0u {
    public static final g0u a;
    public static final g0u b;
    public static final g0u c;
    public static final g0u d;
    public static final g0u e;
    public static final g0u f;
    public static final g0u g;
    public static final g0u h;
    public static final /* synthetic */ g0u[] i;
    public static final /* synthetic */ t0z t;

    static {
        g0u g0uVar = new g0u("UNKNOWN", 0);
        a = g0uVar;
        g0u g0uVar2 = new g0u("COMPUTER", 1);
        b = g0uVar2;
        g0u g0uVar3 = new g0u("TABLET", 2);
        c = g0uVar3;
        g0u g0uVar4 = new g0u("SMARTPHONE", 3);
        d = g0uVar4;
        g0u g0uVar5 = new g0u("SPEAKER", 4);
        e = g0uVar5;
        g0u g0uVar6 = new g0u("TV", 5);
        g0u g0uVar7 = new g0u("AVR", 6);
        g0u g0uVar8 = new g0u("STB", 7);
        g0u g0uVar9 = new g0u("AUDIO_DONGLE", 8);
        g0u g0uVar10 = new g0u("GAME_CONSOLE", 9);
        g0u g0uVar11 = new g0u("CAST_VIDEO", 10);
        f = g0uVar11;
        g0u g0uVar12 = new g0u("CAST_AUDIO", 11);
        g = g0uVar12;
        g0u g0uVar13 = new g0u("AUTOMOBILE", 12);
        g0u g0uVar14 = new g0u("SMARTWATCH", 13);
        g0u g0uVar15 = new g0u("CHROMEBOOK", 14);
        h = g0uVar15;
        g0u[] g0uVarArr = {g0uVar, g0uVar2, g0uVar3, g0uVar4, g0uVar5, g0uVar6, g0uVar7, g0uVar8, g0uVar9, g0uVar10, g0uVar11, g0uVar12, g0uVar13, g0uVar14, g0uVar15, new g0u("UNKNOWN_SPOTIFY_HW", 15), new g0u("HOMETHING", 16)};
        i = g0uVarArr;
        t = new t0z(g0uVarArr);
    }

    public static g0u valueOf(String str) {
        return (g0u) Enum.valueOf(g0u.class, str);
    }

    public static g0u[] values() {
        return (g0u[]) i.clone();
    }
}
