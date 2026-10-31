package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vk51 {
    public static final vk51 a;
    public static final vk51 b;
    public static final vk51 c;
    public static final /* synthetic */ vk51[] d;

    static {
        vk51 vk51Var = new vk51("SeeMoreClicked", 0);
        a = vk51Var;
        vk51 vk51Var2 = new vk51("SeeLessClicked", 1);
        b = vk51Var2;
        vk51 vk51Var3 = new vk51("DisplayTextClicked", 2);
        c = vk51Var3;
        d = new vk51[]{vk51Var, vk51Var2, vk51Var3};
    }

    public static vk51 valueOf(String str) {
        return (vk51) Enum.valueOf(vk51.class, str);
    }

    public static vk51[] values() {
        return (vk51[]) d.clone();
    }
}
