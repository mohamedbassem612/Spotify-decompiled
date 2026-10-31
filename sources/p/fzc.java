package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzc {
    public static final fzc a;
    public static final fzc b;
    public static final fzc c;
    public static final fzc d;
    public static final fzc e;
    public static final fzc f;
    public static final fzc g;
    public static final fzc h;
    public static final fzc i;
    public static final /* synthetic */ fzc[] t;

    static {
        fzc fzcVar = new fzc("DEFAULT", 0);
        a = fzcVar;
        fzc fzcVar2 = new fzc("CAR", 1);
        b = fzcVar2;
        fzc fzcVar3 = new fzc("VOICE_ASSISTANT", 2);
        c = fzcVar3;
        fzc fzcVar4 = new fzc("AVRCP", 3);
        d = fzcVar4;
        fzc fzcVar5 = new fzc("PME", 4);
        e = fzcVar5;
        fzc fzcVar6 = new fzc("AI_PARTNER", 5);
        f = fzcVar6;
        fzc fzcVar7 = new fzc("ALARM", 6);
        g = fzcVar7;
        fzc fzcVar8 = new fzc("SAMSUNG_CLOCK", 7);
        h = fzcVar8;
        fzc fzcVar9 = new fzc("SNAP_SPECS", 8);
        i = fzcVar9;
        t = new fzc[]{fzcVar, fzcVar2, fzcVar3, fzcVar4, fzcVar5, fzcVar6, fzcVar7, fzcVar8, fzcVar9};
    }

    public static fzc valueOf(String str) {
        return (fzc) Enum.valueOf(fzc.class, str);
    }

    public static fzc[] values() {
        return (fzc[]) t.clone();
    }
}
