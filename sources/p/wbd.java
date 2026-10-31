package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wbd {
    public static final wbd a;
    public static final wbd b;
    public static final /* synthetic */ wbd[] c;

    static {
        wbd wbdVar = new wbd("MissingChatId", 0);
        a = wbdVar;
        wbd wbdVar2 = new wbd("ChatIdMismatch", 1);
        b = wbdVar2;
        c = new wbd[]{wbdVar, wbdVar2};
    }

    public static wbd valueOf(String str) {
        return (wbd) Enum.valueOf(wbd.class, str);
    }

    public static wbd[] values() {
        return (wbd[]) c.clone();
    }
}
