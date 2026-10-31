package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class blg0 {
    public static final blg0 a;
    public static final blg0 b;
    public static final /* synthetic */ blg0[] c;

    static {
        blg0 blg0Var = new blg0("Image", 0);
        a = blg0Var;
        blg0 blg0Var2 = new blg0("Popup", 1);
        b = blg0Var2;
        c = new blg0[]{blg0Var, blg0Var2};
    }

    public static blg0 valueOf(String str) {
        return (blg0) Enum.valueOf(blg0.class, str);
    }

    public static blg0[] values() {
        return (blg0[]) c.clone();
    }
}
