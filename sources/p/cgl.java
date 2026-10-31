package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cgl {
    public static final cgl a;
    public static final cgl b;
    public static final cgl c;
    public static final /* synthetic */ cgl[] d;

    static {
        cgl cglVar = new cgl("NOT_ELIGIBLE", 0);
        a = cglVar;
        cgl cglVar2 = new cgl("ELIGIBLE_NOT_GRANTED", 1);
        b = cglVar2;
        cgl cglVar3 = new cgl("GRANTED", 2);
        c = cglVar3;
        d = new cgl[]{cglVar, cglVar2, cglVar3};
    }

    public static cgl valueOf(String str) {
        return (cgl) Enum.valueOf(cgl.class, str);
    }

    public static cgl[] values() {
        return (cgl[]) d.clone();
    }
}
