package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rog0 {
    public static final pog0 a;
    public static final qog0 b;
    public static final /* synthetic */ rog0[] c;

    static {
        pog0 pog0Var = new pog0();
        a = pog0Var;
        qog0 qog0Var = new qog0();
        b = qog0Var;
        c = new rog0[]{pog0Var, qog0Var};
    }

    public static rog0 valueOf(String str) {
        return (rog0) Enum.valueOf(rog0.class, str);
    }

    public static rog0[] values() {
        return (rog0[]) c.clone();
    }

    public mfz a() {
        return kfz.a;
    }
}
