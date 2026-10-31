package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xxy {
    public static final xxy a;
    public static final /* synthetic */ xxy[] b;

    static {
        xxy xxyVar = new xxy("Default", 0);
        a = xxyVar;
        b = new xxy[]{xxyVar, new xxy("Small", 1)};
    }

    public static xxy valueOf(String str) {
        return (xxy) Enum.valueOf(xxy.class, str);
    }

    public static xxy[] values() {
        return (xxy[]) b.clone();
    }
}
