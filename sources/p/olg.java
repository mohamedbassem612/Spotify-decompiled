package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class olg {
    public static final olg a;
    public static final olg b;
    public static final /* synthetic */ olg[] c;
    public static final /* synthetic */ t0z d;

    static {
        olg olgVar = new olg("Image", 0);
        a = olgVar;
        olg olgVar2 = new olg("Video", 1);
        b = olgVar2;
        olg[] olgVarArr = {olgVar, olgVar2};
        c = olgVarArr;
        d = new t0z(olgVarArr);
    }

    public static olg valueOf(String str) {
        return (olg) Enum.valueOf(olg.class, str);
    }

    public static olg[] values() {
        return (olg[]) c.clone();
    }
}
