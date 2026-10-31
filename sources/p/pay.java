package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pay {
    public static final pay a;
    public static final pay b;
    public static final pay c;
    public static final /* synthetic */ pay[] d;

    static {
        pay payVar = new pay("PreEnter", 0);
        a = payVar;
        pay payVar2 = new pay("Visible", 1);
        b = payVar2;
        pay payVar3 = new pay("PostExit", 2);
        c = payVar3;
        d = new pay[]{payVar, payVar2, payVar3};
    }

    public static pay valueOf(String str) {
        return (pay) Enum.valueOf(pay.class, str);
    }

    public static pay[] values() {
        return (pay[]) d.clone();
    }
}
