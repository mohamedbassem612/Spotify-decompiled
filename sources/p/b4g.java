package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b4g {
    public static final b4g a;
    public static final b4g b;
    public static final /* synthetic */ b4g[] c;

    static {
        b4g b4gVar = new b4g("PRIMARY", 0);
        a = b4gVar;
        b4g b4gVar2 = new b4g("FLOATING", 1);
        b = b4gVar2;
        c = new b4g[]{b4gVar, b4gVar2};
    }

    public static b4g valueOf(String str) {
        return (b4g) Enum.valueOf(b4g.class, str);
    }

    public static b4g[] values() {
        return (b4g[]) c.clone();
    }
}
