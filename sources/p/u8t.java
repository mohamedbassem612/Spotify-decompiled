package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8t {
    public static final u8t a;
    public static final u8t b;
    public static final /* synthetic */ u8t[] c;

    static {
        u8t u8tVar = new u8t("OnDeleteButtonClicked", 0);
        a = u8tVar;
        u8t u8tVar2 = new u8t("OnCancelButtonClicked", 1);
        b = u8tVar2;
        c = new u8t[]{u8tVar, u8tVar2};
    }

    public static u8t valueOf(String str) {
        return (u8t) Enum.valueOf(u8t.class, str);
    }

    public static u8t[] values() {
        return (u8t[]) c.clone();
    }
}
