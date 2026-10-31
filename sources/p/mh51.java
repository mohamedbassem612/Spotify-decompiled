package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mh51 {
    public static final mh51 a;
    public static final /* synthetic */ mh51[] b;

    static {
        mh51 mh51Var = new mh51("ActionClicked", 0);
        a = mh51Var;
        b = new mh51[]{mh51Var};
    }

    public static mh51 valueOf(String str) {
        return (mh51) Enum.valueOf(mh51.class, str);
    }

    public static mh51[] values() {
        return (mh51[]) b.clone();
    }
}
