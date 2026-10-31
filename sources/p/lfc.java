package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lfc {
    public static final lfc a;
    public static final lfc b;
    public static final lfc c;
    public static final /* synthetic */ lfc[] d;

    static {
        lfc lfcVar = new lfc("PRIMARY", 0);
        a = lfcVar;
        lfc lfcVar2 = new lfc("SECONDARY", 1);
        b = lfcVar2;
        lfc lfcVar3 = new lfc("TERTIARY", 2);
        c = lfcVar3;
        d = new lfc[]{lfcVar, lfcVar2, lfcVar3};
    }

    public static lfc valueOf(String str) {
        return (lfc) Enum.valueOf(lfc.class, str);
    }

    public static lfc[] values() {
        return (lfc[]) d.clone();
    }
}
