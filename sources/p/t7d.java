package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t7d {
    public static final t7d a;
    public static final t7d b;
    public static final t7d c;
    public static final /* synthetic */ t7d[] d;

    static {
        t7d t7dVar = new t7d("Requested", 0);
        a = t7dVar;
        t7d t7dVar2 = new t7d("Success", 1);
        b = t7dVar2;
        t7d t7dVar3 = new t7d("Error", 2);
        c = t7dVar3;
        d = new t7d[]{t7dVar, t7dVar2, t7dVar3};
    }

    public static t7d valueOf(String str) {
        return (t7d) Enum.valueOf(t7d.class, str);
    }

    public static t7d[] values() {
        return (t7d[]) d.clone();
    }
}
