package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ilw {
    public static final ilw a;
    public static final ilw b;
    public static final ilw c;
    public static final ilw d;
    public static final ilw e;
    public static final ilw f;
    public static final ilw g;
    public static final ilw h;
    public static final /* synthetic */ ilw[] i;

    static {
        ilw ilwVar = new ilw("INVALID", 0);
        a = ilwVar;
        ilw ilwVar2 = new ilw("PLAYLIST", 1);
        b = ilwVar2;
        ilw ilwVar3 = new ilw("COLLECTION", 2);
        c = ilwVar3;
        ilw ilwVar4 = new ilw("YOUR_LIBRARY", 3);
        d = ilwVar4;
        ilw ilwVar5 = new ilw("LIVE_EVENTS", 4);
        e = ilwVar5;
        ilw ilwVar6 = new ilw("PLAYABLE_CACHE", 5);
        f = ilwVar6;
        ilw ilwVar7 = new ilw("TRANSITION", 6);
        g = ilwVar7;
        ilw ilwVar8 = new ilw("PRERELEASE", 7);
        h = ilwVar8;
        i = new ilw[]{ilwVar, ilwVar2, ilwVar3, ilwVar4, ilwVar5, ilwVar6, ilwVar7, ilwVar8};
    }

    public static ilw valueOf(String str) {
        return (ilw) Enum.valueOf(ilw.class, str);
    }

    public static ilw[] values() {
        return (ilw[]) i.clone();
    }
}
