package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aey {
    public static final aey N0;
    public static final aey O0;
    public static final /* synthetic */ aey[] P0;
    public static final aey X;
    public static final aey Y;
    public static final aey Z;
    public static final aey a;
    public static final aey b;
    public static final aey c;
    public static final aey d;
    public static final aey e;
    public static final aey f;
    public static final aey g;
    public static final aey h;
    public static final aey i;
    public static final aey t;

    static {
        aey aeyVar = new aey("BOOK", 0);
        a = aeyVar;
        aey aeyVar2 = new aey("SHOW", 1);
        b = aeyVar2;
        aey aeyVar3 = new aey("ALBUM", 2);
        c = aeyVar3;
        aey aeyVar4 = new aey("EVENT", 3);
        d = aeyVar4;
        aey aeyVar5 = new aey("VENUE", 4);
        e = aeyVar5;
        aey aeyVar6 = new aey("ARTIST", 5);
        f = aeyVar6;
        aey aeyVar7 = new aey("AUTHOR", 6);
        g = aeyVar7;
        aey aeyVar8 = new aey("FOLDER", 7);
        h = aeyVar8;
        aey aeyVar9 = new aey("COURSE", 8);
        i = aeyVar9;
        aey aeyVar10 = new aey("PLAYLIST", 9);
        t = aeyVar10;
        aey aeyVar11 = new aey("PRERELEASE", 10);
        X = aeyVar11;
        aey aeyVar12 = new aey("NEW_EPISODES", 11);
        Y = aeyVar12;
        aey aeyVar13 = new aey("CONCERT_CAMPAIGN", 12);
        Z = aeyVar13;
        aey aeyVar14 = new aey("ALSO_AVAILABLE_OFFLINE", 13);
        N0 = aeyVar14;
        aey aeyVar15 = new aey("ENTITY_NOT_SET", 14);
        O0 = aeyVar15;
        P0 = new aey[]{aeyVar, aeyVar2, aeyVar3, aeyVar4, aeyVar5, aeyVar6, aeyVar7, aeyVar8, aeyVar9, aeyVar10, aeyVar11, aeyVar12, aeyVar13, aeyVar14, aeyVar15};
    }

    public static aey valueOf(String str) {
        return (aey) Enum.valueOf(aey.class, str);
    }

    public static aey[] values() {
        return (aey[]) P0.clone();
    }
}
