package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hk2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk2(int i, int i2, int i3, Function0 function0, qim0 qim0Var) {
        super(2);
        this.a = (byte) 12;
        this.b = i;
        this.c = i2;
        this.d = function0;
        this.e = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = this.c;
        int i2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                aq8.j((l2j1) obj4, i2, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                vgo1.c((ue6) obj4, i2, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                long jB = hjl.b(j, 0, 0, 0, 0, 11);
                j2i j2iVar = (j2i) obj4;
                lr80 it = yoi1.Q(0, i2).iterator();
                sr80 sr80Var = (sr80) it;
                if (!sr80Var.c) {
                    hhg1.k();
                    return null;
                }
                lr80 lr80Var = it;
                int iNextInt = lr80Var.nextInt();
                int i3 = ((afh0) o7h.V0(tlc1Var.P(f4i1.c(iNextInt, "measurement-"), new j2i(-7464888, new bf6((byte) 0, iNextInt, j2iVar, false), true)))).H(jB).b;
                while (sr80Var.c) {
                    int iNextInt2 = lr80Var.nextInt();
                    sr80 sr80Var2 = sr80Var;
                    int i4 = ((afh0) o7h.V0(tlc1Var.P(f4i1.c(iNextInt2, "measurement-"), new j2i(-7464888, new bf6((byte) 0, iNextInt2, j2iVar, false), true)))).H(jB).b;
                    if (i3 < i4) {
                        i3 = i4;
                    }
                    sr80Var = sr80Var2;
                }
                return tlc1Var.S(hjl.i(j), i3, b7xVar, new wb5(((afh0) o7h.V0(tlc1Var.P(f4i1.c(i, "visible-"), new j2i(-1792965306, new bf6((byte) 1, i, (j2i) obj3, false), true)))).H(jB), i3, (byte) 1));
            case 3:
                ((Number) obj2).intValue();
                l6o1.d((w4t0) obj4, i2, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                qhf.d((lz61) obj4, i2, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                List list = (List) obj;
                zu60 zu60Var = (zu60) obj2;
                vr60 vr60Var = (vr60) obj3;
                k9r k9rVar = (k9r) obj4;
                if (i2 == 0) {
                    if (list.isEmpty()) {
                        k9rVar.s(3, vr60Var, (String) null, zu60Var);
                    } else {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            k9rVar.s(3, vr60Var, (String) it2.next(), zu60Var);
                        }
                    }
                } else if (i != 0) {
                    for (int i5 = 0; i5 < i; i5++) {
                        k9rVar.s(3, vr60Var, (String) null, zu60Var);
                    }
                    for (int i6 = 0; i6 < i2; i6++) {
                        k9rVar.u(3, vr60Var, (String) null, zu60Var);
                    }
                } else if (list.isEmpty()) {
                    k9rVar.u(3, vr60Var, (String) null, zu60Var);
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        k9rVar.u(3, vr60Var, (String) it3.next(), zu60Var);
                    }
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                p2o1.a(i2, (h3h1) obj4, (j2i) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                d1u.j(i2, (r8b) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                mue1.i(i2, czo1.p(i | 1), (String) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                l0p1.e(i2, czo1.p(i | 1), (String) obj4, (String) obj3, (b0k) obj);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                yoi1.e((j0f0) obj4, (Function0) obj3, i2, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                poz0.j((bff0) obj4, i2, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                q0o1.c(this.b, this.c, czo1.p(1), (Function0) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 13:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                m4c m4cVar = fkj0.X;
                shg1 shg1Var = (shg1) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = x340Var2.i(shg1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new vvr0(shg1Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new dgq0(iu30Var, (byte) 27);
                        x340Var2.s0(objT2);
                    }
                    eko1.m(this.b, this.c, (qim0) null, (sgr0) null, 0L, function0, (Function0) objT2, x340Var2, 0, 28);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 14:
                tlc1 tlc1Var2 = (tlc1) obj;
                long j2 = ((hjl) obj2).a;
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var2.P("label", new j2i(-2085777113, new x990((Paragraph) obj3, (byte) 9), true)))).H(hjl.b(j2, 0, 0, 0, 0, 14));
                int i7 = hjl.i(j2);
                if (((flb0) obj4) == flb0.b) {
                    i = (i2 - 1) - i;
                }
                int i8 = q5t0VarH.a;
                int i9 = ((((i * 2) + 1) * i7) / (i2 * 2)) - (i8 / 2);
                int i10 = i7 - i8;
                if (i10 < 0) {
                    i10 = 0;
                }
                return tlc1Var2.S(i7, q5t0VarH.b, b7xVar, new wb5(q5t0VarH, yoi1.p(i9, 0, i10), (byte) 17));
            case 15:
                ((Number) obj2).intValue();
                cuo1.f((Paragraph) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                y2o1.f((xxr0) obj4, i2, (dc80) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((yxb0) obj4).e(this.b, this.c, czo1.p(1), (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                wwo1.l((s171) obj4, (qim0) obj3, i2, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((zg81) obj4).g(i2, (ng81) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((g891) obj4).e(i2, (c891) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((g891) obj4).h(i2, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                s9p1.z(i2, (uhe1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                j82.j(i2, (eeo0) obj4, (j2i) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                t0c.d(i2, (uvx) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk2(byte b, int i, int i2, int i3, Object obj, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk2(int i, int i2, Object obj, cv30 cv30Var, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
        this.e = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk2(int i, Object obj, Object obj2, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk2(Object obj, int i, Object obj2, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk2(Object obj, Object obj2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk2(flb0 flb0Var, int i, int i2, Paragraph paragraph) {
        super(2);
        this.a = (byte) 14;
        this.d = flb0Var;
        this.b = i;
        this.c = i2;
        this.e = paragraph;
    }
}
