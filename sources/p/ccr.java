package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ccr {
    public static final ccr a;
    public static final ccr b;
    public static final ccr c;
    public static final ccr d;
    public static final /* synthetic */ ccr[] e;

    static {
        ccr ccrVar = new ccr("SET_REMINDER", 0);
        a = ccrVar;
        ccr ccrVar2 = new ccr("DECLINE_OFFER", 1);
        b = ccrVar2;
        ccr ccrVar3 = new ccr("JOIN_WAITLIST", 2);
        c = ccrVar3;
        ccr ccrVar4 = new ccr("NOT_INTERESTED", 3);
        d = ccrVar4;
        e = new ccr[]{ccrVar, ccrVar2, ccrVar3, ccrVar4};
    }

    public static ccr valueOf(String str) {
        return (ccr) Enum.valueOf(ccr.class, str);
    }

    public static ccr[] values() {
        return (ccr[]) e.clone();
    }
}
