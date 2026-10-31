package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ak {
    public static final ak a;
    public static final ak b;
    public static final ak c;
    public static final ak d;
    public static final ak e;
    public static final ak f;
    public static final /* synthetic */ ak[] g;

    static {
        ak akVar = new ak("MEDIA_ROUTER", 0);
        a = akVar;
        ak akVar2 = new ak("AUDIO_MANAGER", 1);
        b = akVar2;
        ak akVar3 = new ak("BLUETOOTH_ADAPTER", 2);
        c = akVar3;
        ak akVar4 = new ak("ANDROID_X_MEDIA_ROUTER", 3);
        d = akVar4;
        ak akVar5 = new ak("CAR_OBSERVABLE", 4);
        e = akVar5;
        ak akVar6 = new ak("GLASSES_OBSERVABLE", 5);
        f = akVar6;
        g = new ak[]{akVar, akVar2, akVar3, akVar4, akVar5, akVar6};
    }

    public static ak valueOf(String str) {
        return (ak) Enum.valueOf(ak.class, str);
    }

    public static ak[] values() {
        return (ak[]) g.clone();
    }
}
