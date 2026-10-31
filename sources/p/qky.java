package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qky {
    public static final qky a;
    public static final qky b;
    public static final /* synthetic */ qky[] c;

    static {
        qky qkyVar = new qky("AddButtonClicked", 0);
        a = qkyVar;
        qky qkyVar2 = new qky("EntityRowClicked", 1);
        b = qkyVar2;
        c = new qky[]{qkyVar, qkyVar2};
    }

    public static qky valueOf(String str) {
        return (qky) Enum.valueOf(qky.class, str);
    }

    public static qky[] values() {
        return (qky[]) c.clone();
    }
}
