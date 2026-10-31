package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qr50 {
    public static final qr50 a;
    public static final qr50 b;
    public static final qr50 c;
    public static final /* synthetic */ qr50[] d;

    static {
        qr50 qr50Var = new qr50("Cursor", 0);
        a = qr50Var;
        qr50 qr50Var2 = new qr50("SelectionStart", 1);
        b = qr50Var2;
        qr50 qr50Var3 = new qr50("SelectionEnd", 2);
        c = qr50Var3;
        d = new qr50[]{qr50Var, qr50Var2, qr50Var3};
    }

    public static qr50 valueOf(String str) {
        return (qr50) Enum.valueOf(qr50.class, str);
    }

    public static qr50[] values() {
        return (qr50[]) d.clone();
    }
}
