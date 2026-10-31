package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d2z {
    public static final d2z a;
    public static final d2z b;
    public static final d2z c;
    public static final d2z d;
    public static final d2z e;
    public static final /* synthetic */ d2z[] f;

    static {
        d2z d2zVar = new d2z("CardClicked", 0);
        a = d2zVar;
        d2z d2zVar2 = new d2z("CardLongClicked", 1);
        b = d2zVar2;
        d2z d2zVar3 = new d2z("ContextMenuButtonClicked", 2);
        c = d2zVar3;
        d2z d2zVar4 = new d2z("SaveButtonClicked", 3);
        d = d2zVar4;
        d2z d2zVar5 = new d2z("PlayButtonClicked", 4);
        e = d2zVar5;
        f = new d2z[]{d2zVar, d2zVar2, d2zVar3, d2zVar4, d2zVar5};
    }

    public static d2z valueOf(String str) {
        return (d2z) Enum.valueOf(d2z.class, str);
    }

    public static d2z[] values() {
        return (d2z[]) f.clone();
    }
}
