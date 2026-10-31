package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ayy {
    public static final ayy a;
    public static final ayy b;
    public static final ayy c;
    public static final /* synthetic */ ayy[] d;

    static {
        ayy ayyVar = new ayy("SingleLine", 0);
        a = ayyVar;
        ayy ayyVar2 = new ayy("TwoLines", 1);
        b = ayyVar2;
        ayy ayyVar3 = new ayy("ThreeLines", 2);
        c = ayyVar3;
        d = new ayy[]{ayyVar, ayyVar2, ayyVar3, new ayy("Multiline", 3)};
    }

    public static ayy valueOf(String str) {
        return (ayy) Enum.valueOf(ayy.class, str);
    }

    public static ayy[] values() {
        return (ayy[]) d.clone();
    }
}
