package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ovm {
    public static final ovm a;
    public static final ovm b;
    public static final ovm c;
    public static final /* synthetic */ ovm[] d;

    static {
        ovm ovmVar = new ovm("NOTE", 0);
        a = ovmVar;
        ovm ovmVar2 = new ovm("COMMENT", 1);
        b = ovmVar2;
        ovm ovmVar3 = new ovm("REACTION", 2);
        c = ovmVar3;
        d = new ovm[]{ovmVar, ovmVar2, ovmVar3, new ovm("UNKNOWN", 3)};
    }

    public static ovm valueOf(String str) {
        return (ovm) Enum.valueOf(ovm.class, str);
    }

    public static ovm[] values() {
        return (ovm[]) d.clone();
    }
}
