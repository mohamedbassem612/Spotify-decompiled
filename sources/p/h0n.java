package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h0n {
    public static final h0n a;
    public static final h0n b;
    public static final /* synthetic */ h0n[] c;

    static {
        h0n h0nVar = new h0n("Resume", 0);
        a = h0nVar;
        h0n h0nVar2 = new h0n("Clear", 1);
        b = h0nVar2;
        c = new h0n[]{h0nVar, h0nVar2};
    }

    public static h0n valueOf(String str) {
        return (h0n) Enum.valueOf(h0n.class, str);
    }

    public static h0n[] values() {
        return (h0n[]) c.clone();
    }
}
