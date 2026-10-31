package p;

import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hml1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hml1(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                mml1 mml1Var = (mml1) obj3;
                i8h1 i8h1Var = (i8h1) mml1Var.d.getValue();
                x6h1 x6h1VarC = mml1Var.b.b.c();
                x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = ((lik1) obj2).a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                ((iu30) obj).invoke(new w000(i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 1:
                ((ven0) obj).setValue(Boolean.FALSE);
                ((zxl1) obj3).j();
                ((b2m1) obj2).a.accept(x3m1.a);
                return rih1Var;
            case 2:
                l8m1 l8m1Var = (l8m1) obj3;
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue() && ((Boolean) ((ven0) obj).getValue()).booleanValue()) {
                    l8m1Var.g.b();
                    l8m1Var.i.a(ecl1.a);
                }
                return rih1Var;
            case 3:
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue() && ((Boolean) ((ven0) obj).getValue()).booleanValue()) {
                    ((o0i) obj3).d.A();
                }
                return rih1Var;
            case 4:
                o0i o0iVar = (o0i) obj;
                py7 py7Var = ((l8m1) obj3).b;
                n2u0 n2u0Var = py7Var.c;
                l2u0 l2u0Var = n2u0Var != null ? (l2u0) n2u0Var.c.getValue() : null;
                String str2 = ((c8m1) obj2).b.a;
                n0i n0iVar = o0iVar.c;
                n2u0 n2u0Var2 = n0iVar.b;
                py7Var.c = n0iVar.b;
                if (str2 == null || !str2.equals(py7Var.d)) {
                    if (n2u0Var2 != null) {
                        n2u0Var2.b(null);
                    }
                } else if (n2u0Var2 != null) {
                    n2u0Var2.b(l2u0Var);
                }
                py7Var.d = str2;
                return rih1Var;
            case 5:
                ((ven0) obj).setValue(Boolean.valueOf(pwo1.v((pe) obj3, (tjs0) obj2)));
                return rih1Var;
            default:
                y7c0 y7c0VarA = ((xhp) obj3).a();
                y7c0VarA.b();
                return RxEventSources.a(new ObservableSource[]{y7c0VarA.a(uvm1.a), ((Observable) ((jqb0) obj2).invoke()).map(y6x0.Y0), yoi1.i(new x3s(rqt0.u(((jqg0) ((lqr) obj).b).a()), (byte) 1), o6x.a).doOnError(vrk1.X)});
        }
    }
}
