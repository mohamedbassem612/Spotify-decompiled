package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class he1 {
    public static final he1 a;
    public static final /* synthetic */ he1[] b;

    static {
        he1 he1Var = new he1("LinkClicked", 0);
        a = he1Var;
        b = new he1[]{he1Var};
    }

    public static he1 valueOf(String str) {
        return (he1) Enum.valueOf(he1.class, str);
    }

    public static he1[] values() {
        return (he1[]) b.clone();
    }
}
