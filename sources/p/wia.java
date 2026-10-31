package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wia {
    public static final wia a;
    public static final wia b;
    public static final wia c;
    public static final /* synthetic */ wia[] d;

    static {
        wia wiaVar = new wia("NONE", 0);
        a = wiaVar;
        wia wiaVar2 = new wia("TRANSFER", 1);
        b = wiaVar2;
        wia wiaVar3 = new wia("GO_TO_APP", 2);
        c = wiaVar3;
        d = new wia[]{wiaVar, wiaVar2, wiaVar3};
    }

    public static wia valueOf(String str) {
        return (wia) Enum.valueOf(wia.class, str);
    }

    public static wia[] values() {
        return (wia[]) d.clone();
    }
}
