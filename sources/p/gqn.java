package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqn {
    public static final gqn a;
    public static final /* synthetic */ gqn[] b;

    static {
        gqn gqnVar = new gqn("OnClicked", 0);
        a = gqnVar;
        b = new gqn[]{gqnVar};
    }

    public static gqn valueOf(String str) {
        return (gqn) Enum.valueOf(gqn.class, str);
    }

    public static gqn[] values() {
        return (gqn[]) b.clone();
    }
}
