package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a8l {
    public static final a8l a;
    public static final a8l b;
    public static final /* synthetic */ a8l[] c;

    static {
        a8l a8lVar = new a8l("NPV", 0);
        a = a8lVar;
        a8l a8lVar2 = new a8l("NPB", 1);
        b = a8lVar2;
        c = new a8l[]{a8lVar, a8lVar2};
    }

    public static a8l valueOf(String str) {
        return (a8l) Enum.valueOf(a8l.class, str);
    }

    public static a8l[] values() {
        return (a8l[]) c.clone();
    }
}
