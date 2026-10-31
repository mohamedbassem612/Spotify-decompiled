package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ryg {
    public static final ryg a;
    public static final /* synthetic */ ryg[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ryg EF0;

    static {
        ryg rygVar = new ryg("Pending", 0);
        ryg rygVar2 = new ryg("NoCollaborators", 1);
        ryg rygVar3 = new ryg("HasCollaborators", 2);
        a = rygVar3;
        b = new ryg[]{rygVar, rygVar2, rygVar3};
    }

    public static ryg valueOf(String str) {
        return (ryg) Enum.valueOf(ryg.class, str);
    }

    public static ryg[] values() {
        return (ryg[]) b.clone();
    }
}
