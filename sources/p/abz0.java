package p;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class abz0 {
    public static final Set a;
    public static final w7x b;
    public static final abz0 c;
    public static final abz0 d;
    public static final /* synthetic */ abz0[] e;

    static {
        abz0 abz0Var = new abz0("Music", 0);
        c = abz0Var;
        abz0 abz0Var2 = new abz0("Talk", 1);
        d = abz0Var2;
        abz0[] abz0VarArr = {abz0Var, abz0Var2};
        e = abz0VarArr;
        a = o7h.p1(new t0z(abz0VarArr));
        b = w7x.a;
    }

    public static abz0 valueOf(String str) {
        return (abz0) Enum.valueOf(abz0.class, str);
    }

    public static abz0[] values() {
        return (abz0[]) e.clone();
    }
}
