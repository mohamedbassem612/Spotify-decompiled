package p;

import android.graphics.RectF;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f57 implements Comparator {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public f57(Rational rational, Rational rational2) {
        this.a = (byte) 0;
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        if (fFloatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue;
        byte b = this.a;
        int iIntValue2 = -1;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) obj3;
                boolean z = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFB = b(rational);
                RectF rectFB2 = b(rational2);
                boolean z2 = rectFB.width() >= rectF.width() && rectFB.height() >= rectF.height();
                if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
            case 1:
                List list = (List) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                g471 g471Var = (g471) obj;
                o571 o571VarA = g471Var.a();
                m471 m471Var = m471.d;
                if (o571VarA == m471Var) {
                    iIntValue = -1;
                } else {
                    int iIndexOf = arrayList.indexOf(g471Var.a());
                    Integer numValueOf = Integer.valueOf(iIndexOf);
                    if (iIndexOf == -1) {
                        numValueOf = null;
                    }
                    iIntValue = numValueOf != null ? numValueOf.intValue() : list.size();
                }
                Integer numValueOf2 = Integer.valueOf(iIntValue);
                g471 g471Var2 = (g471) obj2;
                if (g471Var2.a() != m471Var) {
                    int iIndexOf2 = arrayList.indexOf(g471Var2.a());
                    Integer numValueOf3 = iIndexOf2 != -1 ? Integer.valueOf(iIndexOf2) : null;
                    iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : list.size();
                }
                return pap1.t(numValueOf2, Integer.valueOf(iIntValue2));
            case 2:
                return ((gmt) obj4).c(new ewt((l0l) obj), new ewt((l0l) obj2));
            case 3:
                nue1 nue1Var = (nue1) obj4;
                int iCompare = ((jue1) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : pap1.t(Long.valueOf(Math.abs(((uvg1) obj).c - nue1Var.k)), Long.valueOf(Math.abs(((uvg1) obj2).c - nue1Var.k)));
            case 4:
                nue1 nue1Var2 = (nue1) obj4;
                int iCompare2 = ((jue1) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : pap1.t(Long.valueOf(Math.abs(((uvg1) obj).c - nue1Var2.k)), Long.valueOf(Math.abs(((uvg1) obj2).c - nue1Var2.k)));
            default:
                uvg1 uvg1Var = (uvg1) obj4;
                int iCompare3 = ((lue1) obj3).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                uvg1 uvg1Var2 = (uvg1) obj;
                long j = uvg1Var2.a;
                long j2 = uvg1Var.a;
                long j3 = uvg1Var.b;
                uvg1 uvg1Var3 = (uvg1) obj2;
                return pap1.t(Long.valueOf(Math.abs(uvg1Var2.b - j3) + Math.abs(j - j2)), Long.valueOf(Math.abs(uvg1Var3.b - j3) + Math.abs(uvg1Var3.a - uvg1Var.a)));
        }
    }

    public f57(Map map, mur murVar) {
        this.a = (byte) 2;
        this.b = map;
        this.c = new gmt((Object) map, (Object) murVar, (byte) 1);
    }

    public /* synthetic */ f57(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
