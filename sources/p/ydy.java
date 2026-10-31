package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ydy {
    public static final ydy a;
    public static final ydy b;
    public static final /* synthetic */ ydy[] c;

    static {
        ydy ydyVar = new ydy("CardClicked", 0);
        a = ydyVar;
        ydy ydyVar2 = new ydy("CardLongClicked", 1);
        b = ydyVar2;
        c = new ydy[]{ydyVar, ydyVar2};
    }

    public static ydy valueOf(String str) {
        return (ydy) Enum.valueOf(ydy.class, str);
    }

    public static ydy[] values() {
        return (ydy[]) c.clone();
    }
}
