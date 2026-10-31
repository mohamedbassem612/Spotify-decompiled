package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p3g {
    public static final p3g a;
    public static final p3g b;
    public static final /* synthetic */ p3g[] c;

    static {
        p3g p3gVar = new p3g("Chip", 0);
        a = p3gVar;
        p3g p3gVar2 = new p3g("Logo", 1);
        b = p3gVar2;
        c = new p3g[]{p3gVar, p3gVar2};
    }

    public static p3g valueOf(String str) {
        return (p3g) Enum.valueOf(p3g.class, str);
    }

    public static p3g[] values() {
        return (p3g[]) c.clone();
    }
}
