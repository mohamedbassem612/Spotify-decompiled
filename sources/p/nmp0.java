package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nmp0 {
    public static final nmp0 a;
    public static final nmp0 b;
    public static final /* synthetic */ nmp0[] c;

    static {
        nmp0 nmp0Var = new nmp0("ShareFriendLinkClicked", 0);
        a = nmp0Var;
        nmp0 nmp0Var2 = new nmp0("ShowQrCodeClicked", 1);
        b = nmp0Var2;
        c = new nmp0[]{nmp0Var, nmp0Var2};
    }

    public static nmp0 valueOf(String str) {
        return (nmp0) Enum.valueOf(nmp0.class, str);
    }

    public static nmp0[] values() {
        return (nmp0[]) c.clone();
    }
}
