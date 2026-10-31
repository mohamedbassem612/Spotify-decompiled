package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d281 {
    public static final d281 a;
    public static final d281 b;
    public static final d281 c;
    public static final d281 d;
    public static final /* synthetic */ d281[] e;

    static {
        d281 d281Var = new d281("UNKNOWN", 0);
        a = d281Var;
        d281 d281Var2 = new d281("EPISODIC", 1);
        b = d281Var2;
        d281 d281Var3 = new d281("SEQUENTIAL", 2);
        c = d281Var3;
        d281 d281Var4 = new d281("RECENT", 3);
        d = d281Var4;
        e = new d281[]{d281Var, d281Var2, d281Var3, d281Var4};
        values();
    }

    public static d281 valueOf(String str) {
        return (d281) Enum.valueOf(d281.class, str);
    }

    public static d281[] values() {
        return (d281[]) e.clone();
    }
}
