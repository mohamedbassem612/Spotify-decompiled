package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w3v {
    public static final w3v a;
    public static final w3v b;
    public static final w3v c;
    public static final /* synthetic */ w3v[] d;

    static {
        w3v w3vVar = new w3v("Start", 0);
        a = w3vVar;
        w3v w3vVar2 = new w3v("Center", 1);
        b = w3vVar2;
        w3v w3vVar3 = new w3v("End", 2);
        c = w3vVar3;
        d = new w3v[]{w3vVar, w3vVar2, w3vVar3};
    }

    public static w3v valueOf(String str) {
        return (w3v) Enum.valueOf(w3v.class, str);
    }

    public static w3v[] values() {
        return (w3v[]) d.clone();
    }
}
