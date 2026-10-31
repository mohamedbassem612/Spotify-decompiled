package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hr91 {
    public static final hr91 a;
    public static final /* synthetic */ hr91[] b;

    static {
        hr91 hr91Var = new hr91("Short", 0);
        a = hr91Var;
        b = new hr91[]{hr91Var, new hr91("Long", 1), new hr91("Indefinite", 2)};
    }

    public static hr91 valueOf(String str) {
        return (hr91) Enum.valueOf(hr91.class, str);
    }

    public static hr91[] values() {
        return (hr91[]) b.clone();
    }
}
