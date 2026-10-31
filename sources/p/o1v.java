package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o1v {
    public static final o1v a;
    public static final o1v b;
    public static final o1v c;
    public static final o1v d;
    public static final o1v e;
    public static final /* synthetic */ o1v[] f;

    static {
        o1v o1vVar = new o1v("Empty", 0);
        a = o1vVar;
        o1v o1vVar2 = new o1v("Waiting", 1);
        b = o1vVar2;
        o1v o1vVar3 = new o1v("Downloading", 2);
        c = o1vVar3;
        o1v o1vVar4 = new o1v("Downloaded", 3);
        d = o1vVar4;
        o1v o1vVar5 = new o1v("Error", 4);
        e = o1vVar5;
        f = new o1v[]{o1vVar, o1vVar2, o1vVar3, o1vVar4, o1vVar5};
    }

    public static o1v valueOf(String str) {
        return (o1v) Enum.valueOf(o1v.class, str);
    }

    public static o1v[] values() {
        return (o1v[]) f.clone();
    }
}
