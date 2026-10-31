package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fkt {
    public static final fkt a;
    public static final fkt b;
    public static final fkt c;
    public static final fkt d;
    public static final /* synthetic */ fkt[] e;

    static {
        fkt fktVar = new fkt("LIKED_SONGS", 0);
        a = fktVar;
        fkt fktVar2 = new fkt("YOUR_EPISODES", 1);
        b = fktVar2;
        fkt fktVar3 = new fkt("NEW_EPISODES", 2);
        c = fktVar3;
        fkt fktVar4 = new fkt("YOUR_KALLAXES", 3);
        d = fktVar4;
        e = new fkt[]{fktVar, fktVar2, fktVar3, fktVar4};
    }

    public static fkt valueOf(String str) {
        return (fkt) Enum.valueOf(fkt.class, str);
    }

    public static fkt[] values() {
        return (fkt[]) e.clone();
    }
}
