package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8v {
    public static final r8v a;
    public static final r8v b;
    public static final r8v c;
    public static final /* synthetic */ r8v[] d;

    static {
        r8v r8vVar = new r8v("INSTANT", 0);
        a = r8vVar;
        r8v r8vVar2 = new r8v("ANIMATE", 1);
        b = r8vVar2;
        r8v r8vVar3 = new r8v("GONE", 2);
        c = r8vVar3;
        d = new r8v[]{r8vVar, r8vVar2, r8vVar3};
    }

    public static r8v valueOf(String str) {
        return (r8v) Enum.valueOf(r8v.class, str);
    }

    public static r8v[] values() {
        return (r8v[]) d.clone();
    }
}
