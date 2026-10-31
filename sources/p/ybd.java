package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ybd {
    public static final ybd a;
    public static final ybd b;
    public static final ybd c;
    public static final /* synthetic */ ybd[] d;

    static {
        ybd ybdVar = new ybd("MissingRecipient", 0);
        a = ybdVar;
        ybd ybdVar2 = new ybd("MissingTrack", 1);
        b = ybdVar2;
        ybd ybdVar3 = new ybd("UnsupportedEmoji", 2);
        c = ybdVar3;
        d = new ybd[]{ybdVar, ybdVar2, ybdVar3};
    }

    public static ybd valueOf(String str) {
        return (ybd) Enum.valueOf(ybd.class, str);
    }

    public static ybd[] values() {
        return (ybd[]) d.clone();
    }
}
