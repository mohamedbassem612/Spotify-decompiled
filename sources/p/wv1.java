package p;

import android.content.SharedPreferences;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wv1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv1(int i, Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        int i = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((ow1) obj2).g.invoke(Integer.valueOf(i), (nt1) obj);
                return rih1Var;
            case 1:
                ((vu30) obj2).invoke(((au6) obj).a, Integer.valueOf(i));
                return rih1Var;
            case 2:
                ((vu30) obj2).invoke((b9e) obj, Integer.valueOf(i));
                return rih1Var;
            case 3:
                ((vu30) obj2).invoke((cb20) obj, Integer.valueOf(i));
                return rih1Var;
            case 4:
                fn31.T((c9n) obj2, (o8n) null, 0, new i27((jkr0) obj, i, null, (byte) 0), 3);
                return rih1Var;
            case 5:
                ((vu30) obj2).invoke(((oo41) obj).f, Integer.valueOf(i));
                return rih1Var;
            case 6:
                sie sieVar = (sie) obj2;
                bqk0 bqk0Var = sieVar.U0;
                Integer numValueOf = Integer.valueOf(i);
                bhe bheVar = (bhe) obj;
                String str = bheVar.a;
                bqk0Var.getClass();
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("chapter_row", (String) null, numValueOf, str, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str2 = bheVar.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                tv80 tv80VarM = sieVar.R0.m(w7h1Var, (xj61) null);
                sieVar.S0.a(w7h1Var, tv80VarM.a);
                MobiusLoop mobiusLoop = sieVar.V0;
                if (mobiusLoop != null) {
                    mym.l(mobiusLoop, new die(i, tv80VarM));
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 7:
                ((iu30) obj2).invoke(new t5k((p5k) obj, i));
                return rih1Var;
            case 8:
                fom0 fom0Var = (fom0) obj;
                ((iu30) obj2).invoke(new com0(i, fom0Var.a, fom0Var.b));
                return rih1Var;
            case 9:
                nom0 nom0Var = (nom0) obj2;
                boolean z = nom0Var.c;
                String str3 = nom0Var.b;
                iu30 iu30Var = (iu30) obj;
                String str4 = nom0Var.a;
                if (z) {
                    iu30Var.invoke(new wom0(str4, str3));
                } else {
                    iu30Var.invoke(new tom0(i, str4, str3));
                }
                return rih1Var;
            case 10:
                int iC = l1d.C(i);
                if (iC == 0) {
                    return cwl1.B((q7r0) obj2);
                }
                if (iC == 1) {
                    return (rx20) obj;
                }
                if (iC == 2) {
                    return new qbo0();
                }
                eg.o();
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                vu30 vu30Var = (vu30) obj;
                o820 o820Var = (o820) obj2;
                boolean z2 = o820Var.c;
                r620 r620Var = o820Var.b;
                if (z2 && o820Var.d) {
                    r620 r620Var2 = r620Var.b;
                    if (r620Var2 != null) {
                        vu30Var.invoke(r620Var2, Integer.valueOf(i));
                    }
                } else {
                    vu30Var.invoke(r620Var, Integer.valueOf(i));
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((vu30) obj2).invoke((nbb0) obj, Integer.valueOf(i));
                return rih1Var;
            case 13:
                ((vu30) obj2).invoke(Integer.valueOf(i), ((dc81) obj).b);
                return rih1Var;
            case 14:
                ((lb50) obj2).invoke(new eyd0(false, (String) obj, i == 8, 8));
                return rih1Var;
            case 15:
                ((iu30) obj2).invoke(new cvi0(((evi0) obj).a, i));
                return rih1Var;
            case 16:
                ((ven0) obj).setValue(new l5f0(i, ((w1j0) ((a2j0) obj2)).getId()));
                return rih1Var;
            case 17:
                ((hkc1) obj2).l.invoke(obj, Integer.valueOf(i));
                return rih1Var;
            case 18:
                ((vu30) obj2).invoke(((eno0) obj).a, Integer.valueOf(i));
                return rih1Var;
            case 19:
                Long l = (Long) obj2;
                if (l != null) {
                    ((vu30) obj).invoke(Long.valueOf(l.longValue()), Integer.valueOf(i));
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((vu30) obj2).invoke(Integer.valueOf(i), ((kis0) obj).d);
                return rih1Var;
            case 21:
                Integer num = (Integer) obj;
                ((iu30) obj2).invoke((num == null || num.intValue() != i) ? Integer.valueOf(i) : null);
                return rih1Var;
            case 22:
                e601 e601Var = (e601) obj2;
                int i2 = i + 1;
                e601Var.b.j(i2, ((pxz0) obj).a);
                e601Var.g.invoke(new z401(i2));
                return rih1Var;
            case 23:
                ((iu30) obj2).invoke(new q751(((u211) obj).b, i));
                return rih1Var;
            case 24:
                ((iu30) obj2).invoke(new l8a1((String) obj, i));
                return rih1Var;
            case 25:
                ((vu30) obj2).invoke(((dka1) obj).b, Integer.valueOf(i));
                return rih1Var;
            case 26:
                return Integer.valueOf(((ima1) obj2).o().getInt(((bma1) obj).a, i));
            case 27:
                return Integer.valueOf(((SharedPreferences) obj2).getInt((String) obj, i));
            case 28:
                ((iu30) obj2).invoke(new kxb1(i, ((nxb1) obj).a));
                return rih1Var;
            default:
                List list = (List) obj2;
                if (i >= list.size()) {
                    n57.e("Cultural Moments selected tab index not found. Size is " + list.size() + ", given: " + i);
                } else {
                    esa1 esa1Var = ((ifd1) obj).a;
                    y570 y570Var = (y570) list.get(i);
                    vnd1 vnd1Var = (vnd1) esa1Var.c;
                    ((i8h1) vnd1Var.b).m(((hl00) vnd1Var.c).h(new u570("click", y570Var, gg11.g)).t(), (xj61) null);
                    ((wnd1) esa1Var.b).a.onNext(new shd1(i));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv1(Object obj, int i, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv1(Object obj, Object obj2, int i, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
