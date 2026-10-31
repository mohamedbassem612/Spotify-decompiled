package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d991 {
    public static final d991 a;
    public static final d991 b;
    public static final d991 c;
    public static final d991 d;
    public static final d991 e;
    public static final /* synthetic */ d991[] f;
    public static final /* synthetic */ t0z g;

    static {
        d991 d991Var = new d991("TRACK", 0);
        a = d991Var;
        d991 d991Var2 = new d991("PODCAST_EPISODE", 1);
        b = d991Var2;
        d991 d991Var3 = new d991("AUDIOBOOK_CHAPTER", 2);
        c = d991Var3;
        d991 d991Var4 = new d991("PODCAST_CHAPTER", 3);
        d = d991Var4;
        d991 d991Var5 = new d991("CLIP", 4);
        e = d991Var5;
        d991[] d991VarArr = {d991Var, d991Var2, d991Var3, d991Var4, d991Var5};
        f = d991VarArr;
        g = new t0z(d991VarArr);
    }

    public static d991 valueOf(String str) {
        return (d991) Enum.valueOf(d991.class, str);
    }

    public static d991[] values() {
        return (d991[]) f.clone();
    }
}
