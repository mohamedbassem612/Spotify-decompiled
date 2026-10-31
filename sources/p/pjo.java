package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pjo {
    public static final pjo a;
    public static final pjo b;
    public static final /* synthetic */ pjo[] c;

    static {
        pjo pjoVar = new pjo("AddClicked", 0);
        a = pjoVar;
        pjo pjoVar2 = new pjo("UnbanClicked", 1);
        b = pjoVar2;
        c = new pjo[]{pjoVar, pjoVar2};
    }

    public static pjo valueOf(String str) {
        return (pjo) Enum.valueOf(pjo.class, str);
    }

    public static pjo[] values() {
        return (pjo[]) c.clone();
    }
}
