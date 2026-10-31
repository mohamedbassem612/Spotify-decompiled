package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o6u {
    public static final o6u a;
    public static final o6u b;
    public static final /* synthetic */ o6u[] c;

    static {
        o6u o6uVar = new o6u("POSITIVE_BUTTON_CLICKED", 0);
        a = o6uVar;
        o6u o6uVar2 = new o6u("NEGATIVE_BUTTON_CLICKED", 1);
        b = o6uVar2;
        c = new o6u[]{o6uVar, o6uVar2};
    }

    public static o6u valueOf(String str) {
        return (o6u) Enum.valueOf(o6u.class, str);
    }

    public static o6u[] values() {
        return (o6u[]) c.clone();
    }
}
