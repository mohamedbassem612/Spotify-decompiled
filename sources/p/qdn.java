package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdn {
    public static final qdn a;
    public static final qdn b;
    public static final qdn c;
    public static final qdn d;
    public static final /* synthetic */ qdn[] e;

    static {
        qdn qdnVar = new qdn("UNKNOWN", 0);
        a = qdnVar;
        qdn qdnVar2 = new qdn("UP", 1);
        b = qdnVar2;
        qdn qdnVar3 = new qdn("DOWN", 2);
        c = qdnVar3;
        qdn qdnVar4 = new qdn("NEW", 3);
        d = qdnVar4;
        e = new qdn[]{qdnVar, qdnVar2, qdnVar3, qdnVar4, new qdn("EQUAL", 4)};
    }

    public static qdn valueOf(String str) {
        return (qdn) Enum.valueOf(qdn.class, str);
    }

    public static qdn[] values() {
        return (qdn[]) e.clone();
    }
}
