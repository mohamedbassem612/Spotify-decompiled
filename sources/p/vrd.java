package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vrd {
    public static final vrd a;
    public static final vrd b;
    public static final vrd c;
    public static final /* synthetic */ vrd[] d;

    static {
        vrd vrdVar = new vrd("DEFAULT", 0);
        a = vrdVar;
        vrd vrdVar2 = new vrd("DOUBLE_LINE_TITLE", 1);
        b = vrdVar2;
        vrd vrdVar3 = new vrd("DOUBLE_LINE_SUBTITLE", 2);
        c = vrdVar3;
        d = new vrd[]{vrdVar, vrdVar2, vrdVar3};
        values();
    }

    public static vrd valueOf(String str) {
        return (vrd) Enum.valueOf(vrd.class, str);
    }

    public static vrd[] values() {
        return (vrd[]) d.clone();
    }
}
