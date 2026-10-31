package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u8w {
    public static final u8w a;
    public static final u8w b;
    public static final u8w c;
    public static final /* synthetic */ u8w[] d;

    static {
        u8w u8wVar = new u8w("INTRO", 0);
        a = u8wVar;
        u8w u8wVar2 = new u8w("HANDS_FREE", 1);
        b = u8wVar2;
        u8w u8wVar3 = new u8w("SEE", 2);
        c = u8wVar3;
        d = new u8w[]{u8wVar, u8wVar2, u8wVar3};
    }

    public static u8w valueOf(String str) {
        return (u8w) Enum.valueOf(u8w.class, str);
    }

    public static u8w[] values() {
        return (u8w[]) d.clone();
    }
}
