package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wwn1 {
    public static final wwn1 a;
    public static final /* synthetic */ wwn1[] b;

    static {
        wwn1 wwn1Var = new wwn1("DEFAULT", 0);
        a = wwn1Var;
        b = new wwn1[]{wwn1Var, new wwn1("SIGNED", 1), new wwn1("FIXED", 2)};
    }

    public static wwn1[] values() {
        return (wwn1[]) b.clone();
    }
}
