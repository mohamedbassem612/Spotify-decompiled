package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.rcs.model.GranularConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k74 extends hab0 implements iu30 {
    public static final k74 N0;
    public static final k74 O0;
    public static final k74 P0;
    public static final k74 Q0;
    public static final k74 R0;
    public static final k74 S0;
    public static final k74 T0;
    public static final k74 U0;
    public static final k74 V0;
    public static final k74 W0;
    public static final k74 X;
    public static final k74 X0;
    public static final k74 Y;
    public static final k74 Y0;
    public static final k74 Z;
    public static final k74 Z0;
    public static final k74 a1;
    public static final k74 b;
    public static final k74 b1;
    public static final k74 c;
    public static final k74 c1;
    public static final k74 d;
    public static final k74 d1;
    public static final k74 e;
    public static final k74 e1;
    public static final k74 f;
    public static final k74 g;
    public static final k74 h;
    public static final k74 i;
    public static final k74 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new k74(i2, (byte) 0);
        c = new k74(i2, (byte) 1);
        d = new k74(i2, (byte) 2);
        e = new k74(i2, (byte) 3);
        f = new k74(i2, (byte) 4);
        g = new k74(i2, (byte) 5);
        h = new k74(i2, (byte) 6);
        i = new k74(i2, (byte) 7);
        t = new k74(i2, (byte) 8);
        X = new k74(i2, (byte) 9);
        Y = new k74(i2, (byte) 10);
        Z = new k74(i2, (byte) 11);
        N0 = new k74(i2, (byte) 12);
        O0 = new k74(i2, (byte) 13);
        P0 = new k74(i2, (byte) 14);
        Q0 = new k74(i2, (byte) 15);
        R0 = new k74(i2, (byte) 16);
        S0 = new k74(i2, (byte) 17);
        T0 = new k74(i2, (byte) 18);
        U0 = new k74(i2, (byte) 19);
        V0 = new k74(i2, (byte) 20);
        W0 = new k74(i2, (byte) 21);
        X0 = new k74(i2, (byte) 22);
        Y0 = new k74(i2, (byte) 23);
        Z0 = new k74(i2, (byte) 24);
        a1 = new k74(i2, (byte) 25);
        b1 = new k74(i2, (byte) 26);
        c1 = new k74(i2, (byte) 27);
        d1 = new k74(i2, (byte) 28);
        e1 = new k74(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k74(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                v0z0 v0z0Var = (v0z0) obj;
                if (v0z0Var != null) {
                    return new qwc(v0z0Var.a, v0z0Var.b);
                }
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                return pze0.i(": ", entry.getKey(), entry.getValue());
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                return pze0.i(": ", entry2.getKey(), entry2.getValue());
            case 3:
                svz0 svz0Var = svz0.d;
                GranularConfiguration granularConfigurationI = GranularConfiguration.I((byte[]) obj);
                List<GranularConfiguration.AssignedPropertyValue> listE = granularConfigurationI.E();
                ArrayList arrayList = new ArrayList(q7h.U(listE, 10));
                for (GranularConfiguration.AssignedPropertyValue assignedPropertyValue : listE) {
                    assignedPropertyValue.getClass();
                    arrayList.add(new m67(assignedPropertyValue.getName(), assignedPropertyValue.getComponentId(), assignedPropertyValue.getStructuredValueCase() == GranularConfiguration.AssignedPropertyValue.StructuredValueCase.BOOL_VALUE ? Boolean.valueOf(assignedPropertyValue.getBoolValue().getValue()) : null, assignedPropertyValue.getStructuredValueCase() == GranularConfiguration.AssignedPropertyValue.StructuredValueCase.INT_VALUE ? Integer.valueOf(assignedPropertyValue.getIntValue().getValue()) : null, assignedPropertyValue.getStructuredValueCase() == GranularConfiguration.AssignedPropertyValue.StructuredValueCase.ENUM_VALUE ? assignedPropertyValue.getEnumValue().getValue() : null, assignedPropertyValue.getGroupId(), assignedPropertyValue.getPolicyId()));
                }
                return ulc.m(new sc50(granularConfigurationI.F(), granularConfigurationI.B(), granularConfigurationI.x(), granularConfigurationI.z(), Collections.unmodifiableList(arrayList)));
            case 4:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 2500;
                xua0Var.a(Float.valueOf(0.0f), 0).b = klv.b;
                xua0Var.a(Float.valueOf(0.5f), CtaType.CTA_WAITLISTED_FIELD_NUMBER).b = klv.a;
                Float fValueOf = Float.valueOf(1.0f);
                xua0Var.a(fValueOf, 1500);
                xua0Var.a(fValueOf, 2500);
                return rih1Var;
            case 5:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 6:
                return hm5.P(xay.e(2, irn1.o0(220, 90, null, 4)).a(xay.g(0.92f, 4, 0L, irn1.o0(220, 90, null, 4))), xay.f(2, irn1.o0(90, 0, null, 6)));
            case 7:
                return obj;
            case 8:
                return null;
            case 9:
                b261.d((e261) obj);
                return rih1Var;
            case 10:
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                e261 e261Var = (e261) obj;
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM = xvj1.m();
                new ArrayList();
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayListM.size());
                int size = arrayListM.size();
                for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList2, iG, 1)) {
                }
                b261.C(e261Var, new af5(string, arrayList2));
                return rih1Var;
            case grn1.d /* 12 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 14:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 15:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return bool5;
            case 17:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return bool6;
            case 18:
                return ((kd5) obj).a;
            case 19:
                return b7x.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b261.d((e261) obj);
                return rih1Var;
            case 21:
                return ((jd5) obj).a;
            case 22:
                return new hv70("appears-on", (x360) null, ((fer0) obj).a, false, (n1x) null, 112);
            case 23:
                return alk1.c(((fer0) obj).a);
            case 24:
                return (scn0) obj;
            case 25:
                return (scn0) obj;
            case 26:
                b261.c((e261) obj);
                return rih1Var;
            case 27:
                return ((p16) obj).a;
            case 28:
                return ((p16) obj).a;
            default:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
