package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lxy {
    public static final lxy a;
    public static final lxy b;
    public static final /* synthetic */ lxy[] c;

    static {
        lxy lxyVar = new lxy("SingleLine", 0);
        a = lxyVar;
        lxy lxyVar2 = new lxy("TwoLines", 1);
        b = lxyVar2;
        c = new lxy[]{lxyVar, lxyVar2, new lxy("ThreeLines", 2), new lxy("Multiline", 3)};
    }

    public static lxy valueOf(String str) {
        return (lxy) Enum.valueOf(lxy.class, str);
    }

    public static lxy[] values() {
        return (lxy[]) c.clone();
    }
}
