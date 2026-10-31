package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o8v {
    public static final o8v a;
    public static final /* synthetic */ o8v[] b;

    static {
        o8v o8vVar = new o8v("Closed", 0);
        a = o8vVar;
        b = new o8v[]{o8vVar, new o8v("Open", 1)};
    }

    public static o8v valueOf(String str) {
        return (o8v) Enum.valueOf(o8v.class, str);
    }

    public static o8v[] values() {
        return (o8v[]) b.clone();
    }
}
