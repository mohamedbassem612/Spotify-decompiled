package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ekm1 {
    public static final /* synthetic */ ekm1[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    ekm1 EF5;

    static {
        ekm1[] ekm1VarArr = {new ekm1("REDMI_HEADPHONES_NEO", 0)};
        a = ekm1VarArr;
        b = new t0z(ekm1VarArr);
    }

    public static ekm1 valueOf(String str) {
        return (ekm1) Enum.valueOf(ekm1.class, str);
    }

    public static ekm1[] values() {
        return (ekm1[]) a.clone();
    }
}
