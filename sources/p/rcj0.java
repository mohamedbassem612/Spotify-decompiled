package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rcj0 {
    public static final rcj0 a;
    public static final rcj0 b;
    public static final rcj0 c;
    public static final /* synthetic */ rcj0[] d;

    static {
        rcj0 rcj0Var = new rcj0("IDLE", 0);
        a = rcj0Var;
        rcj0 rcj0Var2 = new rcj0("SENDING", 1);
        b = rcj0Var2;
        rcj0 rcj0Var3 = new rcj0("INVITED", 2);
        c = rcj0Var3;
        d = new rcj0[]{rcj0Var, rcj0Var2, rcj0Var3};
    }

    public static rcj0 valueOf(String str) {
        return (rcj0) Enum.valueOf(rcj0.class, str);
    }

    public static rcj0[] values() {
        return (rcj0[]) d.clone();
    }
}
