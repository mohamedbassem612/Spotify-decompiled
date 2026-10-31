package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yae {
    public static final yae a;
    public static final yae b;
    public static final /* synthetic */ yae[] c;

    static {
        yae yaeVar = new yae("Settings", 0);
        a = yaeVar;
        yae yaeVar2 = new yae("Cancelled", 1);
        b = yaeVar2;
        c = new yae[]{yaeVar, yaeVar2};
    }

    public static yae valueOf(String str) {
        return (yae) Enum.valueOf(yae.class, str);
    }

    public static yae[] values() {
        return (yae[]) c.clone();
    }
}
