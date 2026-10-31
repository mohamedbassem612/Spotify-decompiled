package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class lt5 extends cv5 {
    public static final kt5 Companion = new kt5();
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public String e;

    public lt5(th61 th61Var, boolean z, gbl gblVar) {
        String str;
        Boolean boolValueOf = Boolean.valueOf(!(th61Var != null ? th61Var.h : true));
        Boolean boolValueOf2 = Boolean.valueOf(!(th61Var != null ? th61Var.h : false) && z);
        Boolean boolValueOf3 = Boolean.valueOf((th61Var != null ? th61Var.b : false) && !th61Var.d);
        Companion.getClass();
        switch (gblVar.ordinal()) {
            case 1:
                str = "none";
                break;
            case 2:
                str = "gprs";
                break;
            case 3:
                str = "edge";
                break;
            case 4:
                str = "3g";
                break;
            case 5:
                str = "4g";
                break;
            case 6:
                str = "wlan";
                break;
            case 7:
                str = "ethernet";
                break;
            default:
                str = "unknown";
                break;
        }
        this.b = boolValueOf;
        this.c = boolValueOf2;
        this.d = boolValueOf3;
        this.e = str;
    }
}
