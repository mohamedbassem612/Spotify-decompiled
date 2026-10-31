package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xbd {
    public static final xbd a;
    public static final xbd b;
    public static final /* synthetic */ xbd[] c;

    static {
        xbd xbdVar = new xbd("ChatIdMismatch", 0);
        a = xbdVar;
        xbd xbdVar2 = new xbd("ParticipantsMismatch", 1);
        b = xbdVar2;
        c = new xbd[]{xbdVar, xbdVar2};
    }

    public static xbd valueOf(String str) {
        return (xbd) Enum.valueOf(xbd.class, str);
    }

    public static xbd[] values() {
        return (xbd[]) c.clone();
    }
}
