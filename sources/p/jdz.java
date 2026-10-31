package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jdz {
    public static final jdz a;
    public static final jdz b;
    public static final /* synthetic */ jdz[] c;

    static {
        jdz jdzVar = new jdz("Audio", 0);
        a = jdzVar;
        jdz jdzVar2 = new jdz("Video", 1);
        b = jdzVar2;
        c = new jdz[]{jdzVar, jdzVar2};
    }

    public static jdz valueOf(String str) {
        return (jdz) Enum.valueOf(jdz.class, str);
    }

    public static jdz[] values() {
        return (jdz[]) c.clone();
    }
}
