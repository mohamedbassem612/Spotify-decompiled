package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n1i {
    public static final n1i a;
    public static final n1i b;
    public static final n1i c;
    public static final n1i d;
    public static final /* synthetic */ n1i[] e;

    static {
        n1i n1iVar = new n1i("DETACHED", 0);
        a = n1iVar;
        n1i n1iVar2 = new n1i("ATTACHED", 1);
        b = n1iVar2;
        n1i n1iVar3 = new n1i("PREWARMED", 2);
        c = n1iVar3;
        n1i n1iVar4 = new n1i("ACTIVE", 3);
        d = n1iVar4;
        e = new n1i[]{n1iVar, n1iVar2, n1iVar3, n1iVar4};
    }

    public static n1i valueOf(String str) {
        return (n1i) Enum.valueOf(n1i.class, str);
    }

    public static n1i[] values() {
        return (n1i[]) e.clone();
    }
}
