package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dvj0 {
    public static final dvj0 a;
    public static final /* synthetic */ dvj0[] b;

    static {
        dvj0 dvj0Var = new dvj0("OnBarPickerClicked", 0);
        a = dvj0Var;
        b = new dvj0[]{dvj0Var};
    }

    public static dvj0 valueOf(String str) {
        return (dvj0) Enum.valueOf(dvj0.class, str);
    }

    public static dvj0[] values() {
        return (dvj0[]) b.clone();
    }
}
