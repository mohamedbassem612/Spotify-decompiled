package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s6y {
    public static final s6y a;
    public static final s6y b;
    public static final /* synthetic */ s6y[] c;

    static {
        s6y s6yVar = new s6y("ALWAYS", 0);
        a = s6yVar;
        s6y s6yVar2 = new s6y("ONLY_IF_NOT_PUBLISHED_BEFORE", 1);
        b = s6yVar2;
        c = new s6y[]{s6yVar, s6yVar2};
    }

    public static s6y valueOf(String str) {
        return (s6y) Enum.valueOf(s6y.class, str);
    }

    public static s6y[] values() {
        return (s6y[]) c.clone();
    }
}
