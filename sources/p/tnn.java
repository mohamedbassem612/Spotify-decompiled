package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tnn {
    public static final tnn a;
    public static final tnn b;
    public static final tnn c;
    public static final /* synthetic */ tnn[] d;

    static {
        tnn tnnVar = new tnn("Top", 0);
        a = tnnVar;
        tnn tnnVar2 = new tnn("Center", 1);
        b = tnnVar2;
        tnn tnnVar3 = new tnn("Bottom", 2);
        c = tnnVar3;
        d = new tnn[]{tnnVar, tnnVar2, tnnVar3};
    }

    public static tnn valueOf(String str) {
        return (tnn) Enum.valueOf(tnn.class, str);
    }

    public static tnn[] values() {
        return (tnn[]) d.clone();
    }
}
