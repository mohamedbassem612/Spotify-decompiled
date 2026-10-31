package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class w650 {
    public static final v650 a;
    public static final /* synthetic */ w650[] b;

    static {
        v650 v650Var = new v650();
        a = v650Var;
        b = new w650[]{v650Var};
        values();
    }

    public static w650 valueOf(String str) {
        return (w650) Enum.valueOf(w650.class, str);
    }

    public static w650[] values() {
        return (w650[]) b.clone();
    }
}
