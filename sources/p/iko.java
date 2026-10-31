package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iko {
    public static final iko a;
    public static final iko b;
    public static final iko c;
    public static final /* synthetic */ iko[] d;

    static {
        iko ikoVar = new iko("ADDED", 0);
        a = ikoVar;
        iko ikoVar2 = new iko("NOT_ADDED", 1);
        b = ikoVar2;
        iko ikoVar3 = new iko("UNAVAILABLE", 2);
        c = ikoVar3;
        d = new iko[]{ikoVar, ikoVar2, ikoVar3};
    }

    public static iko valueOf(String str) {
        return (iko) Enum.valueOf(iko.class, str);
    }

    public static iko[] values() {
        return (iko[]) d.clone();
    }
}
