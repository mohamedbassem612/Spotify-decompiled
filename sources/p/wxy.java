package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wxy {
    public static final wxy a;
    public static final wxy b;
    public static final wxy c;
    public static final wxy d;
    public static final /* synthetic */ wxy[] e;

    static {
        wxy wxyVar = new wxy("Playing", 0);
        a = wxyVar;
        wxy wxyVar2 = new wxy("Played", 1);
        b = wxyVar2;
        wxy wxyVar3 = new wxy("Paused", 2);
        c = wxyVar3;
        wxy wxyVar4 = new wxy("None", 3);
        d = wxyVar4;
        e = new wxy[]{wxyVar, wxyVar2, wxyVar3, wxyVar4};
    }

    public static wxy valueOf(String str) {
        return (wxy) Enum.valueOf(wxy.class, str);
    }

    public static wxy[] values() {
        return (wxy[]) e.clone();
    }
}
