package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class x770 implements w570, e670 {
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    x770 EF7;
    public static final /* synthetic */ x770[] h = {new t770("CALENDAR_ROW", 0, "glue2:calendarRow"), new u770("IMAGE_ROW", 1, "glue2:imageRow"), new v770("MULTILINE", 2, "glue2:text"), new w770("VIDEO", 3, "glue2:videoRow")};
    public static final int b = 2131429160;
    public static final int c = 2131429161;
    public static final int d = 2131429162;
    public static final int e = 2131429163;
    public static final int f = 2131429164;
    public static final int g = 2131429178;

    public x770(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static x770 valueOf(String str) {
        return (x770) Enum.valueOf(x770.class, str);
    }

    public static x770[] values() {
        return (x770[]) h.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return s570.ROW.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
