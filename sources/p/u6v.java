package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u6v extends hab0 implements Function0 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ hdn0 P0;
    public final /* synthetic */ ggv X;
    public final /* synthetic */ fgv Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ss50 g;
    public final /* synthetic */ xtb0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ c380 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6v(int i, int i2, int i3, ven0 ven0Var, ven0 ven0Var2, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var3, c380 c380Var, ggv ggvVar, fgv fgvVar, String str, String str2, ven0 ven0Var4, hdn0 hdn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = ss50Var;
        this.h = xtb0Var;
        this.i = ven0Var3;
        this.t = c380Var;
        this.X = ggvVar;
        this.Y = fgvVar;
        this.Z = str;
        this.N0 = str2;
        this.O0 = ven0Var4;
        this.P0 = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        ven0 ven0Var = this.i;
        xtb0 xtb0Var = this.h;
        ss50 ss50Var = this.g;
        ven0 ven0Var2 = this.f;
        ven0 ven0Var3 = this.e;
        switch (b) {
            case 0:
                fde1 fde1Var = fde1.a;
                ven0Var3.setValue(fde1Var);
                List list = bs51.d(ven0Var2, ss50Var, xtb0Var, ven0Var, new oz(fde1Var, i3, i2, i)).b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof law) {
                        arrayList.add(obj);
                    }
                }
                law lawVar = (law) o7h.C0(arrayList);
                if (lawVar != null) {
                    c7v.a(this.t, this.d, this.c, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, lawVar.a, lawVar.b);
                }
                break;
            default:
                fde1 fde1Var2 = fde1.b;
                ven0Var3.setValue(fde1Var2);
                List list2 = bs51.d(ven0Var2, ss50Var, xtb0Var, ven0Var, new oz(fde1Var2, i3, i2, i)).b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof law) {
                        arrayList2.add(obj2);
                    }
                }
                law lawVar2 = (law) o7h.C0(arrayList2);
                if (lawVar2 != null) {
                    c7v.a(this.t, this.d, this.c, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, lawVar2.a, lawVar2.b);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
