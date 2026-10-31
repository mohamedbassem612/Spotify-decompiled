package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vcm {
    public static final vcm a;
    public static final /* synthetic */ vcm[] b;

    static {
        vcm vcmVar = new vcm("NOT_INTERESTED", 0);
        a = vcmVar;
        b = new vcm[]{vcmVar};
    }

    public static vcm valueOf(String str) {
        return (vcm) Enum.valueOf(vcm.class, str);
    }

    public static vcm[] values() {
        return (vcm[]) b.clone();
    }
}
