package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l7l {
    public static final l7l a;
    public static final l7l b;
    public static final /* synthetic */ l7l[] c;

    static {
        l7l l7lVar = new l7l("IN_APP", 0);
        a = l7lVar;
        l7l l7lVar2 = new l7l("GOOGLE_OUTPUT_SWITCHER", 1);
        b = l7lVar2;
        c = new l7l[]{l7lVar, l7lVar2};
    }

    public static l7l valueOf(String str) {
        return (l7l) Enum.valueOf(l7l.class, str);
    }

    public static l7l[] values() {
        return (l7l[]) c.clone();
    }
}
