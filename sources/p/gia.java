package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gia {
    public static final gia a;
    public static final gia b;
    public static final gia c;
    public static final /* synthetic */ gia[] d;

    static {
        gia giaVar = new gia("CELLULAR", 0);
        a = giaVar;
        gia giaVar2 = new gia("WIFI", 1);
        b = giaVar2;
        gia giaVar3 = new gia("UNKNOWN", 2);
        c = giaVar3;
        d = new gia[]{giaVar, giaVar2, giaVar3};
    }

    public static gia valueOf(String str) {
        return (gia) Enum.valueOf(gia.class, str);
    }

    public static gia[] values() {
        return (gia[]) d.clone();
    }
}
