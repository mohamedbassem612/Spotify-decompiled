package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class eb70 implements v970 {
    public static final /* synthetic */ eb70[] N0;
    public static final ta70 X;
    public static final ua70 Y;
    public static final eb70[] Z;
    public static final va70 b;
    public static final xa70 c;
    public static final ya70 d;
    public static final za70 e;
    public static final ab70 f;
    public static final bb70 g;
    public static final cb70 h;
    public static final db70 i;
    public static final sa70 t;
    public final int a;

    static {
        va70 va70Var = new va70("MULTILINE", 0, 2131429194);
        b = va70Var;
        wa70 wa70Var = new wa70("MULTILINE_CAPPED", 1, 2131429195);
        xa70 xa70Var = new xa70("SINGLE_LINE", 2, 2131429196);
        c = xa70Var;
        ya70 ya70Var = new ya70("SINGLE_LINE_IMAGE", 3, 2131429197);
        d = ya70Var;
        za70 za70Var = new za70("SINGLE_LINE_IMAGE_SMALL", 4, 2131429198);
        e = za70Var;
        ab70 ab70Var = new ab70("SINGLE_LINE_SMALL", 5, 2131429199);
        f = ab70Var;
        bb70 bb70Var = new bb70("TWO_LINE", 6, 2131429200);
        g = bb70Var;
        cb70 cb70Var = new cb70("TWO_LINE_IMAGE", 7, 2131429201);
        h = cb70Var;
        db70 db70Var = new db70("TWO_LINE_IMAGE_MUTED", 8, 2131429202);
        i = db70Var;
        ra70 ra70Var = new ra70("TWO_LINE_LANDSCAPE_IMAGE", 9, 2131429203);
        sa70 sa70Var = new sa70("TWO_LINE_MUTED", 10, 2131429204);
        t = sa70Var;
        ta70 ta70Var = new ta70("TWO_LINE_NUMBER", 11, 2131429205);
        X = ta70Var;
        ua70 ua70Var = new ua70("TWO_LINE_NUMBER_MUTED", 12, 2131429206);
        Y = ua70Var;
        N0 = new eb70[]{va70Var, wa70Var, xa70Var, ya70Var, za70Var, ab70Var, bb70Var, cb70Var, db70Var, ra70Var, sa70Var, ta70Var, ua70Var};
        Z = values();
    }

    public eb70(String str, int i2, int i3) {
        super(str, i2);
        this.a = i3;
    }

    public static eb70 valueOf(String str) {
        return (eb70) Enum.valueOf(eb70.class, str);
    }

    public static eb70[] values() {
        return (eb70[]) N0.clone();
    }

    public final int getId() {
        return this.a;
    }
}
