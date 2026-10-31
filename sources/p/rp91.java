package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rp91 {
    public static final rp91 a;
    public static final rp91 b;
    public static final rp91 c;
    public static final /* synthetic */ rp91[] d;

    static {
        rp91 rp91Var = new rp91("LINEAR", 0);
        a = rp91Var;
        rp91 rp91Var2 = new rp91("SHUFFLE", 1);
        b = rp91Var2;
        rp91 rp91Var3 = new rp91("SMART_SHUFFLE", 2);
        c = rp91Var3;
        d = new rp91[]{rp91Var, rp91Var2, rp91Var3};
    }

    public static rp91 valueOf(String str) {
        return (rp91) Enum.valueOf(rp91.class, str);
    }

    public static rp91[] values() {
        return (rp91[]) d.clone();
    }
}
