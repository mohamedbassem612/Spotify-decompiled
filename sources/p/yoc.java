package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yoc {
    public static final yoc a;
    public static final /* synthetic */ yoc[] b;

    static {
        yoc yocVar = new yoc("FIRST", 0);
        a = yocVar;
        b = new yoc[]{yocVar, new yoc("SECOND", 1), new yoc("THIRD", 2), new yoc("FOURTH", 3)};
    }

    public static yoc valueOf(String str) {
        return (yoc) Enum.valueOf(yoc.class, str);
    }

    public static yoc[] values() {
        return (yoc[]) b.clone();
    }
}
