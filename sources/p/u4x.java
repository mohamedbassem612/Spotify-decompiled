package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u4x {
    public static final u4x a;
    public static final u4x b;
    public static final u4x c;
    public static final u4x d;
    public static final /* synthetic */ u4x[] e;

    static {
        u4x u4xVar = new u4x("FLAT", 0);
        a = u4xVar;
        u4x u4xVar2 = new u4x("SQUARE", 1);
        b = u4xVar2;
        u4x u4xVar3 = new u4x("SQUARE_WITH_SKIN_TONE_CIRCLE", 2);
        c = u4xVar3;
        u4x u4xVar4 = new u4x("BIDIRECTIONAL", 3);
        d = u4xVar4;
        e = new u4x[]{u4xVar, u4xVar2, u4xVar3, u4xVar4};
    }

    public static u4x valueOf(String str) {
        return (u4x) Enum.valueOf(u4x.class, str);
    }

    public static u4x[] values() {
        return (u4x[]) e.clone();
    }
}
