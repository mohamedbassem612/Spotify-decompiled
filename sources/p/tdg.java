package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tdg {
    public static final tdg a;
    public static final tdg b;
    public static final tdg c;
    public static final /* synthetic */ tdg[] d;

    static {
        tdg tdgVar = new tdg("Cancel", 0);
        a = tdgVar;
        tdg tdgVar2 = new tdg("JoinButton", 1);
        b = tdgVar2;
        tdg tdgVar3 = new tdg("NotNowButton", 2);
        c = tdgVar3;
        d = new tdg[]{tdgVar, tdgVar2, tdgVar3};
    }

    public static tdg valueOf(String str) {
        return (tdg) Enum.valueOf(tdg.class, str);
    }

    public static tdg[] values() {
        return (tdg[]) d.clone();
    }
}
