package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y1h {
    public static final y1h a;
    public static final y1h b;
    public static final y1h c;
    public static final y1h d;
    public static final y1h e;
    public static final y1h f;
    public static final /* synthetic */ y1h[] g;

    static {
        y1h y1hVar = new y1h("BackButtonClicked", 0);
        a = y1hVar;
        y1h y1hVar2 = new y1h("PlayButtonClicked", 1);
        b = y1hVar2;
        y1h y1hVar3 = new y1h("ShuffleButtonClicked", 2);
        c = y1hVar3;
        y1h y1hVar4 = new y1h("FollowButtonClicked", 3);
        d = y1hVar4;
        y1h y1hVar5 = new y1h("DownloadButtonClicked", 4);
        e = y1hVar5;
        y1h y1hVar6 = new y1h("ContextMenuButtonClicked", 5);
        f = y1hVar6;
        g = new y1h[]{y1hVar, y1hVar2, y1hVar3, y1hVar4, y1hVar5, y1hVar6};
    }

    public static y1h valueOf(String str) {
        return (y1h) Enum.valueOf(y1h.class, str);
    }

    public static y1h[] values() {
        return (y1h[]) g.clone();
    }
}
