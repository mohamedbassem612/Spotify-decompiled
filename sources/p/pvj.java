package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pvj extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvj(int i, vnr0 vnr0Var, vnr0 vnr0Var2, ven0 ven0Var, ven0 ven0Var2, hdn0 hdn0Var) {
        super(1);
        this.b = i;
        this.e = vnr0Var;
        this.f = vnr0Var2;
        this.c = ven0Var;
        this.g = ven0Var2;
        this.d = hdn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    public final Object invoke(Object obj) {
        r8e1 r8e1Var;
        byte b = this.a;
        Object obj2 = null;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        ven0 ven0Var = this.c;
        Object obj5 = this.d;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                int i2 = ((vme0) obj6).c;
                jj40 jj40Var = (jj40) obj3;
                int iOrdinal = ((hne0) obj).ordinal();
                if (iOrdinal == 0) {
                    ((fad0) obj4).j(new fu80(i, i2 == 2 ? 2 : 1, 2, jj40Var.a));
                    if (i2 == 2) {
                        ven0Var.setValue(jj40Var);
                    } else {
                        ((iu30) obj5).invoke(new tle0(jj40Var));
                    }
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 1:
                qzh qzhVarA = ((zfx) obj4).a(jxf1.a);
                ven0Var.setValue(qzhVarA);
                r960 r960Var = (r960) obj3;
                qzhVarA.f(new swf1(r960Var.b, r960Var.c, new g07(r960Var.d), (o1v) null, (k4m) null, this.b, false, 2096888));
                View view = qzhVarA.getView();
                b8k1.m(view, fg.g, ((Context) obj).getString(2131963217), o610.f);
                b8k1.p(view, new zdc((byte) 13));
                qzhVarA.n(new lb50(obj5, (Object) r960Var, obj6, (byte) 5));
                return view;
            case 2:
                long j = ((Offset) obj).a;
                Function0 function0 = (Function0) obj6;
                cde1 cde1Var = (cde1) obj4;
                if (cde1Var.b()) {
                    cde1Var.a();
                    id01 id01Var = zc01.a;
                    ven0Var.setValue((Object) null);
                } else {
                    id01 id01Var2 = zc01.a;
                    if (((r8e1) ven0Var.getValue()) != null) {
                        cde1Var.a();
                        id01 id01Var3 = zc01.a;
                        ven0Var.setValue((Object) null);
                    } else {
                        y9e1 y9e1Var = (y9e1) ((ven0) obj5).getValue();
                        if (y9e1Var != null) {
                            int iG = i + y9e1Var.b.g(j);
                            for (Object obj7 : (Iterable) ((z680) obj3).a.getValue()) {
                                r8e1 r8e1Var2 = (r8e1) obj7;
                                int i3 = r8e1Var2.a;
                                if (iG < r8e1Var2.b && i3 <= iG) {
                                    obj2 = obj7;
                                    r8e1Var = (r8e1) obj2;
                                    if (r8e1Var != null) {
                                        ven0Var.setValue(r8e1Var);
                                    } else {
                                        function0.invoke();
                                    }
                                }
                            }
                            r8e1Var = (r8e1) obj2;
                            if (r8e1Var != null) {
                                ven0Var.setValue(r8e1Var);
                            } else {
                                function0.invoke();
                            }
                        } else {
                            function0.invoke();
                        }
                    }
                }
                return rih1Var;
            default:
                y9e1 y9e1Var2 = (y9e1) obj;
                ven0 ven0Var2 = (ven0) obj6;
                err0 err0Var = (hdn0) obj5;
                if (!((Boolean) ven0Var.getValue()).booleanValue() && y9e1Var2.d()) {
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        err0 err0Var2 = err0Var;
                        if (err0Var2.s() > 0) {
                            err0Var2.t(zj01.i(err0Var2.s(), ((vnr0) obj3).a).length());
                        }
                    } else {
                        ven0Var2.setValue(Boolean.TRUE);
                        int iC = y9e1Var2.b.c(i - 1, false) - ((vnr0) obj4).a.length();
                        err0Var.t(iC >= 0 ? iC : 0);
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvj(zfx zfxVar, r960 r960Var, int i, ven0 ven0Var, iu30 iu30Var, iu30 iu30Var2) {
        super(1);
        this.e = zfxVar;
        this.f = r960Var;
        this.b = i;
        this.c = ven0Var;
        this.d = iu30Var;
        this.g = iu30Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvj(fad0 fad0Var, jj40 jj40Var, int i, vme0 vme0Var, iu30 iu30Var, ven0 ven0Var) {
        super(1);
        this.e = fad0Var;
        this.f = jj40Var;
        this.b = i;
        this.g = vme0Var;
        this.d = iu30Var;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvj(cde1 cde1Var, int i, z680 z680Var, Function0 function0, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.e = cde1Var;
        this.b = i;
        this.f = z680Var;
        this.g = function0;
        this.c = ven0Var;
        this.d = ven0Var2;
    }
}
