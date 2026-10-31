package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uku implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uku(iu30 iu30Var, ven0 ven0Var, boolean z) {
        this.c = ven0Var;
        this.d = iu30Var;
        this.b = z;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                oe41 oe41Var = (oe41) obj2;
                String str = (String) obj;
                if (z) {
                    oe41Var.e(str);
                }
                break;
            default:
                ((ven0) obj2).setValue(new gt00());
                ((iu30) obj).invoke(Boolean.valueOf(!z));
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ uku(boolean z, oe41 oe41Var, String str) {
        this.b = z;
        this.c = oe41Var;
        this.d = str;
    }
}
