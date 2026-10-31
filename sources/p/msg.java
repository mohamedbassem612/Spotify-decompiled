package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class msg {
    public static final msg a;
    public static final msg b;
    public static final /* synthetic */ msg[] c;

    static {
        msg msgVar = new msg("RECOMMENDATION", 0);
        a = msgVar;
        msg msgVar2 = new msg("CONTINUATION", 1);
        b = msgVar2;
        c = new msg[]{msgVar, msgVar2};
    }

    public static msg valueOf(String str) {
        return (msg) Enum.valueOf(msg.class, str);
    }

    public static msg[] values() {
        return (msg[]) c.clone();
    }
}
