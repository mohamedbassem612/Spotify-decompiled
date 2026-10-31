package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wjd {
    public static final wjd a;
    public static final wjd b;
    public static final /* synthetic */ wjd[] c;

    static {
        wjd wjdVar = new wjd("DOWNLOADING", 0);
        a = wjdVar;
        wjd wjdVar2 = new wjd("DOWNLOADED", 1);
        b = wjdVar2;
        c = new wjd[]{wjdVar, wjdVar2};
    }

    public static wjd valueOf(String str) {
        return (wjd) Enum.valueOf(wjd.class, str);
    }

    public static wjd[] values() {
        return (wjd[]) c.clone();
    }
}
