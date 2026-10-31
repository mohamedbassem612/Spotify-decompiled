package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m4m {
    public static final m4m a;
    public static final m4m b;
    public static final m4m c;
    public static final /* synthetic */ m4m[] d;

    static {
        m4m m4mVar = new m4m("OVER19ONLY", 0);
        a = m4mVar;
        m4m m4mVar2 = new m4m("EXPLICIT", 1);
        b = m4mVar2;
        m4m m4mVar3 = new m4m("NONE", 2);
        c = m4mVar3;
        d = new m4m[]{m4mVar, m4mVar2, m4mVar3};
    }

    public static m4m valueOf(String str) {
        return (m4m) Enum.valueOf(m4m.class, str);
    }

    public static m4m[] values() {
        return (m4m[]) d.clone();
    }
}
