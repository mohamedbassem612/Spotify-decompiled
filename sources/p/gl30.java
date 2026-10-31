package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class gl30 {
    public static final fl30 Companion;
    public static final znb0 a;
    public static final gl30 b;
    public static final /* synthetic */ gl30[] c;

    static {
        gl30 gl30Var = new gl30("PAGE_VIEW", 0);
        b = gl30Var;
        c = new gl30[]{gl30Var};
        Companion = new fl30();
        a = dm5.S(2, bc30.d);
    }

    public static gl30 valueOf(String str) {
        return (gl30) Enum.valueOf(gl30.class, str);
    }

    public static gl30[] values() {
        return (gl30[]) c.clone();
    }
}
