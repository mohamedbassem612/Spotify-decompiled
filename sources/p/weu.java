package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class weu {
    public static final weu a;
    public static final weu b;
    public static final weu c;
    public static final /* synthetic */ weu[] d;

    static {
        weu weuVar = new weu("DISMISSIBLE", 0);
        a = weuVar;
        weu weuVar2 = new weu("MINIMIZABLE", 1);
        b = weuVar2;
        weu weuVar3 = new weu("NONE", 2);
        c = weuVar3;
        d = new weu[]{weuVar, weuVar2, weuVar3};
    }

    public static weu valueOf(String str) {
        return (weu) Enum.valueOf(weu.class, str);
    }

    public static weu[] values() {
        return (weu[]) d.clone();
    }
}
