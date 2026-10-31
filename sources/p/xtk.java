package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xtk {
    public static final xtk a;
    public static final xtk b;
    public static final xtk c;
    public static final xtk d;
    public static final xtk e;
    public static final /* synthetic */ xtk[] f;

    static {
        xtk xtkVar = new xtk("RetryingInBackground", 0);
        a = xtkVar;
        xtk xtkVar2 = new xtk("RetryingAfterUserAction", 1);
        b = xtkVar2;
        xtk xtkVar3 = new xtk("WaitingForNextAttempt", 2);
        c = xtkVar3;
        xtk xtkVar4 = new xtk("Exhausted", 3);
        d = xtkVar4;
        xtk xtkVar5 = new xtk("Complete", 4);
        e = xtkVar5;
        f = new xtk[]{xtkVar, xtkVar2, xtkVar3, xtkVar4, xtkVar5};
    }

    public static xtk valueOf(String str) {
        return (xtk) Enum.valueOf(xtk.class, str);
    }

    public static xtk[] values() {
        return (xtk[]) f.clone();
    }
}
