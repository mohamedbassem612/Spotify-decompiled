package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class t870 implements v970 {
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    t870 EF8;
    public static final /* synthetic */ t870[] c = {new o870("SECTION_HEADER", 0, 2131429172), new p870("SECTION_HEADER_LARGE", 1, 2131429173), new q870("SECTION_HEADER_SMALL", 2, 2131429174), new r870("SECTION_HEADER_WITH_DESCRIPTION", 3, 2131429176), new s870("SECTION_HEADER_WITH_RECOMMENDATION", 4, 2131429175)};
    public static final t870[] b = values();

    public t870(String str, int i, int i2) {
        super(str, i);
        this.a = i2;
    }

    public static t870 valueOf(String str) {
        return (t870) Enum.valueOf(t870.class, str);
    }

    public static t870[] values() {
        return (t870[]) c.clone();
    }

    public final int getId() {
        return this.a;
    }
}
