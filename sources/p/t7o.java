package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t7o {
    public static final t7o a;
    public static final t7o b;
    public static final t7o c;
    public static final t7o d;
    public static final t7o e;
    public static final t7o f;
    public static final /* synthetic */ t7o[] g;

    static {
        t7o t7oVar = new t7o("IDLE", 0);
        a = t7oVar;
        t7o t7oVar2 = new t7o("ACTIVE", 1);
        b = t7oVar2;
        t7o t7oVar3 = new t7o("RECEIVING", 2);
        c = t7oVar3;
        t7o t7oVar4 = new t7o("ABORTING", 3);
        d = t7oVar4;
        t7o t7oVar5 = new t7o("TIMED_OUT", 4);
        e = t7oVar5;
        t7o t7oVar6 = new t7o("DONE", 5);
        f = t7oVar6;
        g = new t7o[]{t7oVar, t7oVar2, t7oVar3, t7oVar4, t7oVar5, t7oVar6};
    }

    public static t7o valueOf(String str) {
        return (t7o) Enum.valueOf(t7o.class, str);
    }

    public static t7o[] values() {
        return (t7o[]) g.clone();
    }
}
