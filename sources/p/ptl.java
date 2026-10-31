package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ptl {
    public static final ptl a;
    public static final ptl b;
    public static final /* synthetic */ ptl[] c;

    static {
        ptl ptlVar = new ptl("LONG", 0);
        a = ptlVar;
        ptl ptlVar2 = new ptl("SHORT", 1);
        b = ptlVar2;
        c = new ptl[]{ptlVar, ptlVar2};
    }

    public static ptl valueOf(String str) {
        return (ptl) Enum.valueOf(ptl.class, str);
    }

    public static ptl[] values() {
        return (ptl[]) c.clone();
    }
}
