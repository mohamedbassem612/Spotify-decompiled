package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cd31 {
    public static final /* synthetic */ cd31[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    cd31 EF5;

    static {
        cd31[] cd31VarArr = {new cd31("UNSPECIFIED", 0), new cd31("MUST_USE", 1), new cd31("EXPLICITLY_IGNORABLE", 2)};
        a = cd31VarArr;
        b = new t0z(cd31VarArr);
    }

    public static cd31 valueOf(String str) {
        return (cd31) Enum.valueOf(cd31.class, str);
    }

    public static cd31[] values() {
        return (cd31[]) a.clone();
    }
}
