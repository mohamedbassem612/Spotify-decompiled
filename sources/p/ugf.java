package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ugf {
    public static final ugf a;
    public static final ugf b;
    public static final ugf c;
    public static final ugf d;
    public static final /* synthetic */ ugf[] e;

    static {
        ugf ugfVar = new ugf("Scheduled", 0);
        a = ugfVar;
        ugf ugfVar2 = new ugf("Live", 1);
        b = ugfVar2;
        ugf ugfVar3 = new ugf("Ended", 2);
        c = ugfVar3;
        ugf ugfVar4 = new ugf("Cancelled", 3);
        d = ugfVar4;
        e = new ugf[]{ugfVar, ugfVar2, ugfVar3, ugfVar4};
    }

    public static ugf valueOf(String str) {
        return (ugf) Enum.valueOf(ugf.class, str);
    }

    public static ugf[] values() {
        return (ugf[]) e.clone();
    }
}
