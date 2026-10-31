package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a131 {
    public static final /* synthetic */ a131[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    a131 EF5;

    static {
        a131[] a131VarArr = {new a131("IsExplicit", 0), new a131("Is19AndOverOnly", 1)};
        a = a131VarArr;
        b = new t0z(a131VarArr);
    }

    public static a131 valueOf(String str) {
        return (a131) Enum.valueOf(a131.class, str);
    }

    public static a131[] values() {
        return (a131[]) a.clone();
    }
}
