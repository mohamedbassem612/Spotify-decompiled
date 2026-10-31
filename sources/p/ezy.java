package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ezy {
    public static final ezy a;
    public static final ezy b;
    public static final /* synthetic */ ezy[] c;

    static {
        ezy ezyVar = new ezy("PLAYLIST", 0);
        a = ezyVar;
        ezy ezyVar2 = new ezy("ALBUM", 1);
        b = ezyVar2;
        c = new ezy[]{ezyVar, ezyVar2};
    }

    public static ezy valueOf(String str) {
        return (ezy) Enum.valueOf(ezy.class, str);
    }

    public static ezy[] values() {
        return (ezy[]) c.clone();
    }
}
