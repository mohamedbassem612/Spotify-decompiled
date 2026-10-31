package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gk implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gk(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 12;
        byte b3 = 1;
        byte b4 = 22;
        byte b5 = 7;
        byte b6 = 2;
        byte b7 = 4;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                bpb1Var.collect(new mf((byte) 2, (lk) obj, vr20Var), lnmVar);
                return d9nVar;
            case 1:
                Object objCollect = ((zob1) bpb1Var).collect(new vt(vr20Var, (t90) obj, b3), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 2:
                Object objCollect2 = bpb1Var.collect(new vt(vr20Var, (zc0) obj, b6), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 3:
                Object objCollect3 = ((kge) bpb1Var).collect(new mf((byte) 12, (xd0) obj, vr20Var), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 4:
                Object objCollect4 = ((ve01) bpb1Var).a.collect(new vt((Object) vr20Var, obj, (byte) 3), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 5:
                Object objCollect5 = ((wzv0) bpb1Var).collect(new mf((byte) 22, (ay0) obj, vr20Var), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 6:
                Object objCollect6 = bpb1Var.collect(new vt(vr20Var, (iz0) obj, b7), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 7:
                Object objCollect7 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 5), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 8:
                Object objCollect8 = ((any) bpb1Var).collect(new vt((Object) vr20Var, obj, (byte) 6), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 9:
                Object objCollect9 = ((any) bpb1Var).collect(new vt(vr20Var, (bn1) obj, b5), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 10:
                Object objCollect10 = ((jge) bpb1Var).collect(new vt((Object) vr20Var, obj, (byte) 8), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                Object objCollect11 = ((any) bpb1Var).collect(new vt((Object) vr20Var, obj, (byte) 10), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case grn1.d /* 12 */:
                Object objCollect12 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 11), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 13:
                Object objCollect13 = bpb1Var.collect(new vt(vr20Var, (wa2) obj, b2), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 14:
                Object objCollect14 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 13), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 15:
                Object objCollect15 = ((tf2) bpb1Var).collect(new vt((Object) vr20Var, obj, (byte) 15), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 16:
                Object objCollect16 = ((u70) bpb1Var).collect(new ku2(vr20Var, (List) obj, (byte) 0), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 17:
                Object objCollect17 = ((nf) bpb1Var).collect(new ku2(vr20Var, (List) obj, (byte) 1), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 18:
                Object objCollect18 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 19), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 19:
                Object objCollect19 = ((wt20) bpb1Var).collect(new ku2(vr20Var, (List) obj, (byte) 2), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                Object objCollect20 = ((any) bpb1Var).collect(new w93(vr20Var, (rb3) obj, (byte) 4), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 21:
                Object objCollect21 = bpb1Var.collect(new vt(vr20Var, (id3) obj, b4), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 22:
                Object objCollect22 = ((vd0) bpb1Var).collect(new st(vr20Var, (String) obj, b7), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 23:
                Object objCollect23 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 23), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 24:
                Object objCollect24 = ((any) bpb1Var).collect(new w93(vr20Var, (ce3) obj, (byte) 7), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 25:
                Object objCollect25 = ((x010) bpb1Var).collect(new vt((Object) vr20Var, obj, (byte) 24), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 26:
                Object objCollect26 = ((qsc0) bpb1Var).collect(new vt((Object) vr20Var, obj, (byte) 25), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 27:
                Object objCollect27 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 26), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
            case 28:
                Object objCollect28 = bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 27), lnmVar);
                return objCollect28 == d9nVar ? objCollect28 : rih1Var;
            default:
                bpb1Var.collect(new vt((Object) vr20Var, obj, (byte) 28), lnmVar);
                return d9nVar;
        }
    }
}
