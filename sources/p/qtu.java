package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qtu {
    public static final qtu a;
    public static final qtu b;
    public static final /* synthetic */ qtu[] c;

    static {
        qtu qtuVar = new qtu("Header", 0);
        a = qtuVar;
        qtu qtuVar2 = new qtu("ContextMenu", 1);
        b = qtuVar2;
        c = new qtu[]{qtuVar, qtuVar2};
    }

    public static qtu valueOf(String str) {
        return (qtu) Enum.valueOf(qtu.class, str);
    }

    public static qtu[] values() {
        return (qtu[]) c.clone();
    }
}
