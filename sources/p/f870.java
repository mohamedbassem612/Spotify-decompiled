package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class f870 implements v970 {
    public final int a;
    public final String b;

    /* JADX INFO: Fake field, exist only in values array */
    f870 EF10;
    public static final /* synthetic */ f870[] d = {new z770(0, "DEFAULT", 2131429165, "default"), new a870(1, "DEFAULT_WITH_SUBTITLE", 2131429170, "defaultWithSubtitle"), new b870(2, "DEFAULT_WITH_METADATA", 2131429169, "defaultWithMetadata"), new c870(3, "LARGE", 2131429167, "large"), new d870(4, "SMALL", 2131429168, "small"), new e870(5, "EXTRA_SMALL", 2131429166, "extraSmall")};
    public static final f870[] c = values();

    public f870(int i, String str, int i2, String str2) {
        super(str, i);
        this.a = i2;
        this.b = str2;
    }

    public static f870 valueOf(String str) {
        return (f870) Enum.valueOf(f870.class, str);
    }

    public static f870[] values() {
        return (f870[]) d.clone();
    }

    public final int getId() {
        return this.a;
    }
}
