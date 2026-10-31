package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class omd {
    public static final omd a;
    public static final omd b;
    public static final omd c;
    public static final /* synthetic */ omd[] d;

    /* JADX INFO: Fake field, exist only in values array */
    omd EF0;

    static {
        omd omdVar = new omd("AUDIOBOOKS", 0);
        omd omdVar2 = new omd("LYRICS", 1);
        omd omdVar3 = new omd("PICK_AND_SHUFFLE", 2);
        omd omdVar4 = new omd("BLUEJAY", 3);
        a = omdVar4;
        omd omdVar5 = new omd("KALLAX", 4);
        omd omdVar6 = new omd("PROMPT_PLAYLIST", 5);
        b = omdVar6;
        omd omdVar7 = new omd("RUNNING_MODE", 6);
        c = omdVar7;
        d = new omd[]{omdVar, omdVar2, omdVar3, omdVar4, omdVar5, omdVar6, omdVar7};
    }

    public static omd valueOf(String str) {
        return (omd) Enum.valueOf(omd.class, str);
    }

    public static omd[] values() {
        return (omd[]) d.clone();
    }
}
