package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vwy {
    public static final vwy a;
    public static final vwy b;
    public static final /* synthetic */ vwy[] c;

    /* JADX INFO: Fake field, exist only in values array */
    vwy EF0;

    static {
        vwy vwyVar = new vwy("NONE", 0);
        vwy vwyVar2 = new vwy("DEFAULT", 1);
        a = vwyVar2;
        vwy vwyVar3 = new vwy("THEMED", 2);
        b = vwyVar3;
        c = new vwy[]{vwyVar, vwyVar2, vwyVar3};
    }

    public static vwy valueOf(String str) {
        return (vwy) Enum.valueOf(vwy.class, str);
    }

    public static vwy[] values() {
        return (vwy[]) c.clone();
    }
}
