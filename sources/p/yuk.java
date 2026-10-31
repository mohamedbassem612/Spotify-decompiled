package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yuk {
    public static final yuk a;
    public static final yuk b;
    public static final /* synthetic */ yuk[] c;

    static {
        yuk yukVar = new yuk("DeleteClicked", 0);
        a = yukVar;
        yuk yukVar2 = new yuk("CancelClicked", 1);
        b = yukVar2;
        c = new yuk[]{yukVar, yukVar2};
    }

    public static yuk valueOf(String str) {
        return (yuk) Enum.valueOf(yuk.class, str);
    }

    public static yuk[] values() {
        return (yuk[]) c.clone();
    }
}
