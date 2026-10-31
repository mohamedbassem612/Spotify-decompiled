package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xck {
    public static final xck a;
    public static final xck b;
    public static final xck c;
    public static final xck d;
    public static final /* synthetic */ xck[] e;

    static {
        xck xckVar = new xck("LEARN_MORE", 0);
        a = xckVar;
        xck xckVar2 = new xck("SEE_TICKETS", 1);
        b = xckVar2;
        xck xckVar3 = new xck("JOIN_WAITLIST", 2);
        xck xckVar4 = new xck("JOINED_WAITLIST", 3);
        xck xckVar5 = new xck("VIEW", 4);
        c = xckVar5;
        xck xckVar6 = new xck("NONE", 5);
        d = xckVar6;
        e = new xck[]{xckVar, xckVar2, xckVar3, xckVar4, xckVar5, xckVar6};
    }

    public static xck valueOf(String str) {
        return (xck) Enum.valueOf(xck.class, str);
    }

    public static xck[] values() {
        return (xck[]) e.clone();
    }
}
