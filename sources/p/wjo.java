package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wjo {
    public static final wjo a;
    public static final wjo b;
    public static final /* synthetic */ wjo[] c;

    static {
        wjo wjoVar = new wjo("AddClicked", 0);
        a = wjoVar;
        wjo wjoVar2 = new wjo("UnbanClicked", 1);
        b = wjoVar2;
        c = new wjo[]{wjoVar, wjoVar2};
    }

    public static wjo valueOf(String str) {
        return (wjo) Enum.valueOf(wjo.class, str);
    }

    public static wjo[] values() {
        return (wjo[]) c.clone();
    }
}
