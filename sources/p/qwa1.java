package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qwa1 {
    public static final qwa1 a;
    public static final qwa1 b;
    public static final qwa1 c;
    public static final /* synthetic */ qwa1[] d;

    static {
        qwa1 qwa1Var = new qwa1("FeatureDisabled", 0);
        a = qwa1Var;
        qwa1 qwa1Var2 = new qwa1("Default", 1);
        b = qwa1Var2;
        qwa1 qwa1Var3 = new qwa1("OptedIn", 2);
        c = qwa1Var3;
        d = new qwa1[]{qwa1Var, qwa1Var2, qwa1Var3};
    }

    public static qwa1 valueOf(String str) {
        return (qwa1) Enum.valueOf(qwa1.class, str);
    }

    public static qwa1[] values() {
        return (qwa1[]) d.clone();
    }
}
