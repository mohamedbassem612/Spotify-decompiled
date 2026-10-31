package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ac70 implements v970 {
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    ac70 EF8;
    public static final /* synthetic */ ac70[] c = {new wb70("SECTION_HEADER_LARGE", 0, 2131429207), new xb70("SECTION_HEADER_LARGE_WITH_DESCRIPTION", 1, 2131429208), new yb70("SECTION_HEADER_SMALL", 2, 2131429209), new zb70("SECTION_HEADER_SMALL_WITH_DESCRIPTION", 3, 2131429210)};
    public static final ac70[] b = values();

    public ac70(String str, int i, int i2) {
        super(str, i);
        this.a = i2;
    }

    public static ac70 valueOf(String str) {
        return (ac70) Enum.valueOf(ac70.class, str);
    }

    public static ac70[] values() {
        return (ac70[]) c.clone();
    }

    public final int getId() {
        return this.a;
    }
}
