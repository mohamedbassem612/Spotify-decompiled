package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class d3b {
    public static final String a;

    static {
        w6b1 w6b1VarA = f7b1.a(blc0.y2);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str != null) {
            a = str;
        } else {
            eg.m("Required value was null.");
        }
    }

    public static final String a() {
        return a;
    }
}
