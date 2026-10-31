package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q0v {
    public static final q0v a;
    public static final q0v b;
    public static final q0v c;
    public static final q0v d;
    public static final /* synthetic */ q0v[] e;

    static {
        q0v q0vVar = new q0v("RowClicked", 0);
        a = q0vVar;
        q0v q0vVar2 = new q0v("DownloadButtonClicked", 1);
        b = q0vVar2;
        q0v q0vVar3 = new q0v("UseCellularClicked", 2);
        c = q0vVar3;
        q0v q0vVar4 = new q0v("RetryClicked", 3);
        d = q0vVar4;
        e = new q0v[]{q0vVar, q0vVar2, q0vVar3, q0vVar4};
    }

    public static q0v valueOf(String str) {
        return (q0v) Enum.valueOf(q0v.class, str);
    }

    public static q0v[] values() {
        return (q0v[]) e.clone();
    }
}
