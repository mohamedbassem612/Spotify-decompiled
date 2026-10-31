package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v9g {
    public static final v9g a;
    public static final v9g b;
    public static final v9g c;
    public static final v9g d;
    public static final v9g e;
    public static final /* synthetic */ v9g[] f;

    static {
        v9g v9gVar = new v9g("CURATABLE", 0);
        a = v9gVar;
        v9g v9gVar2 = new v9g("PLAYLIST", 1);
        b = v9gVar2;
        v9g v9gVar3 = new v9g("CONCERT", 2);
        c = v9gVar3;
        v9g v9gVar4 = new v9g("PRERELEASE", 3);
        d = v9gVar4;
        v9g v9gVar5 = new v9g("UNKNOWN", 4);
        e = v9gVar5;
        f = new v9g[]{v9gVar, v9gVar2, v9gVar3, v9gVar4, v9gVar5};
    }

    public static v9g valueOf(String str) {
        return (v9g) Enum.valueOf(v9g.class, str);
    }

    public static v9g[] values() {
        return (v9g[]) f.clone();
    }
}
