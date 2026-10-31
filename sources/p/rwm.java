package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rwm {
    public static final rwm a;
    public static final rwm b;
    public static final rwm c;
    public static final rwm d;
    public static final /* synthetic */ rwm[] e;
    public static final /* synthetic */ t0z f;

    static {
        rwm rwmVar = new rwm("COLLABORATOR", 0);
        a = rwmVar;
        rwm rwmVar2 = new rwm("BAND_MEMBER", 1);
        b = rwmVar2;
        rwm rwmVar3 = new rwm("MEMBER_OF", 2);
        c = rwmVar3;
        rwm rwmVar4 = new rwm("ALIAS", 3);
        d = rwmVar4;
        rwm[] rwmVarArr = {rwmVar, rwmVar2, rwmVar3, rwmVar4};
        e = rwmVarArr;
        f = new t0z(rwmVarArr);
    }

    public static rwm valueOf(String str) {
        return (rwm) Enum.valueOf(rwm.class, str);
    }

    public static rwm[] values() {
        return (rwm[]) e.clone();
    }
}
