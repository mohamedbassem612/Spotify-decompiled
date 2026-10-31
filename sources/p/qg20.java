package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qg20 {
    public static final qg20 a;
    public static final qg20 b;
    public static final qg20 c;
    public static final /* synthetic */ qg20[] d;

    static {
        qg20 qg20Var = new qg20("CameraButtonClicked", 0);
        a = qg20Var;
        qg20 qg20Var2 = new qg20("AudioRecognitionButtonClicked", 1);
        b = qg20Var2;
        qg20 qg20Var3 = new qg20("ProfileClicked", 2);
        c = qg20Var3;
        d = new qg20[]{qg20Var, qg20Var2, qg20Var3};
    }

    public static qg20 valueOf(String str) {
        return (qg20) Enum.valueOf(qg20.class, str);
    }

    public static qg20[] values() {
        return (qg20[]) d.clone();
    }
}
