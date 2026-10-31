package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class imn {
    public static final imn a;
    public static final imn b;
    public static final /* synthetic */ imn[] c;

    static {
        imn imnVar = new imn("LEADING", 0);
        a = imnVar;
        imn imnVar2 = new imn("BACKGROUND", 1);
        b = imnVar2;
        c = new imn[]{imnVar, imnVar2};
    }

    public static imn valueOf(String str) {
        return (imn) Enum.valueOf(imn.class, str);
    }

    public static imn[] values() {
        return (imn[]) c.clone();
    }
}
