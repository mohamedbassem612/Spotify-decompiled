package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class brj0 {
    public static final brj0 a;
    public static final brj0 b;
    public static final brj0 c;
    public static final /* synthetic */ brj0[] d;
    public static final /* synthetic */ t0z e;

    static {
        brj0 brj0Var = new brj0("UNSPECIFIED", 0);
        a = brj0Var;
        brj0 brj0Var2 = new brj0("DJ", 1);
        brj0 brj0Var3 = new brj0("AGENT", 2);
        b = brj0Var3;
        brj0 brj0Var4 = new brj0("AUDIO_RECOGNITION", 3);
        c = brj0Var4;
        brj0[] brj0VarArr = {brj0Var, brj0Var2, brj0Var3, brj0Var4};
        d = brj0VarArr;
        e = new t0z(brj0VarArr);
    }

    public static brj0 valueOf(String str) {
        return (brj0) Enum.valueOf(brj0.class, str);
    }

    public static brj0[] values() {
        return (brj0[]) d.clone();
    }
}
