package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class a770 implements w570, e670 {
    public static final /* synthetic */ a770[] b = {new q670("LARGE", 0, "glue2:cardLarge"), new r670("REGULAR", 1, "glue2:card")};
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    a770 EF7;

    public a770(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static a770 valueOf(String str) {
        return (a770) Enum.valueOf(a770.class, str);
    }

    public static a770[] values() {
        return (a770[]) b.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return s570.CARD.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
