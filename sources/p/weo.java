package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class weo {
    public static final weo a;
    public static final /* synthetic */ weo[] b;
    public static final /* synthetic */ t0z c;

    /* JADX INFO: Fake field, exist only in values array */
    weo EF0;

    static {
        weo weoVar = new weo("INTRO", 0);
        weo weoVar2 = new weo("COACHING", 1);
        weo weoVar3 = new weo("ENCOURAGEMENT", 2);
        weo weoVar4 = new weo("TRANSITION", 3);
        weo weoVar5 = new weo("OUTRO", 4);
        weo weoVar6 = new weo("UNKNOWN", 5);
        a = weoVar6;
        weo[] weoVarArr = {weoVar, weoVar2, weoVar3, weoVar4, weoVar5, weoVar6};
        b = weoVarArr;
        c = new t0z(weoVarArr);
    }

    public static weo valueOf(String str) {
        return (weo) Enum.valueOf(weo.class, str);
    }

    public static weo[] values() {
        return (weo[]) b.clone();
    }
}
