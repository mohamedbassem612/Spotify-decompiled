package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q1v {
    public static final q1v a;
    public static final q1v b;
    public static final q1v c;
    public static final q1v d;
    public static final q1v e;
    public static final /* synthetic */ q1v[] f;

    static {
        q1v q1vVar = new q1v("NONE", 0);
        a = q1vVar;
        q1v q1vVar2 = new q1v("ERROR", 1);
        b = q1vVar2;
        q1v q1vVar3 = new q1v("WAITING", 2);
        c = q1vVar3;
        q1v q1vVar4 = new q1v("DOWNLOADING", 3);
        d = q1vVar4;
        q1v q1vVar5 = new q1v("DOWNLOADED", 4);
        e = q1vVar5;
        f = new q1v[]{q1vVar, q1vVar2, q1vVar3, q1vVar4, q1vVar5};
    }

    public static q1v valueOf(String str) {
        return (q1v) Enum.valueOf(q1v.class, str);
    }

    public static q1v[] values() {
        return (q1v[]) f.clone();
    }
}
