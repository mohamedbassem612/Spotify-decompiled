package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aec {
    public static final aec a;
    public static final aec b;
    public static final /* synthetic */ aec[] c;

    static {
        aec aecVar = new aec("DARK", 0);
        a = aecVar;
        aec aecVar2 = new aec("LIGHT", 1);
        b = aecVar2;
        c = new aec[]{aecVar, aecVar2};
    }

    public static aec valueOf(String str) {
        return (aec) Enum.valueOf(aec.class, str);
    }

    public static aec[] values() {
        return (aec[]) c.clone();
    }
}
