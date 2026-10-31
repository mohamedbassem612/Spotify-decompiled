package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tne {
    public static final tne a;
    public static final tne b;
    public static final tne c;
    public static final tne d;
    public static final /* synthetic */ tne[] e;

    static {
        tne tneVar = new tne("UNKNOWN", 0);
        a = tneVar;
        tne tneVar2 = new tne("UP", 1);
        b = tneVar2;
        tne tneVar3 = new tne("DOWN", 2);
        c = tneVar3;
        tne tneVar4 = new tne("NEW", 3);
        d = tneVar4;
        e = new tne[]{tneVar, tneVar2, tneVar3, tneVar4, new tne("EQUAL", 4)};
    }

    public static tne valueOf(String str) {
        return (tne) Enum.valueOf(tne.class, str);
    }

    public static tne[] values() {
        return (tne[]) e.clone();
    }
}
