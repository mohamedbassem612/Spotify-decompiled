package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vee {
    public static final vee a;
    public static final vee b;
    public static final /* synthetic */ vee[] c;

    static {
        vee veeVar = new vee("Clicked", 0);
        a = veeVar;
        vee veeVar2 = new vee("LongClicked", 1);
        b = veeVar2;
        c = new vee[]{veeVar, veeVar2};
    }

    public static vee valueOf(String str) {
        return (vee) Enum.valueOf(vee.class, str);
    }

    public static vee[] values() {
        return (vee[]) c.clone();
    }
}
