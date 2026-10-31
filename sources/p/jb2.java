package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jb2 {
    public static final jb2 a;
    public static final jb2 b;
    public static final jb2 c;
    public static final /* synthetic */ jb2[] d;

    static {
        jb2 jb2Var = new jb2("ContinueClick", 0);
        a = jb2Var;
        jb2 jb2Var2 = new jb2("CancelClick", 1);
        b = jb2Var2;
        jb2 jb2Var3 = new jb2("ReadMoreClick", 2);
        c = jb2Var3;
        d = new jb2[]{jb2Var, jb2Var2, jb2Var3};
    }

    public static jb2 valueOf(String str) {
        return (jb2) Enum.valueOf(jb2.class, str);
    }

    public static jb2[] values() {
        return (jb2[]) d.clone();
    }
}
