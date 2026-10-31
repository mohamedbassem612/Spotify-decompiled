package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vux {
    public static final vux a;
    public static final vux b;
    public static final vux c;
    public static final /* synthetic */ vux[] d;

    static {
        vux vuxVar = new vux("Default", 0);
        a = vuxVar;
        vux vuxVar2 = new vux("Pressed", 1);
        b = vuxVar2;
        vux vuxVar3 = new vux("Selected", 2);
        c = vuxVar3;
        d = new vux[]{vuxVar, vuxVar2, vuxVar3};
    }

    public static vux valueOf(String str) {
        return (vux) Enum.valueOf(vux.class, str);
    }

    public static vux[] values() {
        return (vux[]) d.clone();
    }
}
