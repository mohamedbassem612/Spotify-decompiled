package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s5u {
    public static final s5u a;
    public static final s5u b;
    public static final s5u c;
    public static final s5u d;
    public static final /* synthetic */ s5u[] e;

    static {
        s5u s5uVar = new s5u("LEFT", 0);
        a = s5uVar;
        s5u s5uVar2 = new s5u("RIGHT", 1);
        b = s5uVar2;
        s5u s5uVar3 = new s5u("TOP", 2);
        c = s5uVar3;
        s5u s5uVar4 = new s5u("BOTTOM", 3);
        d = s5uVar4;
        e = new s5u[]{s5uVar, s5uVar2, s5uVar3, s5uVar4};
    }

    public static s5u valueOf(String str) {
        return (s5u) Enum.valueOf(s5u.class, str);
    }

    public static s5u[] values() {
        return (s5u[]) e.clone();
    }
}
