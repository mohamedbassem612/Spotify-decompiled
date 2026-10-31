package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ifk {
    public static final ifk a;
    public static final ifk b;
    public static final ifk c;
    public static final ifk d;
    public static final /* synthetic */ ifk[] e;

    static {
        ifk ifkVar = new ifk("NORMAL", 0);
        a = ifkVar;
        ifk ifkVar2 = new ifk("SMALL", 1);
        b = ifkVar2;
        ifk ifkVar3 = new ifk("LARGE", 2);
        c = ifkVar3;
        ifk ifkVar4 = new ifk("XLARGE", 3);
        d = ifkVar4;
        e = new ifk[]{ifkVar, ifkVar2, ifkVar3, ifkVar4};
    }

    public static ifk valueOf(String str) {
        return (ifk) Enum.valueOf(ifk.class, str);
    }

    public static ifk[] values() {
        return (ifk[]) e.clone();
    }
}
