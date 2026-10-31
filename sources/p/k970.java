package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class k970 implements w570, e670 {
    public static final b970 b;
    public static final c970 c;
    public static final /* synthetic */ k970[] d;
    public final String a;

    static {
        b970 b970Var = new b970("ENTITY", 0, "glue:entityCard");
        b = b970Var;
        c970 c970Var = new c970("NORMAL", 1, "glue:card");
        c = c970Var;
        d = new k970[]{b970Var, c970Var};
    }

    public k970(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static k970 valueOf(String str) {
        return (k970) Enum.valueOf(k970.class, str);
    }

    public static k970[] values() {
        return (k970[]) d.clone();
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
