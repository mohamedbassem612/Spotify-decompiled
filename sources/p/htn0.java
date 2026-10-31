package p;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class htn0 extends hab0 implements iu30 {
    public static final htn0 N0;
    public static final htn0 O0;
    public static final htn0 P0;
    public static final htn0 Q0;
    public static final htn0 R0;
    public static final htn0 S0;
    public static final htn0 T0;
    public static final htn0 U0;
    public static final htn0 V0;
    public static final htn0 W0;
    public static final htn0 X;
    public static final htn0 X0;
    public static final htn0 Y;
    public static final htn0 Y0;
    public static final htn0 Z;
    public static final htn0 Z0;
    public static final htn0 a1;
    public static final htn0 b;
    public static final htn0 b1;
    public static final htn0 c;
    public static final htn0 c1;
    public static final htn0 d;
    public static final htn0 d1;
    public static final htn0 e;
    public static final htn0 e1;
    public static final htn0 f;
    public static final htn0 g;
    public static final htn0 h;
    public static final htn0 i;
    public static final htn0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new htn0(i2, (byte) 0);
        c = new htn0(i2, (byte) 1);
        d = new htn0(i2, (byte) 2);
        e = new htn0(i2, (byte) 3);
        f = new htn0(i2, (byte) 4);
        g = new htn0(i2, (byte) 5);
        h = new htn0(i2, (byte) 6);
        i = new htn0(i2, (byte) 7);
        t = new htn0(i2, (byte) 8);
        X = new htn0(i2, (byte) 9);
        Y = new htn0(i2, (byte) 10);
        Z = new htn0(i2, (byte) 11);
        N0 = new htn0(i2, (byte) 12);
        O0 = new htn0(i2, (byte) 13);
        P0 = new htn0(i2, (byte) 14);
        Q0 = new htn0(i2, (byte) 15);
        R0 = new htn0(i2, (byte) 16);
        S0 = new htn0(i2, (byte) 17);
        T0 = new htn0(i2, (byte) 18);
        U0 = new htn0(i2, (byte) 19);
        V0 = new htn0(i2, (byte) 20);
        W0 = new htn0(i2, (byte) 21);
        X0 = new htn0(i2, (byte) 22);
        Y0 = new htn0(i2, (byte) 23);
        Z0 = new htn0(i2, (byte) 24);
        a1 = new htn0(i2, (byte) 25);
        b1 = new htn0(i2, (byte) 26);
        c1 = new htn0(i2, (byte) 27);
        d1 = new htn0(i2, (byte) 28);
        e1 = new htn0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ htn0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z;
        n3x n3xVar;
        n3x n3xVar2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                Bundle bundle = new Bundle();
                c380<btn0> c380Var = ((dtn0) obj).c;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (btn0 btn0Var : c380Var) {
                    hux huxVar = btn0Var.a;
                    int i2 = btn0Var.b;
                    lik1 lik1Var = btn0Var.c;
                    boolean z3 = btn0Var.e;
                    atn0 atn0Var = btn0Var.f;
                    if (atn0Var instanceof zsn0) {
                        z = false;
                    } else {
                        if (!(atn0Var instanceof ysn0) && !(atn0Var instanceof xsn0)) {
                            eg.o();
                            return null;
                        }
                        z = true;
                    }
                    arrayList.add(new ctn0(huxVar, i2, lik1Var, z3, z));
                }
                bundle.putParcelableArrayList("state-items", new ArrayList<>(arrayList));
                return bundle;
            case 1:
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                return rih1Var;
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 7:
                mmr0 mmr0Var = (mmr0) obj;
                return pze0.i("=", mmr0Var.a, mmr0Var.b);
            case 8:
                return new f1o0(((e1o0) obj).a);
            case 9:
                return (l3o0) obj;
            case 10:
                return (v3o0) obj;
            case 11:
                return ((Throwable) obj).getCause();
            case 12:
                return new t3a(48, "", "", (String) null, true, false);
            case 13:
                return (t3a) obj;
            case 14:
                return (q3a) obj;
            case 15:
                return new q5o0("", new sm81(false, false, false, false), new f7h(false, false, false));
            case 16:
                ((w5o0) obj).stopNestedScroll();
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                return rih1Var;
            case 19:
                r6h1 r6h1Var = r6h1.c;
                return new cll0(new yok0((byte) 21));
            case 20:
                x6h1 x6h1VarC = ((cll0) obj).a.c();
                x6h1VarC.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 21:
                x6h1 x6h1VarC2 = ((cll0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 22:
                r6h1 r6h1Var2 = r6h1.c;
                return new cll0(new yok0((byte) 21));
            case 23:
                x6h1 x6h1VarC3 = ((cll0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 24:
                x6h1 x6h1VarC4 = ((cll0) obj).a.c();
                x6h1VarC4.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 25:
                return Boolean.valueOf(((ft40) obj) instanceof q60);
            case 26:
                ft40 ft40Var = (ft40) obj;
                if (!(ft40Var instanceof iql1) && !(ft40Var instanceof f660) && !(ft40Var instanceof i8n)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 27:
                i3x i3xVar = (i3x) obj;
                if ((i3xVar instanceof p3x) || !i3xVar.b().a(new nrj0(1, (byte) 19))) {
                    return i3xVar;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                gt40 gt40VarB = i3xVar.b();
                boolean zA = gt40VarB.a(d1);
                et40 et40Var = et40.a;
                mmr0 mmr0Var2 = zA ? (mmr0) gt40VarB.foldIn(new mmr0((Object) null, et40Var), ofo0.b) : new mmr0((Object) null, gt40VarB);
                iy9 iy9Var = (jy9) mmr0Var2.a;
                gt40 gt40Var = (gt40) mmr0Var2.b;
                if (iy9Var == null) {
                    n3xVar = null;
                } else if (iy9Var instanceof iy9) {
                    n3xVar = new n3x();
                    n3xVar.a = dm5.I(et40Var);
                    n3xVar.b = iy9Var.a;
                    n3xVar.d = 2;
                    n3xVar.c = null;
                } else {
                    if (iy9Var instanceof hy9) {
                        arrayList3.add(iy9Var);
                    }
                    n3xVar = null;
                }
                ((Number) gt40Var.foldIn(0, ofo0.d)).intValue();
                mmr0 mmr0Var3 = gt40Var.a(e1) ? (mmr0) gt40Var.foldIn(new mmr0((Object) null, et40Var), ofo0.c) : new mmr0((Object) null, gt40Var);
                q60 q60Var = (q60) mmr0Var3.a;
                gt40 gt40Var2 = (gt40) mmr0Var3.b;
                arrayList2.add(q60Var);
                if (q60Var != null) {
                    int i3 = q60Var.b;
                    p05 p05Var = i3 != 0 ? new p05(i3) : new p05(2131233117);
                    n3xVar2 = new n3x();
                    n3xVar2.a = dm5.I(et40Var);
                    n3xVar2.b = p05Var;
                } else {
                    n3xVar2 = null;
                }
                bc10 bc10Var = gt40Var2.a(b1) ? (bc10) gt40Var2.foldIn(new bc10((gt40) null, 3), b5n0.a1) : new bc10(gt40Var2, 1);
                gt40 gt40Var3 = bc10Var.a;
                gt40 gt40Var4 = bc10Var.b;
                arrayList2.add(gt40Var3);
                arrayList3.add(dm5.I(gt40Var4));
                j3x j3xVar = new j3x();
                j3xVar.c = qgo1.m(arrayList2);
                i3xVar.c(qgo1.m(arrayList3));
                ArrayList arrayList4 = ((s3x) j3xVar).b;
                if (n3xVar != null) {
                    arrayList4.add(n3xVar);
                }
                arrayList4.add(i3xVar);
                if (n3xVar2 != null) {
                    arrayList4.add(n3xVar2);
                }
                return j3xVar;
            case 28:
                return Boolean.valueOf(((ft40) obj) instanceof jy9);
            default:
                return Boolean.valueOf(((ft40) obj) instanceof q60);
        }
    }
}
