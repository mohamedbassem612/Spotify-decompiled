package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qa2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q7r0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa2(q7r0 q7r0Var, byte b) {
        super(0);
        this.a = b;
        this.b = q7r0Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b.a();
            case 1:
                return cwl1.F(this.b);
            case 2:
                return this.b.a();
            case 3:
                return cwl1.C(this.b);
            case 4:
                return cwl1.B(this.b);
            case 5:
                return cwl1.B(this.b);
            case 6:
                return cwl1.F(this.b);
            case 7:
                return this.b.a();
            case 8:
                return cwl1.F(this.b);
            case 9:
                return cwl1.B(this.b);
            case 10:
                return cwl1.H(this.b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return this.b.a();
            case grn1.d /* 12 */:
                rzq rzqVar = (rzq) ((m1n0) this.b.e(m1n0.class)).a.a.k().c;
                synchronized (rzqVar.e) {
                    try {
                        if (rzqVar.i != null) {
                            LinkedHashSet linkedHashSet = rzqVar.k;
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : linkedHashSet) {
                                if (rzqVar.j.get((jh5) obj) instanceof h3r) {
                                    linkedHashSet2.add(obj);
                                }
                            }
                            rzqVar.m.addAll(linkedHashSet2);
                            boolean zIsEmpty = linkedHashSet2.isEmpty();
                            if (!zIsEmpty) {
                                rzqVar.r();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
            case 13:
                return this.b.a();
            case 14:
                return this.b.a();
            case 15:
                return new ftr0(this.b);
            case 16:
                return cwl1.E(this.b);
            case 17:
                return cwl1.F(this.b);
            case 18:
                return this.b.a();
            case 19:
                return this.b;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return cwl1.E(this.b);
            case 21:
                return (l3h1) this.b.b(l3h1.class);
            case 22:
                return cwl1.E(this.b);
            default:
                return cwl1.H(this.b);
        }
    }
}
