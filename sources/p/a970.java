package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class a970 implements w570, e670 {
    public static final /* synthetic */ a970[] a = {new x870("TRACK_CLOUD", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    a970 EF5;

    public static a970 valueOf(String str) {
        return (a970) Enum.valueOf(a970.class, str);
    }

    public static a970[] values() {
        return (a970[]) a.clone();
    }

    public final String a() {
        return "glue2:trackCloud";
    }

    public final String b() {
        return s570.ROW.a;
    }
}
