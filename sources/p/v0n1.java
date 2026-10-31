package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0n1 {
    public static final v0n1 a;
    public static final v0n1 b;
    public static final /* synthetic */ v0n1[] c;

    static {
        v0n1 v0n1Var = new v0n1("MusicLinkClicked", 0);
        a = v0n1Var;
        v0n1 v0n1Var2 = new v0n1("PodcastsLinkClicked", 1);
        b = v0n1Var2;
        c = new v0n1[]{v0n1Var, v0n1Var2};
    }

    public static v0n1 valueOf(String str) {
        return (v0n1) Enum.valueOf(v0n1.class, str);
    }

    public static v0n1[] values() {
        return (v0n1[]) c.clone();
    }
}
