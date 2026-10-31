package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pkg {
    public static final pkg a;
    public static final pkg b;
    public static final /* synthetic */ pkg[] c;

    /* JADX INFO: Fake field, exist only in values array */
    pkg EF0;

    static {
        pkg pkgVar = new pkg("STATIC", 0);
        pkg pkgVar2 = new pkg("SANDBOX", 1);
        pkg pkgVar3 = new pkg("CARDASHIANS", 2);
        a = pkgVar3;
        pkg pkgVar4 = new pkg("CARDASHIANS_MUSIC", 3);
        b = pkgVar4;
        c = new pkg[]{pkgVar, pkgVar2, pkgVar3, pkgVar4, new pkg("TOP_STORIES", 4)};
    }

    public static pkg valueOf(String str) {
        return (pkg) Enum.valueOf(pkg.class, str);
    }

    public static pkg[] values() {
        return (pkg[]) c.clone();
    }
}
