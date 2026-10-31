package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jqf {
    public static final jqf a;
    public static final jqf b;
    public static final jqf c;
    public static final jqf d;
    public static final jqf e;
    public static final /* synthetic */ jqf[] f;

    static {
        jqf jqfVar = new jqf("Unknown", 0);
        a = jqfVar;
        jqf jqfVar2 = new jqf("SideDrawer", 1);
        b = jqfVar2;
        jqf jqfVar3 = new jqf("ChatList", 2);
        c = jqfVar3;
        jqf jqfVar4 = new jqf("OffPlatformShare", 3);
        d = jqfVar4;
        jqf jqfVar5 = new jqf("InviteLink", 4);
        e = jqfVar5;
        f = new jqf[]{jqfVar, jqfVar2, jqfVar3, jqfVar4, jqfVar5};
    }

    public static jqf valueOf(String str) {
        return (jqf) Enum.valueOf(jqf.class, str);
    }

    public static jqf[] values() {
        return (jqf[]) f.clone();
    }
}
