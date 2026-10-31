package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ktl {
    public static final ktl a;
    public static final ktl b;
    public static final ktl c;
    public static final /* synthetic */ ktl[] d;

    static {
        ktl ktlVar = new ktl("UNSPECIFIED", 0);
        a = ktlVar;
        ktl ktlVar2 = new ktl("MUSIC", 1);
        b = ktlVar2;
        ktl ktlVar3 = new ktl("TALK", 2);
        c = ktlVar3;
        d = new ktl[]{ktlVar, ktlVar2, ktlVar3};
    }

    public static ktl valueOf(String str) {
        return (ktl) Enum.valueOf(ktl.class, str);
    }

    public static ktl[] values() {
        return (ktl[]) d.clone();
    }
}
