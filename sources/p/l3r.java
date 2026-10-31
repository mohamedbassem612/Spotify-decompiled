package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l3r {
    public static final l3r a;
    public static final l3r b;
    public static final l3r c;
    public static final l3r d;
    public static final /* synthetic */ l3r[] e;

    static {
        l3r l3rVar = new l3r("STOPPED", 0);
        a = l3rVar;
        l3r l3rVar2 = new l3r("LOADING", 1);
        b = l3rVar2;
        l3r l3rVar3 = new l3r("LOADED", 2);
        c = l3rVar3;
        l3r l3rVar4 = new l3r("ERROR", 3);
        d = l3rVar4;
        e = new l3r[]{l3rVar, l3rVar2, l3rVar3, l3rVar4};
    }

    public static l3r valueOf(String str) {
        return (l3r) Enum.valueOf(l3r.class, str);
    }

    public static l3r[] values() {
        return (l3r[]) e.clone();
    }
}
