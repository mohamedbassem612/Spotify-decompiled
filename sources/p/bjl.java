package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bjl {
    public static final bjl a;
    public static final bjl b;
    public static final bjl c;
    public static final bjl d;
    public static final /* synthetic */ bjl[] e;

    static {
        bjl bjlVar = new bjl("FIXED", 0);
        a = bjlVar;
        bjl bjlVar2 = new bjl("WRAP_CONTENT", 1);
        b = bjlVar2;
        bjl bjlVar3 = new bjl("MATCH_CONSTRAINT", 2);
        c = bjlVar3;
        bjl bjlVar4 = new bjl("MATCH_PARENT", 3);
        d = bjlVar4;
        e = new bjl[]{bjlVar, bjlVar2, bjlVar3, bjlVar4};
    }

    public static bjl valueOf(String str) {
        return (bjl) Enum.valueOf(bjl.class, str);
    }

    public static bjl[] values() {
        return (bjl[]) e.clone();
    }
}
