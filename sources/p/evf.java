package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class evf {
    public static final evf a;
    public static final evf b;
    public static final evf c;
    public static final /* synthetic */ evf[] d;

    static {
        evf evfVar = new evf("NONE", 0);
        a = evfVar;
        evf evfVar2 = new evf("MUSIC_VIDEO", 1);
        b = evfVar2;
        evf evfVar3 = new evf("OTHER_VIDEO", 2);
        c = evfVar3;
        d = new evf[]{evfVar, evfVar2, evfVar3};
    }

    public static evf valueOf(String str) {
        return (evf) Enum.valueOf(evf.class, str);
    }

    public static evf[] values() {
        return (evf[]) d.clone();
    }
}
