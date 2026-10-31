package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mdk0 {
    public static final mdk0 a;
    public static final /* synthetic */ mdk0[] b;

    static {
        mdk0 mdk0Var = new mdk0("OnTryOutClicked", 0);
        a = mdk0Var;
        b = new mdk0[]{mdk0Var};
    }

    public static mdk0 valueOf(String str) {
        return (mdk0) Enum.valueOf(mdk0.class, str);
    }

    public static mdk0[] values() {
        return (mdk0[]) b.clone();
    }
}
