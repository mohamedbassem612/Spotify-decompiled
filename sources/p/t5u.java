package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t5u {
    public static final t5u a;
    public static final t5u b;
    public static final t5u c;
    public static final t5u d;
    public static final /* synthetic */ t5u[] e;

    static {
        t5u t5uVar = new t5u("UP", 0);
        a = t5uVar;
        t5u t5uVar2 = new t5u("DOWN", 1);
        b = t5uVar2;
        t5u t5uVar3 = new t5u("LEFT", 2);
        c = t5uVar3;
        t5u t5uVar4 = new t5u("RIGHT", 3);
        d = t5uVar4;
        e = new t5u[]{t5uVar, t5uVar2, t5uVar3, t5uVar4};
    }

    public static t5u valueOf(String str) {
        return (t5u) Enum.valueOf(t5u.class, str);
    }

    public static t5u[] values() {
        return (t5u[]) e.clone();
    }
}
