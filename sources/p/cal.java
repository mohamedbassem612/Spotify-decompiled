package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cal {
    public static final cal a;
    public static final cal b;
    public static final cal c;
    public static final cal d;
    public static final /* synthetic */ cal[] e;

    static {
        cal calVar = new cal("UNKNOWN", 0);
        a = calVar;
        cal calVar2 = new cal("GOOD", 1);
        b = calVar2;
        cal calVar3 = new cal("POOR", 2);
        c = calVar3;
        cal calVar4 = new cal("ABSENT", 3);
        d = calVar4;
        e = new cal[]{calVar, calVar2, calVar3, calVar4};
    }

    public static cal valueOf(String str) {
        return (cal) Enum.valueOf(cal.class, str);
    }

    public static cal[] values() {
        return (cal[]) e.clone();
    }
}
