package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mq61 {
    public static final mq61 a;
    public static final /* synthetic */ mq61[] b;

    static {
        mq61 mq61Var = new mq61("ButtonClicked", 0);
        a = mq61Var;
        b = new mq61[]{mq61Var};
    }

    public static mq61 valueOf(String str) {
        return (mq61) Enum.valueOf(mq61.class, str);
    }

    public static mq61[] values() {
        return (mq61[]) b.clone();
    }
}
