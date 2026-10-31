package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f281 {
    public static final f281 a;
    public static final f281 b;
    public static final f281 c;
    public static final f281 d;
    public static final /* synthetic */ f281[] e;

    static {
        f281 f281Var = new f281("MIXED", 0);
        a = f281Var;
        f281 f281Var2 = new f281("AUDIO", 1);
        b = f281Var2;
        f281 f281Var3 = new f281("VIDEO", 2);
        c = f281Var3;
        f281 f281Var4 = new f281("UNKNOWN", 3);
        d = f281Var4;
        e = new f281[]{f281Var, f281Var2, f281Var3, f281Var4};
        values();
    }

    public static f281 valueOf(String str) {
        return (f281) Enum.valueOf(f281.class, str);
    }

    public static f281[] values() {
        return (f281[]) e.clone();
    }
}
