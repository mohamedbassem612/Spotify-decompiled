package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fka {
    public static final fka a;
    public static final fka b;
    public static final /* synthetic */ fka[] c;

    static {
        fka fkaVar = new fka("CardClicked", 0);
        a = fkaVar;
        fka fkaVar2 = new fka("CtaButtonClicked", 1);
        b = fkaVar2;
        c = new fka[]{fkaVar, fkaVar2};
    }

    public static fka valueOf(String str) {
        return (fka) Enum.valueOf(fka.class, str);
    }

    public static fka[] values() {
        return (fka[]) c.clone();
    }
}
