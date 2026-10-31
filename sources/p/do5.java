package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class do5 {
    public static final /* synthetic */ do5[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    do5 EF5;

    static {
        do5[] do5VarArr = {new do5("DEFAULT", 0)};
        a = do5VarArr;
        b = new t0z(do5VarArr);
    }

    public static do5 valueOf(String str) {
        return (do5) Enum.valueOf(do5.class, str);
    }

    public static do5[] values() {
        return (do5[]) a.clone();
    }
}
