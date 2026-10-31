package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gyn {
    public static final gyn a;
    public static final gyn b;
    public static final /* synthetic */ gyn[] c;

    static {
        gyn gynVar = new gyn("OpenEntityPage", 0);
        a = gynVar;
        gyn gynVar2 = new gyn("OpenDetailsPage", 1);
        b = gynVar2;
        c = new gyn[]{gynVar, gynVar2};
    }

    public static gyn valueOf(String str) {
        return (gyn) Enum.valueOf(gyn.class, str);
    }

    public static gyn[] values() {
        return (gyn[]) c.clone();
    }
}
