package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f0u {
    public static final f0u N0;
    public static final f0u O0;
    public static final f0u P0;
    public static final f0u Q0;
    public static final f0u R0;
    public static final /* synthetic */ f0u[] S0;
    public static final /* synthetic */ t0z T0;
    public static final f0u X;
    public static final f0u Y;
    public static final f0u Z;
    public static final f0u a;
    public static final f0u b;
    public static final f0u c;
    public static final f0u d;
    public static final f0u e;
    public static final f0u f;
    public static final f0u g;
    public static final f0u h;
    public static final f0u i;
    public static final f0u t;

    static {
        f0u f0uVar = new f0u("UNKNOWN", 0);
        a = f0uVar;
        f0u f0uVar2 = new f0u("COMPUTER", 1);
        b = f0uVar2;
        f0u f0uVar3 = new f0u("TABLET", 2);
        c = f0uVar3;
        f0u f0uVar4 = new f0u("SMARTPHONE", 3);
        d = f0uVar4;
        f0u f0uVar5 = new f0u("SPEAKER", 4);
        e = f0uVar5;
        f0u f0uVar6 = new f0u("TV", 5);
        f = f0uVar6;
        f0u f0uVar7 = new f0u("AVR", 6);
        g = f0uVar7;
        f0u f0uVar8 = new f0u("STB", 7);
        h = f0uVar8;
        f0u f0uVar9 = new f0u("AUDIO_DONGLE", 8);
        i = f0uVar9;
        f0u f0uVar10 = new f0u("GAME_CONSOLE", 9);
        t = f0uVar10;
        f0u f0uVar11 = new f0u("CAST_VIDEO", 10);
        X = f0uVar11;
        f0u f0uVar12 = new f0u("CAST_AUDIO", 11);
        Y = f0uVar12;
        f0u f0uVar13 = new f0u("AUTOMOBILE", 12);
        Z = f0uVar13;
        f0u f0uVar14 = new f0u("SMARTWATCH", 13);
        N0 = f0uVar14;
        f0u f0uVar15 = new f0u("CHROMEBOOK", 14);
        O0 = f0uVar15;
        f0u f0uVar16 = new f0u("UNKNOWN_SPOTIFY_HW", 15);
        P0 = f0uVar16;
        f0u f0uVar17 = new f0u("HOMETHING", 16);
        Q0 = f0uVar17;
        f0u f0uVar18 = new f0u("GLASSES", 17);
        R0 = f0uVar18;
        f0u[] f0uVarArr = {f0uVar, f0uVar2, f0uVar3, f0uVar4, f0uVar5, f0uVar6, f0uVar7, f0uVar8, f0uVar9, f0uVar10, f0uVar11, f0uVar12, f0uVar13, f0uVar14, f0uVar15, f0uVar16, f0uVar17, f0uVar18};
        S0 = f0uVarArr;
        T0 = new t0z(f0uVarArr);
    }

    public static f0u valueOf(String str) {
        return (f0u) Enum.valueOf(f0u.class, str);
    }

    public static f0u[] values() {
        return (f0u[]) S0.clone();
    }
}
