package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fkh {
    public static final fkh X;
    public static final /* synthetic */ fkh[] Y;
    public static final fkh[] a;
    public static final fkh b;
    public static final fkh c;
    public static final fkh d;
    public static final fkh e;
    public static final fkh f;
    public static final fkh g;
    public static final fkh h;
    public static final fkh i;
    public static final fkh t;

    static {
        fkh fkhVar = new fkh("COMMENT", 0);
        b = fkhVar;
        fkh fkhVar2 = new fkh("LOADING_FOOTER", 1);
        c = fkhVar2;
        fkh fkhVar3 = new fkh("REPLY", 2);
        d = fkhVar3;
        fkh fkhVar4 = new fkh("REPLY_PREVIEW", 3);
        e = fkhVar4;
        fkh fkhVar5 = new fkh("SENSITIVE_COMMENTS_WARNING", 4);
        f = fkhVar5;
        fkh fkhVar6 = new fkh("SENSITIVE_REPLIES_WARNING", 5);
        g = fkhVar6;
        fkh fkhVar7 = new fkh("SHOWING_ALL_COMMENTS_HEADER", 6);
        h = fkhVar7;
        fkh fkhVar8 = new fkh("SHOWING_SENSITIVE_REPLIES_HEADER", 7);
        i = fkhVar8;
        fkh fkhVar9 = new fkh("SHOWING_SENSITIVE_REPLIES_FOOTER", 8);
        t = fkhVar9;
        fkh fkhVar10 = new fkh("THREAD_FOOTER", 9);
        X = fkhVar10;
        Y = new fkh[]{fkhVar, fkhVar2, fkhVar3, fkhVar4, fkhVar5, fkhVar6, fkhVar7, fkhVar8, fkhVar9, fkhVar10};
        a = values();
    }

    public static fkh valueOf(String str) {
        return (fkh) Enum.valueOf(fkh.class, str);
    }

    public static fkh[] values() {
        return (fkh[]) Y.clone();
    }
}
