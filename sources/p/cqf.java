package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cqf {
    public static final cqf a;
    public static final cqf b;
    public static final /* synthetic */ cqf[] c;

    static {
        cqf cqfVar = new cqf("NEWEST_FIRST", 0);
        a = cqfVar;
        cqf cqfVar2 = new cqf("OLDEST_FIRST", 1);
        b = cqfVar2;
        c = new cqf[]{cqfVar, cqfVar2};
    }

    public static cqf valueOf(String str) {
        return (cqf) Enum.valueOf(cqf.class, str);
    }

    public static cqf[] values() {
        return (cqf[]) c.clone();
    }
}
